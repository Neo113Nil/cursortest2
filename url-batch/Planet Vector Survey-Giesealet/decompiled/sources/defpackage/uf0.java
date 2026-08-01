package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class uf0 extends s {
    public final Object[] f;
    public final jx0 g;

    public uf0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.f = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.g = new jx0(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            g8.k();
            return null;
        }
        jx0 jx0Var = this.g;
        if (jx0Var.hasNext()) {
            this.d++;
            return jx0Var.next();
        }
        int i = this.d;
        this.d = i + 1;
        return this.f[i - jx0Var.e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            g8.k();
            return null;
        }
        int i = this.d;
        jx0 jx0Var = this.g;
        int i2 = jx0Var.e;
        if (i <= i2) {
            this.d = i - 1;
            return jx0Var.previous();
        }
        int i3 = i - 1;
        this.d = i3;
        return this.f[i3 - i2];
    }
}
