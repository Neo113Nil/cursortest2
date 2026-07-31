package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.vungle.ads.internal.util.a0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.yandex.div.internal.widget.DivLayoutParams;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l extends FrameLayout {
    public ImageView a;
    public boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        a(context);
    }

    public final void a(Context context) {
        this.a = new ImageView(context);
        int a = a0.a(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        ImageView imageView = this.a;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("icon");
            imageView = null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView3 = this.a;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("icon");
        } else {
            imageView2 = imageView3;
        }
        addView(imageView2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.d, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NotNull
    public final ImageView getPrivacyIcon$vungle_ads_release() {
        ImageView imageView = this.a;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("icon");
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void a(FrameLayout rootView, int i) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        if (getParent() != null) {
            ViewParent parent = getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
        rootView.addView(this);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int a = a0.a(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        if (i == 0) {
            layoutParams.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        } else if (i == 1) {
            layoutParams.gravity = 8388661;
        } else if (i == 2) {
            layoutParams.gravity = 8388691;
        } else if (i != 3) {
            layoutParams.gravity = 8388661;
        } else {
            layoutParams.gravity = 8388693;
        }
        setLayoutParams(layoutParams);
        rootView.requestLayout();
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        try {
            ImageView imageView = this.a;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("icon");
                imageView = null;
            }
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e) {
            boolean z = u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("error msg: ");
            a.append(e.getLocalizedMessage());
            t.c("NativeAd", a.toString());
        }
        ImageView imageView2 = this.a;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("icon");
            imageView2 = null;
        }
        imageView2.setImageDrawable(null);
        removeAllViews();
        if (getParent() != null) {
            ViewParent parent = getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
    }
}
