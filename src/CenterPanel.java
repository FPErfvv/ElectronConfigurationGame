import java.util.Random;

import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Period;
import java.awt.Font;

public class CenterPanel extends JPanel implements ActionListener {
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

    public CenterPanel(String[] config, PeriodicTable table, Score leftScore, Score rightScore) {
        this.setPreferredSize(new Dimension(350,255));
        this.config = config;
        this.table = table;
        this.leftScore = leftScore;
        this.rightScore = rightScore;
        startStop = new JButton("Start/Stop");
        back = new JButton("Back");
        targetConfigLabel = new JLabel("     Click the start button to start the game!");
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
        targetConfigLabel.setPreferredSize(new Dimension(350,30));


        Font labelFont = targetConfigLabel.getFont();

        // Set the targetConfigLabel's font size to the newly determined size.
        targetConfigLabel.setFont(new Font(labelFont.getName(), Font.PLAIN, 16));


        this.setBackground(Color.GREEN);
        add(targetConfigLabel);
        add(startStop);
        add(back);
        setVisible(true);
    }

    public int getRandomNumberUsingNextInt(int min, int max) { // min inclusive max exclusive
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public void playGame() {
        targetConfigLabel.setText("     What element is: " + config[targetIndex]);
        int answerIndex = table.getAnswerIndex();
        if (answerIndex == targetIndex) {
            System.out.println("Correct!");
            colorIndex = answerIndex;
            table.setButtonColor(colorIndex, Color.GREEN);
            colorIndexCount = 0;
            targetIndex = getTargetConfig();
            leftScore.addPoint(); //TODO: add bonus for higher energy level
            rightScore.addPoint();
        } else {
            if (answerIndex != -1){
                colorIndex = answerIndex;
                answerIndex = -1;
                table.setButtonColor(colorIndex, Color.RED);
                colorIndexCount = 0;
            }

        }
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
        if (arg0.getSource() instanceof JButton) {
            JButton source = (JButton) arg0.getSource();
            if (source.getText().equals("Start/Stop")) {
                if (playing) {
                    targetConfigLabel.setText("       Click the start button to start the game!");
                    leftScore.resetScore();
                    rightScore.resetScore();
                    playing = false;
                } else {
                    playing = true;
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
