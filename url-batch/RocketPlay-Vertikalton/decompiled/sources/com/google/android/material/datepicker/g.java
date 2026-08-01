package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g0.V;

/* loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f2256E;
    public final /* synthetic */ k F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, int i, int i2) {
        super(i);
        this.F = kVar;
        this.f2256E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(V v2, int[] iArr) {
        int i = this.f2256E;
        k kVar = this.F;
        if (i == 0) {
            iArr[0] = kVar.f2269a0.getWidth();
            iArr[1] = kVar.f2269a0.getWidth();
        } else {
            iArr[0] = kVar.f2269a0.getHeight();
            iArr[1] = kVar.f2269a0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.AbstractC0139I
    public final void z0(RecyclerView recyclerView, int i) {
        u uVar = new u(recyclerView.getContext());
        uVar.f2991a = i;
        A0(uVar);
    }
}
