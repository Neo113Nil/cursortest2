package o;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes.dex */
public final class IV implements G9 {
    public static final IV a = new IV();

    @Override // o.G9
    public final List a() {
        return C1318jk.h;
    }

    @Override // o.G9
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // o.G9
    public final Object call(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // o.G9
    public final Type getReturnType() {
        Class cls = Void.TYPE;
        AbstractC0048Bt.m(cls, "TYPE");
        return cls;
    }
}
