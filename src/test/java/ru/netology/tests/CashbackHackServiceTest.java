package ru.netology.tests;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import ru.netology.service.CashbackHackService;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain1() {

        assertEquals(service.remain(900),100);
    }

    @Test
    public void testRemain2() {

        assertEquals(service.remain(1000),0);

    }
    @Test
    public void testRemain3() {

        assertEquals(service.remain(0),1000);

    }

    @Test
    public void testRemain4() {

        assertEquals(service.remain(-1),1001);

    }
    @Test
    public void testRemain5() {

        assertEquals(service.remain(1),999);

    }

}