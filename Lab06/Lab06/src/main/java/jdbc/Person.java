package jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Person {
    String name;
    String surname;
    String thirdName;
    Date birthDate;
    int mailsCount;
}
