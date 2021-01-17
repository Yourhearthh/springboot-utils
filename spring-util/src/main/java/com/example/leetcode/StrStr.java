package com.example.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * 实现 strStr()
 */
public class StrStr {

    /**
     * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
     * 如果不存在，则返回  -1。
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (needle.isEmpty()) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        List<String> list0 = Arrays.asList(haystack.split(""));
        List<String> list = Arrays.asList(needle.split(""));
        String str = list.get(0);
        for (int i = 0; i < list0.size(); i++) {
            if (str.equals(list0.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int test(String a, String b) {
        if(null==a || null==b) {
            return -1;
        }
        if(0==b.length()) {
            return 0;
        }
        if(a.length()<b.length()){
            return -1;
        }

        for(int i=0;i<=a.length()-b.length();i++) {
            if(a.substring(i, b.length()+i).equals(b)) {
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

    }


}
