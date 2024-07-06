package Arrays;

public class TrappingRainwater {

    public static int rainwater(int height[]) {

        // calulate left and right max boundary

        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // loop

        // calculte trapped water = min(left and right max boundary) - (height of bar)
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];

        }

        return trappedWater;

    };

    public static void main(String[] args) {

        int height[] = { 2, 5, 7, 0, 3, 8, 3 };

        System.out.println(rainwater(height));

    }

}
