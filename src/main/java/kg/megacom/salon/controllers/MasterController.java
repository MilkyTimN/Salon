package kg.megacom.salon.controllers;

import kg.megacom.salon.models.dtos.MasterDto;
import kg.megacom.salon.services.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/master")
public class MasterController {

    private final MasterService service;

    @Autowired
    public MasterController(MasterService service) {
        this.service = service;
    }

    @PostMapping("/save")
    ResponseEntity<?> save(@RequestBody MasterDto masterDto) {
        try {
            return ResponseEntity.ok(service.save(masterDto));
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping("/getById")
    ResponseEntity<?> getById(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(service.findById(id));
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping("/getAll")
    ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.ok(service.getAll());
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
