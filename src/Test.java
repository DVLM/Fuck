import javax.swing.*;
import java.util.*;
import java.awt.*;
class GameLauncher{
    public static void main(String [] args){
        GuessGame game =new GuessGame();
        game.startGame();
    }
}
    class Player{
    int number=0;
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I think you guessing "+ number );
    }
}
    class GuessGame{
    Player p1;
    Player p2;
    Player p3;
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int guessp1 =0;
        int guessp2 =0;
        int guessp3 =0;
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I am thinking the number between 0 to 9........ ");
        while(true){
            System.out.println(" I' am guessing the number is  " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1 = p1.number;
            System.out.println("Player one guess "+guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guess "+guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guess" +guessp3);
            if(guessp1 == targetNumber){
                p1isRight = true;
            }
            if(guessp2 == targetNumber){
                p2isRight = true;
            }
            if(guessp3 == targetNumber){
                p3isRight = true;
            }
            if(p1isRight || p2isRight || p3isRight){
                System.out.println("We have winner");
                System.out.println("Player one is right? "+p1isRight);
                System.out.println("Player two is right? "+p2isRight);
                System.out.println("Player three is right? "+p3isRight);
                System.out.println("Game is over ");
                break;
            }
            else{
                System.out.println("Try it again");
            }
        }
    }
}