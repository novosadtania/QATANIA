package homework10;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;

    public void greetPet() {
        System.out.println("Привіт, " + pet.getNickname());
    }

    public void describePet() {
        if (pet.getTrickLevel() > 50) {
            System.out.println("У мене є " + pet.getSpecies() + ",їй " + pet.getAge() + " років,він дуже хитрий");
        } else if (pet.getTrickLevel() < 50) {
            System.out.println("У мене є " + pet.getSpecies() + ",їй " + pet.getAge() + " років,він майже не хитрий");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother +
                ", father=" + father +
                ", pet=" + pet +
                "{nickname='" + pet.getNickname() + '\'' +
                ", age=" + pet.getAge() +
                ", trickLevel=" + pet.getTrickLevel() +
                ", habits=" + Arrays.toString(pet.getHabits()) +
                '}' +'}';
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }
    public Human() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }
}
