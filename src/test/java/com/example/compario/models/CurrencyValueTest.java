package com.example.compario.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
