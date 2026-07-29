package o;

import android.graphics.Rect;
import android.view.View;

/* renamed from: o.iV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1239iV implements InterfaceC1985ts {
    public final /* synthetic */ io.flutter.plugin.editing.b a;

    public /* synthetic */ C1239iV(io.flutter.plugin.editing.b bVar) {
        this.a = bVar;
    }

    public void a(int i, C1041fV c1041fV) {
        io.flutter.plugin.editing.b bVar = this.a;
        bVar.c();
        bVar.f = c1041fV;
        bVar.e = new C1682pE(2, i);
        bVar.h.e(bVar);
        C1334k c1334k = c1041fV.j;
        bVar.h = new C2073vA(c1334k != null ? (C1173hV) c1334k.k : null, bVar.a);
        bVar.d(c1041fV);
        bVar.i = true;
        if (bVar.e.a == 3) {
            bVar.p = false;
        }
        bVar.m = null;
        bVar.h.a(bVar);
    }

    public void b(double d, double d2, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d3 = dArr[12];
        double d4 = dArr[15];
        double d5 = d3 / d4;
        dArr2[1] = d5;
        dArr2[0] = d5;
        double d6 = dArr[13] / d4;
        dArr2[3] = d6;
        dArr2[2] = d6;
        C1711ph c1711ph = new C1711ph(z, dArr, dArr2);
        c1711ph.d(d, 0.0d);
        c1711ph.d(d, d2);
        c1711ph.d(0.0d, d2);
        io.flutter.plugin.editing.b bVar = this.a;
        double d7 = bVar.a.getContext().getResources().getDisplayMetrics().density;
        bVar.m = new Rect((int) (dArr2[0] * d7), (int) (dArr2[2] * d7), (int) Math.ceil(dArr2[1] * d7), (int) Math.ceil(dArr2[3] * d7));
    }

    public void c(C1173hV c1173hV) {
        C1173hV c1173hV2;
        int i;
        int i2;
        io.flutter.plugin.editing.b bVar = this.a;
        View view = bVar.a;
        if (!bVar.i && (c1173hV2 = bVar.f9o) != null && (i = c1173hV2.d) >= 0 && (i2 = c1173hV2.e) > i) {
            int i3 = i2 - i;
            int i4 = c1173hV.e;
            int i5 = c1173hV.d;
            boolean z = true;
            if (i3 == i4 - i5) {
                int i6 = 0;
                while (true) {
                    if (i6 >= i3) {
                        z = false;
                        break;
                    } else if (c1173hV2.a.charAt(i6 + i) != c1173hV.a.charAt(i6 + i5)) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            bVar.i = z;
        }
        bVar.f9o = c1173hV;
        bVar.h.f(c1173hV);
        if (bVar.i) {
            bVar.b.restartInput(view);
            bVar.i = false;
        }
    }
}
