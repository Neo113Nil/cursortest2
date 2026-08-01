package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class q implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f2310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f2311b;

    public q(s sVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f2311b = sVar;
        this.f2310a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        MaterialCalendarGridView materialCalendarGridView = this.f2310a;
        p a2 = materialCalendarGridView.a();
        if (i < a2.a() || i > a2.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((k) this.f2311b.f2314e.f38b).f2264V.f2243c.f2249a) {
            throw null;
        }
    }
}
