package o;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class BU implements InterfaceC0235Iy, Serializable {
    public InterfaceC1455lp h;
    public volatile Object i;
    public final Object j;

    public BU(InterfaceC1455lp interfaceC1455lp) {
        AbstractC0048Bt.n(interfaceC1455lp, "initializer");
        this.h = interfaceC1455lp;
        this.i = C1097gL.f168o;
        this.j = this;
    }

    @Override // o.InterfaceC0235Iy
    public final Object getValue() {
        Object obj;
        Object obj2 = this.i;
        C1097gL c1097gL = C1097gL.f168o;
        if (obj2 != c1097gL) {
            return obj2;
        }
        synchronized (this.j) {
            obj = this.i;
            if (obj == c1097gL) {
                InterfaceC1455lp interfaceC1455lp = this.h;
                AbstractC0048Bt.k(interfaceC1455lp);
                obj = interfaceC1455lp.invoke();
                this.i = obj;
                this.h = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.i != C1097gL.f168o ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
