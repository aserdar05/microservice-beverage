package guru.springframework.microservicebeverage.web.mappers;

import guru.springframework.microservicebeverage.domain.Beverage;
import guru.springframework.microservicebeverage.domain.Customer;
import guru.springframework.microservicebeverage.web.model.BeverageDto;
import guru.springframework.microservicebeverage.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);
}
