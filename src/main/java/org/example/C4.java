package org.example;

import java.util.function.Consumer;



public class C4 {
    public Consumer<String> userNameFromEmail = u -> {
        //int index = u.indexOf("@");
        System.out.println(u.substring(0,u.indexOf("@")));
    };
}
