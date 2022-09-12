package exercicio2;

import java.util.Scanner;

public class EX02PrintIdade {

	public static void main(String[] args) {

                //variável
                Scanner ler = new Scanner(System.in);
                String nome;
                int idade;
                
                //informações (inputs)
                System.out.println("Digite seu nome!");
                nome = ler.nextLine();
                System.out.println("Digite sua idade!");
                idade = ler.nextInt();

                //comparação
                if (idade > 18) {
                        System.out.println(nome + " é maior de idade!");
                } else
                        System.out.println(nome + " é menor de idade!");
                        
                //fechar scanner                
                ler.close();
        }
}

