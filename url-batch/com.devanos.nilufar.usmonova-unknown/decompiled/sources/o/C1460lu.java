package o;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.lu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1460lu {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final C1639ob e;
    public static final C2245xo f;
    public static final C1639ob g;
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static final HashMap k;
    public static final HashMap l;
    public static final HashMap m;
    public static final List n;

    static {
        StringBuilder sb = new StringBuilder();
        EnumC0304Lp enumC0304Lp = EnumC0304Lp.k;
        sb.append(enumC0304Lp.h.a.toString());
        sb.append('.');
        sb.append(enumC0304Lp.i);
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        EnumC0304Lp enumC0304Lp2 = EnumC0304Lp.m;
        sb2.append(enumC0304Lp2.h.a.toString());
        sb2.append('.');
        sb2.append(enumC0304Lp2.i);
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        EnumC0304Lp enumC0304Lp3 = EnumC0304Lp.l;
        sb3.append(enumC0304Lp3.h.a.toString());
        sb3.append('.');
        sb3.append(enumC0304Lp3.i);
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        EnumC0304Lp enumC0304Lp4 = EnumC0304Lp.n;
        sb4.append(enumC0304Lp4.h.a.toString());
        sb4.append('.');
        sb4.append(enumC0304Lp4.i);
        d = sb4.toString();
        C1639ob j2 = C1639ob.j(new C2245xo("kotlin.jvm.functions.FunctionN"));
        e = j2;
        f = j2.b();
        g = C1039fT.n;
        d(Class.class);
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        k = new HashMap();
        l = new HashMap();
        m = new HashMap();
        C1639ob j3 = C1639ob.j(AbstractC1433lT.A);
        C2245xo c2245xo = AbstractC1433lT.I;
        C2245xo g2 = j3.g();
        C2245xo g3 = j3.g();
        AbstractC0048Bt.m(g3, "kotlinReadOnly.packageFqName");
        C2245xo g0 = AbstractC0048Bt.g0(c2245xo, g3);
        C1394ku c1394ku = new C1394ku(d(Iterable.class), j3, new C1639ob(g2, g0, false));
        C1639ob j4 = C1639ob.j(AbstractC1433lT.z);
        C2245xo c2245xo2 = AbstractC1433lT.H;
        C2245xo g4 = j4.g();
        C2245xo g5 = j4.g();
        AbstractC0048Bt.m(g5, "kotlinReadOnly.packageFqName");
        C1394ku c1394ku2 = new C1394ku(d(Iterator.class), j4, new C1639ob(g4, AbstractC0048Bt.g0(c2245xo2, g5), false));
        C1639ob j5 = C1639ob.j(AbstractC1433lT.B);
        C2245xo c2245xo3 = AbstractC1433lT.J;
        C2245xo g6 = j5.g();
        C2245xo g7 = j5.g();
        AbstractC0048Bt.m(g7, "kotlinReadOnly.packageFqName");
        C1394ku c1394ku3 = new C1394ku(d(Collection.class), j5, new C1639ob(g6, AbstractC0048Bt.g0(c2245xo3, g7), false));
        C1639ob j6 = C1639ob.j(AbstractC1433lT.C);
        C2245xo c2245xo4 = AbstractC1433lT.K;
        C2245xo g8 = j6.g();
        C2245xo g9 = j6.g();
        AbstractC0048Bt.m(g9, "kotlinReadOnly.packageFqName");
        C1394ku c1394ku4 = new C1394ku(d(List.class), j6, new C1639ob(g8, AbstractC0048Bt.g0(c2245xo4, g9), false));
        C1639ob j7 = C1639ob.j(AbstractC1433lT.E);
        C2245xo c2245xo5 = AbstractC1433lT.M;
        C2245xo g10 = j7.g();
        C2245xo g11 = j7.g();
        AbstractC0048Bt.m(g11, "kotlinReadOnly.packageFqName");
        C1394ku c1394ku5 = new C1394ku(d(Set.class), j7, new C1639ob(g10, AbstractC0048Bt.g0(c2245xo5, g11), false));
        C1639ob j8 = C1639ob.j(AbstractC1433lT.D);
        C2245xo c2245xo6 = AbstractC1433lT.L;
        C2245xo g12 = j8.g();
        C2245xo g13 = j8.g();
        AbstractC0048Bt.m(g13, "kotlinReadOnly.packageFqName");
        C1394ku c1394ku6 = new C1394ku(d(ListIterator.class), j8, new C1639ob(g12, AbstractC0048Bt.g0(c2245xo6, g13), false));
        C2245xo c2245xo7 = AbstractC1433lT.F;
        C1639ob j9 = C1639ob.j(c2245xo7);
        C2245xo c2245xo8 = AbstractC1433lT.N;
        C2245xo g14 = j9.g();
        C2245xo g15 = j9.g();
        AbstractC0048Bt.m(g15, "kotlinReadOnly.packageFqName");
        C1394ku c1394ku7 = new C1394ku(d(Map.class), j9, new C1639ob(g14, AbstractC0048Bt.g0(c2245xo8, g15), false));
        C1639ob d2 = C1639ob.j(c2245xo7).d(AbstractC1433lT.G.f());
        C2245xo c2245xo9 = AbstractC1433lT.O;
        C2245xo g16 = d2.g();
        C2245xo g17 = d2.g();
        AbstractC0048Bt.m(g17, "kotlinReadOnly.packageFqName");
        List<C1394ku> K = AbstractC0868ct.K(c1394ku, c1394ku2, c1394ku3, c1394ku4, c1394ku5, c1394ku6, c1394ku7, new C1394ku(d(Map.Entry.class), d2, new C1639ob(g16, AbstractC0048Bt.g0(c2245xo9, g17), false)));
        n = K;
        c(Object.class, AbstractC1433lT.a);
        c(String.class, AbstractC1433lT.f);
        c(CharSequence.class, AbstractC1433lT.e);
        a(d(Throwable.class), C1639ob.j(AbstractC1433lT.k));
        c(Cloneable.class, AbstractC1433lT.c);
        c(Number.class, AbstractC1433lT.i);
        a(d(Comparable.class), C1639ob.j(AbstractC1433lT.l));
        c(Enum.class, AbstractC1433lT.j);
        a(d(Annotation.class), C1639ob.j(AbstractC1433lT.s));
        for (C1394ku c1394ku8 : K) {
            C1639ob c1639ob = c1394ku8.a;
            C1639ob c1639ob2 = c1394ku8.b;
            C1639ob c1639ob3 = c1394ku8.c;
            a(c1639ob, c1639ob2);
            b(c1639ob3.b(), c1639ob);
            l.put(c1639ob3, c1639ob2);
            m.put(c1639ob2, c1639ob3);
            C2245xo b2 = c1639ob2.b();
            C2245xo b3 = c1639ob3.b();
            HashMap hashMap = j;
            C2377zo i2 = c1639ob3.b().i();
            AbstractC0048Bt.m(i2, "mutableClassId.asSingleFqName().toUnsafe()");
            hashMap.put(i2, b2);
            HashMap hashMap2 = k;
            C2377zo i3 = b2.i();
            AbstractC0048Bt.m(i3, "readOnlyFqName.toUnsafe()");
            hashMap2.put(i3, b3);
        }
        for (EnumC1791qv enumC1791qv : EnumC1791qv.values()) {
            C1639ob j10 = C1639ob.j(enumC1791qv.e());
            EnumC1423lJ d3 = enumC1791qv.d();
            AbstractC0048Bt.m(d3, "jvmType.primitiveType");
            a(j10, C1639ob.j(AbstractC1499mT.j.c(d3.h)));
        }
        for (C1639ob c1639ob4 : C2101vc.a) {
            a(C1639ob.j(new C2245xo("kotlin.jvm.internal." + c1639ob4.i().b() + "CompanionObject")), c1639ob4.d(YS.b));
        }
        for (int i4 = 0; i4 < 23; i4++) {
            a(C1639ob.j(new C2245xo(AbstractC2188wx.g(i4, "kotlin.jvm.functions.Function"))), new C1639ob(AbstractC1499mT.j, C0827cE.e("Function" + i4)));
            b(new C2245xo(b + i4), g);
        }
        for (int i5 = 0; i5 < 22; i5++) {
            EnumC0304Lp enumC0304Lp5 = EnumC0304Lp.n;
            b(new C2245xo((enumC0304Lp5.h.a.toString() + '.' + enumC0304Lp5.i) + i5), g);
        }
        b(AbstractC1433lT.b.g(), d(Void.class));
    }

    public static void a(C1639ob c1639ob, C1639ob c1639ob2) {
        C2377zo i2 = c1639ob.b().i();
        AbstractC0048Bt.m(i2, "javaClassId.asSingleFqName().toUnsafe()");
        h.put(i2, c1639ob2);
        b(c1639ob2.b(), c1639ob);
    }

    public static void b(C2245xo c2245xo, C1639ob c1639ob) {
        C2377zo i2 = c2245xo.i();
        AbstractC0048Bt.m(i2, "kotlinFqNameUnsafe.toUnsafe()");
        i.put(i2, c1639ob);
    }

    public static void c(Class cls, C2377zo c2377zo) {
        a(d(cls), C1639ob.j(c2377zo.g()));
    }

    public static C1639ob d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        return declaringClass == null ? C1639ob.j(new C2245xo(cls.getCanonicalName())) : d(declaringClass).d(C0827cE.e(cls.getSimpleName()));
    }

    public static boolean e(C2377zo c2377zo, String str) {
        Integer C;
        String str2 = c2377zo.a;
        if (str2 != null) {
            String O = UT.O(str2, str, "");
            return O.length() > 0 && (O.length() <= 0 || !AbstractC0868ct.t(O.charAt(0), '0', false)) && (C = AbstractC0778bU.C(O)) != null && C.intValue() >= 23;
        }
        C2377zo.a(4);
        throw null;
    }

    public static C1639ob f(C2377zo c2377zo) {
        return (e(c2377zo, a) || e(c2377zo, c)) ? e : (e(c2377zo, b) || e(c2377zo, d)) ? g : (C1639ob) i.get(c2377zo);
    }
}
