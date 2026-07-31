package io.intercom.android.sdk.survey.block;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.reactcommunity.rndatetimepicker.Common;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlockRenderData.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000 12\u00020\u0001:\u00011BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u000fJ\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\b\"J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\b$J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\b&JR\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÇ\u0001¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010-\u001a\u00020.H×\u0001J\t\u0010/\u001a\u000200H×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u00062"}, d2 = {"Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;", "", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", ViewProps.LINE_HEIGHT, Common.TEXT_COLOR, "Landroidx/compose/ui/graphics/Color;", "linkTextColor", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "<init>", "(JLandroidx/compose/ui/text/font/FontWeight;JLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/style/TextAlign;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFontSize-XSAIIZE", "()J", "J", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getLineHeight-XSAIIZE", "getTextColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getLinkTextColor-QN2ZGVo", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "toTextStyle", "Landroidx/compose/ui/text/TextStyle;", "toTextStyle$intercom_sdk_base_release", "component1", "component1-XSAIIZE", "component2", "component3", "component3-XSAIIZE", "component4", "component4-QN2ZGVo", "component5", "component5-QN2ZGVo", "component6", "component6-buA522U", "copy", "copy--ZsBm6Y", "(JLandroidx/compose/ui/text/font/FontWeight;JLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/style/TextAlign;)Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BlockRenderTextStyle {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final BlockRenderTextStyle paragraphDefault = new BlockRenderTextStyle(TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), 0, null, null, null, 60, null);
    private final long fontSize;
    private final FontWeight fontWeight;
    private final long lineHeight;
    private final Color linkTextColor;
    private final TextAlign textAlign;
    private final Color textColor;

    public /* synthetic */ BlockRenderTextStyle(long j, FontWeight fontWeight, long j2, Color color, Color color2, TextAlign textAlign, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, fontWeight, j2, color, color2, textAlign);
    }

    /* renamed from: copy--ZsBm6Y$default, reason: not valid java name */
    public static /* synthetic */ BlockRenderTextStyle m11701copyZsBm6Y$default(BlockRenderTextStyle blockRenderTextStyle, long j, FontWeight fontWeight, long j2, Color color, Color color2, TextAlign textAlign, int i, Object obj) {
        if ((i & 1) != 0) {
            j = blockRenderTextStyle.fontSize;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            fontWeight = blockRenderTextStyle.fontWeight;
        }
        FontWeight fontWeight2 = fontWeight;
        if ((i & 4) != 0) {
            j2 = blockRenderTextStyle.lineHeight;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            color = blockRenderTextStyle.textColor;
        }
        return blockRenderTextStyle.m11707copyZsBm6Y(j3, fontWeight2, j4, color, (i & 16) != 0 ? blockRenderTextStyle.linkTextColor : color2, (i & 32) != 0 ? blockRenderTextStyle.textAlign : textAlign);
    }

    /* renamed from: component1-XSAIIZE, reason: not valid java name and from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    /* renamed from: component2, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: component3-XSAIIZE, reason: not valid java name and from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    /* renamed from: component4-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getTextColor() {
        return this.textColor;
    }

    /* renamed from: component5-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getLinkTextColor() {
        return this.linkTextColor;
    }

    /* renamed from: component6-buA522U, reason: not valid java name and from getter */
    public final TextAlign getTextAlign() {
        return this.textAlign;
    }

    /* renamed from: copy--ZsBm6Y, reason: not valid java name */
    public final BlockRenderTextStyle m11707copyZsBm6Y(long fontSize, FontWeight fontWeight, long lineHeight, Color textColor, Color linkTextColor, TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return new BlockRenderTextStyle(fontSize, fontWeight, lineHeight, textColor, linkTextColor, textAlign, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockRenderTextStyle)) {
            return false;
        }
        BlockRenderTextStyle blockRenderTextStyle = (BlockRenderTextStyle) other;
        return TextUnit.m8592equalsimpl0(this.fontSize, blockRenderTextStyle.fontSize) && Intrinsics.areEqual(this.fontWeight, blockRenderTextStyle.fontWeight) && TextUnit.m8592equalsimpl0(this.lineHeight, blockRenderTextStyle.lineHeight) && Intrinsics.areEqual(this.textColor, blockRenderTextStyle.textColor) && Intrinsics.areEqual(this.linkTextColor, blockRenderTextStyle.linkTextColor) && Intrinsics.areEqual(this.textAlign, blockRenderTextStyle.textAlign);
    }

    public int hashCode() {
        int m8596hashCodeimpl = ((((TextUnit.m8596hashCodeimpl(this.fontSize) * 31) + this.fontWeight.hashCode()) * 31) + TextUnit.m8596hashCodeimpl(this.lineHeight)) * 31;
        Color color = this.textColor;
        int m5664hashCodeimpl = (m8596hashCodeimpl + (color == null ? 0 : Color.m5664hashCodeimpl(color.m5667unboximpl()))) * 31;
        Color color2 = this.linkTextColor;
        int m5664hashCodeimpl2 = (m5664hashCodeimpl + (color2 == null ? 0 : Color.m5664hashCodeimpl(color2.m5667unboximpl()))) * 31;
        TextAlign textAlign = this.textAlign;
        return m5664hashCodeimpl2 + (textAlign != null ? TextAlign.m8254hashCodeimpl(textAlign.getValue()) : 0);
    }

    public String toString() {
        return "BlockRenderTextStyle(fontSize=" + ((Object) TextUnit.m8602toStringimpl(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", lineHeight=" + ((Object) TextUnit.m8602toStringimpl(this.lineHeight)) + ", textColor=" + this.textColor + ", linkTextColor=" + this.linkTextColor + ", textAlign=" + this.textAlign + ')';
    }

    private BlockRenderTextStyle(long j, FontWeight fontWeight, long j2, Color color, Color color2, TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        this.fontSize = j;
        this.fontWeight = fontWeight;
        this.lineHeight = j2;
        this.textColor = color;
        this.linkTextColor = color2;
        this.textAlign = textAlign;
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m11708getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BlockRenderTextStyle(long j, FontWeight fontWeight, long j2, Color color, Color color2, TextAlign textAlign, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, fontWeight, r6, r8, (i & 16) != 0 ? r8 : color2, (i & 32) != 0 ? null : textAlign, null);
        long m8606getUnspecifiedXSAIIZE = (i & 4) != 0 ? TextUnit.INSTANCE.m8606getUnspecifiedXSAIIZE() : j2;
        Color color3 = (i & 8) != 0 ? null : color;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m11709getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    /* renamed from: getTextColor-QN2ZGVo, reason: not valid java name */
    public final Color m11712getTextColorQN2ZGVo() {
        return this.textColor;
    }

    /* renamed from: getLinkTextColor-QN2ZGVo, reason: not valid java name */
    public final Color m11710getLinkTextColorQN2ZGVo() {
        return this.linkTextColor;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m11711getTextAlignbuA522U() {
        return this.textAlign;
    }

    /* compiled from: BlockRenderData.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle$Companion;", "", "<init>", "()V", "paragraphDefault", "Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;", "getParagraphDefault", "()Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BlockRenderTextStyle getParagraphDefault() {
            return BlockRenderTextStyle.paragraphDefault;
        }
    }

    public final TextStyle toTextStyle$intercom_sdk_base_release() {
        Color color = this.textColor;
        long m5667unboximpl = color != null ? color.m5667unboximpl() : Color.INSTANCE.m5693getUnspecified0d7_KjU();
        long j = this.fontSize;
        FontWeight fontWeight = this.fontWeight;
        long j2 = this.lineHeight;
        TextAlign textAlign = this.textAlign;
        return new TextStyle(m5667unboximpl, j, fontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m8262getStarte0LSkKk(), 0, j2, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613368, (DefaultConstructorMarker) null);
    }
}
