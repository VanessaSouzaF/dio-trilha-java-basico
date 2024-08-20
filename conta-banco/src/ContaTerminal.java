import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as menssagens para o usuario
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt(); 

        System.out.println("Por favor, digite o número da Agência:");
        scanner.nextLine(); 
        String agencia = scanner.nextLine(); 

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine(); 

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble(); 

        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}

