package pl.edu.utp.baseobject;

public class EnumExample {

    public static void main(String[] args) {
        Month month = Month.MARCH;
        int amountOfDays = getAmountOfDays(month);
        int amountOfDaysFromSwitch = getAmountOfDays(month);
        int amountOfDaysFromEnum = month.getAmountOfDays();
        System.out.println(amountOfDays);
        System.out.println(amountOfDaysFromSwitch);
        System.out.println(amountOfDaysFromEnum);

        System.out.println(month.name());
        System.out.println(month.ordinal());

        Month nextMonth = getNextMonth(month);
        Month nextMonthFromOrdinal = getNextMonthUsingOrdinal(month);
        System.out.println(nextMonth);
        System.out.println(nextMonthFromOrdinal);
    }

    static Month getNextMonth(Month month) {
        switch (month) {
            case JANUARY:
                return Month.FEBRUARY;
            case FEBRUARY:
                return Month.MARCH;
            case MARCH:
                return Month.JANUARY;
            default:
                return null;
        }
    }

    static Month getNextMonthUsingOrdinal(Month month) {
        Month[] allMonths = Month.values();
        int newOrdinal = month.ordinal() + 1;
        if (newOrdinal == allMonths.length) {
            newOrdinal = 0;
        }
        return allMonths[newOrdinal];
    }

    static int getAmountOfDays(Month month) {
        if (month == Month.JANUARY) {
            return 31;
        } else if (month == Month.FEBRUARY) {
            return 28;
        } else if (month == Month.MARCH) {
            return 31;
        } else {
            // I don't know :(
            return -1;
        }
    }

    static int getAmountOfDaysUsingSwitch(Month month) {
        switch (month) {
            case JANUARY:
            case MARCH:
                return 31;
            case FEBRUARY:
                return 28;
            default:
                return -1;
        }
    }

//    static int getAmountOfDaysUsingSwitch(Month month) {
//        int days;
//        switch (month) {
//            case JANUARY:
//            case MARCH:
//                days = 31;
//                break;
//            case FEBRUARY:
//                days = 28;
//                break;
//            default:
//                days = -1;
//                break;
//        }
//        return days;
//    }

}
