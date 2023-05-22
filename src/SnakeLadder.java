import java.util.Random;

public class SnakeLadder {
    static final int wining_Postion = 100;
    boolean isGameOver = false;
    int currentPlayerPostion = 0;

     // snake postions
    static final int snake1 = 23;
    static final int snake2 = 12;
    static final int snake3 = 45;

    // Ladder Postions

    static final int ladder1 = 33;
    static final int ladder2 = 20;
    static final int ladder3 = 15;

    public int roll_Dice(){
        Random random = new Random();
        return random.nextInt(6 ) +1;
    }
    public void playGame(){

    while (isGameOver == false){
        int diceValue = roll_Dice();
        System.out.println("Player rolled the dice and got: " + diceValue);

        if(currentPlayerPostion + diceValue >100){
            System.out.println("Invalid dice value. Try again.");
            continue;
        }
        currentPlayerPostion += diceValue;
        System.out.println("Player's current position: " + currentPlayerPostion);
        if( currentPlayerPostion == wining_Postion){
            System.out.println(" Winner");
            isGameOver = true;
            break;

        }
        // Check for snake postion
        if(snake1 == currentPlayerPostion){
            System.out.println("Player got bitten by a snake. Move back to position 23.");
            currentPlayerPostion = 23;
        } else if(snake2 == currentPlayerPostion){
            System.out.println("Player got bitten by a snake. Move back to position 12.");
            currentPlayerPostion = 12;
        } else if(snake3 == currentPlayerPostion){
            System.out.println("Player got bitten by a snake. Move back to position 45.");
            currentPlayerPostion = 45;
        }
        //Check for ladder postion

        if(ladder1 == currentPlayerPostion){
            System.out.println("Player found a ladder. Move ahead to position 33.");
            currentPlayerPostion = 33;
        } else if(ladder2 == currentPlayerPostion){
            System.out.println("Player found a ladder. Move ahead to position 20.");
            currentPlayerPostion = 20;
        } else if(ladder3 == currentPlayerPostion){
            System.out.println("Player found a ladder. Move ahead to position 15.");
            currentPlayerPostion = 15;
        }
    }
    }

    public static void main(String[] args) {
        SnakeLadder snakeLadder = new SnakeLadder();
        snakeLadder.playGame();
    }


}
