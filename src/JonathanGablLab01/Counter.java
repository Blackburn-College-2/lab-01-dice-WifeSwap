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
public class Counter {

    private int[] counter;
    private int totalRolls;
    private double percentage;

    public Counter(int size) {
        counter = new int[size];
    }

    ;
    public void addValue(int sideRolled) {
        counter[sideRolled - 1] = counter[sideRolled - 1] + 1;
    }

    public void printValues(int rolls, int sides, int diesRolled) {
        totalRolls += rolls;
        System.out.println("\nAfter " + totalRolls + " rolls, the distribution is :");
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
