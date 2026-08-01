package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class o80 implements Iterator, j00 {
    public int d = -1;
    public boolean e;
    public final /* synthetic */ p80 f;

    public o80(p80 p80Var) {
        this.f = p80Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d + 1 < this.f.m.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            g8.k();
            return null;
        }
        this.e = true;
        ps0 ps0Var = this.f.m;
        int i = this.d + 1;
        this.d = i;
        return (m80) ps0Var.f(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.e) {
            g8.s("You must call next() before you can remove an element");
            return;
        }
        ps0 ps0Var = this.f.m;
        ((m80) ps0Var.f(this.d)).e = null;
        int i = this.d;
        Object[] objArr = ps0Var.f;
        Object obj = objArr[i];
        Object obj2 = x40.m;
        if (obj != obj2) {
            objArr[i] = obj2;
            ps0Var.d = true;
        }
        this.d = i - 1;
        this.e = false;
    }
}
