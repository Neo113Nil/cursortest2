package o;

/* renamed from: o.bi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0792bi extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0923di i;
    public final /* synthetic */ AbstractC1054fi j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0792bi(C0923di c0923di, AbstractC1054fi abstractC1054fi, int i) {
        super(0);
        this.h = i;
        this.i = c0923di;
        this.j = abstractC1054fi;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return WQ.n(this.i.a.keySet(), this.j.o());
            default:
                return WQ.n(this.i.b.keySet(), this.j.p());
        }
    }
}
