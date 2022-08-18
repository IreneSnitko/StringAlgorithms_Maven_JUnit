public class OnlyLetters {

    /*
    Create an algorithm, accepting the string
    and returns only letters
    */

    public String getStringToOnlyLetters(String str) {

        if (str != null) {
            for (int i = 0; i < str.length(); i++) {

                if ((str.charAt(i) > 0 && str.charAt(i) < 65)
                        || (str.charAt(i) > 90 && str.charAt(i) < 97)
                        || (str.charAt(i) > 122 && str.charAt(i) < 128))
                {
                    str = str.replace(str.charAt(i), '-');
                }
            }
        }
        else {
            str = "";
        }
        str = str.replace("-", "");

        return str.trim();
    }
}