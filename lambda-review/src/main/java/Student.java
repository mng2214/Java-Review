import lombok.*;

import java.util.Objects;
//@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor

@Data
public class Student {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private final int age;


}
