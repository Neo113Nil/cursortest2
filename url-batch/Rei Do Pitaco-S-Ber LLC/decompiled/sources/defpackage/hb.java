package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class hb implements jp {
    public final /* synthetic */ pv a;
    public final /* synthetic */ pb b;

    public /* synthetic */ hb(pv pvVar, pb pbVar) {
        this.a = pvVar;
        this.b = pbVar;
    }

    @Override // defpackage.jp
    public final void b(lp lpVar, fp fpVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (fpVar == fp.ON_CREATE) {
            onBackInvokedDispatcher = this.b.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            this.a.b(onBackInvokedDispatcher);
        }
    }
}
