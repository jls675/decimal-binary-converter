import java.util.Scanner;

public class Bin{
   public static void main(String args[]){
      //BinConvert c = new BinConvert(100110, false);

      boolean on = true;

      System.out.println("\n--Welcome to this Program\n--You can Turn decimals to binary and vice versa\n\n");

      do {

         System.out.println("Options:\n[1]-->Decimal to Binary\n[2]-->Binary to decimal\n[3]-->Exit");

         int choice = getChoice();
         int number = getNumber(choice);

         if (choice == 1){
            BinConvert c = new BinConvert(number, true);
         }
         else if (choice == 2){
            BinConvert c = new BinConvert(number, false);
         }
         else{
            on = !on;
         }

      }while (on);

   }
   public static int getChoice(){
      Scanner scan = new Scanner(System.in);
      while (true){
         System.out.print("[ ]--> ");
         int choice = scan.nextInt();
         if (choice == 1 || choice == 2 || choice == 3){
            return choice;
         }
         else{
            System.out.println("--This choice is not acceptable\n--Type again");
         }
      }
   }
   public static int getNumber(int choice){
      Scanner scan = new Scanner(System.in);
      String num;
      if (choice == 1){
         System.out.println("Input a decimal number--> ");
         while (true){
            num = scan.nextLine();
            try{
               int number = Integer.parseInt(num);
               return number;
            }catch (NumberFormatException e){
               System.out.println(num + " is not an integer");
            }
         }
      }
      else if (choice == 2){
         System.out.println("Input a binary number--> ");
         while (true){
            num = scan.nextLine();
            String[] a = num.split("");
            boolean isBinary = true;
            for (int x = 0; x < a.length; x++){
               if (!(a[x].equals("1") || a[x].equals("0"))){
                  isBinary = false;
                  break;
               }
            }
            if (isBinary){
               return Integer.parseInt(num);
            }
            System.out.println(num + " is not a binary number!");
         }
      }
      else{
         System.out.println("You have chosen to Exit");
         return 0;
      }
   }
}
