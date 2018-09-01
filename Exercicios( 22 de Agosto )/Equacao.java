package vinte.dois.agosto;
import java.util.Scanner;
public class Equacao {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Toda equação do segundo grau pode ser escrita na forma: 'ax² + bx + c = 0'");
        System.out.print("Digite o valor de a: ");
        int a = tcl.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = tcl.nextInt();
        System.out.print("Digite o valor de c: ");
        int c = tcl.nextInt();
        if (a < 0) {
            System.out.println("O gráfico dessa equação na forma de uma função,\na concavidade seria para baixo");
        } else if (a > 0) {
            System.out.println("O gráfico dessa equação na forma de uma função,\na concavidade seria para cima");
        } else {
            System.out.println("Não há equação do segundo grau com a = 0!!");
            System.exit(0);
        }
        int delta = b*b - 4 * a * c;
        if (delta > 0) {
            System.out.println("Seu delta é " + delta);
        } else if (delta < 0) {
            System.out.println("Seu delta é negativo ("+ delta +"). Não há raizes reais.");
            System.exit(0);
        } else {
            System.out.println("Seu delta é igual a zero. Terá duas raízes iguais.");
        }
        double x1 = (-b - Math.sqrt(delta))/(2 * a);
        double x2 = (-b + Math.sqrt(delta))/(2 * a);
        System.out.println("X1 = "+ x1 +" / X2 = "+ x2);
    }
}
