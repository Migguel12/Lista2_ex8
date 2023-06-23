import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o preco do primeiro produto: ");
        double p1 = ler.nextDouble();
        System.out.println("");

        System.out.print("Informe o preco do segundo produto: ");
        double p2 = ler.nextDouble();
        System.out.println("");

        System.out.print("Informe o preco do terceiro produto: ");
        double p3 = ler.nextDouble();
        System.out.println("");

        if(p1<p2 && p1<p3){
            System.out.print("Voce deve comprar o PRIMEIRO produto por ser o mais barato");
        }

        else if(p2<p1 && p2<p3){
            System.out.print("Voce deve comprar o SEGUNDO produto por ser o mais barato");
        }

        else{
            System.out.print("Voce deve comprar o TERCEIRO produto por ser o mais barato");
        }
    }
}
