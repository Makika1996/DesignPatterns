import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}
