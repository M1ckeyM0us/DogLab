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

    ArrayList<Dog> dogs = new ArrayList<Dog>();
    dogs.add(new Dog("Skibidi dog"));
    dogs.add(new Labrador("Good dog", Color.YELLOW));
    dogs.add(new Yorkshire("Nice dog", 1000));
        for (Dog d : dogs) {

            System.out.println(d.getName() + " says " + d.bark());

        }

        // Making Labrador waddle with casting
        if (dogs.get(2) instanceof Labrador) {

            ((Labrador) dogs.get(2)).waddle();

        }

//////////////////////////////////////////////////////////////////////////////////////////////////////


    }
}
