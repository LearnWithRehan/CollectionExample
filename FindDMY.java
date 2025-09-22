import java.util.Calendar;
import java.util.Scanner;

public class FindDMY {

    public static String FindDayMonthYear(int month, int day, int year){
        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,day);
        String[] Days = {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};
        return Days[cal.get(Calendar.DAY_OF_WEEK)-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month:-");
        int month = sc.nextInt();
        System.out.println("Enter Day:-");
        int day = sc.nextInt();
        System.out.println("Enter year:-");
        int year = sc.nextInt();
        sc.close();
        System.out.println(FindDayMonthYear(month,day,year));
    }
}
