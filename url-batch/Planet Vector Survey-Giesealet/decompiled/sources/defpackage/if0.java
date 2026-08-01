package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class if0 implements Iterator, j00 {
    public final lx0[] d;
    public int e;
    public boolean f = true;

    public if0(kx0 kx0Var, lx0[] lx0VarArr) {
        this.d = lx0VarArr;
        lx0VarArr[0].a(kx0Var.d, Integer.bitCount(kx0Var.a) * 2, 0);
        this.e = 0;
        a();
    }

    public final void a() {
        int i = this.e;
        lx0[] lx0VarArr = this.d;
        lx0 lx0Var = lx0VarArr[i];
        if (lx0Var.f < lx0Var.e) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                lx0 lx0Var2 = lx0VarArr[i];
                int i2 = lx0Var2.f;
                Object[] objArr = lx0Var2.d;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    lx0Var2.f = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.e = b;
                return;
            }
            if (i > 0) {
                lx0 lx0Var3 = lx0VarArr[i - 1];
                int i3 = lx0Var3.f;
                int length2 = lx0Var3.d.length;
                lx0Var3.f = i3 + 1;
            }
            lx0VarArr[i].a(kx0.e.d, 0, 0);
            i--;
        }
        this.f = false;
    }

    public final int b(int i) {
        lx0[] lx0VarArr = this.d;
        lx0 lx0Var = lx0VarArr[i];
        int i2 = lx0Var.f;
        if (i2 < lx0Var.e) {
            return i;
        }
        Object[] objArr = lx0Var.d;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        kx0 kx0Var = (kx0) obj;
        if (i == 6) {
            lx0 lx0Var2 = lx0VarArr[i + 1];
            Object[] objArr2 = kx0Var.d;
            lx0Var2.a(objArr2, objArr2.length, 0);
        } else {
            lx0VarArr[i + 1].a(kx0Var.d, Integer.bitCount(kx0Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f) {
            g8.k();
            return null;
        }
        Object next = this.d[this.e].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
