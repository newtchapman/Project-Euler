public class Problem6{

     public static void main(String []args){
        System.out.println("The answer to Problem 6 is: " + findSquareSum(100));
     }
     
     static int findSquareSum(int last) {
         int sumOfSquares = 0;
         int squareOfSum = 0;
         for (int i = 1; i <= last; i++) {
             sumOfSquares += i*i;
             squareOfSum += i;
         }
         squareOfSum = squareOfSum * squareOfSum;
         
         return squareOfSum - sumOfSquares;
         
     }
     
}
