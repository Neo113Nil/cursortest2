package expo.modules.devmenu.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: DevMenuScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$DevMenuScreenKt {
    public static final ComposableSingletons$DevMenuScreenKt INSTANCE = new ComposableSingletons$DevMenuScreenKt();

    /* renamed from: lambda$-586806337, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f74lambda$586806337 = ComposableLambdaKt.composableLambdaInstance(-586806337, false, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ComposableSingletons$DevMenuScreenKt$lambda$-586806337$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C49@1629L6,49@1589L60:DevMenuScreen.kt#aaq0h9");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-586806337, i, -1, "expo.modules.devmenu.compose.ui.ComposableSingletons$DevMenuScreenKt.lambda$-586806337.<anonymous> (DevMenuScreen.kt:49)");
            }
            MenuIcons.INSTANCE.m10874Reload8s8adOk(Dp.m8401constructorimpl(20), NewAppTheme.INSTANCE.getColors(composer, 6).getIcon().getDefault(), null, composer, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1901712984, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f73lambda$1901712984 = ComposableLambdaKt.composableLambdaInstance(-1901712984, false, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ComposableSingletons$DevMenuScreenKt$lambda$-1901712984$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C56@1866L6,56@1828L58:DevMenuScreen.kt#aaq0h9");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1901712984, i, -1, "expo.modules.devmenu.compose.ui.ComposableSingletons$DevMenuScreenKt.lambda$-1901712984.<anonymous> (DevMenuScreen.kt:56)");
            }
            MenuIcons.INSTANCE.m10870Home8s8adOk(Dp.m8401constructorimpl(20), NewAppTheme.INSTANCE.getColors(composer, 6).getIcon().getDefault(), null, composer, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1901712984$expo_dev_menu_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10850getLambda$1901712984$expo_dev_menu_release() {
        return f73lambda$1901712984;
    }

    /* renamed from: getLambda$-586806337$expo_dev_menu_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10851getLambda$586806337$expo_dev_menu_release() {
        return f74lambda$586806337;
    }
}
