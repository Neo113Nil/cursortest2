package l;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: l.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263z0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f3112a;

    public C0263z0(G0 g02) {
        this.f3112a = g02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        C0251t0 c0251t0;
        if (i == -1 || (c0251t0 = this.f3112a.f2868c) == null) {
            return;
        }
        c0251t0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
