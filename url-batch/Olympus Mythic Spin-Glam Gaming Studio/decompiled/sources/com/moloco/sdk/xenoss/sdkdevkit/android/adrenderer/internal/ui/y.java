package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.ImageViewCompat;
import com.moloco.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@SuppressLint({"ViewConstructor"})
/* loaded from: classes14.dex */
public final class y extends LinearLayout {
    public static final int a = 0;

    public static final class a extends ImageView {
        public a(Context context) {
            super(context);
        }

        @Override // android.view.View
        public boolean dispatchTouchEvent(MotionEvent me) {
            DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
            return super.dispatchTouchEvent(me);
        }

        @Override // android.widget.ImageView, android.view.View
        public void onDraw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() / 2.0f, getHeight());
            super.onDraw(canvas);
            canvas.restore();
        }

        @Override // android.widget.ImageView, android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            if (1 == 0) {
                setMeasuredDimension(0, 0);
            } else {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        }
    }

    public /* synthetic */ y(Context context, float f, int i, int i2, int i3, int i4, float f2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? 4.8f : f, (i5 & 4) != 0 ? 5 : i, (i5 & 8) != 0 ? 12 : i2, (i5 & 16) != 0 ? -1 : i3, (i5 & 32) != 0 ? -7829368 : i4, (i5 & 64) != 0 ? 9.0f : f2);
    }

    public final ImageView a(Context context, int i, @ColorInt int i2) {
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        imageView.setImageResource(R.drawable.moloco_star);
        ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(i2));
        return imageView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@NotNull Context context, float f, int i, int i2, @ColorInt int i3, @ColorInt int i4, float f2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        setGravity(16);
        int a2 = c.a(i2, context);
        int floor = (int) Math.floor(f);
        int roundToInt = MathKt.roundToInt(10.0f * f) - (floor * 10);
        if (1 <= i) {
            int i5 = 1;
            while (true) {
                if (i5 <= floor) {
                    addView(a(context, a2, i3));
                } else if (i5 != floor + 1 || 1 > roundToInt || roundToInt >= 10) {
                    addView(a(context, a2, i4));
                } else {
                    addView(a(context, a2, i3, i4));
                }
                if (i5 == i) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        View space = new Space(context);
        space.setLayoutParams(new LinearLayout.LayoutParams(c.a(4, context), 0));
        addView(space);
        TextView textView = new TextView(context);
        textView.setText(String.valueOf(f));
        textView.setTextColor(-1);
        textView.setTextSize(f2);
        textView.setMaxLines(1);
        addView(textView);
    }

    public final FrameLayout a(Context context, int i, @ColorInt int i2, @ColorInt int i3) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        imageView.setImageResource(R.drawable.moloco_star);
        ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(i3));
        frameLayout.addView(imageView);
        a aVar = new a(context);
        aVar.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        aVar.setImageResource(R.drawable.moloco_star);
        ImageViewCompat.setImageTintList(aVar, ColorStateList.valueOf(i2));
        frameLayout.addView(aVar);
        return frameLayout;
    }
}
