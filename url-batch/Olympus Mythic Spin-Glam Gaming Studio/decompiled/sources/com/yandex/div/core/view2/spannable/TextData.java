package com.yandex.div.core.view2.spannable;

import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextData.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0005¢\u0006\u0002\u0010\u000fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010)\u001a\u00020\u0005HÆ\u0003Jp\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u000e\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00061"}, d2 = {"Lcom/yandex/div/core/view2/spannable/TextData;", "", "text", "", "fontSize", "", "fontSizeValue", "fontSizeUnit", "Lcom/yandex/div2/DivSizeUnit;", "fontFamily", "fontWeight", "Lcom/yandex/div2/DivFontWeight;", "fontWeightValue", "lineHeight", "textColor", "(Ljava/lang/String;IILcom/yandex/div2/DivSizeUnit;Ljava/lang/String;Lcom/yandex/div2/DivFontWeight;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "getFontFamily", "()Ljava/lang/String;", "getFontSize", "()I", "getFontSizeUnit", "()Lcom/yandex/div2/DivSizeUnit;", "getFontSizeValue", "getFontWeight", "()Lcom/yandex/div2/DivFontWeight;", "getFontWeightValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLineHeight", "getText", "getTextColor", "textLength", "getTextLength", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;IILcom/yandex/div2/DivSizeUnit;Ljava/lang/String;Lcom/yandex/div2/DivFontWeight;Ljava/lang/Integer;Ljava/lang/Integer;I)Lcom/yandex/div/core/view2/spannable/TextData;", "equals", "", "other", "hashCode", "toString", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TextData {

    @Nullable
    private final String fontFamily;
    private final int fontSize;

    @NotNull
    private final DivSizeUnit fontSizeUnit;
    private final int fontSizeValue;

    @Nullable
    private final DivFontWeight fontWeight;

    @Nullable
    private final Integer fontWeightValue;

    @Nullable
    private final Integer lineHeight;

    @NotNull
    private final String text;
    private final int textColor;
    private final int textLength;

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFontSize() {
        return this.fontSize;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFontSizeValue() {
        return this.fontSizeValue;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final DivSizeUnit getFontSizeUnit() {
        return this.fontSizeUnit;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getFontFamily() {
        return this.fontFamily;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final DivFontWeight getFontWeight() {
        return this.fontWeight;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getFontWeightValue() {
        return this.fontWeightValue;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    /* renamed from: component9, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final TextData copy(@NotNull String text, @Px int fontSize, int fontSizeValue, @NotNull DivSizeUnit fontSizeUnit, @Nullable String fontFamily, @Nullable DivFontWeight fontWeight, @Nullable Integer fontWeightValue, @Px @Nullable Integer lineHeight, @ColorInt int textColor) {
        return new TextData(text, fontSize, fontSizeValue, fontSizeUnit, fontFamily, fontWeight, fontWeightValue, lineHeight, textColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextData)) {
            return false;
        }
        TextData textData = (TextData) other;
        return Intrinsics.areEqual(this.text, textData.text) && this.fontSize == textData.fontSize && this.fontSizeValue == textData.fontSizeValue && this.fontSizeUnit == textData.fontSizeUnit && Intrinsics.areEqual(this.fontFamily, textData.fontFamily) && this.fontWeight == textData.fontWeight && Intrinsics.areEqual(this.fontWeightValue, textData.fontWeightValue) && Intrinsics.areEqual(this.lineHeight, textData.lineHeight) && this.textColor == textData.textColor;
    }

    public int hashCode() {
        int hashCode = ((((((this.text.hashCode() * 31) + Integer.hashCode(this.fontSize)) * 31) + Integer.hashCode(this.fontSizeValue)) * 31) + this.fontSizeUnit.hashCode()) * 31;
        String str = this.fontFamily;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DivFontWeight divFontWeight = this.fontWeight;
        int hashCode3 = (hashCode2 + (divFontWeight == null ? 0 : divFontWeight.hashCode())) * 31;
        Integer num = this.fontWeightValue;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lineHeight;
        return ((hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31) + Integer.hashCode(this.textColor);
    }

    @NotNull
    public String toString() {
        return "TextData(text=" + this.text + ", fontSize=" + this.fontSize + ", fontSizeValue=" + this.fontSizeValue + ", fontSizeUnit=" + this.fontSizeUnit + ", fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontWeightValue=" + this.fontWeightValue + ", lineHeight=" + this.lineHeight + ", textColor=" + this.textColor + ')';
    }

    public TextData(@NotNull String str, @Px int i, int i2, @NotNull DivSizeUnit divSizeUnit, @Nullable String str2, @Nullable DivFontWeight divFontWeight, @Nullable Integer num, @Px @Nullable Integer num2, @ColorInt int i3) {
        this.text = str;
        this.fontSize = i;
        this.fontSizeValue = i2;
        this.fontSizeUnit = divSizeUnit;
        this.fontFamily = str2;
        this.fontWeight = divFontWeight;
        this.fontWeightValue = num;
        this.lineHeight = num2;
        this.textColor = i3;
        this.textLength = str.length();
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final int getFontSizeValue() {
        return this.fontSizeValue;
    }

    @NotNull
    public final DivSizeUnit getFontSizeUnit() {
        return this.fontSizeUnit;
    }

    @Nullable
    public final String getFontFamily() {
        return this.fontFamily;
    }

    @Nullable
    public final DivFontWeight getFontWeight() {
        return this.fontWeight;
    }

    @Nullable
    public final Integer getFontWeightValue() {
        return this.fontWeightValue;
    }

    @Nullable
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextLength() {
        return this.textLength;
    }
}
