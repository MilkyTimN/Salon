package kg.megacom.salon.models.mappers;

import kg.megacom.salon.models.dtos.BookingTimeDto;
import kg.megacom.salon.models.entities.BookingTime;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookingTimeMapper extends BaseMapper<BookingTime, BookingTimeDto>{

    BookingTimeMapper INSTANCE = Mappers.getMapper(BookingTimeMapper.class);

}
