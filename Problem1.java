public class Problem1{

     public static void main(String []args){
        
        System.out.println("The answer to problem 1 is: " + findSumOfMultiples(3, 5, 1000));
        
     }
     
     static int findSumOfMultiples(int a, int b, int target) {
         int sum = 0;
         
         for (int i = 0; i < target; i++) {
             if (i % a == 0 || (i % b == 0)) {
                 sum += i;
             }
         }
         
         return sum;
     }
     
}
