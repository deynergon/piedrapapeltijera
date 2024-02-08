package org.example;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int piedra = 1;
        int papel = 2;
        int tijera = 3;

        System.out.println("Selecciona tu opción:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");

        int eleccionUsuario = keyboard.nextInt();


        Random random = new Random();
        int eleccionJugador2 = random.nextInt(3) + 1;


        Main juego = new Main();
        String opcionUsuarioStr = juego.convertirOpcionACadena(eleccionUsuario);
        String opcionJugador2Str = juego.convertirOpcionACadena(eleccionJugador2);


        System.out.println("Jugador 1 seleccionó: " + opcionUsuarioStr);
        System.out.println("Jugador 2 seleccionó: " + opcionJugador2Str);



        juego.determinarGanador(eleccionUsuario, eleccionJugador2);
    }


    String convertirOpcionACadena(int opcion) {
        switch (opcion) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijera";
            default:
                return "Opción no válida";
        }
    }


    void determinarGanador(int eleccionUsuario, int eleccionJugador2) {
        if (eleccionUsuario == eleccionJugador2) {
            System.out.println("¡Empate!");
        } else if ((eleccionUsuario == 1 && eleccionJugador2 == 3) ||
                (eleccionUsuario == 2 && eleccionJugador2 == 1) ||
                (eleccionUsuario == 3 && eleccionJugador2 == 2)) {
            System.out.println("¡ Felicidades Ganaste!");
        } else {
            System.out.println("¡Jajajajajaj perdiste contra una maquina :D !");
        }
    }
}