package exercicio1;

import java.util.Scanner;

public class CalcSalarioLiquido {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Informações
        double inss = 0;
        double vinss = 0;
        double irrf = 0;
        double virrf = 0;
        
        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();

        System.out.println("Digite o salário bruto:");
        double sb = ler.nextInt();
        
        System.out.println("Digite o percentual de desconto:");
        double pd = ler.nextDouble();
        
        //Valores INSS
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
        
        //Valores IRRF
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
        
        //Valor Desconto
        double cpd = sb*(pd/100);
        	
        //Resultado
        double vf = vinss+virrf+cpd;
        double resultado = (sb-vf);
        		
        System.out.println("Nome: " + nome);
	System.out.println("% Desconto: " + cpd);
        System.out.println("Salario Liquido a receber: " + resultado);
	System.out.println("%INNS: " + inss);
	System.out.println("% IRRF: " + irrf);

	}

}
