package o;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: o.dS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907dS implements Iterable, InterfaceC1594nw {
    public final C0841cS h;
    public final int i;
    public final int j;

    public C0907dS(C0841cS c0841cS, int i, int i2) {
        this.h = c0841cS;
        this.i = i;
        this.j = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i;
        ArrayList arrayList;
        int A;
        C0841cS c0841cS = this.h;
        if (c0841cS.n != this.j) {
            throw new ConcurrentModificationException();
        }
        HashMap hashMap = c0841cS.p;
        C1471m2 c1471m2 = null;
        int i2 = this.i;
        if (hashMap != null) {
            if (c0841cS.m) {
                EB.h("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            if (i2 >= 0 && i2 < (i = c0841cS.i) && (A = TM.A((arrayList = c0841cS.f148o), i2, i)) >= 0) {
                c1471m2 = (C1471m2) arrayList.get(A);
            }
            if (c1471m2 != null) {
            }
        }
        return new C0931dr(c0841cS, i2 + 1, c0841cS.h[(i2 * 5) + 3] + i2);
    }
}
