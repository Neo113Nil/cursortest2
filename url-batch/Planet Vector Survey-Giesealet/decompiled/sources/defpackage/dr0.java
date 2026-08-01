package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class dr0 {
    public int[] d = nz.e;
    public Object[] e = nz.g;
    public int f;

    public dr0(int i) {
    }

    public final int a(Object obj) {
        int i = this.f * 2;
        Object[] objArr = this.e;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i, Object obj) {
        int i2 = this.f;
        if (i2 == 0) {
            return -1;
        }
        int o = nz.o(this.d, i2, i);
        if (o < 0 || nz.l(obj, this.e[o << 1])) {
            return o;
        }
        int i3 = o + 1;
        while (i3 < i2 && this.d[i3] == i) {
            if (nz.l(obj, this.e[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = o - 1; i4 >= 0 && this.d[i4] == i; i4--) {
            if (nz.l(obj, this.e[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f > 0) {
            this.d = nz.e;
            this.e = nz.g;
            this.f = 0;
        }
        if (this.f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i = this.f;
        if (i == 0) {
            return -1;
        }
        int o = nz.o(this.d, i, 0);
        if (o < 0 || this.e[o << 1] == null) {
            return o;
        }
        int i2 = o + 1;
        while (i2 < i && this.d[i2] == 0) {
            if (this.e[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = o - 1; i3 >= 0 && this.d[i3] == 0; i3--) {
            if (this.e[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object e(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f) {
            z = true;
        }
        if (z) {
            return this.e[i << 1];
        }
        g8.n("Expected index to be within 0..size()-1, but was ", i);
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof dr0) {
                int i = this.f;
                if (i != ((dr0) obj).f) {
                    return false;
                }
                dr0 dr0Var = (dr0) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object e = e(i2);
                    Object h = h(i2);
                    Object obj2 = dr0Var.get(e);
                    if (h == null) {
                        if (obj2 != null || !dr0Var.containsKey(e)) {
                            return false;
                        }
                    } else if (!h.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f;
            for (int i4 = 0; i4 < i3; i4++) {
                Object e2 = e(i4);
                Object h2 = h(i4);
                Object obj3 = ((Map) obj).get(e2);
                if (h2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(e2)) {
                        return false;
                    }
                } else if (!h2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f)) {
            g8.n("Expected index to be within 0..size()-1, but was ", i);
            return null;
        }
        Object[] objArr = this.e;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.d;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                p8.R(iArr, iArr, i, i5, i2);
                Object[] objArr2 = this.e;
                p8.T(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.e;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.d = Arrays.copyOf(iArr, i7);
            this.e = Arrays.copyOf(this.e, i7 << 1);
            if (i2 != this.f) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                p8.R(iArr, this.d, 0, 0, i);
                p8.T(objArr, this.e, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                p8.R(iArr, this.d, i, i8, i2);
                p8.T(objArr, this.e, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.f) {
            throw new ConcurrentModificationException();
        }
        this.f = i4;
        return obj;
    }

    public final Object g(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.f) {
            z = true;
        }
        if (!z) {
            g8.n("Expected index to be within 0..size()-1, but was ", i);
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.e;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return this.e[(c << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c = c(obj);
        return c >= 0 ? this.e[(c << 1) + 1] : obj2;
    }

    public final Object h(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f) {
            z = true;
        }
        if (z) {
            return this.e[(i << 1) + 1];
        }
        g8.n("Expected index to be within 0..size()-1, but was ", i);
        return null;
    }

    public final int hashCode() {
        int[] iArr = this.d;
        Object[] objArr = this.e;
        int i = this.f;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.f <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int b = obj != null ? b(hashCode, obj) : d();
        if (b >= 0) {
            int i2 = (b << 1) + 1;
            Object[] objArr = this.e;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~b;
        int[] iArr = this.d;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.d = Arrays.copyOf(iArr, i4);
            this.e = Arrays.copyOf(this.e, i4 << 1);
            if (i != this.f) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.d;
            int i5 = i3 + 1;
            p8.R(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.e;
            p8.T(objArr2, objArr2, i5 << 1, i3 << 1, this.f << 1);
        }
        int i6 = this.f;
        if (i == i6) {
            int[] iArr3 = this.d;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.e;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c = c(obj);
        if (c < 0 || !nz.l(obj2, h(c))) {
            return false;
        }
        f(c);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c = c(obj);
        if (c < 0 || !nz.l(obj2, h(c))) {
            return false;
        }
        g(c, obj3);
        return true;
    }

    public final int size() {
        return this.f;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 28);
        sb.append('{');
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object e = e(i2);
            if (e != sb) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object h = h(i2);
            if (h != sb) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return f(c);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c = c(obj);
        if (c >= 0) {
            return g(c, obj2);
        }
        return null;
    }
}
