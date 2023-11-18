import java.time.LocalDate;
import java.time.MonthDay;
import java.time.DayOfWeek;

public class Calender {
    public static void main(String[] args) {

        LocalDate rightNow = LocalDate.now();
        int today = rightNow.getDayOfMonth();
        LocalDate date = rightNow.minusDays(today - 1);

        LocalDate endDate = date.plusMonths(1);
        LocalDate startDate = date.minusMonths(1);

        System.out.println(" MON   TUE   WED  THU  FRI  SAT  SUN ");

        System.out.println("");
        while (date.isBefore(endDate)) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            date = date.plusDays(1);
        }
            date = rightNow.minusDays(today - 1);

            while (date.isBefore(endDate)) {
                DayOfWeek dayOfWeek = date.getDayOfWeek();
                int dayOfMonth = date.getDayOfMonth();

                System.out.printf("%4d", dayOfMonth);

                if (date.equals(rightNow)) {    
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                if (dayOfWeek == DayOfWeek.SUNDAY) {
                    System.out.println();
                    System.out.println();

                }
                date = date.plusDays(1);
            }
        }
    }
