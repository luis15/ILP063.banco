import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    public List<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<Conta>();
        this.contas.add(new Conta("Amauri", "001", 100.00));
        this.contas.add(new Conta("Raissa", "002", 0.50));
        this.contas.add(new Conta("Igor", "003", 10.00));
        this.contas.add(new Conta("João Nunes", "004", 1.00));
        this.contas.add(new Conta("Yan", "005", 0.00));
        System.out.println("Banco inicializado");
    }
    public void abrirConta(){
        Conta conta = new Conta();
        contas.add(conta);
    }

    public void exibirSaldo(){
        Integer indice = this.obterIndiceConta();

        if(indice != -1){
            this.contas.get(indice).exibirSaldo();
        }else{
            System.out.println("Conta não localizada");
        }
    }


    public void sacar(){
        Integer indice = this.obterIndiceConta();

        if(indice != -1){
            System.out.println("Digite o valor do saque");
            Scanner obterValores = new Scanner(System.in);
            Double valor = obterValores.nextDouble();
            this.contas.get(indice).sacar(valor);
        }else{
            System.out.println("Conta não localizada");
        }
    }

    public void depositar(){
        Integer indice = this.obterIndiceConta();

        if(indice != -1){
            System.out.println("Digite o valor do depósito");
            Scanner obterValores = new Scanner(System.in);
            Double valor = obterValores.nextDouble();
            this.contas.get(indice).depositar(valor);
        }else{
            System.out.println("Conta não localizada");
        }
    }

    public void encerrarConta(){
        Integer indice = this.obterIndiceConta();

        if(indice != -1){
            System.out.println("Você tem certeza que deseja excluir essa conta?");
            this.contas.get(indice).exibirSaldo();
            System.out.println("Para confirmar digite SIM");
            Scanner obterValores = new Scanner(System.in);
            String valorDigitado = obterValores.nextLine();
            if(valorDigitado.equals("SIM")){
                this.contas.remove(this.contas.get(indice));
                System.out.println("Conta encerrada!");
            }else{
                System.out.println("Operação cancelada");
            }

        }else{
            System.out.println("Conta não localizada");
        }
    }

    public Integer obterIndiceConta(){
        System.out.print("Digite o CPF do titular");
        Scanner obterValores = new Scanner(System.in);
        String cpf = obterValores.nextLine();

        Integer indice = 0;

        for(Conta conta:this.contas) {
            if (conta.getCpf().equals(cpf)) {
                return indice;
            } else {
                indice++;
            }
        }
        return -1;
    }
}

