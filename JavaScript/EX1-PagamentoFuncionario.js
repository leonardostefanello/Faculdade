package exercicio1;

import java.util.Scanner;

public class PagamentoFuncionario {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Informações
        System.out.println("Digite o seu nome:");
        String nome = ler.nextLine();

        System.out.println("Digite o valor total de vendas:");
        double vtv = ler.nextInt();
        
        System.out.println("Digite a porcentagem de comissão:");
        double vc = ler.nextDouble();
        
        //Valor Comissão
        double cvc = vtv*(vc/100);
        	
        //Resultado
        double resultado = (vtv+cvc);
        		
        System.out.println("Nome: " + nome);
        System.out.println("Valor da Comissão: " + cvc);
        System.out.println("Valor a receber: " + resultado);

	}

}
