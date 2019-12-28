package com.example.codeinterview;

/**
 * 调整数组数字顺序，奇数位于数组前半部分，偶数位于后半部分
 */
public class ReOrderArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        for(int i : array){
            System.out.println(i);
        }
        reOrderArray(array);
        for(int j : array) {
            System.out.println(j);
        }
        
    }

    public static void reOrderArray(int[] array){
        if(array == null){
            return;
        }

        for(int i = 1; i<array.length; i++){
            int temp = array[i];
            int j = i - 1;
            if(array[i] % 2 != 0){
                while(j >= 0 ){
                    if(array[j] % 2!=0){
                        break;
                    }
                    if(array[j] % 2==0){
                        int t = array[j+1];
                        array[j+1] = array[j];
                        array[j]=t;
                        j--;
                    }
                }
            }
            array[j+1] = temp;
        }
    }
}