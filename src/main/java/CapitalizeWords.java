public class CapitalizeWords {

    /*
    Create an algorithm, accepting the string
    containing a sentence with words without spaces
    and returns this sentence with all the words
    with a capital letter
    */

    public String getCapitalLetters(String str) {

        if (str != null && str.length() != 0 && str.trim().length() > 1) {
            str = str
                    .trim()
                    .replaceAll("\\s+", " ");

            str = str.substring(0, 1).toUpperCase()
                    .concat(
                    str.substring(1)
                    );

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    str = str.substring(0, i + 1)
                            .concat(
                            str.substring(i + 1, i + 2).toUpperCase()
                            )
                            .concat(
                            str.substring(i + 2)
                            );
                }
            }

            return str;
        }
        else {

            return "";
        }
    }
}