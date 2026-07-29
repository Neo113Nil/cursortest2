package o;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class LO extends AbstractC1281j9 {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f63o;
    public final int i;
    public final AbstractC1281j9 j;
    public final AbstractC1281j9 k;
    public final int l;
    public final int m;
    public int n = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        f63o = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f63o;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public LO(AbstractC1281j9 abstractC1281j9, AbstractC1281j9 abstractC1281j92) {
        this.j = abstractC1281j9;
        this.k = abstractC1281j92;
        int size = abstractC1281j9.size();
        this.l = size;
        this.i = abstractC1281j92.size() + size;
        this.m = Math.max(abstractC1281j9.n(), abstractC1281j92.n()) + 1;
    }

    public final boolean equals(Object obj) {
        int t;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1281j9) {
            AbstractC1281j9 abstractC1281j9 = (AbstractC1281j9) obj;
            int size = abstractC1281j9.size();
            int i = this.i;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.n == 0 || (t = abstractC1281j9.t()) == 0 || this.n == t) {
                    JO jo = new JO(this);
                    C2271yA next = jo.next();
                    JO jo2 = new JO(abstractC1281j9);
                    C2271yA next2 = jo2.next();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = next.i.length - i2;
                        int length2 = next2.i.length - i3;
                        int min = Math.min(length, length2);
                        if (!(i2 == 0 ? next.x(next2, i3, min) : next2.x(next, i2, min))) {
                            break;
                        }
                        i4 += min;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (min == length) {
                            next = jo.next();
                            i2 = 0;
                        } else {
                            i2 += min;
                        }
                        if (min == length2) {
                            next2 = jo2.next();
                            i3 = 0;
                        } else {
                            i3 += min;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.n;
        if (i == 0) {
            int i2 = this.i;
            i = r(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.n = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new KO(this);
    }

    @Override // o.AbstractC1281j9
    public final void m(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        AbstractC1281j9 abstractC1281j9 = this.j;
        int i5 = this.l;
        if (i4 <= i5) {
            abstractC1281j9.m(i, i2, i3, bArr);
            return;
        }
        AbstractC1281j9 abstractC1281j92 = this.k;
        if (i >= i5) {
            abstractC1281j92.m(i - i5, i2, i3, bArr);
            return;
        }
        int i6 = i5 - i;
        abstractC1281j9.m(i, i2, i6, bArr);
        abstractC1281j92.m(0, i2 + i6, i3 - i6, bArr);
    }

    @Override // o.AbstractC1281j9
    public final int n() {
        return this.m;
    }

    @Override // o.AbstractC1281j9
    public final boolean o() {
        return this.i >= f63o[this.m];
    }

    @Override // o.AbstractC1281j9
    public final boolean p() {
        int s = this.j.s(0, 0, this.l);
        AbstractC1281j9 abstractC1281j9 = this.k;
        return abstractC1281j9.s(s, 0, abstractC1281j9.size()) == 0;
    }

    @Override // o.AbstractC1281j9
    public final int r(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC1281j9 abstractC1281j9 = this.j;
        int i5 = this.l;
        if (i4 <= i5) {
            return abstractC1281j9.r(i, i2, i3);
        }
        AbstractC1281j9 abstractC1281j92 = this.k;
        if (i2 >= i5) {
            return abstractC1281j92.r(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC1281j92.r(abstractC1281j9.r(i, i2, i6), 0, i3 - i6);
    }

    @Override // o.AbstractC1281j9
    public final int s(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC1281j9 abstractC1281j9 = this.j;
        int i5 = this.l;
        if (i4 <= i5) {
            return abstractC1281j9.s(i, i2, i3);
        }
        AbstractC1281j9 abstractC1281j92 = this.k;
        if (i2 >= i5) {
            return abstractC1281j92.s(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC1281j92.s(abstractC1281j9.s(i, i2, i6), 0, i3 - i6);
    }

    @Override // o.AbstractC1281j9
    public final int size() {
        return this.i;
    }

    @Override // o.AbstractC1281j9
    public final int t() {
        return this.n;
    }

    @Override // o.AbstractC1281j9
    public final String u() {
        byte[] bArr;
        int i = this.i;
        if (i == 0) {
            bArr = AbstractC1986tt.a;
        } else {
            byte[] bArr2 = new byte[i];
            m(0, 0, i, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // o.AbstractC1281j9
    public final void w(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        AbstractC1281j9 abstractC1281j9 = this.j;
        int i4 = this.l;
        if (i3 <= i4) {
            abstractC1281j9.w(outputStream, i, i2);
            return;
        }
        AbstractC1281j9 abstractC1281j92 = this.k;
        if (i >= i4) {
            abstractC1281j92.w(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        abstractC1281j9.w(outputStream, i, i5);
        abstractC1281j92.w(outputStream, 0, i2 - i5);
    }
}
