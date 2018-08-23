import java.util.Scanner;
public class Exec04 {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Como é o nome do vendedor ?");
        String nome = tcl.nextLine();
        System.out.println("Qual seu salário fixo ?");
        float salario = tcl.nextFloat();
        System.out.println("Quantos ele vendeu este mês ?");
        float vendas = tcl.nextFloat();
        float salariof = salario + (vendas * 0.15f);
        System.out.format("%s recece um salário fixo de %.2f, mas neste mês ele receberá %.2f devido " 
        +"a sua comissão. \n", nome, salario, salariof);
    }
}
