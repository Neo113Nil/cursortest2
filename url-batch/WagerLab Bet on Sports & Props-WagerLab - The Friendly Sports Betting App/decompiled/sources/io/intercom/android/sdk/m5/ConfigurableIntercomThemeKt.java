package io.intercom.android.sdk.m5;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.CustomizationColorsModel;
import io.intercom.android.sdk.models.CustomizationModel;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomColorsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ThemeUtils;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigurableIntercomTheme.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"ConfigurableIntercomTheme", "", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lio/intercom/android/sdk/identity/AppConfig;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConfigurableIntercomThemeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfigurableIntercomTheme$lambda$3(AppConfig appConfig, Function2 content, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(appConfig, "$appConfig");
        Intrinsics.checkNotNullParameter(content, "$content");
        ConfigurableIntercomTheme(appConfig, content, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0054, code lost:
    
        if (androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(r5, 0) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfigurableIntercomTheme(final AppConfig appConfig, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        boolean z;
        CustomizationColorsModel actionContrastDark;
        CustomizationModel customizationModel;
        Color m5647boximpl;
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(180143044);
        ConfigModules configModules = appConfig.getConfigModules();
        IntercomColors intercomColors = null;
        CustomizationModel customization = configModules != null ? configModules.getCustomization() : null;
        startRestartGroup.startReplaceGroup(-1126606345);
        if (customization != null) {
            ThemeMode currentThemeMode = ThemeManager.INSTANCE.getCurrentThemeMode();
            startRestartGroup.startReplaceGroup(-1126607475);
            if (currentThemeMode != ThemeMode.DARK) {
                if (currentThemeMode != ThemeMode.LIGHT) {
                    if (currentThemeMode != ThemeMode.SYSTEM) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                z = true;
                startRestartGroup.endReplaceGroup();
                long composeColor$default = ColorExtensionsKt.toComposeColor$default(ThemeUtils.INSTANCE.selectColorForThemeCompose$intercom_sdk_base_release(customization.getAction().getBackgroundColor(), customization.getAction().getBackgroundColorDark(), startRestartGroup, 384), 0.0f, 1, null);
                long composeColor$default2 = ColorExtensionsKt.toComposeColor$default(ThemeUtils.INSTANCE.selectColorForThemeCompose$intercom_sdk_base_release(customization.getAction().getForegroundColor(), customization.getAction().getForegroundColorDark(), startRestartGroup, 384), 0.0f, 1, null);
                if (!z) {
                    actionContrastDark = customization.getActionContrastWhite();
                } else {
                    actionContrastDark = customization.getActionContrastDark();
                    if (actionContrastDark == null) {
                        actionContrastDark = customization.getActionContrastWhite();
                    }
                }
                startRestartGroup.startReplaceGroup(-1126577992);
                if (actionContrastDark != null) {
                    customizationModel = customization;
                    m5647boximpl = null;
                } else {
                    customizationModel = customization;
                    m5647boximpl = Color.m5647boximpl(ColorExtensionsKt.toComposeColor$default(ThemeUtils.INSTANCE.selectColorForThemeCompose$intercom_sdk_base_release(actionContrastDark.getBackgroundColor(), actionContrastDark.getBackgroundColorDark(), startRestartGroup, 384), 0.0f, 1, null));
                }
                startRestartGroup.endReplaceGroup();
                long m5667unboximpl = m5647boximpl == null ? m5647boximpl.m5667unboximpl() : composeColor$default;
                startRestartGroup.startReplaceGroup(-1126568904);
                Color m5647boximpl2 = actionContrastDark != null ? null : Color.m5647boximpl(ColorExtensionsKt.toComposeColor$default(ThemeUtils.INSTANCE.selectColorForThemeCompose$intercom_sdk_base_release(actionContrastDark.getForegroundColor(), actionContrastDark.getForegroundColorDark(), startRestartGroup, 384), 0.0f, 1, null));
                startRestartGroup.endReplaceGroup();
                intercomColors = IntercomColorsKt.m12185getIntercomColorshIzCY_Q(composeColor$default, composeColor$default2, m5667unboximpl, m5647boximpl2 == null ? m5647boximpl2.m5667unboximpl() : composeColor$default2, ColorExtensionsKt.toComposeColor$default(ThemeUtils.INSTANCE.selectColorForThemeCompose$intercom_sdk_base_release(customizationModel.getHeader().getBackgroundColor(), customizationModel.getHeader().getBackgroundColorDark(), startRestartGroup, 384), 0.0f, 1, null), ColorExtensionsKt.toComposeColor$default(ThemeUtils.INSTANCE.selectColorForThemeCompose$intercom_sdk_base_release(customizationModel.getHeader().getForegroundColor(), customizationModel.getHeader().getForegroundColorDark(), startRestartGroup, 384), 0.0f, 1, null), z, (r29 & 128) != 0 ? null : null);
            }
            z = false;
            startRestartGroup.endReplaceGroup();
            long composeColor$default3 = ColorExtensionsKt.toComposeColor$default(ThemeUtils.INSTANCE.selectColorForThemeCompose$intercom_sdk_base_release(customization.getAction().getBackgroundColor(), customization.getAction().getBackgroundColorDark(), startRestartGroup, 384), 0.0f, 1, null);
            long composeColor$default22 = ColorExtensionsKt.toComposeColor$default(ThemeUtils.INSTANCE.selectColorForThemeCompose$intercom_sdk_base_release(customization.getAction().getForegroundColor(), customization.getAction().getForegroundColorDark(), startRestartGroup, 384), 0.0f, 1, null);
            if (!z) {
            }
            startRestartGroup.startReplaceGroup(-1126577992);
            if (actionContrastDark != null) {
            }
            startRestartGroup.endReplaceGroup();
            if (m5647boximpl == null) {
            }
            startRestartGroup.startReplaceGroup(-1126568904);
            if (actionContrastDark != null) {
            }
            startRestartGroup.endReplaceGroup();
            intercomColors = IntercomColorsKt.m12185getIntercomColorshIzCY_Q(composeColor$default3, composeColor$default22, m5667unboximpl, m5647boximpl2 == null ? m5647boximpl2.m5667unboximpl() : composeColor$default22, ColorExtensionsKt.toComposeColor$default(ThemeUtils.INSTANCE.selectColorForThemeCompose$intercom_sdk_base_release(customizationModel.getHeader().getBackgroundColor(), customizationModel.getHeader().getBackgroundColorDark(), startRestartGroup, 384), 0.0f, 1, null), ColorExtensionsKt.toComposeColor$default(ThemeUtils.INSTANCE.selectColorForThemeCompose$intercom_sdk_base_release(customizationModel.getHeader().getForegroundColor(), customizationModel.getHeader().getForegroundColorDark(), startRestartGroup, 384), 0.0f, 1, null), z, (r29 & 128) != 0 ? null : null);
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1126607561);
        if (intercomColors == null) {
            intercomColors = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable);
        }
        startRestartGroup.endReplaceGroup();
        IntercomThemeKt.IntercomTheme(intercomColors, null, null, content, startRestartGroup, (i << 6) & 7168, 6);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ConfigurableIntercomTheme$lambda$3;
                    ConfigurableIntercomTheme$lambda$3 = ConfigurableIntercomThemeKt.ConfigurableIntercomTheme$lambda$3(AppConfig.this, content, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ConfigurableIntercomTheme$lambda$3;
                }
            });
        }
    }
}
