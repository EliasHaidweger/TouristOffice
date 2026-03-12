package unit2.lectutre;

public class Mainwithcondintions {

    public static void main(String[] args) {

        String email = "asdf";

        Lecturer l = Lecturer.builder().build();

        var temp = Lecturer.builder().name("Lecturer").build();

        if(email != null || !email.isEmpty()){
            l = Lecturer.builder().email(email).build();
        }

    }
}
