public class FullNameToArray {

    /*
    Create an algorithm,accepting the string,
    containing a full name, and returns
    an array of these words with notes
    `First name:`,
    `Middle name:`,
    `Surname:`
    */

    public String[] getArrayFromFullName(String str) {
        String arr[] = new String[3];

        final String ENTER_YOUR_F_NAME =
                "Enter three words of your full name with a capital letter separated by spaces.";

        final String PUT_HYPH
                = "Put a hyphen in place of the missing word";

        if (str != null && str.length() != 0 && str.trim().length() > 0) {
            str =str
                    .trim()
                    .replaceAll("\\s+", " ");

            if (str.contains(" ")) {
                arr = str.split(" ");

                if (arr.length == 3) {
                    arr[0] = "First name: ".concat(arr[0]);
                    arr[1] = "Middle name: ".concat(arr[1]);
                    arr[2] = "Surname: ".concat(arr[2]);
                }
                else {
                    arr = new String[]{};
                    System.out.println(
                            ENTER_YOUR_F_NAME
                                    .concat("\n")
                                    .concat(PUT_HYPH));
                }
            }
            else {
                arr = new String[]{};
                System.out.println(ENTER_YOUR_F_NAME);
            }
        }
        else {
            arr = new String[]{};
            System.out.println(ENTER_YOUR_F_NAME);
        }

        return arr;
    }
}