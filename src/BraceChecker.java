import java.util.Stack;

public class BraceChecker {
    public static boolean isValid(String braces) {
        String s1 = "([{";
        String s2 = ")]}";
        boolean boo=true;
        Stack<Character> stack = new Stack<Character>();
        for(int c=0 ; c<braces.length() ; c++){
            // char b1 = braces.charAt(c);
            for(int c1=0 ; c1<s1.length() ; c1++){
                if(braces.charAt(c)==s1.charAt(c1)){
                    stack.push(braces.charAt(c));
                }
                if(braces.charAt(c)==s2.charAt(c1)){
                    if(stack.empty()){
                        boo=false;
                    }
                    else if(stack.peek()==s1.charAt(c1)){
                        stack.pop();
                    }
                }
            }
        }
        return (stack.empty() && boo);

    }
}
