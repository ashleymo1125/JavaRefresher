import java.util.Scanner;
public class PumpkinFarm {
    // creating static global variables within the PumpkinFarm class
    static int totalPumpkins = 10;
    static int myMoney = 20;
    static int pumpkinPrice = 5;
    // below is the main method which is essentially the entry point of the code
    public static void main(String[] args)
    {
        // Below is a print statement
            System.out.println("Welcome to the pumpkin farm! How may I help you?");
            // while the user still has money, he or she will have to buy pumpkins
        while(myMoney > 0) {
            // A scanner object is created
            Scanner sc = new Scanner(System.in);
            // a print statement that shows how much money the user has left
            System.out.println("You have $ " + myMoney + " ... How many pumpkins would you like to buy?");
            // the user's response is stored in a string called response
            int response = sc.nextInt();
            // creating a pumpkinFarm object called pf
            PumpkinFarm pf = new PumpkinFarm();
            // pf calling buyPumpkin method while passing the user's response as an argument
            pf.buyPumpkins(response);
        }

    }

    public void buyPumpkins(int numberOfPumpkins)
    {
        // if statement that sees if I can afford that many pumpkins
        if(myMoney >= pumpkinPrice * numberOfPumpkins)
        {
            // update money variable
            myMoney = myMoney - (pumpkinPrice * numberOfPumpkins);
            // update number of pumpkins
            totalPumpkins =- numberOfPumpkins;
            // print statements to inform user on the amount of pumpkins and money left
            System.out.println("You bought "+ numberOfPumpkins + " !");
            System.out.println("It cost you "+ numberOfPumpkins * pumpkinPrice + " !");
            System.out.println("You have $ "+ myMoney + " left!");

        }else{ // user doesn;t have enough money to buy # of pumpkins
            System.out.println("You dont have enough $$$$!");}
    }
}
