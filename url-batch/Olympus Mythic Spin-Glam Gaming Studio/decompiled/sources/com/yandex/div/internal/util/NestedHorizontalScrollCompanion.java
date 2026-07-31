package com.yandex.div.internal.util;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.annotations.InternalApi;

@InternalApi
/* loaded from: classes9.dex */
public class NestedHorizontalScrollCompanion {
    private static final int DX_UNCONSUMED = 1;
    private boolean mCanDispatchNestedScroll;
    private float mDownX;
    private float mDownY;
    private final float mSlop;
    private final View mTarget;

    public NestedHorizontalScrollCompanion(@NonNull View view) {
        this(view, getScaledTouchSlop(view));
    }

    @VisibleForTesting
    NestedHorizontalScrollCompanion(@NonNull View view, float f) {
        this.mTarget = view;
        ViewCompat.setNestedScrollingEnabled(view, true);
        this.mSlop = f;
    }

    public NestedHorizontalScrollCompanion(@NonNull ViewPager viewPager) {
        this((View) viewPager, getScaledTouchSlop(viewPager));
    }

    @VisibleForTesting
    NestedHorizontalScrollCompanion(@NonNull ViewPager viewPager, float f) {
        this((View) viewPager, f);
        viewPager.addOnPageChangeListener(new NestedScrollPageChangeListener(viewPager));
    }

    public void dispatchOnScrollChanged() {
        this.mCanDispatchNestedScroll = false;
    }

    public void dispatchOnOverScrolled(boolean z) {
        if (this.mCanDispatchNestedScroll && z) {
            ViewCompat.dispatchNestedScroll(this.mTarget, 0, 0, 1, 0, null);
        }
    }

    public void dispatchTouchEventAfterSuperCall(@NonNull MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownX = motionEvent.getX();
            this.mDownY = motionEvent.getY();
            return;
        }
        if (action != 1) {
            if (action == 2) {
                float abs = Math.abs(motionEvent.getX() - this.mDownX);
                float abs2 = Math.abs(motionEvent.getY() - this.mDownY);
                if (this.mCanDispatchNestedScroll || abs < this.mSlop || abs <= abs2) {
                    return;
                }
                this.mCanDispatchNestedScroll = true;
                ViewCompat.startNestedScroll(this.mTarget, 1);
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.mCanDispatchNestedScroll = false;
        ViewCompat.stopNestedScroll(this.mTarget);
    }

    private static int getScaledTouchSlop(@NonNull View view) {
        return ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    private class NestedScrollPageChangeListener extends ViewPager.SimpleOnPageChangeListener {
        private float mPreviousPageOffset;
        private int mScrollState;
        private final ViewPager mViewPager;

        private NestedScrollPageChangeListener(ViewPager viewPager) {
            this.mScrollState = -1;
            this.mViewPager = viewPager;
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.mScrollState = i;
            if (i == 0) {
                this.mPreviousPageOffset = -1.0f;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            boolean z = i == this.mViewPager.getAdapter().getCount() - 1;
            if ((i == 0 || z) && this.mScrollState == 1 && this.mPreviousPageOffset == 0.0f && f == 0.0f) {
                NestedHorizontalScrollCompanion.this.dispatchOnOverScrolled(true);
            }
            this.mPreviousPageOffset = f;
        }
    }
}
