package ss7_abstractClass_interface.thuc_hanh.Animal_InterfaceEdible.animal.Test;

import ss7_abstractClass_interface.thuc_hanh.Animal_InterfaceEdible.animal.Animal;
import ss7_abstractClass_interface.thuc_hanh.Animal_InterfaceEdible.animal.Chicken;
import ss7_abstractClass_interface.thuc_hanh.Animal_InterfaceEdible.animal.Tiger;
import ss7_abstractClass_interface.thuc_hanh.Animal_InterfaceEdible.animal.edible.Edible;
import ss7_abstractClass_interface.thuc_hanh.Animal_InterfaceEdible.animal.fruit.Fruit;
import ss7_abstractClass_interface.thuc_hanh.Animal_InterfaceEdible.animal.fruit.Apple;
import ss7_abstractClass_interface.thuc_hanh.Animal_InterfaceEdible.animal.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit [] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
