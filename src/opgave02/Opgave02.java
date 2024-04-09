package opgave02;

import opgave01.models.ArrayListStack;

public class Opgave02 {
    public static void main(String[] args) {
        String testString = "(3+{5{99{*}}[23[{67}67]]})";
        String testString2 = "(}){";

        System.out.println("The string testString is legal:" + correctParanchesUseTest(testString));
        System.out.println("The string testString2 is legal:" + correctParanchesUseTest(testString2));

    }
    public static boolean correctParanchesUseTest(String testString) {
        ArrayListStack<Character> stack = new ArrayListStack<Character>();
        for(char ch : testString.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{' ) {
                stack.push(ch);
                System.out.print(ch);
            }
            switch(ch) {
                case ')' -> {
                    if(stack.peek() == '(') stack.pop();
                }
                case ']' -> {
                    if(stack.peek() == '[') stack.pop();
                }
                case '}' -> {
                    if(stack.peek() == '{') stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
