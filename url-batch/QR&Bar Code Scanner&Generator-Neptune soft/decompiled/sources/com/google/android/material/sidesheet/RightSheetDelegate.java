package com.google.android.material.sidesheet;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;

/* loaded from: classes2.dex */
final class RightSheetDelegate extends SheetDelegate {
    final SideSheetBehavior<? extends View> sheetBehavior;

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int getSheetEdge() {
        return 0;
    }

    RightSheetDelegate(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.sheetBehavior = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int getHiddenOffset() {
        return this.sheetBehavior.getParentWidth();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int getExpandedOffset() {
        return Math.max(0, getHiddenOffset() - this.sheetBehavior.getChildWidth());
    }

    private boolean isReleasedCloseToOriginEdge(View view) {
        return view.getLeft() > (getHiddenOffset() - getExpandedOffset()) / 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int calculateTargetStateOnViewReleased(View view, float f, float f2) {
        if (f >= 0.0f) {
            if (shouldHide(view, f)) {
                if (isSwipeSignificant(f, f2) || isReleasedCloseToOriginEdge(view)) {
                    return 5;
                }
            } else {
                if (f != 0.0f && SheetUtils.isSwipeMostlyHorizontal(f, f2)) {
                    return 5;
                }
                int left = view.getLeft();
                if (Math.abs(left - getExpandedOffset()) >= Math.abs(left - getHiddenOffset())) {
                    return 5;
                }
            }
        }
        return 3;
    }

    private boolean isSwipeSignificant(float f, float f2) {
        return SheetUtils.isSwipeMostlyHorizontal(f, f2) && f2 > ((float) this.sheetBehavior.getSignificantVelocityThreshold());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    <V extends View> void setTargetStateOnNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int left = v.getLeft();
        int i4 = left - i;
        if (i < 0) {
            if (i4 > getExpandedOffset()) {
                iArr[1] = left - getExpandedOffset();
                ViewCompat.offsetLeftAndRight(v, -iArr[1]);
                this.sheetBehavior.setStateInternal(3);
                return;
            } else {
                if (this.sheetBehavior.isDraggable()) {
                    iArr[1] = i;
                    ViewCompat.offsetLeftAndRight(v, -i);
                    this.sheetBehavior.setStateInternal(1);
                    return;
                }
                return;
            }
        }
        if (i <= 0 || view.canScrollHorizontally(-1)) {
            return;
        }
        if (i4 <= getHiddenOffset()) {
            if (this.sheetBehavior.isDraggable()) {
                iArr[1] = i;
                ViewCompat.offsetLeftAndRight(v, i);
                this.sheetBehavior.setStateInternal(1);
                return;
            }
            return;
        }
        iArr[1] = left - getHiddenOffset();
        ViewCompat.offsetLeftAndRight(v, iArr[1]);
        this.sheetBehavior.setStateInternal(5);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    <V extends View> int calculateTargetStateOnStopNestedScroll(V v) {
        if (this.sheetBehavior.getLastNestedScrollDx() > 0) {
            return 3;
        }
        SideSheetBehavior<? extends View> sideSheetBehavior = this.sheetBehavior;
        if (!sideSheetBehavior.shouldHide(v, sideSheetBehavior.getXVelocity()) && this.sheetBehavior.getLastNestedScrollDx() == 0) {
            int left = v.getLeft();
            if (Math.abs(left - getExpandedOffset()) < Math.abs(left - getHiddenOffset())) {
                return 3;
            }
        }
        return 5;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    <V extends View> boolean hasReachedExpandedOffset(V v) {
        return v.getLeft() == getExpandedOffset();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean shouldHide(View view, float f) {
        return Math.abs(((float) view.getRight()) + (f * this.sheetBehavior.getHideFriction())) > this.sheetBehavior.getHideThreshold();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean isSettling(View view, int i, boolean z) {
        int outwardEdgeOffsetForState = this.sheetBehavior.getOutwardEdgeOffsetForState(i);
        ViewDragHelper viewDragHelper = this.sheetBehavior.getViewDragHelper();
        return viewDragHelper != null && (!z ? !viewDragHelper.smoothSlideViewTo(view, outwardEdgeOffsetForState, view.getTop()) : !viewDragHelper.settleCapturedViewAt(outwardEdgeOffsetForState, view.getTop()));
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    <V extends View> int getOutwardEdge(V v) {
        return v.getLeft();
    }
}
