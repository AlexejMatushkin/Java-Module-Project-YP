public class Race {
    String raceLeader = ""; // Лидер гонки.
    int currentLeaderDistance = 0; // Дистанция текущего лидера гонок.

    // Определяет нового лидера гонки на основе переданного автомобиля.
    public void determineNewLeader(Car car) {
        int distance = 24 * car.speedCar; // Формула: дистанция = время (24 часа) * скорость машины.

        // Если новая дистанция больше текущего рекорда.
        if(distance > currentLeaderDistance) {
            raceLeader = car.nameCar; // Обновляем имя лидера.
            currentLeaderDistance = distance; // Обновляем рекордную дистанцию.
        }
    }
}
