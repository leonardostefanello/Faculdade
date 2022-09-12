package exercicio3;

import java.util.Scanner;

public class TipoNumero01 {

	public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
                double n1;
                
                //Informações
                System.out.println("Digite o primeiro numero!");
                n1 = ler.nextInt();
                
                if (n1 == 0) {
                	System.out.println("0");
                } else if (n1 >= 1) {
                	System.out.println("1");
                } else if (n1 <= -1) {
                	System.out.println("-1");
                }
        }
	}

}
