package Recursion;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Subsequences {
static void getAllSubsequences(String s, int index , StringBuilder output,List<String> ans){
    if (index >= s.length()) {
        String subsequence = output.toString();
        ans.add(subsequence);
        return;
    }
    //include-exclude pattern
    char ch = s.charAt(index);
    //include
    output.append(ch);
    getAllSubsequences(s, index+1, output, ans);
    //exclude
    output.deleteCharAt(output.length()-1);
    getAllSubsequences(s, index+1, output, ans);
}

public static List<String> powerSet(String s){
    List<String> ans = new ArrayList<>();
    StringBuilder output = new StringBuilder();
    int index = 0;

    getAllSubsequences(s, index, output, ans);
    Collections.sort(ans);
    return ans;
}

public static void main(String[] args) {
    String s = "abc";
    List<String> ans = new ArrayList<>();
    ans.addAll(powerSet(s));
    System.out.println(ans);
}
    
}