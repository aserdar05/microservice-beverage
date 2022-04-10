package guru.springframework.microservicebeverage.web.controller;

import guru.springframework.microservicebeverage.web.model.BeverageDto;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Validated//Do validation on method input parameters
@RestController
@RequestMapping("/api/v1/beverage")
public class BeverageController {
    @GetMapping("/{beverageId}")
    public ResponseEntity<BeverageDto> getBeverageById(@NotNull @PathVariable("beverageId") UUID beverageId){

        return new ResponseEntity<>(BeverageDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeverage(@Valid @NotNull @RequestBody BeverageDto beverageDto){

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beverageId}")
    public ResponseEntity updateBeverage(@PathVariable("beverageId") UUID beverageId, @Valid @RequestBody BeverageDto beverageDto){

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
