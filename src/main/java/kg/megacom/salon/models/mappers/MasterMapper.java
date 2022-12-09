package kg.megacom.salon.models.mappers;

import kg.megacom.salon.models.dtos.MasterDto;
import kg.megacom.salon.models.entities.Master;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MasterMapper extends BaseMapper<Master, MasterDto>{

    MasterMapper INSTANCE = Mappers.getMapper(MasterMapper.class);
}
