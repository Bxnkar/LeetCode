// leetcode 42
public class TrappedRainWater{
    public static int paanipaani(int height[]){
        int n = height.length;
        // left max
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i=1;i<n;i++){
            // leftMax[i] = Math.max(leftMax[i-1], height[i]);
            leftMax[i] = height[i]>leftMax[i-1]?height[i]:leftMax[i-1];
        }
        // right max
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2;i>=0;i--){
            // rightMax[i] = Math.max(height[i], rightMax[i+1]);
            rightMax[i] = height[i]>rightMax[i+1]?height[i]:rightMax[i+1];
        }
        // loop
        int paani = 0;
        for (int i=0;i<n;i++){
          //  int waterLevel = Math.min(leftMax[i], rightMax[i]);
            int waterLevel = leftMax[i]>rightMax[i]?rightMax[i]:leftMax[i];
            paani += waterLevel - height[i];
        }

        return paani;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(paanipaani(height));
    }
}