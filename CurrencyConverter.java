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
  System.out.println("(Available currencies:Euro, Yen, Pounds, Renminbi, Swedish Krona, Rupee, Czech Koruna, Mexican Peso, Swiss Franc, Dirham, SGD, TWD, KRW, NZD, CAD, HKD, AUD, NZD)");
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
  }else if(userInput.equals("NZD")){
    double NZD = userCurrency * 1.51;
    System.out.println(userCurrency + "USD" + "--->" + NZD + "NZD");
  }else if(userInput.equals("Swedish Krona")){
    double SEK = userCurrency * 9.21;
    System.out.println(userCurrency + "USD" + "--->" + SEK + "SEK");
  }else if(userInput.equals("Rupee")){
    double Rupee = userCurrency * 74.82;
    System.out.println(userCurrency + "USD" + "--->" + Rupee + "Indian Rupee");
  }else if(userInput.equals("Swiss Franc")){
    double CHF = userCurrency * 0.92;
    System.out.println(userCurrency + "USD" + "--->" + CHF + "Swiss Franc");
  }else if(userInput.equals("SGD")){
    double SGD = userCurrency * 1.35;
    System.out.println(userCurrency + "USD" + "--->" + SGD + "SGD");
  }else if(userInput.equals("NZD")){
    double NZD = userCurrency * 1.51;
    System.out.println(userCurrency + "USD" + "--->" + NZD + "NZD");
  }else if(userInput.equals("KRW")){
    double KRW = userCurrency * 1206.06;
    System.out.println(userCurrency + "USD" + "--->" + KRW + "Won");
  }else if(userInput.equals("Mexican Peso")){
    double Peso = userCurrency * 20.61;
    System.out.println(userCurrency + "USD" + "--->" + Peso + "Peso(s)");
  }else if(userInput.equals("TWD")){
    double TWD = userCurrency * 27.82;
    System.out.println(userCurrency + "USD" + "--->" + TWD + "TWD");
  }else if(userInput.equals("Czech Koruna")){
      double CK = userCurrency * 21.26;
      System.out.println(userCurrency + "USD" + "--->" + CK + "Czech Koruna");
  }else if(userInput.equals("Dirham")){
      double Dirham = userCurrency * 3.67;
      System.out.println(userCurrency + "USD" + "--->" + Dirham + "Dirham");
  } else{
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
  again.close();
  muniCunvirter.close();
  } 

}

/*
 2/2 Update:

Closed scanners
Added more currencies

2/3 Update: 
Added more currencies (Czech Koruna, UAE Dirham)
*/