package INTERFAZ;

import JUGADOR.Jugador;
import MAPA.Map;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseJugador  implements MouseListener {

    INTERFAZ interfaz;
    Jugador jugador;
    Map map;
    MouseJugador(INTERFAZ interfaz, Jugador jugador, Map map){
        this.interfaz = interfaz;
        this.jugador = jugador;
        this.map = map;
    }

    Point click;
    Point mapclick;
    @Override
    public void mouseClicked(MouseEvent e) {
        click = new Point(e.getX(),e.getY());
        mapclick = new Point((e.getX() * 20) / map.mapa.length ,(e.getY() * 20) / map.mapa[0].length );
        System.out.println("x: " + mapclick.x + " y: " + mapclick.y);
        interfaz.label[mapclick.x][mapclick.y].setBackground(Color.RED);



    }

    @Override
    public void mousePressed(MouseEvent e) {
      /*  click = new Point(e.getX(),e.getY());
        mapclick = new Point((e.getX() * 20) / map.mapa.length ,(e.getY() * 20) / map.mapa[0].length );
        interfaz.label[mapclick.x][mapclick.y].setBackground(Color.RED);
        System.out.println("x: " + mapclick.x + " y: " + mapclick.y);
    */}

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
