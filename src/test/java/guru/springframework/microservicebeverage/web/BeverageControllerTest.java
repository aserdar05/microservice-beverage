package guru.springframework.microservicebeverage.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.microservicebeverage.web.controller.BeverageController;
import guru.springframework.microservicebeverage.web.model.BeverageDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BeverageController.class)
class BeverageControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getBeverageById() throws Exception {

        mockMvc.perform(get("/api/v1/beverage/" + UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

    @Test
    void saveNewBeverage() throws Exception {
        BeverageDto beverageDto = BeverageDto.builder().build();
        String beverageDtoJson = objectMapper.writeValueAsString(beverageDto);

        mockMvc.perform(post("/api/v1/beverage/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(beverageDtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void updateBeverageById() throws Exception {

        BeverageDto beverageDto = BeverageDto.builder().build();
        String beverageDtoJson = objectMapper.writeValueAsString(beverageDto);

        mockMvc.perform(put("/api/v1/beverage/" + UUID.randomUUID().toString())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(beverageDtoJson))
                .andExpect(status().isNoContent());
    }
}