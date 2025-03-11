package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        List<String> selecionados = selecaoCandidato();
        imprimirSelecionados(selecionados);
        for(String candidato: selecionados) {
          entrandoEmContato(candidato);
        }
    }
    
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            //elas precisam sofrer alterações se não da erro
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }
            
        } while(continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato +", Na tentiva" + tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", após número maximo de tentativas" + tentativasRealizadas + "relizadas");
        }
    }

    //método auxiliar 
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static List<String> selecaoCandidato() {
        String[] candidatos = {"Felipe", "Gabriel", "Julia", "Anna", "Gustavo", "Daniel", "Marcos", "Gael", "Theodoro", "Daniela"};
        List<String> selecionados = new ArrayList<>();
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou " + salarioPretendido + " de salário");
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                selecionados.add(candidato); // Adiciona o candidato à lista
                candidatosSelecionados++;
            } else {
                System.out.println("O candidato " + candidato + " foi reprovado na vaga");
            }
            candidatoAtual++;
        }
        return selecionados;
    }

    static void imprimirSelecionados(List<String> selecionados) {
        System.out.println(" Candidatos selecionados:");
        int indice = 1;
        for (String candidato : selecionados) {
            System.out.println("O candidato de n°" + indice + " é o " + candidato);
            indice++;
        }
    }
    
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
          double salarioBase = 2000.0;
          if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
          }
          else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
          }
          else {
            System.out.println("Aguardando o resultado dos outros candidatos");
          }

   }

}