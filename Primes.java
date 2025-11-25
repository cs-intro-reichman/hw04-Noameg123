public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        
        int n = Integer.parseInt(args[0]);
        boolean[] resultarr = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            resultarr[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (resultarr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    resultarr[j] = false;
                }
            }
        }

        int count = 0;

        System.out.println("Prime numbers up to " + n + ":");

        for (int i = 2; i <= n; i++) {
            if (resultarr[i]) {
                System.out.println(i);   // ← Print the prime number
                count++;
            }
        }

        double percent = 100.0 * count / n;

        System.out.println(
                "There are " + count + " primes between 2 and " + n +
                " (" + (int)percent + "% are primes)");

            }
        }
    