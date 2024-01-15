public class Employee {

    String name;
    double GrossSalary;
    double Tax;

    public double NetSalary(){
        return GrossSalary-Tax;
    }

    public void IncreaseSalary(double percentage){
        double cal = (percentage/100) * GrossSalary;
         

    }
}
