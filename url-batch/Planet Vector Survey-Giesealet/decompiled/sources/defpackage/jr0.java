package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jr0 implements Iterable, j00 {
    public int e;
    public int g;
    public int h;
    public boolean j;
    public int k;
    public HashMap m;
    public p60 n;
    public int[] d = new int[0];
    public Object[] f = new Object[0];
    public final Object i = new Object();
    public ArrayList l = new ArrayList();

    public final int a(h2 h2Var) {
        if (this.j) {
            th.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!h2Var.a()) {
            gh0.a("Anchor refers to a group that was removed");
        }
        return h2Var.a;
    }

    public final void b() {
        this.m = new HashMap();
    }

    public final ir0 c() {
        if (this.j) {
            g8.s("Cannot read while a writer is pending");
            return null;
        }
        this.h++;
        return new ir0(this);
    }

    public final mr0 d() {
        if (this.j) {
            th.c("Cannot start a writer when another writer is pending");
        }
        if (this.h > 0) {
            th.c("Cannot start a writer when a reader is pending");
        }
        this.j = true;
        this.k++;
        return new mr0(this);
    }

    public final boolean e(h2 h2Var) {
        int d;
        return h2Var.a() && (d = lr0.d(this.l, h2Var.a, this.e)) >= 0 && nz.l(this.l.get(d), h2Var);
    }

    public final zv f(int i) {
        int i2;
        ArrayList arrayList;
        int d;
        HashMap hashMap = this.m;
        if (hashMap != null) {
            if (this.j) {
                th.c("use active SlotWriter to crate an anchor for location instead");
            }
            h2 h2Var = (i < 0 || i >= (i2 = this.e) || (d = lr0.d((arrayList = this.l), i, i2)) < 0) ? null : (h2) arrayList.get(d);
            if (h2Var != null) {
                return (zv) hashMap.get(h2Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new yv(this, 0, this.e);
    }
}
