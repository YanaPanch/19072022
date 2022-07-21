package Task1;

public class Student {
    private String name;
    private int rating;
    private static int avgRating;

    public Student() {
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public boolean betterStudent(Student student){
        return this.rating > student.rating;
    }

    @Override
    public String toString() {
        return "Student: " +
                "name - " + this.name +
                ", rating=" + this.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static int getAvgRating() {
        return avgRating;
    }

    public static void setAvgRating(int avgRating) {
        Student.avgRating = avgRating;
    }
}
