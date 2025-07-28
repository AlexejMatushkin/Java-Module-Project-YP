import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Создаём сканер для ввода данных.
    Race race = new Race(); // Инициализируем гонку.

        // Цикл для ввода данных о 3 машинах.
        for (int i = 0; i < 3; i++) {
            String name;
            while (true) {
                System.out.println("Введите название машины №" + (i + 1) + ":");
                name = scanner.next(); // Считываем название машины.

                // Проверка на корректность названия
                if (name == null || name.trim().isEmpty()) {
                    System.out.println("Ошибка: название не может быть пустым!");
                } else if (name.length() > 20) {
                    System.out.println("Ошибка название слишком длинное (макс. 20 симлволов)!");
                } else if (!name.matches("[a-zA-Zа-яА-Я0-9 ]+")) {
                    System.out.println("Ошибка: название содержит недопустимые символы!");
                } else {
                    break; // Название корректное
                }
            }

            int speed;
            while (true) { // Бесконечный цикл для проверки скорости.
                System.out.println("Введите скорость машины №" + (i + 1));
                try {
                    speed = scanner.nextInt(); // Считываем скорость.
                    if (speed >= 0 && speed <= 250)
                        break;
                    System.out.print("Неправильная скорость!");
                    System.out.print(" Допустимо 0-250."); // Сообщение об ошибке.
                } catch (Exception e) {
                    System.out.println("Ошибка: введите целое число!");
                    scanner.next(); // Очистка буфера
                }
            }

            Car car = new Car(name, speed); // Создаём объект машины.
            race.determineNewLeader(car); // Обновляем лидера гонки.
        }

        System.out.println("Самая быстрая машина: " + race.getRaceLeader()); // Выводим победителя.
        // Закрываем Scanner по завершении работы.
        scanner.close();
    }
}
