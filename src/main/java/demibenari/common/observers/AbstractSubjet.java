package demibenari.common.observers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Demi on 12/13/2014.
 */
public class AbstractSubjet<T> implements Subjet<T> {
    protected final List<T> listeners = new ArrayList<>();

    @Override
    public boolean addListener(T listener) {
        if (listener != null) {
            return listeners.add(listener);
        } else {
            return false;
        }
    }

    @Override
    public boolean removeListener(T listener) {
        if (listener != null) {
            return listeners.remove(listener);
        } else {
            return false;
        }
    }
}
