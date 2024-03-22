import java.util.Random;
import java.text.DecimalFormat;

 
public class Coin {
/*
 * field for sideUp
 */
    private String sideUp;

/*
 * constructor, enables toss to be used.
 * @return - toss()
 */
    public Coin(){
        toss();
    }
/*
 * @return sideUp
 */
    public String getsideUp(){
        return sideUp;
    }
/* 
 * creates a coinflip function that determines randomly if a coin is "heads" or "tails".
 * @return heads or tails.
 */
    public void toss(){
        Random rand = new Random();
        int coin = rand.nextInt(2) + 1;
        if (coin == 2){
            sideUp = "Heads";
        }
        else{
            sideUp = "Tails";
        }
    }

/*
 * creates instance for quarter, dime, nickel and uses toss() to add to balance, if heads, adds certain coins amount to balance.
 * prints balance out and what head each coins was and stops when balance is equal too or exceeds 1.0
 */
    public static void main(String[] args) {
        Coin quarter = new Coin();
        Coin dime = new Coin();
        Coin nickel = new Coin();
        double balance = 0.0;
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        while (balance <= 1.00){
            quarter.toss();
            if (quarter.getsideUp().equals("Heads")){
                balance += 0.25;
            }
            dime.toss();
            if (dime.getsideUp().equals("Heads")){
                balance += 0.10;
            }
            nickel.toss();
            if (nickel.getsideUp().equals("Heads")){
                balance += 0.05;
            }

            System.out.println("Quarter: " + quarter.getsideUp());
            System.out.println("Dime: " + dime.getsideUp());
            System.out.println("Nickel: " + nickel.getsideUp());
            System.out.println("Current Balance: $" + numberFormat.format(balance));
        }

        if (balance == 1.0) {
            System.out.println("You won!");
        } 
        else {
            System.out.println("You lost!");
        }
    }

}


