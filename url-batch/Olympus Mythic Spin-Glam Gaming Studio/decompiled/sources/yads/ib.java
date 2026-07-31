package yads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class ib implements l0 {
    public final yb a;
    public final gi0 b;
    public final u9 c;
    public final hv d;
    public final zb e;

    public ib(yb ybVar, gi0 gi0Var, u9 u9Var, hv hvVar, zb zbVar) {
        this.a = ybVar;
        this.b = gi0Var;
        this.c = u9Var;
        this.d = hvVar;
        this.e = zbVar;
    }

    @Override // yads.l0
    public final Object a(View view, j0 j0Var, r0 r0Var) {
        ym ymVar = (ym) j0Var;
        Iterator it = ymVar.b().iterator();
        while (it.hasNext()) {
            u9.a(this.c, (String) it.next(), a93.b, null, 12);
        }
        if (ymVar instanceof hb) {
            this.a.a(view, (hb) ymVar, this.e);
        } else if (ymVar instanceof ci0) {
            gi0 gi0Var = this.b;
            Context context = view.getContext();
            ci0 ci0Var = (ci0) ymVar;
            zb zbVar = this.e;
            if (!gi0.d) {
                gi0Var.a(gi0Var.b.a(context, ci0Var), zbVar);
            }
        }
        hv hvVar = this.d;
        hvVar.d.a(hvVar.a(fo2.i, new HashMap()));
        return new oz0(false);
    }
}
