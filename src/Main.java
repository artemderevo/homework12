public class Main {

    public static int getDistance() {
        int deliveryDistance = 45;
        return deliveryDistance;
    }

    public static int distance() {
        int distance = 0;
        int distanceFinal = distance + 40;
        return distanceFinal;
    }
    public static int days() {
        int days = 0;
        for (int i = 0; i < 0; i++) {
        }
        return days;
    }

    public static void main(String[] args) {
        int distance = getDistance() ;
        if (distance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else if (distance > 100) {
            System.out.println("К сожалению, так далеко мы не доставляем.");
        }

        }
    }









