package ru.netology.service;
import org.junit.Test;
import org.junit.Assert;


public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemainFor900 () {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 900;
        int actual = cashback.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateRemainFor1400 () {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1400;
        int actual = cashback.remain(amount);
        int expected = 600;
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void shouldCalculateRemainFor2650 () {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 2650;
        int actual = cashback.remain(amount);
        int expected = 350;
        Assert.assertEquals(actual,expected);
    }
}
