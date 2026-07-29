package o;

/* renamed from: o.Dy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105Dy extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ C0209Hy h;
    public final /* synthetic */ ZG i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0105Dy(C0209Hy c0209Hy, ZG zg, long j) {
        super(0);
        this.h = c0209Hy;
        this.i = zg;
        this.j = j;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        AbstractC1547nB f0;
        C0209Hy c0209Hy = this.h;
        ZH zh = null;
        if (AbstractC0868ct.F(c0209Hy.a)) {
            ME me = c0209Hy.a().n;
            if (me != null) {
                zh = me.i;
            }
        } else {
            ME me2 = c0209Hy.a().n;
            if (me2 != null && (f0 = me2.f0()) != null) {
                zh = f0.i;
            }
        }
        if (zh == null) {
            zh = ((S2) this.i).getPlacementScope();
        }
        AbstractC1547nB f02 = c0209Hy.a().f0();
        AbstractC0048Bt.k(f02);
        ZH.d(zh, f02, this.j);
        return C0782bY.a;
    }
}
