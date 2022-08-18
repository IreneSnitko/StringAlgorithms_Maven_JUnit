public class CheckingWhitespaces {

    /*
    Create an algorithm, accepting the string.
    If the string is not empty, then remove the spaces
    at the beginning of the line and at the end of the line.
    If there were spaces, then return the message:
    "Extra spaces have been removed"
    If there were no spaces, return the message:
    "There were no spaces"
    If the line is empty, return the message:
    "Line is empty"
    */

    public String checkWhitespaces(String str) {
        final String EXTRA_SP_REMOVED = "Extra spaces have been removed";
        final String NO_SP = "There were no spaces";
        final String EMPTY = "Line is empty";

        if (str != null
                && !str.isEmpty()
                && str.trim().length() > 0)
        {
            if (!str.trim().equals(str)) {

                return EXTRA_SP_REMOVED;
            }
            else {

                return NO_SP;
            }
        }

        return EMPTY;
    }
}