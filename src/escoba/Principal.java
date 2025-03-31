package escoba;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del Jugador 1: ");
        String nombre1 = sc.nextLine();

        System.out.print("Ingrese el nombre del Jugador 2: ");
        String nombre2 = sc.nextLine();

        sc.close();
    }
}