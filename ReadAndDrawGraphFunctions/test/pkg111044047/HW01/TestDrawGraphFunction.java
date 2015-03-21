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
public class TestDrawGraphFunction {
    
    private DrawGraphFunction graph;
    public TestDrawGraphFunction() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        graph = new DrawGraphFunction();
    }
    
    
    @After
    public void tearDown() {
    }
     @Test
    public void testGetGraphRange() {
        assertEquals(5, graph.getGraphRange(),0);
       
    }
    
    @Test
    public void testSetGraphRange() {
        graph.setGraphRange(6.7);
        assertEquals(6.7, graph.getGraphRange(),0);
    }
    
    @Test
    public void testSetSizeX() {
        graph.setSizeX(455);
        assertEquals(new Dimension(455,400), graph.getSize());
    }
    
    @Test
    public void testSetSizeY() {
        graph.setSizeY(458);
        assertEquals(new Dimension(400,458), graph.getSize());
    }
}
