package o;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: o.xt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2250xt implements G9 {
    public final Method a;
    public final List b;
    public final Class c;

    public AbstractC2250xt(Method method, List list) {
        this.a = method;
        this.b = list;
        Class<?> returnType = method.getReturnType();
        AbstractC0048Bt.m(returnType, "unboxMethod.returnType");
        this.c = returnType;
    }

    @Override // o.G9
    public final List a() {
        return this.b;
    }

    @Override // o.G9
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // o.G9
    public final Type getReturnType() {
        return this.c;
    }
}
