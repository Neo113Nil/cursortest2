package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class j8 implements Iterator, j00 {
    public int d;
    public int e;
    public boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j8(n8 n8Var, int i) {
        this(n8Var.f);
        this.g = i;
        switch (i) {
            case 1:
                this.h = n8Var;
                this(n8Var.f);
                break;
            default:
                this.h = n8Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e;
        if (!hasNext()) {
            g8.k();
            return null;
        }
        int i = this.e;
        int i2 = this.g;
        Object obj = this.h;
        switch (i2) {
            case 0:
                e = ((n8) obj).e(i);
                break;
            case 1:
                e = ((n8) obj).h(i);
                break;
            default:
                e = ((o8) obj).e[i];
                break;
        }
        this.e++;
        this.f = true;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f) {
            g8.s("Call next() before removing an element.");
            return;
        }
        int i = this.e - 1;
        this.e = i;
        int i2 = this.g;
        Object obj = this.h;
        switch (i2) {
            case 0:
                ((n8) obj).f(i);
                break;
            case 1:
                ((n8) obj).f(i);
                break;
            default:
                ((o8) obj).a(i);
                break;
        }
        this.d--;
        this.f = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j8(o8 o8Var) {
        this(o8Var.f);
        this.g = 2;
        this.h = o8Var;
    }

    public j8(int i) {
        this.d = i;
    }
}
