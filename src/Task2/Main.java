package Task2;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("John", 12);
        Employee employee3 = new Employee("Max", 13, 50);

        Employee.setTotalSum(employee1.getSalary() + employee2.getSalary() + employee3.getSalary());

        System.out.println("The total salary of workers is " + Employee.getTotalSum());
    }
}
