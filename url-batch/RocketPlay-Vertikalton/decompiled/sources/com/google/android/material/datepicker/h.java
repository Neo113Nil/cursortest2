package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g0.AbstractC0136F;

/* loaded from: classes.dex */
public final class h extends AbstractC0136F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f2257a;

    public h(k kVar) {
        this.f2257a = kVar;
        w.c(null);
        w.c(null);
    }

    @Override // g0.AbstractC0136F
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f2257a.getClass();
            throw null;
        }
    }
}
