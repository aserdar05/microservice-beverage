package guru.springframework.microservicebeverage.web.mappers;

import guru.springframework.microservicebeverage.domain.Beverage;
import guru.springframework.microservicebeverage.web.model.BeverageDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeverageMapper {
    BeverageDto beverageToBeverageDto(Beverage beverage);
    Beverage beverageDtoToBeverage(BeverageDto beverageDto);
}
