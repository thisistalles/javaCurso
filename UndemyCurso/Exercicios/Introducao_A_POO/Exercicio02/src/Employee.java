public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary() {
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage) {
        percentage = (percentage / 100) * grossSalary;
        this.grossSalary = (grossSalary - tax) + percentage;
    }
}
