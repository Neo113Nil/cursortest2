package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.view.ViewTreeObserver;

/* loaded from: classes8.dex */
public final class k0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ n0 b;

    public k0(n0 n0Var, Context context) {
        this.b = n0Var;
        this.a = context;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.b.b(this.a);
        return true;
    }
}
