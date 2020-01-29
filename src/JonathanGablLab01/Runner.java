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
import java.util.Scanner;

public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Roller roller = new Roller();
        Scanner input = new Scanner(System.in);
        
        //creates die with sides based on user input and array of corresponding size
        System.out.println("how many sides are on the die");       
        Die die = new Die(input.nextInt());        
        Counter counter = new Counter(die.getSides());
        
        //creatues
        System.out.println("how many dies should I roll?");
        int diesToRoll = input.nextInt();
        System.out.print("How often should I print?");
        roller.startRolling(die, diesToRoll, input.nextInt(), counter);

        // TODO code application logic here
    }

}
