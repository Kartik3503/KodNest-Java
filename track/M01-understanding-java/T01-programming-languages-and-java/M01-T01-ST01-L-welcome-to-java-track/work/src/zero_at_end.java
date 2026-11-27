//this is the programm of the problem in which we move all the zero element of array
//at the end of the array elements and it is used to describe the sustained way of it.

//this is the optimal approach of this problem and its time complexitiy is O(N)
//Space complexity is O(1).
import java.util.Scanner;
import java.util.Arrays;

public class zero_at_end {
    public static int[] moveZeros(int[] nums) {
        int n = nums.length;
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return nums;
        }
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int num = sca.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter yiur value for index " + i + ": ");
            nums[i] = sca.nextInt();
        }
        System.out.println(Arrays.toString(moveZeros(nums)));
    }

}

// brute force approach

// here we will take first an temproary array and then start chaecking in the
// array for
// non-zero element and store it into that temprory array and after getting all
// the iteration of array
// we will merge the temproary array to the front of the main array.

// algorithm
// int n = nums.length;

// int[] temp ; new int[n];

// for( i = 0 ; i, n ; i++){
// if(nums[i] != 0){
// temp.add(nums[i]);
// }
// }
// then step 2 will be
// for(int i = 0 ; i< temp.size() ; i++ )
// {
// nums[i] == temp[i];

// }
// //non zero = temp. size

// Step 3 will be
// for(i = 0 ; i < n ; i++){
// arr[i] ==0;
// }