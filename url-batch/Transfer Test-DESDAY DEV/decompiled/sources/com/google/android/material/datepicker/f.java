package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import g0.I;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1886b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f1887c;

    public /* synthetic */ f(k kVar, s sVar, int i) {
        this.f1885a = i;
        this.f1887c = kVar;
        this.f1886b = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1885a) {
            case 0:
                k kVar = this.f1887c;
                int M02 = ((LinearLayoutManager) kVar.f1901a0.getLayoutManager()).M0() - 1;
                if (M02 >= 0) {
                    Calendar a2 = w.a(this.f1886b.d.f1873a.f1933a);
                    a2.add(2, M02);
                    kVar.G(new o(a2));
                    break;
                }
                break;
            default:
                k kVar2 = this.f1887c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar2.f1901a0.getLayoutManager();
                View O02 = linearLayoutManager.O0(0, linearLayoutManager.v(), false);
                int H2 = (O02 == null ? -1 : I.H(O02)) + 1;
                if (H2 < kVar2.f1901a0.getAdapter().a()) {
                    Calendar a3 = w.a(this.f1886b.d.f1873a.f1933a);
                    a3.add(2, H2);
                    kVar2.G(new o(a3));
                    break;
                }
                break;
        }
    }
}
