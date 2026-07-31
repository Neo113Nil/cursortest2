package yads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class y32 implements x00 {
    public final o2 a;
    public final ix0 b;

    public y32(o2 o2Var, ix0 ix0Var) {
        this.a = o2Var;
        this.b = ix0Var;
    }

    @Override // yads.x00
    public final void a(y4 y4Var) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("impression_data_key", y4Var);
        this.a.a(16, bundle);
    }

    @Override // yads.x00
    public final void onAdClicked() {
    }

    @Override // yads.x00
    public final void onLeftApplication() {
        this.a.a(17, null);
    }

    @Override // yads.x00
    public final void onReturnedToApplication() {
        this.a.a(18, null);
    }

    @Override // yads.x00
    public final void a() {
        bu2 bu2Var = this.b.a;
        if (bu2Var == null || bu2Var.t) {
            return;
        }
        this.a.a.finish();
    }
}
