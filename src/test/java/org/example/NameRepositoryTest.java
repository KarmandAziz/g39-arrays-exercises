package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameRepositoryTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getSize() {
        int expectedSize = 0;
        int actualSize = NameRepository.getSize();

        assertEquals(actualSize, expectedSize);
    }

    @Test
    public void setNames() {
        String[] data = {"Karmand Aziz"};
        int expectedSize = 1;

        NameRepository.setNames(data);
        assertEquals(NameRepository.getSize(), expectedSize);

    }

    @Test
    public void clear() {
        String[] data = {"Karmand Aziz"};
        int expectedSize = 0;

        NameRepository.clear();
        assertEquals(NameRepository.getSize(), expectedSize);
    }

    @Test
    public void findAll() {
        String[] expected = {"Karmand Aziz"};

        NameRepository.setNames(expected);
        String[] result = NameRepository.findAll();

        assertArrayEquals(result,expected);
    }

    @Test
    public void find() {
    }

    @Test
    public void add() {
    }
}