package o;

import java.util.Iterator;

/* renamed from: o.a7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0689a7 implements Iterable, InterfaceC1594nw {
    public J6 h;

    public final boolean isEmpty() {
        return this.h.j() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.h.iterator();
    }
}
