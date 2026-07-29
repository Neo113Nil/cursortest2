package o;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: o.j9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1281j9 implements Iterable {
    public static final C2271yA h = new C2271yA(new byte[0]);

    public static AbstractC1281j9 j(Iterator it, int i) {
        if (i == 1) {
            return (AbstractC1281j9) it.next();
        }
        int i2 = i >>> 1;
        return j(it, i2).k(j(it, i - i2));
    }

    public static C1217i9 q() {
        return new C1217i9();
    }

    public final AbstractC1281j9 k(AbstractC1281j9 abstractC1281j9) {
        int size = size();
        int size2 = abstractC1281j9.size();
        if (size + size2 >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = LO.f63o;
        LO lo = this instanceof LO ? (LO) this : null;
        if (abstractC1281j9.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return abstractC1281j9;
        }
        int size3 = abstractC1281j9.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = abstractC1281j9.size();
            byte[] bArr = new byte[size4 + size5];
            l(0, 0, size4, bArr);
            abstractC1281j9.l(0, size4, size5, bArr);
            return new C2271yA(bArr);
        }
        if (lo != null) {
            AbstractC1281j9 abstractC1281j92 = lo.k;
            if (abstractC1281j9.size() + abstractC1281j92.size() < 128) {
                int size6 = abstractC1281j92.size();
                int size7 = abstractC1281j9.size();
                byte[] bArr2 = new byte[size6 + size7];
                abstractC1281j92.l(0, 0, size6, bArr2);
                abstractC1281j9.l(0, size6, size7, bArr2);
                return new LO(lo.j, new C2271yA(bArr2));
            }
        }
        if (lo != null) {
            AbstractC1281j9 abstractC1281j93 = lo.k;
            AbstractC1281j9 abstractC1281j94 = lo.j;
            if (abstractC1281j94.n() > abstractC1281j93.n() && lo.m > abstractC1281j9.n()) {
                return new LO(abstractC1281j94, new LO(abstractC1281j93, abstractC1281j9));
            }
        }
        if (size3 >= LO.f63o[Math.max(n(), abstractC1281j9.n()) + 1]) {
            return new LO(this, abstractC1281j9);
        }
        C1818rJ c1818rJ = new C1818rJ(5);
        c1818rJ.c(this);
        c1818rJ.c(abstractC1281j9);
        Stack stack = (Stack) c1818rJ.i;
        AbstractC1281j9 abstractC1281j95 = (AbstractC1281j9) stack.pop();
        while (!stack.isEmpty()) {
            abstractC1281j95 = new LO((AbstractC1281j9) stack.pop(), abstractC1281j95);
        }
        return abstractC1281j95;
    }

    public final void l(int i, int i2, int i3, byte[] bArr) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i4 = i + i3;
        if (i4 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i4);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i5 = i2 + i3;
        if (i5 <= bArr.length) {
            if (i3 > 0) {
                m(i, i2, i3, bArr);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i5);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract void m(int i, int i2, int i3, byte[] bArr);

    public abstract int n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract int r(int i, int i2, int i3);

    public abstract int s(int i, int i2, int i3);

    public abstract int size();

    public abstract int t();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String u();

    public final String v() {
        try {
            return u();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public abstract void w(OutputStream outputStream, int i, int i2);
}
