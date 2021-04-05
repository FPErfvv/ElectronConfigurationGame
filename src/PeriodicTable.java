
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

public class PeriodicTable extends JPanel implements ActionListener {

    static JButton H = new JButton("H");
    static JButton He = new JButton("He");
    static JButton Li = new JButton("Li");
    static JButton Be = new JButton("Be");
    static JButton B = new JButton("B");
    static JButton C = new JButton("C");
    static JButton N = new JButton("N");
    static JButton O = new JButton("O");
    static JButton F = new JButton("F");
    static JButton Ne = new JButton("Ne");
    static JButton Na = new JButton("Na");
    static JButton Mg = new JButton("Mg");
    static JButton Al = new JButton("Al");
    static JButton Si = new JButton("Si");
    static JButton P = new JButton("P");
    static JButton S = new JButton("S");
    static JButton Cl = new JButton("Cl");
    static JButton Ar = new JButton("Ar");
    static JButton K = new JButton("K");
    static JButton Ca = new JButton("Ca");
    static JButton Sc = new JButton("Sc");
    static JButton Ti = new JButton("Ti");
    static JButton V = new JButton("V");
    static JButton Cr = new JButton("Cr");
    static JButton Mn = new JButton("Mn");
    static JButton Fe = new JButton("Fe");
    static JButton Co = new JButton("Co");
    static JButton Ni = new JButton("Ni");
    static JButton Cu = new JButton("Cu");
    static JButton Zn = new JButton("Zn");
    static JButton Ga = new JButton("Ga");
    static JButton Ge = new JButton("Ge");
    static JButton As = new JButton("As");
    static JButton Se = new JButton("Se");
    static JButton Br = new JButton("Br");
    static JButton Kr = new JButton("Kr");
    static JButton Rb = new JButton("Rb");
    static JButton Sr = new JButton("Sr");
    static JButton Y = new JButton("Y");
    static JButton Zr = new JButton("Zr");
    static JButton Nb = new JButton("Nb");
    static JButton Mo = new JButton("Mo");
    static JButton Tc = new JButton("Tc");
    static JButton Ru = new JButton("Ru");
    static JButton Rh = new JButton("Rh");
    static JButton Pd = new JButton("Pd");
    static JButton Ag = new JButton("Ag");
    static JButton Cd = new JButton("Cd");
    static JButton In = new JButton("In");
    static JButton Sn = new JButton("Sn");
    static JButton Sb = new JButton("Sb");
    static JButton Te = new JButton("Te");
    static JButton I = new JButton("I");
    static JButton Xe = new JButton("Xe");
    static JButton Cs = new JButton("Cs");
    static JButton Ba = new JButton("Ba");
    static JButton La = new JButton("La");
    static JButton Ce = new JButton("Ce");
    static JButton Pr = new JButton("Pr");
    static JButton Nd = new JButton("Nd");
    static JButton Pm = new JButton("Pm");
    static JButton Sm = new JButton("Sm");
    static JButton Eu = new JButton("Eu");
    static JButton Gd = new JButton("Gd");
    static JButton Tb = new JButton("Tb");
    static JButton Dy = new JButton("Dy");
    static JButton Ho = new JButton("Ho");
    static JButton Er = new JButton("Er");
    static JButton Tm = new JButton("Tm");
    static JButton Yb = new JButton("Yb");
    static JButton Lu = new JButton("Lu");
    static JButton Hf = new JButton("Hf");
    static JButton Ta = new JButton("Ta");
    static JButton W = new JButton("W");
    static JButton Re = new JButton("Re");
    static JButton Os = new JButton("Os");
    static JButton Ir = new JButton("Ir");
    static JButton Pt = new JButton("Pt");
    static JButton Au = new JButton("Au");
    static JButton Hg = new JButton("Hg");
    static JButton Tl = new JButton("Tl");
    static JButton Pb = new JButton("Pb");
    static JButton Bi = new JButton("Bi");
    static JButton Po = new JButton("Po");
    static JButton At = new JButton("At");
    static JButton Rn = new JButton("Rn");
    static JButton Fr = new JButton("Fr");
    static JButton Ra = new JButton("Ra");
    static JButton Ac = new JButton("Ac");
    static JButton Th = new JButton("Th");
    static JButton Pa = new JButton("Pa");
    static JButton U = new JButton("U");
    static JButton Np = new JButton("Np");
    static JButton Pu = new JButton("Pu");
    static JButton Am = new JButton("Am");
    static JButton Cm = new JButton("Cm");
    static JButton Bk = new JButton("Bk");
    static JButton Cf = new JButton("Cf");
    static JButton Es = new JButton("Es");
    static JButton Fm = new JButton("Fm");
    static JButton Md = new JButton("Md");
    static JButton No = new JButton("No");
    static JButton Lr = new JButton("Lr");
    static JButton Rf = new JButton("Rf");
    static JButton Db = new JButton("Db");
    static JButton Sg = new JButton("Sg");
    static JButton Bh = new JButton("Bh");
    static JButton Hs = new JButton("Hs");
    static JButton Mt = new JButton("Mt");
    static JButton Ds = new JButton("Ds");
    static JButton Rg = new JButton("Rg");
    static JButton Cn = new JButton("Cn");
    static JButton Nh = new JButton("Nh");
    static JButton Fl = new JButton("Fl");
    static JButton Mc = new JButton("Mc");
    static JButton Lv = new JButton("Lv");
    static JButton Ts = new JButton("Ts");
    static JButton Og = new JButton("Og");

