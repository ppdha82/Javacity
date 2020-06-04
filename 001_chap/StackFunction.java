public class StackFunction
{
    public boolean stackIsEmpty(StackData stackData) {
        return (stackData.getTop() < 0);
    }

    public boolean stackIsFull(StackData stackData) {
        return (stackData.getTop() >= stackData.MAX_STACK);
    }

    public boolean push(StackData stackData, Object newItem) {
        if(stackIsFull(stackData)) {
            return false;
        }
        else {
            int newTop = stackData.getTop() + 1;
            stackData.setTop(newTop);
            stackData.setItem(newTop, newItem);
            return true;
        }
    }

    public Object pop(StackData stackData) {
        if(stackIsEmpty(stackData)) {
            return null;
        }
        else {
            int currentTop = stackData.getTop();
            Object item = stackData.getItem(currentTop);
            stackData.setTop(currentTop - 1);
            return item;
        }
    }

    public Object getStackTop(StackData stackData) {
        if(stackIsEmpty(stackData)) {
            return null;
        }
        else {
            return stackData.getItem(stackData.getTop());
        }
    }

    public void displayStack(StackData stackData) {
        if(stackIsEmpty(stackData)) {
            System.out.println("Empty Stack\n");
        }
        else {
            System.out.println("Stack\n------");
            for(int i = stackData.getTop();i >= 0;i--) {
                System.out.println(stackData.getItem(i));
                System.out.println(" ");
            }
        }
    }
}