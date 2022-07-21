package Task1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 1);
        Student student2 = new Student("Andrew", 2);
        Student student3 = new Student("Max", 3);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        Student.setAvgRating((student1.getRating() + student2.getRating() + student3.getRating()) / 3);
        System.out.println("Average rating = " + Student.getAvgRating());

        System.out.println("Total rating = " + (Student.getAvgRating() * 3));
    }
}
