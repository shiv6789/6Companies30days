import java.util.LinkedList;
import java.util.Stack;

class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack st = new Stack<String>();
        int ans = 0;

       

        int i = 0;
        int operand1 = 0;
        int operand2 = 0;
        while (i < tokens.length) {
            boolean digitFlag = true;
            if (tokens[i].equalsIgnoreCase("+") || tokens[i].equalsIgnoreCase("-") || tokens[i].equalsIgnoreCase("*")
                    || tokens[i].equalsIgnoreCase("/")) {
                digitFlag = false;
            }

            if (digitFlag) {
                st.push(tokens[i]);
            }
            else {
                operand1 = Integer.parseInt((String) st.pop());
                operand2 = Integer.parseInt((String) st.pop());

                if (tokens[i].equalsIgnoreCase("+")) {
               
                ans = operand1 + operand2;
                } else if (tokens[i].equalsIgnoreCase("-")) {
                
                ans = operand2 - operand1;
                } else if (tokens[i].equalsIgnoreCase("*")) {
            
                ans = operand1 * operand2;
            } else if (tokens[i].equalsIgnoreCase("/")) {

                ans = operand2 / operand1;
            }
                
            st.push(String.valueOf(ans));
            }
            

            i++;
        }
        
        ans = Integer.parseInt((String) st.peek());
        
        return ans;
    }
}