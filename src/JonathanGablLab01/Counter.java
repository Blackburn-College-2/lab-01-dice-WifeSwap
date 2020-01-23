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
    
    public Counter(){
        counter = new int[6];
    };
    public void addValue(int sideRolled){
        counter[sideRolled-1]=counter[sideRolled-1]+1;
    }
    public void printValues(){
        for(int i =0;i<counter.length;i++){
            System.out.println((i+1)+": "+counter[i]);
        }
    }
}
