package background;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Instructions extends JPanel {
    JLabel bigText;
    JLabel instructionsEx;
    JLabel diagramLabel;
    JLabel diagram2Label;
    ImageIcon diagram;
    ImageIcon diagram2;

    public Instructions(Dimension size) {
        diagram = new ImageIcon("app/images/instructions/PeriodicTableConfigs.png");
        diagram2 = new ImageIcon("app/images/instructions/hundsRule.png");
        diagramLabel = new JLabel(scaleImage(diagram, 500, 500));
        diagram2Label = new JLabel(scaleImage(diagram2, 500, 100));
        bigText = new JLabel("  -Instructions for the Electron Configuration Game.", SwingConstants.LEFT);
        bigText.setPreferredSize(new Dimension(675,30));
        Dimension largeLabel = new Dimension(850, 195);
        instructionsEx = new JLabel("<html>   --The goal of this game is to identify as many elements as possible in only 30 seconds and in doing so build the largest element as possible. You will be presented with electron configurations in noble gas notation. While there are three types of configuration notations, noble gas notation is the shortest and easiest. An example of orbital notation for nitrogen can be seen above. Regular electron configuration notation for N would look looks like 1s\u00B2 2s\u00B2 2p\u00B3. Noble gas notation skips repetition by referencing the most recent noble gas. Nitrogen would look like [He\u2087] 2s\u00B2 2p\u00B3. For ease of programming, the subscrips are left out and the exponents remain as regular numbers. When playing, you will have to click the element on the perodic table that matches up with the given configuration. Points are awarded in electrons and your total score is represented by a certain element. Elements in period one reward 1 electron, elements in periods two and three reward 2 electrons, elements in periods four and five reward 3 electrons, and elements in periods six and seven reward 4 electrons. The bigger the element the better. Good Luck! </html>", SwingConstants.LEFT);
        instructionsEx.setPreferredSize(largeLabel);
        Font labelFont = bigText.getFont();
        int fontSize = 20;
        // Set the targetConfigLabelQuestion's font size to the newly determined size.
        instructionsEx.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSize-5));
        bigText.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSize+5));
        add(bigText);
        add(diagram2Label);
        add(instructionsEx);
        add(diagramLabel);
        setPreferredSize(size);
    }

    public ImageIcon scaleImage(ImageIcon icon, int w, int h) {
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();

        if (icon.getIconWidth() > w) {
            nw = w;
            nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }

        if (nh > h) {
            nh = h;
            nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }

        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
    }
    
}
