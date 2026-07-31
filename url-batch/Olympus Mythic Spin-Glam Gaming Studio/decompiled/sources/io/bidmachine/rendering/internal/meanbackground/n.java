package io.bidmachine.rendering.internal.meanbackground;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n {
    public final View a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup viewGroup = (ViewGroup) view.findViewWithTag("ads");
        if (viewGroup == null) {
            return view;
        }
        int childCount = viewGroup.getChildCount();
        ViewGroup viewGroup2 = viewGroup;
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = viewGroup.getChildAt(i2);
            int measuredWidth = child.getMeasuredWidth() * child.getMeasuredHeight();
            if (measuredWidth > i) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                viewGroup2 = child;
                i = measuredWidth;
            }
        }
        return viewGroup2;
    }
}
