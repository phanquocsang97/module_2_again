package ss11_stack_queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class CheckNumber {
    public static boolean checkPrimeNumber(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Stack<Integer> saveAsStack(int[] numberArray) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numberArray.length; i++) {
            if (checkPrimeNumber(numberArray[i])) {
                stack.push(numberArray[i]);
            }
        }
        return stack;
    }

    public static Queue<Integer> saveAsQueue(int[] number) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < number.length; i++) {
            if (checkPrimeNumber(number[i])) {
                queue.add(number[i]);
            }
        }
        return queue;
    }
}
