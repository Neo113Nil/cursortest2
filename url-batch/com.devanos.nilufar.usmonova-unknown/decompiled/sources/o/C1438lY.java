package o;

import java.io.Serializable;

/* renamed from: o.lY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1438lY implements InterfaceC0235Iy, Serializable {
    public AbstractC1596ny h;
    public Object i;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o.lp, o.ny] */
    @Override // o.InterfaceC0235Iy
    public final Object getValue() {
        if (this.i == C1097gL.f168o) {
            ?? r0 = this.h;
            AbstractC0048Bt.k(r0);
            this.i = r0.invoke();
            this.h = null;
        }
        return this.i;
    }

    public final String toString() {
        return this.i != C1097gL.f168o ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
