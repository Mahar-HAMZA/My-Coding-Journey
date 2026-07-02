import java.util.Stack;
public class Main{
    public static void main(String[] args) {
        String bracket="()[]{}";
        Stack<Character> stack=new Stack<>();

        for(int i=0; i < bracket.length(); i++){
            char current=bracket.charAt(i);
            if(current == '(' || current == '[' || current == '{'){
                stack.add(current);
            }
            else{
                if(stack.isEmpty()){
                    System.out.println("Invalid paranthesis!");
                    return;
                }
                char top=stack.peek();

                if(current == ']' && top == '[' || current == '}' && top == '{' || current == ')' && top == '('){
                    stack.pop();
                }
                else{
                    System.out.println("Invalid Paranthesis!");
                    return;
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("Valid Parenthesis!");
        }
        else{
            System.out.println("Invalid Parenthesis!");
        }
    }
}