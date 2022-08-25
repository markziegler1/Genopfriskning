package num4Kvadrat;

public class Kvadrat {

    public void kvadrats(int tal, String tegn){
        for (int i = 0; i < tal ; i++) {
            for (int j = 0; j < tal ; j++) {
                System.out.printf("%s  ", tegn);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Kvadrat go = new Kvadrat();
        go.kvadrats(6, ":'(");
    }
}
