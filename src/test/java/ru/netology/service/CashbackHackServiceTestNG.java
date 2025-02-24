package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTestNG {
    @Test
    public void testRemainWhenAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        Assert.assertEquals(result, 100);
    }

    @Test
    public void testRemainWhenAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        Assert.assertEquals(result, 0); // Это тест, который должен упасть
    }
}
