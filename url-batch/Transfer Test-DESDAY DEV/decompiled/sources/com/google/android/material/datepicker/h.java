package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g0.F;

/* loaded from: classes.dex */
public final class h extends F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1889a;

    public h(k kVar) {
        this.f1889a = kVar;
        w.c(null);
        w.c(null);
    }

    @Override // g0.F
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f1889a.getClass();
            throw null;
        }
    }
}
