package o;

/* renamed from: o.ba, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0784ba implements InterfaceC2378zp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C0784ba(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // o.InterfaceC2378zp
    public final Object e(Object obj, Object obj2, Object obj3) {
        switch (this.h) {
            case 0:
                ((C1730q) this.i).invoke((Throwable) obj);
                break;
            case 1:
                C0762bE c0762bE = (C0762bE) this.i;
                C0762bE.g.set(c0762bE, null);
                c0762bE.e(null);
                break;
            default:
                ((IQ) this.i).b();
                break;
        }
        return C0782bY.a;
    }

    public /* synthetic */ C0784ba(C0762bE c0762bE, C0696aE c0696aE) {
        this.h = 1;
        this.i = c0762bE;
    }
}
