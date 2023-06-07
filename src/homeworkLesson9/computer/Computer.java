package homeworkLesson9.computer;

import java.util.Objects;

/*1) Создать класс Computer c конструктором принимающим параметры
    Марка тип String, цена тип int, оперативная память тип int,
    и видеокарта тип int.
    Переопределить метод toString для вывода объекта класса в след. виде:
            "Создан PC.
    Имя = марка.
            Цена = цена.
            Видеокарта = объем видеокарты
    ОЗУ = Объем оперативной памяти."

    Все поля класса Computer должны быть приватными.
    Также создайте публичные методы для получения информации о полях класса Computer.
    А также методы для изменения его полей.

    Переопределите метод equals и метод hashCode для вашего класса.
    Сделайте так, чтобы компьютеры считались одинаковыми в случае если у них
    равны значения полей марка, оперативная память и видеокарта.

    В отдельном классе создайте объект класса компьютер, и выведите в консоль
    информацию о вашем объекте.*/
public class Computer {
    private String type;
    private int price;
    private int ram;
    private int videoCard;

    public Computer(String type, int price, int ram, int videoCard) {
        this.type = type;
        this.price = price;
        this.ram = ram;
        this.videoCard = videoCard;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Створений ПК." + "\n" +
                "Ім'я = " + type + ". \n" +
                "Ціна = " + price + ".\n" +
                "Відеокарта = " + videoCard + ".\n" +
                "ОЗУ = " + ram + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && videoCard == computer.videoCard && Objects.equals(type, computer.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, ram, videoCard);
    }

    public void getInfoComputer() {
        System.out.println("Name: " + type + ".\n" +
                " Price:" + price + ".\n" +
                "RAM: " + ram + ".\n" +
                "Videocard: " + videoCard + ".");
    }

    public String Name(String type) {
        return type;
    }

    public int Price(int price) {
        return price;
    }

    public int Ram(int ram) {
        return ram;
    }

    public int VideoCard(int videoCard) {
        return videoCard;
    }

    public void getPrice(int i, int i1) {
    }
}