    static JButton abdf = new JButton();
    static JButton dsf = new JButton();
    static JButton hfdabdf = new JButton();
    static JButton asf = new JButton();
    static JButton dfh = new JButton();
    static JButton asdgf = new JButton();
    static JButton egds = new JButton();
    static JButton clear = new JButton();
    static JButton aDXzbdf = new JButton();
    static JButton SDF = new JButton();
    static JButton adfbbdf = new JButton();
    static JButton absdfdf = new JButton();
    static JButton asfdabdf = new JButton();
    static JButton absdfddf = new JButton();
    static JButton abcvxcvdf = new JButton();
    static JButton abadfsdf = new JButton();

    static JButton abgbcvdf = new JButton();
    static JButton asfsdbdf = new JButton();
    static JButton abgbgdf = new JButton();
    static JButton absfsddf = new JButton();
    static JButton abfgbfdf = new JButton();
    static JButton abesdseddf = new JButton();
    static JButton aefsbdf = new JButton();
    static JButton abgfbgfdf = new JButton();
    static JButton abefsedf = new JButton();
    static JButton abgdfdf = new JButton();

    static JButton abdsfsddf = new JButton();
    static JButton abcvxvdf = new JButton();
    static JButton abergvdf = new JButton();
    static JButton abwesddf = new JButton();
    static JButton abewdfvdf = new JButton();
    static JButton abhdsgdf = new JButton();
    static JButton abhvcgdf = new JButton();
    static JButton abhasgdf = new JButton();
    static JButton abcsahgdf = new JButton();
    static JButton abhsdgdf = new JButton();

    static JButton abesrgvdf = new JButton();
    static JButton abwessddf = new JButton();
    static JButton abaewdfvdf = new JButton();
    static JButton abhdsgadf = new JButton();
    static JButton abhvacgdf = new JButton();
    static JButton abshasgdf = new JButton();
    static JButton abscsahgdf = new JButton();
    static JButton abhsdfgdf = new JButton();

    static ArrayList<JButton> elements = new ArrayList<JButton>();
    ArrayList<JButton> anomalies;
    String[] configs;
    int answerIndex;

    public PeriodicTable(String[] configs) {
        addElements();
        JPanel buttons = new JPanel();
        this.configs = configs;
        GridLayout grid = new GridLayout(9, 18);
        buttons.setLayout(grid);
        buttons.setPreferredSize(new Dimension(970,400));
        for (JButton b: elements) {
            buttons.add(b);
            b.addActionListener(this);
        }
        for (int i = 0; i < configs.length; i++)
            if (configs[i].equals("null")) 
                elements.get(i).setBackground(Color.black);
        anomalies = new ArrayList<JButton>(Arrays.asList(Cr, Cu, Nb, Mo, Ru,Rh,Pd,Ag,La,Ce,Gd,Pt,Au,Ac,Th,Pa,U,Np,Cm));
            
        answerIndex = -1;
        add(buttons);
        setBackground(Color.BLACK);
        buttons.setBackground(Color.black);
        setVisible(true);

    }
    public ArrayList<JButton> getAnomolies() {
        return anomalies;
    }

    public void actionPerformed(ActionEvent evt) {
        JButton source = (JButton) evt.getSource();
        if (!anomalies.contains(source)) {
            int i = elements.indexOf(source);
            System.out.println(source.getText() + "(" +i+ "): " + configs[i]);
            answerIndex = i;
        }
    }

    public void setButtonColor(int index, Color color) {
        elements.get(index).setBackground(color);
    }

    public int getAnswerIndex() {
        int answer = answerIndex;
        answerIndex = -1; //returns -1 if the answer has not changed but if it has it returns that index.
        return answer;
    }

