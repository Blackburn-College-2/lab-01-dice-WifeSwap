/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JonathanGablLab01;

/**
 *
 * @author jonathan.gabl
 */
import java.util.Scanner;

public class Roller {

    private int currentRoll;
    private Scanner input;
    private int rolls;
    private int diesToRoll;

    public Roller() {
        currentRoll = 0;
        input = new Scanner(System.in);
    }

    ;
    public void rollDie(int rolls, int sides, int diesToRoll, Counter counter) {
        for (int i = 0; i < rolls; i++) {
            for (int a = 0; a < diesToRoll; a++) {
                counter.addValue((int) (Math.random() * sides + 1));
            }
        }
        counter.printValues(rolls, sides, diesToRoll);
    }

    ;
    public void startRolling(Die die, int diesToRoll, int rolls, Counter counter) {
        while (true) {
            rollDie(rolls, die.getSides(), diesToRoll, counter);
        }
    }
}
