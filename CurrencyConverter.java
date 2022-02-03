import java.util.*;
public class CurrencyConverter{
  public static void main(String[] args){
  Scanner muniCunvirter = new Scanner(System.in);
  Scanner again = new Scanner(System.in);
  boolean KeepGoing = true;

    while(KeepGoing){
  //Inputs  
  System.out.println("This is a currency converter.");
  System.out.println("Input an amount in USD:");
  int userCurrency = muniCunvirter.nextInt();
  System.out.println("Input a currency:");
  System.out.println("(Available currencies:Euro, Yen, Pounds, Renminbi, CAD, HKD, AUD)");
  String userInput = muniCunvirter.next();
  
  //Conversions
  if(userInput.equals("Euro")){
    double Euro = userCurrency * 0.89;
    System.out.println(userCurrency + "USD" + "--->" + Euro + "Euro(s)");
  } else if(userInput.equals("Yen")){
      double Yen = userCurrency * 114.70;
      System.out.println(userCurrency + "USD" + "--->" + Yen + "Yen");
  } else if(userInput.equals("Pounds")){
      double Pounds = userCurrency * 0.74;
      System.out.println(userCurrency + "USD" + "--->" + Pounds + "Pound(s)");
  } else if(userInput.equals("CAD")){
      double CAD = userCurrency * 1.27;
      System.out.println(userCurrency + "USD" + "--->" + CAD + "CAD");
  }else if(userInput.equals("HKD")){
      double HKD = userCurrency * 7.79;
      System.out.println(userCurrency + "USD" + "--->" + HKD + "HKD");
  }else if(userInput.equals("AUD")){
      double AUD = userCurrency * 1.40;
      System.out.println(userCurrency + "USD" + "--->" + AUD + "AUD");
  }else if(userInput.equals("Renminbi")){
      double CNY = userCurrency * 6.36;
      System.out.println(userCurrency + "USD" + "--->" + CNY + "Yuan");
  }else{
      System.out.println(userInput + " " + "is not a valid or available currency. Please try again.");
  }
  
  //Loop
  System.out.println("Run another conversion? (Please say 'Yes' or 'No')");
  String goAgain = again.nextLine();
  
  if(goAgain.equals("Yes")){
      KeepGoing = true;
  } else if(goAgain.equals("No")){
      System.out.println("Terminating the program (Goodbye...)");
      KeepGoing = false;
  }

}
  
  } 
}