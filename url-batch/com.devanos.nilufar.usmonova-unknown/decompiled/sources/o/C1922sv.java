package o;

import java.lang.reflect.Method;

/* renamed from: o.sv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1922sv extends AbstractC0868ct {
    public final Method s;
    public final Method t;

    public C1922sv(Method method, Method method2) {
        AbstractC0048Bt.n(method, "getterMethod");
        this.s = method;
        this.t = method2;
    }

    @Override // o.AbstractC0868ct
    public final String g() {
        return AbstractC1035fP.b(this.s);
    }
}
