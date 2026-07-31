package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;

/* loaded from: classes3.dex */
public class DropShadowKeyframeAnimation implements BaseKeyframeAnimation.AnimationListener {
    private static final float AFTER_EFFECT_SOFTNESS_SCALE_FACTOR = 0.33f;
    private static final float DEG_TO_RAD = 0.017453292f;
    private final BaseKeyframeAnimation<Integer, Integer> color;
    private final FloatKeyframeAnimation direction;
    private final FloatKeyframeAnimation distance;
    private final BaseLayer layer;
    private final BaseKeyframeAnimation.AnimationListener listener;
    private final FloatKeyframeAnimation opacity;
    private final FloatKeyframeAnimation radius;
    private float paintRadius = Float.NaN;
    private float paintX = Float.NaN;
    private float paintY = Float.NaN;
    private int paintColor = 0;
    private final float[] matrixValues = new float[9];

    public DropShadowKeyframeAnimation(BaseKeyframeAnimation.AnimationListener animationListener, BaseLayer baseLayer, DropShadowEffect dropShadowEffect) {
        this.listener = animationListener;
        this.layer = baseLayer;
        BaseKeyframeAnimation<Integer, Integer> createAnimation = dropShadowEffect.getColor().createAnimation();
        this.color = createAnimation;
        createAnimation.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation);
        FloatKeyframeAnimation createAnimation2 = dropShadowEffect.getOpacity().createAnimation();
        this.opacity = createAnimation2;
        createAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation2);
        FloatKeyframeAnimation createAnimation3 = dropShadowEffect.getDirection().createAnimation();
        this.direction = createAnimation3;
        createAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation3);
        FloatKeyframeAnimation createAnimation4 = dropShadowEffect.getDistance().createAnimation();
        this.distance = createAnimation4;
        createAnimation4.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation4);
        FloatKeyframeAnimation createAnimation5 = dropShadowEffect.getRadius().createAnimation();
        this.radius = createAnimation5;
        createAnimation5.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation5);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.listener.onValueChanged();
    }

    public void applyTo(Paint paint, Matrix matrix, int i) {
        float floatValue = this.direction.getFloatValue() * DEG_TO_RAD;
        float floatValue2 = this.distance.getValue().floatValue();
        double d = floatValue;
        float sin = ((float) Math.sin(d)) * floatValue2;
        float cos = ((float) Math.cos(d + 3.141592653589793d)) * floatValue2;
        this.layer.transform.getMatrix().getValues(this.matrixValues);
        float[] fArr = this.matrixValues;
        float f = fArr[0];
        float f2 = fArr[4];
        matrix.getValues(fArr);
        float[] fArr2 = this.matrixValues;
        float f3 = fArr2[0] / f;
        float f4 = sin * f3;
        float f5 = cos * (fArr2[4] / f2);
        int intValue = this.color.getValue().intValue();
        int argb = Color.argb(Math.round((this.opacity.getValue().floatValue() * i) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
        float max = Math.max(this.radius.getValue().floatValue() * f3 * AFTER_EFFECT_SOFTNESS_SCALE_FACTOR, Float.MIN_VALUE);
        if (this.paintRadius == max && this.paintX == f4 && this.paintY == f5 && this.paintColor == argb) {
            return;
        }
        this.paintRadius = max;
        this.paintX = f4;
        this.paintY = f5;
        this.paintColor = argb;
        paint.setShadowLayer(max, f4, f5, argb);
    }

    public void setColorCallback(LottieValueCallback<Integer> lottieValueCallback) {
        this.color.setValueCallback(lottieValueCallback);
    }

    public void setOpacityCallback(final LottieValueCallback<Float> lottieValueCallback) {
        if (lottieValueCallback == null) {
            this.opacity.setValueCallback(null);
        } else {
            this.opacity.setValueCallback(new LottieValueCallback<Float>() { // from class: com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.airbnb.lottie.value.LottieValueCallback
                public Float getValue(LottieFrameInfo<Float> lottieFrameInfo) {
                    Float f = (Float) lottieValueCallback.getValue(lottieFrameInfo);
                    if (f == null) {
                        return null;
                    }
                    return Float.valueOf(f.floatValue() * 2.55f);
                }
            });
        }
    }

    public void setDirectionCallback(LottieValueCallback<Float> lottieValueCallback) {
        this.direction.setValueCallback(lottieValueCallback);
    }

    public void setDistanceCallback(LottieValueCallback<Float> lottieValueCallback) {
        this.distance.setValueCallback(lottieValueCallback);
    }

    public void setRadiusCallback(LottieValueCallback<Float> lottieValueCallback) {
        this.radius.setValueCallback(lottieValueCallback);
    }
}
