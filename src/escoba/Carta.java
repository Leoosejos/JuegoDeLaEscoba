package escoba;

import java.io.Serializable;

public class Carta implements Serializable {
    private Palo palo;
    private int valor;

    public Carta(Palo palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        String nombreCarta;
        if (valor == 8) {
            nombreCarta = "Sota";
        } else if (valor == 9) {
            nombreCarta = "Caballo";
        } else if (valor == 10) {
            nombreCarta = "Rey";
        } else {
            nombreCarta = String.valueOf(valor);
        }
        return nombreCarta + " de " + palo.toString();
    }
}