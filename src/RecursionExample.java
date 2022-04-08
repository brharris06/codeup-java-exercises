public class RecursionExample {


    public static void recur(int n) {
        System.out.println("Runs for " + n + " times");
        if (n == 10_000) { // base case
            return;
        }
        recur(n + 1);
    }

    // public static int countUpToNumber(int count) {
    //     System.out.println(count);
    //     if (count == 100) {
    //         return count;
    //     }
    //     return countUpToNumber(count + 1);
    // }

    public static int countDownToNumber(int count) {
        System.out.println(count);
        if (count == 50) {
            return count;
        }
        return countDownToNumber(count - 1);
    }

    public static void main(String[] args) {
        // recur(1);
        // countUpToNumber(50);
        // countDownToNumber(49);

    }

}
