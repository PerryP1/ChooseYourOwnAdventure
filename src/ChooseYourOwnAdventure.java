import java.util.Scanner;

public class ChooseYourOwnAdventure {

    Scanner stringReader = new Scanner(System.in);
    Scanner numberReader = new Scanner(System.in);
    Scanner choice = new Scanner(System.in);

    String masterBedroomStoryNo

    public ChooseYourOwnAdventure() {
        //START
        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" +
                "//\"kitchen\"?");

        System.out.print("Enter 'upstairs' or 'kitchen': ");
        String choice = stringReader.nextLine();
        if (choice.equals("upstairs")) {

        }
        if (choice.equals("kitchen")) {

        }
    }

    //A
    public void upstairsStory() {
        System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                "'bedroom'.  There is also a 'bathroom' off the hallway.  Where would you like to go?");

        System.out.print("Enter 'master bedroom' or 'bathroom': ");

        String upstairsChoice = stringReader.nextLine();

        //C
        if (upstairsChoice.equals("master bedroom")) {
            masterBedroomStory();
        }

        //D
        if (upstairsChoice.equals("bathroom")) {
            bathroomStory();
        }

    }

    //B
    public void kitchenStory() {
        System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                "or look in a \"cabinet\".");

        System.out.print("Enter 'refrigerator' or 'cabinet': ");

        //I
        String upstairsChoice = stringReader.nextLine();
        if (upstairsChoice.equals("refrigerator")) {
            refrigeratorStory();
        }
//J
        if (upstairsChoice.equals("cabinet")) {
            cabinetStory();
        }


    }

    //E
    public void masterBedroomStory() {
        System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                "like to open the door? (\"yes\" or \"no\")");

        System.out.print("Enter 'master bedroom' or 'bathroom': ");

        String upstairsChoice = stringReader.nextLine();
        //F
        if (upstairsChoice.equals("no")) {
            masterBedroomStoryNo("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                    "I'm tired of making nested if statements.");
        }
//G
        if (upstairsChoice.equals("yes")) {
            masterBedroomStoryYes("You Got sucked in and died");
        }


        public void kitchenStory () {
            System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                    "Would you like to eat some of the food? (\"yes\" or \"no\")");

            System.out.print("Enter 'yes' or 'no': ");

            String kitchenChoice = stringReader.nextLine();

            //M
            if (upstairsChoice.equals("no")) {
                kitchenChoiceNo("You die of starvation... eventually.\n");
            }

            //N
            if (kitchenChoice.equals("yes")) {
                kitchenChoiceYes("You Got sucked in and died");
            }


            public static void main (String[]args){
                new ChooseYourOwnAdventure();
            }}}}

 /*       System.out.println("Did you wake up today?");
        String answer = sc.nextLine();
*/




        /*Did you wake up today?
         * No: You Died
         *
         * Yes: Did you eat breakfast?
         * No: You will die of starvation
         *
         * Yes: Did you choke?
         * Yes: You died
         *
         * No: Did you*/


//Make a short "Choose Your Own Adventure" game. It should feature at least two options after the first page, at least two options for each of the two second-level pages, and at least two options for each of the four third-level pages, for a total of a minimum of eight possible destinations. (but we expect it to take you about 35 minutes so if you have more time, make more branches!)
//
//START (Example) => There should always be an ending prompt (did you survive?)
//
//Kitchen
//Open refrigerator
//Drink strange milk
//Eat leftovers
//Open cabinet
//Eat can of beans
//Take a plate
//Upstairs
//Bedroom
//Lay on bed
//Open the drawer
//Bathroom
//Look in mirror
//Use the toilet
//For this assignment, you should submit the link to your github repository.
//
//WELCOME TO MITCHELL'S TINY ADVENTURE!
//
//You are in a creepy house!  Would you like to go "upstairs" or into the
//"kitchen"?
//> kitchen
//
/*//There is a long countertop with dirty dishes everywhere.  Off to one side
//there is, as you'd expect, a refrigerator. You may open the "refrigerator"
//or look in a "cabinet".*/
//> refrigerator
//
//Inside the refrigerator you see food and stuff.  It looks pretty nasty.
//Would you like to eat some of the food? ("yes" or "no")
//> no
//
//You die of starvation... eventually.
//WELCOME TO MITCHELL'S TINY ADVENTURE!
//
//You are in a creepy house!  Would you like to go "upstairs" or into the
//"kitchen"?
//> upstairs
//
//Upstairs you see a hallway.  At the end of the hallway is the master
//"bedroom".  There is also a "bathroom" off the hallway.  Where would you like
//to go?
//> bedroom
//
//You are in a plush bedroom, with expensive-looking hardwood furniture.  The
//bed is unmade.  In the back of the room, the closet door is ajar.  Would you
//like to open the door? ("yes" or "no")
//> no
//
//Well, then I guess you'll never know what was in there.  Thanks for playing,
//I'm tired of making nested if statements.

/*
//if (response.contains.("upstiars)){
system.out.print.ln("youjust ran upstaties. bottom or closet?");
resonpse = keyboard.net();
if (response.contains("y")) {
ststem.ojut.prinln("you died. the end");
break;
}else if respnse.contains("N")) {
    System.out.prinln("dope");
    break;
    }
}

if respnse*/
