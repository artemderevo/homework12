public class Main {

    public static int getYear() {
        int year = 2021;
        return year;

    }

    public static boolean isLeap() {
       int year = getYear();
       return  ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
    }
    public static void main(String[] args) {
        int year = getYear();
        if (isLeap()) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    }
