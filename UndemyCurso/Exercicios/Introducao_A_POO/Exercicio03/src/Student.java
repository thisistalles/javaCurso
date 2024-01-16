public class Student {

    public String name;
    public double note1;
    public double note2;
    public double note3;
    public double total;

    public void finalGrade() {
        total = note1 + note2 + note3;
        if (total > 60) {

            System.out.printf("FINAL GRADE = %.2f%n", total);
            System.out.println("PASS");
        } else {
            System.out.printf("FINAL GRADE = %.2f%n", total);
            System.out.println("FAILED");

            double missing = 60.00 - total;
            System.out.println("MISSING " + missing + " POINTS");
        }
    }

    public String showCase() {
        finalGrade();
        String i = "";
        return i;
    }

    public String toString() {
        return showCase();
    }
}
