package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class YD implements RandomAccess {
    public Object[] h;
    public VD i;
    public int j = 0;

    public YD(Object[] objArr) {
        this.h = objArr;
    }

    public final void a(int i, Object obj) {
        j(this.j + 1);
        Object[] objArr = this.h;
        int i2 = this.j;
        if (i != i2) {
            P6.b0(objArr, objArr, i + 1, i, i2);
        }
        objArr[i] = obj;
        this.j++;
    }

    public final void b(Object obj) {
        j(this.j + 1);
        Object[] objArr = this.h;
        int i = this.j;
        objArr[i] = obj;
        this.j = i + 1;
    }

    public final void c(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        j(list.size() + this.j);
        Object[] objArr = this.h;
        if (i != this.j) {
            P6.b0(objArr, objArr, list.size() + i, i, this.j);
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = list.get(i2);
        }
        this.j = list.size() + this.j;
    }

    public final void e(int i, YD yd) {
        if (yd.k()) {
            return;
        }
        j(this.j + yd.j);
        Object[] objArr = this.h;
        int i2 = this.j;
        if (i != i2) {
            P6.b0(objArr, objArr, yd.j + i, i, i2);
        }
        P6.b0(yd.h, objArr, i, 0, yd.j);
        this.j += yd.j;
    }

    public final boolean f(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        j(collection.size() + this.j);
        Object[] objArr = this.h;
        if (i != this.j) {
            P6.b0(objArr, objArr, collection.size() + i, i, this.j);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0868ct.Y();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i3;
        }
        this.j = collection.size() + this.j;
        return true;
    }

    public final List g() {
        VD vd = this.i;
        if (vd != null) {
            return vd;
        }
        VD vd2 = new VD(this);
        this.i = vd2;
        return vd2;
    }

    public final void h() {
        Object[] objArr = this.h;
        int i = this.j;
        while (true) {
            i--;
            if (-1 >= i) {
                this.j = 0;
                return;
            }
            objArr[i] = null;
        }
    }

    public final boolean i(Object obj) {
        int i = this.j - 1;
        if (i >= 0) {
            for (int i2 = 0; !AbstractC0048Bt.h(this.h[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void j(int i) {
        Object[] objArr = this.h;
        if (objArr.length < i) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i, objArr.length * 2));
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.h = copyOf;
        }
    }

    public final boolean k() {
        return this.j == 0;
    }

    public final boolean l() {
        return this.j != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(Object obj) {
        int i;
        int i2 = this.j;
        if (i2 > 0) {
            Object[] objArr = this.h;
            i = 0;
            while (!AbstractC0048Bt.h(obj, objArr[i])) {
                i++;
                if (i >= i2) {
                }
            }
            if (i >= 0) {
                return false;
            }
            n(i);
            return true;
        }
        i = -1;
        if (i >= 0) {
        }
    }

    public final Object n(int i) {
        Object[] objArr = this.h;
        Object obj = objArr[i];
        int i2 = this.j;
        if (i != i2 - 1) {
            P6.b0(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.j - 1;
        this.j = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void o(int i, int i2) {
        if (i2 > i) {
            int i3 = this.j;
            if (i2 < i3) {
                Object[] objArr = this.h;
                P6.b0(objArr, objArr, i, i2, i3);
            }
            int i4 = this.j;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.h[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.j = i5;
        }
    }

    public final void p(Comparator comparator) {
        Arrays.sort(this.h, 0, this.j, comparator);
    }
}
