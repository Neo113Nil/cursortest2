package com.facebook.ads.redexgen.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.facebook.ads.redexgen.X.eo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3100eo extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C3102eq A01;

    public C3100eo(C3102eq c3102eq, float f) {
        this.A01 = c3102eq;
        this.A00 = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }
}
