package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.SetInfo("Max", "Husky", 'M', 2, "Small", "White");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        System.out.println(dog);

        Cat cat = new Cat();
        cat.SetInfo("Tarcin","British",'M',3,"Small","brown");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        // cat.bark();
        //  cat.hunt();
        cat.scratch();
        System.out.println(cat);


        Tiger tiger = new Tiger();
        tiger.SetInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Orange");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);






    }
}
