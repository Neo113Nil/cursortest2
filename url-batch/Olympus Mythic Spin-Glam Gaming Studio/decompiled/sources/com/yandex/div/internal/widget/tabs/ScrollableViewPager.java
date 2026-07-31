package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.customview.widget.ViewDragHelper;
import androidx.viewpager.widget.ViewPager;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.yandex.div.internal.util.NestedHorizontalScrollCompanion;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import com.yandex.div.internal.widget.OnInterceptTouchEventListenerHost;
import java.util.Set;

/* loaded from: classes5.dex */
public class ScrollableViewPager extends RtlViewPager implements OnInterceptTouchEventListenerHost {

    @Nullable
    private Set<Integer> mDisabledPages;
    private boolean mIsEdgeScrollEnabled;
    private boolean mIsScrollEnabled;
    private boolean mIsScrollLocked;
    private boolean mIsSwipeLocked;
    private final NestedHorizontalScrollCompanion mNestedScrollCompanion;

    @Nullable
    private OnInterceptTouchEventListener mOnInterceptTouchEventListener;

    @Nullable
    private ViewDragHelper mViewDragHelper;

    @Override // com.yandex.div.internal.widget.tabs.RtlViewPager, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Yandex|SafeDK: Execution> Lcom/yandex/div/internal/widget/tabs/ScrollableViewPager;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(h.y, this, motionEvent);
        return safedk_ScrollableViewPager_dispatchTouchEvent_778e5377386a7a6904a6917c17123e2c(motionEvent);
    }

    @Override // com.yandex.div.internal.widget.tabs.RtlViewPager, androidx.viewpager.widget.ViewPager, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public ScrollableViewPager(@NonNull Context context) {
        this(context, null);
    }

    public ScrollableViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mNestedScrollCompanion = new NestedHorizontalScrollCompanion((ViewPager) this);
        this.mIsScrollEnabled = true;
        this.mIsEdgeScrollEnabled = true;
        this.mIsSwipeLocked = false;
        this.mIsScrollLocked = false;
    }

    @Override // com.yandex.div.internal.widget.OnInterceptTouchEventListenerHost
    @Nullable
    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.mOnInterceptTouchEventListener;
    }

    @Override // com.yandex.div.internal.widget.OnInterceptTouchEventListenerHost
    public void setOnInterceptTouchEventListener(@Nullable OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.mOnInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.mNestedScrollCompanion.dispatchOnScrollChanged();
    }

    public boolean safedk_ScrollableViewPager_dispatchTouchEvent_778e5377386a7a6904a6917c17123e2c(MotionEvent p0) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(p0);
        this.mNestedScrollCompanion.dispatchTouchEventAfterSuperCall(p0);
        return dispatchTouchEvent;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return processTouchEvent(motionEvent) && super.onTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        OnInterceptTouchEventListener onInterceptTouchEventListener = this.mOnInterceptTouchEventListener;
        return (onInterceptTouchEventListener != null ? onInterceptTouchEventListener.onInterceptTouchEvent(this, motionEvent) : false) || (processTouchEvent(motionEvent) && super.onInterceptTouchEvent(motionEvent));
    }

    private boolean processTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!this.mIsEdgeScrollEnabled && this.mViewDragHelper != null) {
            if ((motionEvent.getAction() & 255) == 0) {
                this.mIsSwipeLocked = false;
            }
            this.mViewDragHelper.processTouchEvent(motionEvent);
        }
        Set<Integer> set = this.mDisabledPages;
        if (set != null) {
            this.mIsScrollLocked = this.mIsScrollEnabled && set.contains(Integer.valueOf(getCurrentItem()));
        }
        return (this.mIsSwipeLocked || this.mIsScrollLocked || !this.mIsScrollEnabled) ? false : true;
    }

    public void setEdgeScrollEnabled(boolean z) {
        this.mIsEdgeScrollEnabled = z;
        if (z) {
            return;
        }
        ViewDragHelper create = ViewDragHelper.create(this, new ViewDragHelper.Callback() { // from class: com.yandex.div.internal.widget.tabs.ScrollableViewPager.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                return false;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onEdgeDragStarted(int i, int i2) {
                super.onEdgeDragStarted(i, i2);
                ScrollableViewPager scrollableViewPager = ScrollableViewPager.this;
                boolean z2 = true;
                if ((i & 2) == 0 && (i & 1) == 0) {
                    z2 = false;
                }
                scrollableViewPager.mIsSwipeLocked = z2;
            }
        });
        this.mViewDragHelper = create;
        create.setEdgeTrackingEnabled(3);
    }

    public void setScrollEnabled(boolean z) {
        this.mIsScrollEnabled = z;
    }

    public void setDisabledScrollPages(@Nullable Set<Integer> set) {
        this.mDisabledPages = set;
    }
}
