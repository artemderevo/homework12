public class Main {

    public static int getDistance() {
        int deliveryDistance = 95;
        return deliveryDistance;
    }

    public static void main(String[] args) {
        int distance = getDistance() ;
        if (distance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется дней: 3");
        }

        }
    }









