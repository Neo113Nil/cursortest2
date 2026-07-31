package expo.modules.devmenu.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BundlerInfo.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$BundlerInfoKt {
    public static final ComposableSingletons$BundlerInfoKt INSTANCE = new ComposableSingletons$BundlerInfoKt();
    private static Function2<Composer, Integer, Unit> lambda$1718281471 = ComposableLambdaKt.composableLambdaInstance(1718281471, false, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ComposableSingletons$BundlerInfoKt$lambda$1718281471$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C42@1228L6,40@1173L83:BundlerInfo.kt#aaq0h9");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1718281471, i, -1, "expo.modules.devmenu.compose.ui.ComposableSingletons$BundlerInfoKt.lambda$1718281471.<anonymous> (BundlerInfo.kt:40)");
            }
            MenuIcons.INSTANCE.m10868Copy8s8adOk(Dp.m8401constructorimpl(20), NewAppTheme.INSTANCE.getColors(composer, 6).getIcon().getTertiary(), null, composer, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1718281471$expo_dev_menu_release() {
        return lambda$1718281471;
    }
}
