package com.five_corp.ad.internal.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.five_corp.ad.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes15.dex */
public final class q extends FrameLayout {
    public static Bitmap a;
    public static final Object b = new Object();

    public q(Context context) {
        super(context);
        Bitmap bitmap;
        setBackgroundColor(-16777216);
        setAlpha(0.3f);
        ImageView imageView = new ImageView(context);
        synchronized (b) {
            try {
                if (a == null) {
                    a = BitmapFactory.decodeResource(context.getResources(), R.drawable.com_five_corp_loading_icon);
                }
                bitmap = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        imageView.setImageBitmap(bitmap);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ROTATION, 0.0f, 360.0f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(2000L);
        ofFloat.start();
        addView(imageView, new FrameLayout.LayoutParams(105, 105, 17));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.five_corp.ad", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
