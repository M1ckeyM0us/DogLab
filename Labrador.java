// ****************************************************************
// Labrador.java
//
// A class derived from Dog that holds information about
// a labrador retriever.  Overrides Dog speak method and includes
// information about avg weight for this breed.
//          
// ****************************************************************
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Labrador extends Dog
{
    private Color color; //black, yellow, or chocolate?
    
    // had to add super and add imports.
    public Labrador(String name, Color color)
    {

        super(name);
        this.color = color;

    }

    
    public String bark()
    {

        return "Labrador barking";

    }



}
