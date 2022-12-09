package kg.megacom.salon.services.impl;

import kg.megacom.salon.models.dtos.SalonDto;
import kg.megacom.salon.models.mappers.SalonMapper;
import kg.megacom.salon.repositories.SalonRepository;
import kg.megacom.salon.services.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalonServiceImpl implements SalonService {

    private final SalonRepository repository;

    @Autowired
    public SalonServiceImpl(SalonRepository repository) {
        this.repository = repository;
    }

    @Override
    public SalonDto save(SalonDto salonDto) {
            return SalonMapper.INSTANCE.toDto(repository.save(SalonMapper.INSTANCE.toEntity(salonDto)));
    }

    @Override
    public SalonDto findById(Long id) {
            return SalonMapper.INSTANCE.toDto(repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Not found")));
    }

    @Override
    public List<SalonDto> getAll() {
        return SalonMapper.INSTANCE.toDtos(repository.findAll());
    }
}
