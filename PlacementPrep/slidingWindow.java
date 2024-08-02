package PlacementPrep;

public class slidingWindow {

    public static void slidingWindow(int arr[]) {

        int left = 0;
        int sum = 0;
        int target = 5;

        for (int right = 0; right < arr.length; right++) {

            sum = sum + arr[right];

            while (sum > target && left < right) {

                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                System.out.println("founddd");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, -1,  3};

        slidingWindow(arr);
    }

}
