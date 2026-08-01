package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class fs implements hv {
    public final /* synthetic */ int f;
    public final /* synthetic */ View g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public fs(View view, int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = view;
        this.h = i2;
        this.i = i3;
        this.j = i4;
    }

    @Override // defpackage.hv
    public final db0 k(View view, db0 db0Var) {
        io h = db0Var.a.h(519);
        View view2 = this.g;
        int i = this.f;
        if (i >= 0) {
            view2.getLayoutParams().height = i + h.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.h + h.a, this.i + h.b, this.j + h.c, view2.getPaddingBottom());
        return db0Var;
    }
}
