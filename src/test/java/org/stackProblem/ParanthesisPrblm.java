package org.stackProblem;

import java.util.Stack;

public class ParanthesisPrblm {
    public static void main(String[] args) {
        String str = "()({(})";
        System.out.println(isParanthesis(str));
    }

    static boolean isParanthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isOpening(c)) {
                stack.push(c);
            } else {
                if (stack.empty()) return false;
                else {
                    if (!isMatching(stack.pop(), c)) {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }

    static boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    static boolean isMatching(char actual, char expected) {
        return (actual == '(' && expected == ')') ||
                (actual == '{' && expected == '}') ||
                (actual == '[' && expected == ']');
    }
}
