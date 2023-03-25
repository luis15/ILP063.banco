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
        System.out.println("6 - Sair");

        Scanner opcaoSelecionada = new Scanner(System.in);
        Integer opcao = opcaoSelecionada.nextInt();

        if(opcao==1){
            banco.abrirConta();
        }else if(opcao==2){
            banco.exibirSaldo();
        }else if(opcao==3){
            banco.depositar();
        }else if(opcao==4){
            banco.sacar();
        }else if(opcao==5){
            banco.encerrarConta();
        }else if(opcao==6){
            return;
        }else{
            System.out.println("Opção inválida");
        }

        menu(banco);
    }
}