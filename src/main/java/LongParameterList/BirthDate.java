package main.java.LongParameterList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class BirthDate {

    private Date date;

    public BirthDate() {
        date = new Date();
    }

    public BirthDate(String yyyyMMdd) throws ParseException {
        date = new SimpleDateFormat("yyyy/MM/dd").parse(yyyyMMdd);
    }

    public int getDay() {
        return getPartOfDate(GregorianCalendar.DAY_OF_MONTH);
    }

    public int getMonth() {
        return 1 + getPartOfDate(GregorianCalendar.MONTH);
    }

    public boolean isSameDay(BirthDate anotherDate) {
        return anotherDate.getDay() == this.getDay() && anotherDate.getMonth() == this.getMonth();
    }

    @Override
    public int hashCode() {
        return date.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BirthDate))
            return false;
        BirthDate other = (BirthDate) obj;
        return other.date.equals(this.date);
    }

    private int getPartOfDate(int part) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        return calendar.get(part);
    }
}
