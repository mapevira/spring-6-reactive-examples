package guru.springframework.spring6reactiveexamples.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jt, Spring Framework Guru.
 *
 * @author architecture - raulp
 * @version 12/08/2024 - 08:50
 * @since jdk 1.21
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Integer id;
    private String firstName;
    private String lastName;

}
