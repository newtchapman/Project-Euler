public class Problem4{

     public static void main(String []args){
         int largest = 0;
         for (int i = 100; i < 1000; i++) {
             for (int j = 100; j < 1000; j++) {
                 int next = findLargestPalindromeProduct(i, j);
                 if (next > largest) {
                     largest = next;
                 }
             }
         }
         System.out.println("The answer to puzzle 4 is " + largest + ".");
     }
     
     static int findLargestPalindromeProduct(int a, int b) {
         int front = a * b;
         String num = Integer.toString(front);
         StringBuilder backwards = new StringBuilder();
         int largest = 0;
         
         for (int i = num.length()-1; i >= 0; i--) {
             backwards.append(num.charAt(i)); 
         }
         
         if (num.equals(backwards.toString())) {
            largest = Integer.valueOf(backwards.toString());
         }
         return largest;
         
     }
}
