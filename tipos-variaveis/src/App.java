public class App {
    public static void main(String[] args) throws Exception {
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
       // short numeroCurto2 = numeroNormal; //aqui se chama casting o erro, que é atribuir
        // uma variavel com um tipo que suporta muito mais que o outro (int e short no caso)
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 10.75; //Variavel não pode mudar pois não pode alterar uma constante
        // a qual é determinada pela palavra "final"

    }
}
