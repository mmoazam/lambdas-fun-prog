package org.example;

import java.util.function.Consumer;

/*
* Create a Consumer which checks whether the length of a String
*  is over 5 characters long.
* If so, print this character to the console with an exclamation
*  point ! added to the end of the String.
 yyyyyr
 * r!  this is the 6th char.
Apply this for each String in a stream.*/

public class C3 {

    public Consumer<String> getSixthCharAndAddExcl = l -> {
        if(l.length() > 5){
            System.out.printf("%s!",l);
        }
    };


}
