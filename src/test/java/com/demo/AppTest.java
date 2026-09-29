package com.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void addsTwoNumbers() {
        assertEquals(5, App.add(2, 3));
    }
}
