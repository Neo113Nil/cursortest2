package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class zr extends qy {
    public final /* synthetic */ e a;
    public final /* synthetic */ as b;

    public zr(as asVar, e eVar) {
        this.b = asVar;
        this.a = eVar;
    }

    @Override // defpackage.qy
    public final void a(RecyclerView recyclerView, int i) {
        as asVar;
        aw awVar;
        RecyclerView recyclerView2;
        if (i != 0 || (awVar = (asVar = this.b).m0) == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) asVar.f0.getLayoutManager();
        View c = linearLayoutManager.e() ? aw.c(linearLayoutManager, awVar.e(linearLayoutManager)) : linearLayoutManager.d() ? aw.c(linearLayoutManager, awVar.d(linearLayoutManager)) : null;
        if (c != null) {
            dz M = RecyclerView.M(c);
            int J = (M == null || (recyclerView2 = M.r) == null) ? -1 : recyclerView2.J(M);
            if (J != -1) {
                e eVar = this.a;
                asVar.b0 = eVar.e(J);
                asVar.k0.setText(eVar.e(J).c());
                asVar.M(J);
            }
        }
        asVar.L();
    }

    @Override // defpackage.qy
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int N0;
        as asVar = this.b;
        RecyclerView recyclerView2 = asVar.f0;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
            View P0 = linearLayoutManager.P0(0, linearLayoutManager.v(), false);
            N0 = P0 == null ? -1 : ny.G(P0);
        } else {
            N0 = ((LinearLayoutManager) recyclerView2.getLayoutManager()).N0();
        }
        aw awVar = asVar.m0;
        e eVar = this.a;
        if (awVar == null) {
            asVar.b0 = eVar.e(N0);
        }
        asVar.k0.setText(eVar.e(N0).c());
        asVar.M(N0);
    }
}
