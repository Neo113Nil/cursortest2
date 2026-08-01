package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class df0 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final p60 e;
    public final lu0 f;

    public df0(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            gh0.a("Invalid start index");
        }
        this.d = new ArrayList();
        p60 p60Var = new p60();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            r00 r00Var = (r00) this.a.get(i3);
            int i4 = r00Var.c;
            int i5 = r00Var.d;
            p60Var.h(i4, new xv(i3, i2, i5));
            i2 += i5;
        }
        this.e = p60Var;
        this.f = new lu0(new cf0(this));
    }

    public final boolean a(int i, int i2) {
        xv xvVar;
        int i3;
        int i4;
        p60 p60Var = this.e;
        xv xvVar2 = (xv) p60Var.b(i);
        if (xvVar2 == null) {
            return false;
        }
        int i5 = xvVar2.b;
        int i6 = i2 - xvVar2.c;
        xvVar2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = p60Var.c;
        long[] jArr = p60Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (xvVar = (xv) objArr[(i7 << 3) + i9]).b) >= i5 && xvVar != xvVar2 && (i4 = i3 + i6) >= 0) {
                        xvVar.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
