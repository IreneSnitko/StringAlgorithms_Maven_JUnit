import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumCodesOfAllLettersTest {

    SumCodesOfAllLetters scl;

    @BeforeEach
    void setUp() {
        scl = new SumCodesOfAllLetters();
    }

    @Order(1)
    @Test
    public void testSumCodesOfAllLetters_happyPathOnlyWords() {

        int expectedResult = 1567;

        int actualResult = scl.getSumASCIICodesOfLetters("No man is an island");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSumCodesOfAllLetters_happyPathWordsWithNumbersAndMarks() {

        int expectedResult = 1751;

        int actualResult = scl.getSumASCIICodesOfLetters(
                "    View (previous 50% | next 50%) (20 | 50 | 100 | 250 | 500) "
                    );

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testSumCodesOfAllLetters_oneLetter() {

        int expectedResult = 100;

        int actualResult = scl.getSumASCIICodesOfLetters("d");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumCodesOfAllLetters_oneMark() {

        int expectedResult = 0;

        int actualResult = scl.getSumASCIICodesOfLetters("+");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumCodesOfAllLetters_stringIsNull() {

        int expectedResult = -2147483648;

        int actualResult = scl.getSumASCIICodesOfLetters(null);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumCodesOfAllLetters_stringIsEmpty() {

        int expectedResult = -2147483648;

        int actualResult = scl.getSumASCIICodesOfLetters("");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumCodesOfAllLetters_onlySpaces() {

        int expectedResult = -2147483648;

        int actualResult = scl.getSumASCIICodesOfLetters("     ");

        Assertions.assertEquals(expectedResult, actualResult);
    }
}