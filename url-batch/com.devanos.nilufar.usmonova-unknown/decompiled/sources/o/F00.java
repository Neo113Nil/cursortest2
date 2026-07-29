package o;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class F00 {
    public final WeakReference a;
    public final int b;

    public F00(ClassLoader classLoader) {
        this.a = new WeakReference(classLoader);
        this.b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof F00) && this.a.get() == ((F00) obj).a.get();
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        String obj;
        ClassLoader classLoader = (ClassLoader) this.a.get();
        return (classLoader == null || (obj = classLoader.toString()) == null) ? "<null>" : obj;
    }
}
