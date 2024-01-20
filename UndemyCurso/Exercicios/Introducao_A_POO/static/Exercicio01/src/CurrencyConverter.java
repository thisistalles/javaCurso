public class CurrencyConverter {


    public static double converter(double price, double quantity) {
        double total = price * quantity;
        double iof = 0.06 * total;
        total += iof;
        return total;

    }


}
