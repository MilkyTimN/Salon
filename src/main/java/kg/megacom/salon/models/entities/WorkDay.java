package kg.megacom.salon.models.entities;

import kg.megacom.salon.models.enums.Days;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_work_day")
public class WorkDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "tb_work_day_master",
            joinColumns = @JoinColumn(name = "work_day_id"),
            inverseJoinColumns = @JoinColumn(name = "master_id"))
    List<Master> masterId;

    @Column(name = "days")
    @Enumerated(EnumType.ORDINAL)
    Days days;

    @Column(name = "start_date")
    Date startDate;

    @Column(name = "end_date")
    Date endDate;

}
