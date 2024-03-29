public class Main {
    public static void main(String[] args) {

        int x = 20;

        Object obj = x;  //Boxing

        System.out.println(obj);

        int y = (int) obj; //Unboxing

        System.out.println(y);
    }
}