package i1;

import c1.AbstractC0104b;
import h1.InterfaceC0173a;
import h1.m;
import h1.n;
import h1.o;
import h1.p;
import h1.q;
import h1.r;
import h1.s;
import h1.t;
import h1.u;
import h1.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements n1.b, b {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3044b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f3045c;

    /* renamed from: a, reason: collision with root package name */
    public final Class f3046a;

    static {
        List s02 = W0.k.s0(InterfaceC0173a.class, h1.l.class, p.class, q.class, k0.b.class, r.class, s.class, t.class, u.class, v.class, h1.b.class, h1.c.class, h1.d.class, h1.e.class, h1.f.class, h1.g.class, h1.h.class, h1.i.class, h1.j.class, h1.k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(W0.l.t0(s02));
        int i = 0;
        for (Object obj : s02) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new V0.d((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f3044b = W0.v.s0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        f.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            f.b(str);
            sb.append(p1.d.Y(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f3044b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f3045c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(W0.v.r0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), p1.d.Y((String) entry2.getValue()));
        }
    }

    public c(Class cls) {
        f.e(cls, "jClass");
        this.f3046a = cls;
    }

    @Override // i1.b
    public final Class a() {
        return this.f3046a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && AbstractC0104b.o(this).equals(AbstractC0104b.o((n1.b) obj));
    }

    public final int hashCode() {
        return AbstractC0104b.o(this).hashCode();
    }

    public final String toString() {
        return this.f3046a.toString() + " (Kotlin reflection is not available)";
    }
}
