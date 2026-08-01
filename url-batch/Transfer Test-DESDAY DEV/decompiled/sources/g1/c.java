package g1;

import f1.m;
import f1.n;
import f1.o;
import f1.p;
import f1.q;
import f1.r;
import f1.s;
import f1.t;
import f1.u;
import f1.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements l1.b, b {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2577b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f2578c;

    /* renamed from: a, reason: collision with root package name */
    public final Class f2579a;

    static {
        List a02 = V0.f.a0(f1.a.class, f1.l.class, p.class, q.class, k0.b.class, r.class, s.class, t.class, u.class, v.class, f1.b.class, f1.c.class, f1.d.class, f1.e.class, f1.f.class, f1.g.class, f1.h.class, f1.i.class, f1.j.class, f1.k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(V0.g.c0(a02));
        int i = 0;
        for (Object obj : a02) {
            int i2 = i + 1;
            if (i < 0) {
                V0.f.b0();
                throw null;
            }
            arrayList.add(new U0.d((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f2577b = V0.p.a0(arrayList);
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
            sb.append(n1.g.t(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f2577b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f2578c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(V0.p.Z(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), n1.g.t((String) entry2.getValue()));
        }
    }

    public c(Class cls) {
        f.e(cls, "jClass");
        this.f2579a = cls;
    }

    @Override // g1.b
    public final Class a() {
        return this.f2579a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && T.e.A(this).equals(T.e.A((l1.b) obj));
    }

    public final int hashCode() {
        return T.e.A(this).hashCode();
    }

    public final String toString() {
        return this.f2579a.toString() + " (Kotlin reflection is not available)";
    }
}
