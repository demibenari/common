package demibenari.common.observers;

import demibenari.common.entities.Item;

import java.util.List;

/**
 * Created by Demi on 12/13/2014.
 */
public interface ItemsObserver {
    public void addItems(List<Item> items);
    public void updateItems(List<Item> items);
    public void removeItems(List<Item> items);
}
