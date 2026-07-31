package com.facebook.ads.redexgen.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.facebook.ads.redexgen.X.en, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3099en extends ViewOutlineProvider {
    public final /* synthetic */ C3102eq A00;

    public C3099en(C3102eq c3102eq) {
        this.A00 = c3102eq;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 8.0f);
    }
}
