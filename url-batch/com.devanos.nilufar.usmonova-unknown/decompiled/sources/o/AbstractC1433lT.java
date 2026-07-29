package o;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: o.lT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1433lT {
    public static final C2245xo A;
    public static final C2245xo B;
    public static final C2245xo C;
    public static final C2245xo D;
    public static final C2245xo E;
    public static final C2245xo F;
    public static final C2245xo G;
    public static final C2245xo H;
    public static final C2245xo I;
    public static final C2245xo J;
    public static final C2245xo K;
    public static final C2245xo L;
    public static final C2245xo M;
    public static final C2245xo N;
    public static final C2245xo O;
    public static final C2377zo P;
    public static final C1639ob Q;
    public static final C1639ob R;
    public static final C1639ob S;
    public static final C1639ob T;
    public static final C1639ob U;
    public static final C2245xo V;
    public static final C2245xo W;
    public static final C2245xo X;
    public static final C2245xo Y;
    public static final HashSet Z;
    public static final HashSet a0;
    public static final HashMap b0;
    public static final HashMap c0;
    public static final C2377zo d;
    public static final C2377zo e;
    public static final C2377zo f;
    public static final C2377zo g;
    public static final C2377zo h;
    public static final C2377zo i;
    public static final C2377zo j;
    public static final C2245xo k;
    public static final C2245xo l;
    public static final C2245xo m;
    public static final C2245xo n;

    /* renamed from: o, reason: collision with root package name */
    public static final C2245xo f194o;
    public static final C2245xo p;
    public static final C2245xo q;
    public static final C2245xo r;
    public static final C2245xo s;
    public static final C2245xo t;
    public static final C2245xo u;
    public static final C2245xo v;
    public static final C2245xo w;
    public static final C2245xo x;
    public static final C2245xo y;
    public static final C2245xo z;
    public static final C2377zo a = d("Any");
    public static final C2377zo b = d("Nothing");
    public static final C2377zo c = d("Cloneable");

    static {
        c("Suppress");
        d = d("Unit");
        e = d("CharSequence");
        f = d("String");
        g = d("Array");
        h = d("Boolean");
        d("Char");
        d("Byte");
        d("Short");
        d("Int");
        d("Long");
        d("Float");
        d("Double");
        i = d("Number");
        j = d("Enum");
        d("Function");
        k = c("Throwable");
        l = c("Comparable");
        C2245xo c2245xo = AbstractC1499mT.m;
        AbstractC0048Bt.m(c2245xo.c(C0827cE.e("IntRange")).i(), "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
        AbstractC0048Bt.m(c2245xo.c(C0827cE.e("LongRange")).i(), "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
        m = c("Deprecated");
        c("DeprecatedSinceKotlin");
        n = c("DeprecationLevel");
        f194o = c("ReplaceWith");
        p = c("ExtensionFunctionType");
        q = c("ContextFunctionTypeParams");
        C2245xo c2 = c("ParameterName");
        r = c2;
        C1639ob.j(c2);
        s = c("Annotation");
        C2245xo a2 = a("Target");
        t = a2;
        C1639ob.j(a2);
        u = a("AnnotationTarget");
        v = a("AnnotationRetention");
        C2245xo a3 = a("Retention");
        w = a3;
        C1639ob.j(a3);
        C1639ob.j(a("Repeatable"));
        x = a("MustBeDocumented");
        y = c("UnsafeVariance");
        c("PublishedApi");
        AbstractC1499mT.n.c(C0827cE.e("AccessibleLateinitPropertyLiteral"));
        z = b("Iterator");
        A = b("Iterable");
        B = b("Collection");
        C = b("List");
        D = b("ListIterator");
        E = b("Set");
        C2245xo b2 = b("Map");
        F = b2;
        G = b2.c(C0827cE.e("Entry"));
        H = b("MutableIterator");
        I = b("MutableIterable");
        J = b("MutableCollection");
        K = b("MutableList");
        L = b("MutableListIterator");
        M = b("MutableSet");
        C2245xo b3 = b("MutableMap");
        N = b3;
        O = b3.c(C0827cE.e("MutableEntry"));
        P = e("KClass");
        e("KCallable");
        e("KProperty0");
        e("KProperty1");
        e("KProperty2");
        e("KMutableProperty0");
        e("KMutableProperty1");
        e("KMutableProperty2");
        C2377zo e2 = e("KProperty");
        e("KMutableProperty");
        Q = C1639ob.j(e2.g());
        e("KDeclarationContainer");
        C2245xo c3 = c("UByte");
        C2245xo c4 = c("UShort");
        C2245xo c5 = c("UInt");
        C2245xo c6 = c("ULong");
        R = C1639ob.j(c3);
        S = C1639ob.j(c4);
        T = C1639ob.j(c5);
        U = C1639ob.j(c6);
        V = c("UByteArray");
        W = c("UShortArray");
        X = c("UIntArray");
        Y = c("ULongArray");
        int length = EnumC1423lJ.values().length;
        HashSet hashSet = new HashSet(length < 3 ? 3 : (length / 3) + length + 1);
        for (EnumC1423lJ enumC1423lJ : EnumC1423lJ.values()) {
            hashSet.add(enumC1423lJ.h);
        }
        Z = hashSet;
        int length2 = EnumC1423lJ.values().length;
        HashSet hashSet2 = new HashSet(length2 < 3 ? 3 : (length2 / 3) + length2 + 1);
        for (EnumC1423lJ enumC1423lJ2 : EnumC1423lJ.values()) {
            hashSet2.add(enumC1423lJ2.i);
        }
        a0 = hashSet2;
        int length3 = EnumC1423lJ.values().length;
        HashMap hashMap = new HashMap(length3 < 3 ? 3 : (length3 / 3) + length3 + 1);
        for (EnumC1423lJ enumC1423lJ3 : EnumC1423lJ.values()) {
            String b4 = enumC1423lJ3.h.b();
            AbstractC0048Bt.m(b4, "primitiveType.typeName.asString()");
            hashMap.put(d(b4), enumC1423lJ3);
        }
        b0 = hashMap;
        int length4 = EnumC1423lJ.values().length;
        HashMap hashMap2 = new HashMap(length4 >= 3 ? (length4 / 3) + length4 + 1 : 3);
        for (EnumC1423lJ enumC1423lJ4 : EnumC1423lJ.values()) {
            String b5 = enumC1423lJ4.i.b();
            AbstractC0048Bt.m(b5, "primitiveType.arrayTypeName.asString()");
            hashMap2.put(d(b5), enumC1423lJ4);
        }
        c0 = hashMap2;
    }

    public static C2245xo a(String str) {
        return AbstractC1499mT.k.c(C0827cE.e(str));
    }

    public static C2245xo b(String str) {
        return AbstractC1499mT.l.c(C0827cE.e(str));
    }

    public static C2245xo c(String str) {
        return AbstractC1499mT.j.c(C0827cE.e(str));
    }

    public static C2377zo d(String str) {
        C2377zo i2 = c(str).i();
        AbstractC0048Bt.m(i2, "fqName(simpleName).toUnsafe()");
        return i2;
    }

    public static final C2377zo e(String str) {
        C2377zo i2 = AbstractC1499mT.h.c(C0827cE.e(str)).i();
        AbstractC0048Bt.m(i2, "KOTLIN_REFLECT_FQ_NAME.c…r(simpleName)).toUnsafe()");
        return i2;
    }
}
