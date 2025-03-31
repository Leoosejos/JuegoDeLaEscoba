package escoba;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    private Jugador jugador1;
    private Jugador jugador2;
    private Mazo mazo;
    private List<Carta> cartasMesa;

    public Partida(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        mazo = new Mazo();
        mazo.revolver();
        cartasMesa = new ArrayList<>();
    }


    public void jugar() {

        jugador1.definirMano(mazo.repartir(3));
        jugador2.definirMano(mazo.repartir(3));
        cartasMesa = mazo.repartir(4);

    }
}
