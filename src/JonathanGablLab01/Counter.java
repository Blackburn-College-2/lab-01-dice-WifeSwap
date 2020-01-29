/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JonathanGablLab01;

/**
 * Array that stores rolls of n at n-1 in the array
 * contains addValue to add values to the array
 * contains printValues to print out a formatted version of the array
 * @author jonathan.gabl
 */
public class Counter {

    private int[] counter;
    private int totalRolls;
    private double percentage;

    public Counter(int size) {
        counter = new int[size];
    }

    ;
    /**
     *  adds value of side rolled to the total amount of times that side has been rolled
     * @param sideRolled - returns side of die that is rolled
     */
    public void addValue(int sideRolled) {
        counter[sideRolled - 1] = counter[sideRolled - 1] + 1;
    }
/**
 * prints out the total rolls and the number of times each side has been rolled along with its corresponding percentage
 * @param rolls - number of rolls since last printout
 * @param sides - number of sides on the die
 * @param diesRolled - number of dies rolled
 */
    public void printValues(int rolls, int sides, int diesRolled) {
        totalRolls += rolls;
        System.out.println("\n\nAfter " + totalRolls + " rolls, the distribution is :");
        for (int i = 0; i < counter.length; i++) {
            System.out.print(i + 1 + "\t \t");
        }
        System.out.println("");

        for (int i = 0; i < counter.length; i++) {
            percentage = ((double)counter[i])* 100 / totalRolls / diesRolled;
            System.out.print(counter[i] + " (" + (int)percentage + "%)\t");
        }        
        
    }
}
