package expo.modules.devmenu.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$BottomSheetScaffoldKt {
    public static final ComposableSingletons$BottomSheetScaffoldKt INSTANCE = new ComposableSingletons$BottomSheetScaffoldKt();
    private static Function2<Composer, Integer, Unit> lambda$1282183958 = ComposableLambdaKt.composableLambdaInstance(1282183958, false, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ComposableSingletons$BottomSheetScaffoldKt$lambda$1282183958$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C:BottomSheetScaffold.kt#aaq0h9");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1282183958, i, -1, "expo.modules.devmenu.compose.ui.ComposableSingletons$BottomSheetScaffoldKt.lambda$1282183958.<anonymous> (BottomSheetScaffold.kt:43)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1282183958$expo_dev_menu_release() {
        return lambda$1282183958;
    }
}
