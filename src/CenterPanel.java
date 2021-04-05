
import java.util.Random;

import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Period;
import java.awt.Font;

public class CenterPanel extends JPanel implements ActionListener {
    JLabel targetConfigLabelQuestion;
    JLabel targetConfigLabel;
    String targetConfig;
    JButton startStop;
    JButton back;
    boolean playing;
    String[] config;
    PeriodicTable table;
    Timer timer;
    boolean checking;
    boolean hasAnswered;
    int targetIndex;
    int colorIndex;
    int colorIndexCount;
    Score leftScore;
    Score rightScore;
    TimerPanel timerPanel;
    int highScore;

    public CenterPanel(String[] config, PeriodicTable table, Score leftScore, Score rightScore) {
        this.setPreferredSize(new Dimension(350,255));
        this.config = config;
        this.table = table;
        this.leftScore = leftScore;
        this.rightScore = rightScore;
        startStop = new JButton("Start/Stop");
        back = new JButton("Back");
        if (leftScore.filesCreated) {
            highScore = leftScore.getHighScore();
            targetConfigLabel = new JLabel("High Score: "+ highScore,SwingConstants.CENTER);
        } else {
            targetConfigLabel = new JLabel("",SwingConstants.CENTER);
        }
        
        targetConfigLabelQuestion = new JLabel("Click the start button to start the game!",SwingConstants.CENTER);
        
        timerPanel = new TimerPanel();
        playing = false;
        checking = false;
        hasAnswered = false;
        colorIndex = -1;
        colorIndexCount = -1;
        targetIndex = getTargetConfig();
        timer = new Timer(100, this);
        timer.start();
        back.addActionListener(this);
        startStop.addActionListener(this);
        back.setPreferredSize(new Dimension(100,27));
        targetConfigLabelQuestion.setPreferredSize(new Dimension(350,30));
        targetConfigLabel.setPreferredSize(new Dimension(350,40));


        Font labelFont = targetConfigLabelQuestion.getFont();

        // Set the targetConfigLabelQuestion's font size to the newly determined size.
        targetConfigLabelQuestion.setFont(new Font(labelFont.getName(), Font.PLAIN, 16));
        targetConfigLabel.setFont(new Font(labelFont.getName(), Font.PLAIN, 24));


        this.setBackground(Color.GREEN);
        add(targetConfigLabelQuestion);
        add(targetConfigLabel);
        add(startStop);
        add(back);
        add(timerPanel);
        setVisible(true);
    }

    public int getRandomNumberUsingNextInt(int min, int max) { // min inclusive max exclusive
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public void playGame() {
        targetConfigLabelQuestion.setText("What element is:");
        targetConfigLabel.setText(config[targetIndex]);
        int answerIndex = table.getAnswerIndex();
        if (answerIndex == targetIndex) {
            System.out.println("Correct!");
            colorIndex = answerIndex;
            table.setButtonColor(colorIndex, Color.GREEN);
            colorIndexCount = 0;
            targetIndex = getTargetConfig();
            leftScore.addPoint(answerIndex); //TODO: add bonus for higher energy level
            rightScore.addPoint(answerIndex);
        } else {
            if (answerIndex != -1){
                colorIndex = answerIndex;
                answerIndex = -1;
                table.setButtonColor(colorIndex, Color.RED);
                colorIndexCount = 0;
            }

        }
    }

    public void stopGame() {
        targetConfigLabelQuestion.setText("       Click the start button to start the game!");
        if(leftScore.filesCreated()) {
            highScore = leftScore.getHighScore();
            targetConfigLabel.setText("High Score: " + highScore);
        }
        
        playing = false;
        timerPanel.stopTimer();
    }

    public int getTargetConfig() {
        int configIndex = 0;
        boolean looping = true;
        while (looping) {
            configIndex = getRandomNumberUsingNextInt(0, config.length-1);
            if (!config[configIndex].equals("null") && !config[configIndex].equals("anomaly")) {
                looping = false;
                System.out.println(config[configIndex]);
                return configIndex;
            }
        }
        return configIndex;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (timerPanel.timerHasFinished()) {
            stopGame();
        }
        if (arg0.getSource() instanceof JButton) {
            JButton source = (JButton) arg0.getSource();
            if (source.getText().equals("Start/Stop")) {
                if (playing) {
                    stopGame();
                } else {
                    leftScore.resetScore();
                    rightScore.resetScore();
                    playing = true;
                    timerPanel.startTimer();

                }
            }
        }
        
        if (arg0.getSource().equals(timer)) {
            if (playing) {
                playGame();
            }
            if (colorIndexCount >=0 ) {
                colorIndexCount++;
                if (colorIndexCount > 3) { //length of the red/green flash
                    table.setButtonColor(colorIndex, new JButton().getBackground());
                    colorIndexCount = -1;
                }            
            }

        }
        
    }

    public boolean isPlaying() {
        return playing;
    }

    public JButton getProgressButtons() {
        return back;
    }
}
