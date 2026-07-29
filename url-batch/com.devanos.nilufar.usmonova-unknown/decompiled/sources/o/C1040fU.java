package o;

/* renamed from: o.fU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1040fU extends C1299jR implements CT {
    @Override // o.CT
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f183o;
            AbstractC0048Bt.k(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.p + ((int) ((l() + this.r) - this.p))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void v(int i) {
        synchronized (this) {
            Object[] objArr = this.f183o;
            AbstractC0048Bt.k(objArr);
            n(Integer.valueOf(((Number) objArr[((int) ((this.p + ((int) ((l() + this.r) - this.p))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
