import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.Timer;

public class Score extends JPanel implements ActionListener {
    ImageIcon s1;
    ImageIcon s2;
    ImageIcon px2;
    ImageIcon py2;
    ImageIcon pz2;
    ImageIcon s3;
    ImageIcon px3;
    ImageIcon py3;
    ImageIcon pz3;
    ImageIcon display;

    ImageIcon h;
    ImageIcon he;
    ImageIcon li;
    ImageIcon be;
    ImageIcon b;
    ImageIcon c;
    ImageIcon n;
    ImageIcon o;
    ImageIcon f;
    ImageIcon ne;
    ImageIcon na;
    ImageIcon mg;
    ImageIcon al;
    ImageIcon si;
    ImageIcon p;
    ImageIcon s;
    ImageIcon cl;
    ImageIcon ar;
    JLabel orbitals;
    JLabel text;
    BoxLayout layout;
    ArrayList<ImageIcon> schrodinger;
    ArrayList<ImageIcon> bohr;
    boolean left;
    Timer timer;
    int temp;

    public Score(boolean left) {
        this.left = left;
        setVisible(true);
        temp = 1;
        timer = new Timer(1000, this);
        text = new JLabel("                          Score: 5     ");
        layout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
        setLayout(layout);
        add(text);
        if (left)
            leftScore();
        else
            rightScore();
        timer.start();

    }

    public void leftScore() {
        s1 = new ImageIcon("src/images/schrodinger/1S.png");
        s2 = new ImageIcon("src/images/schrodinger/2S.png");
        px2 = new ImageIcon("src/images/schrodinger/2Px.png");
        py2 = new ImageIcon("src/images/schrodinger/2Py.png");
        pz2 = new ImageIcon("src/images/schrodinger/2Pz.png");
        s3 = new ImageIcon("src/images/schrodinger/3S.png");
        px3 = new ImageIcon("src/images/schrodinger/3Px.png");
        py3 = new ImageIcon("src/images/schrodinger/3Py.png");
        pz3 = new ImageIcon("src/images/schrodinger/3Pz.png");
        schrodinger = new ArrayList<ImageIcon>(Arrays.asList(s1, s2, px2, py2, pz2, s3, px3, py3, pz3));
        display = scaleImage(pz3, 225, 225);
        orbitals = new JLabel();
        orbitals.setIcon(display);
        add(orbitals);
        setImages(3);
    }

    public void rightScore() {
        h = new ImageIcon("src/images/bohr/H.png");
        he = new ImageIcon("src/images/bohr/He.png");
        li = new ImageIcon("src/images/bohr/Li.png");
        be = new ImageIcon("src/images/bohr/Be.png");
        b = new ImageIcon("src/images/bohr/B.png");
        c = new ImageIcon("src/images/bohr/C.png");
        n = new ImageIcon("src/images/bohr/N.png");
        o = new ImageIcon("src/images/bohr/O.png");
        f = new ImageIcon("src/images/bohr/F.png");
        ne = new ImageIcon("src/images/bohr/Ne.png");
        na = new ImageIcon("src/images/bohr/Na.png");
        mg = new ImageIcon("src/images/bohr/Mg.png");
        al = new ImageIcon("src/images/bohr/Al.png");
        si = new ImageIcon("src/images/bohr/Si.png");
        p = new ImageIcon("src/images/bohr/P.png");
        s = new ImageIcon("src/images/bohr/S.png");
        cl = new ImageIcon("src/images/bohr/Cl.png");
        ar = new ImageIcon("src/images/bohr/Ar.png");
        bohr = new ArrayList<ImageIcon>(Arrays.asList(h, he, li, be, b, c, n, o, f, ne, na, mg, al, si, p, s, cl, ar));
        display = scaleImage(ar, 225, 225);
        orbitals = new JLabel();
        orbitals.setIcon(display);
        add(orbitals);

    }

    public void setImages(int numElectrons) {
        if (!left) {
            display = scaleImage(bohr.get(numElectrons-1), 225, 225);
            orbitals.setIcon(display);
            revalidate();
            repaint();
        }
        else {
            if (numElectrons >= 15 )
                display = scaleImage(schrodinger.get(8), 225, 225);
            else if (numElectrons >= 14)
                display = scaleImage(schrodinger.get(7), 225, 225);
            else if (numElectrons >= 13)
                display = scaleImage(schrodinger.get(6), 225, 225);
            else if (numElectrons >= 11)
                display = scaleImage(schrodinger.get(5), 225, 225);
            else if (numElectrons >= 7)
                display = scaleImage(schrodinger.get(4), 225, 225);
            else if (numElectrons >= 6)
                display = scaleImage(schrodinger.get(3), 225, 225);
            else if (numElectrons >= 5)
                display = scaleImage(schrodinger.get(2), 225, 225);
            else if (numElectrons >= 3)
                display = scaleImage(schrodinger.get(1), 225, 225);
            else 
                display = scaleImage(schrodinger.get(0), 225, 225);

            orbitals.setIcon(display);
            revalidate();
            repaint();
        }
        text.setText("                          Score: "+temp);
    }
    public void writeToFile(int score) {
        try {
            FileWriter myWriter = new FileWriter("src/tools/highScore.txt");
            myWriter.write("Files in Java might be tricky");
            myWriter.close();
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    public int readFile() {
        int score = 0;
        try {
            String test = "2\u2076";
            //System.out.println(test);
            //System.out.println("2" + '\u2076');
            //https://en.wikipedia.org/wiki/Unicode_subscripts_and_superscripts
            File myObj = new File("src/tools/filename.txt");
            Scanner myReader = new Scanner(myObj);
            
            
            score = Integer.parseInt(myReader.nextLine());
            myReader.close();
         
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return score;
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

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (temp > 18)
            temp = 1; 
        setImages(temp);
        temp++;


    }

}
