package kg.megacom.salon.repositories;

import kg.megacom.salon.models.entities.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterRepository extends JpaRepository<Master, Long>{
}
