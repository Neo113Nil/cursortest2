package yads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class sc1 implements Iterator {
    public static final sc1 b;
    public static final /* synthetic */ sc1[] c;

    static {
        sc1 sc1Var = new sc1();
        b = sc1Var;
        c = new sc1[]{sc1Var};
    }

    public static sc1 valueOf(String str) {
        return (sc1) Enum.valueOf(sc1.class, str);
    }

    public static sc1[] values() {
        return (sc1[]) c.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
