package guru.springframework.microservicebeverage.web.controller;

import guru.springframework.microservicebeverage.web.model.BeverageDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beverage")
public class BeverageController {
    @GetMapping("/{beverageId}")
    public ResponseEntity<BeverageDto> getBeverageById(@PathVariable("beverageId") UUID beverageId){

        return new ResponseEntity<>(BeverageDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeverage(@RequestBody BeverageDto beverageDto){

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beverageId}")
    public ResponseEntity updateBeverage(@PathVariable("beverageId") UUID beverageId, @RequestBody BeverageDto beverageDto){

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
