package ProvaHeltonA1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ex033 {

    public static class Habitantes {

        //Declarações
        String sexo;
        String olhos;
        String cabelos;
        int idade;

        //Função
        public Habitantes() {
            this.sexo = new String();
            this.olhos = new String();
            this.cabelos = new String();
        }

        public void setSexo(String _sexo) {
            this.sexo = _sexo;
        }

        public void setOlhos(String _olhos) {
            this.olhos = _olhos;
        }

        public void setCabelos(String _cabelos) {
            this.cabelos = _cabelos;
        }

        public void setIdade(int _idade) {
            this.idade = _idade;
        }

        public static void main(String[] args) {

            //Declarações
            int femininoidade = 0;
            int verdeloiro = 0;
            int maioridade = 0;

            //Arraylist
            ArrayList<Habitantes> habit = new ArrayList<Habitantes>();

            //Loop
            for (int i = 0; true; i++) {

                Habitantes h = new Habitantes();

                h.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do " + (i + 1) + " habitante")));
                if (h.idade == -1) {
                    break;
                }
                h.setSexo(JOptionPane.showInputDialog("Digite o sexo do " + (i + 1) + " habitante"));
                h.setOlhos(JOptionPane.showInputDialog("Cor dos Olhos (Azuis, Verdes, Castanhos) do " + (i + 1) + " habitante"));
                h.setCabelos(JOptionPane
                        .showInputDialog("Cor dos Cabelos (Loiros, Castanhos, Pretos) do " + (i + 1) + " habitante"));

                if (h.idade > maioridade) {
                    maioridade = h.idade;
                }

                if (h.sexo.toLowerCase().equals("feminino") && h.idade >= 18 && h.idade <= 35) {
                    femininoidade++;
                }

                if (h.olhos.toLowerCase().equals("verdes") && h.cabelos.toLowerCase().equals("loiros"))
                    verdeloiro++;

                habit.add(h);
            }

            //Print
            System.out.println("----------------- RESULTADO -----------------");
            System.out.println("\n");
            System.out.println("Maior idade: " + maioridade);
            System.out.println("Sexo Feminino entre 18 e 35 anos: " + femininoidade);
            System.out.println("Olhos Verdes e Cabelos Loiros: " + verdeloiro);
            System.out.println("\n");
            System.out.println("---------------------------------------------");
        }
    }
}
