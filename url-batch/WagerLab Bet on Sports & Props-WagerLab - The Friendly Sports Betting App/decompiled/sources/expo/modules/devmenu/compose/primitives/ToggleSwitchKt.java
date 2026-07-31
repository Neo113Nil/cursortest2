package expo.modules.devmenu.compose.primitives;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: ToggleSwitch.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"ToggleSwitch", "", "isToggled", "", "onToggled", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "expo-dev-menu_release", "animatedBackgroundColor", "Landroidx/compose/ui/graphics/Color;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToggleSwitchKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleSwitch$lambda$1(boolean z, Function1 function1, int i, int i2, Composer composer, int i3) {
        ToggleSwitch(z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ToggleSwitch(final boolean z, Function1<? super Boolean, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super Boolean, Unit> function12;
        int i4;
        long Color;
        final Function1<? super Boolean, Unit> function13;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-138368786);
        ComposerKt.sourceInformation(startRestartGroup, "C(ToggleSwitch)24@915L200,39@1228L12,36@1119L427:ToggleSwitch.kt#k98qbf");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            i4 = i3;
            if ((i4 & 19) == 18 || !startRestartGroup.getSkipping()) {
                Function1<? super Boolean, Unit> function14 = i5 == 0 ? null : function12;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-138368786, i4, -1, "expo.modules.devmenu.compose.primitives.ToggleSwitch (ToggleSwitch.kt:23)");
                }
                startRestartGroup.startReplaceGroup(171587961);
                ComposerKt.sourceInformation(startRestartGroup, "28@1016L11");
                if (!z) {
                    Color = ColorKt.Color(4281648985L);
                } else if (NewAppTheme.INSTANCE.isDarkTheme(startRestartGroup, 6)) {
                    Color = ColorKt.Color(4282795590L);
                } else {
                    Color = ColorKt.Color(4293519851L);
                }
                startRestartGroup.endReplaceGroup();
                State<Color> m125animateColorAsStateeuL9pac = SingleValueAnimationKt.m125animateColorAsStateeuL9pac(Color, null, null, null, startRestartGroup, 0, 14);
                RoundedCornerShape m1202RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1202RoundedCornerShape0680j_4(NewAppTheme.INSTANCE.getBorderRadius(startRestartGroup, 6).m10766getFullD9Ej5fM());
                long ToggleSwitch$lambda$0 = ToggleSwitch$lambda$0(m125animateColorAsStateeuL9pac);
                function13 = function14;
                com.composeunstyled.ToggleSwitchKt.m9560ToggleSwitchYod850M(z, SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(52)), function13, false, m1202RoundedCornerShape0680j_4, ToggleSwitch$lambda$0, null, null, null, ComposableSingletons$ToggleSwitchKt.INSTANCE.getLambda$773325232$expo_dev_menu_release(), startRestartGroup, (i4 & 14) | 805306416 | ((i4 << 3) & 896), 456);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                function13 = function12;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.primitives.ToggleSwitchKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ToggleSwitch$lambda$1;
                        ToggleSwitch$lambda$1 = ToggleSwitchKt.ToggleSwitch$lambda$1(z, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ToggleSwitch$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        i4 = i3;
        if ((i4 & 19) == 18) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(171587961);
        ComposerKt.sourceInformation(startRestartGroup, "28@1016L11");
        if (!z) {
        }
        startRestartGroup.endReplaceGroup();
        State<Color> m125animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m125animateColorAsStateeuL9pac(Color, null, null, null, startRestartGroup, 0, 14);
        RoundedCornerShape m1202RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1202RoundedCornerShape0680j_4(NewAppTheme.INSTANCE.getBorderRadius(startRestartGroup, 6).m10766getFullD9Ej5fM());
        long ToggleSwitch$lambda$02 = ToggleSwitch$lambda$0(m125animateColorAsStateeuL9pac2);
        function13 = function14;
        com.composeunstyled.ToggleSwitchKt.m9560ToggleSwitchYod850M(z, SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(52)), function13, false, m1202RoundedCornerShape0680j_42, ToggleSwitch$lambda$02, null, null, null, ComposableSingletons$ToggleSwitchKt.INSTANCE.getLambda$773325232$expo_dev_menu_release(), startRestartGroup, (i4 & 14) | 805306416 | ((i4 << 3) & 896), 456);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final long ToggleSwitch$lambda$0(State<Color> state) {
        return state.getValue().m5667unboximpl();
    }
}
