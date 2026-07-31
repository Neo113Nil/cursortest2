package com.my.target;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class ze extends ProgressBar implements ye {
    public ze(Context context) {
        super(context, null, android.R.style.Widget.ProgressBar.Horizontal);
        hg a = hg.a(context);
        w2 a2 = w2.a(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, a.a(hg.f)));
        a(a2.a(w2.h), a2.a(w2.g));
        setIndeterminate(false);
    }

    public void a(int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
        shapeDrawable2.getPaint().setColor(i);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, new ClipDrawable(shapeDrawable2, 8388611, 1)});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.progress);
        setProgressDrawable(layerDrawable);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.my.target.ye
    public void setMaxTime(float f) {
        setMax((int) (f * 1000.0f));
    }

    @Override // com.my.target.ye
    public void setTimeChanged(float f) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "progress", getProgress(), (int) (f * 1000.0f));
        ofInt.setDuration(500L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
    }

    public void setVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }
}
