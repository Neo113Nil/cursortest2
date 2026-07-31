package io.intercom.android.sdk.ui.theme;

import android.view.View;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomTheme.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\"\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"IntercomTheme", "", "colors", "Lio/intercom/android/sdk/ui/theme/IntercomColors;", "typography", "Lio/intercom/android/sdk/ui/theme/IntercomTypography;", "shapes", "Landroidx/compose/material3/Shapes;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lio/intercom/android/sdk/ui/theme/IntercomColors;Lio/intercom/android/sdk/ui/theme/IntercomTypography;Landroidx/compose/material3/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "isDarkThemeInEditMode", "", "(Landroidx/compose/runtime/Composer;I)Z", "LocalShapes", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalShapes", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomThemeKt {
    private static final ProvidableCompositionLocal<Shapes> LocalShapes = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: io.intercom.android.sdk.ui.theme.IntercomThemeKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Shapes LocalShapes$lambda$1;
            LocalShapes$lambda$1 = IntercomThemeKt.LocalShapes$lambda$1();
            return LocalShapes$lambda$1;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomTheme$lambda$0(IntercomColors intercomColors, IntercomTypography intercomTypography, Shapes shapes, Function2 content, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(content, "$content");
        IntercomTheme(intercomColors, intercomTypography, shapes, content, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void IntercomTheme(IntercomColors intercomColors, final IntercomTypography intercomTypography, final Shapes shapes, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        final IntercomColors intercomColors2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(163228735);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(intercomColors) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(intercomTypography)) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(shapes)) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    intercomColors = null;
                }
                if ((i2 & 2) != 0) {
                    intercomTypography = IntercomTheme.INSTANCE.getTypography(startRestartGroup, 6);
                }
                if ((i2 & 4) != 0) {
                    shapes = IntercomTheme.INSTANCE.getShapes(startRestartGroup, 6);
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceGroup(-541037209);
            if (intercomColors != null) {
                intercomColors2 = intercomColors;
            } else if (isDarkThemeInEditMode(startRestartGroup, 0)) {
                intercomColors2 = IntercomColorsKt.intercomDarkColors();
            } else {
                ThemeMode currentThemeMode = ThemeManager.INSTANCE.getCurrentThemeMode();
                if (currentThemeMode == ThemeMode.DARK) {
                    intercomColors2 = IntercomColorsKt.intercomDarkColors();
                } else if (currentThemeMode == ThemeMode.LIGHT) {
                    intercomColors2 = IntercomColorsKt.intercomLightColors();
                } else {
                    if (currentThemeMode != ThemeMode.SYSTEM) {
                        throw new NoWhenBranchMatchedException();
                    }
                    intercomColors2 = DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0) ? IntercomColorsKt.intercomDarkColors() : IntercomColorsKt.intercomLightColors();
                }
            }
            startRestartGroup.endReplaceGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{IntercomColorsKt.getLocalIntercomColors().provides(intercomColors2), IntercomTypographyKt.getLocalIntercomTypography().provides(intercomTypography), ContentColorKt.getLocalContentColor().provides(Color.m5647boximpl(intercomColors2.m12174getPrimaryText0d7_KjU()))}, ComposableLambdaKt.rememberComposableLambda(1689661311, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.theme.IntercomThemeKt$IntercomTheme$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                        MaterialThemeKt.MaterialTheme(IntercomColorsKt.toMaterialColors(IntercomColors.this), shapes, IntercomTypographyKt.toMaterialTypography(intercomTypography), content, composer2, 0, 0);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final IntercomColors intercomColors3 = intercomColors;
        final IntercomTypography intercomTypography2 = intercomTypography;
        final Shapes shapes2 = shapes;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.theme.IntercomThemeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit IntercomTheme$lambda$0;
                    IntercomTheme$lambda$0 = IntercomThemeKt.IntercomTheme$lambda$0(IntercomColors.this, intercomTypography2, shapes2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return IntercomTheme$lambda$0;
                }
            });
        }
    }

    private static final boolean isDarkThemeInEditMode(Composer composer, int i) {
        composer.startReplaceGroup(-320047698);
        boolean z = false;
        if (DarkThemeKt.isSystemInDarkTheme(composer, 0)) {
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (((View) consume).isInEditMode()) {
                z = true;
            }
        }
        composer.endReplaceGroup();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shapes LocalShapes$lambda$1() {
        return new Shapes(null, null, null, null, null, 31, null);
    }

    public static final ProvidableCompositionLocal<Shapes> getLocalShapes() {
        return LocalShapes;
    }
}
