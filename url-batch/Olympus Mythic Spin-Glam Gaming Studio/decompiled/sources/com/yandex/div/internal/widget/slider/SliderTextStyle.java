package com.yandex.div.internal.widget.slider;

import android.graphics.Typeface;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SliderTextStyle.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\nHÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/yandex/div/internal/widget/slider/SliderTextStyle;", "", "fontSize", "", "spacing", "fontWeight", "Landroid/graphics/Typeface;", "offsetX", "offsetY", "textColor", "", "fontVariations", "", "(FFLandroid/graphics/Typeface;FFILjava/lang/String;)V", "getFontSize", "()F", "getFontVariations", "()Ljava/lang/String;", "getFontWeight", "()Landroid/graphics/Typeface;", "getOffsetX", "getOffsetY", "getSpacing", "getTextColor", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SliderTextStyle {
    private final float fontSize;

    @Nullable
    private final String fontVariations;

    @NotNull
    private final Typeface fontWeight;
    private final float offsetX;
    private final float offsetY;
    private final float spacing;
    private final int textColor;

    public static /* synthetic */ SliderTextStyle copy$default(SliderTextStyle sliderTextStyle, float f, float f2, Typeface typeface, float f3, float f4, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = sliderTextStyle.fontSize;
        }
        if ((i2 & 2) != 0) {
            f2 = sliderTextStyle.spacing;
        }
        float f5 = f2;
        if ((i2 & 4) != 0) {
            typeface = sliderTextStyle.fontWeight;
        }
        Typeface typeface2 = typeface;
        if ((i2 & 8) != 0) {
            f3 = sliderTextStyle.offsetX;
        }
        float f6 = f3;
        if ((i2 & 16) != 0) {
            f4 = sliderTextStyle.offsetY;
        }
        float f7 = f4;
        if ((i2 & 32) != 0) {
            i = sliderTextStyle.textColor;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            str = sliderTextStyle.fontVariations;
        }
        return sliderTextStyle.copy(f, f5, typeface2, f6, f7, i3, str);
    }

    /* renamed from: component1, reason: from getter */
    public final float getFontSize() {
        return this.fontSize;
    }

    /* renamed from: component2, reason: from getter */
    public final float getSpacing() {
        return this.spacing;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Typeface getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: component4, reason: from getter */
    public final float getOffsetX() {
        return this.offsetX;
    }

    /* renamed from: component5, reason: from getter */
    public final float getOffsetY() {
        return this.offsetY;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getFontVariations() {
        return this.fontVariations;
    }

    @NotNull
    public final SliderTextStyle copy(@Px float fontSize, float spacing, @NotNull Typeface fontWeight, @Px float offsetX, @Px float offsetY, @ColorInt int textColor, @Nullable String fontVariations) {
        return new SliderTextStyle(fontSize, spacing, fontWeight, offsetX, offsetY, textColor, fontVariations);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderTextStyle)) {
            return false;
        }
        SliderTextStyle sliderTextStyle = (SliderTextStyle) other;
        return Float.compare(this.fontSize, sliderTextStyle.fontSize) == 0 && Float.compare(this.spacing, sliderTextStyle.spacing) == 0 && Intrinsics.areEqual(this.fontWeight, sliderTextStyle.fontWeight) && Float.compare(this.offsetX, sliderTextStyle.offsetX) == 0 && Float.compare(this.offsetY, sliderTextStyle.offsetY) == 0 && this.textColor == sliderTextStyle.textColor && Intrinsics.areEqual(this.fontVariations, sliderTextStyle.fontVariations);
    }

    public int hashCode() {
        int hashCode = ((((((((((Float.hashCode(this.fontSize) * 31) + Float.hashCode(this.spacing)) * 31) + this.fontWeight.hashCode()) * 31) + Float.hashCode(this.offsetX)) * 31) + Float.hashCode(this.offsetY)) * 31) + Integer.hashCode(this.textColor)) * 31;
        String str = this.fontVariations;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SliderTextStyle(fontSize=" + this.fontSize + ", spacing=" + this.spacing + ", fontWeight=" + this.fontWeight + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", textColor=" + this.textColor + ", fontVariations=" + this.fontVariations + ')';
    }

    public SliderTextStyle(@Px float f, float f2, @NotNull Typeface typeface, @Px float f3, @Px float f4, @ColorInt int i, @Nullable String str) {
        this.fontSize = f;
        this.spacing = f2;
        this.fontWeight = typeface;
        this.offsetX = f3;
        this.offsetY = f4;
        this.textColor = i;
        this.fontVariations = str;
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final float getSpacing() {
        return this.spacing;
    }

    @NotNull
    public final Typeface getFontWeight() {
        return this.fontWeight;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final String getFontVariations() {
        return this.fontVariations;
    }
}
