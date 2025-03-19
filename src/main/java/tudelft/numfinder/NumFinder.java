package tudelft.numfinder;

public class NumFinder {
    private Integer smallest = null;
    private Integer largest = null;

    public void find(int[] nums) {
        if (nums.length == 0) {
            smallest = null;
            largest = null;
            return;
        }

        smallest = nums[0];
        largest = nums[0];

        for (int n : nums) {
            if (n < smallest) {
                smallest = n;
            }
            if (n > largest) {
                largest = n;
            }
        }
    }

    public Integer getSmallest() {
        return smallest;
    }

    public Integer getLargest() {
        return largest;
    }
}
