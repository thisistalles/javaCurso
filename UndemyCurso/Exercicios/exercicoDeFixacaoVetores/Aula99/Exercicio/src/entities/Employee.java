package entities;

public class Employee {
    public Integer id;
    public String name;
    private Double salary;


    public Employee(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage){
        double increaseAmount = salary * (percentage/100);
        salary += increaseAmount;
    }


}
