package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void testRemainWhenAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        Assert.assertEquals(100, result);
    }

    @Test
    public void testRemainWhenAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        Assert.assertEquals(0, result); // Это тест, который должен упасть
    }
}