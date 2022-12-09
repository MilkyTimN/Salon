package kg.megacom.salon.services.impl;

import kg.megacom.salon.models.dtos.CustomerDto;
import kg.megacom.salon.models.mappers.CustomerMapper;
import kg.megacom.salon.repositories.CustomerRepository;
import kg.megacom.salon.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        return CustomerMapper.INSTANCE.toDto(repository.save(CustomerMapper.INSTANCE.toEntity(customerDto)));
    }

    @Override
    public CustomerDto findById(Long id) {
        return CustomerMapper.INSTANCE.toDto(repository.findById(id)
                .orElseThrow(()->new RuntimeException("Not found")));
    }

    @Override
    public List<CustomerDto> getAll() {
        return CustomerMapper.INSTANCE.toDtos(repository.findAll());
    }
}
