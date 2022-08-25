package num3HvorTitSkalGræssetSlås;

import java.util.Scanner;

public class Grass {
    private final double growth = 0.8;


    public void inputs(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long is the grass now?");
        double now = scanner.nextDouble();
        System.out.println("How tall must the grass be before cut?");
        double needcut = scanner.nextDouble();

        System.out.println("You need to cut the grass in days: " + (needcut-now)/0.8);

        if (now >= needcut){
            System.out.println("The grass must be cut now");
        } else System.out.println("You dont need to cut");

        }

    public static void main(String[] args) {
        Grass go = new Grass();
        go.inputs();
    }
    }

