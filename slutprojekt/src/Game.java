/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ellio
 */
public class Game {
    //Attributer
    private int bet;
    private String chosenColor;
    private String roll;
    private int win;
    private int index;

    
    //Konstruktor
    public Game(int bet, String chosenColor, String roll, int win, int index) {
        this.bet = bet;
        this.chosenColor = chosenColor;
        this.roll = roll;
        this.win = win;
        this.index = index;
    }

    //GETTERS AND SETTERS
    public int getIndex() {
        return index;
    }

    public int getWin() {
        return win;
    }
    
    //toString
    @Override
    public String toString() {
        return "Game: "+index+" Bet: " + bet +" Your Color: "+ chosenColor + " Winning Color: " + roll + " Win: " + win + "\n";
    }
    
    
}
