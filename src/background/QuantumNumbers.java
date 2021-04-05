package background;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class QuantumNumbers extends JPanel {
    JLabel principal;
    JLabel numbers;
    JLabel angular;
    JLabel magnetic;
    JLabel spin;

    JLabel principalEx;
    JLabel numbersEx;
    JLabel angularEx;
    JLabel magneticEx;
    JLabel spinEx;
    Dimension smallLabel;
    Dimension largeLabel;
    public QuantumNumbers(Dimension size) {
        
        principal = new JLabel("  -Principal Quantum Number (n)");
        angular = new JLabel("  -Angular Momentum Quantum Number (i)");
        magnetic = new JLabel("  -Magnetic Quantum Number (m\u2097)");
        spin = new JLabel("  -Spin Quantum Number (m\u209B)");
        numbers = new JLabel("Quantum Numbers");
        createLabels();
        Font labelFont = principal.getFont();
        int fontSize = 20;
        // Set the targetConfigLabelQuestion's font size to the newly determined size.
        principal.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSize));
        angular.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSize));
        spin.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSize));
        magnetic.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSize));
        numbers.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSize+3));
        smallLabel = new Dimension(950,30);
        principal.setPreferredSize(smallLabel);
        angular.setPreferredSize(smallLabel);
        magnetic.setPreferredSize(smallLabel);
        spin.setPreferredSize(smallLabel);
        numbers.setPreferredSize(smallLabel);
        add(numbers);
        add(numbersEx);
        add(principal);
        add(principalEx);
        add(angular);
        add(angularEx);
        add(magnetic);
        add(magneticEx);
        add(spin);
        setPreferredSize(size);

    }

    public void createLabels() { //<html>Hello World!<br/>blahblahblah</html>
        largeLabel = new Dimension(850, 50);
        principalEx = new JLabel("<html>   --The principal quantum number, n, designates the electron shell of an electron. This determines the the energy of the electron, and is equivalent to the number of the ring that the electron is on in the Bohr model. It can only be a non zero positive integer.</html>", SwingConstants.LEFT);
        numbersEx = new JLabel("<html>   --In total, there are four quantum numbers. These numbers determine the velocity and location of an electron around an element.  There is the principal quantum number (n), the angular momentum quantum number (i), the magnetic quantum number (m\u2097), and the spin quantum number (m\u209B).</html>", SwingConstants.LEFT);
        angularEx = new JLabel("<html>   --The angular momentum quantum number determines the shape of the orbitals. This number devides each shell into several different orbitals. The most common of these orbitals are the s, p, d, and f orbitals. This number can be any integer between 0 and n-1.</html>", SwingConstants.LEFT);
        magneticEx = new JLabel("<html>   --The magnetic quantum number gives the orientation of the orbital around the nucleus. This uses a 3D axis.</html>", SwingConstants.LEFT);
        spinEx = new JLabel("  --Principal Quantum Number (n)");
        principalEx.setPreferredSize(largeLabel);
        numbersEx.setPreferredSize(largeLabel);
        angularEx.setPreferredSize(largeLabel);
        magneticEx.setPreferredSize(largeLabel);
    }
    
}
