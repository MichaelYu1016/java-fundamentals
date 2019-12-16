package com.example.codeinterview;

/**
 * 剑指Offer
 *
 * @author ynx
 * @version V1.0
 * @date 2019-10-20
 * @modified_date 2019-10-20
 */
public class algorithm {

    /**
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完
     * 成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
     */
    public boolean find(int target, int[][] array) {
        if (array == null) {
            return false;
        }
        int row = 0;
        int column = array[0].length-1;

        while (row < array.length && column >= 0) {
            if (array[row][column] == target) {
                return true;
            }
            if (array[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }

    /**
     * 将一个字符串中的空格替换成“%20”
     */
    public String replaceSpace(StringBuffer str) {
        if (str == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")) {
                sb.append("%20");
            }else {
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}
