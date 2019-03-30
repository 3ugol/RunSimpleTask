class ArithmeticFunction {  // Калькулятор
    public static int arithmetic(int a, int b, String operator) {
       if (operator.equals("add")) return a+b;
       if (operator.equals("subtract")) return a-b;
       if (operator.equals("multiply")) return a*b;
       if (operator.equals("divide")) return a/b;
       else return 0;
    }
}