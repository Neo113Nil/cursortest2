package com.vungle.ads.internal.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, String watermark) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        byte[] overlayBytes = Base64.decode(watermark, 0);
        Intrinsics.checkNotNullExpressionValue(overlayBytes, "overlayBytes");
        Bitmap overlayBm = BitmapFactory.decodeByteArray(overlayBytes, 0, overlayBytes.length);
        Intrinsics.checkNotNullExpressionValue(overlayBm, "overlayBm");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, overlayBm);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        setBackground(bitmapDrawable);
        setClickable(false);
        setFocusable(false);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.d, this, me);
        return super.dispatchTouchEvent(me);
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
