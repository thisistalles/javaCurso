public class AccountData {
    public String name;
    public String resp;
    private int numberAccount;
    private double value;


    public AccountData(String name, String resp, int numberAccount, double value) {
        this.numberAccount = numberAccount;
        this.name = name;

        if (this.resp != "n") {
            this.value = value;
        }


    }
}
