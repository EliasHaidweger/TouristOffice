package unit2.lectutre;

public class Main {
    public static void main(String[] args) {
        Lecturer first = Lecturer.builder().id(1).email("jdajdb").name("duadjia").build();
        Lecturer secound = Lecturer.builder().id(1).name("dduisabf").build();

        System.out.println(first);
        System.out.println(secound);

    }
}
