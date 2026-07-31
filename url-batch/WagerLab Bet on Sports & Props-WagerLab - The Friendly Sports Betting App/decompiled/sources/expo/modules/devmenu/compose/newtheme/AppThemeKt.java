package expo.modules.devmenu.compose.newtheme;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import io.github.lukmccall.colors.RadixPallet;
import io.github.lukmccall.colors.RawColor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppTheme.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u0004\u001a*\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00132\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u001f0\"¢\u0006\u0002\b#H\u0007¢\u0006\u0002\u0010$\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\"\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000e¨\u0006%"}, d2 = {"defaultColorConverter", "Landroidx/compose/ui/graphics/Color;", "rawColor", "Lio/github/lukmccall/colors/RawColor;", "(Lio/github/lukmccall/colors/RawColor;)J", "lightPallet", "Lio/github/lukmccall/colors/RadixPallet;", "getLightPallet", "()Lio/github/lukmccall/colors/RadixPallet;", "darkPallet", "getDarkPallet", "LocalPallet", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPallet", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalSpacing", "Lexpo/modules/devmenu/compose/newtheme/Spacing;", "getLocalSpacing", "LocalIsDarkTheme", "", "getLocalIsDarkTheme", "LocalBorderRadius", "Lexpo/modules/devmenu/compose/newtheme/BorderRadius;", "getLocalBorderRadius", "LocalColors", "Lexpo/modules/devmenu/compose/newtheme/Colors;", "getLocalColors", "LocalTypography", "Lexpo/modules/devmenu/compose/newtheme/Typography;", "getLocalTypography", "AppTheme", "", "isDarkTheme", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppThemeKt {
    private static final RadixPallet<Color> lightPallet = new RadixPallet<>(false, AppThemeKt$lightPallet$1.INSTANCE);
    private static final RadixPallet<Color> darkPallet = new RadixPallet<>(true, AppThemeKt$darkPallet$1.INSTANCE);
    private static final ProvidableCompositionLocal<RadixPallet<Color>> LocalPallet = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: expo.modules.devmenu.compose.newtheme.AppThemeKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            RadixPallet radixPallet;
            radixPallet = AppThemeKt.lightPallet;
            return radixPallet;
        }
    });
    private static final ProvidableCompositionLocal<Spacing> LocalSpacing = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: expo.modules.devmenu.compose.newtheme.AppThemeKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Spacing spacing;
            spacing = Spacing.INSTANCE;
            return spacing;
        }
    });
    private static final ProvidableCompositionLocal<Boolean> LocalIsDarkTheme = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: expo.modules.devmenu.compose.newtheme.AppThemeKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            boolean LocalIsDarkTheme$lambda$2;
            LocalIsDarkTheme$lambda$2 = AppThemeKt.LocalIsDarkTheme$lambda$2();
            return Boolean.valueOf(LocalIsDarkTheme$lambda$2);
        }
    });
    private static final ProvidableCompositionLocal<BorderRadius> LocalBorderRadius = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: expo.modules.devmenu.compose.newtheme.AppThemeKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            BorderRadius borderRadius;
            borderRadius = BorderRadius.INSTANCE;
            return borderRadius;
        }
    });
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: expo.modules.devmenu.compose.newtheme.AppThemeKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Colors LocalColors$lambda$4;
            LocalColors$lambda$4 = AppThemeKt.LocalColors$lambda$4();
            return LocalColors$lambda$4;
        }
    });
    private static final ProvidableCompositionLocal<Typography> LocalTypography = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: expo.modules.devmenu.compose.newtheme.AppThemeKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Typography typography;
            typography = Typography.INSTANCE;
            return typography;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppTheme$lambda$6(boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        AppTheme(z, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalIsDarkTheme$lambda$2() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long defaultColorConverter(RawColor rawColor) {
        if (rawColor instanceof RawColor.SRgb) {
            RawColor.SRgb sRgb = (RawColor.SRgb) rawColor;
            return ColorKt.Color(sRgb.getR(), sRgb.getG(), sRgb.getB(), sRgb.getA(), ColorSpaces.INSTANCE.getSrgb());
        }
        if (!(rawColor instanceof RawColor.P3)) {
            throw new NoWhenBranchMatchedException();
        }
        RawColor.P3 p3 = (RawColor.P3) rawColor;
        return ColorKt.Color(p3.getR(), p3.getG(), p3.getB(), p3.getA(), ColorSpaces.INSTANCE.getDisplayP3());
    }

    public static final RadixPallet<Color> getLightPallet() {
        return lightPallet;
    }

    public static final RadixPallet<Color> getDarkPallet() {
        return darkPallet;
    }

    public static final ProvidableCompositionLocal<RadixPallet<Color>> getLocalPallet() {
        return LocalPallet;
    }

    public static final ProvidableCompositionLocal<Spacing> getLocalSpacing() {
        return LocalSpacing;
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalIsDarkTheme() {
        return LocalIsDarkTheme;
    }

    public static final ProvidableCompositionLocal<BorderRadius> getLocalBorderRadius() {
        return LocalBorderRadius;
    }

    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Colors LocalColors$lambda$4() {
        return new Colors(lightPallet);
    }

    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if ((r11 & 1) != 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppTheme(final boolean z, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        RadixPallet<Color> radixPallet;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-731010685);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppTheme)P(1)76@1668L289:AppTheme.kt#eghf0e");
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && startRestartGroup.changed(z)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "67@1524L21");
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if ((i2 & 1) != 0) {
                    z = DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0);
                    i3 &= -15;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-731010685, i3, -1, "expo.modules.devmenu.compose.newtheme.AppTheme (AppTheme.kt:69)");
                }
                if (z) {
                    radixPallet = darkPallet;
                } else {
                    radixPallet = lightPallet;
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalPallet.provides(radixPallet), LocalSpacing.provides(Spacing.INSTANCE), LocalIsDarkTheme.provides(Boolean.valueOf(z)), LocalBorderRadius.provides(BorderRadius.INSTANCE), LocalColors.provides(new Colors(radixPallet)), LocalTypography.provides(Typography.INSTANCE)}, content, startRestartGroup, ProvidedValue.$stable | (i3 & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.newtheme.AppThemeKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppTheme$lambda$6;
                    AppTheme$lambda$6 = AppThemeKt.AppTheme$lambda$6(z, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AppTheme$lambda$6;
                }
            });
        }
    }
}
