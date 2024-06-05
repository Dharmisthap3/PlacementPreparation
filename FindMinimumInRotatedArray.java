//9. suppose an array of lenght n sorted in acending order is order is rotated between 1 and n times.
public class FindMinimumInRotatedArray {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 1, 2 };
        int ans = binarySearch(nums);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
