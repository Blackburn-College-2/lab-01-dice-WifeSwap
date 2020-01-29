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
    /**
     * gets random number from 1-n where n is number of sides and calls addValue 
     * to add its value to the counter array
     * 
     * calls printValue method every n rolls where n is the number of rolls in a grouping 
     * @param rolls - number of rolls in a grouping 
     * @param sides - number of sides on each die
     * @param diesToRoll - number of dies
     * @param counter - counter to add die values to
     */
    public void rollDie(int rolls, Die die, int diesToRoll, Counter counter) {
        for (int i = 0; i < rolls; i++) {
            for (int a = 0; a < diesToRoll; a++) {
                counter.addValue(die.roll());
            }
        }
        counter.printValues(rolls, die.getSides(), diesToRoll);
    }

    ;
    /**
     * continually calls the rollDie method
     * @param die - die that is being rolled
     * @param diesToRoll - number of dies to roll
     * @param rolls - number of rolls in a grouping
     * @param counter - counter to add values to
     */
    public void startRolling(Die die, int diesToRoll, int rolls, Counter counter) {
        while (true) {
            rollDie(rolls, die, diesToRoll, counter);
        }
    }
}
