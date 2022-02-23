import java.util.Scanner;
public class BackwardsCurrencyConverter {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Scanner two = new Scanner(System.in);
        boolean restart = true;

        while(restart){
        System.out.println("This is a Currency Converter(Currency --> USD)");
        System.out.println("Enter a Currency to convert");
        System.out.println("(Available currencies: Euro, Yen, Pounds, Renminbi, Fijian Dollar, Hungarian Forint, Danish Krone, Rupiah, Swedish Krona, Rupee, Mexican Peso, Swiss Franc, SGD, TWD, KRW, NZD, CAD, HKD, AUD, NZD)");
        String userInput = sc.next();
        System.out.println("Enter an amount in " + userInput);
        double currency = sc.nextDouble();

    if(userInput.equals("Euro")){
        double euroconvert = currency * 1.13;
        System.out.println(currency + "Euro" + "--->" + euroconvert + "USD");
    }else if(userInput.equals("Yen")){
        double yenconvert = currency * 0.0087;
        System.out.println(currency + "Yen" + "--->" + yenconvert + "USD");
    }else if(userInput.equals("Pounds")){
        double poundconvert = currency * 1.35;
        System.out.println(currency + "Pounds" + "--->" + poundconvert + "USD");
    }else if(userInput.equals("CAD")){
        double cadconvert = currency * 0.79;
        System.out.println(currency + "CAD" + "--->" + cadconvert + "USD");
    }else if(userInput.equals("HKD")){
        double hkconvert = currency * 0.13;
        System.out.println(currency + "HKD" + "--->" + hkconvert + "USD");
    }else if(userInput.equals("AUD")){
        double audconvert = currency * 0.72;
        System.out.println(currency + "AUD" + "--->" + audconvert + "USD");
    }else if(userInput.equals("Renminbi")){
        double renconvert = currency * 6.31;
        System.out.println(currency + "Yen" + "--->" + renconvert + "USD");
    }else if(userInput.equals("NZD")){
        double nzdconvert = currency * 0.68;
        System.out.println(currency + "NZD" + "--->" + nzdconvert + "USD");
    }else if(userInput.equals("Swedish Krona")){
        double kronaconvert = currency * 0.11;
        System.out.println(currency + "Krona" + "--->" + kronaconvert + "USD");
    }else if(userInput.equals("Rupee")){
        double rupeeconvert = currency * 0.013;
        System.out.println(currency + "Rupee" + "--->" + rupeeconvert + "USD");
    }else if(userInput.equals("Swiss Franc")){
        double francconvert = currency * 1.09;
        System.out.println(currency + "Franc" + "--->" + francconvert + "USD");
    }else if(userInput.equals("SGD")){
        double sgdconvert = currency * 0.74;
        System.out.println(currency + "SGD" + "--->" + sgdconvert + "USD");
    }else if(userInput.equals("KRW")){
        double krwconvert = currency * 0.00084;
        System.out.println(currency + "KRW" + "--->" + krwconvert + "USD");
    }else if(userInput.equals("Mexican Peso")){
        double Peso = currency * 0.049;
        System.out.println(currency + "Peso(s)" + "--->" + Peso + "USD");
    }else if(userInput.equals("TWD")){
        double twdconversion = currency * 0.036;
        System.out.println(currency + "TWD" + "--->" + twdconversion + "USD");
    }else if(userInput.equals("Rupiah")){
        double rupiahconvert = currency * 0.000070;
        System.out.println(currency + "Rupiah" + "--->" + rupiahconvert + "USD");
    }else if(userInput.equals("Hungarian Forint")){
        double forintconvert = currency * 0.0031;
        System.out.println(currency + "Forint" + "--->" + forintconvert + "USD");
    }else if(userInput.equals("Danish Krone")){
        double kroneconvert = currency * 0.15;
        System.out.println(currency + "Krone" + "--->" + kroneconvert + "USD");
    }else if(userInput.equals("Fijian Dollar")){
        double fijiconvert = currency * 0.47;
        System.out.println(currency + "Dollar(s)" + "--->" + fijiconvert + "USD");
    }else{
        System.out.println("Error. Please try again.");
    }

System.out.println("Restart Converter?");
String restartInput = two.nextLine();

if(restartInput.equals("Yes")){
    restart = true;
    System.out.println("Restarting...");
}else if(restartInput.equals("No")){
    restart = false;
    System.out.println("Terminating the loop (Goodbye...)");
}else if(restartInput.equals("yes")){
    restart = true;
    System.out.println("Restarting...");
}else if(restartInput.equals("no")){
    restart = false;
    System.out.println("Terminating the loop (Goodbye...)");
}else{
    restart = true;
    System.out.println("Invalid input (Assuming you said 'Yes' because we're nice)");
}
} 
sc.close();
two.close();

    }

}
    

