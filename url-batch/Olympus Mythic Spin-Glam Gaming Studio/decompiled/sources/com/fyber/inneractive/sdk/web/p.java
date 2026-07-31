package com.fyber.inneractive.sdk.web;

import android.view.ViewTreeObserver;

/* loaded from: classes6.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ i0 a;

    public p(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m mVar = this.a.b;
        if (mVar == null) {
            return false;
        }
        mVar.getViewTreeObserver().removeOnPreDrawListener(this);
        i0 i0Var = this.a;
        i0Var.a(i0Var.b.getContext(), true);
        return false;
    }
}
