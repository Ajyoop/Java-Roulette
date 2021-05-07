
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ellio
 */
public class Player {
    //Attributer
    private int balance;
    private ArrayList<Game> games = new ArrayList<>();

    //konstruktor
    public Player(int balance) {
        this.balance = balance;
        
    }
    
    //GETTERS AND SETTERS
    public ArrayList<Game> getGames() {
        return games;
    }
    
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    //METODER
    
    /**
     * Skapar ett nytt spel och lägger till det i Arraylisten
     * @param bet
     * @param chosenColor
     * @param roll
     * @param win
     * @param index 
     */
    void newGame(int bet, String chosenColor, String roll, int win, int index){
        Game e = new Game(bet, chosenColor, roll, win, index);
        games.add(e);
    }

    
    
    
    
    
    
}
