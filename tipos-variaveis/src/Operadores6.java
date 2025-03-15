public class Operadores6 {
    public static void main(String[] args) {

        String nomeUm = "GLEYSON";
        String nomeDois = "GLEYSON";

        System.out.println(nomeUm.equals(nomeDois)); // Para objetos usar o método equals para comparação.


        int numero1 = 1;
        int numero2 = 2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente a numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior que numero2? " + simNao);


    }
}
