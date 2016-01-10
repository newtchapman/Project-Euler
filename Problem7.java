public class Problem7{

     public static void main(String []args){
        System.out.println("The answer to Problem 7 is: " + findPrimeToX(10001));
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
