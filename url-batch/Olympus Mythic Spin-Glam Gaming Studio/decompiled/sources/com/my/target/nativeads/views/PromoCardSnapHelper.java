package com.my.target.nativeads.views;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes15.dex */
public final class PromoCardSnapHelper extends SnapHelper {
    final int a;
    private final a b;
    private OrientationHelper c;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    interface a {
        boolean isReachedEnd();

        boolean isReachedStart();
    }

    PromoCardSnapHelper(int i, a aVar) {
        this.a = i;
        this.b = aVar;
    }

    private boolean a(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        return layoutManager.canScrollHorizontally() ? i > 0 : i2 > 0;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @NonNull
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(layoutManager, view, a(layoutManager));
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View findSnapView(@NonNull RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        if (this.b.isReachedStart()) {
            return layoutManager.getChildAt(0);
        }
        if (this.b.isReachedEnd()) {
            return layoutManager.getChildAt(childCount - 1);
        }
        OrientationHelper a2 = a(layoutManager);
        int startAfterPadding = a2.getStartAfterPadding() + (a2.getTotalSpace() / 2) + 1;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int abs = Math.abs((a2.getDecoratedStart(childAt) + (a2.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(@NonNull RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        OrientationHelper a2 = a(layoutManager);
        int childCount = layoutManager.getChildCount();
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = layoutManager.getChildAt(i5);
            if (childAt != null) {
                int a3 = a(layoutManager, childAt, a2);
                if (a3 <= 0 && a3 > i4) {
                    view2 = childAt;
                    i4 = a3;
                }
                if (a3 >= 0 && a3 < i3) {
                    view = childAt;
                    i3 = a3;
                }
            }
        }
        boolean a4 = a(layoutManager, i, i2);
        if (a4 && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!a4 && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (a4) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view) + (!a4 ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    private int a(RecyclerView.LayoutManager layoutManager, View view, OrientationHelper orientationHelper) {
        int decoratedStart = (orientationHelper.getDecoratedStart(view) + (orientationHelper.getDecoratedMeasurement(view) / 2)) - (orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2));
        return layoutManager.getPosition(view) == 0 ? decoratedStart - (this.a / 2) : layoutManager.getItemCount() + (-1) == layoutManager.getPosition(view) ? decoratedStart + (this.a / 2) : decoratedStart;
    }

    private OrientationHelper a(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.c;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.c = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.c;
    }
}
