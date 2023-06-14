package homework10;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private String familyName;

    public Family(Human mother, Human father, String familyName) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.familyName = familyName;
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }


    public int countFamily() {
        return 2 + children.length;
    }

    public void addChild(Human newChild) {
        newChild.setFamily(this);
        Human[] newArray = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            newArray[i] = children[i];
        }
        newArray[children.length] = newChild;
        children = newArray;
    }

    public void deleteChild(int index) {
        children[index].setFamily(null);
        children[index] = null;
        Human[] newArray = new Human[children.length - 1];
        int k = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i] == null) {
                continue;
            }
            children[i] = newArray[k];
            k++;
        }
        children = newArray;
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }


    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet) && Objects.equals(familyName, family.familyName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet, familyName);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }
}
