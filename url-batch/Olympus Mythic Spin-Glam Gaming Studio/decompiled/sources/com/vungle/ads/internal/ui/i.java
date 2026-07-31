package com.vungle.ads.internal.ui;

import android.view.MotionEvent;

/* loaded from: classes15.dex */
public final class i implements com.vungle.ads.internal.ui.view.h {
    public final /* synthetic */ l a;

    public i(l lVar) {
        this.a = lVar;
    }

    @Override // com.vungle.ads.internal.ui.view.h
    public final boolean onTouch(MotionEvent motionEvent) {
        com.vungle.ads.internal.presenter.r rVar = this.a.a;
        if (rVar == null) {
            return false;
        }
        rVar.a(motionEvent);
        return false;
    }
}
