package trinta.um.agosto;
import java.util.Scanner;
public class JogoDaVelha {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
// Variáveis
        String matz[][] = new String[3][3];
        boolean rodada = true;
        String inserido;
        int cont = 0;
        
// Preenchendo matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matz[i][j] = " ";
            }
        }
        
// Laço principal
        while (true) {
            mostrarJogo(matz);
            verVencedor(matz);
            if (rodada) {
                System.out.println("Jogador 1, é a sua vez. Digite [X] e em seguida as coordenadas.");
                inserido = tcl.next();
                matz[tcl.nextInt()][tcl.nextInt()] = inserido;
            } else {
                System.out.println("Jogador 2, é a sua vez. Digite [O] e em seguida as coordenadas.");
                inserido = tcl.next();
                matz[tcl.nextInt()][tcl.nextInt()] = inserido;
            }
            rodada = !(rodada);
            cont++;
            if (cont == 9) {
                System.out.println("Não houve ganahdor!");
                System.exit(0);
            }
        }
    }
    public static void mostrarJogo(String mat[][]) {
        for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    if (y == 2) {
                        System.out.println("[" + mat[x][y] + "]");
                    } else {
                        System.out.print("[" + mat[x][y] + "]");
                    }
                }
            }
    }
    public static void verVencedor(String mat[][]) {
        for (int i = 0; i < 3; i++) {
            if (mat[i][0].equals(mat[i][1]) && mat[i][1].equals(mat[i][2]) && mat[i][0].equals("X")) {
                System.out.println("Parabens jogador 1, Você venceu!");
                System.exit(0);
            } else if (mat[i][0].equals(mat[i][1]) && mat[i][1].equals(mat[i][2]) && mat[i][0].equals("O")) {
                System.out.println("Parabens jogador 2, Você venceu!");
                System.exit(0);
            } else if (mat[0][i].equals(mat[1][i]) && mat[1][i].equals(mat[2][i]) && mat[0][i].equals("X")) {
                System.out.println("Parabens jogador 1, Você venceu!");
                System.exit(0);
            } else if (mat[0][i].equals(mat[1][i]) && mat[1][i].equals(mat[2][i]) && mat[0][i].equals("O")) {
                System.out.println("Parabens jogador 2, Você venceu!");
                System.exit(0);
            } else if (i == 2) {
                if (mat[0][0].equals(mat[1][1]) && mat[1][1].equals(mat[2][2]) && mat[0][0].equals("X")) {
                    System.out.println("Parabens jogador 1, Você venceu!");
                    System.exit(0);
                } else if (mat[0][2].equals(mat[1][1]) && mat[1][1].equals(mat[2][0]) && mat[0][2].equals("O")) {
                    System.out.println("Parabens jogador 2, Você venceu!");
                    System.exit(0);
                }
            }
        }
    }
}
