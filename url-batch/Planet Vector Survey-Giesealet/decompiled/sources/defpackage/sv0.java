package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class sv0 {
    public final rv0 a;
    public final j60 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public sv0(rv0 rv0Var, j60 j60Var, long j) {
        this.a = rv0Var;
        this.b = j60Var;
        this.c = j;
        ArrayList arrayList = (ArrayList) j60Var.e;
        float f = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((rd0) arrayList.get(0)).a.d.c(0);
        if (!arrayList.isEmpty()) {
            rd0 rd0Var = (rd0) zd.h0(arrayList);
            f = rd0Var.a.d.c(r4.f - 1) + rd0Var.f;
        }
        this.e = f;
        this.f = (ArrayList) j60Var.d;
    }

    public final int a(int i) {
        j60 j60Var = this.b;
        ArrayList arrayList = (ArrayList) j60Var.e;
        rd0 rd0Var = (rd0) arrayList.get(i >= ((l7) ((k2) j60Var.c).d).e.length() ? px0.B(arrayList) : i < 0 ? 0 : nk.r(arrayList, i));
        return rd0Var.a.d.e.getLineForOffset(rd0Var.a(i)) + rd0Var.d;
    }

    public final int b(float f) {
        ArrayList arrayList = (ArrayList) this.b.e;
        int i = 0;
        if (f > 0.0f) {
            if (f < ((rd0) zd.h0(arrayList)).g) {
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (true) {
                    if (i2 > size) {
                        i = -(i2 + 1);
                        break;
                    }
                    int i3 = (i2 + size) >>> 1;
                    rd0 rd0Var = (rd0) arrayList.get(i3);
                    char c = rd0Var.f > f ? (char) 1 : rd0Var.g <= f ? (char) 65535 : (char) 0;
                    if (c >= 0) {
                        if (c <= 0) {
                            i = i3;
                            break;
                        }
                        size = i3 - 1;
                    } else {
                        i2 = i3 + 1;
                    }
                }
            } else {
                i = arrayList.size() - 1;
            }
        }
        rd0 rd0Var2 = (rd0) arrayList.get(i);
        int i4 = rd0Var2.c;
        int i5 = rd0Var2.d;
        if (i4 - rd0Var2.b == 0) {
            return i5;
        }
        a5 a5Var = rd0Var2.a;
        float f2 = f - rd0Var2.f;
        qv0 qv0Var = a5Var.d;
        return qv0Var.e.getLineForVertical(((int) f2) - qv0Var.g) + i5;
    }

    public final int c(int i) {
        j60 j60Var = this.b;
        j60Var.b(i);
        ArrayList arrayList = (ArrayList) j60Var.e;
        rd0 rd0Var = (rd0) arrayList.get(nk.s(arrayList, i));
        a5 a5Var = rd0Var.a;
        return a5Var.d.e.getLineStart(i - rd0Var.d) + rd0Var.b;
    }

    public final float d(int i) {
        j60 j60Var = this.b;
        j60Var.b(i);
        ArrayList arrayList = (ArrayList) j60Var.e;
        rd0 rd0Var = (rd0) arrayList.get(nk.s(arrayList, i));
        a5 a5Var = rd0Var.a;
        return a5Var.d.f(i - rd0Var.d) + rd0Var.f;
    }

    public final qk0 e(int i) {
        j60 j60Var = this.b;
        l7 l7Var = (l7) ((k2) j60Var.c).d;
        if (i < 0 || i > l7Var.e.length()) {
            dy.a("offset(" + i + ") is out of bounds [0, " + l7Var.e.length() + ']');
        }
        int length = ((l7) ((k2) j60Var.c).d).e.length();
        ArrayList arrayList = (ArrayList) j60Var.e;
        rd0 rd0Var = (rd0) arrayList.get(i == length ? px0.B(arrayList) : nk.r(arrayList, i));
        a5 a5Var = rd0Var.a;
        int a = rd0Var.a(i);
        qv0 qv0Var = a5Var.d;
        return qv0Var.e.getParagraphDirection(qv0Var.e.getLineForOffset(a)) == 1 ? qk0.d : qk0.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sv0) {
            sv0 sv0Var = (sv0) obj;
            if (nz.l(this.a, sv0Var.a) && this.b == sv0Var.b && iz.a(this.c, sv0Var.c) && this.d == sv0Var.d && this.e == sv0Var.e && nz.l(this.f, sv0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        long j = this.c;
        return this.f.hashCode() + y6.t(this.e, y6.t(this.d, (((int) (j ^ (j >>> 32))) + hashCode) * 31, 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) iz.b(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
