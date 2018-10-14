import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calculate {
    GregorianCalendar calendar = new GregorianCalendar();
    private int d = calendar.get(Calendar.DAY_OF_MONTH);
    private int m = calendar.get(Calendar.MONTH);
    private int y = calendar.get(Calendar.YEAR);

    public int calculateLifeInSecond(int day, int month, int year) {
        int todayInSec = (y * 365 + m * 30 + d) * 24 * 60 * 60;
        return todayInSec - (year * 365 + month * 30 + day) * 24 * 60 * 60;
    }

    public int calculateLifeInMinut(int day, int month, int year) {
        int todayInMin = (y * 365 + m * 30 + d) * 24 * 60;
        return todayInMin - (year * 365 + month * 30 + day) * 24 * 60;
    }

    public int calculateLifeInHours(int day, int month, int year) {
        int todayInHours = (y * 365 + m * 30 + d) * 24;
        return todayInHours - (year * 365 + month * 30 + day) * 24;
    }

    public int calculateLifeInDays(int day, int month, int year) {
        int todayInDays = y * 365 + m * 30 + d;
        return todayInDays - year * 365 + month * 30 + day;
    }

    public int calculateLifeInWeeks(int day, int month, int year) {
        int todayInWeeks = (y * 365 + m * 30 + d) / 7;
        return todayInWeeks - (year * 365 + month * 30 + day) / 7;
    }

    public int calculateLifeInMonth(int day, int month, int year) {
        int todayInMonth = y * 12 + m;
        return todayInMonth - (year * 12 + m);
    }

    public int calculateLifeInYear(int day, int month, int year) {
        int todayInYears = y;
        return todayInYears - (year * 12 + m) / 12;
    }
}
