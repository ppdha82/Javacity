public class StackData
{
    static final int MAX_STACK = 10;
    private Object[]items;
    private int top;

    public StackData() {
        top = -1;
        items = new Object[MAX_STACK];
    }

    public void setItem(int index, Object item) {
        items[index] = item;
    }

    public Object getItem(int index) {
        return items[index];
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getTop() {
        return top;
    }
}