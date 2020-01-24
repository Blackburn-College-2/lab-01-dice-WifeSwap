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
        public Roller(){
        currentRoll=0;
        input = new Scanner(System.in);
    };
    public void rollDie(int rolls,int sides,Counter counter){
        for(int i = 0; i<rolls;i++){
            counter.addValue((int)(Math.random()*sides+1));  
        }
        counter.printValues(rolls);
    };
    public void startRolling(Die die, Counter counter){
        System.out.print("How often should I print?");
        rolls = input.nextInt();                
        while (true){
        rollDie(rolls,die.getSides(),counter);
        }
    }
}
