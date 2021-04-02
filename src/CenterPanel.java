import java.util.Random;

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
    JButton next;
    JButton back;
    boolean playing;
    String[] config;
    PeriodicTable table;

    public CenterPanel(String[] config, PeriodicTable table) {
        this.setPreferredSize(new Dimension(350,255));
        this.config = config;
        this.table = table;
        startStop = new JButton("Start/Stop");
        next = new JButton("Next");
        back = new JButton("Back");
        targetConfigLabel = new JLabel("     What element is: ");
        playing = false;
        next.addActionListener(this);
        back.addActionListener(this);
        startStop.addActionListener(this);
        targetConfigLabel.setPreferredSize(new Dimension(350,30));


        Font labelFont = targetConfigLabel.getFont();

        // Set the targetConfigLabel's font size to the newly determined size.
        targetConfigLabel.setFont(new Font(labelFont.getName(), Font.PLAIN, 16));


        this.setBackground(Color.GREEN);
        add(targetConfigLabel);
        add(startStop);
        add(next);
        add(back);
        setVisible(true);
    }

    public int getRandomNumberUsingNextInt(int min, int max) { // min inclusive max exclusive
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public void startGame() {
        int targetIndex;
        boolean checking;
        int temp = 0;
        while(playing) {
            checking = true;
            targetIndex = getTargetConfig();
            targetConfigLabel.setText("     What element is: " + config[targetIndex]);
            while (checking) {
                int answerIndex = table.getAnswerIndex();
                if (answerIndex == targetIndex) {
                    System.out.println("Correct!");
                    temp++;
                }
            }
            if (temp > 2)
                playing = false;
        }
    }

    public int getTargetConfig() {
        int configIndex = 0;
        boolean looping = true;
        while (looping) {
            configIndex = getRandomNumberUsingNextInt(0, config.length-1);
            if (!config[configIndex].equals("null")) {
                looping = false;
                System.out.println(config[configIndex]);
                return configIndex;
            }
        }
        return configIndex;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        JButton source = (JButton) arg0.getSource();
        if (source.getText().equals("Start/Stop")) {
            playing = true;
            startGame();
            System.out.println("Playing!!!");
        }

    }

    public boolean isPlaying() {
        return playing;
    }
}
