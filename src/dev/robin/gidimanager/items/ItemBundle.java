package dev.robin.gidimanager.items;

import java.util.ArrayList;
import java.util.List;

public class ItemBundle {

    private List<Item> items;
    private int amount;

    public ItemBundle() {
        items = new ArrayList<>();
        amount = 0;
    }

    public ItemBundle(List<Item> items) {
        this.items = items;
        amount = items.size();
    }

    public ItemBundle(int size) {
        items = new ArrayList<>(size);
    }

    public void addItem(Item item) {
        items.add(item);
    }
    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
