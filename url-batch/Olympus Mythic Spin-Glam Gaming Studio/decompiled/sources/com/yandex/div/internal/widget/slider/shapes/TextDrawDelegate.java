package com.yandex.div.internal.widget.slider.shapes;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.yandex.div.core.view2.divs.TextViewExtensionsKt;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextDrawDelegate.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/internal/widget/slider/shapes/TextDrawDelegate;", "", "textStyle", "Lcom/yandex/div/internal/widget/slider/SliderTextStyle;", "(Lcom/yandex/div/internal/widget/slider/SliderTextStyle;)V", "halfTextHeight", "", "halfTextWidth", "value", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "textPaint", "Landroid/graphics/Paint;", "textRect", "Landroid/graphics/Rect;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "centerX", "centerY", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextDrawDelegate {
    private float halfTextHeight;
    private float halfTextWidth;

    @Nullable
    private String text;

    @NotNull
    private final Paint textPaint;

    @NotNull
    private final Rect textRect = new Rect();

    @NotNull
    private final SliderTextStyle textStyle;

    public TextDrawDelegate(@NotNull SliderTextStyle sliderTextStyle) {
        this.textStyle = sliderTextStyle;
        Paint paint = new Paint(1);
        paint.setTextSize(sliderTextStyle.getFontSize());
        paint.setLetterSpacing(sliderTextStyle.getSpacing());
        paint.setColor(sliderTextStyle.getTextColor());
        paint.setTypeface(sliderTextStyle.getFontWeight());
        paint.setStyle(Paint.Style.FILL);
        if (TextViewExtensionsKt.getSupportFontVariations()) {
            paint.setFontVariationSettings(sliderTextStyle.getFontVariations());
        }
        this.textPaint = paint;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
        this.textPaint.getTextBounds(str, 0, str != null ? str.length() : 0, this.textRect);
        this.halfTextWidth = this.textPaint.measureText(this.text) / 2.0f;
        this.halfTextHeight = this.textRect.height() / 2.0f;
    }

    public final void draw(@NotNull Canvas canvas, float centerX, float centerY) {
        String str = this.text;
        if (str != null) {
            canvas.drawText(str, (centerX - this.halfTextWidth) + this.textStyle.getOffsetX(), centerY + this.halfTextHeight + this.textStyle.getOffsetY(), this.textPaint);
        }
    }
}
