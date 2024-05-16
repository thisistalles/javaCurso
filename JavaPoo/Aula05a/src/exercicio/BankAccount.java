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

    public String getTypeAccount() {
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


    public void menu() {
        System.out.println("------MENU------");
        System.out.println("Digite o número da operação que deseja realizar: ");
        System.out.println("1 -Abrir Conta");
        System.out.println("2- Depositar");
        System.out.println("3- Sacar");
        System.out.println("4- Pagar Mensalidade");
        System.out.println("5- Fechar conta");
        System.out.println("6- Fechar Menu");
    }

    private int numberAccount() {
        Random random = new Random();
        return random.nextInt(9000) + 1000;
        //gpt
    }

    public void showBalance() {
        System.out.println("Seu saldo é: " + getBalance());
    }


    public void openAccount() {
        if (isStatus()) {
            System.out.println("Você já possui uma conta aberta!");
            return;
        }

        setStatus(true);
        this.type = getTypeAccount();
        this.owner = getOwner();
        this.numAccount = numberAccount();

        double bonusCurrentAccount = 50.00;
        double bonusSavingsAccount = 150.00;
        double calcBonus;

        if (this.type.equalsIgnoreCase("cc")) {

            calcBonus = balance + bonusCurrentAccount;
            setBalance(calcBonus);
            System.out.println("Bonus de R$" + bonusCurrentAccount + " depositado na sua conta");
        } else if (this.type.equalsIgnoreCase("cp")) {
            calcBonus = balance + bonusSavingsAccount;
            setBalance(calcBonus);
            System.out.println("Bonus de R$" + bonusSavingsAccount + " depositado na sua conta");
        } else {
            System.out.println("Tipo de conta inválido");
            setStatus(false);
            return;
        }

        System.out.println("Número da conta: " + getNumAccount());
        System.out.println("Nome: " + getOwner());
        System.out.println("Tipo da conta: " + getTypeAccount());
        showBalance();


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
        if (!isStatus()) {
            System.out.println("Primeiro abra uma conta para poder realizar essa operação!");
            return;
        }

        setBalance(this.balance += deposit);
        System.out.println("Deposito de R$: " + deposit + " Realizado.");
        showBalance();
    }


    public void saque(double saque) {
        if (!isStatus()) {
            System.out.println("Primeiro abra uma conta para poder realizar essa operação!");
            return;
        }

        if (saque > getBalance()) {
            System.out.println("Valor a sacar: R$" + saque);
            System.out.println("Valor indisponivel para saque.");
            showBalance();
            return;
        }

        setBalance(this.balance - saque);

        System.out.println("Saque de R$" + saque + " realizado");
        showBalance();

    }

    public void mensal() {

        if (!isStatus()) {
            System.out.println("Primeiro abra uma conta para poder realizar essa operação!");
            return;
        }

        double currentAccountFee = 12.00;
        double savingsAccountFee = 20.00;

        //thisiscleverson
        if (getTypeAccount().equalsIgnoreCase("CC") && getBalance() < currentAccountFee) {
            System.out.println("Você não tem saldo suficiente para pagar a mensalidade!");
            showBalance();
            return;
        } else if (getTypeAccount().equalsIgnoreCase("CP") && getBalance() < savingsAccountFee) {
            System.out.println("Você não tem saldo suficiente para pagar a mensalidade!");
            showBalance();
            return;
        }
        //thisiscleverson

        if (getTypeAccount().equalsIgnoreCase("CC")) {
            setBalance(this.balance - currentAccountFee);
        } else {
            setBalance(this.balance - savingsAccountFee);
        }
        System.out.println("Mensalidade paga");
        showBalance();

    }

}



