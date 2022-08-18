public class OnlyNumbersInString {

    /*
    Create an algorithm, accepting the string
    and returns everything except the numbers
    */

    public String getStringToOnlyNumbers(String str) {

        if (str != null) {

            for (int i = 0; i < str.length(); i++) {

                if ((str.charAt(i) > 31 && str.charAt(i) < 48)
                    || (str.charAt(i) > 57 && str.charAt(i) < 128))
                {
                    str = str.replace(str.charAt(i), '-');
                }
            }
        }
        else {
            str = "";
        }
        str = str.replace("-", "");
        str = str.trim();

        return str;
    }
}
