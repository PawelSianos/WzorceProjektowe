package Wzorce.projektowe.sigleton;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class GuessGame implements Serializable {

    private static GuessGame instance = new GuessGame();
    private int score = 0;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private GuessGame(){

    }

    public static GuessGame getInstance(){
        return instance;
    }
    public int getScore() {
        return score;
    }

    public void play() {
        for(int i  = 0; i<10; i++) {
            int number = random.nextInt(9);
            System.out.print("Zgadnij cyfre: ");
            int quess = scanner.nextInt();
            if(number==quess) {
                System.out.println("Udalo sie!");
                score++;
            } else {
                System.out.println("Przykro mi, myslalem o " + number);
            }
        }
        System.out.println("Twoj wynik: " + score);
    }
    protected Object readResolve() {
        return getInstance();
    }
}
