package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import g0.AbstractC0139I;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f2254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f2255c;

    public /* synthetic */ f(k kVar, s sVar, int i) {
        this.f2253a = i;
        this.f2255c = kVar;
        this.f2254b = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2253a) {
            case 0:
                k kVar = this.f2255c;
                int M02 = ((LinearLayoutManager) kVar.f2269a0.getLayoutManager()).M0() - 1;
                if (M02 >= 0) {
                    Calendar a2 = w.a(this.f2254b.d.f2241a.f2300a);
                    a2.add(2, M02);
                    kVar.G(new o(a2));
                    break;
                }
                break;
            default:
                k kVar2 = this.f2255c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar2.f2269a0.getLayoutManager();
                View O02 = linearLayoutManager.O0(0, linearLayoutManager.v(), false);
                int H2 = (O02 == null ? -1 : AbstractC0139I.H(O02)) + 1;
                if (H2 < kVar2.f2269a0.getAdapter().a()) {
                    Calendar a3 = w.a(this.f2254b.d.f2241a.f2300a);
                    a3.add(2, H2);
                    kVar2.G(new o(a3));
                    break;
                }
                break;
        }
    }
}
