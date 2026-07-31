package expo.modules.devmenu.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import expo.modules.devmenu.compose.primitives.TextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ToolsSection.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$ToolsSectionKt {
    public static final ComposableSingletons$ToolsSectionKt INSTANCE = new ComposableSingletons$ToolsSectionKt();

    /* renamed from: lambda$-574652971, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f80lambda$574652971 = ComposableLambdaKt.composableLambdaInstance(-574652971, false, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt$lambda$-574652971$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C34@1048L6,32@978L102:ToolsSection.kt#aaq0h9");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-574652971, i, -1, "expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt.lambda$-574652971.<anonymous> (ToolsSection.kt:32)");
            }
            MenuIcons.INSTANCE.m10872Performance8s8adOk(Dp.m8401constructorimpl(20), NewAppTheme.INSTANCE.getColors(composer, 6).getIcon().getTertiary(), null, composer, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$377178868 = ComposableLambdaKt.composableLambdaInstance(377178868, false, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt$lambda$377178868$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C38@1122L61:ToolsSection.kt#aaq0h9");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(377178868, i, -1, "expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt.lambda$377178868.<anonymous> (ToolsSection.kt:38)");
            }
            TextKt.m10822NewTextnUFttAo("Performance monitor", (TextStyle) null, 0L, 0, false, 0, (Modifier) null, composer, 6, WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1404781364, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f76lambda$1404781364 = ComposableLambdaKt.composableLambdaInstance(-1404781364, false, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt$lambda$-1404781364$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C54@1481L6,52@1415L98:ToolsSection.kt#aaq0h9");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1404781364, i, -1, "expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt.lambda$-1404781364.<anonymous> (ToolsSection.kt:52)");
            }
            MenuIcons.INSTANCE.m10871Inspect8s8adOk(Dp.m8401constructorimpl(20), NewAppTheme.INSTANCE.getColors(composer, 6).getIcon().getTertiary(), null, composer, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1522418133, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f78lambda$1522418133 = ComposableLambdaKt.composableLambdaInstance(-1522418133, false, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt$lambda$-1522418133$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C58@1555L59:ToolsSection.kt#aaq0h9");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1522418133, i, -1, "expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt.lambda$-1522418133.<anonymous> (ToolsSection.kt:58)");
            }
            TextKt.m10822NewTextnUFttAo("Element inspector", (TextStyle) null, 0L, 0, false, 0, (Modifier) null, composer, 6, WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$741785101 = ComposableLambdaKt.composableLambdaInstance(741785101, false, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt$lambda$741785101$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C74@1906L6,72@1844L94:ToolsSection.kt#aaq0h9");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(741785101, i, -1, "expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt.lambda$741785101.<anonymous> (ToolsSection.kt:72)");
            }
            MenuIcons.INSTANCE.m10866Bug8s8adOk(Dp.m8401constructorimpl(20), NewAppTheme.INSTANCE.getColors(composer, 6).getIcon().getTertiary(), null, composer, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$624148332 = ComposableLambdaKt.composableLambdaInstance(624148332, false, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt$lambda$624148332$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C78@1980L53:ToolsSection.kt#aaq0h9");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(624148332, i, -1, "expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt.lambda$624148332.<anonymous> (ToolsSection.kt:78)");
            }
            TextKt.m10822NewTextnUFttAo("JS debugger", (TextStyle) null, 0L, 0, false, 0, (Modifier) null, composer, 6, WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1406615730, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f77lambda$1406615730 = ComposableLambdaKt.composableLambdaInstance(-1406615730, false, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt$lambda$-1406615730$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C94@2321L6,92@2255L98:ToolsSection.kt#aaq0h9");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1406615730, i, -1, "expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt.lambda$-1406615730.<anonymous> (ToolsSection.kt:92)");
            }
            MenuIcons.INSTANCE.m10873Refresh8s8adOk(Dp.m8401constructorimpl(20), NewAppTheme.INSTANCE.getColors(composer, 6).getIcon().getTertiary(), null, composer, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1524252499, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f79lambda$1524252499 = ComposableLambdaKt.composableLambdaInstance(-1524252499, false, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt$lambda$-1524252499$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C98@2395L54:ToolsSection.kt#aaq0h9");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1524252499, i, -1, "expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt.lambda$-1524252499.<anonymous> (ToolsSection.kt:98)");
            }
            TextKt.m10822NewTextnUFttAo("Fast Refresh", (TextStyle) null, 0L, 0, false, 0, (Modifier) null, composer, 6, WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$739950735 = ComposableLambdaKt.composableLambdaInstance(739950735, false, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt$lambda$739950735$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C119@2933L6,117@2871L94:ToolsSection.kt#aaq0h9");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(739950735, i, -1, "expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt.lambda$739950735.<anonymous> (ToolsSection.kt:117)");
            }
            MenuIcons.INSTANCE.m10869Fab8s8adOk(Dp.m8401constructorimpl(20), NewAppTheme.INSTANCE.getColors(composer, 6).getIcon().getTertiary(), null, composer, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$622313966 = ComposableLambdaKt.composableLambdaInstance(622313966, false, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt$lambda$622313966$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C123@3007L55:ToolsSection.kt#aaq0h9");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(622313966, i, -1, "expo.modules.devmenu.compose.ui.ComposableSingletons$ToolsSectionKt.lambda$622313966.<anonymous> (ToolsSection.kt:123)");
            }
            TextKt.m10822NewTextnUFttAo("Action button", (TextStyle) null, 0L, 0, false, 0, (Modifier) null, composer, 6, WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1404781364$expo_dev_menu_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10853getLambda$1404781364$expo_dev_menu_release() {
        return f76lambda$1404781364;
    }

    /* renamed from: getLambda$-1406615730$expo_dev_menu_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10854getLambda$1406615730$expo_dev_menu_release() {
        return f77lambda$1406615730;
    }

    /* renamed from: getLambda$-1522418133$expo_dev_menu_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10855getLambda$1522418133$expo_dev_menu_release() {
        return f78lambda$1522418133;
    }

    /* renamed from: getLambda$-1524252499$expo_dev_menu_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10856getLambda$1524252499$expo_dev_menu_release() {
        return f79lambda$1524252499;
    }

    /* renamed from: getLambda$-574652971$expo_dev_menu_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10857getLambda$574652971$expo_dev_menu_release() {
        return f80lambda$574652971;
    }

    public final Function2<Composer, Integer, Unit> getLambda$377178868$expo_dev_menu_release() {
        return lambda$377178868;
    }

    public final Function2<Composer, Integer, Unit> getLambda$622313966$expo_dev_menu_release() {
        return lambda$622313966;
    }

    public final Function2<Composer, Integer, Unit> getLambda$624148332$expo_dev_menu_release() {
        return lambda$624148332;
    }

    public final Function2<Composer, Integer, Unit> getLambda$739950735$expo_dev_menu_release() {
        return lambda$739950735;
    }

    public final Function2<Composer, Integer, Unit> getLambda$741785101$expo_dev_menu_release() {
        return lambda$741785101;
    }
}
