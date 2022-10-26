public class Main {

    public static int calculateYear(int cellContent) {
        boolean checkYear = ((cellContent % 4 == 0) && (cellContent % 100 != 0) || (cellContent % 400 == 0));
        if (checkYear) {
        System.out.println(cellContent + " год является високосным");
    } else {
        System.out.println(cellContent + " год не является високосным");
    }
        return cellContent;
    } // Для задачи 1.

    public static int getClientOS(String name) {
        String gap = name.toUpperCase();
        if (gap.equals("IOS")) {
            return 0;
        } else {
            return 1;
        }
    } // Для задачи 2.
    public static void getYearOfIssue(int DeviceYear) {

        if (DeviceYear >= 2015) {
            System.out.println("Рекомендуем Вам установить обычную версию приложение!"); }
        if (DeviceYear < 2015) {
            System.out.println("Рекомендуем Вам установить lite-версию (облегченную версию) приложения."); }
    } // Для задачи 2.

    public static void getDeviceOS(int result) {
        if (result == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке"); }
        else {
            System.out.println("Установите версию приложения для Android по ссылке"); }
    } // Для задачи 2.

    public static int calculationDistance (int radius) {
        int deliverDays = 1;
        if (radius > 20 && radius < 60) {
            deliverDays++;
        }

        if (radius > 60) {
            deliverDays = deliverDays + radius / 40;
        }
        return deliverDays;
    } // Для задачи 3.

    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {

        int year = 2012;
        calculateYear(year);

    }

    public static void task2() {

        String clientOsName = "ios";
        int clientDeviceYear = 2017;
        int clientOS = getClientOS(clientOsName);
        getDeviceOS(clientOS);
        getYearOfIssue(clientDeviceYear);

    }

    public static void task3() {

        int deliveryDistance = 95;
        int deliverDays = calculationDistance(deliveryDistance);

        System.out.println("Потребуется дней: " + deliverDays);

    }


}