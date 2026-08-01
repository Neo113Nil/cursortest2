package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class s40 implements Map, Serializable, l00 {
    public static final s40 q;
    public Object[] d;
    public Object[] e;
    public int[] f;
    public int[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public t40 m;
    public u40 n;
    public t40 o;
    public boolean p;

    static {
        s40 s40Var = new s40(0);
        s40Var.p = true;
        q = s40Var;
    }

    public s40(int i) {
        if (i < 0) {
            g8.r("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.d = objArr;
        this.e = null;
        this.f = iArr;
        this.g = new int[highestOneBit];
        this.h = 2;
        this.i = 0;
        this.j = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int h = h(obj);
            int i = this.h * 2;
            int length = this.g.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                int i3 = iArr[h];
                if (i3 <= 0) {
                    int i4 = this.i;
                    Object[] objArr = this.d;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.i = i5;
                        objArr[i4] = obj;
                        this.f[i4] = h;
                        iArr[h] = i5;
                        this.l++;
                        this.k++;
                        if (i2 > this.h) {
                            this.h = i2;
                        }
                        return i4;
                    }
                    e(1);
                } else {
                    if (nz.l(this.d[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        i(this.g.length * 2);
                        break;
                    }
                    h = h == 0 ? this.g.length - 1 : h - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.p) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z) {
        int i;
        Object[] objArr = this.e;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.i;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.d;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.g[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        a50.G(this.d, i3, i);
        if (objArr != null) {
            a50.G(objArr, i3, this.i);
        }
        this.i = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.i - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.g[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        a50.G(this.d, 0, this.i);
        Object[] objArr = this.e;
        if (objArr != null) {
            a50.G(objArr, 0, this.i);
        }
        this.l = 0;
        this.i = 0;
        this.k++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        boolean l;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int f = f(entry.getKey());
                    if (f < 0) {
                        l = false;
                    } else {
                        Object[] objArr = this.e;
                        objArr.getClass();
                        l = nz.l(objArr[f], entry.getValue());
                    }
                    if (!l) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void e(int i) {
        Object[] objArr = this.d;
        int length = objArr.length;
        int i2 = this.i;
        int i3 = length - i2;
        int i4 = i2 - this.l;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            c(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.d = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.e;
            this.e = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f = Arrays.copyOf(this.f, i6);
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.g.length) {
                i(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        t40 t40Var = this.o;
        if (t40Var != null) {
            return t40Var;
        }
        t40 t40Var2 = new t40(this, 0);
        this.o = t40Var2;
        return t40Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.l == map.size() && d(map.entrySet());
    }

    public final int f(Object obj) {
        int h = h(obj);
        int i = this.h;
        while (true) {
            int i2 = this.g[h];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (nz.l(this.d[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            h = h == 0 ? this.g.length - 1 : h - 1;
        }
    }

    public final int g(Object obj) {
        int i = this.i;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f[i] >= 0) {
                Object[] objArr = this.e;
                objArr.getClass();
                if (nz.l(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int f = f(obj);
        if (f < 0) {
            return null;
        }
        Object[] objArr = this.e;
        objArr.getClass();
        return objArr[f];
    }

    public final int h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.j;
    }

    @Override // java.util.Map
    public final int hashCode() {
        p40 p40Var = new p40(this, 0);
        int i = 0;
        while (p40Var.hasNext()) {
            int i2 = p40Var.d;
            s40 s40Var = (s40) p40Var.g;
            if (i2 >= s40Var.i) {
                g8.k();
                return 0;
            }
            p40Var.d = i2 + 1;
            p40Var.e = i2;
            Object obj = s40Var.d[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = s40Var.e;
            objArr.getClass();
            Object obj2 = objArr[p40Var.e];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            p40Var.c();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i) {
        this.k++;
        int i2 = 0;
        if (this.i > this.l) {
            c(false);
        }
        this.g = new int[i];
        this.j = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.i) {
            int i3 = i2 + 1;
            int h = h(this.d[i2]);
            int i4 = this.h;
            while (true) {
                int[] iArr = this.g;
                if (iArr[h] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    g8.s("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                h = h == 0 ? iArr.length - 1 : h - 1;
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.l == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0022->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i) {
        Object[] objArr = this.d;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.e;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i2 = this.f[i];
        int i3 = this.h * 2;
        int length = this.g.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.g.length - 1 : i2 - 1;
            i5++;
            int i7 = this.h;
            int[] iArr = this.g;
            if (i5 > i7) {
                iArr[i6] = 0;
                break;
            }
            int i8 = iArr[i2];
            if (i8 == 0) {
                iArr[i6] = 0;
                break;
            }
            if (i8 < 0) {
                iArr[i6] = -1;
            } else {
                int i9 = i8 - 1;
                int h = h(this.d[i9]) - i2;
                int[] iArr2 = this.g;
                if ((h & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i8;
                    this.f[i9] = i6;
                }
                i4--;
                if (i4 >= 0) {
                    this.g[i6] = -1;
                    break;
                }
            }
            i6 = i2;
            i5 = 0;
            i4--;
            if (i4 >= 0) {
            }
        }
        this.f[i] = -1;
        this.l--;
        this.k++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        t40 t40Var = this.m;
        if (t40Var != null) {
            return t40Var;
        }
        t40 t40Var2 = new t40(this, 1);
        this.m = t40Var2;
        return t40Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int a = a(obj);
        Object[] objArr = this.e;
        if (objArr == null) {
            int length = this.d.length;
            if (length < 0) {
                g8.r("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.e = objArr;
        }
        if (a >= 0) {
            objArr[a] = obj2;
            return null;
        }
        int i = (-a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        b();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        e(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a = a(entry.getKey());
            Object[] objArr = this.e;
            if (objArr == null) {
                int length = this.d.length;
                if (length < 0) {
                    g8.r("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.e = objArr;
                }
            }
            if (a >= 0) {
                objArr[a] = entry.getValue();
            } else {
                int i = (-a) - 1;
                if (!nz.l(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int f = f(obj);
        if (f < 0) {
            return null;
        }
        Object[] objArr = this.e;
        objArr.getClass();
        Object obj2 = objArr[f];
        j(f);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.l * 3) + 2);
        sb.append("{");
        int i = 0;
        p40 p40Var = new p40(this, 0);
        while (p40Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = p40Var.d;
            s40 s40Var = (s40) p40Var.g;
            if (i2 >= s40Var.i) {
                g8.k();
                return null;
            }
            p40Var.d = i2 + 1;
            p40Var.e = i2;
            Object obj = s40Var.d[i2];
            if (obj == s40Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = s40Var.e;
            objArr.getClass();
            Object obj2 = objArr[p40Var.e];
            if (obj2 == s40Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            p40Var.c();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        u40 u40Var = this.n;
        if (u40Var != null) {
            return u40Var;
        }
        u40 u40Var2 = new u40(0, this);
        this.n = u40Var2;
        return u40Var2;
    }
}
