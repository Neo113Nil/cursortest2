package io.bidmachine.util.gradient;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.compose.ui.graphics.BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline0;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.X3;
import com.ironsource.mediationsdk.j;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GradientDrawable.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u0089\u00012\u00020\u0001:\f\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0012\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0014H\u0002J\b\u0010*\u001a\u00020\fH\u0016J\b\u0010+\u001a\u00020\fH\u0016J\b\u0010,\u001a\u0004\u0018\u00010-J\n\u0010.\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010/\u001a\u0004\u0018\u00010\u0006J\n\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u0004\u0018\u000103J\u0006\u00104\u001a\u00020\u0016J\u0006\u00105\u001a\u00020\u0016J\u0006\u00106\u001a\u00020\u0016J\u0006\u00107\u001a\u00020\u0016J\u0006\u00108\u001a\u00020\fJ\u0006\u00109\u001a\u00020\fJ\u0006\u0010:\u001a\u00020\u0016J\b\u0010;\u001a\u00020\fH\u0016J\b\u0010<\u001a\u00020\fH\u0016J\b\u0010=\u001a\u00020\fH\u0017J\u0006\u0010>\u001a\u00020\u0004J\u0010\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010C\u001a\u00020\fJ\r\u0010D\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010EJ\r\u0010F\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010EJ\u0006\u0010G\u001a\u00020\fJ\u0006\u0010H\u001a\u00020\u0016J\b\u0010I\u001a\u00020\u0014H\u0002J\b\u0010J\u001a\u00020\u0014H\u0016J\u0010\u0010K\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010L\u001a\u00020\u0001H\u0016J\u0010\u0010M\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u0019H\u0014J\u0010\u0010N\u001a\u00020\u00142\u0006\u0010O\u001a\u00020\fH\u0014J\u0010\u0010P\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020\u0006H\u0014J\u0010\u0010R\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010S\u001a\u00020$2\u0006\u0010T\u001a\u00020\u0014J\u0010\u0010U\u001a\u00020$2\b\u0010V\u001a\u0004\u0018\u00010-J\u0010\u0010U\u001a\u00020$2\b\b\u0001\u0010W\u001a\u00020\fJ\u0012\u0010X\u001a\u00020$2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001e\u0010Y\u001a\u00020$2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010Z\u001a\u0004\u0018\u000103J\u0010\u0010[\u001a\u00020$2\b\u0010\\\u001a\u0004\u0018\u000103J\u000e\u0010]\u001a\u00020$2\u0006\u0010^\u001a\u00020\u0016J\u0010\u0010_\u001a\u00020$2\u0006\u0010`\u001a\u00020\u0014H\u0017J\u0016\u0010a\u001a\u00020$2\u0006\u0010b\u001a\u00020\u00162\u0006\u0010c\u001a\u00020\u0016J\u001a\u0010d\u001a\u00020$2\b\b\u0002\u0010e\u001a\u00020\u00162\b\b\u0002\u0010f\u001a\u00020\fJ\u000e\u0010g\u001a\u00020$2\u0006\u0010h\u001a\u00020\fJ\u000e\u0010i\u001a\u00020$2\u0006\u0010j\u001a\u00020\fJ\u0010\u0010k\u001a\u00020$2\b\b\u0001\u0010l\u001a\u00020\u0016J\u000e\u0010m\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u0004J&\u0010n\u001a\u00020$2\u0006\u0010o\u001a\u00020\f2\u0006\u0010p\u001a\u00020\f2\u0006\u0010q\u001a\u00020\f2\u0006\u0010r\u001a\u00020\fJ\u000e\u0010s\u001a\u00020$2\u0006\u0010t\u001a\u00020\fJ\u0016\u0010u\u001a\u00020$2\u0006\u0010v\u001a\u00020\f2\u0006\u0010w\u001a\u00020\fJ,\u0010x\u001a\u00020$2\u0006\u0010v\u001a\u00020\f2\b\u0010V\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010y\u001a\u00020\u00162\b\b\u0002\u0010z\u001a\u00020\u0016J,\u0010x\u001a\u00020$2\u0006\u0010v\u001a\u00020\f2\b\b\u0001\u0010{\u001a\u00020\f2\b\b\u0002\u0010y\u001a\u00020\u00162\b\b\u0002\u0010z\u001a\u00020\u0016J(\u0010|\u001a\u00020$2\u0006\u0010v\u001a\u00020\f2\u0006\u0010{\u001a\u00020\f2\u0006\u0010y\u001a\u00020\u00162\u0006\u0010z\u001a\u00020\u0016H\u0002J\u000e\u0010}\u001a\u00020$2\u0006\u0010~\u001a\u00020\fJ\u0011\u0010\u007f\u001a\u00020$2\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u0016J\u0015\u0010\u0081\u0001\u001a\u00020$2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001H\u0016J\u0014\u0010\u0084\u0001\u001a\u00020$2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010-H\u0016J-\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000e2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u000e2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010-2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001H\u0002J\t\u0010\u0088\u0001\u001a\u00020$H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u008f\u0001"}, d2 = {"Lio/bidmachine/util/gradient/GradientDrawable;", "Landroid/graphics/drawable/Drawable;", "()V", X3.i.n, "Lio/bidmachine/util/gradient/GradientDrawable$Orientation;", "colors", "", "(Lio/bidmachine/util/gradient/GradientDrawable$Orientation;[I)V", "gradientState", "Lio/bidmachine/util/gradient/GradientDrawable$GradientState;", "(Lio/bidmachine/util/gradient/GradientDrawable$GradientState;)V", "alpha", "", "blendModeColorFilter", "Landroid/graphics/BlendModeColorFilter;", "colorFilter", "Landroid/graphics/ColorFilter;", "fillPaint", "Landroid/graphics/Paint;", "gradientIsDirty", "", "gradientRadiusPx", "", "layerPaint", VastAttributes.PADDING, "Landroid/graphics/Rect;", "path", "Landroid/graphics/Path;", "pathIsDirty", "rect", "Landroid/graphics/RectF;", "ringPath", "shaderHolder", "Lio/bidmachine/util/gradient/ShaderHolder;", "strokePaint", "buildPathIfDirty", "", "buildRing", "draw", "canvas", "Landroid/graphics/Canvas;", "ensureValidRect", "getAlpha", "getChangingConfigurations", "getColor", "Landroid/content/res/ColorStateList;", "getColorFilter", "getColors", "getConstantState", "Landroid/graphics/drawable/Drawable$ConstantState;", "getCornerRadii", "", "getCornerRadius", "getGradientCenterX", "getGradientCenterY", "getGradientRadius", "getGradientType", "getInnerRadiusPx", "getInnerRadiusRatio", "getIntrinsicHeight", "getIntrinsicWidth", "getOpacity", "getOrientation", "getOutline", "outline", "Landroid/graphics/Outline;", "getPadding", "getShape", "getStrokeColor", "()Ljava/lang/Integer;", "getStrokeWidthPx", "getThicknessPx", "getThicknessRatio", "isOpaqueForState", "isStateful", "modulateAlpha", "mutate", "onBoundsChange", "onLevelChange", AppLovinEventTypes.USER_COMPLETED_LEVEL, "onStateChange", "stateSet", "setAlpha", "setAntiAlias", "isAntiAlias", "setColor", "colorStateList", "argb", "setColorFilter", "setColors", "offsets", "setCornerRadii", "radii", "setCornerRadius", "radiusPx", "setDither", "dither", "setGradientCenter", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "setGradientRadius", "gradientRadius", "radiusType", "setGradientType", "gradient", "setInnerRadius", "innerRadiusPx", "setInnerRadiusRatio", "innerRadiusRatio", "setOrientation", "setPadding", "leftPx", "topPx", "rightPx", "bottomPx", "setShape", "shape", "setSize", "widthPx", "heightPx", "setStroke", "dashWidthPx", "dashGapPx", "color", "setStrokeInternal", "setThickness", "thicknessPx", "setThicknessRatio", "thicknessRatio", "setTintBlendMode", "blendMode", "Landroid/graphics/BlendMode;", "setTintList", "tint", "updateBlendModeFilter", "blendFilter", "updateLocalState", "Companion", "GradientState", "GradientType", "Orientation", "RadiusType", "Shape", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GradientDrawable extends Drawable {
    private static final float DEFAULT_GRADIENT_RADIUS = 0.5f;
    private static final int DEFAULT_GRADIENT_RADIUS_TYPE = 0;
    private static final float DEFAULT_INNER_RADIUS_RATIO = 3.0f;
    private static final float DEFAULT_THICKNESS_RATIO = 9.0f;
    private int alpha;

    @Nullable
    private BlendModeColorFilter blendModeColorFilter;

    @Nullable
    private ColorFilter colorFilter;

    @NotNull
    private final Paint fillPaint;
    private boolean gradientIsDirty;
    private float gradientRadiusPx;

    @NotNull
    private GradientState gradientState;

    @Nullable
    private Paint layerPaint;

    @Nullable
    private Rect padding;

    @NotNull
    private final Path path;
    private boolean pathIsDirty;

    @NotNull
    private final RectF rect;

    @Nullable
    private Path ringPath;

    @Nullable
    private ShaderHolder shaderHolder;

    @Nullable
    private Paint strokePaint;

    @NotNull
    private static final Orientation DEFAULT_ORIENTATION = Orientation.TOP_BOTTOM;

    /* compiled from: GradientDrawable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/bidmachine/util/gradient/GradientDrawable$Orientation;", "", "(Ljava/lang/String;I)V", "TOP_BOTTOM", "TR_BL", "RIGHT_LEFT", "BR_TL", "BOTTOM_TOP", "BL_TR", "LEFT_RIGHT", "TL_BR", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Orientation {
        TOP_BOTTOM,
        TR_BL,
        RIGHT_LEFT,
        BR_TL,
        BOTTOM_TOP,
        BL_TR,
        LEFT_RIGHT,
        TL_BR
    }

    /* compiled from: GradientDrawable.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Orientation.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Orientation.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Orientation.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Orientation.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Orientation.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ GradientDrawable(GradientState gradientState, DefaultConstructorMarker defaultConstructorMarker) {
        this(gradientState);
    }

    public GradientDrawable() {
        this(new GradientState(DEFAULT_ORIENTATION, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientDrawable(@NotNull Orientation orientation, @ColorInt @Nullable int[] iArr) {
        this(new GradientState(orientation, iArr));
        Intrinsics.checkNotNullParameter(orientation, "orientation");
    }

    private GradientDrawable(GradientState gradientState) {
        this.path = new Path();
        this.rect = new RectF();
        this.fillPaint = new Paint(1);
        this.alpha = 255;
        this.pathIsDirty = true;
        this.gradientState = gradientState;
        updateLocalState();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NotNull Rect padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        Rect rect = this.padding;
        if (rect != null) {
            padding.set(rect);
            return true;
        }
        return super.getPadding(padding);
    }

    public final void setCornerRadii(@Nullable float[] radii) {
        this.gradientState.setCornerRadiiInternal(radii);
        this.pathIsDirty = true;
        invalidateSelf();
    }

    @Nullable
    public final float[] getCornerRadii() {
        float[] radiusPxArray = this.gradientState.getRadiusPxArray();
        if (radiusPxArray != null) {
            return (float[]) radiusPxArray.clone();
        }
        return null;
    }

    public final void setCornerRadius(float radiusPx) {
        this.gradientState.setCornerRadiusInternal(radiusPx);
        this.pathIsDirty = true;
        invalidateSelf();
    }

    public final float getCornerRadius() {
        return this.gradientState.getRadiusPx();
    }

    @Nullable
    public final Integer getStrokeWidthPx() {
        Paint paint = this.strokePaint;
        if (paint != null) {
            return Integer.valueOf((int) paint.getStrokeWidth());
        }
        return null;
    }

    @Nullable
    public final Integer getStrokeColor() {
        Paint paint = this.strokePaint;
        if (paint != null) {
            return Integer.valueOf(paint.getColor());
        }
        return null;
    }

    public static /* synthetic */ void setStroke$default(GradientDrawable gradientDrawable, int i, int i2, float f, float f2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            f = 0.0f;
        }
        if ((i3 & 8) != 0) {
            f2 = 0.0f;
        }
        gradientDrawable.setStroke(i, i2, f, f2);
    }

    public final void setStroke(int widthPx, @ColorInt int color, float dashWidthPx, float dashGapPx) {
        this.gradientState.setStrokeInternal(widthPx, ColorStateList.valueOf(color), dashWidthPx, dashGapPx);
        setStrokeInternal(widthPx, color, dashWidthPx, dashGapPx);
    }

    public static /* synthetic */ void setStroke$default(GradientDrawable gradientDrawable, int i, ColorStateList colorStateList, float f, float f2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f2 = 0.0f;
        }
        gradientDrawable.setStroke(i, colorStateList, f, f2);
    }

    public final void setStroke(int widthPx, @Nullable ColorStateList colorStateList, float dashWidthPx, float dashGapPx) {
        this.gradientState.setStrokeInternal(widthPx, colorStateList, dashWidthPx, dashGapPx);
        setStrokeInternal(widthPx, colorStateList != null ? colorStateList.getColorForState(getState(), 0) : 0, dashWidthPx, dashGapPx);
    }

    private final void setStrokeInternal(int widthPx, int color, float dashWidthPx, float dashGapPx) {
        Paint paint = this.strokePaint;
        if (paint == null) {
            paint = new Paint(1);
            this.strokePaint = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        paint.setStrokeWidth(widthPx);
        paint.setColor(color);
        paint.setPathEffect(dashWidthPx > 0.0f ? new DashPathEffect(new float[]{dashWidthPx, dashGapPx}, 0.0f) : null);
        this.gradientIsDirty = true;
        invalidateSelf();
    }

    public final void setSize(int widthPx, int heightPx) {
        this.gradientState.setSizeInternal(widthPx, heightPx);
        this.pathIsDirty = true;
        invalidateSelf();
    }

    public final void setShape(int shape) {
        this.ringPath = null;
        this.pathIsDirty = true;
        this.gradientState.setShapeInternal(shape);
        invalidateSelf();
    }

    public final int getShape() {
        return this.gradientState.getShape();
    }

    public final void setGradientType(int gradient) {
        this.gradientState.setGradientTypeInternal(gradient);
        this.gradientIsDirty = true;
        invalidateSelf();
    }

    public final int getGradientType() {
        return this.gradientState.getGradientType();
    }

    public final void setGradientCenter(float x, float y) {
        this.gradientState.setGradientCenterInternal(x, y);
        this.gradientIsDirty = true;
        invalidateSelf();
    }

    public final float getGradientCenterX() {
        return this.gradientState.getCenterX();
    }

    public final float getGradientCenterY() {
        return this.gradientState.getCenterY();
    }

    public static /* synthetic */ void setGradientRadius$default(GradientDrawable gradientDrawable, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = 0.5f;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        gradientDrawable.setGradientRadius(f, i);
    }

    public final void setGradientRadius(float gradientRadius, int radiusType) {
        this.gradientState.setGradientRadiusInternal(gradientRadius, radiusType);
        this.gradientIsDirty = true;
        invalidateSelf();
    }

    public final float getGradientRadius() {
        if (this.gradientState.getGradientType() != 1) {
            return 0.0f;
        }
        ensureValidRect();
        return this.gradientRadiusPx;
    }

    private final int modulateAlpha(int alpha) {
        int i = this.alpha;
        return (alpha * (i + (i >> 7))) >> 8;
    }

    @NotNull
    public final Orientation getOrientation() {
        return this.gradientState.getOrientation();
    }

    public final void setOrientation(@NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.gradientState.setOrientation(orientation);
        this.gradientIsDirty = true;
        invalidateSelf();
    }

    public static /* synthetic */ void setColors$default(GradientDrawable gradientDrawable, int[] iArr, float[] fArr, int i, Object obj) {
        if ((i & 2) != 0) {
            fArr = null;
        }
        gradientDrawable.setColors(iArr, fArr);
    }

    public final void setColors(@ColorInt @Nullable int[] colors, @Nullable float[] offsets) {
        this.gradientState.setGradientColorsInternal(colors);
        this.gradientState.setPositions(offsets);
        this.gradientIsDirty = true;
        invalidateSelf();
    }

    @Nullable
    public final int[] getColors() {
        return this.gradientState.getColors();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        int i;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (ensureValidRect()) {
            Paint paint9 = this.fillPaint;
            ShaderHolder shaderHolder = this.shaderHolder;
            paint9.setShader(shaderHolder != null ? shaderHolder.getShader(canvas.isHardwareAccelerated()) : null);
            int alpha = this.fillPaint.getAlpha();
            Paint paint10 = this.strokePaint;
            int alpha2 = paint10 != null ? paint10.getAlpha() : 0;
            int modulateAlpha = modulateAlpha(alpha);
            int modulateAlpha2 = modulateAlpha(alpha2);
            Paint paint11 = this.strokePaint;
            float strokeWidth = paint11 != null ? paint11.getStrokeWidth() : 0.0f;
            boolean z = modulateAlpha2 > 0 && strokeWidth > 0.0f;
            boolean z2 = modulateAlpha > 0;
            GradientState gradientState = this.gradientState;
            ColorFilter colorFilter = this.colorFilter;
            if (colorFilter == null) {
                colorFilter = this.blendModeColorFilter;
            }
            ColorFilter colorFilter2 = colorFilter;
            boolean z3 = z && z2 && gradientState.getShape() != 2 && modulateAlpha2 < 255 && (this.alpha < 255 || colorFilter2 != null);
            if (z3) {
                Paint paint12 = this.layerPaint;
                if (paint12 == null) {
                    paint12 = new Paint();
                    this.layerPaint = paint12;
                }
                Paint paint13 = paint12;
                paint13.setDither(gradientState.getDither());
                paint13.setAlpha(this.alpha);
                paint13.setColorFilter(colorFilter2);
                RectF rectF = this.rect;
                i = 2;
                canvas.saveLayer(rectF.left - strokeWidth, rectF.top - strokeWidth, rectF.right + strokeWidth, rectF.bottom + strokeWidth, paint13);
                this.fillPaint.setColorFilter(null);
                Paint paint14 = this.strokePaint;
                if (paint14 != null) {
                    paint14.setColorFilter(null);
                }
            } else {
                i = 2;
                this.fillPaint.setAlpha(modulateAlpha);
                this.fillPaint.setDither(gradientState.getDither());
                this.fillPaint.setColorFilter(colorFilter2);
                if (colorFilter2 != null && gradientState.getSolidColors() == null) {
                    this.fillPaint.setColor(this.alpha << 24);
                }
                if (z && (paint = this.strokePaint) != null) {
                    paint.setAlpha(modulateAlpha2);
                    paint.setDither(gradientState.getDither());
                    paint.setColorFilter(colorFilter2);
                }
            }
            int shape = gradientState.getShape();
            if (shape != 0) {
                if (shape == 1) {
                    canvas.drawOval(this.rect, this.fillPaint);
                    if (z && (paint6 = this.strokePaint) != null) {
                        canvas.drawOval(this.rect, paint6);
                    }
                } else if (shape == i) {
                    RectF rectF2 = this.rect;
                    float centerY = rectF2.centerY();
                    if (z && (paint7 = this.strokePaint) != null) {
                        canvas.drawLine(rectF2.left, centerY, rectF2.right, centerY, paint7);
                    }
                } else if (shape == 3) {
                    Path buildRing = buildRing(gradientState);
                    canvas.drawPath(buildRing, this.fillPaint);
                    if (z && (paint8 = this.strokePaint) != null) {
                        canvas.drawPath(buildRing, paint8);
                    }
                }
            } else if (gradientState.getRadiusPxArray() != null) {
                buildPathIfDirty();
                canvas.drawPath(this.path, this.fillPaint);
                if (z && (paint4 = this.strokePaint) != null) {
                    canvas.drawPath(this.path, paint4);
                }
            } else if (gradientState.getRadiusPx() > 0.0f) {
                float min = (float) Math.min(gradientState.getRadiusPx(), Math.min(this.rect.width(), this.rect.height()) * 0.5f);
                canvas.drawRoundRect(this.rect, min, min, this.fillPaint);
                if (z && (paint3 = this.strokePaint) != null) {
                    canvas.drawRoundRect(this.rect, min, min, paint3);
                }
            } else {
                if (this.fillPaint.getColor() != 0 || colorFilter2 != null || this.fillPaint.getShader() != null) {
                    canvas.drawRect(this.rect, this.fillPaint);
                }
                if (z && (paint2 = this.strokePaint) != null) {
                    canvas.drawRect(this.rect, paint2);
                }
            }
            if (z3) {
                canvas.restore();
                return;
            }
            this.fillPaint.setAlpha(alpha);
            if (!z || (paint5 = this.strokePaint) == null) {
                return;
            }
            paint5.setAlpha(alpha2);
        }
    }

    public final void setAntiAlias(boolean isAntiAlias) {
        this.fillPaint.setAntiAlias(isAntiAlias);
    }

    private final void buildPathIfDirty() {
        GradientState gradientState = this.gradientState;
        if (this.pathIsDirty) {
            ensureValidRect();
            this.path.reset();
            float[] radiusPxArray = gradientState.getRadiusPxArray();
            if (radiusPxArray != null) {
                this.path.addRoundRect(this.rect, radiusPxArray, Path.Direction.CW);
            }
            this.pathIsDirty = false;
        }
    }

    public final void setInnerRadiusRatio(@FloatRange float innerRadiusRatio) {
        if (innerRadiusRatio <= 0.0f) {
            throw new IllegalArgumentException("Ratio must be greater than zero");
        }
        this.gradientState.setInnerRadiusRatio(innerRadiusRatio);
        this.pathIsDirty = true;
        invalidateSelf();
    }

    public final float getInnerRadiusRatio() {
        return this.gradientState.getInnerRadiusRatio();
    }

    public final void setInnerRadius(int innerRadiusPx) {
        this.gradientState.setInnerRadiusPx(innerRadiusPx);
        this.pathIsDirty = true;
        invalidateSelf();
    }

    public final int getInnerRadiusPx() {
        return this.gradientState.getInnerRadiusPx();
    }

    public final void setThicknessRatio(@FloatRange float thicknessRatio) {
        if (thicknessRatio <= 0.0f) {
            throw new IllegalArgumentException("Ratio must be greater than zero");
        }
        this.gradientState.setThicknessRatio(thicknessRatio);
        this.pathIsDirty = true;
        invalidateSelf();
    }

    public final float getThicknessRatio() {
        return this.gradientState.getThicknessRatio();
    }

    public final void setThickness(int thicknessPx) {
        this.gradientState.setThicknessPx(thicknessPx);
        this.pathIsDirty = true;
        invalidateSelf();
    }

    public final int getThicknessPx() {
        return this.gradientState.getThicknessPx();
    }

    public final void setPadding(int leftPx, int topPx, int rightPx, int bottomPx) {
        Rect padding = this.gradientState.getPadding();
        if (padding == null) {
            padding = new Rect();
            this.gradientState.setPadding(padding);
        }
        padding.set(leftPx, topPx, rightPx, bottomPx);
        this.padding = padding;
        invalidateSelf();
    }

    private final Path buildRing(GradientState gradientState) {
        float width;
        float width2;
        Path path = this.ringPath;
        if (path != null && !this.pathIsDirty) {
            return path;
        }
        this.pathIsDirty = false;
        float level = (getLevel() * 360.0f) / 10000.0f;
        RectF rectF = new RectF(this.rect);
        float width3 = rectF.width() / 2.0f;
        float height = rectF.height() / 2.0f;
        if (gradientState.getThicknessPx() != -1) {
            width = gradientState.getThicknessPx();
        } else {
            width = rectF.width() / gradientState.getThicknessRatio();
        }
        if (gradientState.getInnerRadiusPx() != -1) {
            width2 = gradientState.getInnerRadiusPx();
        } else {
            width2 = rectF.width() / gradientState.getInnerRadiusRatio();
        }
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(width3 - width2, height - width2);
        RectF rectF3 = new RectF(rectF2);
        float f = -width;
        rectF3.inset(f, f);
        Path path2 = this.ringPath;
        if (path2 != null) {
            path2.reset();
        } else {
            path2 = new Path();
            this.ringPath = path2;
        }
        if (level < 360.0f && level > -360.0f) {
            path2.setFillType(Path.FillType.EVEN_ODD);
            float f2 = width3 + width2;
            path2.moveTo(f2, height);
            path2.lineTo(f2 + width, height);
            path2.arcTo(rectF3, 0.0f, level, false);
            path2.arcTo(rectF2, level, -level, false);
            path2.close();
        } else {
            path2.addOval(rectF3, Path.Direction.CW);
            path2.addOval(rectF2, Path.Direction.CCW);
        }
        path2.addOval(rectF3, Path.Direction.CW);
        path2.addOval(rectF2, Path.Direction.CCW);
        return path2;
    }

    public final void setColor(@ColorInt int argb) {
        this.gradientState.setSolidColorsInternal(ColorStateList.valueOf(argb));
        this.fillPaint.setColor(argb);
        invalidateSelf();
    }

    public final void setColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.gradientState.setSolidColorsInternal(colorStateList);
            this.fillPaint.setColor(colorStateList.getColorForState(getState(), 0));
            invalidateSelf();
            return;
        }
        setColor(0);
    }

    @Nullable
    public final ColorStateList getColor() {
        return this.gradientState.getSolidColors();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@NotNull int[] stateSet) {
        boolean z;
        ColorStateList strokeColors;
        int colorForState;
        int colorForState2;
        Intrinsics.checkNotNullParameter(stateSet, "stateSet");
        GradientState gradientState = this.gradientState;
        ColorStateList solidColors = gradientState.getSolidColors();
        if (solidColors == null || this.fillPaint.getColor() == (colorForState2 = solidColors.getColorForState(stateSet, 0))) {
            z = false;
        } else {
            this.fillPaint.setColor(colorForState2);
            z = true;
        }
        Paint paint = this.strokePaint;
        if (paint != null && (strokeColors = gradientState.getStrokeColors()) != null && paint.getColor() != (colorForState = strokeColors.getColorForState(stateSet, 0))) {
            paint.setColor(colorForState);
            z = true;
        }
        if (gradientState.getTint() != null && gradientState.getBlendMode() != null) {
            this.blendModeColorFilter = updateBlendModeFilter(this.blendModeColorFilter, gradientState.getTint(), gradientState.getBlendMode());
            z = true;
        }
        if (!z) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        GradientState gradientState = this.gradientState;
        if (super.isStateful()) {
            return true;
        }
        ColorStateList solidColors = gradientState.getSolidColors();
        if (solidColors != null && solidColors.isStateful()) {
            return true;
        }
        ColorStateList strokeColors = gradientState.getStrokeColors();
        if (strokeColors != null && strokeColors.isStateful()) {
            return true;
        }
        ColorStateList tint = gradientState.getTint();
        return tint != null && tint.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.gradientState.getChangingConfigurationsParam();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        if (this.alpha != alpha) {
            this.alpha = alpha;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.colorFilter != colorFilter) {
            this.colorFilter = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList tint) {
        this.gradientState.setTint(tint);
        this.blendModeColorFilter = updateBlendModeFilter(this.blendModeColorFilter, tint, this.gradientState.getBlendMode());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(@Nullable BlendMode blendMode) {
        this.gradientState.setBlendMode(blendMode);
        this.blendModeColorFilter = updateBlendModeFilter(this.blendModeColorFilter, this.gradientState.getTint(), blendMode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        super.onBoundsChange(rect);
        this.ringPath = null;
        this.pathIsDirty = true;
        this.gradientIsDirty = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int level) {
        super.onLevelChange(level);
        this.gradientIsDirty = true;
        this.pathIsDirty = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean dither) {
        if (this.gradientState.getDither() != dither) {
            this.gradientState.setDither(dither);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public int getOpacity() {
        return (this.alpha == 255 && this.gradientState.getOpaqueOverBounds() && isOpaqueForState()) ? -1 : -3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0054. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean ensureValidRect() {
        double min;
        float width;
        float height;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (this.gradientIsDirty) {
            this.gradientIsDirty = false;
            Paint paint = this.strokePaint;
            Intrinsics.checkNotNullExpressionValue(getBounds(), "getBounds()");
            float strokeWidth = paint != null ? paint.getStrokeWidth() * 0.5f : 0.0f;
            GradientState gradientState = this.gradientState;
            this.rect.set(r3.left + strokeWidth, r3.top + strokeWidth, r3.right - strokeWidth, r3.bottom - strokeWidth);
            int[] colors = gradientState.getColors();
            if (colors != null) {
                RectF rectF = this.rect;
                if (gradientState.getGradientType() == 0) {
                    switch (WhenMappings.$EnumSwitchMapping$0[gradientState.getOrientation().ordinal()]) {
                        case 1:
                            f = rectF.left;
                            f2 = rectF.top;
                            f3 = rectF.bottom;
                            f11 = f;
                            f12 = f11;
                            f13 = f2;
                            f14 = f3 * 1.0f;
                            break;
                        case 2:
                            f4 = rectF.right;
                            f5 = rectF.top;
                            f6 = rectF.left * 1.0f;
                            f7 = rectF.bottom;
                            f11 = f4;
                            f13 = f5;
                            f12 = f6;
                            f14 = f7 * 1.0f;
                            break;
                        case 3:
                            f8 = rectF.right;
                            f9 = rectF.top;
                            f10 = rectF.left;
                            f11 = f8;
                            f13 = f9;
                            f14 = f13;
                            f12 = f10 * 1.0f;
                            break;
                        case 4:
                            f4 = rectF.right;
                            f5 = rectF.bottom;
                            f6 = rectF.left * 1.0f;
                            f7 = rectF.top;
                            f11 = f4;
                            f13 = f5;
                            f12 = f6;
                            f14 = f7 * 1.0f;
                            break;
                        case 5:
                            f = rectF.left;
                            f2 = rectF.bottom;
                            f3 = rectF.top;
                            f11 = f;
                            f12 = f11;
                            f13 = f2;
                            f14 = f3 * 1.0f;
                            break;
                        case 6:
                            f4 = rectF.left;
                            f5 = rectF.bottom;
                            f6 = rectF.right * 1.0f;
                            f7 = rectF.top;
                            f11 = f4;
                            f13 = f5;
                            f12 = f6;
                            f14 = f7 * 1.0f;
                            break;
                        case 7:
                            f8 = rectF.left;
                            f9 = rectF.top;
                            f10 = rectF.right;
                            f11 = f8;
                            f13 = f9;
                            f14 = f13;
                            f12 = f10 * 1.0f;
                            break;
                        default:
                            f4 = rectF.left;
                            f5 = rectF.top;
                            f6 = rectF.right * 1.0f;
                            f7 = rectF.bottom;
                            f11 = f4;
                            f13 = f5;
                            f12 = f6;
                            f14 = f7 * 1.0f;
                            break;
                    }
                    this.shaderHolder = new DefaultShaderHolder(new LinearGradient(f11, f13, f12, f14, colors, gradientState.getPositions(), Shader.TileMode.CLAMP));
                } else if (gradientState.getGradientType() == 1) {
                    float f15 = rectF.left;
                    float centerX = f15 + ((rectF.right - f15) * gradientState.getCenterX());
                    float f16 = rectF.top;
                    float centerY = f16 + ((rectF.bottom - f16) * gradientState.getCenterY());
                    float gradientRadius = gradientState.getGradientRadius();
                    if (gradientState.getGradientRadiusType() == 1) {
                        if (gradientState.getWidthPx() >= 0) {
                            width = gradientState.getWidthPx();
                        } else {
                            width = rectF.width();
                        }
                        if (gradientState.getHeightPx() >= 0) {
                            height = gradientState.getHeightPx();
                        } else {
                            height = rectF.height();
                        }
                        min = Math.min(width, height);
                    } else {
                        if (gradientState.getGradientRadiusType() == 2) {
                            min = Math.min(rectF.width(), rectF.height());
                        }
                        this.gradientRadiusPx = gradientRadius;
                        this.shaderHolder = new DefaultShaderHolder(new RadialGradient(centerX, centerY, gradientRadius > 0.0f ? 0.001f : gradientRadius, colors, (float[]) null, Shader.TileMode.CLAMP));
                    }
                    gradientRadius *= (float) min;
                    this.gradientRadiusPx = gradientRadius;
                    this.shaderHolder = new DefaultShaderHolder(new RadialGradient(centerX, centerY, gradientRadius > 0.0f ? 0.001f : gradientRadius, colors, (float[]) null, Shader.TileMode.CLAMP));
                } else if (gradientState.getGradientType() == 2) {
                    float f17 = rectF.left;
                    float centerX2 = f17 + ((rectF.right - f17) * gradientState.getCenterX());
                    float f18 = rectF.top;
                    this.shaderHolder = new DefaultShaderHolder(new SweepGradient(centerX2, f18 + ((rectF.bottom - f18) * gradientState.getCenterY()), colors, (float[]) null));
                } else if (gradientState.getGradientType() == 3 && colors.length >= 4) {
                    this.shaderHolder = new BilinearGradientHolder(rectF, colors, null, false, 12, null);
                }
                if (gradientState.getSolidColors() == null) {
                    this.fillPaint.setColor(-16777216);
                }
            }
        }
        return !this.rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.gradientState.getWidthPx();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.gradientState.getHeightPx();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        GradientState gradientState = this.gradientState;
        gradientState.setChangingConfigurationsParam(getChangingConfigurations());
        return gradientState;
    }

    private final boolean isOpaqueForState() {
        Paint paint = this.strokePaint;
        if (this.gradientState.getStrokeWidthPx() < 0 || paint == null || GradientDrawableKt.isOpaque(paint.getColor())) {
            return this.gradientState.getGradientColors() != null || GradientDrawableKt.isOpaque(this.fillPaint.getColor());
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NotNull Outline outline) {
        Intrinsics.checkNotNullParameter(outline, "outline");
        GradientState gradientState = this.gradientState;
        Paint paint = this.strokePaint;
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds()");
        outline.setAlpha((gradientState.getOpaqueOverShape() && (this.gradientState.getStrokeWidthPx() <= 0 || paint == null || paint.getAlpha() == this.fillPaint.getAlpha())) ? modulateAlpha(this.fillPaint.getAlpha()) / 255.0f : 0.0f);
        int shape = gradientState.getShape();
        if (shape != 0) {
            if (shape == 1) {
                outline.setOval(bounds);
                return;
            } else {
                if (shape != 2) {
                    return;
                }
                float strokeWidth = paint != null ? paint.getStrokeWidth() * 0.5f : 1.0E-4f;
                float centerY = bounds.centerY();
                outline.setRect(bounds.left, (int) Math.floor(centerY - strokeWidth), bounds.right, (int) Math.ceil(centerY + strokeWidth));
                return;
            }
        }
        float[] radiusPxArray = gradientState.getRadiusPxArray();
        if (radiusPxArray != null) {
            buildPathIfDirty();
            if (Build.VERSION.SDK_INT >= 30) {
                outline.setPath(this.path);
                return;
            } else {
                outline.setRoundRect(bounds, ArraysKt.sum(radiusPxArray));
                return;
            }
        }
        outline.setRoundRect(bounds, gradientState.getRadiusPx() > 0.0f ? (float) Math.min(gradientState.getRadiusPx(), Math.min(bounds.width(), bounds.height()) * 0.5f) : 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    @NotNull
    public Drawable mutate() {
        if (super.mutate() == this) {
            this.gradientState = new GradientState(this.gradientState);
            updateLocalState();
        }
        return this;
    }

    private final void updateLocalState() {
        GradientState gradientState = this.gradientState;
        ColorStateList solidColors = gradientState.getSolidColors();
        if (solidColors != null) {
            this.fillPaint.setColor(solidColors.getColorForState(getState(), 0));
        } else if (gradientState.getGradientColors() == null) {
            this.fillPaint.setColor(0);
        } else {
            this.fillPaint.setColor(-16777216);
        }
        this.padding = gradientState.getPadding();
        int strokeWidthPx = gradientState.getStrokeWidthPx();
        if (strokeWidthPx >= 0) {
            Paint paint = this.strokePaint;
            if (paint == null) {
                paint = new Paint(1);
                this.strokePaint = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(strokeWidthPx);
            }
            ColorStateList strokeColors = gradientState.getStrokeColors();
            if (strokeColors != null) {
                paint.setColor(strokeColors.getColorForState(getState(), 0));
            }
            float strokeDashWidthPx = gradientState.getStrokeDashWidthPx();
            if (strokeDashWidthPx != 0.0f) {
                paint.setPathEffect(new DashPathEffect(new float[]{strokeDashWidthPx, gradientState.getStrokeDashGapPx()}, 0.0f));
            }
        }
        this.blendModeColorFilter = updateBlendModeFilter(this.blendModeColorFilter, gradientState.getTint(), gradientState.getBlendMode());
        this.gradientIsDirty = true;
        gradientState.computeOpacity();
    }

    private final BlendModeColorFilter updateBlendModeFilter(BlendModeColorFilter blendFilter, ColorStateList tint, BlendMode blendMode) {
        int color;
        BlendMode mode;
        if (tint == null || blendMode == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return blendFilter;
        }
        int colorForState = tint.getColorForState(getState(), 0);
        if (blendFilter != null) {
            color = blendFilter.getColor();
            if (color == colorForState) {
                mode = blendFilter.getMode();
                if (mode == blendMode) {
                    return blendFilter;
                }
            }
        }
        return BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline0.m(colorForState, blendMode);
    }

    /* compiled from: GradientDrawable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lio/bidmachine/util/gradient/GradientDrawable$Shape;", "", "Companion", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Shape {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int LINE = 2;
        public static final int OVAL = 1;
        public static final int RECTANGLE = 0;
        public static final int RING = 3;

        /* compiled from: GradientDrawable.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lio/bidmachine/util/gradient/GradientDrawable$Shape$Companion;", "", "()V", "LINE", "", "OVAL", j.c, "RING", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int LINE = 2;
            public static final int OVAL = 1;
            public static final int RECTANGLE = 0;
            public static final int RING = 3;

            private Companion() {
            }
        }
    }

    /* compiled from: GradientDrawable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lio/bidmachine/util/gradient/GradientDrawable$GradientType;", "", "Companion", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    public @interface GradientType {
        public static final int BILINEAR_GRADIENT = 3;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int LINEAR_GRADIENT = 0;
        public static final int RADIAL_GRADIENT = 1;
        public static final int SWEEP_GRADIENT = 2;

        /* compiled from: GradientDrawable.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lio/bidmachine/util/gradient/GradientDrawable$GradientType$Companion;", "", "()V", "BILINEAR_GRADIENT", "", "LINEAR_GRADIENT", "RADIAL_GRADIENT", "SWEEP_GRADIENT", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int BILINEAR_GRADIENT = 3;
            public static final int LINEAR_GRADIENT = 0;
            public static final int RADIAL_GRADIENT = 1;
            public static final int SWEEP_GRADIENT = 2;

            private Companion() {
            }
        }
    }

    /* compiled from: GradientDrawable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lio/bidmachine/util/gradient/GradientDrawable$RadiusType;", "", "Companion", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    public @interface RadiusType {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int RADIUS_TYPE_FRACTION = 1;
        public static final int RADIUS_TYPE_FRACTION_PARENT = 2;
        public static final int RADIUS_TYPE_PIXELS = 0;

        /* compiled from: GradientDrawable.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lio/bidmachine/util/gradient/GradientDrawable$RadiusType$Companion;", "", "()V", "RADIUS_TYPE_FRACTION", "", "RADIUS_TYPE_FRACTION_PARENT", "RADIUS_TYPE_PIXELS", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int RADIUS_TYPE_FRACTION = 1;
            public static final int RADIUS_TYPE_FRACTION_PARENT = 2;
            public static final int RADIUS_TYPE_PIXELS = 0;

            private Companion() {
            }
        }
    }

    /* compiled from: GradientDrawable.kt */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b,\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0002\u0010\bJ\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001J\t\u0010\u0082\u0001\u001a\u00020\nH\u0016J\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0005J\n\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0016J\u0013\u0010\u0086\u0001\u001a\u00030\u0081\u00012\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010TJ\u0010\u0010\u0088\u0001\u001a\u00030\u0081\u00012\u0006\u0010Y\u001a\u00020\u0016J\u001a\u0010\u0089\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u00162\u0007\u0010\u008b\u0001\u001a\u00020\u0016J\u0013\u0010\u008c\u0001\u001a\u00030\u0081\u00012\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0005J\u0019\u0010\u008e\u0001\u001a\u00030\u0081\u00012\u0006\u0010.\u001a\u00020\u00162\u0007\u0010\u008f\u0001\u001a\u00020\nJ\u0011\u0010\u0090\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0091\u0001\u001a\u00020\nJ\u0010\u0010\u0092\u0001\u001a\u00030\u0081\u00012\u0006\u0010_\u001a\u00020\nJ\u0018\u0010\u0093\u0001\u001a\u00030\u0081\u00012\u0006\u0010}\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nJ\u0013\u0010\u0094\u0001\u001a\u00030\u0081\u00012\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010(J-\u0010\u0095\u0001\u001a\u00030\u0081\u00012\u0006\u0010}\u001a\u00020\n2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010(2\u0007\u0010\u0096\u0001\u001a\u00020\u00162\u0007\u0010\u0097\u0001\u001a\u00020\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R&\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010'X\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR \u00101\u001a\u00020\nX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b2\u00103\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000eR \u00106\u001a\u00020\nX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b7\u00103\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010\u000eR\u001a\u0010:\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\f\"\u0004\b<\u0010\u000eR\u001a\u0010=\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR\u001a\u0010@\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0018\"\u0004\bB\u0010\u001aR\u001a\u0010C\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010$\"\u0004\bE\u0010&R\u001a\u0010F\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010$\"\u0004\bH\u0010&R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010M\u001a\u0004\u0018\u00010NX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001c\u0010S\u001a\u0004\u0018\u00010TX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010Y\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0018\"\u0004\b[\u0010\u001aR\u001c\u0010\\\u001a\u0004\u0018\u00010TX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010V\"\u0004\b^\u0010XR \u0010_\u001a\u00020\nX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b`\u00103\u001a\u0004\ba\u0010\f\"\u0004\bb\u0010\u000eR\u001c\u0010c\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001c\u0010h\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010e\"\u0004\bj\u0010gR\u001a\u0010k\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u0018\"\u0004\bm\u0010\u001aR\u001a\u0010n\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u0018\"\u0004\bp\u0010\u001aR\u001a\u0010q\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010\f\"\u0004\bs\u0010\u000eR\u001a\u0010t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\f\"\u0004\bv\u0010\u000eR\u001a\u0010w\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010\u0018\"\u0004\by\u0010\u001aR\u001c\u0010z\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010e\"\u0004\b|\u0010gR\u001a\u0010}\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010\f\"\u0004\b\u007f\u0010\u000e¨\u0006\u0098\u0001"}, d2 = {"Lio/bidmachine/util/gradient/GradientDrawable$GradientState;", "Landroid/graphics/drawable/Drawable$ConstantState;", X3.i.n, "Lio/bidmachine/util/gradient/GradientDrawable$Orientation;", "gradientColors", "", "(Lio/bidmachine/util/gradient/GradientDrawable$Orientation;[I)V", "originalGradientState", "(Lio/bidmachine/util/gradient/GradientDrawable$GradientState;)V", "angle", "", "getAngle", "()I", "setAngle", "(I)V", "blendMode", "Landroid/graphics/BlendMode;", "getBlendMode", "()Landroid/graphics/BlendMode;", "setBlendMode", "(Landroid/graphics/BlendMode;)V", "centerX", "", "getCenterX", "()F", "setCenterX", "(F)V", "centerY", "getCenterY", "setCenterY", "changingConfigurationsParam", "getChangingConfigurationsParam", "setChangingConfigurationsParam", "dither", "", "getDither", "()Z", "setDither", "(Z)V", "", "Landroid/content/res/ColorStateList;", "getGradientColors", "()[Landroid/content/res/ColorStateList;", "setGradientColors", "([Landroid/content/res/ColorStateList;)V", "[Landroid/content/res/ColorStateList;", "gradientRadius", "getGradientRadius", "setGradientRadius", "gradientRadiusType", "getGradientRadiusType$annotations", "()V", "getGradientRadiusType", "setGradientRadiusType", "gradientType", "getGradientType$annotations", "getGradientType", "setGradientType", "heightPx", "getHeightPx", "setHeightPx", "innerRadiusPx", "getInnerRadiusPx", "setInnerRadiusPx", "innerRadiusRatio", "getInnerRadiusRatio", "setInnerRadiusRatio", "opaqueOverBounds", "getOpaqueOverBounds", "setOpaqueOverBounds", "opaqueOverShape", "getOpaqueOverShape", "setOpaqueOverShape", "getOrientation", "()Lio/bidmachine/util/gradient/GradientDrawable$Orientation;", "setOrientation", "(Lio/bidmachine/util/gradient/GradientDrawable$Orientation;)V", VastAttributes.PADDING, "Landroid/graphics/Rect;", "getPadding", "()Landroid/graphics/Rect;", "setPadding", "(Landroid/graphics/Rect;)V", "positions", "", "getPositions", "()[F", "setPositions", "([F)V", "radiusPx", "getRadiusPx", "setRadiusPx", "radiusPxArray", "getRadiusPxArray", "setRadiusPxArray", "shape", "getShape$annotations", "getShape", "setShape", "solidColors", "getSolidColors", "()Landroid/content/res/ColorStateList;", "setSolidColors", "(Landroid/content/res/ColorStateList;)V", "strokeColors", "getStrokeColors", "setStrokeColors", "strokeDashGapPx", "getStrokeDashGapPx", "setStrokeDashGapPx", "strokeDashWidthPx", "getStrokeDashWidthPx", "setStrokeDashWidthPx", "strokeWidthPx", "getStrokeWidthPx", "setStrokeWidthPx", "thicknessPx", "getThicknessPx", "setThicknessPx", "thicknessRatio", "getThicknessRatio", "setThicknessRatio", "tint", "getTint", "setTint", "widthPx", "getWidthPx", "setWidthPx", "computeOpacity", "", "getChangingConfigurations", "getColors", "newDrawable", "Landroid/graphics/drawable/Drawable;", "setCornerRadiiInternal", "radii", "setCornerRadiusInternal", "setGradientCenterInternal", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "setGradientColorsInternal", "colors", "setGradientRadiusInternal", "type", "setGradientTypeInternal", "gradient", "setShapeInternal", "setSizeInternal", "setSolidColorsInternal", "setStrokeInternal", "dashWidthPx", "dashGapPx", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class GradientState extends Drawable.ConstantState {
        private int angle;

        @Nullable
        private BlendMode blendMode;
        private float centerX;
        private float centerY;
        private int changingConfigurationsParam;
        private boolean dither;

        @Nullable
        private ColorStateList[] gradientColors;
        private float gradientRadius;
        private int gradientRadiusType;
        private int gradientType;
        private int heightPx;
        private int innerRadiusPx;
        private float innerRadiusRatio;
        private boolean opaqueOverBounds;
        private boolean opaqueOverShape;

        @NotNull
        private Orientation orientation;

        @Nullable
        private Rect padding;

        @Nullable
        private float[] positions;
        private float radiusPx;

        @Nullable
        private float[] radiusPxArray;
        private int shape;

        @Nullable
        private ColorStateList solidColors;

        @Nullable
        private ColorStateList strokeColors;
        private float strokeDashGapPx;
        private float strokeDashWidthPx;
        private int strokeWidthPx;
        private int thicknessPx;
        private float thicknessRatio;

        @Nullable
        private ColorStateList tint;
        private int widthPx;

        public static /* synthetic */ void getGradientRadiusType$annotations() {
        }

        public static /* synthetic */ void getGradientType$annotations() {
        }

        public static /* synthetic */ void getShape$annotations() {
        }

        public final int getChangingConfigurationsParam() {
            return this.changingConfigurationsParam;
        }

        public final void setChangingConfigurationsParam(int i) {
            this.changingConfigurationsParam = i;
        }

        public final int getShape() {
            return this.shape;
        }

        public final void setShape(int i) {
            this.shape = i;
        }

        public final int getGradientType() {
            return this.gradientType;
        }

        public final void setGradientType(int i) {
            this.gradientType = i;
        }

        public final int getAngle() {
            return this.angle;
        }

        public final void setAngle(int i) {
            this.angle = i;
        }

        @NotNull
        public final Orientation getOrientation() {
            return this.orientation;
        }

        public final void setOrientation(@NotNull Orientation orientation) {
            Intrinsics.checkNotNullParameter(orientation, "<set-?>");
            this.orientation = orientation;
        }

        @Nullable
        public final ColorStateList getSolidColors() {
            return this.solidColors;
        }

        public final void setSolidColors(@Nullable ColorStateList colorStateList) {
            this.solidColors = colorStateList;
        }

        @Nullable
        public final ColorStateList getStrokeColors() {
            return this.strokeColors;
        }

        public final void setStrokeColors(@Nullable ColorStateList colorStateList) {
            this.strokeColors = colorStateList;
        }

        @Nullable
        public final ColorStateList[] getGradientColors() {
            return this.gradientColors;
        }

        public final void setGradientColors(@Nullable ColorStateList[] colorStateListArr) {
            this.gradientColors = colorStateListArr;
        }

        @Nullable
        public final float[] getPositions() {
            return this.positions;
        }

        public final void setPositions(@Nullable float[] fArr) {
            this.positions = fArr;
        }

        public final int getStrokeWidthPx() {
            return this.strokeWidthPx;
        }

        public final void setStrokeWidthPx(int i) {
            this.strokeWidthPx = i;
        }

        public final float getStrokeDashWidthPx() {
            return this.strokeDashWidthPx;
        }

        public final void setStrokeDashWidthPx(float f) {
            this.strokeDashWidthPx = f;
        }

        public final float getStrokeDashGapPx() {
            return this.strokeDashGapPx;
        }

        public final void setStrokeDashGapPx(float f) {
            this.strokeDashGapPx = f;
        }

        public final float getRadiusPx() {
            return this.radiusPx;
        }

        public final void setRadiusPx(float f) {
            this.radiusPx = f;
        }

        @Nullable
        public final float[] getRadiusPxArray() {
            return this.radiusPxArray;
        }

        public final void setRadiusPxArray(@Nullable float[] fArr) {
            this.radiusPxArray = fArr;
        }

        @Nullable
        public final Rect getPadding() {
            return this.padding;
        }

        public final void setPadding(@Nullable Rect rect) {
            this.padding = rect;
        }

        public final int getWidthPx() {
            return this.widthPx;
        }

        public final void setWidthPx(int i) {
            this.widthPx = i;
        }

        public final int getHeightPx() {
            return this.heightPx;
        }

        public final void setHeightPx(int i) {
            this.heightPx = i;
        }

        public final float getInnerRadiusRatio() {
            return this.innerRadiusRatio;
        }

        public final void setInnerRadiusRatio(float f) {
            this.innerRadiusRatio = f;
        }

        public final float getThicknessRatio() {
            return this.thicknessRatio;
        }

        public final void setThicknessRatio(float f) {
            this.thicknessRatio = f;
        }

        public final int getInnerRadiusPx() {
            return this.innerRadiusPx;
        }

        public final void setInnerRadiusPx(int i) {
            this.innerRadiusPx = i;
        }

        public final int getThicknessPx() {
            return this.thicknessPx;
        }

        public final void setThicknessPx(int i) {
            this.thicknessPx = i;
        }

        public final boolean getDither() {
            return this.dither;
        }

        public final void setDither(boolean z) {
            this.dither = z;
        }

        public final float getCenterX() {
            return this.centerX;
        }

        public final void setCenterX(float f) {
            this.centerX = f;
        }

        public final float getCenterY() {
            return this.centerY;
        }

        public final void setCenterY(float f) {
            this.centerY = f;
        }

        public final float getGradientRadius() {
            return this.gradientRadius;
        }

        public final void setGradientRadius(float f) {
            this.gradientRadius = f;
        }

        public final int getGradientRadiusType() {
            return this.gradientRadiusType;
        }

        public final void setGradientRadiusType(int i) {
            this.gradientRadiusType = i;
        }

        public final boolean getOpaqueOverBounds() {
            return this.opaqueOverBounds;
        }

        public final void setOpaqueOverBounds(boolean z) {
            this.opaqueOverBounds = z;
        }

        public final boolean getOpaqueOverShape() {
            return this.opaqueOverShape;
        }

        public final void setOpaqueOverShape(boolean z) {
            this.opaqueOverShape = z;
        }

        @Nullable
        public final ColorStateList getTint() {
            return this.tint;
        }

        public final void setTint(@Nullable ColorStateList colorStateList) {
            this.tint = colorStateList;
        }

        @Nullable
        public final BlendMode getBlendMode() {
            return this.blendMode;
        }

        public final void setBlendMode(@Nullable BlendMode blendMode) {
            this.blendMode = blendMode;
        }

        public GradientState(@NotNull Orientation orientation, @Nullable int[] iArr) {
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            this.strokeWidthPx = -1;
            this.widthPx = -1;
            this.heightPx = -1;
            this.innerRadiusRatio = 3.0f;
            this.thicknessRatio = GradientDrawable.DEFAULT_THICKNESS_RATIO;
            this.innerRadiusPx = -1;
            this.thicknessPx = -1;
            this.centerX = 0.5f;
            this.centerY = 0.5f;
            this.gradientRadius = 0.5f;
            this.blendMode = Build.VERSION.SDK_INT >= 29 ? BlendMode.SRC_IN : null;
            this.orientation = orientation;
            setGradientColorsInternal(iArr);
        }

        public GradientState(@NotNull GradientState originalGradientState) {
            Intrinsics.checkNotNullParameter(originalGradientState, "originalGradientState");
            this.strokeWidthPx = -1;
            this.widthPx = -1;
            this.heightPx = -1;
            this.innerRadiusRatio = 3.0f;
            this.thicknessRatio = GradientDrawable.DEFAULT_THICKNESS_RATIO;
            this.innerRadiusPx = -1;
            this.thicknessPx = -1;
            this.centerX = 0.5f;
            this.centerY = 0.5f;
            this.gradientRadius = 0.5f;
            this.blendMode = Build.VERSION.SDK_INT >= 29 ? BlendMode.SRC_IN : null;
            this.changingConfigurationsParam = originalGradientState.changingConfigurationsParam;
            this.shape = originalGradientState.shape;
            this.gradientType = originalGradientState.gradientType;
            this.angle = originalGradientState.angle;
            this.orientation = originalGradientState.orientation;
            this.solidColors = originalGradientState.solidColors;
            this.strokeColors = originalGradientState.strokeColors;
            ColorStateList[] colorStateListArr = originalGradientState.gradientColors;
            if (colorStateListArr != null) {
                this.gradientColors = (ColorStateList[]) colorStateListArr.clone();
            }
            float[] fArr = originalGradientState.positions;
            if (fArr != null) {
                this.positions = (float[]) fArr.clone();
            }
            this.strokeWidthPx = originalGradientState.strokeWidthPx;
            this.strokeDashWidthPx = originalGradientState.strokeDashWidthPx;
            this.strokeDashGapPx = originalGradientState.strokeDashGapPx;
            this.radiusPx = originalGradientState.radiusPx;
            float[] fArr2 = originalGradientState.radiusPxArray;
            if (fArr2 != null) {
                this.radiusPxArray = (float[]) fArr2.clone();
            }
            Rect rect = originalGradientState.padding;
            if (rect != null) {
                this.padding = new Rect(rect);
            }
            this.widthPx = originalGradientState.widthPx;
            this.heightPx = originalGradientState.heightPx;
            this.innerRadiusRatio = originalGradientState.innerRadiusRatio;
            this.thicknessRatio = originalGradientState.thicknessRatio;
            this.innerRadiusPx = originalGradientState.innerRadiusPx;
            this.thicknessPx = originalGradientState.thicknessPx;
            this.dither = originalGradientState.dither;
            this.centerX = originalGradientState.centerX;
            this.centerY = originalGradientState.centerY;
            this.gradientRadius = originalGradientState.gradientRadius;
            this.gradientRadiusType = originalGradientState.gradientRadiusType;
            this.opaqueOverBounds = originalGradientState.opaqueOverBounds;
            this.opaqueOverShape = originalGradientState.opaqueOverShape;
            this.tint = originalGradientState.tint;
            this.blendMode = originalGradientState.blendMode;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NotNull
        public Drawable newDrawable() {
            return new GradientDrawable(this, (DefaultConstructorMarker) null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i = this.changingConfigurationsParam;
            ColorStateList colorStateList = this.strokeColors;
            int changingConfigurations = i | (colorStateList != null ? colorStateList.getChangingConfigurations() : 0);
            ColorStateList colorStateList2 = this.solidColors;
            int changingConfigurations2 = changingConfigurations | (colorStateList2 != null ? colorStateList2.getChangingConfigurations() : 0);
            ColorStateList colorStateList3 = this.tint;
            return changingConfigurations2 | (colorStateList3 != null ? colorStateList3.getChangingConfigurations() : 0);
        }

        @Nullable
        public final int[] getColors() {
            ColorStateList[] colorStateListArr = this.gradientColors;
            if (colorStateListArr != null) {
                return GradientDrawableKt.mapToIntArray(colorStateListArr, new Function1() { // from class: io.bidmachine.util.gradient.GradientDrawable$GradientState$getColors$1
                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    public final Integer invoke(@Nullable ColorStateList colorStateList) {
                        if (colorStateList != null) {
                            return Integer.valueOf(colorStateList.getDefaultColor());
                        }
                        return null;
                    }
                });
            }
            return null;
        }

        public final void setShapeInternal(int shape) {
            this.shape = shape;
            computeOpacity();
        }

        public final void setGradientTypeInternal(int gradient) {
            this.gradientType = gradient;
        }

        public final void setGradientCenterInternal(float x, float y) {
            this.centerX = x;
            this.centerY = y;
        }

        public final void setGradientColorsInternal(@Nullable int[] colors) {
            ColorStateList[] colorStateListArr;
            if (colors != null) {
                colorStateListArr = this.gradientColors;
                if (colorStateListArr == null || colorStateListArr.length != colors.length) {
                    colorStateListArr = new ColorStateList[colors.length];
                }
                int length = colors.length;
                for (int i = 0; i < length; i++) {
                    ColorStateList valueOf = ColorStateList.valueOf(colors[i]);
                    Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(it)");
                    colorStateListArr[i] = valueOf;
                }
            } else {
                colorStateListArr = null;
            }
            this.gradientColors = colorStateListArr;
            this.solidColors = null;
            computeOpacity();
        }

        public final void setSolidColorsInternal(@Nullable ColorStateList colors) {
            this.gradientColors = null;
            this.solidColors = colors;
            computeOpacity();
        }

        public final void setStrokeInternal(int widthPx, @Nullable ColorStateList colors, float dashWidthPx, float dashGapPx) {
            this.strokeWidthPx = widthPx;
            this.strokeColors = colors;
            this.strokeDashWidthPx = dashWidthPx;
            this.strokeDashGapPx = dashGapPx;
            computeOpacity();
        }

        public final void setCornerRadiusInternal(float radiusPx) {
            if (radiusPx < 0.0f) {
                radiusPx = 0.0f;
            }
            this.radiusPx = radiusPx;
            this.radiusPxArray = null;
            computeOpacity();
        }

        public final void setCornerRadiiInternal(@Nullable float[] radii) {
            this.radiusPxArray = radii;
            if (radii == null) {
                this.radiusPx = 0.0f;
            }
            computeOpacity();
        }

        public final void setSizeInternal(int widthPx, int heightPx) {
            this.widthPx = widthPx;
            this.heightPx = heightPx;
        }

        public final void setGradientRadiusInternal(float gradientRadius, int type) {
            this.gradientRadius = gradientRadius;
            this.gradientRadiusType = type;
        }

        public final void computeOpacity() {
            Boolean bool;
            boolean z;
            boolean z2 = false;
            this.opaqueOverBounds = false;
            this.opaqueOverShape = false;
            ColorStateList[] colorStateListArr = this.gradientColors;
            if (colorStateListArr == null && this.solidColors == null) {
                return;
            }
            if (colorStateListArr != null) {
                int length = colorStateListArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        ColorStateList colorStateList = colorStateListArr[i];
                        if (colorStateList != null && !GradientDrawableKt.isOpaque(colorStateList.getDefaultColor())) {
                            z = true;
                            break;
                        }
                        i++;
                    } else {
                        z = false;
                        break;
                    }
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                return;
            }
            this.opaqueOverShape = true;
            if (this.shape == 0 && this.radiusPx <= 0.0f && this.radiusPxArray == null) {
                z2 = true;
            }
            this.opaqueOverBounds = z2;
        }
    }
}
