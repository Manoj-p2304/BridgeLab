import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CouponNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of distinct coupon numbers (N): ");
        int n = scanner.nextInt();

        int totalRandomNumbers = generateDistinctCoupons(n);

        System.out.println("Total random numbers needed to have all distinct numbers: " + totalRandomNumbers);

        scanner.close();
    }

    // Function to generate random distinct coupon numbers
    private static int generateDistinctCoupons(int n) {
        Set<Integer> distinctCoupons = new HashSet<>();
        Random random = new Random();
        int totalRandomNumbers = 0;

        while (distinctCoupons.size() < n) {
            int randomNumber = random.nextInt(Integer.MAX_VALUE);
            totalRandomNumbers++;

            if (distinctCoupons.add(randomNumber)) {
                System.out.println("Generated Coupon: " + randomNumber);
            }
        }

        return totalRandomNumbers;
    }
}
