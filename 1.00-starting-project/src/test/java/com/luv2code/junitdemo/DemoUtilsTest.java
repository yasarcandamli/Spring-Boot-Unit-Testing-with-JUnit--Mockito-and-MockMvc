package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
    }

    @Test
    //@DisplayName("Equals and Not Equals")
    void testEqualsAndNotEquals() {

        assertEquals(6, demoUtils.add(2, 4), "2 + 4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "1 + 9 must not be 8");
    }

    @Test
    //@DisplayName("Null and Not Null")
    void testNullAndNotNull() {

        String str1 = null;
        String str2 = "luv2code";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

/*
    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Running @AfterEach");
        System.out.println();
    }

    // @BeforeAll and @AfterAll methods must be static
    @BeforeAll
    static void setupBeforeAllClass() {
        System.out.println("@BeforeAll executes only once before all test methods execution in the class");
        System.out.println();
    }

    @AfterAll
    static void tearDownBeforeAllClass() {
        System.out.println("@AfterAll executes only once before all test methods execution in the class");
    }
*/
}
