package o;

import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: o.fT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1039fT {
    public static final C2245xo a;
    public static final C2245xo b;
    public static final C2245xo c;
    public static final C2245xo d;
    public static final C2245xo e;
    public static final C2245xo f;
    public static final C2245xo g;
    public static final C1639ob h;
    public static final C1639ob i;
    public static final C1639ob j;
    public static final C1639ob k;
    public static final C1639ob l;
    public static final C1639ob m;
    public static final C1639ob n;

    /* renamed from: o, reason: collision with root package name */
    public static final Set f165o;
    public static final Set p;
    public static final C1639ob q;
    public static final C1639ob r;
    public static final C1639ob s;
    public static final C1639ob t;

    static {
        C2245xo c2245xo = new C2245xo("kotlin");
        a = c2245xo;
        C2245xo c2 = c2245xo.c(C0827cE.e("reflect"));
        b = c2;
        C2245xo c3 = c2245xo.c(C0827cE.e("collections"));
        c = c3;
        C2245xo c4 = c2245xo.c(C0827cE.e("ranges"));
        d = c4;
        c2245xo.c(C0827cE.e("jvm")).c(C0827cE.e("internal"));
        C2245xo c5 = c2245xo.c(C0827cE.e("annotation"));
        e = c5;
        C2245xo c6 = c2245xo.c(C0827cE.e("internal"));
        c6.c(C0827cE.e("ir"));
        C2245xo c7 = c2245xo.c(C0827cE.e("coroutines"));
        f = c7;
        g = c2245xo.c(C0827cE.e("enums"));
        P6.u0(new C2245xo[]{c2245xo, c3, c4, c5, c2, c6, c7});
        AbstractC1105gT.a("Nothing");
        AbstractC1105gT.a("Unit");
        AbstractC1105gT.a("Any");
        AbstractC1105gT.a("Enum");
        AbstractC1105gT.a("Annotation");
        h = AbstractC1105gT.a("Array");
        C1639ob a2 = AbstractC1105gT.a("Boolean");
        C1639ob a3 = AbstractC1105gT.a("Char");
        C1639ob a4 = AbstractC1105gT.a("Byte");
        C1639ob a5 = AbstractC1105gT.a("Short");
        C1639ob a6 = AbstractC1105gT.a("Int");
        C1639ob a7 = AbstractC1105gT.a("Long");
        C1639ob a8 = AbstractC1105gT.a("Float");
        C1639ob a9 = AbstractC1105gT.a("Double");
        i = AbstractC1105gT.f(a4);
        j = AbstractC1105gT.f(a5);
        k = AbstractC1105gT.f(a6);
        l = AbstractC1105gT.f(a7);
        AbstractC1105gT.a("CharSequence");
        m = AbstractC1105gT.a("String");
        AbstractC1105gT.a("Throwable");
        AbstractC1105gT.a("Cloneable");
        AbstractC1105gT.e("KProperty");
        AbstractC1105gT.e("KMutableProperty");
        AbstractC1105gT.e("KProperty0");
        AbstractC1105gT.e("KMutableProperty0");
        AbstractC1105gT.e("KProperty1");
        AbstractC1105gT.e("KMutableProperty1");
        AbstractC1105gT.e("KProperty2");
        AbstractC1105gT.e("KMutableProperty2");
        n = AbstractC1105gT.e("KFunction");
        AbstractC1105gT.e("KClass");
        AbstractC1105gT.e("KCallable");
        AbstractC1105gT.a("Comparable");
        AbstractC1105gT.a("Number");
        AbstractC1105gT.a("Function");
        Set u0 = P6.u0(new C1639ob[]{a2, a3, a4, a5, a6, a7, a8, a9});
        f165o = u0;
        Set set = u0;
        int E = EB.E(AbstractC0786bc.d0(set));
        if (E < 16) {
            E = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(E);
        for (Object obj : set) {
            C0827cE i2 = ((C1639ob) obj).i();
            AbstractC0048Bt.m(i2, "id.shortClassName");
            linkedHashMap.put(obj, AbstractC1105gT.d(i2));
        }
        AbstractC1105gT.c(linkedHashMap);
        Set u02 = P6.u0(new C1639ob[]{i, j, k, l});
        p = u02;
        Set set2 = u02;
        int E2 = EB.E(AbstractC0786bc.d0(set2));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(E2 >= 16 ? E2 : 16);
        for (Object obj2 : set2) {
            C0827cE i3 = ((C1639ob) obj2).i();
            AbstractC0048Bt.m(i3, "id.shortClassName");
            linkedHashMap2.put(obj2, AbstractC1105gT.d(i3));
        }
        AbstractC1105gT.c(linkedHashMap2);
        WQ.o(WQ.n(f165o, p), m);
        C2245xo c2245xo2 = f;
        C0827cE e2 = C0827cE.e("Continuation");
        if (c2245xo2 == null) {
            C1639ob.a(3);
            throw null;
        }
        C2245xo.j(e2);
        AbstractC1105gT.b("Iterator");
        AbstractC1105gT.b("Iterable");
        AbstractC1105gT.b("Collection");
        AbstractC1105gT.b("List");
        AbstractC1105gT.b("ListIterator");
        AbstractC1105gT.b("Set");
        C1639ob b2 = AbstractC1105gT.b("Map");
        AbstractC1105gT.b("MutableIterator");
        AbstractC1105gT.b("CharIterator");
        AbstractC1105gT.b("MutableIterable");
        AbstractC1105gT.b("MutableCollection");
        q = AbstractC1105gT.b("MutableList");
        AbstractC1105gT.b("MutableListIterator");
        r = AbstractC1105gT.b("MutableSet");
        C1639ob b3 = AbstractC1105gT.b("MutableMap");
        s = b3;
        b2.d(C0827cE.e("Entry"));
        b3.d(C0827cE.e("MutableEntry"));
        AbstractC1105gT.a("Result");
        C2245xo c2245xo3 = d;
        C0827cE e3 = C0827cE.e("IntRange");
        if (c2245xo3 == null) {
            C1639ob.a(3);
            throw null;
        }
        C2245xo.j(e3);
        C2245xo.j(C0827cE.e("LongRange"));
        C2245xo.j(C0827cE.e("CharRange"));
        C2245xo c2245xo4 = e;
        C0827cE e4 = C0827cE.e("AnnotationRetention");
        if (c2245xo4 == null) {
            C1639ob.a(3);
            throw null;
        }
        C2245xo.j(e4);
        C2245xo.j(C0827cE.e("AnnotationTarget"));
        t = new C1639ob(g, C0827cE.e("EnumEntries"));
    }
}
