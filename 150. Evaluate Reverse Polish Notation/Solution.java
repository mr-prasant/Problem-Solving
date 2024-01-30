class Solution {

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String t: tokens) {
            if (t.length() > 1 || (t.charAt(0) >= '0' && t.charAt(0) <= '9')) {
                stack.push(Integer.parseInt(t));
                continue;
            }

            int num2 = stack.pop();
            int num1 = stack.pop();
            switch (t.charAt(0)) {
                case '+': stack.push(num1+num2);
                    break;
                case '-': stack.push(num1-num2);
                    break;
                case '*': stack.push(num1*num2);
                    break;
                case '/': stack.push(num1/num2);
            }
        }

        return stack.pop();
    }
}