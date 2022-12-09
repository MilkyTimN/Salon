package kg.megacom.salon.models.dtos;

import kg.megacom.salon.models.entities.Customer;
import kg.megacom.salon.models.entities.WorkDay;
import kg.megacom.salon.models.enums.BookingStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingTimeDto {
    Long id;
    Date startDate;
    Date endDate;
    Date addDate;
    Date updateDate;
    BookingStatus bookingStatus;
    WorkDay workDayID;
    Customer customerId;
}
