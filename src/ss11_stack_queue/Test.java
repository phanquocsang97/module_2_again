package ss11_stack_queue;

import java.util.Queue;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7};
        Stack<Integer> stack = CheckNumber.saveAsStack(arr);
        for (Integer i : stack) {
            System.out.println(i);
        }
        Queue<Integer> queue = CheckNumber.saveAsQueue(arr);
        for (Integer i : queue) {
            System.out.println(i);
        }

    }
}
