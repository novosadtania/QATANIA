package homeworkLesson9.tree;

import java.util.Objects;

/* 2) Создать класс Tree с перегруженными конструкторами.
    В классе есть Tree есть поля:
    String type; int height, int coutOfsticks, String colour;
    Конструктор1 принимающий в параметры String type; int height
    и присваивающий значение полям coutOfsticks значение 13,
    colour "Зеленый".
    Конструктор2 принимающий в параметры int height, int coutOfsticks,
    String colour и присваивающий значение полю type "пихта".
    Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,
    сolour = "Желтый".
    Конструктор4 который принимает в параметры String type,
    и вызывает внутри себя конструктор 3.

    Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.*/
public class Tree {
    private String type;
    private int height;
    private int coutOfsticks;
    private String colour;

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.coutOfsticks = 13;
        this.colour = "Зелений";
    }

    public Tree(int height, int coutOfsticks, String colour) {
        this.type = "пихта";
        this.height = height;
        this.coutOfsticks = coutOfsticks;
        this.colour = colour;
    }



    public Tree () {
        this.height = 350;
        this.coutOfsticks = 29;
        this.colour = "Жовтий";
    }
    public Tree(String type) {
        this(350,29, "Жовтий");
        this.type = type;
    }
    @Override
    public String toString() {
        return "Tree: " +
                "type = " + type + ",\n" +
                "height = " + height + ",\n" +
                "coutOfsticks = " + coutOfsticks + ",\n" +
                "colour = " + colour + ".";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCoutOfsticks() {
        return coutOfsticks;
    }

    public void setCoutOfsticks(int coutOfsticks) {
        this.coutOfsticks = coutOfsticks;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return height == tree.height && coutOfsticks == tree.coutOfsticks && Objects.equals(type, tree.type) && Objects.equals(colour, tree.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, height, coutOfsticks, colour);
    }


}

