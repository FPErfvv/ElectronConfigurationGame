import java.awt.Dimension;
import java.awt.*;
import javax.swing.JFrame;

public class Main extends JFrame {
    String[] config = {
        "1s1","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","1s2",
        "[He] 2s1","[He] 2s2","null","null","null","null","null","null","null","null","null","null","[He] 2s2 2p1",
        "[He] 2s2 2p2","[He] 2s2 2p3","[He] 2s2 2p4","[He] 2s2 2p5",
        "[He] 2s2 2p6","[Ne] 3s1","[Ne] 3s2","null","null","null","null","null","null","null","null","null","null","[Ne] 3s2 3p1",
        "[Ne] 3s2 3p2","[Ne] 3s2 3p3","[Ne] 3s2 3p4","[Ne] 3s2 3p5",
        "[Ne] 3s2 3p6","[Ar] 4s1","[Ar] 4s2","[Ar] 4s2 3d1",
        "[Ar] 4s2 3d2","[Ar] 4s2 3d3","[Ar] 4s1 3d5","[Ar] 4s2 3d5",
        "[Ar] 4s2 3d6","[Ar] 4s2 3d7","[Ar] 4s2 3d8","[Ar] 4s1 3d10",
        "[Ar] 4s2 3d10","[Ar] 4s2 3d10 4p1","[Ar] 4s2 3d10 4p2","[Ar] 4s2 3d10 4p3",
        "[Ar] 4s2 3d10 4p4","[Ar] 4s2 3d10 4p5","[Ar] 4s2 3d10 4p6","[Kr] 5s1",
        "[Kr] 5s2","[Kr] 5s2 4d1","[Kr] 5s2 4d2","[Kr] 5s1 4d4",
        "[Kr] 5s1 4d5","[Kr] 5s2 4d5","[Kr] 5s1 4d7","[Kr] 5s1 4d8",
        "[Kr] 4d10","[Kr] 5s1 4d10","[Kr] 5s2 4d10","[Kr] 5s2 4d10 5p1",
        "[Kr] 5s2 4d10 5p2","[Kr] 5s2 4d10 5p3","[Kr] 5s2 4d10 5p4","[Kr] 5s2 4d10 5p5",
        "[Kr] 5s2 4d10 5p6","[Xe] 6s1","[Xe] 6s2","null","[Xe] 6s2 4f14 5d2","[Xe] 6s2 4f14 5d3","[Xe] 6s2 4f14 5d4","[Xe] 6s2 4f14 5d5","[Xe] 6s2 4f14 5d6",
        "[Xe] 6s2 4f14 5d7","[Xe] 6s1 4f14 5d9","[Xe] 6s1 4f14 5d10","[Xe] 6s2 4f14 5d10",
        "[Xe] 6s2 4f14 5d10 6p1","[Xe] 6s2 4f14 5d10 6p2","[Xe] 6s2 4f14 5d10 6p3","[Xe] 6s2 4f14 5d10 6p4",
        "[Xe] 6s2 4f14 5d10 6p5","[Xe] 6s2 4f14 5d10 6p6","[Rn] 7s1","[Rn] 7s2",
        "null","[Rn] 7s2 5f14 6d2",
        "[Rn] 7s2 5f14 6d3","[Rn] 7s2 5f14 6d4","[Rn] 7s2 5f14 6d5","[Rn] 7s2 5f14 6d6",
        "[Rn] 7s2 5f14 6d7","[Rn] 7s2 5f14 6d8","[Rn] 7s2 5f14 6d9","[Rn] 7s2 5f14 6d10",
        "[Rn] 7s2 5f14 6d10 7p1","[Rn] 7s2 5f14 6d10 7p2","[Rn] 7s2 5f14 6d10 7p3","[Rn] 7s2 5f14 6d10 7p4",
        "[Rn] 7s2 5f14 6d10 7p5","[Rn] 7s2 5f14 6d10 7p6",
        "null","null","[Xe] 6s2 5d1",
        "[Xe] 6s2 5d1 4f1","[Xe] 6s2 4f3","[Xe] 6s2 4f4","[Xe] 6s2 4f5",
        "[Xe] 6s2 4f6","[Xe] 6s2 4f7","[Xe] 6s2 4f7 5d1","[Xe] 6s2 4f9",
        "[Xe] 6s2 4f10","[Xe] 6s2 4f11","[Xe] 6s2 4f12","[Xe] 6s2 4f13",
        "[Xe] 6s2 4f14","[Xe] 6s2 4f14 5d1","null","null","null","[Rn] 7s2 6d1","[Rn] 7s2 6d2",
        "[Rn] 7s2 5f2 6d1","[Rn] 7s2 5f3 6d1","[Rn] 7s2 5f4 6d1","[Rn] 7s2 5f6",
        "[Rn] 7s2 5f7","[Rn] 7s2 5f7 6d1","[Rn] 7s2 5f9","[Rn] 7s2 5f10",
        "[Rn] 7s2 5f11","[Rn] 7s2 5f12","[Rn] 7s2 5f13","[Rn] 7s2 5f14",
        "[Rn] 7s2 5f14 7p1","null"
    };
    FlowLayout flow;
    public Main() {
        super("Click on the elements you want to add.");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PeriodicTable table = new PeriodicTable(config);
        Score leftScore = new Score(true);
        Score rightScore = new Score(false);
        CenterPanel centerPanel = new CenterPanel(config, table);
        flow = new FlowLayout(FlowLayout.LEFT);
        setLayout(flow);
        add(leftScore);
        add(centerPanel);
        add(rightScore);
        add(table);
        setVisible(true);
    }
    
    public static void main(String[] args) throws Exception {
        Main eConfigGame = new Main();
    }
}
