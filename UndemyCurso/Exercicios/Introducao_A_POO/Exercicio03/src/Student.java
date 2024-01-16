public class Student {

    public String name;
    public double note1;
    public double note2;
    public double note3;
    public double total;

    public double finalGrade() {
        this.total = note1+note2+note3;
        return this.total;
    }

    public String toString(){
        return name + total;
    }


}
