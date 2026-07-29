package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: o.cS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0841cS implements Iterable, InterfaceC1594nw {
    public int i;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public HashMap p;
    public C2340zD q;
    public int[] h = new int[0];
    public Object[] j = new Object[0];

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f148o = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0931dr(this, 0, this.i);
    }

    public final int j(C1471m2 c1471m2) {
        if (this.m) {
            EB.h("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (c1471m2.a()) {
            return c1471m2.a;
        }
        AbstractC1052fg.S("Anchor refers to a group that was removed");
        throw null;
    }

    public final C0776bS k() {
        if (this.m) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.l++;
        return new C0776bS(this);
    }

    public final C0972eS l() {
        if (this.m) {
            EB.h("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (this.l > 0) {
            EB.h("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.m = true;
        this.n++;
        return new C0972eS(this);
    }
}
