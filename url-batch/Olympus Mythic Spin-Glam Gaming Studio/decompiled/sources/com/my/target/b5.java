package com.my.target;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public class b5 extends LinearSnapHelper {
    private int b;
    private OrientationHelper g;
    private OrientationHelper h;
    private RecyclerView i;
    private final boolean c = false;
    private final float d = 60.0f;
    private final int e = -1;
    private final float f = -1.0f;
    private final DecelerateInterpolator a = new DecelerateInterpolator(1.7f);

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a extends LinearSmoothScroller {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 60.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        protected int calculateTimeForDeceleration(int i) {
            return (int) Math.ceil(calculateTimeForScrolling(i) / 0.3d);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            RecyclerView recyclerView = b5.this.i;
            if (recyclerView == null || recyclerView.getLayoutManager() == null) {
                return;
            }
            b5 b5Var = b5.this;
            int[] calculateDistanceToFinalSnap = b5Var.calculateDistanceToFinalSnap(b5Var.i.getLayoutManager(), view);
            int i = calculateDistanceToFinalSnap[0];
            int i2 = calculateDistanceToFinalSnap[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (calculateTimeForDeceleration > 0) {
                action.update(i, i2, calculateTimeForDeceleration, b5.this.a);
            }
        }
    }

    public b5(int i) {
        this.b = i;
    }

    private OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.h;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.h = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.h;
    }

    private OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.g;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.g = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.g;
    }

    public void a(int i, Boolean bool) {
        if (this.b != i) {
            this.b = i;
            a(bool);
        }
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(null);
            this.i = recyclerView;
        } else {
            this.i = null;
        }
        try {
            super.attachToRecyclerView(recyclerView);
        } catch (Throwable unused) {
        }
    }

    public void b(int i) {
        RecyclerView recyclerView;
        RecyclerView.SmoothScroller createScroller;
        if (i == -1 || (recyclerView = this.i) == null || recyclerView.getLayoutManager() == null || (createScroller = createScroller(this.i.getLayoutManager())) == null) {
            return;
        }
        createScroller.setTargetPosition(i);
        this.i.getLayoutManager().startSmoothScroll(createScroller);
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int i = this.b;
        if (i == 17) {
            int[] calculateDistanceToFinalSnap = super.calculateDistanceToFinalSnap(layoutManager, view);
            return calculateDistanceToFinalSnap == null ? new int[2] : calculateDistanceToFinalSnap;
        }
        int[] iArr = new int[2];
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return iArr;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (i == 8388611) {
            iArr[0] = b(view, getHorizontalHelper(linearLayoutManager));
            return iArr;
        }
        iArr[0] = a(view, getHorizontalHelper(linearLayoutManager));
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateScrollDistance(int i, int i2) {
        return super.calculateScrollDistance(i, i2);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
        RecyclerView recyclerView;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (recyclerView = this.i) == null) {
            return null;
        }
        return new a(recyclerView.getContext());
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return a(layoutManager, true);
    }

    public void a(int i) {
        a(i, Boolean.TRUE);
    }

    private View a(RecyclerView.LayoutManager layoutManager, boolean z) {
        int i = this.b;
        if (i == 17) {
            return a(layoutManager, getHorizontalHelper(layoutManager), 17, z);
        }
        if (i == 48) {
            return a(layoutManager, getVerticalHelper(layoutManager), 8388611, z);
        }
        if (i == 80) {
            return a(layoutManager, getVerticalHelper(layoutManager), 8388613, z);
        }
        if (i == 8388611) {
            return a(layoutManager, getHorizontalHelper(layoutManager), 8388611, z);
        }
        if (i != 8388613) {
            return null;
        }
        return a(layoutManager, getHorizontalHelper(layoutManager), 8388613, z);
    }

    private int b(View view, OrientationHelper orientationHelper) {
        int decoratedStart = orientationHelper.getDecoratedStart(view);
        return decoratedStart >= orientationHelper.getStartAfterPadding() / 2 ? decoratedStart - orientationHelper.getStartAfterPadding() : decoratedStart;
    }

    private void a(Boolean bool) {
        RecyclerView.LayoutManager layoutManager;
        View a2;
        RecyclerView recyclerView = this.i;
        if (recyclerView == null || recyclerView.getLayoutManager() == null || (a2 = a((layoutManager = this.i.getLayoutManager()), false)) == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, a2);
        if (bool.booleanValue()) {
            this.i.smoothScrollBy(calculateDistanceToFinalSnap[0], calculateDistanceToFinalSnap[1]);
        } else {
            this.i.scrollBy(calculateDistanceToFinalSnap[0], calculateDistanceToFinalSnap[1]);
        }
    }

    private int a(View view, OrientationHelper orientationHelper) {
        int decoratedEnd = orientationHelper.getDecoratedEnd(view);
        if (decoratedEnd >= orientationHelper.getEnd() - ((orientationHelper.getEnd() - orientationHelper.getEndAfterPadding()) / 2)) {
            return orientationHelper.getDecoratedEnd(view) - orientationHelper.getEnd();
        }
        return decoratedEnd - orientationHelper.getEndAfterPadding();
    }

    private View a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i, boolean z) {
        int end;
        int abs;
        View view = null;
        if (layoutManager.getChildCount() != 0 && (layoutManager instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (z && a(linearLayoutManager)) {
                return null;
            }
            if (layoutManager.getClipToPadding()) {
                end = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
            } else {
                end = orientationHelper.getEnd() / 2;
            }
            boolean z2 = i == 8388611;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < linearLayoutManager.getChildCount(); i3++) {
                View childAt = linearLayoutManager.getChildAt(i3);
                if (z2) {
                    abs = Math.abs(orientationHelper.getDecoratedStart(childAt));
                } else {
                    abs = Math.abs((orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - end);
                }
                if (abs < i2) {
                    view = childAt;
                    i2 = abs;
                }
            }
        }
        return view;
    }

    private boolean a(LinearLayoutManager linearLayoutManager) {
        return ((linearLayoutManager.getReverseLayout() || this.b != 8388611) && !(linearLayoutManager.getReverseLayout() && this.b == 8388613) && ((linearLayoutManager.getReverseLayout() || this.b != 48) && !(linearLayoutManager.getReverseLayout() && this.b == 80))) ? this.b == 17 ? linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 || linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1 : linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 : linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1;
    }
}
