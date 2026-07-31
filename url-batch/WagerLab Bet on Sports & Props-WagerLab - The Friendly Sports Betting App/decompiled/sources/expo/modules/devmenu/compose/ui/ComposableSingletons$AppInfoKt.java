package expo.modules.devmenu.compose.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppInfo.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$AppInfoKt {
    public static final ComposableSingletons$AppInfoKt INSTANCE = new ComposableSingletons$AppInfoKt();

    /* renamed from: lambda$-1571584122, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f72lambda$1571584122 = ComposableLambdaKt.composableLambdaInstance(-1571584122, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ComposableSingletons$AppInfoKt$lambda$-1571584122$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            ComposerKt.sourceInformation(composer, "C75@2322L6,73@2266L84:AppInfo.kt#aaq0h9");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1571584122, i, -1, "expo.modules.devmenu.compose.ui.ComposableSingletons$AppInfoKt.lambda$-1571584122.<anonymous> (AppInfo.kt:73)");
            }
            MenuIcons.INSTANCE.m10867Close8s8adOk(Dp.m8401constructorimpl(16), NewAppTheme.INSTANCE.getColors(composer, 6).getIcon().getTertiary(), null, composer, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1571584122$expo_dev_menu_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10849getLambda$1571584122$expo_dev_menu_release() {
        return f72lambda$1571584122;
    }
}
