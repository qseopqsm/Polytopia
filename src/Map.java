public class Map {
    Casilla[][] mapa;


    Map(MapTransformer mt){
        this.mapa = mt.Transform();
    }
}
