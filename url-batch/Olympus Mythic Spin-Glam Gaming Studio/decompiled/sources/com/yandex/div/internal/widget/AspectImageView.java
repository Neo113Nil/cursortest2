package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AspectImageView.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001?B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0002J\u0010\u0010(\u001a\u00020!2\u0006\u0010'\u001a\u00020\bH\u0014J\u0010\u0010)\u001a\u00020!2\u0006\u0010&\u001a\u00020\bH\u0014J\b\u0010*\u001a\u00020\bH\u0016J\b\u0010+\u001a\u00020%H\u0016J\u0010\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.H\u0014J0\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\bH\u0014J\u0018\u00105\u001a\u00020%2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0014J(\u00106\u001a\u00020%2\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\bH\u0014J\u0012\u0010;\u001a\u00020%2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0018\u0010>\u001a\u00020%2\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\bH\u0002R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0013\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/yandex/div/internal/widget/AspectImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/yandex/div/core/widget/AspectView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "", "aspectRatio", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio$delegate", "Lkotlin/properties/ReadWriteProperty;", "gravity", "getGravity", "()I", "setGravity", "(I)V", "gravity$delegate", "Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "imageScale", "getImageScale", "()Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "setImageScale", "(Lcom/yandex/div/internal/widget/AspectImageView$Scale;)V", "imageScale$delegate", "isMatrixInvalidated", "", "transformMatrix", "Landroid/graphics/Matrix;", "applyAspectRatio", "", "widthMeasureSpec", "heightMeasureSpec", "canResizeHeight", "canResizeWidth", "getBaseline", "invalidate", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "onMeasure", "onSizeChanged", "width", "height", "oldWidth", "oldHeight", "setScaleType", "scaleType", "Landroid/widget/ImageView$ScaleType;", "updateMatrix", "Scale", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class AspectImageView extends AppCompatImageView implements AspectView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(AspectImageView.class, "gravity", "getGravity()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AspectImageView.class, "aspectRatio", "getAspectRatio()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AspectImageView.class, "imageScale", "getImageScale()Lcom/yandex/div/internal/widget/AspectImageView$Scale;", 0))};

    /* renamed from: aspectRatio$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty aspectRatio;

    /* renamed from: gravity$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty gravity;

    /* renamed from: imageScale$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty imageScale;
    private boolean isMatrixInvalidated;

    @NotNull
    private final Matrix transformMatrix;

    /* compiled from: AspectImageView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "", "(Ljava/lang/String;I)V", "NO_SCALE", "FIT", "FILL", "STRETCH", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Scale {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    /* compiled from: AspectImageView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.NO_SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Scale.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Scale.STRETCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AspectImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public AspectImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView
    public void setScaleType(@Nullable ImageView.ScaleType scaleType) {
    }

    public /* synthetic */ AspectImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public AspectImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gravity = ViewsKt.appearanceAffecting$default(0, null, 2, null);
        this.aspectRatio = AspectView.INSTANCE.aspectRatioProperty$div_release();
        this.imageScale = ViewsKt.dimensionAffecting$default(Scale.NO_SCALE, null, 2, null);
        this.transformMatrix = new Matrix();
        this.isMatrixInvalidated = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final int getGravity() {
        return ((Number) this.gravity.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final void setGravity(int i) {
        this.gravity.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    @Override // com.yandex.div.core.widget.AspectView
    public final float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    @Override // com.yandex.div.core.widget.AspectView
    public final void setAspectRatio(float f) {
        this.aspectRatio.setValue(this, $$delegatedProperties[1], Float.valueOf(f));
    }

    @NotNull
    public final Scale getImageScale() {
        return (Scale) this.imageScale.getValue(this, $$delegatedProperties[2]);
    }

    public final void setImageScale(@NotNull Scale scale) {
        this.imageScale.setValue(this, $$delegatedProperties[2], scale);
    }

    @Override // android.widget.ImageView, android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        applyAspectRatio(widthMeasureSpec, heightMeasureSpec);
    }

    private final void applyAspectRatio(int widthMeasureSpec, int heightMeasureSpec) {
        float aspectRatio = getAspectRatio();
        if (aspectRatio == 0.0f) {
            return;
        }
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        boolean canResizeWidth = canResizeWidth(widthMeasureSpec);
        boolean canResizeHeight = canResizeHeight(heightMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!canResizeWidth && !canResizeHeight) {
            measuredHeight = MathKt.roundToInt(measuredWidth / aspectRatio);
        } else if (!canResizeWidth && canResizeHeight) {
            measuredHeight = MathKt.roundToInt(measuredWidth / aspectRatio);
        } else if (canResizeWidth && !canResizeHeight) {
            measuredWidth = MathKt.roundToInt(measuredHeight * aspectRatio);
        } else if (canResizeWidth && canResizeHeight) {
            measuredHeight = MathKt.roundToInt(measuredWidth / aspectRatio);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, mode), View.MeasureSpec.makeMeasureSpec(measuredHeight, mode2));
    }

    protected boolean canResizeWidth(int widthMeasureSpec) {
        return View.MeasureSpec.getMode(widthMeasureSpec) != 1073741824;
    }

    protected boolean canResizeHeight(int heightMeasureSpec) {
        return View.MeasureSpec.getMode(heightMeasureSpec) != 1073741824;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.isMatrixInvalidated = true;
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.isMatrixInvalidated = true;
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        this.isMatrixInvalidated = true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        if ((getImageMatrix() == null || Intrinsics.areEqual(getImageMatrix(), this.transformMatrix)) && this.isMatrixInvalidated && getWidth() > 0 && getHeight() > 0) {
            updateMatrix(getWidth(), getHeight());
            this.isMatrixInvalidated = false;
        }
        super.onDraw(canvas);
    }

    private final void updateMatrix(int width, int height) {
        float f;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float coerceAtLeast = RangesKt.coerceAtLeast((width - getPaddingLeft()) - getPaddingRight(), 0);
        float coerceAtLeast2 = RangesKt.coerceAtLeast((height - getPaddingTop()) - getPaddingBottom(), 0);
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(getGravity(), ViewCompat.getLayoutDirection(this));
        Scale imageScale = getImageScale();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[imageScale.ordinal()];
        if (i == 1) {
            f = 1.0f;
        } else if (i == 2) {
            f = Math.min(coerceAtLeast / intrinsicWidth, coerceAtLeast2 / intrinsicHeight);
        } else if (i == 3) {
            f = Math.max(coerceAtLeast / intrinsicWidth, coerceAtLeast2 / intrinsicHeight);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            f = coerceAtLeast / intrinsicWidth;
        }
        float f2 = iArr[getImageScale().ordinal()] == 4 ? coerceAtLeast2 / intrinsicHeight : f;
        int i2 = absoluteGravity & 7;
        float f3 = 0.0f;
        float f4 = i2 != 1 ? i2 != 5 ? 0.0f : coerceAtLeast - (intrinsicWidth * f) : (coerceAtLeast - (intrinsicWidth * f)) / 2;
        int i3 = absoluteGravity & 112;
        if (i3 == 16) {
            f3 = (coerceAtLeast2 - (intrinsicHeight * f2)) / 2;
        } else if (i3 == 80) {
            f3 = coerceAtLeast2 - (intrinsicHeight * f2);
        }
        Matrix matrix = this.transformMatrix;
        matrix.reset();
        matrix.postScale(f, f2);
        matrix.postTranslate(f4, f3);
        setImageMatrix(this.transformMatrix);
    }
}
