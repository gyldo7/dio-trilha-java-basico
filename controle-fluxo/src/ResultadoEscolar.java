// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 4;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Prova Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    //Operador ternario 
    //Cenario 1
    String resultado1 = (nota >=7) ? "Aprovado" : "Reprovado";
	System.out.println(resultado1);
    
    //Cenario 2
    String resultado2 = (nota >=7) ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
	System.out.println(resultado2);
    }
}
