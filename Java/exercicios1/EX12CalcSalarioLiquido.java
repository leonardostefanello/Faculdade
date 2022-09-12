package exercicio1;

import java.util.Scanner;

public class EX12CalcSalarioLiquido {

	public static void main(String[] args) {

        //variáveis
        Scanner ler = new Scanner(System.in);
        String nome;
        double sb, pd, inss, vinss, irrf, virrf, cpd, vf, resultado;

        //inicialização de algumas variáveis
        inss = 0;
        irrf = 0;
        vinss = 0;
        virrf = 0;

        //informações (inputs)
        System.out.println("Digite seu nome:");
        nome = ler.nextLine();
        System.out.println("Digite o salário bruto:");
        sb = ler.nextInt();
        System.out.println("Digite o percentual de desconto:");
        pd = ler.nextDouble();
        
        //valores INSS
        if (sb <= 1212) {
        	inss = 7.5;
        	vinss = sb*(inss/100);
        } else if ((sb <= 2427) & (sb >= 1212)) {
        	inss = 9;
        	vinss = sb*(inss/100);
        } else if ((sb <= 3641) & (sb >= 2427)) {
        	inss = 12;
        	vinss = sb*(inss/100);
        } else if ((sb <= 7087) & (sb >= 3641)) {
        	inss = 14;
        	vinss = sb*(inss/100);
        }
        
        //valores IRRF
        if (sb <= 1903) {
        	irrf = 0;
        	virrf = sb*(irrf/100);
        } else if ((sb <= 2826) & (sb >= 1903)) {
        	irrf = 7.5;
        	virrf = sb*(irrf/100);
        } else if ((sb <= 3751) & (sb >= 2826)) {
        	irrf = 15;
        	virrf = sb*(irrf/100);
        } else if ((sb <= 4664) & (sb >= 3751)) {
        	irrf = 22.5;
        	virrf = sb*(irrf/100);
        } else if ((sb >= 4665)) {
        	irrf = 27.5;
        	virrf = sb*(irrf/100);
        }
        
        //calculos
        cpd = sb*(pd/100); //valor desconto
        vf = vinss+virrf+cpd;
        resultado = (sb-vf);
        
        //print
        System.out.println("Nome: " + nome);
        System.out.println("Salario Liquido a receber: " + resultado);
	System.out.println("% Desconto: " + pd);
	System.out.println("% INNS: " + inss);
	System.out.println("% IRRF: " + irrf);

        //fechar scanner
        ler.close();
	}

}
