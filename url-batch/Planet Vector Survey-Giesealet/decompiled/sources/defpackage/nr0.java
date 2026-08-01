package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class nr0 extends w {
    public static final nr0 e = new nr0(new Object[0]);
    public final Object[] d;

    public nr0(Object[] objArr) {
        this.d = objArr;
    }

    @Override // defpackage.i
    public final int a() {
        return this.d.length;
    }

    @Override // defpackage.w
    public final w b(int i, Object obj) {
        Object[] objArr = this.d;
        px0.q(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            p8.V(objArr, objArr2, 0, i, 6);
            p8.T(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new nr0(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        p8.T(objArr, copyOf, i + 1, i, objArr.length - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new sf0(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.w
    public final w c(Object obj) {
        Object[] objArr = this.d;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new nr0(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new sf0(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.w
    public final w d(Collection collection) {
        Object[] objArr = this.d;
        if (collection.size() + objArr.length > 32) {
            tf0 e2 = e();
            e2.addAll(collection);
            return e2.c();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new nr0(copyOf);
    }

    @Override // defpackage.w
    public final tf0 e() {
        return new tf0(this, null, this.d, 0);
    }

    @Override // defpackage.w
    public final w f(v vVar) {
        Object[] objArr = this.d;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) vVar.c(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? e : new nr0(p8.W(objArr2, 0, length));
    }

    @Override // defpackage.w
    public final w g(int i) {
        Object[] objArr = this.d;
        px0.p(i, objArr.length);
        if (objArr.length == 1) {
            return e;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        p8.T(objArr, copyOf, i, i + 1, objArr.length);
        return new nr0(copyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.d;
        px0.p(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.w
    public final w h(int i, Object obj) {
        Object[] objArr = this.d;
        px0.p(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new nr0(copyOf);
    }

    @Override // defpackage.r, java.util.List
    public final int indexOf(Object obj) {
        return p8.b0(this.d, obj);
    }

    @Override // defpackage.r, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.d;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.r, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.d;
        px0.q(i, objArr.length);
        return new bb(objArr, i, objArr.length);
    }
}
