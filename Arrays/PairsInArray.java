package Arrays;

public class PairsInArray {
    public static void Pairs(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 4, 5, 7, 54 };

        Pairs(arr);

    }

}