    public static void addElements() {
        elements.add(H);
        elements.add(abdf);
        elements.add(hfdabdf);
        elements.add(asf);
        elements.add(dfh);
        elements.add(asdgf);
        elements.add(egds);
        elements.add(clear);
        elements.add(aDXzbdf);
        elements.add(SDF);
        elements.add(adfbbdf);
        elements.add(absdfdf);
        elements.add(asfdabdf);
        elements.add(absdfddf);
        elements.add(abcvxcvdf);
        elements.add(abadfsdf);
        elements.add(dsf);
        elements.add(He);
        elements.add(Li);
        elements.add(Be);
        elements.add(abgbcvdf);
        elements.add(asfsdbdf);
        elements.add(abgbgdf);
        elements.add(absfsddf);
        elements.add(abfgbfdf);
        elements.add(abesdseddf);
        elements.add(aefsbdf);
        elements.add(abgfbgfdf);
        elements.add(abefsedf);
        elements.add(abgdfdf);
        elements.add(B);
        elements.add(C);
        elements.add(N);
        elements.add(O);
        elements.add(F);
        elements.add(Ne);
        elements.add(Na);
        elements.add(Mg);
        elements.add(abdsfsddf);
        elements.add(abcvxvdf);
        elements.add(abergvdf);
        elements.add(abwesddf);
        elements.add(abewdfvdf);
        elements.add(abhvcgdf);
        elements.add(abhasgdf);
        elements.add(abcsahgdf);
        elements.add(abhsdgdf);
        elements.add(abhdsgdf);
        elements.add(Al);
        elements.add(Si);
        elements.add(P);
        elements.add(S);
        elements.add(Cl);
        elements.add(Ar);
        elements.add(K);
        elements.add(Ca);
        elements.add(Sc);
        elements.add(Ti);
        elements.add(V);
        elements.add(Cr);
        elements.add(Mn);
        elements.add(Fe);
        elements.add(Co);
        elements.add(Ni);
        elements.add(Cu);
        elements.add(Zn);
        elements.add(Ga);
        elements.add(Ge);
        elements.add(As);
        elements.add(Se);
        elements.add(Br);
        elements.add(Kr);
        elements.add(Rb);
        elements.add(Sr);
        elements.add(Y);
        elements.add(Zr);
        elements.add(Nb);
        elements.add(Mo);
        elements.add(Tc);
        elements.add(Ru);
        elements.add(Rh);
        elements.add(Pd);
        elements.add(Ag);
        elements.add(Cd);
        elements.add(In);
        elements.add(Sn);
        elements.add(Sb);
        elements.add(Te);
        elements.add(I);
        elements.add(Xe);
        elements.add(Cs);
        elements.add(Ba);
        elements.add(abhsdfgdf);

        elements.add(Hf);
        elements.add(Ta);
        elements.add(W);
        elements.add(Re);
        elements.add(Os);
        elements.add(Ir);
        elements.add(Pt);
        elements.add(Au);
        elements.add(Hg);
        elements.add(Tl);
        elements.add(Pb);
        elements.add(Bi);
        elements.add(Po);
        elements.add(At);
        elements.add(Rn);
        elements.add(Fr);
        elements.add(Ra);
        elements.add(abscsahgdf);

        elements.add(Rf);
        elements.add(Db);
        elements.add(Sg);
        elements.add(Bh);
        elements.add(Hs);
        elements.add(Mt);
        elements.add(Ds);
        elements.add(Rg);
        elements.add(Cn);
        elements.add(Nh);
        elements.add(Fl);
        elements.add(Mc);
        elements.add(Lv);
        elements.add(Ts);
        elements.add(Og);

        elements.add(abesrgvdf);
        elements.add(abwessddf);

        elements.add(La);
        elements.add(Ce);
        elements.add(Pr);
        elements.add(Nd);
        elements.add(Pm);
        elements.add(Sm);
        elements.add(Eu);
        elements.add(Gd);
        elements.add(Tb);
        elements.add(Dy);
        elements.add(Ho);
        elements.add(Er);
        elements.add(Tm);
        elements.add(Yb);
        elements.add(Lu);

        elements.add(abhvacgdf);
        elements.add(abshasgdf);
        elements.add(abhdsgadf);

        elements.add(Ac);
        elements.add(Th);
        elements.add(Pa);
        elements.add(U);
        elements.add(Np);
        elements.add(Pu);
        elements.add(Am);
        elements.add(Cm);
        elements.add(Bk);
        elements.add(Cf);
        elements.add(Es);
        elements.add(Fm);
        elements.add(Md);
        elements.add(No);
        elements.add(Lr);
        
        elements.add(abaewdfvdf);


        
        

    }

}