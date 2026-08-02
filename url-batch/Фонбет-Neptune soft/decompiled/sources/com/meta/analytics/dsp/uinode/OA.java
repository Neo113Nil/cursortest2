package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public abstract class OA {
    public static final int A00 = AbstractC0556Lo.A00();

    public static void A00(C0889Yn c0889Yn, ViewGroup viewGroup, String str) {
        new AsyncTaskC0766Tq(viewGroup, c0889Yn).A07(str);
        View view = new View(c0889Yn);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC0556Lo.A0R(view, c0889Yn);
        viewGroup.addView(view, 0);
    }
}
