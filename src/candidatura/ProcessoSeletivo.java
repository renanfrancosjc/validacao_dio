package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    public static void mais(String[] args){
      String[] candidatos = {"Felipe", "Lucas", "Marcia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"}
      for(String candidato:candidatos){
            System.out.println(" ")
      }


    }

   

    static void selecaoCadidato(){
        String[] candidatos = {"Felipe", "Lucas", "Marcia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"}

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados<5 && candidatosAtual <= candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();


            System.out.println(candidato + " solicitou esse salario R$" + salarioPretendido)
            if(salarioBase >= salarioPretendido){
                System.out.println(candidato + " selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2400);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO")

        }else if(salarioBase==salarioPretendido){
            System.out.println("Ligar com contra proposta")
        }else{
            System.out.println("aguardar resultados dos demais candidatos")
        }

    }
}