/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg111044047.HW01;

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
public class TestReadAndDisplay {
    
    private ReadAndDisplay prg;
    private String fileName ="C:\\Users\\ATPSOFTWARE\\Desktop\\functions.txt";
    public TestReadAndDisplay() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        prg = new ConsoleProgramControl();
         prg.setFileName(fileName);
          prg.readFile();
    }
    
    @After
    public void tearDown() {
    }

    @Test
     public void testReadLine__GetReadingData(){
         assertEquals(7, prg.getReadingData().length);
         assertEquals(7, prg.getIsValidData().length);
     }
     @Test
     public void testGetFileName(){
         assertEquals(fileName, prg.getFileName());
     }
     
     @Test
     public void testIsValidNums(){
         assertEquals(5, prg.isValidNums());
     }
     
     @Test
     public void testUnValidNums(){
         assertEquals(2, prg.unValidNums());
     }
  
}
