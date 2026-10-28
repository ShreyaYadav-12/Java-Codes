package lec21;  // leetcode 22
import java.util.*;
class GenerateParentheses {
    public List<String> GenerateParentheses(int n) {
        List<String> ll=new ArrayList<>();
        GenerateP(n,0,0,"",ll);
        return ll;
    }
    public static void GenerateP(int n, int open, int close, String ans, List<String> ll)
    {
        if(open==n && close==n)
        {
            ll.add(ans);
            return;
        }
        if(open < n)
        {
            GenerateP(n,open+1,close,ans+"(",ll);
        }
        if(close<open)
        {
            GenerateP(n,open,close+1,ans+")",ll);
        }
    }
}
    
    // OR
////    public static void GenerateP(int n, int open, int close, String ans, List<String> ll)
//    {
//        if(open==n && close==n)
//        {
//            ll.add(ans);
//            return;
//        }
//        if(open > n || close > open)
//        {
//	          return;
//        }
//            GenerateP(n,open+1,close,ans+"(",ll);
//            GenerateP(n,open,close+1,ans+")",ll);
//    }
   
