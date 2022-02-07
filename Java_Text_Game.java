package hello;

//Getting the tool to get user input.
import java.util.Scanner;

public class Main {

    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    int playerIQ;
    String playerName;
    int choice;
    int playerCheat;

    public static void main(String[] args) {

        Main start;
        start = new Main();

        start.playerSetUp();
        start.nightBefore();
    }

    public void playerSetUp() {

        //Starting chances to pass the test
        playerIQ = 50;
        playerCheat= 10;

        System.out.println("Your chance of passing is: " + playerIQ + "%");

        System.out.println("Please enter your name:");
        //getting the user input
        playerName = myScanner.nextLine();

        System.out.println("Hello " + playerName + ",  lets pass this test!");

    }

    public void nightBefore() {

        //Printing the user options for the game
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("It is the day before your math test");
        System.out.println("");
        System.out.println("How are you going to study for this test?");
        System.out.println("");
        System.out.println("1: Pull an all nighter and study");
        System.out.println("2: Go to bed and get a good night sleep");
        System.out.println("3: Prepare to cheat on the test");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            int Min = -10;
            int Max = 15;

            //Getting a random number between two set values, makes the game have different outcomes everytime that it is played.
            int randomNum1= Min + (int)(Math.random() * ((Max - Min) + 1));
            playerIQ = playerIQ + randomNum1;

            if (randomNum1 < 0) {
                System.out.println("Well " + playerName + ",  \nPulling an all nighter was not the best move, \n your chances of passing are now " + playerIQ + "%");
            }
            else{
                System.out.println("Well " + playerName + ",  \nPulling an all nighter was the move! \n your chances of passing are now " + playerIQ + "%");
            }
            enterScanner.nextLine();
            morning();
        }

        else if (choice == 2) {

            int Min = 0;
            int Max = 10;

            //Getting a random number between two set values, makes the game have different outcomes everytime that it is played.
            int randomNum1= Min + (int)(Math.random() * ((Max - Min) + 1));
            playerIQ = playerIQ + randomNum1;

            System.out.println(
                    "Safe choice " + playerName + "! \nYour chances of passing are now " + playerIQ);
            enterScanner.nextLine();
            morning();
        }

