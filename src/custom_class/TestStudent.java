package custom_class;

public class TestStudent {

    public static void main(String[] args) {
        Student student = new Student("Dalibor", 'M', 16, "A23", 12, true);

        System.out.println(student);
        student.study();
    }
}
