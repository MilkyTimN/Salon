package kg.megacom.salon.models.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SalonDto {

    Long id;
    String name;
    String address;
}
