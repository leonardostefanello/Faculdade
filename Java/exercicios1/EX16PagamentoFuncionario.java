package exercicio1;

import java.util.Scanner;

public class EX16PagamentoFuncionario {

	public static void main(String[] args) {

        //variável
        Scanner ler = new Scanner(System.in);
        String nome;
        double vtv, vc, cvc, resultado;
        
        //informações (inputs)
        System.out.println("Digite o seu nome:");
        nome = ler.nextLine();
        System.out.println("Digite o valor total de vendas:");
        vtv = ler.nextInt();
        System.out.println("Digite a porcentagem de comissão:");
        vc = ler.nextDouble();
        
        //calculos
        cvc = vtv*(vc/100); //valor comissão
        resultado = (vtv+cvc);
        	
        //print
        System.out.println("Nome: " + nome);
        System.out.println("Valor da Comissão: " + cvc);
        System.out.println("Valor a receber: " + resultado);

        //fechar scanner
        ler.close();
	}

}
