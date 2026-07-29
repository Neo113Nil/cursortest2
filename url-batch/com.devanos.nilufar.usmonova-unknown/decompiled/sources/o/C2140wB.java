package o;

import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.wB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2140wB implements Map, Serializable, InterfaceC1792qw {
    public static final C2140wB u;
    public Object[] h;
    public Object[] i;
    public int[] j;
    public int[] k;
    public int l;
    public int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f238o;
    public int p;
    public C2206xB q;
    public C2272yB r;
    public C2206xB s;
    public boolean t;

    static {
        C2140wB c2140wB = new C2140wB(0);
        c2140wB.t = true;
        u = c2140wB;
    }

    public C2140wB() {
        this(8);
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int k = k(obj);
            int i = this.l * 2;
            int length = this.k.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.k;
                int i3 = iArr[k];
                if (i3 <= 0) {
                    int i4 = this.m;
                    Object[] objArr = this.h;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.m = i5;
                        objArr[i4] = obj;
                        this.j[i4] = k;
                        iArr[k] = i5;
                        this.p++;
                        this.f238o++;
                        if (i2 > this.l) {
                            this.l = i2;
                        }
                        return i4;
                    }
                    g(1);
                } else {
                    if (AbstractC0048Bt.h(this.h[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        l(this.k.length * 2);
                        break;
                    }
                    k = k == 0 ? this.k.length - 1 : k - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.t) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.m - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.j;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.k[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        AbstractC1807r8.V(this.h, 0, this.m);
        Object[] objArr = this.i;
        if (objArr != null) {
            AbstractC1807r8.V(objArr, 0, this.m);
        }
        this.p = 0;
        this.m = 0;
        this.f238o++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return j(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.m;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.j;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.h;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.k[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        AbstractC1807r8.V(this.h, i3, i);
        if (objArr != null) {
            AbstractC1807r8.V(objArr, i3, this.m);
        }
        this.m = i3;
    }

    public final boolean e(Collection collection) {
        AbstractC0048Bt.n(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C2206xB c2206xB = this.s;
        if (c2206xB != null) {
            return c2206xB;
        }
        C2206xB c2206xB2 = new C2206xB(this, 0);
        this.s = c2206xB2;
        return c2206xB2;
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
        return this.p == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        AbstractC0048Bt.n(entry, "entry");
        int h = h(entry.getKey());
        if (h < 0) {
            return false;
        }
        Object[] objArr = this.i;
        AbstractC0048Bt.k(objArr);
        return AbstractC0048Bt.h(objArr[h], entry.getValue());
    }

    public final void g(int i) {
        Object[] objArr;
        Object[] objArr2 = this.h;
        int length = objArr2.length;
        int i2 = this.m;
        int i3 = length - i2;
        int i4 = i2 - this.p;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr2.length) {
            int length2 = objArr2.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i6);
            AbstractC0048Bt.m(copyOf, "copyOf(...)");
            this.h = copyOf;
            Object[] objArr3 = this.i;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i6);
                AbstractC0048Bt.m(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.i = objArr;
            int[] copyOf2 = Arrays.copyOf(this.j, i6);
            AbstractC0048Bt.m(copyOf2, "copyOf(...)");
            this.j = copyOf2;
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.k.length) {
                l(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int h = h(obj);
        if (h < 0) {
            return null;
        }
        Object[] objArr = this.i;
        AbstractC0048Bt.k(objArr);
        return objArr[h];
    }

    public final int h(Object obj) {
        int k = k(obj);
        int i = this.l;
        while (true) {
            int i2 = this.k[k];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (AbstractC0048Bt.h(this.h[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            k = k == 0 ? this.k.length - 1 : k - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C1942tB c1942tB = new C1942tB(this, 0);
        int i = 0;
        while (c1942tB.hasNext()) {
            int i2 = c1942tB.h;
            C2140wB c2140wB = (C2140wB) c1942tB.k;
            if (i2 >= c2140wB.m) {
                throw new NoSuchElementException();
            }
            c1942tB.h = i2 + 1;
            c1942tB.i = i2;
            Object obj = c2140wB.h[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c2140wB.i;
            AbstractC0048Bt.k(objArr);
            Object obj2 = objArr[c1942tB.i];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c1942tB.f();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.p == 0;
    }

    public final int j(Object obj) {
        int i = this.m;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.j[i] >= 0) {
                Object[] objArr = this.i;
                AbstractC0048Bt.k(objArr);
                if (AbstractC0048Bt.h(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.n;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2206xB c2206xB = this.q;
        if (c2206xB != null) {
            return c2206xB;
        }
        C2206xB c2206xB2 = new C2206xB(this, 1);
        this.q = c2206xB2;
        return c2206xB2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.j[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i) {
        this.f238o++;
        int i2 = 0;
        if (this.m > this.p) {
            d(false);
        }
        this.k = new int[i];
        this.n = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.m) {
            int i3 = i2 + 1;
            int k = k(this.h[i2]);
            int i4 = this.l;
            while (true) {
                int[] iArr = this.k;
                if (iArr[k] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                k = k == 0 ? iArr.length - 1 : k - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i) {
        Object[] objArr = this.h;
        AbstractC0048Bt.n(objArr, "<this>");
        objArr[i] = null;
        Object[] objArr2 = this.i;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i2 = this.j[i];
        int i3 = this.l * 2;
        int length = this.k.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.k.length - 1 : i2 - 1;
            i5++;
            if (i5 > this.l) {
                this.k[i6] = 0;
                break;
            }
            int[] iArr = this.k;
            int i7 = iArr[i2];
            if (i7 == 0) {
                iArr[i6] = 0;
                break;
            }
            if (i7 < 0) {
                iArr[i6] = -1;
            } else {
                int i8 = i7 - 1;
                int k = k(this.h[i8]) - i2;
                int[] iArr2 = this.k;
                if ((k & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i7;
                    this.j[i8] = i6;
                }
                i4--;
                if (i4 >= 0) {
                    this.k[i6] = -1;
                    break;
                }
            }
            i6 = i2;
            i5 = 0;
            i4--;
            if (i4 >= 0) {
            }
        }
        this.j[i] = -1;
        this.p--;
        this.f238o++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int a = a(obj);
        Object[] objArr = this.i;
        if (objArr == null) {
            int length = this.h.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.i = objArr;
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
        AbstractC0048Bt.n(map, Constants.MessagePayloadKeys.FROM);
        b();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a = a(entry.getKey());
            Object[] objArr = this.i;
            if (objArr == null) {
                int length = this.h.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.i = objArr;
            }
            if (a >= 0) {
                objArr[a] = entry.getValue();
            } else {
                int i = (-a) - 1;
                if (!AbstractC0048Bt.h(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int h = h(obj);
        if (h < 0) {
            return null;
        }
        Object[] objArr = this.i;
        AbstractC0048Bt.k(objArr);
        Object obj2 = objArr[h];
        m(h);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.p * 3) + 2);
        sb.append("{");
        int i = 0;
        C1942tB c1942tB = new C1942tB(this, 0);
        while (c1942tB.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c1942tB.h;
            C2140wB c2140wB = (C2140wB) c1942tB.k;
            if (i2 >= c2140wB.m) {
                throw new NoSuchElementException();
            }
            c1942tB.h = i2 + 1;
            c1942tB.i = i2;
            Object obj = c2140wB.h[i2];
            if (obj == c2140wB) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c2140wB.i;
            AbstractC0048Bt.k(objArr);
            Object obj2 = objArr[c1942tB.i];
            if (obj2 == c2140wB) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c1942tB.f();
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        C2272yB c2272yB = this.r;
        if (c2272yB != null) {
            return c2272yB;
        }
        C2272yB c2272yB2 = new C2272yB(0, this);
        this.r = c2272yB2;
        return c2272yB2;
    }

    public C2140wB(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.h = objArr;
        this.i = null;
        this.j = iArr;
        this.k = new int[highestOneBit];
        this.l = 2;
        this.m = 0;
        this.n = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
