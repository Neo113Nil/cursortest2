package o;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2106vh {
    public static final C1623oL c = new C1623oL(29);
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final C2106vh m;
    public static final C2106vh n;

    /* renamed from: o, reason: collision with root package name */
    public static final C2106vh f234o;
    public static final C2106vh p;
    public static final C2106vh q;
    public static final ArrayList r;
    public static final ArrayList s;
    public final List a;
    public final int b;

    static {
        C2040uh c2040uh;
        int i2 = d;
        int i3 = i2 << 1;
        e = i2;
        int i4 = i2 << 2;
        f = i3;
        int i5 = i2 << 3;
        g = i4;
        int i6 = i2 << 4;
        h = i5;
        int i7 = i2 << 5;
        i = i6;
        j = i7;
        d = i2 << 7;
        int i8 = (i2 << 6) - 1;
        k = i8;
        int i9 = i2 | i3 | i4;
        l = i9;
        m = new C2106vh(i8);
        n = new C2106vh(i6 | i7);
        new C2106vh(i2);
        new C2106vh(i3);
        new C2106vh(i4);
        f234o = new C2106vh(i9);
        new C2106vh(i5);
        p = new C2106vh(i6);
        q = new C2106vh(i7);
        new C2106vh(i3 | i6 | i7);
        Field[] fields = C2106vh.class.getFields();
        AbstractC0048Bt.m(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            C2040uh c2040uh2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            C2106vh c2106vh = obj instanceof C2106vh ? (C2106vh) obj : null;
            if (c2106vh != null) {
                int i10 = c2106vh.b;
                String name = field2.getName();
                AbstractC0048Bt.m(name, "field.name");
                c2040uh2 = new C2040uh(i10, name);
            }
            if (c2040uh2 != null) {
                arrayList2.add(c2040uh2);
            }
        }
        r = arrayList2;
        Field[] fields2 = C2106vh.class.getFields();
        AbstractC0048Bt.m(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (AbstractC0048Bt.h(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                AbstractC0048Bt.m(name2, "field.name");
                c2040uh = new C2040uh(intValue, name2);
            } else {
                c2040uh = null;
            }
            if (c2040uh != null) {
                arrayList5.add(c2040uh);
            }
        }
        s = arrayList5;
    }

    public C2106vh(int i2, List list) {
        AbstractC0048Bt.n(list, "excludes");
        this.a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i2 &= ~((AbstractC1974th) it.next()).a();
        }
        this.b = i2;
    }

    public final boolean a(int i2) {
        return (i2 & this.b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2106vh.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C2106vh c2106vh = (C2106vh) obj;
        return AbstractC0048Bt.h(this.a, c2106vh.a) && this.b == c2106vh.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        Object obj;
        Iterator it = r.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C2040uh) obj).a == this.b) {
                break;
            }
        }
        C2040uh c2040uh = (C2040uh) obj;
        String str = c2040uh != null ? c2040uh.b : null;
        if (str == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = s.iterator();
            while (it2.hasNext()) {
                C2040uh c2040uh2 = (C2040uh) it2.next();
                String str2 = a(c2040uh2.a) ? c2040uh2.b : null;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = AbstractC0720ac.t0(arrayList, " | ", null, null, null, 62);
        }
        return "DescriptorKindFilter(" + str + ", " + this.a + ')';
    }

    public /* synthetic */ C2106vh(int i2) {
        this(i2, C1318jk.h);
    }
}
