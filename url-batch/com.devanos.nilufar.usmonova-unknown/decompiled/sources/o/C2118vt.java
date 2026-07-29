package o;

import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: o.vt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2118vt extends AbstractC2250xt implements InterfaceC2071v8 {
    public final Object d;

    public C2118vt(Object obj, Method method) {
        super(method, C1318jk.h);
        this.d = obj;
    }

    @Override // o.G9
    public final Object call(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "args");
        AbstractC0946e20.j(this, objArr);
        return this.a.invoke(this.d, Arrays.copyOf(objArr, objArr.length));
    }
}
