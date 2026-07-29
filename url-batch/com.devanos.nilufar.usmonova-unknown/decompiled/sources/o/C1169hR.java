package o;

/* renamed from: o.hR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1169hR implements InterfaceC0297Li {
    public final C1299jR h;
    public final long i;
    public final Object j;
    public final C0849ca k;

    public C1169hR(C1299jR c1299jR, long j, Object obj, C0849ca c0849ca) {
        this.h = c1299jR;
        this.i = j;
        this.j = obj;
        this.k = c0849ca;
    }

    @Override // o.InterfaceC0297Li
    public final void a() {
        C1299jR c1299jR = this.h;
        synchronized (c1299jR) {
            if (this.i < c1299jR.l()) {
                return;
            }
            Object[] objArr = c1299jR.f183o;
            AbstractC0048Bt.k(objArr);
            long j = this.i;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            AbstractC0868ct.d(objArr, j, AbstractC0868ct.j);
            c1299jR.g();
        }
    }
}
