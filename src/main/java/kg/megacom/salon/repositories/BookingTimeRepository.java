package kg.megacom.salon.repositories;

import kg.megacom.salon.models.entities.BookingTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingTimeRepository extends JpaRepository<BookingTime, Long> {
}
