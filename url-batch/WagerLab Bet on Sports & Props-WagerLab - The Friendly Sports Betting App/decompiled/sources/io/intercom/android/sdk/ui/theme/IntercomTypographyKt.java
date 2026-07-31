package io.intercom.android.sdk.ui.theme;

import androidx.compose.material3.Typography;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
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
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomTypography.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0001H\u0000\"\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"defaultIntercomTypography", "Lio/intercom/android/sdk/ui/theme/IntercomTypography;", "toMaterialTypography", "Landroidx/compose/material3/Typography;", "LocalIntercomTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalIntercomTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomTypographyKt {
    private static final ProvidableCompositionLocal<IntercomTypography> LocalIntercomTypography = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: io.intercom.android.sdk.ui.theme.IntercomTypographyKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            IntercomTypography defaultIntercomTypography;
            defaultIntercomTypography = IntercomTypographyKt.defaultIntercomTypography();
            return defaultIntercomTypography;
        }
    });

    public static final IntercomTypography defaultIntercomTypography() {
        return new IntercomTypography(new TextStyle(0L, TextUnitKt.getSp(32), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(48), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646137, (DefaultConstructorMarker) null), new TextStyle(0L, TextUnitKt.getSp(28), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(32), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646137, (DefaultConstructorMarker) null), new TextStyle(0L, TextUnitKt.getSp(20), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646137, (DefaultConstructorMarker) null), new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646137, (DefaultConstructorMarker) null), new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646137, (DefaultConstructorMarker) null), new TextStyle(0L, TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(18), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646137, (DefaultConstructorMarker) null), new TextStyle(0L, TextUnitKt.getSp(12), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(18), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646137, (DefaultConstructorMarker) null));
    }

    public static final Typography toMaterialTypography(IntercomTypography intercomTypography) {
        Typography copy;
        Intrinsics.checkNotNullParameter(intercomTypography, "<this>");
        copy = r2.copy((r32 & 1) != 0 ? r2.displayLarge : null, (r32 & 2) != 0 ? r2.displayMedium : null, (r32 & 4) != 0 ? r2.displaySmall : null, (r32 & 8) != 0 ? r2.headlineLarge : null, (r32 & 16) != 0 ? r2.headlineMedium : null, (r32 & 32) != 0 ? r2.headlineSmall : null, (r32 & 64) != 0 ? r2.titleLarge : null, (r32 & 128) != 0 ? r2.titleMedium : null, (r32 & 256) != 0 ? r2.titleSmall : null, (r32 & 512) != 0 ? r2.bodyLarge : intercomTypography.getType04(), (r32 & 1024) != 0 ? r2.bodyMedium : intercomTypography.getType04Point5(), (r32 & 2048) != 0 ? r2.bodySmall : null, (r32 & 4096) != 0 ? r2.labelLarge : null, (r32 & 8192) != 0 ? r2.labelMedium : intercomTypography.getType05(), (r32 & 16384) != 0 ? new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null).labelSmall : null);
        return copy;
    }

    public static final ProvidableCompositionLocal<IntercomTypography> getLocalIntercomTypography() {
        return LocalIntercomTypography;
    }
}
