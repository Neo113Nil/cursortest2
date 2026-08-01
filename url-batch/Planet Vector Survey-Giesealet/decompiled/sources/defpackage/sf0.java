package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class sf0 extends w {
    public final Object[] d;
    public final Object[] e;
    public final int f;
    public final int g;

    public sf0(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.d = objArr;
        this.e = objArr2;
        this.f = i;
        this.g = i2;
        if (!(a() > 32)) {
            gh0.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] i(Object[] objArr, int i, int i2, Object obj, u8 u8Var) {
        int l = od0.l(i2, i);
        if (i == 0) {
            Object[] copyOf = l == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            p8.T(objArr, copyOf, l + 1, l, 31);
            u8Var.a = objArr[31];
            copyOf[l] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[l];
        obj2.getClass();
        copyOf2[l] = i((Object[]) obj2, i3, i2, obj, u8Var);
        while (true) {
            l++;
            if (l >= 32 || copyOf2[l] == null) {
                break;
            }
            Object obj3 = objArr[l];
            obj3.getClass();
            copyOf2[l] = i((Object[]) obj3, i3, 0, u8Var.a, u8Var);
        }
        return copyOf2;
    }

    public static Object[] k(Object[] objArr, int i, int i2, u8 u8Var) {
        Object[] k;
        int l = od0.l(i2, i);
        if (i == 5) {
            u8Var.a = objArr[l];
            k = null;
        } else {
            Object obj = objArr[l];
            obj.getClass();
            k = k((Object[]) obj, i - 5, i2, u8Var);
        }
        if (k == null && l == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[l] = k;
        return copyOf;
    }

    public static Object[] q(Object[] objArr, int i, int i2, Object obj) {
        int l = od0.l(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[l] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[l];
        obj2.getClass();
        copyOf[l] = q((Object[]) obj2, i - 5, i2, obj);
        return copyOf;
    }

    @Override // defpackage.i
    public final int a() {
        return this.f;
    }

    @Override // defpackage.w
    public final w b(int i, Object obj) {
        int i2 = this.f;
        px0.q(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int p = p();
        Object[] objArr = this.d;
        if (i >= p) {
            return j(objArr, i - p, obj);
        }
        u8 u8Var = new u8(null);
        return j(i(objArr, this.g, i, obj, u8Var), 0, u8Var.a);
    }

    @Override // defpackage.w
    public final w c(Object obj) {
        int p = p();
        int i = this.f;
        int i2 = i - p;
        Object[] objArr = this.d;
        Object[] objArr2 = this.e;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new sf0(objArr, copyOf, i + 1, this.g);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return l(objArr, objArr2, objArr3);
    }

    @Override // defpackage.w
    public final tf0 e() {
        return new tf0(this, this.d, this.e, this.g);
    }

    @Override // defpackage.w
    public final w f(v vVar) {
        tf0 tf0Var = new tf0(this, this.d, this.e, this.g);
        tf0Var.y(vVar);
        return tf0Var.c();
    }

    @Override // defpackage.w
    public final w g(int i) {
        px0.p(i, a());
        int p = p();
        int i2 = this.g;
        Object[] objArr = this.d;
        return i >= p ? o(objArr, p, i2, i - p) : o(n(objArr, i2, i, new u8(this.e[0])), p, i2, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        px0.p(i, a());
        if (p() <= i) {
            objArr = this.e;
        } else {
            Object[] objArr2 = this.d;
            for (int i2 = this.g; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[od0.l(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.w
    public final w h(int i, Object obj) {
        int i2 = this.f;
        px0.p(i, i2);
        int p = p();
        Object[] objArr = this.d;
        Object[] objArr2 = this.e;
        int i3 = this.g;
        if (p > i) {
            return new sf0(q(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new sf0(objArr, copyOf, i2, i3);
    }

    public final sf0 j(Object[] objArr, int i, Object obj) {
        int p = p();
        int i2 = this.f;
        int i3 = i2 - p;
        Object[] objArr2 = this.e;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            p8.T(objArr2, copyOf, i + 1, i, i3);
            copyOf[i] = obj;
            return new sf0(objArr, copyOf, i2 + 1, this.g);
        }
        Object obj2 = objArr2[31];
        p8.T(objArr2, copyOf, i + 1, i, i3 - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return l(objArr, copyOf, objArr3);
    }

    public final sf0 l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f;
        int i2 = i >> 5;
        int i3 = this.g;
        if (i2 <= (1 << i3)) {
            return new sf0(m(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new sf0(m(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    @Override // defpackage.r, java.util.List
    public final ListIterator listIterator(int i) {
        px0.q(i, this.f);
        return new uf0(this.d, this.e, i, this.f, (this.g / 5) + 1);
    }

    public final Object[] m(int i, Object[] objArr, Object[] objArr2) {
        int l = od0.l(a() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[l] = objArr2;
            return copyOf;
        }
        copyOf[l] = m(i - 5, (Object[]) copyOf[l], objArr2);
        return copyOf;
    }

    public final Object[] n(Object[] objArr, int i, int i2, u8 u8Var) {
        int l = od0.l(i2, i);
        if (i == 0) {
            Object[] copyOf = l == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            p8.T(objArr, copyOf, l, l + 1, 32);
            copyOf[31] = u8Var.a;
            u8Var.a = objArr[l];
            return copyOf;
        }
        int l2 = objArr[31] == null ? od0.l(p() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = l + 1;
        if (i4 <= l2) {
            while (true) {
                Object obj = copyOf2[l2];
                obj.getClass();
                copyOf2[l2] = n((Object[]) obj, i3, 0, u8Var);
                if (l2 == i4) {
                    break;
                }
                l2--;
            }
        }
        Object obj2 = copyOf2[l];
        obj2.getClass();
        copyOf2[l] = n((Object[]) obj2, i3, i2, u8Var);
        return copyOf2;
    }

    public final w o(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f - i;
        if (i4 != 1) {
            Object[] objArr2 = this.e;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                p8.T(objArr2, copyOf, i3, i3 + 1, i4);
            }
            copyOf[i5] = null;
            return new sf0(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new nr0(objArr);
        }
        u8 u8Var = new u8(null);
        Object[] k = k(objArr, i2, i - 1, u8Var);
        k.getClass();
        Object obj = u8Var.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (k[1] != null) {
            return new sf0(k, objArr3, i, i2);
        }
        Object obj2 = k[0];
        obj2.getClass();
        return new sf0((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int p() {
        return (this.f - 1) & (-32);
    }
}
