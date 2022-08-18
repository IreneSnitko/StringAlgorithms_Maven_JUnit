import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringToArrayNumbersTest {

    StringToArrayNumbers san;

    @BeforeEach
    void setUp() {
        san = new StringToArrayNumbers();
    }

    @Order(1)
    @Test
    public void testStringToArrayNumbers_oneDigitNumbers() {

        String str = "1,2,3,4, 5";

        int[] expectedResult = new int[]{1, 2, 3, 4, 5};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToArrayNumbers_onlyNumbers() {

        String str = "1234567890";

        int[] expectedResult = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToArrayNumbers_onlyZero() {

        String str = "000";

        int[] expectedResult = new int[]{0, 0, 0};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToArrayNumbers_manyDigitNumbers() {

        String str = "100 4562  35890, 4, -95";

        int[] expectedResult = new int[]{1, 0, 0, 4, 5, 6, 2, 3, 5, 8, 9, 0, 4, 9, 5};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToArrayNumbers_numbersLettersSigns() {

        String str = "  ab1/2  &&&[] MA3: 4? - -5    ";

        int[] expectedResult = new int[]{1, 2, 3, 4, 5};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToArrayNumbers_onlyLettersSigns() {

        String str = "@#AB!,cdEFgK.lm...n";

        int[] expectedResult = new int[]{};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToArrayNumbers_stringIsEmpty() {

        String str = "";

        int[] expectedResult = new int[]{};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToArrayNumbers_onlySpaces() {

        String str = "      ";

        int[] expectedResult = new int[]{};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToArrayNumbers_stringIsNull() {

        String str = null;

        int[] expectedResult = new int[]{};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}