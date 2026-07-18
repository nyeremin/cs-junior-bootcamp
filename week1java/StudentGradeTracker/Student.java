public class Student {
    
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverage() {

        int total = 0;

        for (int grade : grades) {
            total += grade;
        }

        return (double) total / grades.length;
    }
}
