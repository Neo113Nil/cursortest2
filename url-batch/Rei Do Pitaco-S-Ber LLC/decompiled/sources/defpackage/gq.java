package defpackage;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class gq extends DataSetObserver {
    public final /* synthetic */ jq a;

    public gq(jq jqVar) {
        this.a = jqVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        jq jqVar = this.a;
        if (jqVar.E.isShowing()) {
            jqVar.d();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
