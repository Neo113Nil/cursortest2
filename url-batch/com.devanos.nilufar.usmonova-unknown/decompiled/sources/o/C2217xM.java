package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.xM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2217xM extends BM implements InterfaceC0489St, InterfaceC1855ru {
    public final Class a;

    public C2217xM(Class cls) {
        AbstractC0048Bt.n(cls, "klass");
        this.a = cls;
    }

    @Override // o.InterfaceC0489St
    public final C1558nM a(C2245xo c2245xo) {
        Annotation[] declaredAnnotations;
        AbstractC0048Bt.n(c2245xo, "fqName");
        Class cls = this.a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return EB.p(declaredAnnotations, c2245xo);
    }

    public final List b() {
        Field[] declaredFields = this.a.getDeclaredFields();
        AbstractC0048Bt.m(declaredFields, "klass.declaredFields");
        return PQ.B(PQ.z(new C0730am(P6.X(declaredFields), false, C2019uM.j), C2085vM.j));
    }

    public final C2245xo c() {
        return AbstractC1492mM.a(this.a).b();
    }

    public final List d() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        AbstractC0048Bt.m(declaredMethods, "klass.declaredMethods");
        return PQ.B(PQ.z(new C0730am(P6.X(declaredMethods), true, new C2084vL(3, this)), C2151wM.j));
    }

    public final ArrayList e() {
        Class cls = this.a;
        AbstractC0048Bt.n(cls, "clazz");
        C1334k c1334k = AbstractC0022At.f14o;
        if (c1334k == null) {
            try {
                c1334k = new C1334k(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 9);
            } catch (NoSuchMethodException unused) {
                c1334k = new C1334k(r3, r3, r3, r3, 9);
            }
            AbstractC0022At.f14o = c1334k;
        }
        Method method = (Method) c1334k.l;
        r3 = method != null ? (Object[]) method.invoke(cls, null) : null;
        if (r3 == null) {
            r3 = new Object[0];
        }
        ArrayList arrayList = new ArrayList(r3.length);
        for (Object obj : r3) {
            arrayList.add(new JM(obj));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2217xM) {
            return AbstractC0048Bt.h(this.a, ((C2217xM) obj).a);
        }
        return false;
    }

    public final boolean f() {
        Class cls = this.a;
        AbstractC0048Bt.n(cls, "clazz");
        C1334k c1334k = AbstractC0022At.f14o;
        Boolean bool = null;
        if (c1334k == null) {
            try {
                c1334k = new C1334k(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 9);
            } catch (NoSuchMethodException unused) {
                c1334k = new C1334k(bool, bool, bool, bool, 9);
            }
            AbstractC0022At.f14o = c1334k;
        }
        Method method = (Method) c1334k.k;
        if (method != null) {
            Object invoke = method.invoke(cls, null);
            AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) invoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean g() {
        Class cls = this.a;
        AbstractC0048Bt.n(cls, "clazz");
        C1334k c1334k = AbstractC0022At.f14o;
        Boolean bool = null;
        if (c1334k == null) {
            try {
                c1334k = new C1334k(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 9);
            } catch (NoSuchMethodException unused) {
                c1334k = new C1334k(bool, bool, bool, bool, 9);
            }
            AbstractC0022At.f14o = c1334k;
        }
        Method method = (Method) c1334k.i;
        if (method != null) {
            Object invoke = method.invoke(cls, null);
            AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) invoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC0489St
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? C1318jk.h : EB.r(declaredAnnotations);
    }

    @Override // o.InterfaceC1855ru
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        AbstractC0048Bt.m(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new LM(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return C2217xM.class.getName() + ": " + this.a;
    }
}
