package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void add() throws Exception {
        Main m = new Main();
        assertEquals(2, m.add(1, 1), 0);
        assertEquals(5, m.add(2, 3), 0);
    }
}