import java.util.Stack;

public class BraceChecker {
    public static boolean isValid(String braces) {
//                    "(})"
        String s1 = "([{";
        String s2 = ")]}";
        boolean boo=true;
        Stack<Character> stack = new Stack<Character>();
        for(int c=0 ; c<braces.length() ; c++){ // проход по входящей строке
            // char b1 = braces.charAt(c);
            for(int c1=0 ; c1<s1.length() ; c1++){
                if(braces.charAt(c)==s1.charAt(c1)){  // поиск окритой скобки
                    stack.push(braces.charAt(c));   // запись в стек
                }
                if(braces.charAt(c)==s2.charAt(c1)){    // если скобка закрития
                    if(stack.empty()){                  // стек пусто -лож
                        boo=false;
                    }
                    else if(stack.peek()==s1.charAt(c1)){//скобка соответствует скобке открития
                        stack.pop();
                    }
                    else boo=false;                 // в иных случаях -лож
                }
            }
        }
        return (stack.empty() && boo);

    }
}
