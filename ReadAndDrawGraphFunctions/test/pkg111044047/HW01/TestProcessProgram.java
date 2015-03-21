/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg111044047.HW01;

import java.awt.Dimension;
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
public class TestProcessProgram {
    
    private ProcessProgram prg ;
    private String[] data={"sin(x), -6.0,+4.0,RED","x,-6.0,+3.0,green","d(x),4,5,BLUE",
        "log(x),0,+5,yellow","exp(x),-3,3,ORANGE","ln(x),4,5,granit",
                                                "cos(x),-4.2,5.6,MAGENTA"    };
    private boolean[] valid = {true,true,false,true,true,false,true};
    
    public TestProcessProgram() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         prg = new ProcessProgram();
    }
    
    @After
    public void tearDown() {
        
    }
    @Test
    public void TestCreateFunctions() {
        assertEquals(5, prg.createFunctions(data, valid)); 
    }
    @Test
    public void TestCreateGraphFrame_GetFrame() {
        assertEquals(null, prg.getFrame()); 
        prg.createGraphFrame();
        assertNotNull(null, prg.getFrame()); 
        
    }
     @Test
    public void TestSetSizeId_GetFrame() {
        prg.setSizeId(2); // Frame size 612 X 630 olmali.
        prg.createGraphFrame();
        assertEquals(new Dimension(612, 630), prg.getFrame().getSize()); 
        
    }
}
