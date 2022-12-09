package kg.megacom.salon.controllers;

import kg.megacom.salon.models.dtos.WorkDayDto;
import kg.megacom.salon.services.WorkDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/workDay")
public class WorkDayController {

    private final WorkDayService service;

    @Autowired
    public WorkDayController(WorkDayService service) {
        this.service = service;
    }

    @PostMapping("/save")
    ResponseEntity<?> saveWorkDay(@RequestBody WorkDayDto workDayDto){
        try{
            return ResponseEntity.ok(service.save(workDayDto));
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping("/getById")
    ResponseEntity<?> getById(@RequestParam Long id){
        try {
            return ResponseEntity.ok(service.findById(id));
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping("/getAll")
    ResponseEntity<?> findAll() {
        try{
            return ResponseEntity.ok(service.getAll());
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
