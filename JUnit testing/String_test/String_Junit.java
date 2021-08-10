import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String_Junit {

    @Test
    void Length() {
        int Stringlength="Collin".length();

        //The length of collin is 6
        int test_lenngth=6;

        //the assertEquals will test is collin is equal to 6
        assertEquals(test_lenngth,Stringlength);
    }

    @Test
    public void CharAt() {
        //
        String name = "Collin";

        //The assertEquals will test if the charAT is the in line with correct letter
        assertEquals( name.charAt(0), 'C' );

        assertEquals( name.charAt(1), 'o' );

        assertEquals( name.charAt(2), 'l' );

        assertEquals( name.charAt(3), 'l' );

        assertEquals( name.charAt(4), 'i' );

        assertEquals( name.charAt(5), 'n' );
    }


    @Test
    public void indexOftest(){

        String name = "Collin";

        //A letter in the name collin
        String characterWanted = "i";

        int actual = 4;

        //Index 4 should return the letter i
        int expected = name.indexOf(characterWanted);

        //assertEquals will test if i is in idex 4
        assertEquals(expected, actual);
    }

    @Test
    public void  substring(){

        //assertTrue will return true if the word fun is found in the sentence
        assertTrue("Coding is fun".contains("fun"));
    }
}