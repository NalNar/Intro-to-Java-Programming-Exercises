public class PrintCalendar {

    // the logic comes from the listing 6.12
    public static void main(String[] args) {
        // input from the user
        java.util.Scanner input = new java.util.Scanner(System.in);

        // year input 
        System.out.print("Enter the year in the format of (19XX or 20XX): ");
        int year = input.nextInt();

        // month input 
        System.out.print("Enter the month any value from (1 .. to .. 12): ");
        int month = input.nextInt();

        // calling the print calendar method
        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {
        // print the headings of the calendar
        printMonthTitle(year, month);

        // print the body of the calendar
        printMonthBody(year, month);
    }

    // get the month title
    public static void printMonthTitle(int year, int month) {
        System.out.println("\n           " + getMonthName(month) + " " + year);
        System.out.println("-------------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    // get the month name
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1 -> monthName = "January";
            case 2 -> monthName = "February";
            case 3 -> monthName = "March";
            case 4 -> monthName = "April";
            case 5 -> monthName = "May";
            case 6 -> monthName = "June";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
        }
        return monthName;
    }

    // print month body
    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        // Print spaces before the first day
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print days of the month
        for (int day = 1; day <= numberOfDaysInMonth; day++) {
            System.out.printf("%4d", day);

            // Move to next line after Saturday
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println(); // final newline
    }

    // get the start day of the month
    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3; // Jan 1, 1800 is a Wednesday
        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        totalNumberOfDays += START_DAY_FOR_JAN_1_1800;
        return totalNumberOfDays % 7;
    }

    // get the total number of days from 1800 to 1/1/year
    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;

        // get the total days from 1800 to 1/1/year
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i)) {
                total += 366;
            } else {
                total += 365;
            }
        }

        // Add days from January to month - 1
        for (int i = 1; i < month; i++) {
            total += getNumberOfDaysInMonth(year, i);
        }

        return total;
    }

    // get the number of days in a month 
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
            month == 8 || month == 10 || month == 12) {
            return 31;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }

        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0;
    }

    // check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
