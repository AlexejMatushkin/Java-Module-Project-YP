public class Car {
    private String name; // Название автомобиля.
    private int speed; // Скорость автомобиля.

    // Коснтруктор с параметрами.
    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // Геттеры.
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

}
