package exercicio2;

//Substitui o Scanner :)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AbonoTempoServiço {
    	public static void main(String[] args) throws Exception {
            System.out.println("------------------ INICIO ------------------");
            System.out.println("\n");

            System.out.println("1. Menos de 5 Anos");
            System.out.println("2. Entre 5 a 10 Anos");
            System.out.println("3. Mais de 10 Anos");
            System.out.println("0. Sair");
            System.out.println("\n");
            
            System.out.println("- Digite a sua escolha: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String tserviço = br.readLine();
            
            int escolha = Integer.parseInt(tserviço);
            
            //Dependendo da resposta o codigo executado muda
            switch (escolha) {
                case 1:
                	menos5();
                    break;
                case 2:
                	mais5();
                    break;
                case 3:
                	mais10();
                    break;

                case 0:
                    System.out.println("Até logo...");
                    break;

                default:
                    System.out.println("Valor Inválido");
            }

            System.out.println("---------------------------------------------");
    }

    	//Menos de 5 Anos de Serviço
    public static void menos5() throws Exception {
        System.out.println("---------------------------------------------");

        //Variáveis
        String salário, nome, tserviço;
        double s2, t2, resultado;

        //Leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: "); //nome do funcionário
        nome = br.readLine();
        System.out.println("Digite o tempo de serviço: "); //apenas por informação
        tserviço = br.readLine();
        System.out.println("Digite seu salário: "); //salário bruto
        salário = br.readLine();
        
        //Valores
        t2 = Integer.parseInt(tserviço); //converte o t2 para inteiro
        s2 = Integer.parseInt(salário); //converte o s2 para inteiro
        resultado = s2 + (0.05 * s2); //reajuste do salário

        //Print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário Bruto: " + salário);
        System.out.println("Tempo de Serviço: " + t2);
        System.out.println("Salário reajustado: " + resultado);
    }
    
    public static void mais5() throws Exception {
        System.out.println("---------------------------------------------");

        //Variáveis
        String salário, nome, tserviço;
        double s2, t2, resultado;

        //Leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: ");
        nome = br.readLine();
        System.out.println("Digite o tempo de serviço: ");
        tserviço = br.readLine();
        System.out.println("Digite seu salário: ");
        salário = br.readLine();
        
        //Valores
        t2 = Integer.parseInt(tserviço); //converte o t2 para inteiro
        s2 = Integer.parseInt(salário); //converte o s2 para inteiro
        resultado = s2 + (0.1 * s2); //reajuste do salário

        //Print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário Bruto: " + salário);
        System.out.println("Tempo de Serviço: " + t2);
        System.out.println("Salário reajustado: " + resultado);
    }
    
    public static void mais10() throws Exception {
        System.out.println("---------------------------------------------");

        //Variáveis
        String salário, nome, tserviço;
        double s2, t2, resultado;

        //Leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o nome do Funcionário: ");
        nome = br.readLine();
        System.out.println("Digite o tempo de serviço: ");
        tserviço = br.readLine();
        System.out.println("Digite seu salário: ");
        salário = br.readLine();
        
        //Valores
        t2 = Integer.parseInt(tserviço); //converte o t2 para inteiro
        s2 = Integer.parseInt(salário); //converte o s2 para inteiro
        resultado = s2 + (0.15 * s2); //reajuste do salário

        //Print
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário Bruto: " + salário);
        System.out.println("Tempo de Serviço: " + t2);
        System.out.println("Salário reajustado: " + resultado);
    }
    
}
