package unit2.student;

public class Main {


    public static void main(String[] args) {
     Student student = new Student();
     Student temp = new Student("dadsa","dajjda","dsjad");
     Student student2 = new Student("dadsa","dajjda","dsjad");

        student.getId();
        student.getName();
        student.getSurname();

        System.out.println(student);

    }
}
