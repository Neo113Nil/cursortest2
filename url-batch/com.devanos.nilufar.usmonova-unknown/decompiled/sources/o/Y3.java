package o;

import java.util.List;

/* loaded from: classes.dex */
public final class Y3 implements CharSequence {
    public final String h;
    public final List i;
    public final List j;
    public final List k;

    static {
        C1818rJ c1818rJ = TP.a;
    }

    public Y3(String str, List list, List list2, List list3) {
        this.h = str;
        this.i = list;
        this.j = list2;
        this.k = list3;
        if (list2 != null) {
            List G0 = AbstractC0720ac.G0(list2, new C0685a3(6));
            int size = G0.size();
            int i = -1;
            int i2 = 0;
            while (i2 < size) {
                X3 x3 = (X3) G0.get(i2);
                int i3 = x3.b;
                int i4 = x3.c;
                if (i3 < i) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                }
                if (i4 > this.h.length()) {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + x3.b + ", " + i4 + ") is out of boundary").toString());
                }
                i2++;
                i = i4;
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.h.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y3)) {
            return false;
        }
        Y3 y3 = (Y3) obj;
        return AbstractC0048Bt.h(this.h, y3.h) && AbstractC0048Bt.h(this.i, y3.i) && AbstractC0048Bt.h(this.j, y3.j) && AbstractC0048Bt.h(this.k, y3.k);
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode() * 31;
        List list = this.i;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.j;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.k;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.h.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
        }
        String str = this.h;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new Y3(substring, Z3.a(this.i, i, i2), Z3.a(this.j, i, i2), Z3.a(this.k, i, i2));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.h;
    }
}
