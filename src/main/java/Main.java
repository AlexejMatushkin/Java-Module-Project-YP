import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Создаём сканер для ввода данных.
    Race race = new Race(); // Инициализируем гонку.

        // Цикл для ввода данных о 3 машинах.
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название машины №" + (i + 1) + ":");
            String name = scanner.next(); // Считываем название машины.

            int speed;
            while (true) { // Бесконечный цикл для проверки скорости.
                System.out.println("Введите скорость машины №" + (i + 1));
                speed = scanner.nextInt(); // Считываем скорость.
                if (speed >= 0 && speed <= 250 )
                    break;
                System.out.println("Неправильная скорость"); // Сообщение об ошибке.
            }

            Car car = new Car(name, speed); // Создаём объект машины.
            race.determineNewLeader(car); // Обновляем лидера гонки.
        }

        System.out.println("Самая быстрая машина: " + race.getRaceLeader()); // Выводим победителя.

        // Закрываем Scanner по завершении работы.
        scanner.close();
    }
}
