/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JonathanGablLab01;

/**
 *
 * @author paul.kline
 */

public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Roller roller = new Roller();
        Counter counter = new Counter();
        Die die = new Die();
        roller.startRolling(die,counter);
        // TODO code application logic here
    }
    
}
