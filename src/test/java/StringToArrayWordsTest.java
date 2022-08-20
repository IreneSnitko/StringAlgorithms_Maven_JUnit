import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToArrayWordsTest {

    StringToArrayWords saw;

    @BeforeEach
    void setUp() {
        saw = new StringToArrayWords();
    }

    @Order(1)
    @Test
    public void testStringToArrayWords_manyWordsOneEndMark() {

        String[] expectedResult = new String[]{"What", "does", "a", "QA", "engineer", "do"};

        String[] actualResult = saw.getArrayWordsFromString("  What does a   QA   engineer do?  ");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testStringToArrayWords_directSpeech() {

        String[] expectedResult = new String[]{
                "She", "said", "Stay", "After", "the", "words", "of", "the", "author"
                };

        String[] actualResult = saw.getArrayWordsFromString(
                "  She said: \"Stay!\" -   After   the words of the author ."
                );

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStringToArrayWords_oneWordEndMarks() {

        String[] expectedResult = new String[]{"Yes"};

        String[] actualResult = saw.getArrayWordsFromString("  Yes...?!!!? ");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testStringToArrayWords_oneWordEndMarksWithSpaces() {

        String[] expectedResult = new String[]{"No"};

        String[] actualResult = saw.getArrayWordsFromString("No   !!!?!..");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testStringToArrayWords_twoWordsEndAmpersand() {

        String[] expectedResult = new String[]{"Dolce", "Gabbana"};

        String[] actualResult = saw.getArrayWordsFromString("Dolce&Gabbana");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(9)
    @Test
    public void testStringToArrayWords_twoWordsEndAmpersandWithSpaces() {

        String[] expectedResult = new String[]{"Dolce", "Gabbana"};

        String[] actualResult = saw.getArrayWordsFromString("Dolce    & Gabbana");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(10)
    @Test
    public void testStringToArrayWords_twoWordsEndAmpersandWithOneSpace() {

        String[] expectedResult = new String[]{"Dolce", "Gabbana"};

        String[] actualResult = saw.getArrayWordsFromString("Dolce &Gabbana");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testStringToArrayWords_colonInMiddle() {

        String[] expectedResult = new String[]{
                "We", "have", "to", "buy", "the", "following", "things", "bread", "butter", "milk", "a", "cake"
                };

        String[] actualResult = saw.getArrayWordsFromString(
                "We have to buy the following things: bread, butter, milk, a cake."
                );

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testStringToArrayWords_dashesInMiddleAndSpaces() {

        String[] expectedResult = new String[]{"Here", "is", "merry", "go", "round"};

        String[] actualResult = saw.getArrayWordsFromString("Here is merry   -go- round!");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testStringToArrayWords_percentSignsInMiddle() {

        String[] expectedResult = new String[]{"cities", "55", "countries", "43"};

        String[] actualResult = saw.getArrayWordsFromString("  ...cities: 55 %, countries: 43 %...");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToArrayWords_stringIsNull() {

        String[] expectedResult = new String[]{};

        String[] actualResult = saw.getArrayWordsFromString(null);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToArrayWords_stringIsEmpty() {

        String[] expectedResult = new String[]{};

        String[] actualResult = saw.getArrayWordsFromString("");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToArrayWords_onlySpaces() {

        String[] expectedResult = new String[]{};

        String[] actualResult = saw.getArrayWordsFromString(" ");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}