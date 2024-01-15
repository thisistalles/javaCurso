public class Employee {

    String name;
    double GrossSalary;
    double Tax;

    public double NetSalary() {
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double percentage) {
        percentage = (percentage / 100) * GrossSalary;
        this.GrossSalary = (GrossSalary - Tax) + percentage;
    }
}
