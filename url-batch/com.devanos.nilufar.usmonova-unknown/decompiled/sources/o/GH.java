package o;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class GH {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final C2340zD e;
    public final BU f;

    public GH(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            AbstractC1052fg.S("Invalid start index");
            throw null;
        }
        this.d = new ArrayList();
        C2340zD c2340zD = new C2340zD();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C0156Fx c0156Fx = (C0156Fx) this.a.get(i3);
            int i4 = c0156Fx.c;
            int i5 = c0156Fx.d;
            c2340zD.h(i4, new C0866cr(i3, i2, i5));
            i2 += i5;
        }
        this.e = c2340zD;
        this.f = EB.D(new LE(1, this));
    }

    public final boolean a(int i, int i2) {
        int i3;
        C2340zD c2340zD = this.e;
        C0866cr c0866cr = (C0866cr) c2340zD.e(i);
        if (c0866cr == null) {
            return false;
        }
        int i4 = c0866cr.b;
        int i5 = i2 - c0866cr.c;
        c0866cr.c = i2;
        if (i5 == 0) {
            return true;
        }
        Object[] objArr = c2340zD.c;
        long[] jArr = c2340zD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        C0866cr c0866cr2 = (C0866cr) objArr[(i6 << 3) + i8];
                        if (c0866cr2.b >= i4 && !c0866cr2.equals(c0866cr) && (i3 = c0866cr2.b + i5) >= 0) {
                            c0866cr2.b = i3;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }
}
