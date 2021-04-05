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

public class Score extends JPanel {
    ImageIcon s0;
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

    ImageIcon k;
    ImageIcon ca;
    ImageIcon sc;
    ImageIcon ti;
    ImageIcon v;
    ImageIcon cr;
    ImageIcon mn;
    ImageIcon fe;
    ImageIcon co;
    ImageIcon ni;
    ImageIcon cu;
    ImageIcon zn;
    ImageIcon ga;
    ImageIcon ge;
    ImageIcon as;
    ImageIcon se;
    ImageIcon br;
    ImageIcon kr;


    ImageIcon blank;
    JLabel orbitals;
    JLabel text;
    BoxLayout layout;
    ArrayList<ImageIcon> schrodinger;
    ArrayList<ImageIcon> bohr;
    boolean left;
    boolean filesCreated;
    int score;
    int highScore;
    String scBasePath;
    String boBasePath;
    String userConfigDir;

    public Score(boolean left) {
        this.left = left;
        setVisible(true);
        score = 0;
        scBasePath = "app/images/schrodinger/";
        boBasePath = "app/images/bohr/";
        text = new JLabel("                          Score: 0     ");
        layout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
        setLayout(layout);
        add(text);
        filesCreated = false;
        userConfigDir = System.getenv("APPDATA");
        if (left) {
            createFile();
            leftScore();
        }
        else {
            rightScore();
        }
        readFile();
    }

    public void leftScore() {
        s0 = new ImageIcon(scBasePath+"0S.png");
        s1 = new ImageIcon(scBasePath+"1S.png");
        s2 = new ImageIcon(scBasePath+"2S.png");
        px2 = new ImageIcon(scBasePath+"2Px.png");
        py2 = new ImageIcon(scBasePath+"2Py.png");
        pz2 = new ImageIcon(scBasePath+"2Pz.png");
        s3 = new ImageIcon(scBasePath+"3S.png");
        px3 = new ImageIcon(scBasePath+"3Px.png");
        py3 = new ImageIcon(scBasePath+"3Py.png");
        pz3 = new ImageIcon(scBasePath+"3Pz.png");
        schrodinger = new ArrayList<ImageIcon>(Arrays.asList(s0,s1, s2, px2, py2, pz2, s3, px3, py3, pz3));
        display = scaleImage(s0, 225, 225);
        orbitals = new JLabel();
        orbitals.setIcon(display);
        add(orbitals);
    }

    public void rightScore() {
        blank = new ImageIcon(boBasePath+"Blank.png");
        h = new ImageIcon(boBasePath+"H.png");
        he = new ImageIcon(boBasePath+"He.png");
        li = new ImageIcon(boBasePath+"Li.png");
        be = new ImageIcon(boBasePath+"Be.png");
        b = new ImageIcon(boBasePath+"B.png");
        c = new ImageIcon(boBasePath+"C.png");
        n = new ImageIcon(boBasePath+"N.png");
        o = new ImageIcon(boBasePath+"O.png");
        f = new ImageIcon(boBasePath+"F.png");
        ne = new ImageIcon(boBasePath+"Ne.png");
        na = new ImageIcon(boBasePath+"Na.png");
        mg = new ImageIcon(boBasePath+"Mg.png");
        al = new ImageIcon(boBasePath+"Al.png");
        si = new ImageIcon(boBasePath+"Si.png");
        p = new ImageIcon(boBasePath+"P.png");
        s = new ImageIcon(boBasePath+"S.png");
        cl = new ImageIcon(boBasePath+"Cl.png");
        ar = new ImageIcon(boBasePath+"Ar.png");
        k = new ImageIcon(boBasePath+"K.png");
        ca = new ImageIcon(boBasePath+"Ca.png");
        sc = new ImageIcon(boBasePath+"Sc.png");
        ti = new ImageIcon(boBasePath+"Ti.png");
        v = new ImageIcon(boBasePath+"C.png");
        cr = new ImageIcon(boBasePath+"Cr.png");
        mn = new ImageIcon(boBasePath+"Mn.png");
        fe = new ImageIcon(boBasePath+"Fe.png");
        co = new ImageIcon(boBasePath+"Co.png");
        ni = new ImageIcon(boBasePath+"Ni.png");
        cu = new ImageIcon(boBasePath+"Cu.png");
        zn = new ImageIcon(boBasePath+"Zn.png");
        ga = new ImageIcon(boBasePath+"Ga.png");
        ge = new ImageIcon(boBasePath+"Ge.png");
        as = new ImageIcon(boBasePath+"As.png");
        se = new ImageIcon(boBasePath+"Se.png");
        br = new ImageIcon(boBasePath+"Br.png");
        kr = new ImageIcon(boBasePath+"Kr.png");
        bohr = new ArrayList<ImageIcon>(Arrays.asList(blank, h, he, li, be, b, c, n, o, f, ne, na, mg, al, si, p, s, cl, ar,
                                                        k, ca, sc, ti, v, cr, mn, fe, co, ni, cu, zn, ga, ge, as, se, br, kr));
        display = scaleImage(blank, 225, 225);
        orbitals = new JLabel();
        orbitals.setIcon(display);
        add(orbitals);

    }

