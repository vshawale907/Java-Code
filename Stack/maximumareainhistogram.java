import java.util.Stack;

public class maximumareainhistogram {

    public static void maxArea(int arr[]) {
        int n = arr.length;
        int nsr[] = new int[n]; // Next Smaller Right
        int nsl[] = new int[n]; // Next Smaller Left

        Stack<Integer> s = new Stack<>();

        // Find NSR
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = n; // no smaller to the right → boundary
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // clear stack for NSL
        s.clear();

        // Find NSL
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1; // no smaller to the left → boundary
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Calculate max area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }

        System.out.println("Maximum area in histogram: " + maxArea);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        maxArea(arr); // Expected output → 10 (rectangle formed by heights 5 & 6)
    }
}
