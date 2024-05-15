package exercicio;

import java.util.Random;

public class BankAccount {

    public int numAccount;
    protected String type = "";
    private String owner;
    private Double balance;
    private boolean status;

    public BankAccount() {
        setStatus(false);
        setBalance(0.00);
    }

    public int getNumAccount() {
        return numAccount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private int numberAccount() {
        Random random = new Random();
        return random.nextInt(9000) + 1000;
        //gpt
    }

    public void show_Balance() {
        System.out.println("Seu saldo é: " + getBalance());
    }

    public void statusAccount() {
        if (!isStatus()) {
            System.out.println("Primeiro abra uma conta para poder realizar essa operação!");
            return;
        }
    }

    public void openAccount() {

        this.status = true;
        this.type = getType();
        this.owner = getOwner();
        this.numAccount = numberAccount();

        double bonuscc = 50.00;
        double bonuscp = 150.00;
        double bonus;

        if (this.type.equalsIgnoreCase("cc")) {

            bonus = balance + bonuscc;
            setBalance(bonus);
            System.out.println("Bonus de R$" + bonuscc + " depositado na sua conta");
        } else {
            bonus = balance + bonuscp;
            setBalance(bonus);
            System.out.println("Bonus de R$" + bonuscp + " depositado na sua conta");
        }
        System.out.println("Número da conta: " + getNumAccount());
        System.out.println("Nome: " + getOwner());
        System.out.println("Tipo da conta: " + getType());
        show_Balance();

    }


    public void closedAccount() {
        if (getBalance() > 0) {
            System.out.println("Você ainda tem R$" + getBalance() + " em conta, Saque para poder fechar a conta.");
            return;
        } else if (getBalance() < 0) {
            System.out.println("Pague o que deve para poder fechar a conta!");
            return;
        }

        System.out.println("Aguarde sua conta está sendo fechada...");
        setStatus(false);
        System.out.println("Conta fechada!");

    }

    public void deposit(double deposit) {
        statusAccount();

        setBalance(this.balance += deposit);
        System.out.println("Deposito de R$: " + deposit + " Realizado.");
        show_Balance();
    }


    public void saque(double saque) {
        statusAccount();

        if (saque > getBalance()) {
            System.out.println("Valor a sacar: R$" + saque);
            System.out.println("Valor indisponivel para saque.");
            show_Balance();
            return;
        }

        setBalance(this.balance - saque);


        System.out.println("Saque de R$" + saque + " realizado");
        show_Balance();

    }

    public void mensal() {

        statusAccount();

        double cc = 12.00;
        double cp = 20.00;

        //thisiscleverson
        if (getType().equalsIgnoreCase("CC") && getBalance() < cc) {
            System.out.println("Você não tem saldo suficiente para pagar a mensalidade!");
            show_Balance();
            return;
        } else if (getType().equalsIgnoreCase("CP") && getBalance() < cp) {
            System.out.println("Você não tem saldo suficiente para pagar a mensalidade!");
            show_Balance();
            return;
        }
        //thisiscleverson


        if (getType().equalsIgnoreCase("CC")) {
            setBalance(this.balance - cc);
        } else {
            setBalance(this.balance - cp);
        }
        System.out.println("Mensalidade paga");
        show_Balance();


    }


}



