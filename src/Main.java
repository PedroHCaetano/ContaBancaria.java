import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Bank = new Scanner(System.in);
        String nome = "Pedro Henrique Caetano";
        String conta = "Corrente";
        double saldo = 2500.00;
        int escolha = 0;

        double valor;
        double novoSaldo;
        double transferencia = 0;

        System.out.printf("""
                ************
                
                Dados iniciais do Cliente:
               
                Nome:  %s
                Tipo conta:  %s
                Saldo Inicial:  %.2f
                
                ************
                """, nome, conta, saldo);

        while (escolha != 4) {
            System.out.println("""
                    
                    Operações
                    
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Escolha uma opção:""");
            escolha = Bank.nextInt();

            if  (escolha == 1) {
                System.out.println("Saldo = " + saldo);

            } else if (escolha == 2) {
                System.out.println("Qual o valor de recebimento? ");
                valor = Bank.nextDouble();
                novoSaldo = saldo + valor;
                System.out.println("novo Saldo = R$" + novoSaldo);
                saldo = novoSaldo;

            } else if (escolha == 3) {
                if (saldo > 0) {
                    System.out.println("Qual valor deseja transferir? ");
                    transferencia = Bank.nextDouble();
                }if (transferencia > saldo){
                    System.out.println("Saldo insuficiente. Não foi póssivel realizar essa operação.");
                } else {
                    novoSaldo = saldo - transferencia;
                    saldo = novoSaldo;
                    System.out.println("novo Saldo = R$" + novoSaldo);
                }

            } else if (escolha == 4) {
                System.out.println("Operação encerrada.");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}