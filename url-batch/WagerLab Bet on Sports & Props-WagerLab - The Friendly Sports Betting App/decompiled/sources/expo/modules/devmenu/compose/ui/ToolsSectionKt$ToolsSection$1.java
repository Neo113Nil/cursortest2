package expo.modules.devmenu.compose.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.location.LocationRequest;
import expo.modules.devmenu.DevToolsSettings;
import expo.modules.devmenu.compose.DevMenuAction;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import expo.modules.devmenu.compose.primitives.DividerKt;
import expo.modules.devmenu.compose.primitives.ToggleSwitchKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ToolsSection.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ToolsSectionKt$ToolsSection$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ DevToolsSettings $devToolsSettings;
    final /* synthetic */ Function1<DevMenuAction, Unit> $onAction;
    final /* synthetic */ boolean $showFab;

    /* JADX WARN: Multi-variable type inference failed */
    ToolsSectionKt$ToolsSection$1(Function1<? super DevMenuAction, Unit> function1, DevToolsSettings devToolsSettings, boolean z) {
        this.$onAction = function1;
        this.$devToolsSettings = devToolsSettings;
        this.$showFab = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$1$lambda$0(Function1 function1) {
        function1.invoke(DevMenuAction.TogglePerformanceMonitor.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$3$lambda$2(Function1 function1) {
        function1.invoke(DevMenuAction.ToggleElementInspector.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$5$lambda$4(Function1 function1) {
        function1.invoke(DevMenuAction.OpenJSDebugger.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$7$lambda$6(Function1 function1, DevToolsSettings devToolsSettings) {
        function1.invoke(new DevMenuAction.ToggleFastRefresh(!devToolsSettings.isHotLoadingEnabled()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$8(Function1 function1) {
        function1.invoke(DevMenuAction.ToggleFab.INSTANCE);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C28@882L2385:ToolsSection.kt#aaq0h9");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-218210118, i, -1, "expo.modules.devmenu.compose.ui.ToolsSection.<anonymous> (ToolsSection.kt:28)");
        }
        final Function1<DevMenuAction, Unit> function1 = this.$onAction;
        final DevToolsSettings devToolsSettings = this.$devToolsSettings;
        final boolean z = this.$showFab;
        ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m4976constructorimpl = Updater.m4976constructorimpl(composer);
        Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, 1227172631, "C42@1213L70,29@897L394,47@1299L27,62@1644L68,49@1334L386,67@1728L27,82@2063L60,69@1763L368,87@2139L27,102@2486L108,107@2614L102,89@2174L550,112@2760L6,112@2732L50,127@3099L79,132@3198L55,114@2790L471:ToolsSection.kt#aaq0h9");
        Function2<Composer, Integer, Unit> m10857getLambda$574652971$expo_dev_menu_release = ComposableSingletons$ToolsSectionKt.INSTANCE.m10857getLambda$574652971$expo_dev_menu_release();
        Function2<Composer, Integer, Unit> lambda$377178868$expo_dev_menu_release = ComposableSingletons$ToolsSectionKt.INSTANCE.getLambda$377178868$expo_dev_menu_release();
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):ToolsSection.kt#9igjgp");
        boolean changed = composer.changed(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: expo.modules.devmenu.compose.ui.ToolsSectionKt$ToolsSection$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$1$lambda$0;
                    invoke$lambda$10$lambda$1$lambda$0 = ToolsSectionKt$ToolsSection$1.invoke$lambda$10$lambda$1$lambda$0(Function1.this);
                    return invoke$lambda$10$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        MenuButtonKt.m10864NewMenuButton0vH8DBg(null, m10857getLambda$574652971$expo_dev_menu_release, lambda$377178868$expo_dev_menu_release, null, false, false, 0.0f, (Function0) rememberedValue, composer, 25008, LocationRequest.PRIORITY_NO_POWER);
        float f = (float) 0.5d;
        DividerKt.m10817DividerkbKKJSQ(Dp.m8401constructorimpl(f), 0L, composer, 6, 2);
        Function2<Composer, Integer, Unit> m10853getLambda$1404781364$expo_dev_menu_release = ComposableSingletons$ToolsSectionKt.INSTANCE.m10853getLambda$1404781364$expo_dev_menu_release();
        Function2<Composer, Integer, Unit> m10855getLambda$1522418133$expo_dev_menu_release = ComposableSingletons$ToolsSectionKt.INSTANCE.m10855getLambda$1522418133$expo_dev_menu_release();
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):ToolsSection.kt#9igjgp");
        boolean changed2 = composer.changed(function1);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: expo.modules.devmenu.compose.ui.ToolsSectionKt$ToolsSection$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$3$lambda$2;
                    invoke$lambda$10$lambda$3$lambda$2 = ToolsSectionKt$ToolsSection$1.invoke$lambda$10$lambda$3$lambda$2(Function1.this);
                    return invoke$lambda$10$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        MenuButtonKt.m10864NewMenuButton0vH8DBg(null, m10853getLambda$1404781364$expo_dev_menu_release, m10855getLambda$1522418133$expo_dev_menu_release, null, false, false, 0.0f, (Function0) rememberedValue2, composer, 25008, LocationRequest.PRIORITY_NO_POWER);
        DividerKt.m10817DividerkbKKJSQ(Dp.m8401constructorimpl(f), 0L, composer, 6, 2);
        Function2<Composer, Integer, Unit> lambda$741785101$expo_dev_menu_release = ComposableSingletons$ToolsSectionKt.INSTANCE.getLambda$741785101$expo_dev_menu_release();
        Function2<Composer, Integer, Unit> lambda$624148332$expo_dev_menu_release = ComposableSingletons$ToolsSectionKt.INSTANCE.getLambda$624148332$expo_dev_menu_release();
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):ToolsSection.kt#9igjgp");
        boolean changed3 = composer.changed(function1);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: expo.modules.devmenu.compose.ui.ToolsSectionKt$ToolsSection$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$5$lambda$4;
                    invoke$lambda$10$lambda$5$lambda$4 = ToolsSectionKt$ToolsSection$1.invoke$lambda$10$lambda$5$lambda$4(Function1.this);
                    return invoke$lambda$10$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        MenuButtonKt.m10864NewMenuButton0vH8DBg(null, lambda$741785101$expo_dev_menu_release, lambda$624148332$expo_dev_menu_release, null, false, false, 0.0f, (Function0) rememberedValue3, composer, 25008, LocationRequest.PRIORITY_NO_POWER);
        DividerKt.m10817DividerkbKKJSQ(Dp.m8401constructorimpl(f), 0L, composer, 6, 2);
        Function2<Composer, Integer, Unit> m10854getLambda$1406615730$expo_dev_menu_release = ComposableSingletons$ToolsSectionKt.INSTANCE.m10854getLambda$1406615730$expo_dev_menu_release();
        Function2<Composer, Integer, Unit> m10856getLambda$1524252499$expo_dev_menu_release = ComposableSingletons$ToolsSectionKt.INSTANCE.m10856getLambda$1524252499$expo_dev_menu_release();
        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1641889268, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ToolsSectionKt$ToolsSection$1$1$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                ComposerKt.sourceInformation(composer2, "C103@2498L86:ToolsSection.kt#aaq0h9");
                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1641889268, i2, -1, "expo.modules.devmenu.compose.ui.ToolsSection.<anonymous>.<anonymous>.<anonymous> (ToolsSection.kt:103)");
                }
                ToggleSwitchKt.ToggleSwitch(DevToolsSettings.this.isHotLoadingEnabled(), null, composer2, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54);
        composer.startReplaceGroup(-1633490746);
        ComposerKt.sourceInformation(composer, "CC(remember):ToolsSection.kt#9igjgp");
        boolean changed4 = composer.changed(function1) | composer.changed(devToolsSettings);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: expo.modules.devmenu.compose.ui.ToolsSectionKt$ToolsSection$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$7$lambda$6;
                    invoke$lambda$10$lambda$7$lambda$6 = ToolsSectionKt$ToolsSection$1.invoke$lambda$10$lambda$7$lambda$6(Function1.this, devToolsSettings);
                    return invoke$lambda$10$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        MenuButtonKt.m10864NewMenuButton0vH8DBg(null, m10854getLambda$1406615730$expo_dev_menu_release, m10856getLambda$1524252499$expo_dev_menu_release, rememberComposableLambda, false, false, 0.0f, (Function0) rememberedValue4, composer, 28080, 97);
        DividerKt.m10817DividerkbKKJSQ(0.0f, NewAppTheme.INSTANCE.getColors(composer, 6).getBorder().getDefault(), composer, 0, 1);
        Function2<Composer, Integer, Unit> lambda$739950735$expo_dev_menu_release = ComposableSingletons$ToolsSectionKt.INSTANCE.getLambda$739950735$expo_dev_menu_release();
        Function2<Composer, Integer, Unit> lambda$622313966$expo_dev_menu_release = ComposableSingletons$ToolsSectionKt.INSTANCE.getLambda$622313966$expo_dev_menu_release();
        ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(504677197, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.ToolsSectionKt$ToolsSection$1$1$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                ComposerKt.sourceInformation(composer2, "C128@3111L57:ToolsSection.kt#aaq0h9");
                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(504677197, i2, -1, "expo.modules.devmenu.compose.ui.ToolsSection.<anonymous>.<anonymous>.<anonymous> (ToolsSection.kt:128)");
                }
                ToggleSwitchKt.ToggleSwitch(z, null, composer2, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):ToolsSection.kt#9igjgp");
        boolean changed5 = composer.changed(function1);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function0() { // from class: expo.modules.devmenu.compose.ui.ToolsSectionKt$ToolsSection$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$9$lambda$8;
                    invoke$lambda$10$lambda$9$lambda$8 = ToolsSectionKt$ToolsSection$1.invoke$lambda$10$lambda$9$lambda$8(Function1.this);
                    return invoke$lambda$10$lambda$9$lambda$8;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceGroup();
        MenuButtonKt.m10864NewMenuButton0vH8DBg(null, lambda$739950735$expo_dev_menu_release, lambda$622313966$expo_dev_menu_release, rememberComposableLambda2, false, false, 0.0f, (Function0) rememberedValue5, composer, 28080, 97);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
