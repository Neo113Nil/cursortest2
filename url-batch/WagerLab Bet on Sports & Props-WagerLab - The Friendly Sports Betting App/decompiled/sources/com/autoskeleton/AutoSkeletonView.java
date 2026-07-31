package com.autoskeleton;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.ReadableArray;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: AutoSkeletonView.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\rJ\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fJ\u0015\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\"J\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fJ\u0010\u0010$\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010%J\b\u0010&\u001a\u00020\u001cH\u0014J\b\u0010'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020\u001cH\u0002J \u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u000fH\u0002J\u0012\u0010-\u001a\u00020\u001c2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/H\u0016J\u0018\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\nH\u0014J\u0010\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u000206H\u0014J0\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\nH\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/autoskeleton/AutoSkeletonView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isLoading", "", "shimmerSpeed", "", "radius", "animationType", "Lcom/autoskeleton/AnimationTypes;", "shapesBackgroundColor", "colorA", "colorB", "paint", "Landroid/graphics/Paint;", "animationFraction", "animator", "Landroid/animation/ValueAnimator;", "setIsLoading", "", "value", "setShimmerSpeed", "setShimmerBackgroundColor", "(Ljava/lang/Integer;)V", "setGradientColors", "Lcom/facebook/react/bridge/ReadableArray;", "setDefaultRadius", "setAnimationType", "", "onDetachedFromWindow", "startShimmer", "stopShimmer", "blendColors", "from", "to", "ratio", "onViewAdded", "child", "Landroid/view/View;", "onViewRemoved", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", CmcdData.STREAM_TYPE_LIVE, "t", "r", "b", "react-native-auto-skeleton_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoSkeletonView extends ViewGroup {
    private float animationFraction;
    private AnimationTypes animationType;
    private ValueAnimator animator;
    private int colorA;
    private int colorB;
    private boolean isLoading;
    private final Paint paint;
    private float radius;
    private int shapesBackgroundColor;
    private float shimmerSpeed;

    /* compiled from: AutoSkeletonView.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimationTypes.values().length];
            try {
                iArr[AnimationTypes.GRADIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimationTypes.PULSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnimationTypes.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    public AutoSkeletonView(Context context) {
        super(context);
        this.shimmerSpeed = 1.0f;
        this.radius = 10.0f;
        this.animationType = AnimationTypes.GRADIENT;
        this.shapesBackgroundColor = Color.parseColor("#DDDDDD");
        this.colorA = Color.parseColor("#DDDDDD");
        this.colorB = Color.parseColor("#F3F3F3");
        this.paint = new Paint(1);
        setWillNotDraw(false);
    }

    public AutoSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.shimmerSpeed = 1.0f;
        this.radius = 10.0f;
        this.animationType = AnimationTypes.GRADIENT;
        this.shapesBackgroundColor = Color.parseColor("#DDDDDD");
        this.colorA = Color.parseColor("#DDDDDD");
        this.colorB = Color.parseColor("#F3F3F3");
        this.paint = new Paint(1);
        setWillNotDraw(false);
    }

    public AutoSkeletonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.shimmerSpeed = 1.0f;
        this.radius = 10.0f;
        this.animationType = AnimationTypes.GRADIENT;
        this.shapesBackgroundColor = Color.parseColor("#DDDDDD");
        this.colorA = Color.parseColor("#DDDDDD");
        this.colorB = Color.parseColor("#F3F3F3");
        this.paint = new Paint(1);
        setWillNotDraw(false);
    }

    public final void setIsLoading(boolean value) {
        if (this.isLoading == value) {
            return;
        }
        this.isLoading = value;
        if (value) {
            startShimmer();
        } else {
            stopShimmer();
        }
        requestLayout();
        invalidate();
    }

    public final void setShimmerSpeed(float value) {
        this.shimmerSpeed = value;
        if (this.isLoading) {
            stopShimmer();
            startShimmer();
        }
    }

    public final void setShimmerBackgroundColor(Integer value) {
        int intValue = value != null ? value.intValue() : -3355444;
        this.shapesBackgroundColor = intValue;
        this.paint.setColor(intValue);
        invalidate();
    }

    public final void setGradientColors(ReadableArray value) {
        if (value != null) {
            this.colorA = value.getInt(0);
            this.colorB = value.getInt(1);
        }
        invalidate();
    }

    public final void setDefaultRadius(float value) {
        this.radius = value;
        invalidate();
    }

    public final void setAnimationType(String value) {
        AnimationTypes animationTypes;
        AnimationTypes[] values = AnimationTypes.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                animationTypes = null;
                break;
            }
            animationTypes = values[i];
            if (StringsKt.equals(animationTypes.getValue(), value, true)) {
                break;
            } else {
                i++;
            }
        }
        if (animationTypes == null) {
            animationTypes = AnimationTypes.GRADIENT;
        }
        this.animationType = animationTypes;
        this.paint.setShader(null);
        this.paint.setAlpha(255);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
    }

    private final void startShimmer() {
        if (this.animator != null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration((long) (this.shimmerSpeed * 1000));
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.autoskeleton.AutoSkeletonView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AutoSkeletonView.startShimmer$lambda$2$lambda$1(AutoSkeletonView.this, valueAnimator);
            }
        });
        ofFloat.start();
        this.animator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startShimmer$lambda$2$lambda$1(AutoSkeletonView autoSkeletonView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        autoSkeletonView.animationFraction = it.getAnimatedFraction();
        int i = WhenMappings.$EnumSwitchMapping$0[autoSkeletonView.animationType.ordinal()];
        if (i == 1) {
            autoSkeletonView.paint.setShader(new LinearGradient(0.0f, 0.0f, autoSkeletonView.getWidth(), 0.0f, new int[]{autoSkeletonView.blendColors(autoSkeletonView.colorA, autoSkeletonView.colorB, autoSkeletonView.animationFraction), autoSkeletonView.blendColors(autoSkeletonView.colorB, autoSkeletonView.colorA, autoSkeletonView.animationFraction), autoSkeletonView.blendColors(autoSkeletonView.colorA, autoSkeletonView.colorB, autoSkeletonView.animationFraction)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        } else if (i == 2) {
            autoSkeletonView.paint.setAlpha(RangesKt.coerceIn((int) (((autoSkeletonView.animationFraction * 0.5f) + 0.5f) * 255), 0, 255));
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        autoSkeletonView.invalidate();
    }

    private final void stopShimmer() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animator = null;
    }

    private final int blendColors(int from, int to, float ratio) {
        float f = 1.0f - ratio;
        return Color.rgb((int) ((Color.red(from) * f) + (Color.red(to) * ratio)), (int) ((Color.green(from) * f) + (Color.green(to) * ratio)), (int) ((Color.blue(from) * f) + (Color.blue(to) * ratio)));
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View child) {
        super.onViewAdded(child);
        requestLayout();
        invalidate();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.onViewRemoved(child);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (!this.isLoading) {
            Fade fade = new Fade();
            fade.setDuration(800L);
            TransitionManager.beginDelayedTransition(this, fade);
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            Object tag = childAt.getTag(R.id.is_my_custom_child_view);
            if (Intrinsics.areEqual((Object) (tag instanceof Boolean ? (Boolean) tag : null), (Object) true)) {
                canvas2 = canvas;
            } else if (this.isLoading) {
                childAt.setVisibility(4);
                float left = childAt.getLeft();
                float top = childAt.getTop();
                float right = childAt.getRight();
                float bottom = childAt.getBottom();
                float f = this.radius;
                float f2 = 2;
                canvas2 = canvas;
                canvas2.drawRoundRect(left, top, right, bottom, f * f2, f * f2, this.paint);
            } else {
                canvas2 = canvas;
                childAt.setVisibility(0);
            }
            i++;
            canvas = canvas2;
        }
    }
}
