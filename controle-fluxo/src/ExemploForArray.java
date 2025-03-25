public class ExemploForArray {
    public static void main(String[] args) {

        //  emm arrays o índice começa com o zero
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	    for (int x=0; x<alunos.length; x++) {
		    System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	}

    System.out.println();
    //Forma each
    System.out.println("ForEach\n");

	for(String aluno : alunos) {
        System.out.println(aluno);
      }
  
    }
    
}
