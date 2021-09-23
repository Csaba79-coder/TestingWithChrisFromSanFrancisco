package com.sfj.testing;

import static org.junit.Assert.*;

import org.junit.*;

import java.util.NoSuchElementException;

public class TestList {

    List testPeople = new List();

    @BeforeClass
    public static void setUp() {
        System.out.println("The test is running ...");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("The whole test's been finished!");
    }

    @Before
    public void init() {
        testPeople.add("Gyula");
        testPeople.add("Gizi");
    }

    @Test
    public void testSize() {
        assertEquals("Size checking", 2, testPeople.size());
    }

    @Test
    public void testAdd() {
        testPeople.add("Jani");
        assertEquals("Adding new person checking", 3, testPeople.size());
    }

    @Test
    public void testIsEmpty() {
        // assertEquals("Empty or not?", false, testPeople.isEmpty());
        assertFalse(testPeople.isEmpty());
    }

    @Test (expected = NoSuchElementException.class)
    public void testRemove() {
        testPeople.remove("Norbi");
    }

    @Test
    public void testRemoveAll() {
        testPeople.removeAll();
        assertTrue(testPeople.isEmpty());
    }

    @After
    // public void tearDown
    public void destroy() {
        testPeople.removeAll();
    }
}
