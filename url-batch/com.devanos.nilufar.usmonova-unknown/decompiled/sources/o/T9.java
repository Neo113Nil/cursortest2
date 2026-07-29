package o;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T9 extends Q9 implements InterfaceC2071v8 {
    public final Object g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T9(Object obj, Method method) {
        super(method, false, (Type[]) (r0.length <= 1 ? new Type[0] : P6.f0(r0, 1, r0.length)));
        AbstractC0048Bt.n(method, "method");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC0048Bt.m(genericParameterTypes, "method.genericParameterTypes");
        this.g = obj;
    }

    @Override // o.Q9, o.G9
    public final Object call(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "args");
        AbstractC0946e20.j(this, objArr);
        C1621oJ c1621oJ = new C1621oJ(2);
        c1621oJ.b(this.g);
        c1621oJ.c(objArr);
        ArrayList arrayList = c1621oJ.a;
        return e(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
