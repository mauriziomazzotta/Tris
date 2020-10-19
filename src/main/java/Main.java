import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int turno = 0;
        int riga = 0;
        int colonna = 0;
        int currentPlayer = 1;

        Field field;
        Scanner in = new Scanner(System.in);

        while(true) {

            boolean gameEnded = false;
            currentPlayer = 1;
            field = new Field();

            while (!gameEnded) {
                do {
                    System.out.println(field.toString());
                    System.out.println("Player n° " + currentPlayer + ", inserisci riga:");

                    riga = in.nextInt();

                    System.out.println("Player n° " + currentPlayer + ", inserisci colonna:");

                    colonna = in.nextInt();

                    if (!field.validMove(riga, colonna)) {
                        System.out.println("Mossa non valida");
                    }
                } while (!field.validMove(riga, colonna));

                field.set(riga, colonna, currentPlayer);

                System.out.println(field.toString());

                if (field.win()) {
                    System.out.println("Ha vinto il Player n° " + currentPlayer);
                    gameEnded = true;
                    System.out.println("Inizio nuova partita");
                }

                turno++;

                if (turno == 9) {
                    System.out.println("Pareggio");
                    gameEnded = true;
                }

                if (currentPlayer == 1) currentPlayer = 2;
                else currentPlayer = 1;
            }
        }
    }
}
