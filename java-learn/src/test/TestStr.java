package test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author baoguangyu
 * @Date 2021/6/10 19:37
 * @Version 1.0
 */
public class TestStr {

    public static int lengthOfLastWord(String s) {
        if (s.equals(" ") || s==null) {
            return 0;
        }
        s = s.trim();
        String[] str = s.split(" ");
        List<String> list = Arrays.asList(str);
        String ss = list.get(list.size()-1);
        return ss.length();

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world      beautiful    "));
    }



}
