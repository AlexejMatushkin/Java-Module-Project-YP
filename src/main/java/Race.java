public class Race {
    private String raceLeader = ""; // Лидер гонки.
    private int currentLeaderDistance = 0; // Дистанция текущего лидера гонок.

    // Определяет нового лидера гонки на основе переданного автомобиля.
    public void determineNewLeader(Car car) {
        int distance = 24 * car.getSpeed(); // Формула: дистанция = время (24 часа) * скорость машины.

        // Если новая дистанция больше текущего рекорда.
        if(distance > currentLeaderDistance) {
            raceLeader = car.getName(); // Обновляем имя лидера.
            currentLeaderDistance = distance; // Обновляем рекордную дистанцию.
        }
    }

    // Геттеры.
    public String getRaceLeader() {
        return raceLeader;
    }

}
