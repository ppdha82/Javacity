public class CStackExample {
    public static void main(String args[]) {
        System.out.println("Start Stack\n-------\n");
        StackFunction stackFunction = new StackFunction();

        stackFunction.displayStack();

        stackFunction.push("1");
        stackFunction.displayStack();

        stackFunction.push("2");
        stackFunction.displayStack();

        System.out.print("pop: ");
        stackFunction.pop();

        stackFunction.displayStack();

        stackFunction.pop();
        stackFunction.displayStack();

        stackFunction.pop();
        stackFunction.displayStack();
    }
}