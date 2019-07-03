
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Zad1 {



    public Date dateFromPesel(Long pesel) throws ParseException {
        Long year = pesel / 1000000000L;
        pesel = pesel - year * 1000000000L;
        Long month = pesel / 10000000;
        pesel = pesel - month * 10000000;
        Long day = pesel / 100000;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
        String date = day + "-" + month + "-" + year;
        Date date1 = formatter.parse(date);
        return date1;
    }

    public Long getNumberOfDays(Date date){
        long count = 0;
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        while (calendar2.before(calendar1)) {
            calendar2.add(Calendar.DAY_OF_MONTH, 1);
            count++;
        }
        return count;
    }
}
