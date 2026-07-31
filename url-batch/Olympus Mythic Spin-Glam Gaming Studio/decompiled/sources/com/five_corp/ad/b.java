package com.five_corp.ad;

import android.view.View;
import android.view.Window;

/* loaded from: classes5.dex */
public final class b implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ Window a;

    public b(Window window) {
        this.a = window;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        this.a.getDecorView().setSystemUiVisibility(2822);
    }
}
