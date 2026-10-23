class universityPersonnel {
    String name;
    int age;
    String gender;

    universityPersonnel(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void displayInfo() {
        System.out.println("name   :" + name);
        System.out.println("age    :" + age);
        System.out.println("gender    :" + gender);
    }
}
class Student extends universityPersonnel {
    String degreeProgram;
    double cgpa;
    int semester;

    Student(String name, int age, String gender, String degreeProgram, double cgpa, int semester) {
        super(name, age, gender);
        this.degreeProgram = degreeProgram;
        this.cgpa = cgpa;
        this.semester = semester;

    }

    void displayStudentInfo() {
        super.displayInfo();
        System.out.println("degree program   :" + degreeProgram);
        System.out.println("cgpa   :" + cgpa);
        System.out.println("semester   :" + semester);
    }
}
class Teacher extends universityPersonnel{
    String designation;
    double salary;
    String department;
    Teacher( String name,int age,String gender,String designation,double salary,String department){
        super(name, age, gender);
        this.designation=designation;
        this.salary=salary;
        this.department=department;


    }
    void displayTeacherInfo(){
        System.out.println("       TEACHER INFORMATION    ");
        super.displayInfo();
        System.out.println("designaation   :"+department);
        System.out.println("salary   :"+salary);
        System.out.println("department  :"+department);
    }
}
public class Main {
    public static void main(String[] args) {
        Student std=new Student("Ali",20,"male","BSCS",3.7,2);
        std.displayStudentInfo();
        Teacher tch=new Teacher("AHMAD",33,"MALE","SENIOR",200000,"BBA");
        tch.displayTeacherInfo();
    }
}
