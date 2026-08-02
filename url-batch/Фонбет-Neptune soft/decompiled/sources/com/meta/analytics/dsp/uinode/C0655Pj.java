package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Pj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0655Pj {
    public final int[] A00(View view, int i, int i2) {
        C01564p c01564p = (C01564p) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i, view.getPaddingLeft() + view.getPaddingRight(), c01564p.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i2, childWidthSpec + view.getPaddingBottom(), c01564p.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + c01564p.leftMargin + c01564p.rightMargin, childWidthSpec3 + c01564p.bottomMargin + c01564p.topMargin};
    }
}
