import java.util.Scanner;
public class currencyconverter{
    public static void main(String args[])
    {
        //conversion rates
        final double USD_TO_INR= 83.0;
        //1 USD =83 INR
        final double USD_TO_EUR= 0.92;
        //1 USD= 0.92 INR   
        final double USD_TO_GBP= 0.78;
        //1 USD =0.78 INR
        final double USD_TO_JPY= 148.0;
        //1 USD= 148.0 INR

        Scanner p =new Scanner(System.in);
        System.out.println("select currency you want to convert USD to:");
        System.out.println("1. INR (Indian Rupee)");
        System.out.println("2. EUR to (Euro)");
        System.out.println("3. GBP to (british pound)");
        System.out.println("4. JPY to (japanese yen)");
        System.out.println("enter your choice(1-4)");

        int choice =p.nextInt();
        System.out.println("Enter amount in USD");
        double usdAmount= p.nextDouble();
        double convertedAmount =0;
        String currency= " ";

        switch(choice){
            case 1:
            convertedAmount = usdAmount * USD_TO_INR;
            currency ="INR";
            break;
            case 2:
            convertedAmount =usdAmount *USD_TO_EUR;
            currency ="EUR";
            break;
            case 3:
            convertedAmount =usdAmount *USD_TO_GBP;
            currency ="GBP";
            break;
            case 4:
            convertedAmount =usdAmount * USD_TO_JPY;
            currency ="JPY";
            break;
            default:

            System.out.println("Invalid choice ! Please restart the program and select valid option");
            p.close();
            return;
        }
         
        System.out.printf("converted Amount: % 2f %s \n" , convertedAmount , currency);
        p. close();
    }
}


        
        
    
