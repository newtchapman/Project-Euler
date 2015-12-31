public class Problem2{

     public static void main(String []args){
        
        System.out.println("The answer to problem 2 is: " + findSumOfFibonacci(1, 2, 4000000));
        
     }
     
     static int findSumOfFibonacci(int fib1, int fib2, int target) {
         
         int nextFib = 0;
         int sum = fib2; //start sum at fib2 because our loop doesn't take the first even number into account..
         
         for (int i = fib1; i < target; i = fib1) {
             nextFib = fib1 + fib2;
             if (nextFib % 2 == 0) {
                 sum += nextFib;
             }
             fib1 = fib2;
             fib2 = nextFib;
         }
         
         return sum;
     }
     
}
