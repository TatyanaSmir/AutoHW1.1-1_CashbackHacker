package ru.netology.tests;


import org.junit.Test;
import ru.netology.service.CashbackHackService;
import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public  void testRemain1(){
        assertEquals(100,service.remain(900));
    }
    @Test
    public  void testRemain2(){
        assertEquals(1,service.remain(999));
    }

    @Test
    public  void testRemain3(){
        assertEquals(0,service.remain(1000));
    }

    @Test
    public  void testRemain4(){
        assertEquals(1001,service.remain(-1));
    }



    }
