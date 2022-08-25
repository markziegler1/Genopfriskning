package num1ArrayList;

import java.util.ArrayList;

public class FunWithArrays {

    public boolean doesArraylistContainString(ArrayList<String> list, String tekst){
        if (list.contains(tekst)){
            System.out.println("The string has been found");
            return true;
        }
        else {
            list.add(tekst);
            return false;
        }

    }
}
