package expo.modules.devmenu.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import expo.modules.devmenu.DevToolsSettings;
import expo.modules.devmenu.compose.DevMenuAction;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import expo.modules.devmenu.compose.primitives.SpacerKt;
import expo.modules.devmenu.compose.primitives.SurfaceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ToolsSection.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"ToolsSection", "", "onAction", "Lkotlin/Function1;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "Lexpo/modules/devmenu/compose/DevMenuActionHandler;", "devToolsSettings", "Lexpo/modules/devmenu/DevToolsSettings;", "showFab", "", "(Lkotlin/jvm/functions/Function1;Lexpo/modules/devmenu/DevToolsSettings;ZLandroidx/compose/runtime/Composer;I)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToolsSectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToolsSection$lambda$0(Function1 function1, DevToolsSettings devToolsSettings, boolean z, int i, Composer composer, int i2) {
        ToolsSection(function1, devToolsSettings, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ToolsSection(final Function1<? super DevMenuAction, Unit> onAction, final DevToolsSettings devToolsSettings, final boolean z, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(devToolsSettings, "devToolsSettings");
        Composer startRestartGroup = composer.startRestartGroup(433925417);
        ComposerKt.sourceInformation(startRestartGroup, "C(ToolsSection)P(1)21@799L23,25@845L7,25@826L31,27@876L2395,27@861L2410:ToolsSection.kt#aaq0h9");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(onAction) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(devToolsSettings) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(433925417, i2, -1, "expo.modules.devmenu.compose.ui.ToolsSection (ToolsSection.kt:20)");
            }
            Section.INSTANCE.Header("TOOLS", startRestartGroup, 54);
            SpacerKt.m10818SpacerorJrPs(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10808get3D9Ej5fM(), null, startRestartGroup, 0, 2);
            SurfaceKt.m10819RoundedSurfaceOu1YvPQ(null, 0.0f, 0L, null, ComposableLambdaKt.rememberComposableLambda(-218210118, true, new ToolsSectionKt$ToolsSection$1(onAction, devToolsSettings, z), startRestartGroup, 54), startRestartGroup, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.ToolsSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ToolsSection$lambda$0;
                    ToolsSection$lambda$0 = ToolsSectionKt.ToolsSection$lambda$0(Function1.this, devToolsSettings, z, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ToolsSection$lambda$0;
                }
            });
        }
    }
}
