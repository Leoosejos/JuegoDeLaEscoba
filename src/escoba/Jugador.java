package escoba;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Jugador implements Serializable {
    private String nombre;
    private List<Carta> mano;
    private List<Carta> cartasCapturadas;


    private int totalEscobas;
    private int totalOros;
    private int totalSietes;
    private int totalCartas;
    private boolean capturoTodosOros;
    private boolean capturoSieteOros;
    private boolean contrincanteMenosDeDiez;

    public Jugador(String nombre) {
        this.nombre = nombre;
        mano = new ArrayList<>();
        cartasCapturadas = new ArrayList<>();
        totalEscobas = 0;
        totalOros = 0;
        totalSietes = 0;
        totalCartas = 0;
        capturoTodosOros = false;
        capturoSieteOros = false;
        contrincanteMenosDeDiez = false;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Carta> getMano() {
        return mano;
    }

    public List<Carta> getCartasCapturadas() {
        return cartasCapturadas;
    }

    public void agregarACartas(List<Carta> cartas) {
        mano.addAll(cartas);
    }

    public void definirMano(List<Carta> cartas) {
        mano = cartas;
    }

    public void capturarCartas(List<Carta> cartas) {
        cartasCapturadas.addAll(cartas);
    }

    public void reiniciarParaNuevoJuego() {
        mano.clear();
        cartasCapturadas.clear();
    }


    public void sumarEscoba() {

    }


    public int getTotalEscobas() {
    }

    public int getTotalOros() {
        return totalOros;
    }

    public int getTotalSietes() {
        return totalSietes;
    }

    public int getTotalCartas() {
        return totalCartas;
    }

    public boolean tuvoTodosOros() {

    }

    public boolean tuvoSieteOros() {

    }

    public boolean rivalConMenosDeDiez() {

    }

    public void establecerRivalMenosDeDiez(boolean valor) {}

    public void reiniciarEstadisticasParaRonda()
}