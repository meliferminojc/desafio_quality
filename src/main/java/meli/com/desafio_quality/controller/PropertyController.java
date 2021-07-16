package meli.com.desafio_quality.controller;

import meli.com.desafio_quality.dto.form.PropertyForm;
import meli.com.desafio_quality.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/property")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?> getProperties(@PathVariable Long id) {
        return ResponseEntity.ok(propertyService.findOne(id));
    }

    @GetMapping("/value/{id}")
    public ResponseEntity<?> getPropertyValue(@PathVariable Long id) {
        return ResponseEntity.ok(propertyService.propertyValue(id));
    }

    @GetMapping("/bigger-room/{id}")
    public ResponseEntity<?> getBiggerRoom(@PathVariable Long id) {
        return ResponseEntity.ok(propertyService.biggerRoom(id));
    }

    @PostMapping("/create")
    public ResponseEntity<?> createProperty(@RequestBody @Valid PropertyForm propertyForm) {
        return ResponseEntity.status(HttpStatus.CREATED).body(propertyService.saveProperty(propertyForm));
    }

}
