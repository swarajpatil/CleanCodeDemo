package main.java.FlagParameter;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Hotel {

    private String name;
    private RateCard rateCard;
    private int rating;

    public Hotel(String name, RateCard rateCard, int rating) {

        this.name = name;
        this.rateCard = rateCard;
        this.rating = rating;
    }

    public double getPriceQuote(Date date, Integer noOfDays) {
        Boolean isWeekend = isWeekend(date);
        return rateCard.getPrice(noOfDays, isWeekend);
    }

    private boolean isWeekend(Date date) {
        String[] weekends = new String[]{"Saturday", "Sunday"};
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek = dateFormat.format(date);
        return Arrays.asList(weekends).contains(dayOfWeek);
    }
}
