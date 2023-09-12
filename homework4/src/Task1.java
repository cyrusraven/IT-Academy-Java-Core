public class Task1 {
    public static void main(String[] args) {
        int num = 50;
        int count = 0;
        for (int i = num; i <= 90 ; i++) {
            if(isPrime(i)) {
                count++;
                if (count == 3) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }
        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
