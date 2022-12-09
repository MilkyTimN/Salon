package kg.megacom.salon.models.mappers;

import kg.megacom.salon.models.dtos.WorkDayDto;
import kg.megacom.salon.models.entities.WorkDay;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface WorkDayMapper extends BaseMapper<WorkDay, WorkDayDto>{

    WorkDayMapper INSTANCE = Mappers.getMapper(WorkDayMapper.class);

}
