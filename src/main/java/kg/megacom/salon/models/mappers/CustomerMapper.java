package kg.megacom.salon.models.mappers;

import kg.megacom.salon.models.dtos.CustomerDto;
import kg.megacom.salon.models.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper extends BaseMapper<Customer, CustomerDto>{

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
}
