package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.vungle.ads.internal.r1;
import com.vungle.ads.nativead.NativeVideoListener;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public class e extends RelativeLayout {
    public final r1 a;
    public ImageView b;
    public NativeVideoListener c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, r1 internal2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internal2, "internal");
        this.a = internal2;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        addView(imageView);
    }

    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.a.b(this.b);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.d, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public final ImageView getImageView$vungle_ads_release() {
        return this.b;
    }

    @NotNull
    public final r1 getInternal() {
        return this.a;
    }

    @Nullable
    public final NativeVideoListener getNativeVideoListener() {
        return this.c;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setImageView$vungle_ads_release(@Nullable ImageView imageView) {
        this.b = imageView;
    }

    public final void setNativeVideoListener(@Nullable NativeVideoListener nativeVideoListener) {
        this.c = nativeVideoListener;
    }

    public void a() {
        removeAllViews();
        try {
            Result.Companion companion = Result.INSTANCE;
            ImageView imageView = this.b;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        ImageView imageView2 = this.b;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
    }
}
