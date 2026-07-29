package o;

/* loaded from: classes.dex */
public final /* synthetic */ class R6 implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ R6(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return AbstractC1305jX.z((Object[]) this.i);
            case 1:
                return ((Iterable) this.i).iterator();
            default:
                return this.i;
        }
    }
}
