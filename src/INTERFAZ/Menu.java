package INTERFAZ;

import javax.swing.*;
public class Menu{
   static JPanel menu = new JPanel();
    JButton skills = new JButton("skills");
    JButton stats = new JButton("stats");
    JButton backMenu = new JButton("X");
    Menu() {
        menu.setSize(InterMapa.tamañoPanel.x, 300);
        skills.setBounds(10,10,50,20);
        stats.setBounds(10,40,50,20);
        backMenu.setBounds(10,70,50,20);
        menu.add(skills);
        menu.add(stats);
        menu.add(backMenu);

    }
}
