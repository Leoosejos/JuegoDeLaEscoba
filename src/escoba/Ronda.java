package escoba;

public class Ronda {
    private Jugador jugador1;
    private Jugador jugador2;
    private int puntosJugador1;
    private int puntosJugador2;
    private long tiempoInicio;
    private long tiempoFin;

    public Ronda(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        puntosJugador1 = 0;
        puntosJugador2 = 0;
        // Reinicia las estadísticas de cada jugador para la ronda
        jugador1.reiniciarEstadisticasParaRonda();
        jugador2.reiniciarEstadisticasParaRonda();
    }

    private int calcularPuntosPartida(Jugador jugador, Jugador rival) {
        int pts = 0;
        pts += jugador.getTotalEscobas();
        if (jugador.getTotalOros() > rival.getTotalOros()) {
            pts += 1;
        }
        if (jugador.tuvoTodosOros()) {
            pts += 2;
        }
        if (jugador.getTotalSietes() > rival.getTotalSietes()) {
            pts += 1;
        }
        if (jugador.tuvoSieteOros()) {
            pts += 1;
        }
        if (jugador.getTotalCartas() > rival.getTotalCartas()) {
            pts += 1;
        }
        if (rival.getTotalCartas() < 10) {
            pts += 2;
        }
        return pts;
    }


}