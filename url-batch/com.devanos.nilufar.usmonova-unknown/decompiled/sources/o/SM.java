package o;

/* loaded from: classes.dex */
public final class SM extends PX {
    public final AbstractC1596ny p;
    public volatile Object q = null;

    /* JADX WARN: Multi-variable type inference failed */
    public SM(InterfaceC1455lp interfaceC1455lp) {
        this.p = (AbstractC1596ny) interfaceC1455lp;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o.lp, o.ny] */
    public final Object invoke() {
        Object obj = PX.k;
        Object obj2 = this.q;
        if (obj2 != null) {
            if (obj2 == obj) {
                return null;
            }
            return obj2;
        }
        Object invoke = this.p.invoke();
        if (invoke != null) {
            obj = invoke;
        }
        this.q = obj;
        return invoke;
    }
}
