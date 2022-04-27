package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    void shouldRemain10of1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 10;
        int actual = service.remain(990);
        assertEquals(expected, actual);
    }

    @Test
    void shouldRemain900of1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(100);
        assertEquals(expected, actual);
    }
}