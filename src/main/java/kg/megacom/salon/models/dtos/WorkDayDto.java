package kg.megacom.salon.models.dtos;

import kg.megacom.salon.models.entities.Master;
import kg.megacom.salon.models.enums.Days;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WorkDayDto {

    Long id;
    Master masterId;
    Days days;
    Date startDate;
    Date endDate;
}
