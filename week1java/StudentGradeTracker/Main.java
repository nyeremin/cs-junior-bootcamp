public class Main {
    public static void main(String[] args) {
        
        int[] grades = {90, 85, 95};

        Student student = new Student("Nicholas", grades);

        System.out.println(student.calculateAverage());
    }
}
