import INTERFAZ.InterMapa;
import INTERFAZ.Interfaz;
import JUGADOR.Jugador;
import MAPA.Map;
import MAPA.MapGenerator;
import MAPA.MapTransformer;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Map mapa = new Map(new MapTransformer(new MapGenerator(100,100)));
        Jugador jugador = new Jugador();
        jugador.setPosicion(new Point(50,50));

        Interfaz interfa =  new Interfaz();
    }

}
