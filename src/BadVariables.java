/**
 * Exercise 9 — Fix the Declarations
 *
 * SIX of the lines below are broken. Find them, fix them,
 * and add a comment on each fixed line saying what was wrong.
 *
 * One of them compiles fine but is still a bad idea. Find that one too.
 */
public class BadVariables {
    public static void main(String[] args) {

        int secondPlace = 5;    //Identifiers cannot begin with a number
        double price = 9.99;    //No parenthesis for a double
        boolean isReady = true; //No parenthesis for a boolean
        char grade = 'A';       //Use '' for characters instead of ""
        int gradeLevel = 11;    //Cannot use a class as a variable
        String name = "Sarah";  //Variables start with lowercase
        int studentScore = 95;  //Use camelCase and connect them, All variables need to be a singular word

        System.out.println("If this runs, you fixed them all.");
    }
}
