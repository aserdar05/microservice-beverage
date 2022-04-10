package guru.springframework.microservicebeverage.services;

import guru.springframework.microservicebeverage.web.model.BeverageDto;

import java.util.UUID;

public interface BeverageService {
    BeverageDto getBeverageById(UUID beverageId);

    BeverageDto saveNewBeverage(BeverageDto beverageDto);

    void updateBeverage(UUID beverageId, BeverageDto beverageDto);

    void deleteById(UUID beverageId);
}
