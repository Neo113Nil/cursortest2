package expo.modules.devmenu.compose.primitives;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: Spacer.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Spacer", "", "height", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "Spacer--orJrPs", "(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SpacerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Spacer__orJrPs$lambda$0(float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m10818SpacerorJrPs(f, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: Spacer--orJrPs, reason: not valid java name */
    public static final void m10818SpacerorJrPs(final float f, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1169790480);
        ComposerKt.sourceInformation(startRestartGroup, "C(Spacer)P(0:c#ui.unit.Dp)13@402L87:Spacer.kt#k98qbf");
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && startRestartGroup.changed(f)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "10@319L7");
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    f = NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10807get2D9Ej5fM();
                    i3 &= -15;
                }
                if (i4 != 0) {
                    modifier = null;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1169790480, i3, -1, "expo.modules.devmenu.compose.primitives.Spacer (Spacer.kt:12)");
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(Modifier.INSTANCE.then(modifier == null ? SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f) : modifier), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.primitives.SpacerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Spacer__orJrPs$lambda$0;
                    Spacer__orJrPs$lambda$0 = SpacerKt.Spacer__orJrPs$lambda$0(f, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return Spacer__orJrPs$lambda$0;
                }
            });
        }
    }
}
