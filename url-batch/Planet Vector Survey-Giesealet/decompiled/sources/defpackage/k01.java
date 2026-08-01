package defpackage;

import java.io.Closeable;
import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class k01 {
    private final l01 impl = new l01();

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        str.getClass();
        autoCloseable.getClass();
        l01 l01Var = this.impl;
        if (l01Var != null) {
            if (l01Var.d) {
                l01.a(autoCloseable);
                return;
            }
            synchronized (l01Var.a) {
                autoCloseable2 = (AutoCloseable) l01Var.b.put(str, autoCloseable);
            }
            l01.a(autoCloseable2);
        }
    }

    public final void clear$lifecycle_viewmodel() {
        l01 l01Var = this.impl;
        if (l01Var != null && !l01Var.d) {
            l01Var.d = true;
            synchronized (l01Var.a) {
                try {
                    Iterator it = l01Var.b.values().iterator();
                    while (it.hasNext()) {
                        l01.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = l01Var.c.iterator();
                    while (it2.hasNext()) {
                        l01.a((AutoCloseable) it2.next());
                    }
                    l01Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        T t;
        str.getClass();
        l01 l01Var = this.impl;
        if (l01Var == null) {
            return null;
        }
        synchronized (l01Var.a) {
            t = (T) l01Var.b.get(str);
        }
        return t;
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        l01 l01Var = this.impl;
        if (l01Var != null) {
            if (l01Var.d) {
                l01.a(autoCloseable);
                return;
            }
            synchronized (l01Var.a) {
                l01Var.c.add(autoCloseable);
            }
        }
    }

    @vl
    public void addCloseable(Closeable closeable) {
        closeable.getClass();
        l01 l01Var = this.impl;
        if (l01Var != null) {
            if (l01Var.d) {
                l01.a(closeable);
                return;
            }
            synchronized (l01Var.a) {
                l01Var.c.add(closeable);
            }
        }
    }

    public void onCleared() {
    }
}
