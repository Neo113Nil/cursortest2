package o;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class V9 implements G9 {
    public final Member a;
    public final Type b;
    public final Class c;
    public final List d;

    public V9(Member member, Type type, Class cls, Type[] typeArr) {
        List t0;
        this.a = member;
        this.b = type;
        this.c = cls;
        if (cls != null) {
            C1621oJ c1621oJ = new C1621oJ(2);
            c1621oJ.b(cls);
            c1621oJ.c(typeArr);
            ArrayList arrayList = c1621oJ.a;
            t0 = AbstractC0868ct.K(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            t0 = P6.t0(typeArr);
        }
        this.d = t0;
    }

    @Override // o.G9
    public final List a() {
        return this.d;
    }

    @Override // o.G9
    public final Member b() {
        return this.a;
    }

    public void c(Object[] objArr) {
        AbstractC0946e20.j(this, objArr);
    }

    public final void d(Object obj) {
        if (obj == null || !this.a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // o.G9
    public final Type getReturnType() {
        return this.b;
    }
}
