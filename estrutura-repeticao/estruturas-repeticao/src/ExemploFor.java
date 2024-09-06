public class ExemploFor {
    public static void main(String[] args) throws Exception {
        // for(int carneirinhos =1; carneirinhos <= 20; carneirinhos++){
        //     System.out.println("Contando carneirinhos " + carneirinhos);
        // }

        // System.out.println("Joazinho dormiu.");


        // Em arrays, o indice de elementos se inicia em 0
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }



    }
}
