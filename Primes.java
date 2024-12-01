public class Primes {
    public static void main(String[] args) {
        int upTo = Integer.parseInt(args[0]);

        boolean[] numbers = new boolean[upTo+1];

        numbers[0] = false;
        numbers[1] = false;


        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = true;
        }

        for (int p = 2; p < Math.sqrt(upTo); p++) {
            if (p == 2 || p > 2 && numbers[p]) {
                for (int i = 3; i < numbers.length; i++) {
                    if (i != p && numbers[i]) numbers[i] = (i % p) != 0;
                }
            }
        }

        int count = 0;

        System.out.println("Prime numbers up to " + upTo + ":");

        for (int i = 2; i < upTo+1 ; i++) {
            if (numbers[i]) {
                count++;
                System.out.println(i);
            }
        }

        int percent = Math.round((float) count / upTo * 100);
        System.out.println("There are " + count + " primes between 2 and "
                            + upTo + " (" + percent + "% are primes)");

    }
}