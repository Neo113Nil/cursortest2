package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YX implements KJ {
    @Override // com.meta.analytics.dsp.uinode.KJ
    public final void AFC(Throwable th, Object obj) {
        if (obj instanceof InterfaceC02137b) {
            C0889Yn adContext = ((InterfaceC02137b) obj).A5t();
            if (adContext != null) {
                adContext.A0O(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C0889Yn)) {
            return;
        }
        ((C0889Yn) context).A0O(th);
    }
}
