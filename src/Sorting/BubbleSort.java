package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[]= {4,2,1,5,7};
        int size = nums.length;
        int temp =0;
        System.out.println("Before bubble sort");
        for(int num : nums){
            System.out.print(num + " ");
        }
        for(int i=0; i<size; i++){
            for(int j=0; j<size-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]= temp;
                }
            }
        }
        System.out.println();
        System.out.println("After bubble sort");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
