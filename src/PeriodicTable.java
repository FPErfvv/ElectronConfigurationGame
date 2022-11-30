
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class PeriodicTable extends JPanel {

    static ArrayList<JButton> elements = new ArrayList<JButton>();
    ArrayList<JButton> anomalies;
    String[] configs;
    int answerIndex;

    public PeriodicTable(String[] configs) {
        JPanel buttons = createButtonsPanel();
        this.configs = configs;
        GridLayout grid = new GridLayout(9, 18);
        buttons.setLayout(grid);
        buttons.setPreferredSize(new Dimension(970,400));            
        answerIndex = -1;
        add(buttons);
        setBackground(Color.BLACK);
        buttons.setBackground(Color.black);
        setVisible(true);

    }

    private JPanel createButtonsPanel()
    {
        JPanel buttonsPanel = new JPanel(new GridLayout(9, 18));
        
        String names[] =
        { "H", null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, "He", "Li", "Be", null, null, null,
            null, null, null, null, null, null, null, "B", "C", "N", "O", "F",
            "Ne", "Na", "Mg", null, null, null, null, null, null, null, null,
            null, null, "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti",
            "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As",
            "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru",
            "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs",
            "Ba", null, "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg",
            "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", null, "Rf", "Db",
            "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Nh", "Fl", "Mc", "Lv",
            "Ts", "Og", null, null, "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu",
            "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", null, null, null,
            "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es",
            "Fm", "Md", "No", "Lr", null };
        for (int i = 0; i < names.length; i++)
        {
            if (names[i] != null)
            {
                String name = names[i];
                JButton button = createButton(name);
                buttonsPanel.add(button);
            }
            else
            {
                JLabel label = new JLabel();
                label.setOpaque(true);
                label.setBackground(Color.BLACK);
                elements.add(new JButton());
                buttonsPanel.add(label);
            }
        }
        return buttonsPanel;
    }

    private JButton createButton(String name)
    {
        JButton button = new JButton(name);
        elements.add(button);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JButton source = (JButton) e.getSource();
                int i = elements.indexOf(source);
                answerIndex = i;
            }
        });
        return button;
    }

    public void setButtonColor(int index, Color color) {
        elements.get(index).setBackground(color);
    }

    public int getAnswerIndex() {
        int answer = answerIndex;
        answerIndex = -1; //returns -1 if the answer has not changed. If it has it returns that index.
        return answer;
    }

}