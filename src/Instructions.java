import javax.swing.JButton;
import javax.swing.JPanel;

public class Instructions extends JPanel {
    JButton play;
    public Instructions() {
        play = new JButton("Play Game");
        add(play);
        setVisible(true);
    }

    public JButton getPlay() {
        return play;
    }
}
