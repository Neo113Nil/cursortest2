package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import com.yandex.div.internal.Assert;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CircleDrawable.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/internal/drawable/CircleDrawable;", "Landroid/graphics/drawable/Drawable;", "params", "Lcom/yandex/div/internal/drawable/CircleDrawable$Params;", "(Lcom/yandex/div/internal/drawable/CircleDrawable$Params;)V", "mainPaint", "Landroid/graphics/Paint;", "rect", "Landroid/graphics/RectF;", "strokePaint", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getIntrinsicHeight", "", "getIntrinsicWidth", "getOpacity", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "Params", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CircleDrawable extends Drawable {

    @NotNull
    private final Paint mainPaint;

    @NotNull
    private final Params params;

    @NotNull
    private final RectF rect;

    @Nullable
    private final Paint strokePaint;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public CircleDrawable(@NotNull Params params) {
        Paint paint;
        this.params = params;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(params.getColor());
        this.mainPaint = paint2;
        if (params.getStrokeColor() == null || params.getStrokeWidth() == null) {
            paint = null;
        } else {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(params.getStrokeColor().intValue());
            paint.setStrokeWidth(params.getStrokeWidth().floatValue());
        }
        this.strokePaint = paint;
        float f = 2;
        RectF rectF = new RectF(0.0f, 0.0f, params.getRadius() * f, params.getRadius() * f);
        this.rect = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    /* compiled from: CircleDrawable.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J:\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/internal/drawable/CircleDrawable$Params;", "", "radius", "", "color", "", "strokeColor", "strokeWidth", "(FILjava/lang/Integer;Ljava/lang/Float;)V", "getColor", "()I", "getRadius", "()F", "getStrokeColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStrokeWidth", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "component4", "copy", "(FILjava/lang/Integer;Ljava/lang/Float;)Lcom/yandex/div/internal/drawable/CircleDrawable$Params;", "equals", "", "other", "hashCode", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Params {
        private final int color;
        private final float radius;

        @Nullable
        private final Integer strokeColor;

        @Nullable
        private final Float strokeWidth;

        public static /* synthetic */ Params copy$default(Params params, float f, int i, Integer num, Float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f = params.radius;
            }
            if ((i2 & 2) != 0) {
                i = params.color;
            }
            if ((i2 & 4) != 0) {
                num = params.strokeColor;
            }
            if ((i2 & 8) != 0) {
                f2 = params.strokeWidth;
            }
            return params.copy(f, i, num, f2);
        }

        /* renamed from: component1, reason: from getter */
        public final float getRadius() {
            return this.radius;
        }

        /* renamed from: component2, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Integer getStrokeColor() {
            return this.strokeColor;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Float getStrokeWidth() {
            return this.strokeWidth;
        }

        @NotNull
        public final Params copy(@Px float radius, int color, @Nullable Integer strokeColor, @Nullable Float strokeWidth) {
            return new Params(radius, color, strokeColor, strokeWidth);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return Float.compare(this.radius, params.radius) == 0 && this.color == params.color && Intrinsics.areEqual(this.strokeColor, params.strokeColor) && Intrinsics.areEqual((Object) this.strokeWidth, (Object) params.strokeWidth);
        }

        public int hashCode() {
            int hashCode = ((Float.hashCode(this.radius) * 31) + Integer.hashCode(this.color)) * 31;
            Integer num = this.strokeColor;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Float f = this.strokeWidth;
            return hashCode2 + (f != null ? f.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Params(radius=" + this.radius + ", color=" + this.color + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ')';
        }

        public Params(@Px float f, int i, @Nullable Integer num, @Nullable Float f2) {
            this.radius = f;
            this.color = i;
            this.strokeColor = num;
            this.strokeWidth = f2;
        }

        public /* synthetic */ Params(float f, int i, Integer num, Float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : f2);
        }

        public final float getRadius() {
            return this.radius;
        }

        public final int getColor() {
            return this.color;
        }

        @Nullable
        public final Integer getStrokeColor() {
            return this.strokeColor;
        }

        @Nullable
        public final Float getStrokeWidth() {
            return this.strokeWidth;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return ((int) this.params.getRadius()) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return ((int) this.params.getRadius()) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        this.mainPaint.setColor(this.params.getColor());
        this.rect.set(getBounds());
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), this.params.getRadius(), this.mainPaint);
        if (this.strokePaint != null) {
            canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), this.params.getRadius(), this.strokePaint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        Assert.fail("Setting alpha is not implemented");
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Assert.fail("Setting color filter is not implemented");
    }
}
