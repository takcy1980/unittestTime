/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fontys.time;

import static java.lang.System.gc;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 310054544
 */
public class TimeTest {

    Time instance;
        
    public TimeTest() {

    }
    
    @BeforeClass
    public static void setUpClass() {
       
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Time(2015, 2, 25, 8, 25);

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Today's date is 
     */
    @Test
    public void testGetDayInWeek() {
        System.out.println("getDayInWeek");
        //Time instance = new Time(2015, 2, 25, 8, 25);
        DayInWeek expResult  = DayInWeek.WED;
        DayInWeek result = instance.getDayInWeek();
        assertEquals(expResult, result);

    }

    /**
     * Test of getYear method, of class Time.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        //Time instance = null;
        int expResult = 2015;
        int result = instance.getYear();
        assertEquals(expResult, result);

    }

    /**
     * Test of getMonth method, of class Time.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");

        int expResult = 2;
        int result = instance.getMonth();
        assertEquals(expResult, result);

    }

    /**
     * Test of getDay method, of class Time.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");

        int expResult = 25;
        int result = instance.getDay();
        assertEquals(expResult, result);

    }

    /**
     * Test of getHours method, of class Time.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");

        int expResult = 8;
        int result = instance.getHours();
        assertEquals(expResult, result);

    }

    /**
     * Test of getMinutes method, of class Time.
     */
    @Test
    public void testGetMinutes() {
        System.out.println("getMinutes");

        int expResult = 25;
        int result = instance.getMinutes();
        assertEquals(expResult, result);

    }

    /**
     * Test of plus method, of class Time.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        int minutes = 10;
        Time newTime = new Time(2015, 2, 25, 8, 35);
        ITime expResult = newTime;
        ITime result = instance.plus(minutes);
        //assertTrue(expResult.equals(result));
        assertEquals(expResult.getMinutes(), result.getMinutes());
   
        
        
  

    }

    /**
     * Test of compareTo method, of class Time.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        ITime t = new Time(2015, 2, 25, 13, 25);

        int expResult = 1;
        int result = instance.compareTo(t);
        assertEquals(expResult, result);

    }

    /**
     * Test of difference method, of class Time.
     */
    @Test
    public void testDifference() {
        System.out.println("difference");
        ITime time = new Time(2015, 2, 25, 10, 25);
        int expResult = 2;
        int result = instance.difference(time);

    }
    
}
