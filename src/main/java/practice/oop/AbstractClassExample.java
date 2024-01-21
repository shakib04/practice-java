package practice.oop;

public class AbstractClassExample {
    public static void main(String[] args) {
        Animal[] animals = getAnimals();
        MiniZoo miniZoo = new MiniZoo(animals);
        miniZoo.putAnimalsIntoSleep();
    }

    private static Animal[] getAnimals() {
        Animal[] animals = new Animal[2];
        Animal lion = new Lion("Meat");
        Animal tiger = new Tiger("Meat");

        animals[0] = lion;
        animals[1] = tiger;
        return animals;
    }
}

class MiniZoo {
    private Animal[] animals;

    MiniZoo(Animal[] animals) {
        this.animals = animals;
    }

    public void putAnimalsIntoSleep() {
        for (Animal animal : animals) {
            animal.sleep();
            String animalName = animal.getClass().getSimpleName();
            System.out.println(animalName + " eats " + animal.getDiets() + ".");
        }
    }
}

abstract class Animal {

    int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    protected abstract void sleep();

    protected abstract String getDiets();
}

class Lion extends Animal {

    private String diets;

    Lion(String diets) {
        super(4);
        this.diets = diets;
    }

    @Override
    protected void sleep() {
        System.out.println("Lion is sleeping...zzzz");
    }

    @Override
    protected String getDiets() {
        return diets;
    }
}

class Tiger extends Animal {

    private String diets;

    Tiger(String diets) {
        super(4);
        this.diets = diets;
    }

    @Override
    protected void sleep() {
        System.out.println("Tiger is sleeping...zzzz");
    }

    @Override
    protected String getDiets() {
        return diets;
    }
}