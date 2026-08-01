package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ez0 extends gz0 implements Iterable, j00 {
    public final String d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final List l;
    public final List m;

    public ez0(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.d = str;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.i = f5;
        this.j = f6;
        this.k = f7;
        this.l = list;
        this.m = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ez0)) {
            ez0 ez0Var = (ez0) obj;
            return nz.l(this.d, ez0Var.d) && this.e == ez0Var.e && this.f == ez0Var.f && this.g == ez0Var.g && this.h == ez0Var.h && this.i == ez0Var.i && this.j == ez0Var.j && this.k == ez0Var.k && nz.l(this.l, ez0Var.l) && nz.l(this.m, ez0Var.m);
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + y6.t(this.k, y6.t(this.j, y6.t(this.i, y6.t(this.h, y6.t(this.g, y6.t(this.f, y6.t(this.e, this.d.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new mf0(this);
    }
}
