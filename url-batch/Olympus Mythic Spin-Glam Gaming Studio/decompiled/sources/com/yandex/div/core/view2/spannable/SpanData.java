package com.yandex.div.core.view2.spannable;

import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTextAlignmentVertical;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: SpanData.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0080\b\u0018\u0000 e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001eBÙ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010!J\u0011\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u0000H\u0096\u0002J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010H\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010K\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010N\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010S\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\t\u0010Y\u001a\u00020\rHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0082\u0002\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010\\J\u0013\u0010]\u001a\u00020^2\b\u0010E\u001a\u0004\u0018\u00010_HÖ\u0003J\t\u0010`\u001a\u00020\u0003HÖ\u0001J\u0006\u0010a\u001a\u00020^J\"\u0010b\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003J\t\u0010d\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b3\u0010+R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b7\u0010+R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b=\u0010+R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b@\u0010+R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\bA\u0010+R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\bB\u0010+R\u0013\u0010 \u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bC\u0010<¨\u0006f"}, d2 = {"Lcom/yandex/div/core/view2/spannable/SpanData;", "", "start", "", "end", "alignmentVertical", "Lcom/yandex/div2/DivTextAlignmentVertical;", "baselineOffset", "fontFamily", "", "fontFeatureSettings", "fontSize", "fontSizeUnit", "Lcom/yandex/div2/DivSizeUnit;", "fontWeight", "Lcom/yandex/div2/DivFontWeight;", "fontWeightValue", "fontVariationSettings", "Lorg/json/JSONObject;", "letterSpacing", "", "lineHeight", "mask", "Lcom/yandex/div/core/view2/spannable/MaskData;", "strike", "Lcom/yandex/div2/DivLineStyle;", "textColor", "textShadow", "Lcom/yandex/div/core/view2/spannable/ShadowData;", "topOffset", "topOffsetStart", "topOffsetEnd", "underline", "(IILcom/yandex/div2/DivTextAlignmentVertical;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/yandex/div2/DivSizeUnit;Lcom/yandex/div2/DivFontWeight;Ljava/lang/Integer;Lorg/json/JSONObject;Ljava/lang/Double;Ljava/lang/Integer;Lcom/yandex/div/core/view2/spannable/MaskData;Lcom/yandex/div2/DivLineStyle;Ljava/lang/Integer;Lcom/yandex/div/core/view2/spannable/ShadowData;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/yandex/div2/DivLineStyle;)V", "getAlignmentVertical", "()Lcom/yandex/div2/DivTextAlignmentVertical;", "getBaselineOffset", "()I", "getEnd", "getFontFamily", "()Ljava/lang/String;", "getFontFeatureSettings", "getFontSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFontSizeUnit", "()Lcom/yandex/div2/DivSizeUnit;", "getFontVariationSettings", "()Lorg/json/JSONObject;", "getFontWeight", "()Lcom/yandex/div2/DivFontWeight;", "getFontWeightValue", "getLetterSpacing", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLineHeight", "getMask", "()Lcom/yandex/div/core/view2/spannable/MaskData;", "getStart", "getStrike", "()Lcom/yandex/div2/DivLineStyle;", "getTextColor", "getTextShadow", "()Lcom/yandex/div/core/view2/spannable/ShadowData;", "getTopOffset", "getTopOffsetEnd", "getTopOffsetStart", "getUnderline", "compareTo", "other", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IILcom/yandex/div2/DivTextAlignmentVertical;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/yandex/div2/DivSizeUnit;Lcom/yandex/div2/DivFontWeight;Ljava/lang/Integer;Lorg/json/JSONObject;Ljava/lang/Double;Ljava/lang/Integer;Lcom/yandex/div/core/view2/spannable/MaskData;Lcom/yandex/div2/DivLineStyle;Ljava/lang/Integer;Lcom/yandex/div/core/view2/spannable/ShadowData;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/yandex/div2/DivLineStyle;)Lcom/yandex/div/core/view2/spannable/SpanData;", "equals", "", "", "hashCode", "isEmpty", "mergeWith", "span", "toString", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SpanData implements Comparable<SpanData> {
    private static final int DEFAULT_BASELINE_OFFSET = 0;

    @Nullable
    private final DivTextAlignmentVertical alignmentVertical;
    private final int baselineOffset;
    private final int end;

    @Nullable
    private final String fontFamily;

    @Nullable
    private final String fontFeatureSettings;

    @Nullable
    private final Integer fontSize;

    @NotNull
    private final DivSizeUnit fontSizeUnit;

    @Nullable
    private final JSONObject fontVariationSettings;

    @Nullable
    private final DivFontWeight fontWeight;

    @Nullable
    private final Integer fontWeightValue;

    @Nullable
    private final Double letterSpacing;

    @Nullable
    private final Integer lineHeight;

    @Nullable
    private final MaskData mask;
    private final int start;

    @Nullable
    private final DivLineStyle strike;

    @Nullable
    private final Integer textColor;

    @Nullable
    private final ShadowData textShadow;

    @Nullable
    private final Integer topOffset;

    @Nullable
    private final Integer topOffsetEnd;

    @Nullable
    private final Integer topOffsetStart;

    @Nullable
    private final DivLineStyle underline;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DivSizeUnit DEFAULT_FONT_SIZE_UNIT = DivSizeUnit.SP;

    /* renamed from: component1, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getFontWeightValue() {
        return this.fontWeightValue;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final JSONObject getFontVariationSettings() {
        return this.fontVariationSettings;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getLetterSpacing() {
        return this.letterSpacing;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final MaskData getMask() {
        return this.mask;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final DivLineStyle getStrike() {
        return this.strike;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getTextColor() {
        return this.textColor;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final ShadowData getTextShadow() {
        return this.textShadow;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getTopOffset() {
        return this.topOffset;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getTopOffsetStart() {
        return this.topOffsetStart;
    }

    /* renamed from: component2, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getTopOffsetEnd() {
        return this.topOffsetEnd;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final DivLineStyle getUnderline() {
        return this.underline;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final DivTextAlignmentVertical getAlignmentVertical() {
        return this.alignmentVertical;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBaselineOffset() {
        return this.baselineOffset;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getFontFamily() {
        return this.fontFamily;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getFontSize() {
        return this.fontSize;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final DivSizeUnit getFontSizeUnit() {
        return this.fontSizeUnit;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final DivFontWeight getFontWeight() {
        return this.fontWeight;
    }

    @NotNull
    public final SpanData copy(int start, int end, @Nullable DivTextAlignmentVertical alignmentVertical, @Px int baselineOffset, @Nullable String fontFamily, @Nullable String fontFeatureSettings, @Px @Nullable Integer fontSize, @NotNull DivSizeUnit fontSizeUnit, @Nullable DivFontWeight fontWeight, @Nullable Integer fontWeightValue, @Nullable JSONObject fontVariationSettings, @Nullable Double letterSpacing, @Px @Nullable Integer lineHeight, @Nullable MaskData mask, @Nullable DivLineStyle strike, @ColorInt @Nullable Integer textColor, @Nullable ShadowData textShadow, @Px @Nullable Integer topOffset, @Nullable Integer topOffsetStart, @Nullable Integer topOffsetEnd, @Nullable DivLineStyle underline) {
        return new SpanData(start, end, alignmentVertical, baselineOffset, fontFamily, fontFeatureSettings, fontSize, fontSizeUnit, fontWeight, fontWeightValue, fontVariationSettings, letterSpacing, lineHeight, mask, strike, textColor, textShadow, topOffset, topOffsetStart, topOffsetEnd, underline);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanData)) {
            return false;
        }
        SpanData spanData = (SpanData) other;
        return this.start == spanData.start && this.end == spanData.end && this.alignmentVertical == spanData.alignmentVertical && this.baselineOffset == spanData.baselineOffset && Intrinsics.areEqual(this.fontFamily, spanData.fontFamily) && Intrinsics.areEqual(this.fontFeatureSettings, spanData.fontFeatureSettings) && Intrinsics.areEqual(this.fontSize, spanData.fontSize) && this.fontSizeUnit == spanData.fontSizeUnit && this.fontWeight == spanData.fontWeight && Intrinsics.areEqual(this.fontWeightValue, spanData.fontWeightValue) && Intrinsics.areEqual(this.fontVariationSettings, spanData.fontVariationSettings) && Intrinsics.areEqual((Object) this.letterSpacing, (Object) spanData.letterSpacing) && Intrinsics.areEqual(this.lineHeight, spanData.lineHeight) && Intrinsics.areEqual(this.mask, spanData.mask) && this.strike == spanData.strike && Intrinsics.areEqual(this.textColor, spanData.textColor) && Intrinsics.areEqual(this.textShadow, spanData.textShadow) && Intrinsics.areEqual(this.topOffset, spanData.topOffset) && Intrinsics.areEqual(this.topOffsetStart, spanData.topOffsetStart) && Intrinsics.areEqual(this.topOffsetEnd, spanData.topOffsetEnd) && this.underline == spanData.underline;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31;
        DivTextAlignmentVertical divTextAlignmentVertical = this.alignmentVertical;
        int hashCode2 = (((hashCode + (divTextAlignmentVertical == null ? 0 : divTextAlignmentVertical.hashCode())) * 31) + Integer.hashCode(this.baselineOffset)) * 31;
        String str = this.fontFamily;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fontFeatureSettings;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.fontSize;
        int hashCode5 = (((hashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.fontSizeUnit.hashCode()) * 31;
        DivFontWeight divFontWeight = this.fontWeight;
        int hashCode6 = (hashCode5 + (divFontWeight == null ? 0 : divFontWeight.hashCode())) * 31;
        Integer num2 = this.fontWeightValue;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        JSONObject jSONObject = this.fontVariationSettings;
        int hashCode8 = (hashCode7 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        Double d = this.letterSpacing;
        int hashCode9 = (hashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num3 = this.lineHeight;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MaskData maskData = this.mask;
        int hashCode11 = (hashCode10 + (maskData == null ? 0 : maskData.hashCode())) * 31;
        DivLineStyle divLineStyle = this.strike;
        int hashCode12 = (hashCode11 + (divLineStyle == null ? 0 : divLineStyle.hashCode())) * 31;
        Integer num4 = this.textColor;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        ShadowData shadowData = this.textShadow;
        int hashCode14 = (hashCode13 + (shadowData == null ? 0 : shadowData.hashCode())) * 31;
        Integer num5 = this.topOffset;
        int hashCode15 = (hashCode14 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.topOffsetStart;
        int hashCode16 = (hashCode15 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.topOffsetEnd;
        int hashCode17 = (hashCode16 + (num7 == null ? 0 : num7.hashCode())) * 31;
        DivLineStyle divLineStyle2 = this.underline;
        return hashCode17 + (divLineStyle2 != null ? divLineStyle2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpanData(start=" + this.start + ", end=" + this.end + ", alignmentVertical=" + this.alignmentVertical + ", baselineOffset=" + this.baselineOffset + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", fontSize=" + this.fontSize + ", fontSizeUnit=" + this.fontSizeUnit + ", fontWeight=" + this.fontWeight + ", fontWeightValue=" + this.fontWeightValue + ", fontVariationSettings=" + this.fontVariationSettings + ", letterSpacing=" + this.letterSpacing + ", lineHeight=" + this.lineHeight + ", mask=" + this.mask + ", strike=" + this.strike + ", textColor=" + this.textColor + ", textShadow=" + this.textShadow + ", topOffset=" + this.topOffset + ", topOffsetStart=" + this.topOffsetStart + ", topOffsetEnd=" + this.topOffsetEnd + ", underline=" + this.underline + ')';
    }

    public SpanData(int i, int i2, @Nullable DivTextAlignmentVertical divTextAlignmentVertical, @Px int i3, @Nullable String str, @Nullable String str2, @Px @Nullable Integer num, @NotNull DivSizeUnit divSizeUnit, @Nullable DivFontWeight divFontWeight, @Nullable Integer num2, @Nullable JSONObject jSONObject, @Nullable Double d, @Px @Nullable Integer num3, @Nullable MaskData maskData, @Nullable DivLineStyle divLineStyle, @ColorInt @Nullable Integer num4, @Nullable ShadowData shadowData, @Px @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable DivLineStyle divLineStyle2) {
        this.start = i;
        this.end = i2;
        this.alignmentVertical = divTextAlignmentVertical;
        this.baselineOffset = i3;
        this.fontFamily = str;
        this.fontFeatureSettings = str2;
        this.fontSize = num;
        this.fontSizeUnit = divSizeUnit;
        this.fontWeight = divFontWeight;
        this.fontWeightValue = num2;
        this.fontVariationSettings = jSONObject;
        this.letterSpacing = d;
        this.lineHeight = num3;
        this.mask = maskData;
        this.strike = divLineStyle;
        this.textColor = num4;
        this.textShadow = shadowData;
        this.topOffset = num5;
        this.topOffsetStart = num6;
        this.topOffsetEnd = num7;
        this.underline = divLineStyle2;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getEnd() {
        return this.end;
    }

    @Nullable
    public final DivTextAlignmentVertical getAlignmentVertical() {
        return this.alignmentVertical;
    }

    public final int getBaselineOffset() {
        return this.baselineOffset;
    }

    @Nullable
    public final String getFontFamily() {
        return this.fontFamily;
    }

    @Nullable
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    @Nullable
    public final Integer getFontSize() {
        return this.fontSize;
    }

    @NotNull
    public final DivSizeUnit getFontSizeUnit() {
        return this.fontSizeUnit;
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
    public final JSONObject getFontVariationSettings() {
        return this.fontVariationSettings;
    }

    @Nullable
    public final Double getLetterSpacing() {
        return this.letterSpacing;
    }

    @Nullable
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    @Nullable
    public final MaskData getMask() {
        return this.mask;
    }

    @Nullable
    public final DivLineStyle getStrike() {
        return this.strike;
    }

    @Nullable
    public final Integer getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final ShadowData getTextShadow() {
        return this.textShadow;
    }

    @Nullable
    public final Integer getTopOffset() {
        return this.topOffset;
    }

    @Nullable
    public final Integer getTopOffsetStart() {
        return this.topOffsetStart;
    }

    @Nullable
    public final Integer getTopOffsetEnd() {
        return this.topOffsetEnd;
    }

    @Nullable
    public final DivLineStyle getUnderline() {
        return this.underline;
    }

    public static /* synthetic */ SpanData mergeWith$default(SpanData spanData, SpanData spanData2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = spanData2.start;
        }
        if ((i3 & 4) != 0) {
            i2 = spanData2.end;
        }
        return spanData.mergeWith(spanData2, i, i2);
    }

    @NotNull
    public final SpanData mergeWith(@NotNull SpanData span, int start, int end) {
        DivTextAlignmentVertical divTextAlignmentVertical = span.alignmentVertical;
        if (divTextAlignmentVertical == null) {
            divTextAlignmentVertical = this.alignmentVertical;
        }
        DivTextAlignmentVertical divTextAlignmentVertical2 = divTextAlignmentVertical;
        int i = span.baselineOffset;
        if (i == 0) {
            i = this.baselineOffset;
        }
        int i2 = i;
        String str = span.fontFamily;
        if (str == null) {
            str = this.fontFamily;
        }
        String str2 = str;
        String str3 = span.fontFeatureSettings;
        if (str3 == null) {
            str3 = this.fontFeatureSettings;
        }
        String str4 = str3;
        Integer num = span.fontSize;
        if (num == null) {
            num = this.fontSize;
        }
        Integer num2 = num;
        DivSizeUnit divSizeUnit = span.fontSizeUnit;
        if (divSizeUnit == DEFAULT_FONT_SIZE_UNIT) {
            divSizeUnit = this.fontSizeUnit;
        }
        DivSizeUnit divSizeUnit2 = divSizeUnit;
        DivFontWeight divFontWeight = span.fontWeight;
        if (divFontWeight == null) {
            divFontWeight = this.fontWeight;
        }
        DivFontWeight divFontWeight2 = divFontWeight;
        Integer num3 = span.fontWeightValue;
        if (num3 == null) {
            num3 = this.fontWeightValue;
        }
        Integer num4 = num3;
        JSONObject jSONObject = span.fontVariationSettings;
        if (jSONObject == null) {
            jSONObject = this.fontVariationSettings;
        }
        JSONObject jSONObject2 = jSONObject;
        Double d = span.letterSpacing;
        if (d == null) {
            d = this.letterSpacing;
        }
        Double d2 = d;
        Integer num5 = span.lineHeight;
        if (num5 == null) {
            num5 = this.lineHeight;
        }
        Integer num6 = num5;
        MaskData maskData = span.mask;
        if (maskData == null) {
            maskData = this.mask;
        }
        MaskData maskData2 = maskData;
        DivLineStyle divLineStyle = span.strike;
        if (divLineStyle == null) {
            divLineStyle = this.strike;
        }
        DivLineStyle divLineStyle2 = divLineStyle;
        Integer num7 = span.textColor;
        if (num7 == null) {
            num7 = this.textColor;
        }
        Integer num8 = num7;
        ShadowData shadowData = span.textShadow;
        if (shadowData == null) {
            shadowData = this.textShadow;
        }
        ShadowData shadowData2 = shadowData;
        Integer num9 = span.topOffset;
        Integer num10 = num9 == null ? this.topOffset : num9;
        Integer num11 = num9 != null ? span.topOffsetStart : this.topOffsetStart;
        Integer num12 = num9 != null ? span.topOffsetEnd : this.topOffsetEnd;
        DivLineStyle divLineStyle3 = span.underline;
        if (divLineStyle3 == null) {
            divLineStyle3 = this.underline;
        }
        return new SpanData(start, end, divTextAlignmentVertical2, i2, str2, str4, num2, divSizeUnit2, divFontWeight2, num4, jSONObject2, d2, num6, maskData2, divLineStyle2, num8, shadowData2, num10, num11, num12, divLineStyle3);
    }

    public final boolean isEmpty() {
        return this.alignmentVertical == null && this.baselineOffset == 0 && this.fontFamily == null && this.fontFeatureSettings == null && this.fontSize == null && this.fontSizeUnit == DEFAULT_FONT_SIZE_UNIT && this.fontWeight == null && this.fontWeightValue == null && this.letterSpacing == null && this.lineHeight == null && this.mask == null && this.strike == null && this.textColor == null && this.textShadow == null && this.topOffset == null && this.topOffsetStart == null && this.topOffsetEnd == null && this.underline == null;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull SpanData other) {
        return this.start - other.start;
    }

    /* compiled from: SpanData.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000bJ%\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/view2/spannable/SpanData$Companion;", "", "()V", "DEFAULT_BASELINE_OFFSET", "", "DEFAULT_FONT_SIZE_UNIT", "Lcom/yandex/div2/DivSizeUnit;", "empty", "Lcom/yandex/div/core/view2/spannable/SpanData;", "start", "end", "empty$div_release", "lineHeight", "lineHeight$div_release", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final SpanData empty$div_release(int start, int end) {
            return new SpanData(start, end, null, 0, null, null, null, SpanData.DEFAULT_FONT_SIZE_UNIT, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }

        @NotNull
        public final SpanData lineHeight$div_release(int start, int end, int lineHeight) {
            return new SpanData(start, end, null, 0, null, null, null, SpanData.DEFAULT_FONT_SIZE_UNIT, null, null, null, null, Integer.valueOf(lineHeight), null, null, null, null, null, null, null, null);
        }
    }
}
