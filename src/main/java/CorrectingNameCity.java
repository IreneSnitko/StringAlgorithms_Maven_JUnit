public class CorrectingNameCity {

    /*
    Create an algorithm, accepting the string
    and returns corrected the city name
    */

    private String fixDash(String dash, String str) {
        final String DASH = "-";

        return str.replace(dash, DASH);
    }

    public String getRightNameCity(String str) {
        final String ERROR = "Error! Enter the name of the city, please";
        final String DASH_SP = "- ";
        final String SP_DASH = " -";
        final String SP_DASH_SP = " - ";

        if (str != null && str.length() != 0 && str.trim().length() > 0) {
            str = str
                    .trim()
                    .toLowerCase()
                    .replaceAll("\\s{2}", "");

            str = String.valueOf(str.charAt(0))
                    .toUpperCase()
                    .concat(str.substring(1));

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ' ' || str.charAt(i) == '-') {

                    str = str
                            .substring(0, i + 1)
                            .concat(str.substring(i + 1, i + 2).toUpperCase())
                            .concat(str.substring(i + 2));
                }
            }
            str = fixDash(DASH_SP, str);
            str = fixDash(SP_DASH, str);
            str = fixDash(SP_DASH_SP, str);
        } else {

            return ERROR;
        }

        return str;
    }
}