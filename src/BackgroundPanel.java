import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import background.*;

import java.awt.Container;
import java.awt.*;

public class BackgroundPanel extends JPanel {
    JButton play;
    JTabbedPane tabbedPane;
    ElectronConfig electronConfig;
    Heisenberg heisenberg;
    Instructions instructions;
    PrinciplesAndRules pAr;
    QuantumNumbers quantumNumbers;
    Dimension tabSize;
    public BackgroundPanel() {
        tabbedPane = new JTabbedPane();
        play = new JButton("Play Game");
        tabSize = new Dimension(1000,613);
        electronConfig = new ElectronConfig(tabSize);
        heisenberg = new Heisenberg(tabSize);
        instructions = new Instructions(tabSize);
        pAr = new PrinciplesAndRules(tabSize);
        quantumNumbers = new QuantumNumbers(tabSize);
        
        tabbedPane.addTab("Quantum Numbers", quantumNumbers);
        tabbedPane.addTab("Heisenberg Uncertainty Principle", heisenberg);
        tabbedPane.addTab("Other Principles and Rules", pAr);
        tabbedPane.addTab("Electron Configuration", electronConfig);
        tabbedPane.addTab("Instructions", instructions);
        tabbedPane.setBackground(Color.WHITE);
        add(tabbedPane, BorderLayout.CENTER);
        add(play);
        setBackground(Color.black);
        setVisible(true);
    }

    public JButton getPlay() {
        return play;
    }
}
