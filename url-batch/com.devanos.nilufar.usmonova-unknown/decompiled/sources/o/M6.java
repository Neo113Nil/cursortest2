package o;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class M6 extends J6 {
    public Object[] h;
    public int i;

    @Override // o.J6
    public final Object get(int i) {
        Object[] objArr = this.h;
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    @Override // o.J6, java.lang.Iterable
    public final Iterator iterator() {
        return new L6(this);
    }

    @Override // o.J6
    public final int j() {
        return this.i;
    }

    @Override // o.J6
    public final void k(int i, C1869s4 c1869s4) {
        Object[] objArr = this.h;
        if (objArr.length <= i) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.h = copyOf;
        }
        Object[] objArr2 = this.h;
        if (objArr2[i] == null) {
            this.i++;
        }
        objArr2[i] = c1869s4;
    }
}
