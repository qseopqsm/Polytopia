import java.awt.*;

public class Jugador {

    Point posicion;

    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }

    public void MoveUP(Map map){
        if (this.posicion.x > 0)
            if (map.mapa[this.posicion.x - 1][this.posicion.y].tipo == tipoCasilla.LLANURA1
            && map.mapa[this.posicion.x - 1][this.posicion.y].tipo == tipoCasilla.LLANURA2
            && map.mapa[this.posicion.x - 1][this.posicion.y].tipo == tipoCasilla.LLANURA3)
        this.posicion.x--;


    }
    public void MoveDOWN(Map map){
        if (this.posicion.x < map.mapa.length-1)
            if (map.mapa[this.posicion.x + 1][this.posicion.y].tipo == tipoCasilla.LLANURA1
            && map.mapa[this.posicion.x + 1][this.posicion.y].tipo == tipoCasilla.LLANURA2
            && map.mapa[this.posicion.x + 1][this.posicion.y].tipo == tipoCasilla.LLANURA3)
                this.posicion.x++;


    }
    public void MoveLEFT(Map map){
        if (this.posicion.y > 0)
            if (map.mapa[this.posicion.x][this.posicion.y-1].tipo == tipoCasilla.LLANURA1
            && map.mapa[this.posicion.x][this.posicion.y-1].tipo == tipoCasilla.LLANURA2
            && map.mapa[this.posicion.x][this.posicion.y-1].tipo == tipoCasilla.LLANURA3)this.posicion.y--;

    }
    public void MoveRIGHT(Map map){
        if (this.posicion.y < map.mapa.length-1)
            if (map.mapa[this.posicion.x][this.posicion.y+1].tipo == tipoCasilla.LLANURA1
            && map.mapa[this.posicion.x][this.posicion.y+1].tipo == tipoCasilla.LLANURA2
            && map.mapa[this.posicion.x][this.posicion.y+1].tipo == tipoCasilla.LLANURA3)
                this.posicion.y++;

    }
}
