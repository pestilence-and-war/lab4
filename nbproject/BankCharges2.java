import java.util.*;

class BankCharges2 {
    
    public static String BankCharges(int checks){
        double BankCharges = 10;
        
        while (true) {

      if (checks < 20) {
        double totalCharges = BankCharges + (checks * .10);
        String output = ("Your total due this month is $" + totalCharges);
        return output;

      } else if (checks >= 20 && checks < 40) {
        double totalCharges = BankCharges + (checks * .08);
        String output = ("Your total due this month is $" + totalCharges);
        return output;

      } else if (checks >= 40 && checks < 60) {
        double totalCharges = BankCharges + (checks * .06);
        String output = ("Your total due this month is $" + totalCharges);
       return output;

      } else if (checks >= 60) {
        double totalCharges = BankCharges + (checks * .04);
        String output = ("Your total due this month is $" + totalCharges);
        return output;

      }
    }
    }
  public static void main(String[] args) {
      
    Scanner UserInput = new Scanner(System.in);
    
    System.out.println("How many Checks did you write?");
    int checks = UserInput.nextInt();
    System.out.println(BankCharges(checks));

  }
}