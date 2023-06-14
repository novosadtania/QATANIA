package homework10;

import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Svitlana", "Sobol", 41);
        System.out.println(mother);
        Human father = new Human("Vasyl", "Sobol", 50,150);
        System.out.println(father);
        Family familySobol = new Family(mother, father, "Sobol");
        Human sun = new Human("Pavlo", "Sobol", 22,165, familySobol);
        Human daughter = new Human("Khrystyna", "Sobol", 14);
        Pet pet = new Pet("Dog", " Stefani", 1, 99, new String[]{"eat", "drink", " run", "play"});
        System.out.println(pet);
        Pet pet2 = new Pet("Dog","Lada",8,39,new String[]{"sleep","eat"});
        System.out.println(pet2);
        System.out.println(father.getFamily().getFamilyName());
        System.out.println(familySobol.countFamily());
        familySobol.addChild(sun);
        familySobol.addChild(daughter);
        System.out.println(familySobol.countFamily());
        Human daughter2 = new Human("Tania", "Novosad", 23);
        System.out.println(daughter2);
        Human daughter3 = new Human("Katia","Novosad",26,155);
        System.out.println(daughter3);
        Human mom = new Human("Nadia","Novosad", 48);
        Family familyNovosad = new Family(mom, new Human()[] {daughter2,daughter3},);
        System.out.println(pet);
        pet.eat();
        sun.greetPet(pet);
        sun.describePet(pet);

    }
}
