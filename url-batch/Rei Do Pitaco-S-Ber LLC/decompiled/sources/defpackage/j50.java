package defpackage;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class j50 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Toolbar g;

    public /* synthetic */ j50(Toolbar toolbar, int i) {
        this.f = i;
        this.g = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Toolbar toolbar = this.g;
        switch (i) {
            case 0:
                m50 m50Var = toolbar.Q;
                vs vsVar = m50Var == null ? null : m50Var.g;
                if (vsVar != null) {
                    vsVar.collapseActionView();
                    break;
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
