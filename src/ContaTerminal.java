import java.util.Scanner;
/**
 * Essa classe representa um metodo simples para criar uma conta em um banco.
 */
public class ContaTerminal{
      /**
     *  Metodo main
     * O metodo pergunta para o usuario pro inputs para criar uma conta em um banco e no final mostra todos os detalhes da *  conta no terminal.
     *
     */
   public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scrn.nextLine(); //armazena o nome do cliente

        System.out.println("Digite o número da Agência: ");
        String agencia = scrn.nextLine(); //armazena o numero da agencia

        int numero = 0;
        while (true) {
            try {
                System.out.println("Digite o número da sua conta: ");
                numero = Integer.parseInt(scrn.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Número de conta inválido. Por favor, digite novamente.");
            }
        } // try/catch para evitar inputs fora do padrao do programa

        double saldo = 0.0;
        while (true) {
            try {
                System.out.println("Digite o saldo desejado para retirada: ");
                saldo = Double.parseDouble(scrn.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Valor de saldo inválido. Por favor, digite novamente.");
            }
        } // try/catch para evitar inputs fora do padrao do programa

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        //Fechando o scanner
        scrn.close();
    }
}