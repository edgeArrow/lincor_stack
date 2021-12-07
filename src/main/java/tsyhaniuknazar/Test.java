package main.java.tsyhaniuknazar;

public class Test {
    public static void main(String[] args) {
        LincorStack stack = new LincorStack();

        stack.push(2);
        stack.push(23);
        stack.push(4);
        stack.push(13);
        System.out.println(stack.stack);

        System.out.println(stack.pop());
        System.out.println(stack.stack);
        System.out.println(stack.pop());
        System.out.println(stack.stack);

        stack.push(99);
        stack.push(1);

        System.out.println(stack.stack);
        System.out.println(stack.peekMin());
        System.out.println(stack.stack);



    }
}
