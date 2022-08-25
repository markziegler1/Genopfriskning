package num5ProperCase;

import java.util.Locale;

public class Proper {

    public void myMethod(String text){
        if (text.contains(text.toUpperCase(Locale.ROOT))){
            System.out.println(text);
        }
        else if (text.length() > 3) {

            System.out.println(text.toLowerCase());        }
        else if (text.length() == 3) {

            System.out.println(text.toLowerCase());        }
    }

    public static void main(String[] args) {
        Proper p = new Proper();
        p.myMethod("hEj");
    }
}
