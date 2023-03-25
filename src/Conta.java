import java.util.Scanner;

public class Conta {
    private String titular;
    private Double saldo;
    private String cpf;

    public Conta(){
        Scanner obterValores = new Scanner(System.in);

        System.out.println("Digite o nome do titular");
        this.titular = obterValores.nextLine();

        System.out.println("Digite o CPF do titular");
        this.cpf = obterValores.nextLine();

        System.out.println("Digite o saldo inicial");
        this.saldo = obterValores.nextDouble();
    }

    public Conta(String titular, String cpf, Double saldo){
        this.titular = titular;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public void exibirSaldo(){
        System.out.println("O saldo para o titular " + this.titular+ " de CPF "+this.cpf +" é de R$"+ this.saldo);
    }

    public void depositar(Double valor){
        this.saldo = Operacoes.somar(this.saldo, valor);
    }

    public void sacar(Double valor){
        this.saldo = Operacoes.subtrair(this.saldo, valor);
    }

    public String getCpf(){
        return this.cpf;
    }
}
