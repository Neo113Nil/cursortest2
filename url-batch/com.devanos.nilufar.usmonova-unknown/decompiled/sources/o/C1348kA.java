package o;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: o.kA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1348kA implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ AbstractC1809rA h;

    public C1348kA(AbstractC1809rA abstractC1809rA) {
        this.h = abstractC1809rA;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C1713pj c1713pj;
        if (i == -1 || (c1713pj = this.h.j) == null) {
            return;
        }
        c1713pj.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
