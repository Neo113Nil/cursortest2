package expo.modules.devmenu.compose.newtheme;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
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
import expo.modules.devmenu.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Typography.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006\u0016"}, d2 = {"Lexpo/modules/devmenu/compose/newtheme/Typography;", "", "<init>", "()V", "inter", "Landroidx/compose/ui/text/font/FontFamily;", "getInter", "()Landroidx/compose/ui/text/font/FontFamily;", "mono", "getMono", "sm", "Landroidx/compose/ui/text/TextStyle;", "getSm", "()Landroidx/compose/ui/text/TextStyle;", "md", "getMd", "lg", "getLg", "xl", "getXl", "xxl", "getXxl", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Typography {
    public static final int $stable = 0;
    public static final Typography INSTANCE = new Typography();
    private static final FontFamily inter = FontFamilyKt.FontFamily(FontKt.m7929FontYpTlLL0$default(R.font.inter_regular, FontWeight.INSTANCE.getNormal(), 0, 0, 12, null), FontKt.m7929FontYpTlLL0$default(R.font.inter_medium, FontWeight.INSTANCE.getMedium(), 0, 0, 12, null), FontKt.m7929FontYpTlLL0$default(R.font.inter_semibold, FontWeight.INSTANCE.getSemiBold(), 0, 0, 12, null));
    private static final FontFamily mono = FontFamilyKt.FontFamily(FontKt.m7929FontYpTlLL0$default(R.font.jetbrains_mono_light, FontWeight.INSTANCE.getLight(), 0, 0, 12, null), FontKt.m7929FontYpTlLL0$default(R.font.jetbrains_mono_regular, FontWeight.INSTANCE.getNormal(), 0, 0, 12, null), FontKt.m7929FontYpTlLL0$default(R.font.jetbrains_mono_medium, FontWeight.INSTANCE.getMedium(), 0, 0, 12, null));
    private static final TextStyle sm = new TextStyle(0, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777213, (DefaultConstructorMarker) null);
    private static final TextStyle md = new TextStyle(0, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777213, (DefaultConstructorMarker) null);
    private static final TextStyle lg = new TextStyle(0, TextUnitKt.getSp(16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777213, (DefaultConstructorMarker) null);
    private static final TextStyle xl = new TextStyle(0, TextUnitKt.getSp(18), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777213, (DefaultConstructorMarker) null);
    private static final TextStyle xxl = new TextStyle(0, TextUnitKt.getSp(20), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777213, (DefaultConstructorMarker) null);

    private Typography() {
    }

    public final FontFamily getInter() {
        return inter;
    }

    public final FontFamily getMono() {
        return mono;
    }

    public final TextStyle getSm() {
        return sm;
    }

    public final TextStyle getMd() {
        return md;
    }

    public final TextStyle getLg() {
        return lg;
    }

    public final TextStyle getXl() {
        return xl;
    }

    public final TextStyle getXxl() {
        return xxl;
    }
}
