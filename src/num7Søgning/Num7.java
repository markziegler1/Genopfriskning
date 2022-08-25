package num7Søgning;

import java.util.ArrayList;

public class Num7 {

    // Dette er Daniel Dams løsning, da jeg ikke selv kunne finde en god løsning.
    public int find(ArrayList<String> strings, String find) {
        int index = strings.indexOf(find);

        if (index == -1) {
            throw new RuntimeException();
        }

        return index;
    }

    public static void main(String[] Args) {
        Num7 opg = new Num7();

        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");

        try {
            System.out.println(opg.find(strings, "c"));
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
    }

