package com.google.android.material.sidesheet;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
abstract class SheetDelegate {
    abstract <V extends View> int calculateTargetStateOnStopNestedScroll(V v);

    abstract int calculateTargetStateOnViewReleased(View view, float f, float f2);

    abstract int getExpandedOffset();

    abstract int getHiddenOffset();

    abstract <V extends View> int getOutwardEdge(V v);

    abstract int getSheetEdge();

    abstract <V extends View> boolean hasReachedExpandedOffset(V v);

    abstract boolean isSettling(View view, int i, boolean z);

    abstract <V extends View> void setTargetStateOnNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3);

    abstract boolean shouldHide(View view, float f);

    SheetDelegate() {
    }
}
