package defpackage;

import android.widget.AbsListView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class hq implements AbsListView.OnScrollListener {
    public final /* synthetic */ jq a;

    public hq(jq jqVar) {
        this.a = jqVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        jq jqVar = this.a;
        fq fqVar = jqVar.w;
        n4 n4Var = jqVar.E;
        if (i != 1 || n4Var.getInputMethodMode() == 2 || n4Var.getContentView() == null) {
            return;
        }
        jqVar.A.removeCallbacks(fqVar);
        fqVar.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
