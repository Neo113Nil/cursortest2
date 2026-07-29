package o;

import java.lang.reflect.Constructor;

/* renamed from: o.gv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1133gv extends AbstractC1807r8 {
    public final Constructor i;

    public C1133gv(Constructor constructor) {
        AbstractC0048Bt.n(constructor, "constructor");
        this.i = constructor;
    }

    @Override // o.AbstractC1807r8
    public final String i() {
        Class<?>[] parameterTypes = this.i.getParameterTypes();
        AbstractC0048Bt.m(parameterTypes, "constructor.parameterTypes");
        return P6.o0(parameterTypes, "<init>(", ")V", C2316yt.m);
    }
}
