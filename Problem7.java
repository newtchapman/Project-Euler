public class Problem7{

     public static void main(String []args){
        long start = System.nanoTime();
        System.out.println("The answer to Problem 7 is: " + findPrimeToX(10001));
        long end = System.nanoTime();
        System.out.println("Program completed in " + (end - start) / 1000000 + " MS.");
     }
     
     static int findPrimeToX(int stop) {
        int count = 3;//first 3 primes are ignored during loop
        int finalPrime = 0;
            for (int i = 2; i < Integer.MAX_VALUE; i++) {
                    for (int j = 2; j < i/2; j++) {
                        if ((i % j ) != 0) {
                            if (j == i/2-1) {
                                count++;
                            }
                            if (count == 10001) {
                                finalPrime = i;
                                break;
                            }
                            continue;
                        } else {
                            break;
                        }
                    }
                    if (count == 10001) {
                        break;
                    }
            }
        return finalPrime;
     }
     
     
}
