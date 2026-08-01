package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class aw extends py {
    public RecyclerView a;
    public final j20 b = new j20(this);
    public yv c;
    public yv d;

    public static int b(View view, xg xgVar) {
        return ((xgVar.c(view) / 2) + xgVar.e(view)) - ((xgVar.l() / 2) + xgVar.k());
    }

    public static View c(ny nyVar, xg xgVar) {
        int v = nyVar.v();
        View view = null;
        if (v == 0) {
            return null;
        }
        int l = (xgVar.l() / 2) + xgVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v; i2++) {
            View u = nyVar.u(i2);
            int abs = Math.abs(((xgVar.c(u) / 2) + xgVar.e(u)) - l);
            if (abs < i) {
                view = u;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(ny nyVar, View view) {
        int[] iArr = new int[2];
        if (nyVar.d()) {
            iArr[0] = b(view, d(nyVar));
        } else {
            iArr[0] = 0;
        }
        if (nyVar.e()) {
            iArr[1] = b(view, e(nyVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final xg d(ny nyVar) {
        yv yvVar = this.d;
        if (yvVar == null || ((ny) yvVar.b) != nyVar) {
            this.d = new yv(nyVar, 0);
        }
        return this.d;
    }

    public final xg e(ny nyVar) {
        yv yvVar = this.c;
        if (yvVar == null || ((ny) yvVar.b) != nyVar) {
            this.c = new yv(nyVar, 1);
        }
        return this.c;
    }

    public final void f() {
        ny layoutManager;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View c = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (c == null) {
            return;
        }
        int[] a = a(layoutManager, c);
        int i = a[0];
        if (i == 0 && a[1] == 0) {
            return;
        }
        this.a.i0(i, a[1], false);
    }
}
