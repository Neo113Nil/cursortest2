package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class wr extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ as F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr(as asVar, int i, int i2) {
        super(i);
        this.F = asVar;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ny
    public final void A0(RecyclerView recyclerView, int i) {
        c9 c9Var = new c9(recyclerView.getContext());
        c9Var.a = i;
        B0(c9Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(zy zyVar, int[] iArr) {
        as asVar = this.F;
        RecyclerView recyclerView = asVar.f0;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = asVar.f0.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = asVar.f0.getHeight();
        }
    }
}
