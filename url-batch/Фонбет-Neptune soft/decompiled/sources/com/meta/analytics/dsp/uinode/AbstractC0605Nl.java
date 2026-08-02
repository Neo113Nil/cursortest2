package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0605Nl {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            ViewOnClickListenerC0604Nk viewOnClickListenerC0604Nk = new ViewOnClickListenerC0604Nk(onClickListener);
            view.setOnClickListener(viewOnClickListenerC0604Nk);
            view.setOnTouchListener(new ViewOnTouchListenerC0603Nj(viewOnClickListenerC0604Nk));
        }
    }
}
