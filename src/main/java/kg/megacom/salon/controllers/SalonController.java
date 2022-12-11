package kg.megacom.salon.controllers;

import io.swagger.annotations.Api;
import kg.megacom.salon.configurations.Swagger2Configuration;
import kg.megacom.salon.models.dtos.SalonDto;
import kg.megacom.salon.services.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/salon")
@Api(tags = Swagger2Configuration.SALON)
public class SalonController {

    private final SalonService service;

    @Autowired
    public SalonController(SalonService service) {
        this.service = service;
    }

    @PostMapping("/save")
    ResponseEntity<?> save (@RequestBody SalonDto salonDto) {
        try {
            return ResponseEntity.ok(service.save(salonDto));
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
    ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.ok(service.getAll());
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
