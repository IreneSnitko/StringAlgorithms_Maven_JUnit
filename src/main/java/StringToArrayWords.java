public class StringToArrayWords {

    /*
    Create an algorithm,accepting the string,
    containing a sentence and returns
    an array of only words from this sentence,
    without punctuation marks
    */

    public String[] getArrayWordsFromString(String str) {
        String[] arr;
        final String ERROR = "Error! Enter the sentence please";

        if (str != null && str.length() != 0 && str.trim().length() > 0) {

            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) > 32 && str.charAt(i) < 48)
                        || (str.charAt(i) > 57 && str.charAt(i) < 65)
                        || (str.charAt(i) > 90 && str.charAt(i) < 97)
                        || (str.charAt(i) > 122 && str.charAt(i) < 188)
                ) {
                    str = str
                            .replace(str.charAt(i), ' ');
                }
            }

            str = str
                    .trim()
                    .replaceAll("\\s+", " ");

            arr = str.split(" ");
        }
        else {
            arr = new String[]{};
            System.out.println(ERROR);
        }

        return arr;
    }
}
