import java.util.*;

public class insertinheap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // Insert into heap (Heapify Up)
        public void add(int data) {
            arr.add(data);

            int x = arr.size() - 1; // child index
            int par = (x - 1) / 2; // parent index

            while (x > 0 && arr.get(x) < arr.get(par)) {
                // swap child and parent
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        // Get minimum element
        public int peek() {
            return arr.get(0);
        }

        // Heapify Down
        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx); // continue heapifying
            }
        }

        // Remove minimum element
        public int remove() {
            int data = arr.get(0);

            // swap root with last element
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // remove last element
            arr.remove(arr.size() - 1);

            // heapify from root
            if (!arr.isEmpty()) {
                heapify(0);
            }

            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String args[]) {
        Heap h = new Heap();

        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) { // heap sort - O(nlogn)
            System.out.println(h.peek());
            h.remove();
        }
    }
}
