import java.util.Scanner;

// Atividade desenvolvida por:
/*
 * @author: Alexandre Mazarin Bakanovas 
 * @date: 28/08/2024
 */

 
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Inicialização do Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Por gentileza, forneça o número da conta: ");
        int numeroConta = sc.nextInt();
        //Houve a necessidade de inserir um sc.nextLine para o consumo do /n que é deixado pelo nextInt.
        sc.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        String agencia = sc.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        
        System.out.println("Digite o valor do saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numeroConta + ", e o seu saldo de R$ " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
