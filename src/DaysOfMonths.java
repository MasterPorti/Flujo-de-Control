import java.util.InputMismatchException;
import java.util.Scanner;

public class DaysOfMonths {
    public static void main(String[] args) {

        System.out.println("Enter the year");
        int year;
        int month;
        int days;
        try(Scanner sc = new Scanner(System.in)){
            year = getValidYear(sc);
            month = getValidMonth(sc);
        }
        boolean leapYear = isLeapYear(year);
        days = getDays(month,leapYear);
        System.out.println("Your month has " + days);


    }

    private static int getDays(int month, boolean leapYear){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){
           return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11){
            return  30;
        } else if (month == 2) {
            return leapYear?29:28;
        }
        return -1;
    }

    private static int getValidYear(Scanner sc){
        int year;
        while (true){

            try {
                year = sc.nextInt();
                if(year<1){
                    System.out.println("Enter a valid year more than 1");
                    continue;
                }
                sc.nextLine();
                return year;
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("Enter a year like 1532");
            }
        }

    }

    private static int getValidMonth(Scanner sc){
        int month;
        while (true){
            try {
                System.out.println("Enter de number of the month (1 = January...)");
                month = sc.nextInt();
                if(month <1 || month>12 ){
                    System.out.println("Enter a valid number");
                    continue;
                }
                return month;
            }catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Enter a month like January = 1");
            }
        }

    }

    private static boolean isLeapYear(int year){
        return (year % 400 == 0) || ((year % 4 == 0) && !(year % 100 == 0));
    }
}
