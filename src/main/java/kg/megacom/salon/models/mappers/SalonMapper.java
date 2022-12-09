package kg.megacom.salon.models.mappers;

import kg.megacom.salon.models.dtos.SalonDto;
import kg.megacom.salon.models.entities.Salon;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SalonMapper extends BaseMapper<Salon, SalonDto>{

    SalonMapper INSTANCE = Mappers.getMapper(SalonMapper.class);
}
