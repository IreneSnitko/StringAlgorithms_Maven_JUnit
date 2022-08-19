public class StringBetweenLetters {

    /*
    Create an algorithm, accepting the string
    and returns the string between
    the first and last given letter
    */

    public String findStringBetweenLetters(String str, String letter) {
        String Error = "Error! Enter the text, please";

        if (str != null && str.length() != 0 && str.trim().length() > 0) {
            str = str
                    .substring(str.indexOf(letter), str.lastIndexOf(letter))
                    .concat(letter)
                    .replaceAll("\\s{2}", "");
        }
        else {

            return Error;
        }

        return str;
    }
}