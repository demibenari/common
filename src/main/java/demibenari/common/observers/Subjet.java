package demibenari.common.observers;

/**
 *
 * Created by Demi Ben-Ari on 12/13/2014.
 */
public interface Subjet<T> {
    public boolean addListener(T listener);
    public boolean removeListener(T listener);
}