    public void setImages() {
        if (!left) {
            display = scaleImage(bohr.get(score), 225, 225);
            orbitals.setIcon(display);
            revalidate();
            repaint();
        }
        else {
            if (score >= 15 )
                display = scaleImage(schrodinger.get(9), 225, 225);
            else if (score >= 14)
                display = scaleImage(schrodinger.get(8), 225, 225);
            else if (score >= 13)
                display = scaleImage(schrodinger.get(7), 225, 225);
            else if (score >= 11)
                display = scaleImage(schrodinger.get(6), 225, 225);
            else if (score >= 7)
                display = scaleImage(schrodinger.get(5), 225, 225);
            else if (score >= 6)
                display = scaleImage(schrodinger.get(4), 225, 225);
            else if (score >= 5)
                display = scaleImage(schrodinger.get(3), 225, 225);
            else if (score >= 3)
                display = scaleImage(schrodinger.get(2), 225, 225);
            else if (score >=1)
                display = scaleImage(schrodinger.get(1), 225, 225);
            else 
                display = scaleImage(schrodinger.get(0), 225, 225);

            orbitals.setIcon(display);
            revalidate();
            repaint();
        }
        text.setText("                          Score: "+score);
    }
    public void writeToFile(boolean firstWrite) {
        try {
            FileWriter myWriter = new FileWriter(userConfigDir + "/electronConfigGameFiles/highScore.txt");
            if (!firstWrite) {
                myWriter.write(highScore+"");

            } else {
                myWriter.write("0");
            }
            myWriter.close();
            System.out.println("File has been written to!");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    public void createFile() {
        userConfigDir = System.getenv("APPDATA");
        // creates a file object in the current path
        File directory = new File(userConfigDir + "/electronConfigGameFiles");

        // tries to create a new directory
        boolean value = directory.mkdirs();
        if(value) {
            System.out.println("The new directory is created.");
            filesCreated = true;
        }
        else {
            System.out.println("The directory already exists.");
            filesCreated = true;
        }

        try {
            File myObj = new File(userConfigDir + "/electronConfigGameFiles/highScore.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
              filesCreated = true;
              writeToFile(true);
            } else {
              System.out.println("File already exists.");
              filesCreated = true;
              readFile();
            }
          } catch (IOException e) {
                System.out.println("An error occurred.");
                filesCreated = false;
                e.printStackTrace();
        }
    }
    public void readFile() {
        try {
            File myObj = new File(userConfigDir + "/electronConfigGameFiles/highScore.txt");
            Scanner myReader = new Scanner(myObj);
            
            highScore = Integer.parseInt(myReader.nextLine());
            myReader.close();
         
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void addPoint(int index) {
        if (index > 89) {
            score += 4;
        } else if (index > 53) {
            score += 3;
        } else if (index > 17) {
            score += 2;
        } else {
            score++;
        }
        setImages();
        if (score > highScore) {
            highScore = score;
        }
        writeToFile(false);
    }

    public void resetScore() {
        score = 0;
        text.setText("                          Score: "+score);
        setImages();
    }

    public int getHighScore() {
        readFile();
        return highScore;
    }

    public void resetHighScore() {
        writeToFile(true);
    }

    public boolean filesCreated() {
        return filesCreated;
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
