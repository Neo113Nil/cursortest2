package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class cq implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ jq f;

    public cq(jq jqVar) {
        this.f = jqVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        bg bgVar;
        if (i == -1 || (bgVar = this.f.h) == null) {
            return;
        }
        bgVar.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
