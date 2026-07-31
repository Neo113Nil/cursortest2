package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PagerSnapStartHelper.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J \u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/PagerSnapStartHelper;", "Landroidx/recyclerview/widget/PagerSnapHelper;", "itemSpacing", "", "(I)V", "_horizontalHelper", "Landroidx/recyclerview/widget/OrientationHelper;", "_verticalHelper", "getItemSpacing", "()I", "setItemSpacing", "calculateDistanceToFinalSnap", "", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "targetView", "Landroid/view/View;", "distanceToCenter", "helper", "findTargetSnapPosition", "manager", "velocityX", "velocityY", "getHorizontalHelper", "getVerticalHelper", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerSnapStartHelper extends PagerSnapHelper {

    @Nullable
    private OrientationHelper _horizontalHelper;

    @Nullable
    private OrientationHelper _verticalHelper;
    private int itemSpacing;

    public PagerSnapStartHelper(int i) {
        this.itemSpacing = i;
    }

    public final int getItemSpacing() {
        return this.itemSpacing;
    }

    public final void setItemSpacing(int i) {
        this.itemSpacing = i;
    }

    private final OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this._verticalHelper;
        if (orientationHelper != null) {
            if (!Intrinsics.areEqual(orientationHelper.getLayoutManager(), layoutManager)) {
                orientationHelper = null;
            }
            if (orientationHelper != null) {
                return orientationHelper;
            }
        }
        OrientationHelper createVerticalHelper = OrientationHelper.createVerticalHelper(layoutManager);
        this._verticalHelper = createVerticalHelper;
        return createVerticalHelper;
    }

    private final OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this._horizontalHelper;
        if (orientationHelper != null) {
            if (!Intrinsics.areEqual(orientationHelper.getLayoutManager(), layoutManager)) {
                orientationHelper = null;
            }
            if (orientationHelper != null) {
                return orientationHelper;
            }
        }
        OrientationHelper createHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        this._horizontalHelper = createHorizontalHelper;
        return createHorizontalHelper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(@NotNull RecyclerView.LayoutManager manager, int velocityX, int velocityY) {
        int lastCompletelyVisibleItemPosition;
        Intrinsics.checkNotNull(manager, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper");
        DivGalleryItemHelper divGalleryItemHelper = (DivGalleryItemHelper) manager;
        if (divGalleryItemHelper.getLayoutManagerOrientation() != 0) {
            velocityX = velocityY;
        } else if (manager.getLayoutDirection() != 0) {
            velocityX = -velocityX;
        }
        if (velocityX < 0) {
            lastCompletelyVisibleItemPosition = divGalleryItemHelper.firstCompletelyVisibleItemPosition();
        } else {
            lastCompletelyVisibleItemPosition = divGalleryItemHelper.lastCompletelyVisibleItemPosition();
        }
        if (lastCompletelyVisibleItemPosition != -1) {
            return lastCompletelyVisibleItemPosition;
        }
        int firstVisibleItemPosition = divGalleryItemHelper.firstVisibleItemPosition();
        int lastVisibleItemPosition = divGalleryItemHelper.lastVisibleItemPosition();
        if (lastVisibleItemPosition != firstVisibleItemPosition) {
            return velocityX < 0 ? firstVisibleItemPosition : lastVisibleItemPosition;
        }
        if (lastVisibleItemPosition != -1) {
            return lastVisibleItemPosition;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    @NotNull
    public int[] calculateDistanceToFinalSnap(@NotNull RecyclerView.LayoutManager layoutManager, @NotNull View targetView) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(layoutManager, targetView, getHorizontalHelper(layoutManager));
        } else if (layoutManager.canScrollVertically()) {
            iArr[1] = distanceToCenter(layoutManager, targetView, getVerticalHelper(layoutManager));
        }
        return iArr;
    }

    private final int distanceToCenter(RecyclerView.LayoutManager layoutManager, View targetView, OrientationHelper helper) {
        float y;
        int height;
        int end;
        if (layoutManager.canScrollHorizontally()) {
            y = targetView.getX();
            height = targetView.getWidth() / 2;
        } else {
            y = targetView.getY();
            height = targetView.getHeight() / 2;
        }
        int i = (int) (y + height);
        if (layoutManager.getClipToPadding()) {
            end = helper.getStartAfterPadding() + (helper.getTotalSpace() / 2);
        } else {
            end = helper.getEnd() / 2;
        }
        return i - end;
    }
}
