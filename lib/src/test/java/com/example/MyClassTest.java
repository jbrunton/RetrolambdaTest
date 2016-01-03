package com.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyClassTest {
    @Test
    public void testArithmetic() throws Exception {
        assertThat(1 + 1).isEqualTo(2);
    }
}
