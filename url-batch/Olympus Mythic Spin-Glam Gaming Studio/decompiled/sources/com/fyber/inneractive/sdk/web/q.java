package com.fyber.inneractive.sdk.web;

import android.view.KeyEvent;
import android.view.View;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes6.dex */
public final class q implements View.OnKeyListener {
    public final /* synthetic */ i0 a;

    public q(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 4 || !this.a.p()) {
            return false;
        }
        IAlog.e("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
        this.a.o();
        return true;
    }
}
