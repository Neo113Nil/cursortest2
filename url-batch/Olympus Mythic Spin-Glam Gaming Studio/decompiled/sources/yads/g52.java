package yads;

import android.view.View;

/* loaded from: classes9.dex */
public final class g52 implements zj2 {
    public final /* synthetic */ h52 a;

    public g52(h52 h52Var) {
        this.a = h52Var;
    }

    @Override // yads.zj2
    public final void a() {
        View view = this.a.c;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // yads.zj2
    public final void a(long j, long j2) {
        h52 h52Var = this.a;
        View view = h52Var.c;
        if (view != null) {
            h52Var.a.a(view, j, j2);
        }
    }
}
