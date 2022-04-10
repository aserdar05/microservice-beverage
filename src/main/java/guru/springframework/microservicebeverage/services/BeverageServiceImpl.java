package guru.springframework.microservicebeverage.services;

import guru.springframework.microservicebeverage.web.model.BeverageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeverageServiceImpl implements BeverageService {
    @Override
    public BeverageDto getBeverageById(UUID beverageId) {
        return BeverageDto.builder().id(UUID.randomUUID())
                .beverageName("Galaxy Cat")
                .beverageStyle("Pale Ale")
                .build();
    }

    @Override
    public BeverageDto saveNewBeverage(BeverageDto beverageDto) {
        return BeverageDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeverage(UUID beverageId, BeverageDto beverageDto) {
        //todo impl - would add a real impl to update beer
    }

    @Override
    public void deleteById(UUID beverageId) {
        log.debug("Deleting a beverage...");
    }
}
