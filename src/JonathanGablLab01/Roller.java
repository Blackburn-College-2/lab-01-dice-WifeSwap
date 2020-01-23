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
public class Roller {
    private int currentRoll;
        public Roller(){
        currentRoll=0;
    };
    public int rollDie(int sides){
            return ((int)(Math.random()*sides+1));        
    };
    public void startRolling(){
        System.out.println("How often should I print?");
    }
}
