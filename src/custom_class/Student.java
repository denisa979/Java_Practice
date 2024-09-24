package custom_class;

public class Student {

    String name, studentId;
    char gender;
    int age, grade;
    boolean isFullTime;




    public Student(String name,char gender,int age, String studentId, int grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
        this.studentId = studentId;
        this.isFullTime = isFullTime;
    }

    @Override
    public String toString() {
        return
                "name= '" + name + '\'' +
                ", gender= " + gender +
                ", age= " + age +
                ", studentId= " + studentId +
                ", grade= " + grade +
                ", isFullTime= " + isFullTime;
    }
    public void study(){
        System.out.println(name + " is studying.");
    }
}
/*
Create a custom class named Student
     Attributes:
         name, gender, age, studentId, grade, isFullTime

        Actions:
            setInfo(): sets all the fields of the student object
            toString(): when a student info is passed in print statement,
                    it should display all the information of the student object
            study()
 */