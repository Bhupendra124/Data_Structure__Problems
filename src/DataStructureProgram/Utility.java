package DataStructureProgram;

public class Utility {
    public static boolean isLeapYear(int year) {

        boolean leapYear = false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            leapYear = true;
            return leapYear;
        } else {
            leapYear = false;
            return leapYear;
        }
    }
}

