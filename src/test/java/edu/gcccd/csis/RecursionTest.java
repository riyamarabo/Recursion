package edu.gcccd.csis;


import org.junit.Test;
import java.util.Random;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RecursionTest {

    @Test
    public void printEveryOther()
    {
        int [] testArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        //testing it'll return correct values using different array elements
        assertEquals("2468", Recursion.printEveryOther(testArray, 2));

        //testing it'll return correct values using different base case
        assertEquals("1357", Recursion.printEveryOther(testArray, 3));

        //testing it'll return correct values using different base case
        assertEquals("13579", Recursion.printEveryOther(testArray, 1));

        //testing it'll return correct values using different base case
        assertEquals("246810", Recursion.printEveryOther(testArray, 0));

        //testing it catches illegalArgument Exception
        try {
            Recursion.printEveryOther(testArray, -1); // stackoverflow
            fail();
        } catch (IllegalArgumentException error) {
            assertTrue(true);
        }

        //testing it catches a NullPointerException
        testArray = null;
        try {
            Recursion.printEveryOther(testArray, 0); // stackoverflow
            fail();
        } catch (NullPointerException error) {
            assertTrue(true);
        }

    }

    @Test
    public void printStars()
    {
        //testing that it placed the * at the right index
        String s = "coordination";
        assertEquals(2,Recursion.printStars(s).indexOf("*"));

        //testing that it can catch a null string
        s = null;
        assertNull(Recursion.printStars(s));

        //testing that it'll return the same string value if no duplicates are found
        s = "h";
        assertEquals("h", Recursion.printStars(s));

        //testing that it'll return an empty string if no characters are at all found
        s = "";
        assertEquals("", s);
    }

    @Test
    public void sum() {
        for (int i = 0; i < 10; i++) {
            int k = new Random().nextInt(100);
            assertEquals(k * (k + 1) / 2, Recursion.sum(k));
        }
        // corner cases
        assertEquals(0, Recursion.sum(-1));
        assertEquals(0, Recursion.sum(0));
        try {
            int x = Recursion.sum(Integer.MAX_VALUE); // stackoverflow
            fail();
        } catch (StackOverflowError error) {
            assertTrue(true);
        }
    }
}

