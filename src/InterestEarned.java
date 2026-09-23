public class InterestEarned {
    public static void main(String[] args) {
        System.out.println(CalculateInterestEarned(1000, 5, 0.05));
    }
    // formula for remining balance of loan
public static double CalculateInterestEarned(double principal, int loanTerm, double interestRate) {
    //double stores an integer with decimals, while int stores a whole number
    double balance = principal;
    //for every run do this
    //Apply compound interest once for each year.
    for (int i = 0; i < loanTerm; i++) {
        balance = balance + (balance * interestRate);
    }
    //Return only the growth, excluding the original princpal.
    return balance - principal;
    //remember the closing bracket
}
    
}
