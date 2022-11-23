public class Main {

    public static int getYear() {
        int year = 2020;
        return year;

    }

    public static void main(String[] args) {

        int year = getYear();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "  - високосный год");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }
}