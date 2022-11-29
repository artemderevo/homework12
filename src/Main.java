import java.time.LocalDate;

public class Main {

    public static int getClientOS() {
        int clientOs = 1;
        return clientOs;
    }

    public static int getYear() {
        int currentYear = LocalDate.now().getYear();
        return currentYear;
    }

    public static void main(String[] args) {
        int os = getClientOS();
        int currentYear = getYear();
        int year = getYear();
        if (os == 1 && currentYear < year) {
            System.out.println("Установите облегченную версию приложения для Android");
        } else if (os == 1 && currentYear >= year) {
            System.out.println("Установите версию приложения для Android");
        }
        if (os == 0 && currentYear < year) {
            System.out.println("Установите облегченную версию приложения для iOS");
        } else if (os == 0 && currentYear >= year) {
            System.out.println("Установите версию приложения для iOS");

        }

        }
    }









