package kg.megacom.salon.models.entities;


import kg.megacom.salon.models.enums.BookingStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_booking_time")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class BookingTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "start_date")
    Date startDate;

    @Column(name = "end_date")
    Date endDate;

    @Column(name = "add_date")
    Date addDate;

    @Column(name = "update_date")
    Date updateDate;

    @Column(name = "booking_status")
    @Enumerated(EnumType.ORDINAL)
    BookingStatus bookingStatus;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "tb_work_day_booking_time",
            joinColumns = @JoinColumn(name = "booking_time_id"),
            inverseJoinColumns = @JoinColumn(name = "work_day_id"))
    List<WorkDay> workDayID;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tb_customer_id")
    Customer customerId;

}
