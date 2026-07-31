package com.my.target.nativeads.views;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.ed;
import com.my.target.fh;
import com.my.target.qi;
import com.my.target.w5;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public class MediaAdView extends FrameLayout {
    public static final int COLOR_PLACEHOLDER_GRAY = -1118482;
    private final fh a;
    private final ProgressBar b;
    private final w5 c;
    private final CollageView d;
    private int e;
    private int f;
    private float g;
    private int h;

    public MediaAdView(@NonNull Context context) {
        super(context);
        this.h = -1;
        this.a = new fh(context);
        this.c = new w5(context);
        this.b = new ProgressBar(context, null, R.attr.progressBarStyle);
        this.d = new CollageView(context);
        a(context);
    }

    private void a(Context context) {
        qi.b(this.a, "media_image");
        qi.b(this.b, "progress_bar");
        qi.b(this.c, "play_button");
        qi.b(this.d, "collage_view");
        setBackgroundColor(COLOR_PLACEHOLDER_GRAY);
        this.b.setVisibility(8);
        Drawable indeterminateDrawable = this.b.getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setColorFilter(-16733198, PorterDuff.Mode.SRC_ATOP);
        }
        this.c.a(ed.a(qi.g(context).b(80)), false);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        addView(this.a);
        addView(this.c, new FrameLayout.LayoutParams(-2, -2));
        addView(this.b, new FrameLayout.LayoutParams(-2, -2));
        addView(this.d, new FrameLayout.LayoutParams(-1, -2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public CollageView getCollageView() {
        return this.d;
    }

    @ColorInt
    public int getHtml5ViewBackgroundColor() {
        return this.h;
    }

    @NonNull
    public ImageView getImageView() {
        return this.a;
    }

    public float getMediaAspectRatio() {
        return this.g;
    }

    @NonNull
    public View getPlayButtonView() {
        return this.c;
    }

    @NonNull
    public ProgressBar getProgressBarView() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i6 = ((i3 - i) - measuredWidth) / 2;
                    int i7 = ((i4 - i2) - measuredHeight) / 2;
                    childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = this.e;
        if (i5 == 0 || (i3 = this.f) == 0) {
            if (mode != 1073741824) {
                size = 0;
            }
            if (mode2 != 1073741824) {
                size2 = 0;
            }
            setMeasuredDimension(size, size2);
            return;
        }
        float f = i5 / i3;
        if (mode == 0 && mode2 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        if (mode == 0) {
            size = (int) (size2 * f);
        } else if (mode2 == 0 || mode2 != 1073741824) {
            size2 = (int) (size / f);
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i7 = Integer.MIN_VALUE;
                if (layoutParams != null) {
                    i4 = layoutParams.width == -1 ? 1073741824 : Integer.MIN_VALUE;
                    if (layoutParams.height == -1) {
                        i7 = 1073741824;
                    }
                } else {
                    i4 = Integer.MIN_VALUE;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, i4), View.MeasureSpec.makeMeasureSpec(size2, i7));
                if (childAt.getMeasuredHeight() > 0) {
                    z = true;
                }
            }
        }
        if (z) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setHtml5ViewBackgroundColor(@ColorInt int i) {
        this.h = i;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.c.setOnClickListener(onClickListener);
    }

    public void setPlaceHolderDimension(int i, int i2) {
        this.e = i;
        this.f = i2;
        this.a.setPlaceholderDimensions(i, i2);
        float f = i2;
        this.g = f != 0.0f ? i / f : 0.0f;
    }

    public MediaAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        this.a = new fh(context);
        this.c = new w5(context);
        this.b = new ProgressBar(context, null, R.attr.progressBarStyle);
        this.d = new CollageView(context);
        a(context);
    }

    public MediaAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = -1;
        this.a = new fh(context);
        this.c = new w5(context);
        this.b = new ProgressBar(context, null, R.attr.progressBarStyle);
        this.d = new CollageView(context);
        a(context);
    }
}
