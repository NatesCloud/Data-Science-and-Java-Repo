import java.util.*;

public class FindPrimes {

    int primeRange;
    ArrayList<Integer> primes = new ArrayList<Integer>();
    
    public FindPrimes(){
        primeRange = 100;
        for (int i = 0; i < primeRange; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
    }

    public FindPrimes(int p) {
        primeRange = p;
        for (int i = 0; i < primeRange; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
    }

    public boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> getPrimes() {
        return primes;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Prime numbers 1-100:");
        FindPrimes myPrimes = new FindPrimes(100);
        System.out.println(myPrimes.getPrimes());
        System.out.println();
        }
    }
