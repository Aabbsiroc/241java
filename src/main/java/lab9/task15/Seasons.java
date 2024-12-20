package lab9.task15;

enum Seasons {
    WINTER("Зима", "Холодно", "Новый Год"),
    SPRING("Весна","Тепло", "Восьмое марта"),
    AUTUMN("Осень","Прохладно", "Первое сентября"),
    SUMMER("Лето","Жарко", "День детей");

    private final String type; // Поле для хранения типа дня
    private final String seasonName; // Поле для хранения типа дня
    private final String holiday; // Поле для хранения типа дня

    // Конструктор (должен быть private)
    Seasons(String seasonName,String type, String holiday) {
        this.type = type;
        this.seasonName = seasonName;
        this.holiday = holiday;
    }

    // Метод для доступа к полю
    public String getType() {
        return type;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getHoliday() {
        return holiday;
    }
}