        else if (choice == 3) {

            int Min = 30;
            int Max = 70;

            //Getting a random number between two set values, makes the game have different outcomes everytime that it is played.
            int randomNum1= Min + (int)(Math.random() * ((Max - Min) + 1));
            playerCheat = playerCheat + randomNum1;

            System.out.println(
                    "Alright, " + playerName + " I see you are a cheecky one \nYour chances of passing are now " + playerIQ + "\nHowever, since you prepared to cheat your chances of passing through cheating are " + playerCheat);
            enterScanner.nextLine();
            morning();
        } else {
            nightBefore();
        }
    }

    public void morning() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You go downstairs to have breakfast, what will you eat?\n\n");
        System.out.println("1: Don’t have breakfast but cram instead");
        System.out.println("2: Eat a full breakfast");
        System.out.println("3: Eat leftover KFC and cram a little");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        //Choosing different outcomes based on the user's choice
        if (choice == 1) {
            cram();
        } else if (choice == 2) {
            breakfast();
        } else if (choice == 3) {
            KFC();
        } else {
            morning();
        }
    }

    public void cram() {
        int Min = 0;
        int Max = 15;

        //Getting a random number between two set values, makes the game have different outcomes everytime that it is played.
        int randomNum1= Min + (int)(Math.random() * ((Max - Min) + 1));
        playerIQ = playerIQ + randomNum1;

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Cramming instead of eating means you will be hungry during the exam");
        System.out.println("However it does increase your chances of passing to " + playerIQ + "%");

        //calling the drink function so that that area is code is run after this.
        drink();
    }

    public void breakfast() {
        int Min = 10;
        int Max = 15;

        //Getting a random number between two set values, makes the game have different outcomes everytime that it is played.
        int randomNum1= Min + (int)(Math.random() * ((Max - Min) + 1));
        playerIQ = playerIQ + randomNum1;

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You have a full breakfast and are full of nutrition for the test");
        System.out.println("This brings your passing chances to " + playerIQ + "%");

        //calling the drink function so that that area is code is run after this.
        drink();
    }

    public void KFC() {
        int Min = -10;
        int Max = 5;

        //Getting a random number between two set values, makes the game have different outcomes everytime that it is played.
        int randomNum1= Min + (int)(Math.random() * ((Max - Min) + 1));
        playerIQ = playerIQ + randomNum1;

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("KFC is was not the best choice before a test,");
        System.out.println("plus you can't study that much.");
        System.out.println("That brings your passing chances to " + playerIQ + "%");

        //calling the drink function so that that area is code is run after this.
        drink();
    }

    public void drink() {
        System.out.println("\n\n");
        System.out.println("What drink will you have for breakfast?");
        System.out.println("\n1: Coffee");
        System.out.println("2: Water");
        System.out.println("3: Chocolate Milk");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        //Choosing different outcomes based on the user's choice
        if (choice == 1) {
            Coffee();
        } else if (choice == 2) {
            Water();
        } else if (choice == 3) {
            chocMilk();
        } else {
            drink();
        }
    }

    public void Coffee() {
        int Min = 1;
        int Max = 10;

        //Getting a random number between two set values, makes the game have different outcomes everytime that it is played.
        int randomNum1= Min + (int)(Math.random() * ((Max - Min) + 1));
        playerIQ = playerIQ + randomNum1;

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Coffee before the test will keep you awake");
        System.out.println("this increases your passing chances to " + playerIQ + "%");

        drive();
    }

    public void Water() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Water is neutral, this does not increase nor decrease your passing chances");

        drive();
    }


    public void chocMilk() {
        int Min = -5;
        int Max = 10;

        //Getting a random number between two set values, makes the game have different outcomes everytime that it is played.
        int randomNum1= Min + (int)(Math.random() * ((Max - Min) + 1));
        playerIQ = playerIQ + randomNum1;

        //Since the outcome can be either positive or negative this checks if the players chances of passing decrease and in that case this code will run.
        if (randomNum1 < 0){
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Unfortunatly this means that you will have a sugar crash in the exam");
            System.out.println("this decreases your passing chances to " + playerIQ + "%");
        }

        //If there is an increase to their passing chances then this code will run.
        else {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Chocolate milk before the test will keep you awake");
            System.out.println("this increases your passing chances to " + playerIQ + "%");
        }

        drive();
    }

    public void drive() {
        System.out.println("\n\n");
        System.out.println("How will you get to school?");
        System.out.println("\n1: Drive yourself to school");
        System.out.println("2: Get a grab and cram on the way to school");
        System.out.println("3: Go to school with your friend and try to cram");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        //Choosing different outcomes based on the user's choice
        if (choice == 1) {
            skrrr();
        } else if (choice == 2) {
            grab();
        } else if (choice == 3) {
            friend();
        } else {
            drive();
        }
    }

    public void skrrr() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Driving to school means you cannot study, therefore you passing chances remain the same");

        test();
    }

    public void grab() {
        int Min = 1;
        int Max = 5;

        int randomNum1 = Min + (int) (Math.random() * ((Max - Min) + 1));
        playerIQ = playerIQ + randomNum1;

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Good choice, taking a grab means that your passing chances have increase to " + playerIQ + "%");

        test();
    }

    public void friend() {
        int Min = -5;
        int Max = 5;

        int randomNum1 = Min + (int) (Math.random() * ((Max - Min) + 1));
        playerIQ = playerIQ + randomNum1;

        if (randomNum1 > Min) {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("Oh no! Your friend ends up spilling water on your notes");
            System.out.println("This has lowered your chances of passing to " + playerIQ + "%");
        } else {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("nice choice, your friend helped you stdu and your chances of passing are now " + playerIQ + "%");
        }

        test();
    }

    public void test() {
        System.out.println("\n\n");
        System.out.println("Are you going to cheat?");
        System.out.println("\n1: Yes");
        System.out.println("2: No");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        //Choosing different outcomes based on the user's choice
        if (choice == 1) {
            cheat();
        } else if (choice == 2) {
            notcheat();
        } else {
            test();
        }
    }


    public void cheat() {
        int Min1 = 0;
        int Max1 = 100;

        //This gives a random number between 0 and 100, the higher the chance of passing by cheating, the more likely they are to win at this game
        int madness = Min1 + (int) (Math.random() * ((Max1 - Min1) + 1));
        if (playerCheat > madness){
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("You cheated and succeeded, not recommended, but you passed");
            System.out.println("\n\n           THE END                    ");
            System.out.println("\n------------------------------------------------------------------\n");
        }
        else {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("YOU GOT CAUGHT CHEATING");
            System.out.println("\n\n           THE END                    ");
            System.out.println("\n------------------------------------------------------------------\n");
        }

    }

    public void notcheat() {
        int Min1 = 0;
        int Max1 = 100;

        //This gives a random number between 0 and 100, the higher the chance of passing the more likely they are to win at this game
        int madness = Min1 + (int) (Math.random() * ((Max1 - Min1) + 1));
        if (playerIQ < madness){
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("You passed, good job you made the right choices");
            System.out.println("\n\n           THE END                    ");
            System.out.println("\n------------------------------------------------------------------\n");
        }
        else {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("YOU FAILED");
            System.out.println("\n\n           THE END                    ");
            System.out.println("\n------------------------------------------------------------------\n");
        }

    }


}
