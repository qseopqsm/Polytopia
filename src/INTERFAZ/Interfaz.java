package INTERFAZ;

import javax.swing.*;
import java.awt.*;

public class Interfaz extends JFrame {
    public Interfaz(){
        new JFrame("polytopia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(InterMapa.tamañoPanel.x, InterMapa.tamañoPanel.y);
        Container panel1 = InterMapa.Panel_mapa;
        JPanel panel2 = Menu.menu;
        add(panel1);
        add(panel2);
        setVisible(true);
    };
}
