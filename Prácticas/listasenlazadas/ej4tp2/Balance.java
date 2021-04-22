public class Balance {

    public static void main(String[] args) {
        Balance b = new Balance();
    
        System.out.println(b.isBalanced("{(["));
        System.out.println(b.isBalanced(")}]"));
        System.out.println(b.isBalanced("{{{"));

        System.out.println(b.isBalanced("{()[()]}"));
        System.out.println(b.isBalanced("([{[()]}])"));
        System.out.println(b.isBalanced("([)]"));
    }

    public boolean isOpen(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public boolean isMatch(char open, char close) {
        return open == '(' && close == ')' || 
               open == '{' && close == '}' ||
               open == '[' && close == ']';
    }
    
    public boolean isBalanced(String s) {
        if (s == null || s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>(new ListaEnlazadaGenerica<>());

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isOpen(c)) {
                stack.push(c);
            } else {
                char last = stack.pop();
                if (!isMatch(last, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
