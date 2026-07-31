package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.Pf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnApplyWindowInsetsListenerC2533Pf implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ PR A00;
    public final /* synthetic */ C0n A01;

    public ViewOnApplyWindowInsetsListenerC2533Pf(C0n c0n, PR pr) {
        this.A01 = c0n;
        this.A00 = pr;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C2549Py compatInsets = this.A00.ACw(view, C2549Py.A00(windowInsets));
        return (WindowInsets) C2549Py.A01(compatInsets);
    }
}
