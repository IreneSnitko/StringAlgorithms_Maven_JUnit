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
    public void StringToArrayNumberTestOneDigitNumbers() {

        String str = "1,2,3,4, 5";

        int[] expectedResult = new int[]{1, 2, 3, 4, 5};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void StringToArrayNumberTestOnlyNumbers() {

        String str = "1234567890";

        int[] expectedResult = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void StringToArrayNumberTestOnlyZero() {

        String str = "000";

        int[] expectedResult = new int[]{0, 0, 0};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void StringToArrayNumberTestManyDigitNumbers() {

        String str = "100 4562  35890, 4, -95";

        int[] expectedResult = new int[]{1, 0, 0, 4, 5, 6, 2, 3, 5, 8, 9, 0, 4, 9, 5};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void StringToArrayNumberTestNumbersLettersSigns() {

        String str = "  ab1/2  &&&[] MA3: 4? - -5    ";

        int[] expectedResult = new int[]{1, 2, 3, 4, 5};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void StringToArrayNumberTestOnlyLettersSigns() {

        String str = "@#AB!,cdEFgK.lm...n";

        int[] expectedResult = new int[]{};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void StringToArrayNumberTestStringIsEmpty() {

        String str = "";

        int[] expectedResult = new int[]{};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void StringToArrayNumberTestOnlySpaces() {

        String str = "      ";

        int[] expectedResult = new int[]{};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void StringToArrayNumberTestNullString() {

        String str = null;

        int[] expectedResult = new int[]{};

        int[] actualResult = san.getArrayIntegersFromString(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
