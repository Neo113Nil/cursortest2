package o;

import java.util.ArrayList;

/* renamed from: o.yG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2277yG extends JG {
    public static final C2277yG c = new C2277yG(1, 0, 2);

    @Override // o.JG
    public final void a(C0575Wb c0575Wb, C0950e6 c0950e6, C0972eS c0972eS, C1970td c1970td) {
        C1471m2 c1471m2;
        int c2;
        int b = c0575Wb.b(0);
        Throwable th = null;
        if (c0972eS.n != 0) {
            EB.h("Cannot move a group while inserting");
            throw null;
        }
        if (b < 0) {
            EB.h("Parameter offset is out of bounds");
            throw null;
        }
        if (b == 0) {
            return;
        }
        int i = c0972eS.t;
        int i2 = c0972eS.v;
        int i3 = c0972eS.u;
        int i4 = i;
        while (b > 0) {
            i4 += c0972eS.b[(c0972eS.p(i4) * 5) + 3];
            if (i4 > i3) {
                EB.h("Parameter offset is out of bounds");
                throw null;
            }
            b--;
        }
        int i5 = c0972eS.b[(c0972eS.p(i4) * 5) + 3];
        int f = c0972eS.f(c0972eS.b, c0972eS.p(c0972eS.t));
        int f2 = c0972eS.f(c0972eS.b, c0972eS.p(i4));
        int i6 = i4 + i5;
        int f3 = c0972eS.f(c0972eS.b, c0972eS.p(i6));
        int i7 = f3 - f2;
        c0972eS.s(i7, Math.max(c0972eS.t - 1, 0));
        c0972eS.r(i5);
        int[] iArr = c0972eS.b;
        int p = c0972eS.p(i6) * 5;
        P6.a0(c0972eS.p(i) * 5, p, (i5 * 5) + p, iArr, iArr);
        if (i7 > 0) {
            Object[] objArr = c0972eS.c;
            P6.b0(objArr, objArr, f, c0972eS.g(f2 + i7), c0972eS.g(f3 + i7));
        }
        int i8 = f2 + i7;
        int i9 = i8 - f;
        int i10 = c0972eS.k;
        int i11 = c0972eS.l;
        int length = c0972eS.c.length;
        int i12 = c0972eS.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            Throwable th2 = th;
            int p2 = c0972eS.p(i14);
            int i15 = i14;
            int i16 = i9;
            iArr[(p2 * 5) + 4] = C0972eS.h(C0972eS.h(c0972eS.f(iArr, p2) - i9, i12 < p2 ? 0 : i10, i11, length), c0972eS.k, c0972eS.l, c0972eS.c.length);
            i14 = i15 + 1;
            th = th2;
            i9 = i16;
            i10 = i10;
        }
        Throwable th3 = th;
        int i17 = i6 + i5;
        int n = c0972eS.n();
        int g = TM.g(c0972eS.d, i6, n);
        ArrayList arrayList = new ArrayList();
        if (g >= 0) {
            while (g < c0972eS.d.size() && (c2 = c0972eS.c((c1471m2 = (C1471m2) c0972eS.d.get(g)))) >= i6 && c2 < i17) {
                arrayList.add(c1471m2);
                c0972eS.d.remove(g);
            }
        }
        int i18 = i - i6;
        int size = arrayList.size();
        for (int i19 = 0; i19 < size; i19++) {
            C1471m2 c1471m22 = (C1471m2) arrayList.get(i19);
            int c3 = c0972eS.c(c1471m22) + i18;
            if (c3 >= c0972eS.g) {
                c1471m22.a = -(n - c3);
            } else {
                c1471m22.a = c3;
            }
            c0972eS.d.add(TM.g(c0972eS.d, c3, n), c1471m22);
        }
        if (c0972eS.A(i6, i5)) {
            EB.h("Unexpectedly removed anchors");
            throw th3;
        }
        c0972eS.l(i2, c0972eS.u, i);
        if (i7 > 0) {
            c0972eS.B(i8, i7, i6 - 1);
        }
    }

    @Override // o.JG
    public final String b(int i) {
        return i == 0 ? "offset" : super.b(i);
    }
}
