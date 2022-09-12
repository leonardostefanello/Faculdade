package exercicio3;

import java.util.Scanner;

public class EX01TipoNumero {

	public static void main(String[] args) {

                //variável
                Scanner scanner = new Scanner(System.in);
                double n1;
                
                //informações
                System.out.println("Digite o primeiro numero!");
                n1 = scanner.nextInt();
                
                //comparações
                if (n1 == 0) {
                        System.out.println("0");
                } else if (n1 >= 1) {
                        System.out.println("1");
                } else if (n1 <= -1) {
                        System.out.println("-1");
                }
                
                //fechar scanner
                scanner.close();
	}
}
