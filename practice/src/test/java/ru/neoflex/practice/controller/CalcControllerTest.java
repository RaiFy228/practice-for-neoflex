package ru.neoflex.practice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CalcControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test //Тест суммы калькулятора
    public void plus() throws Exception{
        mockMvc.perform(get("/plus/1/2"))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("3")));
    }

    @Test //Тест разности калькулятора
    public void minus() throws Exception{
        mockMvc.perform(get("/minus/1/3"))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("-2")));
    }
}