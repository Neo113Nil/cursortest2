package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qs0 extends xy {
    public int d;
    public final /* synthetic */ ps0 e;

    public qs0(ps0 ps0Var) {
        this.e = ps0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.e.e();
    }

    @Override // defpackage.xy
    public final int nextInt() {
        int i = this.d;
        this.d = i + 1;
        return this.e.c(i);
    }
}
