package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: o.rr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1852rr implements Iterable, InterfaceC1594nw {
    public final String[] h;

    public C1852rr(String[] strArr) {
        this.h = strArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1852rr) {
            return Arrays.equals(this.h, ((C1852rr) obj).h);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C1619oH[] c1619oHArr = new C1619oH[size];
        for (int i = 0; i < size; i++) {
            c1619oHArr[i] = new C1619oH(k(i), m(i));
        }
        return AbstractC1305jX.z(c1619oHArr);
    }

    public final String j(String str) {
        AbstractC0048Bt.n(str, "name");
        String[] strArr = this.h;
        int length = strArr.length - 2;
        int I = AbstractC0048Bt.I(length, 0, -2);
        if (I > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == I) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String k(int i) {
        return this.h[i * 2];
    }

    public final C1787qr l() {
        C1787qr c1787qr = new C1787qr();
        ArrayList arrayList = c1787qr.a;
        AbstractC0048Bt.n(arrayList, "<this>");
        String[] strArr = this.h;
        AbstractC0048Bt.n(strArr, "elements");
        arrayList.addAll(P6.W(strArr));
        return c1787qr;
    }

    public final String m(int i) {
        return this.h[(i * 2) + 1];
    }

    public final int size() {
        return this.h.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String k = k(i);
            String m = m(i);
            sb.append(k);
            sb.append(": ");
            if (HY.o(k)) {
                m = "██";
            }
            sb.append(m);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
