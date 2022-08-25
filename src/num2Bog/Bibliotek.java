package num2Bog;

public class Bibliotek {
    Bog bog1 = new Bog(1234, "Harry Potter1", 2010);
    Bog bog2 = new Bog(1243, "Harry Potter2", 2012);
    Bog bog3 = new Bog(9876, "Harry Potter3", 2016);


    public boolean check(Bog bog1) {
        if (bog1.getISBN() == 1234){
            return true;
        }
        else return false;
    }


}

