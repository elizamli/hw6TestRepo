package edu.cmu.cs.cs214.test1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ExactSameClassTest {
    private ExactSameClass p;
    @Before
    public void setUp(){
        this.p = new ExactSameClass(1);
    }

    @Test
    public void testRemoveMeeple(){
        assertEquals(7, p.getMeepleCount());
        p.removeMeeple();
        assertEquals(6, p.getMeepleCount());
    }

    @Test
    public void testRestoreMeeples(){
        p.removeMeeple();
        p.removeMeeple();
        p.removeMeeple();
        assertEquals(4, p.getMeepleCount());
        p.restoreMeeples(1);
        assertEquals(5, p.getMeepleCount());
        p.restoreMeeples(2);
        assertEquals(7, p.getMeepleCount());
    }

    @Test
    public void testUpdateScore(){
        assertEquals(0, p.getScore());
        p.updateScore(12);
        assertEquals(12, p.getScore());
    }
}
