package com.example.compario.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyValueTest {

    private CurrencyValue currencyValue;

    @BeforeEach
    void setup() {
        this.currencyValue = new CurrencyValue(123, "Description");
    }

    @Test
    void shouldCreateValueWithTwoParametersInConstructor() {
        CurrencyValue newCurrencyValue = new CurrencyValue(123, "Description");
        assertEquals(currencyValue, newCurrencyValue);
    }

}
