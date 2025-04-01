package candidatura;

import java.util.Locale;
public class ProcessoSeletivo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println("Processo Seletivo\n");

        analisarCandidato(1900.00);
        analisarCandidato(2200.00);
        analisarCandidato(2000);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }
}