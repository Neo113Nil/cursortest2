package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class qp {
    public xg a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public qp() {
        c();
    }

    public final void a() {
        boolean z = this.d;
        xg xgVar = this.a;
        this.c = z ? xgVar.g() : xgVar.k();
    }

    public final void b(View view, int i) {
        xg xgVar = this.a;
        int l = Integer.MIN_VALUE == xgVar.a ? 0 : xgVar.l() - xgVar.a;
        if (l >= 0) {
            boolean z = this.d;
            xg xgVar2 = this.a;
            if (z) {
                int b = xgVar2.b(view);
                xg xgVar3 = this.a;
                this.c = (Integer.MIN_VALUE != xgVar3.a ? xgVar3.l() - xgVar3.a : 0) + b;
            } else {
                this.c = xgVar2.e(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        xg xgVar4 = this.a;
        if (!z2) {
            int e = xgVar4.e(view);
            int k = e - this.a.k();
            this.c = e;
            if (k > 0) {
                int g = (this.a.g() - Math.min(0, (this.a.g() - l) - this.a.b(view))) - (this.a.c(view) + e);
                if (g < 0) {
                    this.c -= Math.min(k, -g);
                    return;
                }
                return;
            }
            return;
        }
        int g2 = (xgVar4.g() - l) - this.a.b(view);
        this.c = this.a.g() - g2;
        if (g2 > 0) {
            int c = this.c - this.a.c(view);
            int k2 = this.a.k();
            int min = c - (Math.min(this.a.e(view) - k2, 0) + k2);
            if (min < 0) {
                this.c = Math.min(g2, -min) + this.c;
            }
        }
    }

    public final void c() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
