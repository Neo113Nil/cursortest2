package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import defpackage.rt;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView f;
    public final /* synthetic */ e g;

    public c(e eVar, MaterialCalendarGridView materialCalendarGridView) {
        this.g = eVar;
        this.f = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f;
        rt b = materialCalendarGridView.b();
        if (i < b.c() || i > b.f()) {
            return;
        }
        if (materialCalendarGridView.b().getItem(i).longValue() >= this.g.e.a.a0.h.f) {
            throw null;
        }
    }
}
