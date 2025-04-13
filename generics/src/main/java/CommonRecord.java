import java.lang.reflect.Array;

public class CommonRecord<E> {
    private E[] items;

    public CommonRecord() {
        this.items = (E[]) new Object[10];
    }

    public void addItem(E item) {
        for (int i = 0; i < this.items.length; i++) {
            if(this.items[i] == null) {
                this.items[i] = item;
                break;
            }
        }
    }

    public E getItem(int index) {
        if(index < items.length) {
            return this.items[index];
        }
        return null;
    }

    public E[] getItems() {
        return this.items;
    }
}
