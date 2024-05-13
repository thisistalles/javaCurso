package exercicio;

import java.util.Random;

public class BankAccount {

    public int numAccount;
    protected String type = "";
    private String owner;
    private Double balance;
    private boolean status;


    public BankAccount(boolean status, double balance) {
        this.status = status = false;
        this.balance = balance = 0.00;
    }

    private int numberAccount() {
        Random random = new Random();
        return random.nextInt(9000) + 1000;
        //gpt
    }


    public void openAccount(String type, String owner, double balance) {

        this.status = true;
        this.type = type;
        this.owner = owner;
        this.numAccount = numberAccount();

        double bonuscc = 50.00;
        double bonuscp = 150.00;


        if (this.type.equalsIgnoreCase("cc")) {

            this.balance = balance + bonuscc;
            System.out.println("Bonus de R$" + bonuscc + " depositado na sua conta");
        } else {
            this.balance = balance + bonuscp;
            System.out.println("Bonus de R$" + bonuscp + " depositado na sua conta");
        }
        System.out.println("Número da conta: " + numAccount);
        System.out.println("Nome: " + owner);
        System.out.println("Tipo da conta: " + type);
        show_Balance();

    }
    public void show_Balance(){
        System.out.println("Seu saldo é: " + this.balance);

    }

    public void closedAccount() {
        if (this.balance > 0) {
            System.out.println("Você ainda tem R$" + this.balance + " em conta, Saque para poder fechar a conta.");
            return;
        } else if (this.balance < 0) {
            System.out.println("Pague o que deve para poder fechar a conta!");
            return;
        }

        System.out.println("Aguarde sua conta está sendo fechada...");
        this.status = false;
        System.out.println("Conta fechada!");

    }

    public void deposit(double deposit) {
        if (!this.status) {
            System.out.println("Abra uma conta para poder depositar!");
            return;
        }

        this.balance += deposit;
        System.out.println("Deposito de R$: " + deposit + " Realizado.");
        show_Balance();
    }


    public void saque(double saque) {
        if (!this.status) {
            System.out.println("Abra uma conta para poder sacar!");
            return;
        }

        if (saque > this.balance) {
            System.out.println("Valor a sacar: R$" + saque);
            System.out.println("Valor indisponivel para saque.");
            show_Balance();
            return;
        }

        this.balance = this.balance - saque;


        System.out.println("Saque de R$" + saque + " realizado");
        show_Balance();

    }

    public void mensal() {

        if (!this.status) {
            System.out.println("Abra uma conta para poder pagar a mensalidade!");
            return;
        }
        double cc = 12.00;
        double cp = 20.00;

        //thisiscleverson
        if(this.type.equalsIgnoreCase("CC") && this.balance < cc ){
            System.out.println("Você não tem saldo suficiente para pagar a mensalidade!");
            show_Balance();
            return;
        }
        else if(this.type.equalsIgnoreCase("CP") && this.balance < cp){
            System.out.println("Você não tem saldo suficiente para pagar a mensalidade!");
            show_Balance();
            return;
        }
        //thisiscleverson


        if (this.type.equalsIgnoreCase("CC")) {
            this.balance = this.balance - cc;
        } else {
            this.balance = this.balance - cp;
        }
        System.out.println("Mensalidade paga");
        show_Balance();


    }


}



