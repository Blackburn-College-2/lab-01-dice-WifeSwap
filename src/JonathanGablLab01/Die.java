/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JonathanGablLab01;

/**
 * Die that has a number of sides
 * @author jonathan.gabl
 */
public class Die {

    private int sides;

    public Die() {
        sides = 6;
    }

    ;
    /**
     * gets a random value between 1 and n where n is the number of sides on the die
     * @return the random value
     */
    public int roll(){
        return (int) (Math.random() * sides + 1);
    };
    
    public Die(int sides) {
        this.sides = sides;
    }
/**
 * @return number of sides 
 */
    public int getSides() {
        return sides;
    }
/**
 * sets number of sides
 * @param sides number of sides to set the die to have
 */
    public void setSides(int sides) {
        this.sides = sides;
    }
}
