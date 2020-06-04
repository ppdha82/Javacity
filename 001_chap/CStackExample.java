public class CStackExample {
    public static void main(String args[]) {
        System.out.println("Start Stack\n-------\n");
        StackData stackData = new StackData();
        StackFunction stackFunction = new StackFunction();

        stackFunction.displayStack(stackData);

        //stackData.push("1");
        String one = new String("1");
        System.out.print("push: ");

        if(stackFunction.push(stackData, one)) {
            System.out.println(one);
        }
        else {
            System.out.println("Insert Failed");
        }

        stackFunction.displayStack(stackData);

        String two = new String("2");
        System.out.print("push: ");

        if(stackFunction.push(stackData, two)) {
            System.out.println(two);
        }
        else {
            System.out.println("Insert Failed");
        }

        stackFunction.displayStack(stackData);

        Object result;

        System.out.print("pop: ");
        result = stackFunction.pop(stackData);

        if(result == null) {
            System.out.println("Failed");
        }
        else {
            System.out.println(result);
        }
        stackFunction.displayStack(stackData);

        System.out.print("pop: ");
        result = stackFunction.pop(stackData);
        if(result == null) {
            System.out.println("Failed");
        }
        else {
            System.out.println(result);
        }
        stackFunction.displayStack(stackData);

        System.out.print("pop :");
        result = stackFunction.pop(stackData);
        if(result == null) {
            System.out.println("Failed");
        }
        else {
            System.out.println(result);
        }
        stackFunction.displayStack(stackData);
    }
}