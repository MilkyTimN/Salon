package kg.megacom.salon.services.impl;

import kg.megacom.salon.models.dtos.WorkDayDto;
import kg.megacom.salon.models.mappers.WorkDayMapper;
import kg.megacom.salon.repositories.WorkDayRepository;
import kg.megacom.salon.services.WorkDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkDayServiceImpl implements WorkDayService {

    private final WorkDayRepository repository;

    @Autowired
    public WorkDayServiceImpl(WorkDayRepository repository) {
        this.repository = repository;
    }

    @Override
    public WorkDayDto save(WorkDayDto workDayDto) {
        return WorkDayMapper.INSTANCE.toDto(repository.save(WorkDayMapper.INSTANCE.toEntity(workDayDto)));
    }

    @Override
    public WorkDayDto findById(Long id) {
        return WorkDayMapper.INSTANCE.toDto(repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found")));
    }

    @Override
    public List<WorkDayDto> getAll() {
        return WorkDayMapper.INSTANCE.toDtos(repository.findAll());
    }
}
