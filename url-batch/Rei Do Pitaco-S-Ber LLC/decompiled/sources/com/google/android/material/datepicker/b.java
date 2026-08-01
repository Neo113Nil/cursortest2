package com.google.android.material.datepicker;

import defpackage.rt;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ MaterialCalendarGridView f;
    public final /* synthetic */ int g;

    public /* synthetic */ b(e eVar, MaterialCalendarGridView materialCalendarGridView, int i) {
        this.f = materialCalendarGridView;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int a;
        MaterialCalendarGridView materialCalendarGridView = this.f;
        if (!materialCalendarGridView.hasFocus() || (i = this.g) == 0) {
            return;
        }
        rt b = materialCalendarGridView.b();
        if (i == 1) {
            a = b.b(b.f() + 1);
            if (a == -1) {
                a = b.f();
            }
        } else {
            a = b.a(b.c() - 1);
            if (a == -1) {
                a = b.c();
            }
        }
        materialCalendarGridView.setSelection(a);
    }
}
