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
    
    public Counter(int size){
        counter = new int[size];
    };
    public void addValue(int sideRolled){
        counter[sideRolled-1]=counter[sideRolled-1]+1;
    }
    public void printValues(int rolls, int sides, int diesRolled){
        totalRolls+=rolls;
        System.out.println("After "+totalRolls+" rolls, the distribution is :");
        for(int i =0;i<counter.length;i++){
            System.out.println((i+1)+" was rolled "+counter[i]+" times (+"+counter[i]*100/totalRolls/diesRolled+"%)");
        }
    }
}
