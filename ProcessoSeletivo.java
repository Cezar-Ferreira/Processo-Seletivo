package controlecanditado;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	
	public static void main(String[] args){
	  //selecaoCanditados();
	  //imprimirSelecionados();
	  String [] candidatos = {"CEZAR", "JULIANA", "FELIPE", "MARIA", "JEFFERSON"};
	  
	  for(String candidato: candidatos) {
		  entrandoEmContato(candidato);
		  
	  } 
 }
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else 
				System.out.println("CONTATO REALIZADO COM SUCESSO");
	}while(continuarTentando && tentativasRealizadas <3 );
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato  +  " NA " +  tentativasRealizadas + " TENTATIVA");
		else 
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + "REALIZADA");
	}
	//método auxiliar
	static boolean atender() {
		return new Random().nextInt(3) ==1;
		}	

	static void imprimirSelecionados() {
		String [] candidatos = {"CEZAR", "JULIANA", "FELIPE", "MARIA", "JEFFERSON"};
		
		System.out.println("Imprimindo a lsita de cantidatos informando o indice do elemento");
		
		for(int indice=0; indice < candidatos.length; indice++) {
			System.out.println("O canditado de n° " + indice + " é " + candidatos[indice]);
	}
}	
    static void selecaoCanditados(){
        String [] candidatos = {"CEZAR", "JULIANA", "FELIPE", "MARIA", "JEFFERSON", "GUSTAVO", "PEDRO", "ANDRE", "JOSÉ", "MATHEUS"};

        int canditadosSelecionados = 0;
        int canditadoAtual=0;
        double salarioBase=2000.0;
        while (canditadosSelecionados < 5 && canditadoAtual < candidatos.length){
            String candidato = candidatos[canditadoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O canditado" + candidato + "Solicitou este valor de salário " + salarioPretendido);
            
            if (salarioBase >= salarioPretendido){
                System.out.println("O canditado " + candidato + " foi selecionado para a vaga");
                canditadosSelecionados++;
            }
            canditadoAtual++;
        } 
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCanditado(double salarioPretendido){
    double salarioBase = 2000.0;
    if(salarioBase > salarioPretendido){
        System.out.println("LIGAR PARA O CANDIDATO");
    }else if (salarioBase==salarioPretendido)
        System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    else{
        System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
   		}
    }
 }
    