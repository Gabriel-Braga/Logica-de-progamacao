import java.util.Scanner;
import java.util.Date;
public class Exec02_2 {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        Date data = new Date();
        System.out.println("Em que ano você nasceu ?");
        int ano = tcl.nextInt();
        System.out.println("Você tem " + (data.getYear() + 1900 - ano) + " anos de idade.");
    }
}
