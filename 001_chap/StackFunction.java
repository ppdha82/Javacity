public class StackFunction
{
    StackData stackData;
    public StackFunction() {
        stackData = new StackData();
    }

    public boolean stackIsEmpty() {
        return (this.stackData.getTop() < 0);
    }

    public boolean stackIsFull() {
        return (this.stackData.getTop() >= this.stackData.MAX_STACK);
    }

    public boolean push(Object newItem) {
        System.out.print("push: ");
        if(stackIsFull()) {
            System.out.println("Insert Failed");
            return false;
        }
        else {
            int newTop = this.stackData.getTop() + 1;
            this.stackData.setTop(newTop);
            this.stackData.setItem(newTop, newItem);
            System.out.println(newItem);
        return true;
        }
    }

    public Object pop() {
        System.out.print("pop: ");
        if(stackIsEmpty()) {
            System.out.println("Failed");
            return null;
        }
        else {
            int currentTop = stackData.getTop();
            Object item = this.stackData.getItem(currentTop);
            this.stackData.setTop(currentTop - 1);
            System.out.println(item);
            return item;
        }
    }

    public Object getStackTop() {
        if(stackIsEmpty()) {
            return null;
        }
        else {
            return this.stackData.getItem(this.stackData.getTop());
        }
    }

    public void displayStack() {
        if(stackIsEmpty()) {
            System.out.println("Empty Stack\n");
        }
        else {
            System.out.println("Stack\n------");
            for(int i = this.stackData.getTop();i >= 0;i--) {
                System.out.println(this.stackData.getItem(i));
                System.out.println(" ");
            }
        }
    }
}