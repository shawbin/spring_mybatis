package com.doushabao.commonUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class DateUtils {

    public static void main(String[] args) throws ParseException{

        YearMonth startDate = YearMonth.of(2018, 2);
        LocalDate localDate = startDate.atDay(1);
        LocalDateTime startOfDay = localDate.atStartOfDay();
        ZonedDateTime zonedDateTime = startOfDay.atZone(ZoneId.of("Asia/Shanghai"));
        Date start = Date.from(zonedDateTime.toInstant());

        YearMonth endDate = YearMonth.of(2018, 2);
        LocalDate endOfMonth = endDate.atEndOfMonth();
        LocalDateTime localDateTime = endOfMonth.atTime(23, 59, 59, 999);
        ZonedDateTime endAsia = localDateTime.atZone(ZoneId.of("Asia/Shanghai"));
        Date end = Date.from(endAsia.toInstant());
        System.out.println(start+"-------"+end);
        getDate();
    }

    public static void getDate() throws ParseException{
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Long time1 = sdf1.parse("2018-01-31").getTime();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Long time2 = sdf2.parse("2018-01-31 23:59:59").getTime();
        SimpleDateFormat sdf3 = new SimpleDateFormat("HH:mm:ss");
        Long time3 = sdf3.parse("23:59:59").getTime();
        System.out.println(time1 + "----" + time2 + "================" + time3);
    }
}
