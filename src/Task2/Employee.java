package Task2;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }

    public int getSalary(){
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee name " + this.name + ", rate=" + this.rate +
                ", hours=" + this.hours;
    }

    public int changeRate(int rate){
        this.rate = rate;
        return this.getSalary();
    }

    public double getBonuses(){
        double amountOfBonus = 0.1;
        return getSalary() * amountOfBonus;
    }
}
