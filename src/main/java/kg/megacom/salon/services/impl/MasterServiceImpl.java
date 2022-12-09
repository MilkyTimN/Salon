package kg.megacom.salon.services.impl;

import kg.megacom.salon.models.dtos.MasterDto;
import kg.megacom.salon.models.mappers.MasterMapper;
import kg.megacom.salon.repositories.MasterRepository;
import kg.megacom.salon.services.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterServiceImpl implements MasterService {

    private final MasterRepository repository;

    @Autowired
    public MasterServiceImpl(MasterRepository repository) {
        this.repository = repository;
    }

    @Override
    public MasterDto save(MasterDto masterDto) {
        return MasterMapper.INSTANCE.toDto(repository.save(MasterMapper.INSTANCE.toEntity(masterDto)));
    }

    @Override
    public MasterDto findById(Long id) {
        return MasterMapper.INSTANCE.toDto(repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Not found")));
    }

    @Override
    public List<MasterDto> getAll() {
        return MasterMapper.INSTANCE.toDtos(repository.findAll());
    }
}
