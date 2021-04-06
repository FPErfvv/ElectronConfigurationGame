package background;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PrinciplesAndRules extends JPanel {
    JLabel aufbau;
    JLabel hund;
    JLabel pauli;

    JLabel aufbauEx;
    JLabel hundEx;
    JLabel pauliEx;

    JLabel aufbauLabel;
    JLabel hundLabel;
    JLabel pauliLabel;

    ImageIcon aufbauDiagram;
    ImageIcon hundDiagram;
    ImageIcon pauliDiagram;

    Dimension smallLabel;
    Dimension largeLabel;
    public PrinciplesAndRules(Dimension size) {
        
        aufbau = new JLabel("  -Aufbau Principle");
        pauli = new JLabel("  -Pauli Exclusion Principle");
        hund = new JLabel("  -Hund's rule");
        createLabels();
        Font labelFont = aufbau.getFont();
        int fontSize = 20;
        // Set the targetConfigLabelQuestion's font size to the newly determined size.
        aufbau.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSize));
        pauli.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSize));
        hund.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSize));
        smallLabel = new Dimension(950,40);
        aufbau.setPreferredSize(smallLabel);
        pauli.setPreferredSize(smallLabel);
        hund.setPreferredSize(smallLabel);
        add(hund);
        add(hundEx);
        add(hundLabel);
        add(aufbau);
        add(aufbauEx);
        add(aufbauLabel);
        add(pauli);
        add(pauliEx);
        add(pauliLabel);

        setPreferredSize(size);

    }

    public void createLabels() { //<html>Hello World!<br/>blahblahblah</html>
        largeLabel = new Dimension(550, 55);
        aufbauEx = new JLabel("<html>   --The Aufbau principle states that an electron occupies the lowest-energy orbital that can receive it. The diagram on the right shows the right order to follow. The lowest energy is 1s, then 2s and 2p, then 3s and 3p, then 4s, 3d and 4p, and so on.</html>", SwingConstants.LEFT);
        hundEx = new JLabel("<html>   --The Hund's rule states that orbitals of equal energy are each occupied by one electron, and all electrons in singly occupied orbitals must have the same spin state</html>", SwingConstants.LEFT);
        pauliEx = new JLabel("<html>  --The Pauli exclusion principle states that no two electrons in the same atom can have the same set of four quantum numbers. </html>", SwingConstants.LEFT);
        aufbauEx.setPreferredSize(largeLabel);
        hundEx.setPreferredSize(new Dimension(450, 55));
        pauliEx.setPreferredSize(largeLabel);

        aufbauDiagram = new ImageIcon("app/images/instructions/aufbauImage.png");
        hundDiagram = new ImageIcon("app/images/instructions/hundsRule.png");
        pauliDiagram = new ImageIcon("app/images/instructions/pauliEx.png");

        aufbauLabel = new JLabel(scaleImage(aufbauDiagram, 450, 150));
        hundLabel = new JLabel(scaleImage(hundDiagram, 450, 150));
        pauliLabel = new JLabel(scaleImage(pauliDiagram, 450, 150));
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
