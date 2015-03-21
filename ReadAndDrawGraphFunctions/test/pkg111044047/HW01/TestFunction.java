
package pkg111044047.HW01;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author ATPSOFTWARE
 */
public class TestFunction {
    Function func1,func2,func3;
    String data ="sin(x), -6.0,+4.0,RED";
    
    public TestFunction() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        func1 = new Function(data);
    }
    
    @After
    public void tearDown() {
        
    }

 
     @Test
     public void testGetFuncName() {
         assertEquals("sin(x)",func1.getName());
     }
     
      @Test
     public void testGetFuncRange0() {
         assertEquals(-6.0,func1.getRange0(),0);
     }
       @Test
     public void testGetFuncRange1() {
         assertEquals(+4.0,func1.getRange1(),0);
     }
     
      @Test
     public void testGetFuncGraphColor() {
         assertEquals("RED",func1.getGraphColor());
     }
     
        @Test
     public void testGetFuncId() {
         assertEquals(0,func1.getFuncId());
     }
     
       @Test
     public void testEditingRangeSmallestThanGreater() {
         func2 = new Function("sin(x),6,-3.5,BLUE");
         assertEquals(-3.5,func2.getRange0(),0);
         assertEquals(6,func2.getRange1(),0);
     }
     
     @Test
     public void testDefaultConstructor(){
             func3 = new Function();
         assertEquals(0,func3.getFuncId());
         assertEquals("sin(x)",func3.getName());
         assertEquals(-5,func3.getRange0(),0);
         assertEquals(5,func3.getRange1(),0);
         assertEquals("BLACK",func3.getGraphColor());
     }
     
     }
