package expo.modules.devmenu.compose.ui;

import androidx.compose.material.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import expo.modules.devmenu.compose.primitives.TextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuickAction.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"QuickAction", "", "label", "", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ON_CLICK, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class QuickActionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickAction$lambda$0(String str, Function2 function2, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        QuickAction(str, function2, modifier, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void QuickAction(final String label, final Function2<? super Composer, ? super Integer, Unit> icon, Modifier modifier, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(104140788);
        ComposerKt.sourceInformation(startRestartGroup, "C(QuickAction)P(1)18@491L126,15@420L224:QuickAction.kt#aaq0h9");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(icon) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(104140788, i3, -1, "expo.modules.devmenu.compose.ui.QuickAction (QuickAction.kt:14)");
            }
            Modifier modifier3 = modifier;
            MenuButtonKt.m10864NewMenuButton0vH8DBg(modifier3, icon, ComposableLambdaKt.rememberComposableLambda(-711945296, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.QuickActionKt$QuickAction$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ComposerKt.sourceInformation(composer2, "C21@558L4,19@499L112:QuickAction.kt#aaq0h9");
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-711945296, i5, -1, "expo.modules.devmenu.compose.ui.QuickAction.<anonymous> (QuickAction.kt:19)");
                    }
                    TextKt.m10822NewTextnUFttAo(label, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(composer2, 6).getMd(), 0L, 0L, FontWeight.INSTANCE.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777211, null), 0L, 0, false, 0, (Modifier) null, composer2, 0, 124);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), null, false, false, 0.0f, onClick, startRestartGroup, ((i3 >> 6) & 14) | 384 | (i3 & 112) | ((i3 << 12) & 29360128), MenuKt.InTransitionDuration);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.QuickActionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit QuickAction$lambda$0;
                    QuickAction$lambda$0 = QuickActionKt.QuickAction$lambda$0(label, icon, modifier2, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return QuickAction$lambda$0;
                }
            });
        }
    }
}
