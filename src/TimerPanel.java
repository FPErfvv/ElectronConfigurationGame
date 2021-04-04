import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class TimerPanel extends JPanel implements ActionListener {
    Timer timer;
    private static final int TOTAL_TIME = 30;
    int time;
    JLabel label;
    boolean timerHasFinished;
    public TimerPanel() {
        this.setPreferredSize(new Dimension(300,35));
        //this.setBackground(Color.WHITE);
        time = TOTAL_TIME;
        label = new JLabel(time + " sec");
        timer = new Timer(1000,this);
        Font labelFont = label.getFont();
        label.setFont(new Font(labelFont.getName(), Font.PLAIN, 20));
        timerHasFinished = false;
        add(label);
        setVisible(true);
        

    }
    public void startTimer() {
        //time = TOTAL_TIME;
        timer.start();
    }

    public void stopTimer() {
        timer.stop();
        time = TOTAL_TIME;
    }

    public boolean timerHasFinished() {
        return timerHasFinished;
        
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (time <=0) {
            timer.stop();
            timerHasFinished = true;
        }
        label.setText(time + " sec");
        time--;
        
        System.out.println(time);

    }
    
}
