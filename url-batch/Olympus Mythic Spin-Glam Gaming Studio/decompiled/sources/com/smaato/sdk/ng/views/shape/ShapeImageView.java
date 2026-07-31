package com.smaato.sdk.ng.views.shape;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.views.shape.shader.ShaderHelper;
import com.smaato.sdk.ng.views.shape.shader.SvgShader;

/* loaded from: classes4.dex */
public class ShapeImageView extends ShaderImageView {
    private SvgShader b;

    public ShapeImageView(Context context) {
        super(context);
    }

    @Override // com.smaato.sdk.ng.views.shape.ShaderImageView
    public ShaderHelper createImageViewHelper() {
        SvgShader svgShader = new SvgShader();
        this.b = svgShader;
        return svgShader;
    }

    @Override // com.smaato.sdk.ng.views.shape.ShaderImageView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.smaato.sdk.ng.views.shape.ShaderImageView, android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setBorderType(int i) {
        SvgShader svgShader = this.b;
        if (svgShader != null) {
            svgShader.setBorderType(i);
            invalidate();
        }
    }

    public void setShapeResId(int i) {
        SvgShader svgShader = this.b;
        if (svgShader != null) {
            svgShader.setShapeResId(getContext(), i);
            invalidate();
        }
    }

    public void setStrokeCap(int i) {
        SvgShader svgShader = this.b;
        if (svgShader != null) {
            svgShader.setStrokeCap(i);
            invalidate();
        }
    }

    public void setStrokeJoin(int i) {
        SvgShader svgShader = this.b;
        if (svgShader != null) {
            svgShader.setStrokeJoin(i);
            invalidate();
        }
    }

    public void setStrokeMiter(int i) {
        SvgShader svgShader = this.b;
        if (svgShader != null) {
            svgShader.setStrokeMiter(i);
            invalidate();
        }
    }

    public ShapeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShapeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
