package com.example.codeinterview;
/**
 * 打印从1到N位数的最大值
 */
public class printToMaxNDigit {
    public static void main(String[] args) {
        printMaxNDigit(2);
    }

    public static void printMaxNDigit(int n) {
        int[] array = new int[n];
        if (n < 0) {
            return;
        }
        printArray(array,0);
    }

    public static void printArray(int[] array, int n) {
        for (int i = 0;i<10;i++) {
            if (n != array.length){
                array[n] = i;
                printArray(array, n+1);
            }else{
                boolean isFirstNo = false;
                for (int j = 0; j <array.length;j++){
                    if(array[j]!=0){
                        System.out.println(array[j]);
                        if(!isFirstNo){
                            isFirstNo = true;
                        }
                    }else{
                        if(isFirstNo){
                            System.out.println(array[j]);
                        }
                    }
                }
                System.out.println();
                return;
            }
        }
    }
}