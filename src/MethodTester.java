public class MethodTester {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis( ); //

        int[] numbersArray = {-1, 12, -3, 14, -4, 3};
          System.out.println("Maximum Sum 1: " + algo1(numbersArray));

        long endTime = System.currentTimeMillis( ); // record the ending time
        long elapsed = endTime - startTime;

           System.out.println("RunTime: " + elapsed);

    }
    public static int algo1(int[] numbers) {
        int maximumSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += numbers[k];
                }
                if (sum > maximumSum) {
                    maximumSum = sum;
                }
            }
        }
        return maximumSum;

    }


}



