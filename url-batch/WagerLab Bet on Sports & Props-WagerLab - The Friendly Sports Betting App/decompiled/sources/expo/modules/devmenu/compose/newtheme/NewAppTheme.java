package expo.modules.devmenu.compose.newtheme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import com.facebook.react.uimanager.ViewProps;
import io.github.lukmccall.colors.RadixPallet;
import kotlin.Metadata;

/* compiled from: AppTheme.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lexpo/modules/devmenu/compose/newtheme/NewAppTheme;", "", "<init>", "()V", "pallet", "Lio/github/lukmccall/colors/RadixPallet;", "Landroidx/compose/ui/graphics/Color;", "getPallet", "(Landroidx/compose/runtime/Composer;I)Lio/github/lukmccall/colors/RadixPallet;", "spacing", "Lexpo/modules/devmenu/compose/newtheme/Spacing;", "getSpacing", "(Landroidx/compose/runtime/Composer;I)Lexpo/modules/devmenu/compose/newtheme/Spacing;", "isDarkTheme", "", "(Landroidx/compose/runtime/Composer;I)Z", ViewProps.BORDER_RADIUS, "Lexpo/modules/devmenu/compose/newtheme/BorderRadius;", "getBorderRadius", "(Landroidx/compose/runtime/Composer;I)Lexpo/modules/devmenu/compose/newtheme/BorderRadius;", "colors", "Lexpo/modules/devmenu/compose/newtheme/Colors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Lexpo/modules/devmenu/compose/newtheme/Colors;", "font", "Lexpo/modules/devmenu/compose/newtheme/Typography;", "getFont", "(Landroidx/compose/runtime/Composer;I)Lexpo/modules/devmenu/compose/newtheme/Typography;", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NewAppTheme {
    public static final int $stable = 0;
    public static final NewAppTheme INSTANCE = new NewAppTheme();

    private NewAppTheme() {
    }

    public final RadixPallet<Color> getPallet(Composer composer, int i) {
        composer.startReplaceGroup(1090326255);
        ComposerKt.sourceInformation(composer, "C(<get-pallet>)89@2031L7:AppTheme.kt#eghf0e");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1090326255, i, -1, "expo.modules.devmenu.compose.newtheme.NewAppTheme.<get-pallet> (AppTheme.kt:89)");
        }
        ProvidableCompositionLocal<RadixPallet<Color>> localPallet = AppThemeKt.getLocalPallet();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localPallet);
        ComposerKt.sourceInformationMarkerEnd(composer);
        RadixPallet<Color> radixPallet = (RadixPallet) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return radixPallet;
    }

    public final Spacing getSpacing(Composer composer, int i) {
        composer.startReplaceGroup(179971092);
        ComposerKt.sourceInformation(composer, "C(<get-spacing>)92@2091L7:AppTheme.kt#eghf0e");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(179971092, i, -1, "expo.modules.devmenu.compose.newtheme.NewAppTheme.<get-spacing> (AppTheme.kt:92)");
        }
        ProvidableCompositionLocal<Spacing> localSpacing = AppThemeKt.getLocalSpacing();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localSpacing);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Spacing spacing = (Spacing) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return spacing;
    }

    public final boolean isDarkTheme(Composer composer, int i) {
        composer.startReplaceGroup(-616964861);
        ComposerKt.sourceInformation(composer, "C(<get-isDarkTheme>)95@2159L7:AppTheme.kt#eghf0e");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-616964861, i, -1, "expo.modules.devmenu.compose.newtheme.NewAppTheme.<get-isDarkTheme> (AppTheme.kt:95)");
        }
        ProvidableCompositionLocal<Boolean> localIsDarkTheme = AppThemeKt.getLocalIsDarkTheme();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localIsDarkTheme);
        ComposerKt.sourceInformationMarkerEnd(composer);
        boolean booleanValue = ((Boolean) consume).booleanValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return booleanValue;
    }

    public final BorderRadius getBorderRadius(Composer composer, int i) {
        composer.startReplaceGroup(850084093);
        ComposerKt.sourceInformation(composer, "C(<get-borderRadius>)98@2229L7:AppTheme.kt#eghf0e");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(850084093, i, -1, "expo.modules.devmenu.compose.newtheme.NewAppTheme.<get-borderRadius> (AppTheme.kt:98)");
        }
        ProvidableCompositionLocal<BorderRadius> localBorderRadius = AppThemeKt.getLocalBorderRadius();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localBorderRadius);
        ComposerKt.sourceInformationMarkerEnd(composer);
        BorderRadius borderRadius = (BorderRadius) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return borderRadius;
    }

    public final Colors getColors(Composer composer, int i) {
        composer.startReplaceGroup(-1387961941);
        ComposerKt.sourceInformation(composer, "C(<get-colors>)101@2287L7:AppTheme.kt#eghf0e");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1387961941, i, -1, "expo.modules.devmenu.compose.newtheme.NewAppTheme.<get-colors> (AppTheme.kt:101)");
        }
        ProvidableCompositionLocal<Colors> localColors = AppThemeKt.getLocalColors();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localColors);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Colors colors = (Colors) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return colors;
    }

    public final Typography getFont(Composer composer, int i) {
        composer.startReplaceGroup(2059945516);
        ComposerKt.sourceInformation(composer, "C(<get-font>)104@2347L7:AppTheme.kt#eghf0e");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2059945516, i, -1, "expo.modules.devmenu.compose.newtheme.NewAppTheme.<get-font> (AppTheme.kt:104)");
        }
        ProvidableCompositionLocal<Typography> localTypography = AppThemeKt.getLocalTypography();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localTypography);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Typography typography = (Typography) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return typography;
    }
}
