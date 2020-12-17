public class MaxMin {
    public static void findMaxMin(int [] arr) {
        int max = Math.max(arr[0], arr[1]);
        int min = Math.min(arr[1], arr[0]);

        for(int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] > min) {
                continue;
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max: " + max + " Min: " + min);
    }

    public static void main(String[] args) {
        int [] a = {3, 5, 9,6, 4, 11, 2,20};
        findMaxMin(a);
    }
}
