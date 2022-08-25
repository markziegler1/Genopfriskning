package num6Sortering;

import java.util.ArrayList;
import java.util.Collections;

public class Num6 {

    public void myMethod(){
        ArrayList<String> myText = new ArrayList<>();
        myText.add("abekat");
        myText.add("musefælde");
        myText.add("ananas");
        myText.add("slut");
        myText.add("solskin");
        System.out.println(myText);
        Collections.reverse(myText);
        System.out.println(myText);
    }

    public static void main(String[] args) {
        Num6 a = new Num6();
        a.myMethod();
    }
}
