package leecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 636 函数独占时间
 */
public class Solution636 {

    public static int[] exclusiveTime(int n, List<String> logs) {
        int[] ret = new int[n];
        Stack<Integer> stack = new Stack<>();
        int pre = 0;
        for (String s:logs){
            String[] arr = s.split(":");
            int id = Integer.parseInt(arr[0]);
            int curr = Integer.parseInt(arr[2]);
            if ("start".equals(arr[1])){
                if (!stack.isEmpty()){
                    ret[stack.peek()] += curr - pre;
                }
                stack.push(id);
                pre = curr;
            } else {
                ret[stack.peek()] += curr - pre + 1;
                stack.pop();
                pre = curr + 1;
            }
        }
        return ret;
    }

    public static void main(String[] args){
        List list = new ArrayList();
        list.add("0:start:0");
        list.add("1:start:2");
        list.add("1:end:5");
        list.add("0:end:6");
        exclusiveTime(2,list);
    }
}
