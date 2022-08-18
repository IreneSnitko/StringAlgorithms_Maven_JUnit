public class StringToArrayNumbers {

    /*
    Create an algorithm,accepting the string,
    containing numbers, letters and signs
    and returns an array of numbers less than 10
    */

    public int[] getArrayIntegersFromString(String str) {
        int length = 0;

        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                if (str.length() != 0 && str.charAt(i) > 47 && str.charAt(i) < 58) {
                    length++;
                }
            }
        }
        else {
            length = 0;
        }

        int[] arr = new int[length];
        int index = 0;

        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                if (length <= str.length() && str.charAt(i) > 47 && str.charAt(i) < 58) {
                    arr[index] = Integer.parseInt(String.valueOf(str.charAt(i)));
                        index++;
                }
            }
        }
        else {
            arr = new int[]{};
        }

        return arr;
    }
}