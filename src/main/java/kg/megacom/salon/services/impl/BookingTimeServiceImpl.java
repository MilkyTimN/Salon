package kg.megacom.salon.services.impl;

import kg.megacom.salon.models.dtos.BookingTimeDto;
import kg.megacom.salon.models.mappers.BookingTimeMapper;
import kg.megacom.salon.repositories.BookingTimeRepository;
import kg.megacom.salon.services.BookingTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingTimeServiceImpl implements BookingTimeService {

    private final BookingTimeRepository repository;

    @Autowired
    public BookingTimeServiceImpl(BookingTimeRepository repository) {
        this.repository = repository;
    }

    @Override
    public BookingTimeDto save(BookingTimeDto bookingTimeDto) {
        return BookingTimeMapper.INSTANCE.toDto(repository.save(BookingTimeMapper.INSTANCE.toEntity(bookingTimeDto)));
    }

    @Override
    public BookingTimeDto findById(Long id) {
        return BookingTimeMapper.INSTANCE.toDto(repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Not found")));
    }

    @Override
    public List<BookingTimeDto> getAll() {
        return BookingTimeMapper.INSTANCE.toDtos(repository.findAll());
    }
}
