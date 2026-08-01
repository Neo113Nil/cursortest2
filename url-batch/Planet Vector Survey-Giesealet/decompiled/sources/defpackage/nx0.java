package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class nx0 extends lx0 {
    public final mf0 g;

    public nx0(mf0 mf0Var) {
        this.g = mf0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f;
        this.f = i + 2;
        Object[] objArr = this.d;
        return new v60(this.g, objArr[i], objArr[i + 1]);
    }
}
