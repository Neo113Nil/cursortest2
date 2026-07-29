package o;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class GR {
    public int[] h;
    public Object[] i;
    public int j;

    public GR(int i) {
        this.h = i == 0 ? AbstractC1473m3.b : new int[i];
        this.i = i == 0 ? AbstractC1473m3.d : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.j * 2;
        Object[] objArr = this.i;
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
        int i2 = this.j;
        if (i2 == 0) {
            return -1;
        }
        int h = AbstractC1473m3.h(i2, i, this.h);
        if (h < 0 || AbstractC0048Bt.h(obj, this.i[h << 1])) {
            return h;
        }
        int i3 = h + 1;
        while (i3 < i2 && this.h[i3] == i) {
            if (AbstractC0048Bt.h(obj, this.i[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = h - 1; i4 >= 0 && this.h[i4] == i; i4--) {
            if (AbstractC0048Bt.h(obj, this.i[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.j > 0) {
            this.h = AbstractC1473m3.b;
            this.i = AbstractC1473m3.d;
            this.j = 0;
        }
        if (this.j > 0) {
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
        int i = this.j;
        if (i == 0) {
            return -1;
        }
        int h = AbstractC1473m3.h(i, 0, this.h);
        if (h < 0 || this.i[h << 1] == null) {
            return h;
        }
        int i2 = h + 1;
        while (i2 < i && this.h[i2] == 0) {
            if (this.i[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = h - 1; i3 >= 0 && this.h[i3] == 0; i3--) {
            if (this.i[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object e(int i) {
        boolean z = false;
        if (i >= 0 && i < this.j) {
            z = true;
        }
        if (z) {
            return this.i[i << 1];
        }
        AbstractC0773bP.l("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof GR) {
                int i = this.j;
                if (i != ((GR) obj).j) {
                    return false;
                }
                GR gr = (GR) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object e = e(i2);
                    Object h = h(i2);
                    Object obj2 = gr.get(e);
                    if (h == null) {
                        if (obj2 != null || !gr.containsKey(e)) {
                            return false;
                        }
                    } else if (!h.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.j != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.j;
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
        if (i < 0 || i >= (i2 = this.j)) {
            AbstractC0773bP.l("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.i;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.h;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                P6.a0(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.i;
                P6.b0(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.i;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i7);
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.h = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.i, i7 << 1);
            AbstractC0048Bt.m(copyOf2, "copyOf(this, newSize)");
            this.i = copyOf2;
            if (i2 != this.j) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                P6.a0(0, 0, i, iArr, this.h);
                P6.b0(objArr, this.i, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                P6.a0(i, i8, i2, iArr, this.h);
                P6.b0(objArr, this.i, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.j) {
            throw new ConcurrentModificationException();
        }
        this.j = i4;
        return obj;
    }

    public final Object g(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.j) {
            z = true;
        }
        if (!z) {
            AbstractC0773bP.l("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return this.i[(c << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c = c(obj);
        return c >= 0 ? this.i[(c << 1) + 1] : obj2;
    }

    public final Object h(int i) {
        boolean z = false;
        if (i >= 0 && i < this.j) {
            z = true;
        }
        if (z) {
            return this.i[(i << 1) + 1];
        }
        AbstractC0773bP.l("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final int hashCode() {
        int[] iArr = this.h;
        Object[] objArr = this.i;
        int i = this.j;
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
        return this.j <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.j;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int b = obj != null ? b(hashCode, obj) : d();
        if (b >= 0) {
            int i2 = (b << 1) + 1;
            Object[] objArr = this.i;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~b;
        int[] iArr = this.h;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.h = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.i, i4 << 1);
            AbstractC0048Bt.m(copyOf2, "copyOf(this, newSize)");
            this.i = copyOf2;
            if (i != this.j) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.h;
            int i5 = i3 + 1;
            P6.a0(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.i;
            P6.b0(objArr2, objArr2, i5 << 1, i3 << 1, this.j << 1);
        }
        int i6 = this.j;
        if (i == i6) {
            int[] iArr3 = this.h;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.i;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.j = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
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

    public final int size() {
        return this.j;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.j * 28);
        sb.append('{');
        int i = this.j;
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
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c = c(obj);
        if (c < 0 || !AbstractC0048Bt.h(obj2, h(c))) {
            return false;
        }
        f(c);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c = c(obj);
        if (c < 0 || !AbstractC0048Bt.h(obj2, h(c))) {
            return false;
        }
        g(c, obj3);
        return true;
    }
}
