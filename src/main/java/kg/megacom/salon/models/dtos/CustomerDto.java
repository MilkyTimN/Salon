package kg.megacom.salon.models.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerDto {
    Long id;
    String name;
    String login;
    String password;
    String email;
    String phone;
}
