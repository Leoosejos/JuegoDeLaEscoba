package escoba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<>();

        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (Palo palo : Palo.values()) {
            for (int valor : valores) {
                cartas.add(new Carta(palo, valor));
            }
        }
    }

    public void revolver() {
        Collections.shuffle(cartas);
    }
    public List<Carta> repartir(int n) {
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < n && !cartas.isEmpty(); i++) {
            mano.add(cartas.remove(0));
        }
        return mano;
    }

    public boolean estaVacio() {
        return cartas.isEmpty();
    }
}