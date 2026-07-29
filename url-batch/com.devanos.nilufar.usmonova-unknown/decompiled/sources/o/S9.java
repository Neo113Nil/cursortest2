package o;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class S9 extends Q9 implements InterfaceC2071v8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S9(Method method) {
        super(method, false, 4);
        AbstractC0048Bt.n(method, "method");
    }

    @Override // o.Q9, o.G9
    public final Object call(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "args");
        AbstractC0946e20.j(this, objArr);
        return e(null, objArr);
    }
}
