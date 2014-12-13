package demibenari.common.guice.modules.factories;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * Created by Demi on 12/13/2014.
 */
public class InjectorFactory {
    private static Injector injector;
    private static Lock lock = new ReentrantLock();
    private static List<AbstractModule> modules;

    static {
        modules = new ArrayList<>();
    }

    public static void injectModule(AbstractModule module) {
        if (module != null) {
            modules.add(module);
        }
    }

    public static Injector getInjector() {
        if (injector == null) {
            synchronized (lock) {
                if (injector == null) {
                    injector = Guice.createInjector(modules);
                }
            }
        }
        return injector;
    }
}
