public class Problem5{

     public static void main(String []args){
        System.out.println("The answer to puzzle 5 is: " + smallestMultiple(1,21));
     }
     
     static int smallestMultiple(int range1, int range2) {
         int count = 0;
         int answer = 0;
         for (int j = range2; j < Integer.MAX_VALUE; j++) {
             for (int i = range1; i < range2; i++) {
                 if ((j % i) == 0) {
                     count++;
                 } else {
                     count = 0;
                     break;
                 }
             }
          if (count == 20) {
              answer = j;
              break;
          }
      }
         return answer;
     }
     
}
