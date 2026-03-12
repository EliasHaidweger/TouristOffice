package unit2.student;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

public class Student {
    int id;
    @NonNull
    String name;
    @NonNull
    String surname;
    @NonNull
    String email;
    String phone;
    boolean active;
    int age;

}

