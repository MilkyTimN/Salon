package kg.megacom.salon.models.dtos;

import kg.megacom.salon.models.entities.Salon;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MasterDto {
    Long id;
    String name;
    Integer experience;
    Salon salonId;
}
