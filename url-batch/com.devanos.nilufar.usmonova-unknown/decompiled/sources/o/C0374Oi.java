package o;

/* renamed from: o.Oi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374Oi extends AbstractC0179Gu {
    public final /* synthetic */ int l;
    public final Object m;

    public /* synthetic */ C0374Oi(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // o.AbstractC0179Gu
    public final boolean k() {
        switch (this.l) {
        }
        return false;
    }

    @Override // o.AbstractC0179Gu
    public final void l(Throwable th) {
        switch (this.l) {
            case 0:
                ((InterfaceC0297Li) this.m).a();
                break;
            case 1:
                ((InterfaceC2114vp) this.m).invoke(th);
                break;
            default:
                C0205Hu c0205Hu = (C0205Hu) this.m;
                Object obj = C0283Ku.h.get(j());
                if (!(obj instanceof C0031Bc)) {
                    c0205Hu.resumeWith(EB.Y(obj));
                    break;
                } else {
                    c0205Hu.resumeWith(AbstractC1494mO.d(((C0031Bc) obj).a));
                    break;
                }
        }
    }
}
