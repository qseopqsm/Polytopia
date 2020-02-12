import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InterfazMapa extends JFrame implements KeyListener {


    JPanel Panel_mapa;
    JLabel[][] label;
    JLabel Jugad;


    Map m;
    Jugador j;


    int timer = 1000;
    int time = 0;
    static int tics = 0;




    InterfazMapa(Map c, Jugador j) {
        this.m = c;
        this.j = j;
        new JFrame("mapa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(c.mapa.length * 6, c.mapa[0].length * 6);

        Panel_mapa = new JPanel();
        JPanel menu = Panel_mapa;
        Panel_mapa.setBounds(100,100,c.mapa.length * 5, c.mapa[0].length * 5);
        label = new JLabel[c.mapa.length][c.mapa[0].length];
        Panel_mapa.setLayout(new GridLayout(c.mapa.length, c.mapa[0].length));
        setLocationRelativeTo(null);
        add(Panel_mapa);

        losJL(c, j);
        addKeyListener(this);
        setVisible(true);


    }

    public void ponerJL(Map c, Jugador ju) {

        for (int i = 0; i < c.mapa.length; i++) {
            for (int j = 0; j < c.mapa[0].length; j++) {

                if (losJug(i, j, ju)) {
                    System.out.println(i + "  " + j);
                } else UnJL(i, j, c);

            }
        }
    }

    public boolean losJug(int i, int j, Jugador c) {

        if (c.posicion.x == i && c.posicion.y == j) {

            label[i][j].setBackground(new Color(200, 200, 200));
            return true;
        }
        return false;
    }

    public void CuadJL(Map m, Jugador j) {

        int x = j.posicion.x - 1;
        int y = j.posicion.y - 1;

        if (x < 0) x = 0;
        if (y < 0) y = 0;

        int max_x = j.posicion.x + 1;
        int max_y = j.posicion.y + 1;

        if (max_x >= m.mapa.length) max_x = m.mapa.length - 1;
        if (max_y >= m.mapa[0].length) max_y = m.mapa[0].length - 1;

        for (int i = x; i <= max_x; i++) {
            for (int k = y; k <= max_y; k++) {
                if (losJug(i, k, j)) {
                } else UnJL(i, k, m);

            }
        }


    }

    public void losJL(Map c, Jugador ju) {

        for (int i = 0; i < c.mapa.length - 1; i++) {
            for (int j = 0; j < c.mapa[0].length - 1; j++) {

                label[i][j] = new JLabel("");
                label[i][j].setOpaque(true);

                if (losJug(i, j, ju)) {

                } else UnJL(i, j, c);

                Panel_mapa.add(label[i][j]);
            }
        }
    }

    public void UnJL(int i, int j, Map c) {

        switch (c.mapa[i][j].tipo) {
            case MAR:
                label[i][j].setBackground(new Color(0, 0, 100));
                break;
            case LLANURA1:
                label[i][j].setBackground(new Color(154, 180, 70));
                break;
            case LLANURA2:
                label[i][j].setBackground(new Color(128, 180, 64));
                break;
            case LLANURA3:
                label[i][j].setBackground(new Color(101, 180, 32));
                break;
            case BOSQUE:
                label[i][j].setBackground(new Color(27, 126, 29));
                break;
            case MONTE:
                label[i][j].setBackground(new Color(100, 100, 100));
                break;
            case RIO:
                label[i][j].setBackground(new Color(0, 100, 250));
                break;
            case CIUDAD:
                label[i][j].setBackground(new Color(0, 0, 0));
                break;
            default:
                System.out.println("Keapasao");
                break;

        }
    }


    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.j.MoveUP(this.m);
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.j.MoveLEFT(this.m);
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.j.MoveDOWN(this.m);
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.j.MoveRIGHT(this.m);
        }

        CuadJL(this.m, this.j);


    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

}
