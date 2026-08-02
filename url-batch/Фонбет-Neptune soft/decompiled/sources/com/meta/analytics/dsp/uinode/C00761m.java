package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.1m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C00761m extends C00912b {
    @Override // com.meta.analytics.dsp.uinode.C3S
    public final C01263k A08(View view, C01263k c01263k) {
        WindowInsets result = (WindowInsets) C01263k.A01(c01263k);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C01263k.A00(result);
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final C01263k A09(View view, C01263k c01263k) {
        WindowInsets result = (WindowInsets) C01263k.A01(c01263k);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C01263k.A00(result);
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final void A0F(View view, final C3D c3d) {
        if (c3d == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.3R
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C01263k compatInsets = c3d.AAk(view2, C01263k.A00(windowInsets));
                    return (WindowInsets) C01263k.A01(compatInsets);
                }
            });
        }
    }
}
