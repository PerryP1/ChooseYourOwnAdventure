import java.util.Scanner;

public class ChooseYourOwnAdventure {

    Scanner stringReader = new Scanner(System.in);
    Scanner numberReader = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
//START
        System.out.print("You are in a creepy house!  Would you like to go upstairs or into the kitchen?" + " Please Pick one type kitchen or upstairs");
        String choice = reader.nextLine();
        System.out.println(choice);
//A
        if (choice.equals("upstairs")) {
            System.out.print("We are upstairs, go to bedroom or bathroom?\n");
            choice = reader.nextLine();
//C
            if (choice.equals("bedroom")) {
                System.out.print("Look in closet or don't look in closet, yes or no?");
                choice = reader.nextLine();
//E
                if (choice.equals("yes")) {
                    System.out.print("Looked in closet =>You looked, closet monster got you. Press ENTER to exit.");
                    choice = reader.nextLine();
                }
//F
                if (choice.equals("no")) {
                    System.out.print("Don 't look in closet => You didn' t look, but you lived out of style. Press ENTER to exit.");
                    choice = reader.nextLine();
                }
            }
//D
            if (choice.equals("bathroom")) {
                System.out.print("We are in bathroom, use the toilet, yes or no?\n");
                choice = reader.nextLine();
//G
                if (choice.equals("yes")) {
                    System.out.print("You used the toilet. You pooped, died of explosive diarrhea! \uD83D\uDCA9 Press ENTER to exit.\n");
                    choice = reader.nextLine();
                }
//H
                if (choice.equals("no")) {
                    System.out.print("You didn't poop, but you lived constipated...Press ENTER to exit, you'll have to poop eventually.");
                    choice = reader.nextLine();
                }
            }
        }
//B
        if (choice.equalsIgnoreCase("kitchen")) {
            System.out.print("We are in kitchen, look in the fridge or the cabinet\n");
            choice = reader.nextLine();
//I
            if (choice.equals("fridge")) {
                System.out.print("We are in the fridge. Eat food, or don 't eat fridge food, yes or no?");
                choice = reader.nextLine();
//K
                if (choice.equals("yes")) {
                    System.out.print("We ate the fridge food. You ate moldy fridge food, you're poisoned. Press ENTER to exit.");
                    choice = reader.nextLine();
                }
//L
                if (choice.equals("no")) {
                    System.out.print("You didn't eat the cabinet food. You may eventually starve. Press ENTER to exit.");
                    choice = reader.nextLine();
                }
//J
            }
            if (choice.equals("cabinet")) {
                System.out.print("We are in the cabinet. Eat food, yes or no?");
                choice = reader.nextLine();
//M
                if (choice.equals("yes")) {
                    System.out.print("You ate the cabinet food. You were poised. Press ENTER to exit.");
                    choice = reader.nextLine();
                }
//N
                if (choice.equals("no")) {
                    System.out.print("You didn't eat the cabinet food. You may eventually starve. Press ENTER to exit.");
                    choice = reader.nextLine();

                }
            }
        }
    }
}

        /*
        // First decision: upstairs or kitchen
                //A Upstairs: bedroom or bathroom
                        //C Bedroom: look in closet or don't look in closet
                                        //E: Looked in closet => You looked, closet monster got you
                                        //F: Don't look in closet => You didn't look, but you lived out of style
                        //D Bathroom: use toilet or don't use toilet
                                        //G You pooped, died of explosive diarrhea
                                        //H You didn't poop, but you lived constipated
                //B Kitchen: Look in the fridge or the cabinet
                        //I Eat food, or don't eat fridge food?
                                        //K You ate moldy fridge food, you're poisoned
                                        //L You did not eat the fridge food, you starved
                        //J You looked into the cabinet, eat food?
                                       //M you ate old cabinet food, you died
                                       //N you did not eat cabinet food, you starved

*/