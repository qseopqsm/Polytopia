public abstract class Casilla {
    boolean caminable;
    int elevación;
    boolean tesoro;
    tipoCasilla tipo;

    public abstract void setTipo(tipoCasilla tipo);

    public abstract void setElevacion(int elevacion);

}
    enum tipoCasilla {
        MAR,
        RIO,
        LLANURA1,
        LLANURA2,
        LLANURA3,
        BOSQUE,
        MONTE,
        CIUDAD
    }
