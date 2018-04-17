import java.util.Scanner;

/**
 * Created by Shane on 2018/3/29 11:18
 * 1.计算天数  totalDays,countDays(),
 *      1.1 计算到之前一年的天数
 *      1.2 计算到上月的天数
 *      1.3 计算本月的天数
 * 2.求余判断
 */
public class FishingOrDryingNets {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Year Month Day: ");
        int today = sc.nextInt();
        int thisYear = sc.nextInt();
        int thisMonth = sc.nextInt();
       // int totalDays = countYear(thisYear) + countMonth(thisMonth) + countDays(today);


    }
    /** 判断是否闰年*/
    boolean isLeadYear(int year){
        return (( year%4 == 0 && year % 100 != 0) || year % 400 == 0 );
    }

    int countDays(int today){
        return today;
     }

     int countYear(int year){
        int total = 0;
         for(int i=1990;i<year;i++) {
             if (isLeadYear(i)) {
                 total += 365;
             }else {
                 total += 366;
             }
         }
        return total;
     }
     int countMonth(int thisMonth){
        return 0;
     }
}


