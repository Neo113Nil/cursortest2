package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RoundedRect.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J@\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/internal/widget/indicator/forms/RoundedRect;", "Lcom/yandex/div/internal/widget/indicator/forms/SingleIndicatorDrawer;", "params", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;", "(Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;)V", "paint", "Landroid/graphics/Paint;", "rect", "Landroid/graphics/RectF;", "strokePaint", "draw", "", "canvas", "Landroid/graphics/Canvas;", VastAttributes.HORIZONTAL_POSITION, "", VastAttributes.VERTICAL_POSITION, "itemSize", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "color", "", "strokeWidth", "strokeColor", "drawSelected", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RoundedRect implements SingleIndicatorDrawer {

    @NotNull
    private final Paint paint = new Paint(1);

    @NotNull
    private final IndicatorParams.Style params;

    @NotNull
    private final RectF rect;

    @NotNull
    private final Paint strokePaint;

    public RoundedRect(@NotNull IndicatorParams.Style style) {
        this.params = style;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.strokePaint = paint;
        this.rect = new RectF();
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void draw(@NotNull Canvas canvas, float x, float y, @NotNull IndicatorParams.ItemSize itemSize, int color, float strokeWidth, int strokeColor) {
        Intrinsics.checkNotNull(itemSize, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.ItemSize.RoundedRect");
        IndicatorParams.ItemSize.RoundedRect roundedRect = (IndicatorParams.ItemSize.RoundedRect) itemSize;
        this.paint.setColor(color);
        RectF rectF = this.rect;
        rectF.left = x - (roundedRect.getItemWidth() / 2.0f);
        rectF.top = y - (roundedRect.getItemHeight() / 2.0f);
        rectF.right = x + (roundedRect.getItemWidth() / 2.0f);
        float itemHeight = y + (roundedRect.getItemHeight() / 2.0f);
        rectF.bottom = itemHeight;
        if (strokeWidth > 0.0f) {
            float f = strokeWidth / 2.0f;
            rectF.left += f;
            rectF.top += f;
            rectF.right -= f;
            rectF.bottom = itemHeight - f;
        }
        canvas.drawRoundRect(this.rect, roundedRect.getCornerRadius(), roundedRect.getCornerRadius(), this.paint);
        if (strokeColor == 0 || strokeWidth == 0.0f) {
            return;
        }
        Paint paint = this.strokePaint;
        paint.setColor(strokeColor);
        paint.setStrokeWidth(strokeWidth);
        canvas.drawRoundRect(this.rect, roundedRect.getCornerRadius(), roundedRect.getCornerRadius(), this.strokePaint);
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    public void drawSelected(@NotNull Canvas canvas, @NotNull RectF rect) {
        IndicatorParams.Shape activeShape = this.params.getActiveShape();
        Intrinsics.checkNotNull(activeShape, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        IndicatorParams.Shape.RoundedRect roundedRect = (IndicatorParams.Shape.RoundedRect) activeShape;
        IndicatorParams.ItemSize.RoundedRect itemSize = roundedRect.getItemSize();
        this.paint.setColor(this.params.getActiveShape().getColor());
        canvas.drawRoundRect(rect, itemSize.getCornerRadius(), itemSize.getCornerRadius(), this.paint);
        if (roundedRect.getStrokeColor() == 0 || roundedRect.getStrokeWidth() == 0.0f) {
            return;
        }
        Paint paint = this.strokePaint;
        paint.setColor(roundedRect.getStrokeColor());
        paint.setStrokeWidth(roundedRect.getStrokeWidth());
        canvas.drawRoundRect(rect, itemSize.getCornerRadius(), itemSize.getCornerRadius(), this.strokePaint);
    }
}
