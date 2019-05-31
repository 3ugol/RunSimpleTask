//import org.joda.time.LocalDate;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;


class WorkingDays {
    static long count(final LocalDate start, final LocalDate end) {
//        System.out.println(start.getDayOfWeek());
//        DayOfWeek s=start.getDayOfWeek();
//        DayOfWeek i=DayOfWeek.MONDAY;
        LocalDate tempEnd = end.plusDays(30);
//        tempEnd = tempEnd.minusDays(1);
//        System.out.println(tempEnd.getDayOfWeek());
//        DayOfWeek e=tempEnd.getDayOfWeek();
//        long days = ChronoUnit.DAYS.between(start, tempEnd);
//        long week = ChronoUnit.WEEKS.between(start, tempEnd);
//        System.out.println( days + " \nnedel " + week);
        int week=0;
        String z;
        LocalDate startI = start;
        for (; startI != tempEnd; startI=startI.plusDays(1)) {
            z=startI.getDayOfWeek().name();
            if (z.equals("MONDAY") ) { //&& start.plusDays(5) == tempEnd
                long days = ChronoUnit.DAYS.between(startI, tempEnd);
                for (; days >= 5; startI=startI.plusDays(7))
                {
                    days = ChronoUnit.DAYS.between(startI, tempEnd);
                    week++;
                }
                return week*=5;
            }
        }
        return 0;

        /*        LocalDate tempEnd = end.plusMonths(1);  // получаем последний день месяца
        tempEnd = tempEnd.minusDays(1);
        long days = ChronoUnit.WEEKS.between(start, tempEnd); // считаем количество недель
        return days*=5;
        */
    }
}

/*

перший понеділок місяця
остання пятниця місяця -- кількість днів в місяці

*/
