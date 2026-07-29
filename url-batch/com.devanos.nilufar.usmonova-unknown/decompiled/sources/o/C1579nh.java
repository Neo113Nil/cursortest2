package o;

/* renamed from: o.nh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1579nh extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ C1645oh h;
    public final /* synthetic */ C1327jt i;
    public final /* synthetic */ GD j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1579nh(C1645oh c1645oh, C1327jt c1327jt, GD gd, int i) {
        super(1);
        this.h = c1645oh;
        this.i = c1327jt;
        this.j = gd;
        this.k = i;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        if (obj == this.h) {
            throw new IllegalStateException("A derived state calculation cannot read itself");
        }
        if (obj instanceof GT) {
            int i = this.i.a - this.k;
            GD gd = this.j;
            int c = gd.c(obj);
            int min = Math.min(i, c >= 0 ? gd.c[c] : Integer.MAX_VALUE);
            int b = gd.b(obj);
            if (b < 0) {
                b = ~b;
            }
            gd.b[b] = obj;
            gd.c[b] = min;
        }
        return C0782bY.a;
    }
}
