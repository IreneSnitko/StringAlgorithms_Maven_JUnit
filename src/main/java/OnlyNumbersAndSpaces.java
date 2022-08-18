public class OnlyNumbersAndSpaces {

    /*
    Create an algorithm, accepting the string
    and returns everything except
    the numbers and spaces
    */

    public String getStringToOnlyNumbersAndSpaces(String str) {

        if (str != null) {

            for (int i = 0; i < str.length(); i++) {

                if ((str.charAt(i) > 0 && str.charAt(i) < 32)
                        || (str.charAt(i) > 32 && str.charAt(i) < 48)
                        || (str.charAt(i) > 57 && str.charAt(i) < 128)
                ) {
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
