package kg.megacom.salon.controllers;

import kg.megacom.salon.models.dtos.BookingTimeDto;
import kg.megacom.salon.services.BookingTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("bookingTime")
public class BookingTimeController {

    private final BookingTimeService service;

    @Autowired
    public BookingTimeController(BookingTimeService service) {
        this.service = service;
    }

    @PostMapping("/save")
    ResponseEntity<?> save (BookingTimeDto bookingTimeDto) {
        try{
            return ResponseEntity.ok(service.save(bookingTimeDto));
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping("/getById")
    ResponseEntity<?> getById(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(service.findById(id));
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping("/getAll")
    ResponseEntity<?> getAll() {
        try{
            return ResponseEntity.ok(service.getAll());
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}

