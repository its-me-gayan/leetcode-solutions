package org.example;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 4/7/24
 * Time: 11:23 PM
 */
public class ArrayMerge {
    public static void main(String[] args) {
//        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int[] nums1 = new int[]{4,5,6,0,0,0};
        int[] nums2 = new int[]{1,2,3};
        merge(nums1,3,nums2,3);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n1) {
        int[] arr = new int[m+n1];
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, m, nums2.length);
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.arraycopy(arr, 0, nums1, 0, arr.length);
    }
}
