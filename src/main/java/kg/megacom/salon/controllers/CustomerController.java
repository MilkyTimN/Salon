package kg.megacom.salon.controllers;

import io.swagger.annotations.Api;
import kg.megacom.salon.configurations.Swagger2Configuration;
import kg.megacom.salon.models.dtos.CustomerDto;
import kg.megacom.salon.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@Api(tags = Swagger2Configuration.CUSTOMER)
public class CustomerController {

    private final CustomerService service;

    @Autowired
    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @PostMapping("/save")
    ResponseEntity<?> save(@ModelAttribute CustomerDto customerDto) {
        try{
            return ResponseEntity.ok(service.save(customerDto));
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
        try {
            return ResponseEntity.ok(service.getAll());
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
