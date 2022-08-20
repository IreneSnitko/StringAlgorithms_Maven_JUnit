import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class FullNameToArrayTest {

    FullNameToArray fn;

    @BeforeEach
    void setUp() {
        fn = new FullNameToArray();
    }

    @Order(1)
    @Test
    public void testFullNameToArray_happyPathThreeWords() {

        String[] expectedResult = new String[]{
                "First name: Sarah", "Middle name: Jessica", "Surname: Parker"
                };

        String[] actualResult = fn.getArrayFromFullName("Sarah Jessica Parker");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testFullNameToArray_threeWordsWithExtraSpaces() {

        String[] expectedResult = new String[]{
                "First name: Dominick", "Middle name: Jacob", "Surname: Spencer"
        };

        String[] actualResult = fn.getArrayFromFullName("   Dominick    Jacob Spencer");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testFullNameToArray_SpacesInMiddleOfWord() {

        String[] expectedResult = new String[]{};

        String[] actualResult = fn.getArrayFromFullName("Rudolf S i m s");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testFullNameToArray_twoWordsAndHyphens() {

        String[] expectedResult = new String[]{
                "First name: Wilfred", "Middle name: ---", "Surname: Atkinson"
        };

        String[] actualResult = fn.getArrayFromFullName("Wilfred --- Atkinson");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testFullNameToArray_twoWords() {

        String[] expectedResult = new String[]{};

        String[] actualResult = fn.getArrayFromFullName("Wilfred Atkinson");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testFullNameToArray_oneWord() {

        String[] expectedResult = new String[]{};

        String[] actualResult = fn.getArrayFromFullName("   susan");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testFullNameToArray_oneLetter() {

        String[] expectedResult = new String[]{};

        String[] actualResult = fn.getArrayFromFullName("A");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testFullNameToArray_oneMark() {

        String[] expectedResult = new String[]{};

        String[] actualResult = fn.getArrayFromFullName("!");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testFullNameToArray_stringIsEmpty() {

        String[] expectedResult = new String[]{};

        String[] actualResult = fn.getArrayFromFullName("");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testFullNameToArray_stringIsNull() {

        String[] expectedResult = new String[]{};

        String[] actualResult = fn.getArrayFromFullName(null);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testFullNameToArray_onlySpaces() {

        String[] expectedResult = new String[]{};

        String[] actualResult = fn.getArrayFromFullName("              ");

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}