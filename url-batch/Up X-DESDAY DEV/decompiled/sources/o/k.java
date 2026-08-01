package o;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class k {
    public static Object[] d;

    /* renamed from: e, reason: collision with root package name */
    public static int f3326e;

    /* renamed from: f, reason: collision with root package name */
    public static Object[] f3327f;

    /* renamed from: g, reason: collision with root package name */
    public static int f3328g;

    /* renamed from: a, reason: collision with root package name */
    public int[] f3329a = d.f3306a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f3330b = d.f3307b;

    /* renamed from: c, reason: collision with root package name */
    public int f3331c = 0;

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (k.class) {
                try {
                    if (f3328g < 10) {
                        objArr[0] = f3327f;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f3327f = objArr;
                        f3328g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (k.class) {
                try {
                    if (f3326e < 10) {
                        objArr[0] = d;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        d = objArr;
                        f3326e++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (k.class) {
                try {
                    Object[] objArr = f3327f;
                    if (objArr != null) {
                        this.f3330b = objArr;
                        f3327f = (Object[]) objArr[0];
                        this.f3329a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f3328g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (k.class) {
                try {
                    Object[] objArr2 = d;
                    if (objArr2 != null) {
                        this.f3330b = objArr2;
                        d = (Object[]) objArr2[0];
                        this.f3329a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f3326e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f3329a = new int[i];
        this.f3330b = new Object[i << 1];
    }

    public final void b(int i) {
        int i2 = this.f3331c;
        int[] iArr = this.f3329a;
        if (iArr.length < i) {
            Object[] objArr = this.f3330b;
            a(i);
            if (this.f3331c > 0) {
                System.arraycopy(iArr, 0, this.f3329a, 0, i2);
                System.arraycopy(objArr, 0, this.f3330b, 0, i2 << 1);
            }
            c(iArr, objArr, i2);
        }
        if (this.f3331c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.f3331c;
        if (i > 0) {
            int[] iArr = this.f3329a;
            Object[] objArr = this.f3330b;
            this.f3329a = d.f3306a;
            this.f3330b = d.f3307b;
            this.f3331c = 0;
            c(iArr, objArr, i);
        }
        if (this.f3331c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i, Object obj) {
        int i2 = this.f3331c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = d.a(i2, i, this.f3329a);
            if (a2 < 0 || obj.equals(this.f3330b[a2 << 1])) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && this.f3329a[i3] == i) {
                if (obj.equals(this.f3330b[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.f3329a[i4] == i; i4--) {
                if (obj.equals(this.f3330b[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f3331c != kVar.f3331c) {
                return false;
            }
            for (int i = 0; i < this.f3331c; i++) {
                try {
                    Object h = h(i);
                    Object j2 = j(i);
                    Object orDefault = kVar.getOrDefault(h, null);
                    if (j2 == null) {
                        if (orDefault != null || !kVar.containsKey(h)) {
                            return false;
                        }
                    } else if (!j2.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f3331c != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f3331c; i2++) {
                try {
                    Object h2 = h(i2);
                    Object j3 = j(i2);
                    Object obj2 = map.get(h2);
                    if (j3 == null) {
                        if (obj2 != null || !map.containsKey(h2)) {
                            return false;
                        }
                    } else if (!j3.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i = this.f3331c;
        if (i == 0) {
            return -1;
        }
        try {
            int a2 = d.a(i, 0, this.f3329a);
            if (a2 < 0 || this.f3330b[a2 << 1] == null) {
                return a2;
            }
            int i2 = a2 + 1;
            while (i2 < i && this.f3329a[i2] == 0) {
                if (this.f3330b[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = a2 - 1; i3 >= 0 && this.f3329a[i3] == 0; i3--) {
                if (this.f3330b[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i = this.f3331c * 2;
        Object[] objArr = this.f3330b;
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

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e2 = e(obj);
        return e2 >= 0 ? this.f3330b[(e2 << 1) + 1] : obj2;
    }

    public final Object h(int i) {
        return this.f3330b[i << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f3329a;
        Object[] objArr = this.f3330b;
        int i = this.f3331c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final Object i(int i) {
        Object[] objArr = this.f3330b;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f3331c;
        int i4 = 0;
        if (i3 <= 1) {
            c(this.f3329a, objArr, i3);
            this.f3329a = d.f3306a;
            this.f3330b = d.f3307b;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f3329a;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f3330b;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f3330b;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f3331c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f3329a, 0, i);
                    System.arraycopy(objArr, 0, this.f3330b, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f3329a, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f3330b, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f3331c) {
            throw new ConcurrentModificationException();
        }
        this.f3331c = i4;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f3331c <= 0;
    }

    public final Object j(int i) {
        return this.f3330b[(i << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int d2;
        int i2 = this.f3331c;
        if (obj == null) {
            d2 = f();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            d2 = d(hashCode, obj);
        }
        if (d2 >= 0) {
            int i3 = (d2 << 1) + 1;
            Object[] objArr = this.f3330b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~d2;
        int[] iArr = this.f3329a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f3330b;
            a(i5);
            if (i2 != this.f3331c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f3329a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f3330b, 0, objArr2.length);
            }
            c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f3329a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f3330b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f3331c - i4) << 1);
        }
        int i7 = this.f3331c;
        if (i2 == i7) {
            int[] iArr4 = this.f3329a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f3330b;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.f3331c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return i(e2);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return null;
        }
        int i = (e2 << 1) + 1;
        Object[] objArr = this.f3330b;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f3331c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3331c * 28);
        sb.append('{');
        for (int i = 0; i < this.f3331c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object h = h(i);
            if (h != this) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j2 = j(i);
            if (j2 != this) {
                sb.append(j2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        Object j2 = j(e2);
        if (obj2 != j2 && (obj2 == null || !obj2.equals(j2))) {
            return false;
        }
        i(e2);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        Object j2 = j(e2);
        if (j2 != obj2 && (obj2 == null || !obj2.equals(j2))) {
            return false;
        }
        int i = (e2 << 1) + 1;
        Object[] objArr = this.f3330b;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return true;
    }
}
