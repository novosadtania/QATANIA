package homework10;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Svitlana", "Sobol", 41);
        System.out.println(mother);
        Human father = new Human("Vasyl", "Sobol", 50, 150);
        System.out.println(father);
        Family familySobol = new Family(mother, father, "Sobol");
        Human sun = new Human("Pavlo", "Sobol", 22, 165, familySobol);
        Human daughter = new Human("Khrystyna", "Sobol", 14);
        Pet pet = new Pet("Dog", " Stefani", 1, 99, new String[]{"eat", "drink", " run", "play"});
        sun.describePet(pet);
        sun.greetPet(pet);
        pet.eat();
        pet.respond();
        pet.foul();
        System.out.println(pet);
        System.out.println(sun);
        System.out.println(daughter);
        System.out.println(father.getFamily().getFamilyName());
        System.out.println(familySobol.countFamily());
        familySobol.addChild(sun);
        familySobol.addChild(daughter);
        System.out.println(familySobol.countFamily());
        Human daughter2 = new Human("Tania", "Novosad", 23);
        System.out.println(daughter2);
        Human daughter3 = new Human("Katia", "Novosad", 26, 155);
        System.out.println(daughter3);
        Human mom = new Human("Nadia", "Novosad", 48);
        System.out.println(mom);
        Human fath = new Human("Vasia", "Novosad", 48, 166);
        Family familyNovosad = new Family(mom, fath, "Novosad");
        System.out.println(familyNovosad);
        familyNovosad.addChild(sun);
        familyNovosad.addChild(daughter2);
        familyNovosad.addChild(daughter3);
        System.out.println(familyNovosad);
        System.out.println(familyNovosad.countFamily());
        familyNovosad.deleteChild(2);
        System.out.println(familyNovosad.countFamily());
        System.out.println(familyNovosad);
        System.out.println(mom.getFamily().getFamilyName());
        System.out.println(familyNovosad.equals(familySobol));
        System.out.println(familyNovosad.equals(familyNovosad));

    }
}
