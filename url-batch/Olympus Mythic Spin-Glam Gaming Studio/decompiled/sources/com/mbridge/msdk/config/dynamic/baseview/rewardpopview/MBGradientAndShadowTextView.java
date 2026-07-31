package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewConst;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes9.dex */
public class MBGradientAndShadowTextView extends TextView {
    private int a;
    private int b;
    private int c;
    private int d;
    private LinearGradient e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class a {
        public int a;
        public int b;
        public int c;
        public int d = 40;
        public float e = 3.0f;
        public float f = 1.5f;
        public float g = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.a, this.b, Shader.TileMode.CLAMP);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.e);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public MBGradientAndShadowTextView(Context context, a aVar) {
        super(context);
        this.a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (aVar != null) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.mShadowRadius = aVar.e;
            this.mShadowDx = aVar.f;
            this.mShadowDy = aVar.g;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    @RequiresApi
    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
