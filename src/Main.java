

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner opcoes = new Scanner(System.in);
        String nome = "Eduardo Hoiser";
        String conta = "Corrente";
        double saldoConta = 2200;

        // inicializar dados do cliente
        System.out.println("************************************************");
        System.out.println("\nNome do cliente: "+nome);
        System.out.println("Tipo de conta: "+conta);
        System.out.println("Seu saldo: R$ "+saldoConta);
        System.out.println("\n************************************************");

        // menu de opções
        System.out.println("Operações:");
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");
        System.out.println("Digite a opção desejada:");
        int opcao = opcoes.nextInt();

        if (opcao == 1) {
            System.out.println("Seu saldo é "+saldoConta);
        } if (opcao == 2) {
            System.out.println("Digite um valor para deposito:");
            double deposito = opcoes.nextDouble();
            double saldoTotal = deposito + saldoConta;
            System.out.println("Seu saldo atual é: "+saldoTotal);
        }if (opcao == 3) {
            System.out.println("Digite o valor para transferencia:");
            double transferencia = opcoes.nextDouble();
            if (transferencia > saldoConta) {
                System.out.println("Saldo insuficiente!");
            } else {
                double saldoTotal = saldoConta - transferencia;
                System.out.println("Seu saldo atual é: "+saldoTotal);
            }
        }if (opcao == 4) {
            System.out.println("Operação encerrada!");
        }
        }
    }