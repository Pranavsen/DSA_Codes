import java.util.*;

class CheckParanthesis {
    public static boolean paranthesisCheck(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char it : s.toCharArray()) {
            if (it == '[' || it == '{' || it == '(') {
                st.push(it);
            } else {
                if (st.isEmpty())
                    return false;
                char ch = st.pop();
                if ((it == ']' && ch == '[') || (it == '}' && ch == '{') || (it == ')' && ch == '('))
                    continue;
                else
                    return false;

            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[{()}]";
        boolean ans = paranthesisCheck(s);
        if (ans) {
            System.out.println(s + " are balanced.");
        } else {
            System.out.println(s + " not balanced.");
        }
    }
}