package l;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: l.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290z0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f3545a;

    public C0290z0(G0 g02) {
        this.f3545a = g02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        C0278t0 c0278t0;
        if (i == -1 || (c0278t0 = this.f3545a.f3301c) == null) {
            return;
        }
        c0278t0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
