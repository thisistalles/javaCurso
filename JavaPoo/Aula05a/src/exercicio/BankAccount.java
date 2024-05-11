package exercicio;

public class BankAccount {
    public    int       numAccount;
    public   String     type = "";
    public   String     owner;
    public   Double     balance;
    public   boolean    status;


    public BankAccount(boolean status, double balance) {
        this.status = status = false;
        this.balance = balance = 0.0;
    }



    public void OpenAccount(String type,String owner, double balance){

        this.status = true;
        this.type = type;
        this.owner = owner;
        this.numAccount = 5987;

        double bonuscc = 50.00;
        double bonuscp = 150.00;

        if(this.type.equalsIgnoreCase("cc")){

            this.balance = balance + bonuscc;
            System.out.println("Bonus de R$" + bonuscc + " depositado na sua conta");
        }else{
            this.balance = balance + bonuscp;
            System.out.println("Bonus de R$" + bonuscp + " depositado na sua conta");
        }
        System.out.println("Número da conta: " + numAccount);
        System.out.println("Nome: " + owner);
        System.out.println("Tipo da conta: "+ type);
        System.out.println("Saldo R$: " + this.balance);


    }
    public void ClosedAccount(){
        if(this.balance > 0) {
            System.out.println("Você ainda tem saldo em conta, Saque para poder fechar a conta.");
        }
        else if (this.balance < 0){
                System.out.println("Pague o que deve para poder fechar a conta!");
        }

        }

    public void Deposit(double deposit){
        if(!this.status){
            System.out.println("Abra uma conta para poder depositar!");
            return;
        }

        this.balance += deposit;
        System.out.println("Deposito de R$: " +deposit + " Realizado.");
        System.out.println("Seu saldo é: R$" + this.balance);
    }


    public void Saque(double saque){
        if(!this.status){
            System.out.println("Abra uma conta para poder sacar!");
            return;
        }

        if(saque>this.balance){
            System.out.println("Valor indisponivel.");
            System.out.println("Saldo disponivel: R$" + this.balance);
        }

        this.balance = this.balance-saque;


        System.out.println("Saque de R$" + saque + " realizado, seu saldo é: R$" + this.balance);

    }

    public void Mensal(){
        if(!this.status){
            System.out.println("Abra uma conta para poder pagar a mensalidade!");
            return;
        }
        double cc = 12.00;
        double cp = 20.00;
        if (this.type.equalsIgnoreCase("CC")){
            this.balance = this.balance-cc;
        }else {
            this.balance = this.balance-cp;
        }
        System.out.println("Mensalidade paga");
        System.out.println("Seu saldo é: R$"+this.balance);


    }







}



