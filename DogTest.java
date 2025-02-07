// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


import java.awt.*;
import java.util.ArrayList;

public class DogTest
{
    public static void main(String[] args)
    {

	Dog dog = new Dog("Spike");
	System.out.println(dog.getName() + " says " + dog.bark());

    Labrador lab = new Labrador("Buddy", Color.BLACK);
    System.out.println(lab.getName() + " says " + lab.bark());

    Yorkshire york = new Yorkshire("Max", 3);
    System.out.println(york.getName() + " says " + york.bark());

        york.waddle();

        lab.waddle();

    /////////////////////////////////////////////////////////////////////////////////////////////////

//        Dog[] dogs = new Dog[3];
//        dogs[0] = new Dog("Rex");
//        dogs[1] = new Yorkshire("Charlie", 2);
//        dogs[2] = new Labrador("Daisy", Color.BLACK);

//    ArrayList<Dog> dogs = new ArrayList<Dog>();
//    dogs.add(new Dog("Skibidi dog"));
//    dogs.add(new Labrador("Good dog", Color.YELLOW));
//    dogs.add(new Yorkshire("Nice dog", 1000));
//        for (Dog d : dogs) {
//
//            System.out.println(d.getName() + " says " + d.bark());
//
//        }
//
//        // Making Labrador waddle with casting
//        if (dogs.get(2) instanceof Labrador) {
//
//            ((Labrador) dogs.get(2)).waddle();
//
//        }

//////////////////////////////////////////////////////////////////////////////////////////////////////

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(new Dog("Zeus"));
        animalList.add(new Yorkshire("Luna", 4));
        animalList.add(new Labrador("Coco", Color.BLACK));

        for(Animal i: animalList){

            i.setAge(3);

        }

        for (Animal a : animalList) {

            System.out.println(a.getClass().getSimpleName() + " is " + a.getAge() + " years old.");
            a.eat();


            if (a instanceof Dog) {

                ((Dog) a).bark();

            }
        }
    }
}
