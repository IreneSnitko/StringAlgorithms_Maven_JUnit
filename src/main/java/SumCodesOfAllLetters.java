public class SumCodesOfAllLetters {

    /*
    Create an algorithm, accepting the string
    and returns the sum of the ASCII codes
    of all the english letters of this string
    */

    public int getSumASCIICodesOfLetters(String str) {
        int sum = 0;
        final String ERROR = "Error! You entered the empty line";

        if (str != null && str.length() != 0 && str.trim().length() > 0) {
            str = str.trim();

            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) > 64 && str.charAt(i) < 91)
                        || (str.charAt(i) > 96 && str.charAt(i) < 123)
                ) {
                    sum = sum + str.charAt(i);
                }
            }
        }
        else {
            sum = Integer.MIN_VALUE;
            System.out.println(ERROR);
        }

        return sum;
    }
}