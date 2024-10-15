package kz.alishev.lab_2.model;
import java.time.LocalDate;
import java.time.Period;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
@Document(collection = "users")
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    @Indexed(unique = true)
    private String email;
    private int age;

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}

