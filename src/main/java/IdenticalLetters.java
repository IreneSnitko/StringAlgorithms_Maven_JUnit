public class IdenticalLetters {

    /*
    Create an algorithm, accepting the word
    and returns `true` if it starts
     and ends with the same the letter,
     but `false` - if otherwise
    */

    public boolean isLettersAreSame(String str) {
        boolean e = false;
        final String ERROR = "Error! Enter the text please";

        if (str != null && str.length() != 0 && str.trim().length() > 0) {
            str = str
                    .trim()
                    .toLowerCase()
                    .replaceAll("\\s{2}", "");

            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                e = true;
            } else {
                e = false;
            }
        } else {
            e= false;
            System.out.println(ERROR);
        }

        return e;
    }
}