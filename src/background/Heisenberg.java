package background;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Heisenberg extends JPanel {
    JLabel bigText;
    JLabel heisenbergEx;
    JLabel diagramLabel;
    ImageIcon diagram;

    public Heisenberg(Dimension size) {
        diagram = new ImageIcon("app/images/instructions/heisenbergPrincipal.png");
        diagramLabel = new JLabel(scaleImage(diagram, 500, 500));
        bigText = new JLabel("  -Heisenberg Uncertainty Principle");
        bigText.setPreferredSize(new Dimension(950,30));
        Dimension largeLabel = new Dimension(850, 120);
        heisenbergEx = new JLabel("<html>  --The Heisenberg uncertainty principle states that it is impossible to determine simutaneously both the position and velocity of an electron or any other particle. This is because in order to find the most likely place of an electron, scientists combine multiple waves together. The highest crest formed by these waves is the most probably location of the electron. However, since there are so many different waves to choose from, scientists cannot pick out any single velocity. If there is only one wave, it is hard to discern where the electron might be, but easy to find what the momentum of the electron is. </html>", SwingConstants.LEFT);
        heisenbergEx.setPreferredSize(largeLabel);
        Font labelFont = bigText.getFont();
        int fontSize = 20;
        // Set the targetConfigLabelQuestion's font size to the newly determined size.
        heisenbergEx.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSize-5));
        bigText.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSize));
        add(bigText);
        add(heisenbergEx);
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
