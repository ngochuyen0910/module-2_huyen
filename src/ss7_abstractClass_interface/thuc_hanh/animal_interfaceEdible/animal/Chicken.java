package ss7_abstractClass_interface.thuc_hanh.Animal_InterfaceEdible.animal;

import ss7_abstractClass_interface.thuc_hanh.Animal_InterfaceEdible.animal.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
