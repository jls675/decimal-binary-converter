public class BinConvert {

   private String decimal;
   private String binary;
   private final int BASE = 2;

   public BinConvert(int n, boolean option){
      if (option) {
         this.decimal = Integer.toString(n);
         this.binary = decimalToBinary(n, "");
      }
      else{
         this.binary = Integer.toString(n);
         this.decimal = binaryToDecimal(this.binary);
      }
      printString();
   }
   public String decimalToBinary(int n, String k){

      if (n != 0){
         int r = n % BASE;
         if (r == 0) {
            n /= BASE;
         }
         else {
            n = (n-1) / BASE;
         }
         return decimalToBinary(n, (Integer.toString(r) + k));
      }

      return (k.equals("")) ? "0" : k;
   }

   public String binaryToDecimal(String b){
      double i = -1;
      double value = 0;
      String[] a = b.split("");
      for (int x = b.length() - 1; x >= 0; x--){
         value += (Integer.parseInt(a[x]) * Math.pow(BASE, ++i));
      }
      return Double.toString(value);
   }

   public void printString(){
      System.out.println("decimal: " + this.decimal + " | binary: " + this.binary);
   }
}
