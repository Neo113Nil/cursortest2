package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wt0 extends zq0 implements ct0 {
    @Override // defpackage.ct0
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.j;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.k + ((int) ((n() + this.m) - this.k))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void v(int i) {
        synchronized (this) {
            Object[] objArr = this.j;
            objArr.getClass();
            p(Integer.valueOf(((Number) objArr[((int) ((this.k + ((int) ((n() + this.m) - this.k))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
