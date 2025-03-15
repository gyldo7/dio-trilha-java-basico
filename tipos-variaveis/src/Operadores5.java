public class Operadores5 {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;
        String resultado = "";

        if(a==b){
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }

        System.out.println(resultado);

       String resultadoTernario = (a==b) ? "verdadeiro" : "falso";

       System.out.println("Resultado operador ternario: " + resultadoTernario);
    }
}
