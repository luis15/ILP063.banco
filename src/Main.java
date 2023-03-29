import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        menu(banco);
        return;
    }
    public static void menu(Banco banco){
        System.out.println("O que você deseja fazer?");
        System.out.println("1 - Abrir conta");
        System.out.println("2 - Ver saldo");
        System.out.println("3 - Depósito em conta");
        System.out.println("4 - Saque em conta");
        System.out.println("5 - Encerrar conta");
        System.out.println("6 - Transferir valores");
        System.out.println("7 - Sair");

        Scanner opcaoSelecionada = new Scanner(System.in);
        Integer opcao = opcaoSelecionada.nextInt();


         switch (opcao){
             case 1:
                 banco.abrirConta();
                 break;
             case 2:
                 banco.exibirSaldo();
                break;
             case 3:
                 banco.depositar();
                 break;
             case 4:
                 banco.sacar();
                break;
             case 5:
                 banco.encerrarConta();
                 break;
             case 6:
                banco.transferir();
                break;
            case 7:
                 return;
             default:
                 System.out.println("Opção inválida");

         }

          menu(banco);
    }
}