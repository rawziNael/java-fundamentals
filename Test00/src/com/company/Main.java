package com.company;
import java.util.Arrays;
//public class Main {
//
//    public static void main(String[] args) {
//        int[] inputArray = {1, 2, 4, 5};
//        int[] outputArray = insertShiftArray(inputArray, 99);
//
//        System.out.println(Arrays.toString(inputArray));
//        System.out.println(Arrays.toString(outputArray));
//    }
//
//        public static int[] insertShiftArray(int[] arr, int num) {
//            int[] shiftArr= new int[arr.length + 1];
//            int mid = (int) Math.ceil((double) arr.length / 2);
//            for (int i = 0; i < arr.length; i++) {
//                if (i < mid) {
//                    shiftArr[i] = arr[i];
//                }
//                shiftArr[mid] = num;
//                if (i >= mid) {
//                    shiftArr[i + 1] = arr[i];
//                }
//            }
//            return shiftArr;
//        }
//}
class Main {
    // [ [1, 2, 3], [3, 5, 7,9], [1, 7, 10] ]
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{3, 5, 7},{1, 7, 10}};
        System.out.println(summation(arr));
        int[] counter = summation(arr);
        for(int sumUp : counter){
            System.out.print(sumUp + " ,");
        }
    }

    public static int[] summation(int[][] arr){
        int[] sum = new int[arr.length] ;
        for(int i=0;i<arr.length;i++){ // [ [1, 2, 3](0), [3, 5, 7,9](1), [1, 7, 10] ]
            for(int j=0 ;j<arr[0].length;j++){ /// arr[1][0]
                sum[j] += arr[i][j];
            }
        }
        return sum;
    }
}

