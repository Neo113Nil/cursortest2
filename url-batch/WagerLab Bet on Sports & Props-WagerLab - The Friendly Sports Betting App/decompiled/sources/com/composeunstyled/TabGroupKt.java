package com.composeunstyled;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusEnterExitScope;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusRestorerKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: TabGroup.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a}\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b!\u0010\"\u001a \u0001\u0010#\u001a\u00020\u00042\n\u0010$\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040(2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00040(¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b/\u00100\u001au\u00101\u001a\u00020\u00042\n\u0010$\u001a\u00060\u0006j\u0002`\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u00102\u001a\u0002032\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b5\u00106\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"LocalTabsRegistry", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/composeunstyled/TabsRegistry;", "TabGroup", "", "selectedTab", "", "Lcom/composeunstyled/TabKey;", "tabs", "", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TabList", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/foundation/layout/RowScope;", "TabList--nWoaYo", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Tab", "key", "selected", "", "onSelected", "Lkotlin/Function0;", ViewProps.ENABLED, "activateOnFocus", "indication", "Landroidx/compose/foundation/Indication;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Tab-R3CKDEk", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/Indication;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TabPanel", "contentAlignment", "Landroidx/compose/ui/Alignment;", "Landroidx/compose/foundation/layout/BoxScope;", "TabPanel-X-z6DiA", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TabGroupKt {
    private static final ProvidableCompositionLocal<TabsRegistry> LocalTabsRegistry = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TabsRegistry LocalTabsRegistry$lambda$0;
            LocalTabsRegistry$lambda$0 = TabGroupKt.LocalTabsRegistry$lambda$0();
            return LocalTabsRegistry$lambda$0;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabGroup$lambda$11(String str, List list, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        TabGroup(str, list, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabList__nWoaYo$lambda$16(Modifier modifier, Shape shape, long j, long j2, PaddingValues paddingValues, Orientation orientation, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, Function3 function3, int i, int i2, Composer composer, int i3) {
        m9541TabListnWoaYo(modifier, shape, j, j2, paddingValues, orientation, horizontal, vertical, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabPanel_X_z6DiA$lambda$24(String str, Modifier modifier, Shape shape, long j, long j2, PaddingValues paddingValues, Alignment alignment, Function3 function3, int i, int i2, Composer composer, int i3) {
        m9542TabPanelXz6DiA(str, modifier, shape, j, j2, paddingValues, alignment, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Tab_R3CKDEk$lambda$22(String str, boolean z, Function0 function0, Modifier modifier, boolean z2, boolean z3, Indication indication, MutableInteractionSource mutableInteractionSource, Shape shape, long j, long j2, PaddingValues paddingValues, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        m9540TabR3CKDEk(str, z, function0, modifier, z2, z3, indication, mutableInteractionSource, shape, j, j2, paddingValues, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabsRegistry LocalTabsRegistry$lambda$0() {
        return new TabsRegistry();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2 A[LOOP:0: B:64:0x00dc->B:66:0x00e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116 A[LOOP:1: B:69:0x0110->B:71:0x0116, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TabGroup(final String selectedTab, final List<String> tabs, Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        boolean changed3;
        Object rememberedValue3;
        int currentCompositeKeyHash;
        Composer m4976constructorimpl;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(761786455);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(selectedTab) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(tabs) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(761786455, i3, -1, "com.composeunstyled.TabGroup (TabGroup.kt:41)");
                }
                startRestartGroup.startReplaceGroup(5004770);
                changed = startRestartGroup.changed(tabs);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    List<String> list = tabs;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                    for (Object obj : list) {
                        linkedHashMap.put(obj, new FocusRequester());
                    }
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                    for (Object obj2 : list) {
                        linkedHashMap3.put(obj2, new FocusRequester());
                    }
                    TabsRegistry tabsRegistry = new TabsRegistry();
                    tabsRegistry.setTabKeys(tabs);
                    tabsRegistry.setTabFocusRequesters(linkedHashMap2);
                    tabsRegistry.setPanelsFocusRequesters(linkedHashMap3);
                    startRestartGroup.updateRememberedValue(tabsRegistry);
                    rememberedValue = tabsRegistry;
                }
                final TabsRegistry tabsRegistry2 = (TabsRegistry) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1633490746);
                changed2 = startRestartGroup.changed(tabsRegistry2) | ((i3 & 14) != 4);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit TabGroup$lambda$6$lambda$5;
                            TabGroup$lambda$6$lambda$5 = TabGroupKt.TabGroup$lambda$6$lambda$5(TabsRegistry.this, selectedTab);
                            return TabGroup$lambda$6$lambda$5;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(5004770);
                changed3 = startRestartGroup.changed(tabsRegistry2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function1() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            Unit TabGroup$lambda$9$lambda$8;
                            TabGroup$lambda$9$lambda$8 = TabGroupKt.TabGroup$lambda$9$lambda$8(TabsRegistry.this, (FocusProperties) obj3);
                            return TabGroup$lambda$9$lambda$8;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                Modifier focusGroup = FocusableKt.focusGroup(FocusPropertiesKt.focusProperties(modifier2, (Function1) rememberedValue3));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, focusGroup);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider(LocalTabsRegistry.provides(tabsRegistry2), ComposableLambdaKt.rememberComposableLambda(-338902259, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.TabGroupKt$TabGroup$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-338902259, i5, -1, "com.composeunstyled.TabGroup.<anonymous>.<anonymous> (TabGroup.kt:70)");
                        }
                        content.invoke(columnScopeInstance, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = modifier2;
                endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Unit TabGroup$lambda$11;
                        TabGroup$lambda$11 = TabGroupKt.TabGroup$lambda$11(selectedTab, tabs, modifier3, content, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                        return TabGroup$lambda$11;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        changed = startRestartGroup.changed(tabs);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        List<String> list2 = tabs;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        while (r13.hasNext()) {
        }
        LinkedHashMap linkedHashMap22 = linkedHashMap4;
        LinkedHashMap linkedHashMap32 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        while (r8.hasNext()) {
        }
        TabsRegistry tabsRegistry3 = new TabsRegistry();
        tabsRegistry3.setTabKeys(tabs);
        tabsRegistry3.setTabFocusRequesters(linkedHashMap22);
        tabsRegistry3.setPanelsFocusRequesters(linkedHashMap32);
        startRestartGroup.updateRememberedValue(tabsRegistry3);
        rememberedValue = tabsRegistry3;
        final TabsRegistry tabsRegistry22 = (TabsRegistry) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1633490746);
        changed2 = startRestartGroup.changed(tabsRegistry22) | ((i3 & 14) != 4);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = new Function0() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit TabGroup$lambda$6$lambda$5;
                TabGroup$lambda$6$lambda$5 = TabGroupKt.TabGroup$lambda$6$lambda$5(TabsRegistry.this, selectedTab);
                return TabGroup$lambda$6$lambda$5;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(5004770);
        changed3 = startRestartGroup.changed(tabsRegistry22);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue3 = new Function1() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                Unit TabGroup$lambda$9$lambda$8;
                TabGroup$lambda$9$lambda$8 = TabGroupKt.TabGroup$lambda$9$lambda$8(TabsRegistry.this, (FocusProperties) obj3);
                return TabGroup$lambda$9$lambda$8;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        Modifier focusGroup2 = FocusableKt.focusGroup(FocusPropertiesKt.focusProperties(modifier2, (Function1) rememberedValue3));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, focusGroup2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        final ColumnScope columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        CompositionLocalKt.CompositionLocalProvider(LocalTabsRegistry.provides(tabsRegistry22), ComposableLambdaKt.rememberComposableLambda(-338902259, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.TabGroupKt$TabGroup$3$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                if ((i5 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-338902259, i5, -1, "com.composeunstyled.TabGroup.<anonymous>.<anonymous> (TabGroup.kt:70)");
                }
                content.invoke(columnScopeInstance2, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabGroup$lambda$6$lambda$5(TabsRegistry tabsRegistry, String str) {
        tabsRegistry.setActivatedTab(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabGroup$lambda$9$lambda$8(final TabsRegistry tabsRegistry, FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
        focusProperties.setOnEnter(new Function1() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TabGroup$lambda$9$lambda$8$lambda$7;
                TabGroup$lambda$9$lambda$8$lambda$7 = TabGroupKt.TabGroup$lambda$9$lambda$8$lambda$7(TabsRegistry.this, (FocusEnterExitScope) obj);
                return TabGroup$lambda$9$lambda$8$lambda$7;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabGroup$lambda$9$lambda$8$lambda$7(TabsRegistry tabsRegistry, FocusEnterExitScope focusEnterExitScope) {
        Intrinsics.checkNotNullParameter(focusEnterExitScope, "<this>");
        String activatedTab = tabsRegistry.getActivatedTab();
        if (activatedTab != null && (FocusDirection.m5292equalsimpl0(focusEnterExitScope.getRequestedFocusDirection(), FocusDirection.INSTANCE.m5300getNextdhqQ8s()) || FocusDirection.m5292equalsimpl0(focusEnterExitScope.getRequestedFocusDirection(), FocusDirection.INSTANCE.m5301getPreviousdhqQ8s()))) {
            FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabsRegistry.getTabFocusRequesters(), activatedTab), 0, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016c  */
    /* renamed from: TabList--nWoaYo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9541TabListnWoaYo(Modifier modifier, Shape shape, long j, long j2, PaddingValues paddingValues, Orientation orientation, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        int i4;
        long j3;
        int i5;
        long j4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final Orientation orientation2;
        long j5;
        boolean changedInstance;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        int currentCompositeKeyHash;
        Orientation orientation3;
        Composer m4976constructorimpl;
        Arrangement.Horizontal horizontal2;
        final Shape shape3;
        final long j6;
        final Alignment.Vertical vertical2;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2017582249);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            shape2 = shape;
            i3 |= startRestartGroup.changed(shape2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                j3 = j;
                i3 |= startRestartGroup.changed(j3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    j4 = j2;
                    i3 |= startRestartGroup.changed(j4) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changed(orientation == null ? -1 : orientation.ordinal()) ? 131072 : 65536;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i9 = i8;
                            i3 |= startRestartGroup.changed(horizontal) ? 1048576 : 524288;
                            i10 = i2 & 128;
                            if (i10 == 0) {
                                i3 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                i11 = i10;
                                i3 |= startRestartGroup.changed(vertical) ? 8388608 : 4194304;
                                if ((i2 & 256) != 0) {
                                    i3 |= 100663296;
                                } else if ((i & 100663296) == 0) {
                                    i3 |= startRestartGroup.changedInstance(content) ? 67108864 : 33554432;
                                }
                                if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                                    if (i12 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i13 != 0) {
                                        shape2 = RectangleShapeKt.getRectangleShape();
                                    }
                                    long m5693getUnspecified0d7_KjU = i4 != 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j3;
                                    long m5693getUnspecified0d7_KjU2 = i5 != 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j4;
                                    PaddingValues noPadding = i6 != 0 ? UtilsKt.getNoPadding() : paddingValues;
                                    orientation2 = i7 != 0 ? Orientation.Horizontal : orientation;
                                    Arrangement.Horizontal start = i9 != 0 ? Arrangement.INSTANCE.getStart() : horizontal;
                                    Alignment.Vertical top = i11 != 0 ? Alignment.INSTANCE.getTop() : vertical;
                                    if (ComposerKt.isTraceInProgress()) {
                                        j5 = m5693getUnspecified0d7_KjU;
                                        ComposerKt.traceEventStart(-2017582249, i3, -1, "com.composeunstyled.TabList (TabGroup.kt:86)");
                                    } else {
                                        j5 = m5693getUnspecified0d7_KjU;
                                    }
                                    ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal = LocalTabsRegistry;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(providableCompositionLocal);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final TabsRegistry tabsRegistry = (TabsRegistry) consume;
                                    final List<String> tabKeys = tabsRegistry.getTabKeys();
                                    int i14 = i3;
                                    long j7 = j5;
                                    Modifier padding = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(SelectableGroupKt.selectableGroup(FocusableKt.focusGroup(FocusRestorerKt.focusRestorer$default(modifier2, null, 1, null))), shape2), j5, null, 2, null), noPadding);
                                    startRestartGroup.startReplaceGroup(-1746271574);
                                    PaddingValues paddingValues3 = noPadding;
                                    changedInstance = ((i14 & 458752) == 131072) | startRestartGroup.changedInstance(tabKeys) | startRestartGroup.changed(tabsRegistry);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.TabGroupKt$TabList$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                                return m9543invokeZmokQxo(keyEvent.m6792unboximpl());
                                            }

                                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                            public final Boolean m9543invokeZmokQxo(android.view.KeyEvent event) {
                                                Intrinsics.checkNotNullParameter(event, "event");
                                                boolean z = false;
                                                if (Orientation.this == Orientation.Horizontal && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6571getDirectionLeftEK5gGoQ())) {
                                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                                        FocusRequester focusRequester = tabsRegistry.getTabFocusRequesters().get(tabKeys.get(((CollectionsKt.indexOf((List<? extends String>) tabKeys, tabsRegistry.getFocusedTab()) - 1) + tabKeys.size()) % tabKeys.size()));
                                                        Intrinsics.checkNotNull(focusRequester);
                                                        FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                                                    }
                                                } else if (Orientation.this == Orientation.Horizontal && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6572getDirectionRightEK5gGoQ())) {
                                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                                        FocusRequester focusRequester2 = tabsRegistry.getTabFocusRequesters().get(tabKeys.get((CollectionsKt.indexOf((List<? extends String>) tabKeys, tabsRegistry.getFocusedTab()) + 1) % tabKeys.size()));
                                                        Intrinsics.checkNotNull(focusRequester2);
                                                        FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester2, 0, 1, null);
                                                    }
                                                } else if (Orientation.this == Orientation.Vertical && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6573getDirectionUpEK5gGoQ())) {
                                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                                        FocusRequester focusRequester3 = tabsRegistry.getTabFocusRequesters().get(tabKeys.get(((CollectionsKt.indexOf((List<? extends String>) tabKeys, tabsRegistry.getFocusedTab()) - 1) + tabKeys.size()) % tabKeys.size()));
                                                        Intrinsics.checkNotNull(focusRequester3);
                                                        FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester3, 0, 1, null);
                                                    }
                                                } else if (Orientation.this == Orientation.Vertical && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                                        FocusRequester focusRequester4 = tabsRegistry.getTabFocusRequesters().get(tabKeys.get((CollectionsKt.indexOf((List<? extends String>) tabKeys, tabsRegistry.getFocusedTab()) + 1) % tabKeys.size()));
                                                        Intrinsics.checkNotNull(focusRequester4);
                                                        FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester4, 0, 1, null);
                                                    }
                                                } else if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6610getHomeEK5gGoQ())) {
                                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                                        FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabsRegistry.getTabFocusRequesters(), (String) CollectionsKt.first((List) tabKeys)), 0, 1, null);
                                                    }
                                                } else {
                                                    if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6646getMoveEndEK5gGoQ())) {
                                                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                                            FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabsRegistry.getTabFocusRequesters(), (String) CollectionsKt.last((List) tabKeys)), 0, 1, null);
                                                        }
                                                    }
                                                    return Boolean.valueOf(z);
                                                }
                                                z = true;
                                                return Boolean.valueOf(z);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(padding, (Function1) rememberedValue);
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    changed = startRestartGroup.changed(tabsRegistry) | startRestartGroup.changedInstance(tabKeys);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new Function1() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit TabList__nWoaYo$lambda$14$lambda$13;
                                                TabList__nWoaYo$lambda$14$lambda$13 = TabGroupKt.TabList__nWoaYo$lambda$14$lambda$13(TabsRegistry.this, tabKeys, (FocusState) obj);
                                                return TabList__nWoaYo$lambda$14$lambda$13;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(onKeyEvent, (Function1) rememberedValue2);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, top, startRestartGroup, (((i14 >> 15) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onFocusChanged);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    orientation3 = orientation2;
                                    Modifier modifier3 = modifier2;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(constructor);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                                    Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(m5693getUnspecified0d7_KjU2)), ComposableLambdaKt.rememberComposableLambda(1878345907, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.TabGroupKt$TabList$3$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i15) {
                                            if ((i15 & 3) == 2 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1878345907, i15, -1, "com.composeunstyled.TabList.<anonymous>.<anonymous> (TabGroup.kt:183)");
                                            }
                                            content.invoke(rowScopeInstance, composer2, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    horizontal2 = start;
                                    shape3 = shape2;
                                    j6 = m5693getUnspecified0d7_KjU2;
                                    vertical2 = top;
                                    j3 = j7;
                                    paddingValues2 = paddingValues3;
                                    modifier2 = modifier3;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    paddingValues2 = paddingValues;
                                    orientation3 = orientation;
                                    horizontal2 = horizontal;
                                    vertical2 = vertical;
                                    shape3 = shape2;
                                    j6 = j4;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final Modifier modifier4 = modifier2;
                                    final long j8 = j3;
                                    final Arrangement.Horizontal horizontal3 = horizontal2;
                                    final Orientation orientation4 = orientation3;
                                    endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit TabList__nWoaYo$lambda$16;
                                            TabList__nWoaYo$lambda$16 = TabGroupKt.TabList__nWoaYo$lambda$16(Modifier.this, shape3, j8, j6, paddingValues2, orientation4, horizontal3, vertical2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            return TabList__nWoaYo$lambda$16;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i11 = i10;
                            if ((i2 & 256) != 0) {
                            }
                            if ((38347923 & i3) == 38347922) {
                            }
                            if (i12 != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal2 = LocalTabsRegistry;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(providableCompositionLocal2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final TabsRegistry tabsRegistry2 = (TabsRegistry) consume2;
                            final List tabKeys2 = tabsRegistry2.getTabKeys();
                            int i142 = i3;
                            long j72 = j5;
                            Modifier padding2 = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(SelectableGroupKt.selectableGroup(FocusableKt.focusGroup(FocusRestorerKt.focusRestorer$default(modifier2, null, 1, null))), shape2), j5, null, 2, null), noPadding);
                            startRestartGroup.startReplaceGroup(-1746271574);
                            PaddingValues paddingValues32 = noPadding;
                            changedInstance = ((i142 & 458752) == 131072) | startRestartGroup.changedInstance(tabKeys2) | startRestartGroup.changed(tabsRegistry2);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changedInstance) {
                            }
                            rememberedValue = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.TabGroupKt$TabList$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                    return m9543invokeZmokQxo(keyEvent.m6792unboximpl());
                                }

                                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                public final Boolean m9543invokeZmokQxo(android.view.KeyEvent event) {
                                    Intrinsics.checkNotNullParameter(event, "event");
                                    boolean z = false;
                                    if (Orientation.this == Orientation.Horizontal && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6571getDirectionLeftEK5gGoQ())) {
                                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                            FocusRequester focusRequester = tabsRegistry2.getTabFocusRequesters().get(tabKeys2.get(((CollectionsKt.indexOf((List<? extends String>) tabKeys2, tabsRegistry2.getFocusedTab()) - 1) + tabKeys2.size()) % tabKeys2.size()));
                                            Intrinsics.checkNotNull(focusRequester);
                                            FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                                        }
                                    } else if (Orientation.this == Orientation.Horizontal && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6572getDirectionRightEK5gGoQ())) {
                                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                            FocusRequester focusRequester2 = tabsRegistry2.getTabFocusRequesters().get(tabKeys2.get((CollectionsKt.indexOf((List<? extends String>) tabKeys2, tabsRegistry2.getFocusedTab()) + 1) % tabKeys2.size()));
                                            Intrinsics.checkNotNull(focusRequester2);
                                            FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester2, 0, 1, null);
                                        }
                                    } else if (Orientation.this == Orientation.Vertical && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6573getDirectionUpEK5gGoQ())) {
                                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                            FocusRequester focusRequester3 = tabsRegistry2.getTabFocusRequesters().get(tabKeys2.get(((CollectionsKt.indexOf((List<? extends String>) tabKeys2, tabsRegistry2.getFocusedTab()) - 1) + tabKeys2.size()) % tabKeys2.size()));
                                            Intrinsics.checkNotNull(focusRequester3);
                                            FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester3, 0, 1, null);
                                        }
                                    } else if (Orientation.this == Orientation.Vertical && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                            FocusRequester focusRequester4 = tabsRegistry2.getTabFocusRequesters().get(tabKeys2.get((CollectionsKt.indexOf((List<? extends String>) tabKeys2, tabsRegistry2.getFocusedTab()) + 1) % tabKeys2.size()));
                                            Intrinsics.checkNotNull(focusRequester4);
                                            FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester4, 0, 1, null);
                                        }
                                    } else if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6610getHomeEK5gGoQ())) {
                                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                            FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabsRegistry2.getTabFocusRequesters(), (String) CollectionsKt.first((List) tabKeys2)), 0, 1, null);
                                        }
                                    } else {
                                        if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6646getMoveEndEK5gGoQ())) {
                                            if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                                FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabsRegistry2.getTabFocusRequesters(), (String) CollectionsKt.last((List) tabKeys2)), 0, 1, null);
                                            }
                                        }
                                        return Boolean.valueOf(z);
                                    }
                                    z = true;
                                    return Boolean.valueOf(z);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceGroup();
                            Modifier onKeyEvent2 = KeyInputModifierKt.onKeyEvent(padding2, (Function1) rememberedValue);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changed = startRestartGroup.changed(tabsRegistry2) | startRestartGroup.changedInstance(tabKeys2);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue2 = new Function1() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit TabList__nWoaYo$lambda$14$lambda$13;
                                    TabList__nWoaYo$lambda$14$lambda$13 = TabGroupKt.TabList__nWoaYo$lambda$14$lambda$13(TabsRegistry.this, tabKeys2, (FocusState) obj);
                                    return TabList__nWoaYo$lambda$14$lambda$13;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            startRestartGroup.endReplaceGroup();
                            Modifier onFocusChanged2 = FocusChangedModifierKt.onFocusChanged(onKeyEvent2, (Function1) rememberedValue2);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(start, top, startRestartGroup, (((i142 >> 15) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, onFocusChanged2);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            orientation3 = orientation2;
                            Modifier modifier32 = modifier2;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                            Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4976constructorimpl.getInserting()) {
                            }
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            final RowScope rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(m5693getUnspecified0d7_KjU2)), ComposableLambdaKt.rememberComposableLambda(1878345907, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.TabGroupKt$TabList$3$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i15) {
                                    if ((i15 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1878345907, i15, -1, "com.composeunstyled.TabList.<anonymous>.<anonymous> (TabGroup.kt:183)");
                                    }
                                    content.invoke(rowScopeInstance2, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            horizontal2 = start;
                            shape3 = shape2;
                            j6 = m5693getUnspecified0d7_KjU2;
                            vertical2 = top;
                            j3 = j72;
                            paddingValues2 = paddingValues32;
                            modifier2 = modifier32;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i9 = i8;
                        i10 = i2 & 128;
                        if (i10 == 0) {
                        }
                        i11 = i10;
                        if ((i2 & 256) != 0) {
                        }
                        if ((38347923 & i3) == 38347922) {
                        }
                        if (i12 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal22 = LocalTabsRegistry;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume22 = startRestartGroup.consume(providableCompositionLocal22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final TabsRegistry tabsRegistry22 = (TabsRegistry) consume22;
                        final List tabKeys22 = tabsRegistry22.getTabKeys();
                        int i1422 = i3;
                        long j722 = j5;
                        Modifier padding22 = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(SelectableGroupKt.selectableGroup(FocusableKt.focusGroup(FocusRestorerKt.focusRestorer$default(modifier2, null, 1, null))), shape2), j5, null, 2, null), noPadding);
                        startRestartGroup.startReplaceGroup(-1746271574);
                        PaddingValues paddingValues322 = noPadding;
                        changedInstance = ((i1422 & 458752) == 131072) | startRestartGroup.changedInstance(tabKeys22) | startRestartGroup.changed(tabsRegistry22);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.TabGroupKt$TabList$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                return m9543invokeZmokQxo(keyEvent.m6792unboximpl());
                            }

                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m9543invokeZmokQxo(android.view.KeyEvent event) {
                                Intrinsics.checkNotNullParameter(event, "event");
                                boolean z = false;
                                if (Orientation.this == Orientation.Horizontal && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6571getDirectionLeftEK5gGoQ())) {
                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                        FocusRequester focusRequester = tabsRegistry22.getTabFocusRequesters().get(tabKeys22.get(((CollectionsKt.indexOf((List<? extends String>) tabKeys22, tabsRegistry22.getFocusedTab()) - 1) + tabKeys22.size()) % tabKeys22.size()));
                                        Intrinsics.checkNotNull(focusRequester);
                                        FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                                    }
                                } else if (Orientation.this == Orientation.Horizontal && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6572getDirectionRightEK5gGoQ())) {
                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                        FocusRequester focusRequester2 = tabsRegistry22.getTabFocusRequesters().get(tabKeys22.get((CollectionsKt.indexOf((List<? extends String>) tabKeys22, tabsRegistry22.getFocusedTab()) + 1) % tabKeys22.size()));
                                        Intrinsics.checkNotNull(focusRequester2);
                                        FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester2, 0, 1, null);
                                    }
                                } else if (Orientation.this == Orientation.Vertical && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6573getDirectionUpEK5gGoQ())) {
                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                        FocusRequester focusRequester3 = tabsRegistry22.getTabFocusRequesters().get(tabKeys22.get(((CollectionsKt.indexOf((List<? extends String>) tabKeys22, tabsRegistry22.getFocusedTab()) - 1) + tabKeys22.size()) % tabKeys22.size()));
                                        Intrinsics.checkNotNull(focusRequester3);
                                        FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester3, 0, 1, null);
                                    }
                                } else if (Orientation.this == Orientation.Vertical && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                        FocusRequester focusRequester4 = tabsRegistry22.getTabFocusRequesters().get(tabKeys22.get((CollectionsKt.indexOf((List<? extends String>) tabKeys22, tabsRegistry22.getFocusedTab()) + 1) % tabKeys22.size()));
                                        Intrinsics.checkNotNull(focusRequester4);
                                        FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester4, 0, 1, null);
                                    }
                                } else if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6610getHomeEK5gGoQ())) {
                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                        FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabsRegistry22.getTabFocusRequesters(), (String) CollectionsKt.first((List) tabKeys22)), 0, 1, null);
                                    }
                                } else {
                                    if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6646getMoveEndEK5gGoQ())) {
                                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                            FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabsRegistry22.getTabFocusRequesters(), (String) CollectionsKt.last((List) tabKeys22)), 0, 1, null);
                                        }
                                    }
                                    return Boolean.valueOf(z);
                                }
                                z = true;
                                return Boolean.valueOf(z);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceGroup();
                        Modifier onKeyEvent22 = KeyInputModifierKt.onKeyEvent(padding22, (Function1) rememberedValue);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changed = startRestartGroup.changed(tabsRegistry22) | startRestartGroup.changedInstance(tabKeys22);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue2 = new Function1() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit TabList__nWoaYo$lambda$14$lambda$13;
                                TabList__nWoaYo$lambda$14$lambda$13 = TabGroupKt.TabList__nWoaYo$lambda$14$lambda$13(TabsRegistry.this, tabKeys22, (FocusState) obj);
                                return TabList__nWoaYo$lambda$14$lambda$13;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceGroup();
                        Modifier onFocusChanged22 = FocusChangedModifierKt.onFocusChanged(onKeyEvent22, (Function1) rememberedValue2);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(start, top, startRestartGroup, (((i1422 >> 15) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, onFocusChanged22);
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                        orientation3 = orientation2;
                        Modifier modifier322 = modifier2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4976constructorimpl.getInserting()) {
                        }
                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        final RowScope rowScopeInstance22 = RowScopeInstance.INSTANCE;
                        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(m5693getUnspecified0d7_KjU2)), ComposableLambdaKt.rememberComposableLambda(1878345907, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.TabGroupKt$TabList$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i15) {
                                if ((i15 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1878345907, i15, -1, "com.composeunstyled.TabList.<anonymous>.<anonymous> (TabGroup.kt:183)");
                                }
                                content.invoke(rowScopeInstance22, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        horizontal2 = start;
                        shape3 = shape2;
                        j6 = m5693getUnspecified0d7_KjU2;
                        vertical2 = top;
                        j3 = j722;
                        paddingValues2 = paddingValues322;
                        modifier2 = modifier322;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    i10 = i2 & 128;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    if ((i2 & 256) != 0) {
                    }
                    if ((38347923 & i3) == 38347922) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal222 = LocalTabsRegistry;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume222 = startRestartGroup.consume(providableCompositionLocal222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final TabsRegistry tabsRegistry222 = (TabsRegistry) consume222;
                    final List tabKeys222 = tabsRegistry222.getTabKeys();
                    int i14222 = i3;
                    long j7222 = j5;
                    Modifier padding222 = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(SelectableGroupKt.selectableGroup(FocusableKt.focusGroup(FocusRestorerKt.focusRestorer$default(modifier2, null, 1, null))), shape2), j5, null, 2, null), noPadding);
                    startRestartGroup.startReplaceGroup(-1746271574);
                    PaddingValues paddingValues3222 = noPadding;
                    changedInstance = ((i14222 & 458752) == 131072) | startRestartGroup.changedInstance(tabKeys222) | startRestartGroup.changed(tabsRegistry222);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.TabGroupKt$TabList$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                            return m9543invokeZmokQxo(keyEvent.m6792unboximpl());
                        }

                        /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                        public final Boolean m9543invokeZmokQxo(android.view.KeyEvent event) {
                            Intrinsics.checkNotNullParameter(event, "event");
                            boolean z = false;
                            if (Orientation.this == Orientation.Horizontal && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6571getDirectionLeftEK5gGoQ())) {
                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                    FocusRequester focusRequester = tabsRegistry222.getTabFocusRequesters().get(tabKeys222.get(((CollectionsKt.indexOf((List<? extends String>) tabKeys222, tabsRegistry222.getFocusedTab()) - 1) + tabKeys222.size()) % tabKeys222.size()));
                                    Intrinsics.checkNotNull(focusRequester);
                                    FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                                }
                            } else if (Orientation.this == Orientation.Horizontal && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6572getDirectionRightEK5gGoQ())) {
                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                    FocusRequester focusRequester2 = tabsRegistry222.getTabFocusRequesters().get(tabKeys222.get((CollectionsKt.indexOf((List<? extends String>) tabKeys222, tabsRegistry222.getFocusedTab()) + 1) % tabKeys222.size()));
                                    Intrinsics.checkNotNull(focusRequester2);
                                    FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester2, 0, 1, null);
                                }
                            } else if (Orientation.this == Orientation.Vertical && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6573getDirectionUpEK5gGoQ())) {
                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                    FocusRequester focusRequester3 = tabsRegistry222.getTabFocusRequesters().get(tabKeys222.get(((CollectionsKt.indexOf((List<? extends String>) tabKeys222, tabsRegistry222.getFocusedTab()) - 1) + tabKeys222.size()) % tabKeys222.size()));
                                    Intrinsics.checkNotNull(focusRequester3);
                                    FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester3, 0, 1, null);
                                }
                            } else if (Orientation.this == Orientation.Vertical && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                    FocusRequester focusRequester4 = tabsRegistry222.getTabFocusRequesters().get(tabKeys222.get((CollectionsKt.indexOf((List<? extends String>) tabKeys222, tabsRegistry222.getFocusedTab()) + 1) % tabKeys222.size()));
                                    Intrinsics.checkNotNull(focusRequester4);
                                    FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester4, 0, 1, null);
                                }
                            } else if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6610getHomeEK5gGoQ())) {
                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                    FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabsRegistry222.getTabFocusRequesters(), (String) CollectionsKt.first((List) tabKeys222)), 0, 1, null);
                                }
                            } else {
                                if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6646getMoveEndEK5gGoQ())) {
                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                        FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabsRegistry222.getTabFocusRequesters(), (String) CollectionsKt.last((List) tabKeys222)), 0, 1, null);
                                    }
                                }
                                return Boolean.valueOf(z);
                            }
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    Modifier onKeyEvent222 = KeyInputModifierKt.onKeyEvent(padding222, (Function1) rememberedValue);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed = startRestartGroup.changed(tabsRegistry222) | startRestartGroup.changedInstance(tabKeys222);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new Function1() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit TabList__nWoaYo$lambda$14$lambda$13;
                            TabList__nWoaYo$lambda$14$lambda$13 = TabGroupKt.TabList__nWoaYo$lambda$14$lambda$13(TabsRegistry.this, tabKeys222, (FocusState) obj);
                            return TabList__nWoaYo$lambda$14$lambda$13;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                    Modifier onFocusChanged222 = FocusChangedModifierKt.onFocusChanged(onKeyEvent222, (Function1) rememberedValue2);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(start, top, startRestartGroup, (((i14222 >> 15) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, onFocusChanged222);
                    Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                    orientation3 = orientation2;
                    Modifier modifier3222 = modifier2;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                    Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4976constructorimpl.getInserting()) {
                    }
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    final RowScope rowScopeInstance222 = RowScopeInstance.INSTANCE;
                    CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(m5693getUnspecified0d7_KjU2)), ComposableLambdaKt.rememberComposableLambda(1878345907, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.TabGroupKt$TabList$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            if ((i15 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1878345907, i15, -1, "com.composeunstyled.TabList.<anonymous>.<anonymous> (TabGroup.kt:183)");
                            }
                            content.invoke(rowScopeInstance222, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    horizontal2 = start;
                    shape3 = shape2;
                    j6 = m5693getUnspecified0d7_KjU2;
                    vertical2 = top;
                    j3 = j7222;
                    paddingValues2 = paddingValues3222;
                    modifier2 = modifier3222;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                j4 = j2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i2 & 128;
                if (i10 == 0) {
                }
                i11 = i10;
                if ((i2 & 256) != 0) {
                }
                if ((38347923 & i3) == 38347922) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal2222 = LocalTabsRegistry;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2222 = startRestartGroup.consume(providableCompositionLocal2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final TabsRegistry tabsRegistry2222 = (TabsRegistry) consume2222;
                final List tabKeys2222 = tabsRegistry2222.getTabKeys();
                int i142222 = i3;
                long j72222 = j5;
                Modifier padding2222 = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(SelectableGroupKt.selectableGroup(FocusableKt.focusGroup(FocusRestorerKt.focusRestorer$default(modifier2, null, 1, null))), shape2), j5, null, 2, null), noPadding);
                startRestartGroup.startReplaceGroup(-1746271574);
                PaddingValues paddingValues32222 = noPadding;
                changedInstance = ((i142222 & 458752) == 131072) | startRestartGroup.changedInstance(tabKeys2222) | startRestartGroup.changed(tabsRegistry2222);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.TabGroupKt$TabList$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m9543invokeZmokQxo(keyEvent.m6792unboximpl());
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m9543invokeZmokQxo(android.view.KeyEvent event) {
                        Intrinsics.checkNotNullParameter(event, "event");
                        boolean z = false;
                        if (Orientation.this == Orientation.Horizontal && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6571getDirectionLeftEK5gGoQ())) {
                            if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                FocusRequester focusRequester = tabsRegistry2222.getTabFocusRequesters().get(tabKeys2222.get(((CollectionsKt.indexOf((List<? extends String>) tabKeys2222, tabsRegistry2222.getFocusedTab()) - 1) + tabKeys2222.size()) % tabKeys2222.size()));
                                Intrinsics.checkNotNull(focusRequester);
                                FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                            }
                        } else if (Orientation.this == Orientation.Horizontal && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6572getDirectionRightEK5gGoQ())) {
                            if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                FocusRequester focusRequester2 = tabsRegistry2222.getTabFocusRequesters().get(tabKeys2222.get((CollectionsKt.indexOf((List<? extends String>) tabKeys2222, tabsRegistry2222.getFocusedTab()) + 1) % tabKeys2222.size()));
                                Intrinsics.checkNotNull(focusRequester2);
                                FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester2, 0, 1, null);
                            }
                        } else if (Orientation.this == Orientation.Vertical && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6573getDirectionUpEK5gGoQ())) {
                            if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                FocusRequester focusRequester3 = tabsRegistry2222.getTabFocusRequesters().get(tabKeys2222.get(((CollectionsKt.indexOf((List<? extends String>) tabKeys2222, tabsRegistry2222.getFocusedTab()) - 1) + tabKeys2222.size()) % tabKeys2222.size()));
                                Intrinsics.checkNotNull(focusRequester3);
                                FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester3, 0, 1, null);
                            }
                        } else if (Orientation.this == Orientation.Vertical && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                            if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                FocusRequester focusRequester4 = tabsRegistry2222.getTabFocusRequesters().get(tabKeys2222.get((CollectionsKt.indexOf((List<? extends String>) tabKeys2222, tabsRegistry2222.getFocusedTab()) + 1) % tabKeys2222.size()));
                                Intrinsics.checkNotNull(focusRequester4);
                                FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester4, 0, 1, null);
                            }
                        } else if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6610getHomeEK5gGoQ())) {
                            if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabsRegistry2222.getTabFocusRequesters(), (String) CollectionsKt.first((List) tabKeys2222)), 0, 1, null);
                            }
                        } else {
                            if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6646getMoveEndEK5gGoQ())) {
                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                    FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabsRegistry2222.getTabFocusRequesters(), (String) CollectionsKt.last((List) tabKeys2222)), 0, 1, null);
                                }
                            }
                            return Boolean.valueOf(z);
                        }
                        z = true;
                        return Boolean.valueOf(z);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier onKeyEvent2222 = KeyInputModifierKt.onKeyEvent(padding2222, (Function1) rememberedValue);
                startRestartGroup.startReplaceGroup(-1633490746);
                changed = startRestartGroup.changed(tabsRegistry2222) | startRestartGroup.changedInstance(tabKeys2222);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = new Function1() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TabList__nWoaYo$lambda$14$lambda$13;
                        TabList__nWoaYo$lambda$14$lambda$13 = TabGroupKt.TabList__nWoaYo$lambda$14$lambda$13(TabsRegistry.this, tabKeys2222, (FocusState) obj);
                        return TabList__nWoaYo$lambda$14$lambda$13;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                Modifier onFocusChanged2222 = FocusChangedModifierKt.onFocusChanged(onKeyEvent2222, (Function1) rememberedValue2);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(start, top, startRestartGroup, (((i142222 >> 15) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, onFocusChanged2222);
                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                orientation3 = orientation2;
                Modifier modifier32222 = modifier2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting()) {
                }
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                final RowScope rowScopeInstance2222 = RowScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(m5693getUnspecified0d7_KjU2)), ComposableLambdaKt.rememberComposableLambda(1878345907, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.TabGroupKt$TabList$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i15) {
                        if ((i15 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1878345907, i15, -1, "com.composeunstyled.TabList.<anonymous>.<anonymous> (TabGroup.kt:183)");
                        }
                        content.invoke(rowScopeInstance2222, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                horizontal2 = start;
                shape3 = shape2;
                j6 = m5693getUnspecified0d7_KjU2;
                vertical2 = top;
                j3 = j72222;
                paddingValues2 = paddingValues32222;
                modifier2 = modifier32222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            j3 = j;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            j4 = j2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i2 & 128;
            if (i10 == 0) {
            }
            i11 = i10;
            if ((i2 & 256) != 0) {
            }
            if ((38347923 & i3) == 38347922) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal22222 = LocalTabsRegistry;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume22222 = startRestartGroup.consume(providableCompositionLocal22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final TabsRegistry tabsRegistry22222 = (TabsRegistry) consume22222;
            final List tabKeys22222 = tabsRegistry22222.getTabKeys();
            int i1422222 = i3;
            long j722222 = j5;
            Modifier padding22222 = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(SelectableGroupKt.selectableGroup(FocusableKt.focusGroup(FocusRestorerKt.focusRestorer$default(modifier2, null, 1, null))), shape2), j5, null, 2, null), noPadding);
            startRestartGroup.startReplaceGroup(-1746271574);
            PaddingValues paddingValues322222 = noPadding;
            changedInstance = ((i1422222 & 458752) == 131072) | startRestartGroup.changedInstance(tabKeys22222) | startRestartGroup.changed(tabsRegistry22222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.TabGroupKt$TabList$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m9543invokeZmokQxo(keyEvent.m6792unboximpl());
                }

                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m9543invokeZmokQxo(android.view.KeyEvent event) {
                    Intrinsics.checkNotNullParameter(event, "event");
                    boolean z = false;
                    if (Orientation.this == Orientation.Horizontal && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6571getDirectionLeftEK5gGoQ())) {
                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                            FocusRequester focusRequester = tabsRegistry22222.getTabFocusRequesters().get(tabKeys22222.get(((CollectionsKt.indexOf((List<? extends String>) tabKeys22222, tabsRegistry22222.getFocusedTab()) - 1) + tabKeys22222.size()) % tabKeys22222.size()));
                            Intrinsics.checkNotNull(focusRequester);
                            FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                        }
                    } else if (Orientation.this == Orientation.Horizontal && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6572getDirectionRightEK5gGoQ())) {
                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                            FocusRequester focusRequester2 = tabsRegistry22222.getTabFocusRequesters().get(tabKeys22222.get((CollectionsKt.indexOf((List<? extends String>) tabKeys22222, tabsRegistry22222.getFocusedTab()) + 1) % tabKeys22222.size()));
                            Intrinsics.checkNotNull(focusRequester2);
                            FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester2, 0, 1, null);
                        }
                    } else if (Orientation.this == Orientation.Vertical && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6573getDirectionUpEK5gGoQ())) {
                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                            FocusRequester focusRequester3 = tabsRegistry22222.getTabFocusRequesters().get(tabKeys22222.get(((CollectionsKt.indexOf((List<? extends String>) tabKeys22222, tabsRegistry22222.getFocusedTab()) - 1) + tabKeys22222.size()) % tabKeys22222.size()));
                            Intrinsics.checkNotNull(focusRequester3);
                            FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester3, 0, 1, null);
                        }
                    } else if (Orientation.this == Orientation.Vertical && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                            FocusRequester focusRequester4 = tabsRegistry22222.getTabFocusRequesters().get(tabKeys22222.get((CollectionsKt.indexOf((List<? extends String>) tabKeys22222, tabsRegistry22222.getFocusedTab()) + 1) % tabKeys22222.size()));
                            Intrinsics.checkNotNull(focusRequester4);
                            FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester4, 0, 1, null);
                        }
                    } else if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6610getHomeEK5gGoQ())) {
                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                            FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabsRegistry22222.getTabFocusRequesters(), (String) CollectionsKt.first((List) tabKeys22222)), 0, 1, null);
                        }
                    } else {
                        if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6646getMoveEndEK5gGoQ())) {
                            if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabsRegistry22222.getTabFocusRequesters(), (String) CollectionsKt.last((List) tabKeys22222)), 0, 1, null);
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier onKeyEvent22222 = KeyInputModifierKt.onKeyEvent(padding22222, (Function1) rememberedValue);
            startRestartGroup.startReplaceGroup(-1633490746);
            changed = startRestartGroup.changed(tabsRegistry22222) | startRestartGroup.changedInstance(tabKeys22222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new Function1() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit TabList__nWoaYo$lambda$14$lambda$13;
                    TabList__nWoaYo$lambda$14$lambda$13 = TabGroupKt.TabList__nWoaYo$lambda$14$lambda$13(TabsRegistry.this, tabKeys22222, (FocusState) obj);
                    return TabList__nWoaYo$lambda$14$lambda$13;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            Modifier onFocusChanged22222 = FocusChangedModifierKt.onFocusChanged(onKeyEvent22222, (Function1) rememberedValue2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22222 = RowKt.rowMeasurePolicy(start, top, startRestartGroup, (((i1422222 >> 15) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, onFocusChanged22222);
            Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
            orientation3 = orientation2;
            Modifier modifier322222 = modifier2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl.getInserting()) {
            }
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            final RowScope rowScopeInstance22222 = RowScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(m5693getUnspecified0d7_KjU2)), ComposableLambdaKt.rememberComposableLambda(1878345907, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.TabGroupKt$TabList$3$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i15) {
                    if ((i15 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1878345907, i15, -1, "com.composeunstyled.TabList.<anonymous>.<anonymous> (TabGroup.kt:183)");
                    }
                    content.invoke(rowScopeInstance22222, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            horizontal2 = start;
            shape3 = shape2;
            j6 = m5693getUnspecified0d7_KjU2;
            vertical2 = top;
            j3 = j722222;
            paddingValues2 = paddingValues322222;
            modifier2 = modifier322222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        shape2 = shape;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        j3 = j;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        j4 = j2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i2 & 128;
        if (i10 == 0) {
        }
        i11 = i10;
        if ((i2 & 256) != 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal222222 = LocalTabsRegistry;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume222222 = startRestartGroup.consume(providableCompositionLocal222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final TabsRegistry tabsRegistry222222 = (TabsRegistry) consume222222;
        final List tabKeys222222 = tabsRegistry222222.getTabKeys();
        int i14222222 = i3;
        long j7222222 = j5;
        Modifier padding222222 = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(SelectableGroupKt.selectableGroup(FocusableKt.focusGroup(FocusRestorerKt.focusRestorer$default(modifier2, null, 1, null))), shape2), j5, null, 2, null), noPadding);
        startRestartGroup.startReplaceGroup(-1746271574);
        PaddingValues paddingValues3222222 = noPadding;
        changedInstance = ((i14222222 & 458752) == 131072) | startRestartGroup.changedInstance(tabKeys222222) | startRestartGroup.changed(tabsRegistry222222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.TabGroupKt$TabList$1$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m9543invokeZmokQxo(keyEvent.m6792unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m9543invokeZmokQxo(android.view.KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                boolean z = false;
                if (Orientation.this == Orientation.Horizontal && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6571getDirectionLeftEK5gGoQ())) {
                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                        FocusRequester focusRequester = tabsRegistry222222.getTabFocusRequesters().get(tabKeys222222.get(((CollectionsKt.indexOf((List<? extends String>) tabKeys222222, tabsRegistry222222.getFocusedTab()) - 1) + tabKeys222222.size()) % tabKeys222222.size()));
                        Intrinsics.checkNotNull(focusRequester);
                        FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                    }
                } else if (Orientation.this == Orientation.Horizontal && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6572getDirectionRightEK5gGoQ())) {
                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                        FocusRequester focusRequester2 = tabsRegistry222222.getTabFocusRequesters().get(tabKeys222222.get((CollectionsKt.indexOf((List<? extends String>) tabKeys222222, tabsRegistry222222.getFocusedTab()) + 1) % tabKeys222222.size()));
                        Intrinsics.checkNotNull(focusRequester2);
                        FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester2, 0, 1, null);
                    }
                } else if (Orientation.this == Orientation.Vertical && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6573getDirectionUpEK5gGoQ())) {
                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                        FocusRequester focusRequester3 = tabsRegistry222222.getTabFocusRequesters().get(tabKeys222222.get(((CollectionsKt.indexOf((List<? extends String>) tabKeys222222, tabsRegistry222222.getFocusedTab()) - 1) + tabKeys222222.size()) % tabKeys222222.size()));
                        Intrinsics.checkNotNull(focusRequester3);
                        FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester3, 0, 1, null);
                    }
                } else if (Orientation.this == Orientation.Vertical && Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                        FocusRequester focusRequester4 = tabsRegistry222222.getTabFocusRequesters().get(tabKeys222222.get((CollectionsKt.indexOf((List<? extends String>) tabKeys222222, tabsRegistry222222.getFocusedTab()) + 1) % tabKeys222222.size()));
                        Intrinsics.checkNotNull(focusRequester4);
                        FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester4, 0, 1, null);
                    }
                } else if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6610getHomeEK5gGoQ())) {
                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                        FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabsRegistry222222.getTabFocusRequesters(), (String) CollectionsKt.first((List) tabKeys222222)), 0, 1, null);
                    }
                } else {
                    if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6646getMoveEndEK5gGoQ())) {
                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                            FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabsRegistry222222.getTabFocusRequesters(), (String) CollectionsKt.last((List) tabKeys222222)), 0, 1, null);
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier onKeyEvent222222 = KeyInputModifierKt.onKeyEvent(padding222222, (Function1) rememberedValue);
        startRestartGroup.startReplaceGroup(-1633490746);
        changed = startRestartGroup.changed(tabsRegistry222222) | startRestartGroup.changedInstance(tabKeys222222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new Function1() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TabList__nWoaYo$lambda$14$lambda$13;
                TabList__nWoaYo$lambda$14$lambda$13 = TabGroupKt.TabList__nWoaYo$lambda$14$lambda$13(TabsRegistry.this, tabKeys222222, (FocusState) obj);
                return TabList__nWoaYo$lambda$14$lambda$13;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        Modifier onFocusChanged222222 = FocusChangedModifierKt.onFocusChanged(onKeyEvent222222, (Function1) rememberedValue2);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222222 = RowKt.rowMeasurePolicy(start, top, startRestartGroup, (((i14222222 >> 15) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, onFocusChanged222222);
        Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
        orientation3 = orientation2;
        Modifier modifier3222222 = modifier2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222222);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        final RowScope rowScopeInstance222222 = RowScopeInstance.INSTANCE;
        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(m5693getUnspecified0d7_KjU2)), ComposableLambdaKt.rememberComposableLambda(1878345907, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.TabGroupKt$TabList$3$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i15) {
                if ((i15 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1878345907, i15, -1, "com.composeunstyled.TabList.<anonymous>.<anonymous> (TabGroup.kt:183)");
                }
                content.invoke(rowScopeInstance222222, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        horizontal2 = start;
        shape3 = shape2;
        j6 = m5693getUnspecified0d7_KjU2;
        vertical2 = top;
        j3 = j7222222;
        paddingValues2 = paddingValues3222222;
        modifier2 = modifier3222222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabList__nWoaYo$lambda$14$lambda$13(TabsRegistry tabsRegistry, List list, FocusState it) {
        FocusRequester focusRequester;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getHasFocus() && tabsRegistry.getFocusedTab() == null && (focusRequester = tabsRegistry.getTabFocusRequesters().get(CollectionsKt.firstOrNull(list))) != null) {
            FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0292  */
    /* renamed from: Tab-R3CKDEk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9540TabR3CKDEk(final String key, final boolean z, final Function0<Unit> onSelected, Modifier modifier, boolean z2, boolean z3, Indication indication, MutableInteractionSource mutableInteractionSource, Shape shape, long j, long j2, PaddingValues paddingValues, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z5;
        int i7;
        Indication indication2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j3;
        int i14;
        int i15;
        int i16;
        Modifier.Companion companion;
        final boolean z6;
        MutableInteractionSource mutableInteractionSource2;
        final Shape rectangleShape;
        long m5693getUnspecified0d7_KjU;
        PaddingValues noPadding;
        int i17;
        long j4;
        FocusRequester focusRequester;
        final MutableInteractionSource mutableInteractionSource3;
        Composer composer2;
        final boolean z7;
        final boolean z8;
        final Indication indication3;
        final long j5;
        final Modifier modifier3;
        final PaddingValues paddingValues2;
        final long j6;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1904512462);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(key) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            z4 = z;
            i4 |= startRestartGroup.changed(z4) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changedInstance(onSelected) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    z5 = z2;
                    i4 |= startRestartGroup.changed(z5) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                    }
                    if ((i & 1572864) != 0) {
                        indication2 = indication;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(indication2)) ? 1048576 : 524288;
                    } else {
                        indication2 = indication;
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i10 = i9;
                        i4 |= startRestartGroup.changed(shape) ? 67108864 : 33554432;
                        i11 = i3 & 512;
                        if (i11 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i12 = i4 | (startRestartGroup.changed(j) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456);
                            i13 = i3 & 1024;
                            if (i13 == 0) {
                                i14 = i2 | 6;
                                j3 = j2;
                            } else {
                                j3 = j2;
                                if ((i2 & 6) == 0) {
                                    i14 = i2 | (startRestartGroup.changed(j3) ? 4 : 2);
                                } else {
                                    i14 = i2;
                                }
                            }
                            i15 = i3 & 2048;
                            if (i15 == 0) {
                                i14 |= 48;
                                i16 = i15;
                            } else if ((i2 & 48) == 0) {
                                i16 = i15;
                                i14 |= startRestartGroup.changed(paddingValues) ? 32 : 16;
                            } else {
                                i16 = i15;
                            }
                            int i18 = i14;
                            if ((i3 & 4096) == 0) {
                                i18 |= 384;
                            } else if ((i2 & 384) == 0) {
                                i18 |= startRestartGroup.changedInstance(content) ? 256 : 128;
                            }
                            if ((i12 & 306783379) == 306783378 || (i18 & 147) != 146 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i6 != 0) {
                                        z5 = true;
                                    }
                                    z6 = i7 == 0 ? true : z3;
                                    if ((i3 & 64) != 0) {
                                        ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localIndication);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        i12 &= -3670017;
                                        indication2 = (Indication) consume;
                                    }
                                    mutableInteractionSource2 = i8 == 0 ? null : mutableInteractionSource;
                                    rectangleShape = i10 == 0 ? RectangleShapeKt.getRectangleShape() : shape;
                                    m5693getUnspecified0d7_KjU = i11 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j;
                                    if (i13 != 0) {
                                        j3 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                                    }
                                    noPadding = i16 == 0 ? UtilsKt.getNoPadding() : paddingValues;
                                    i17 = i12;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i12 &= -3670017;
                                    }
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    rectangleShape = shape;
                                    m5693getUnspecified0d7_KjU = j;
                                    noPadding = paddingValues;
                                    companion = modifier2;
                                    i17 = i12;
                                    z6 = z3;
                                }
                                startRestartGroup.endDefaults();
                                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                if (ComposerKt.isTraceInProgress()) {
                                    j4 = j3;
                                } else {
                                    j4 = j3;
                                    ComposerKt.traceEventStart(-1904512462, i17, i18, "com.composeunstyled.Tab (TabGroup.kt:203)");
                                }
                                ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal = LocalTabsRegistry;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(providableCompositionLocal);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final TabsRegistry tabsRegistry = (TabsRegistry) consume2;
                                focusRequester = tabsRegistry.getTabFocusRequesters().get(key);
                                if (focusRequester != null) {
                                    throw new IllegalStateException(("Tried to setup a Tab with key = " + key + " but was not found in the tab keys. Make sure you provide the key").toString());
                                }
                                final String activatedTab = tabsRegistry.getActivatedTab();
                                Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(companion, focusRequester);
                                startRestartGroup.startReplaceGroup(-1633490746);
                                boolean changed = startRestartGroup.changed(tabsRegistry) | startRestartGroup.changed(activatedTab);
                                Modifier modifier4 = companion;
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function1() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit Tab_R3CKDEk$lambda$18$lambda$17;
                                            Tab_R3CKDEk$lambda$18$lambda$17 = TabGroupKt.Tab_R3CKDEk$lambda$18$lambda$17(TabsRegistry.this, activatedTab, (FocusProperties) obj);
                                            return Tab_R3CKDEk$lambda$18$lambda$17;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceGroup();
                                Modifier focusProperties = FocusPropertiesKt.focusProperties(focusRequester2, (Function1) rememberedValue);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                boolean changed2 = ((i17 & 896) == 256) | startRestartGroup.changed(tabsRegistry) | ((i17 & 14) == 4) | ((458752 & i17) == 131072);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new Function1() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit Tab_R3CKDEk$lambda$20$lambda$19;
                                            Tab_R3CKDEk$lambda$20$lambda$19 = TabGroupKt.Tab_R3CKDEk$lambda$20$lambda$19(TabsRegistry.this, key, z6, onSelected, (FocusState) obj);
                                            return Tab_R3CKDEk$lambda$20$lambda$19;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceGroup();
                                Modifier padding = PaddingKt.padding(SelectableKt.m1164selectableO2vRcR0(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(FocusChangedModifierKt.onFocusChanged(focusProperties, (Function1) rememberedValue2), rectangleShape), m5693getUnspecified0d7_KjU, null, 2, null), z4, mutableInteractionSource4, indication2, z5, Role.m7575boximpl(Role.INSTANCE.m7589getTabo7Vup1c()), onSelected), noPadding);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                Composer m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                                Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j4)), ComposableLambdaKt.rememberComposableLambda(980475768, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.TabGroupKt$Tab$3$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i19) {
                                        if ((i19 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(980475768, i19, -1, "com.composeunstyled.Tab.<anonymous>.<anonymous> (TabGroup.kt:236)");
                                        }
                                        content.invoke(composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                mutableInteractionSource3 = mutableInteractionSource4;
                                composer2 = startRestartGroup;
                                z7 = z6;
                                z8 = z5;
                                indication3 = indication2;
                                j5 = m5693getUnspecified0d7_KjU;
                                modifier3 = modifier4;
                                paddingValues2 = noPadding;
                                j6 = j4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                rectangleShape = shape;
                                composer2 = startRestartGroup;
                                modifier3 = modifier2;
                                z8 = z5;
                                z7 = z3;
                                j5 = j;
                                j6 = j3;
                                indication3 = indication2;
                                mutableInteractionSource3 = mutableInteractionSource;
                                paddingValues2 = paddingValues;
                            }
                            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit Tab_R3CKDEk$lambda$22;
                                        Tab_R3CKDEk$lambda$22 = TabGroupKt.Tab_R3CKDEk$lambda$22(key, z, onSelected, modifier3, z8, z7, indication3, mutableInteractionSource3, rectangleShape, j5, j6, paddingValues2, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        return Tab_R3CKDEk$lambda$22;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i12 = i4;
                        i13 = i3 & 1024;
                        if (i13 == 0) {
                        }
                        i15 = i3 & 2048;
                        if (i15 == 0) {
                        }
                        int i182 = i14;
                        if ((i3 & 4096) == 0) {
                        }
                        if ((i12 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i16 == 0) {
                        }
                        i17 = i12;
                        startRestartGroup.endDefaults();
                        MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal2 = LocalTabsRegistry;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume22 = startRestartGroup.consume(providableCompositionLocal2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final TabsRegistry tabsRegistry2 = (TabsRegistry) consume22;
                        focusRequester = tabsRegistry2.getTabFocusRequesters().get(key);
                        if (focusRequester != null) {
                        }
                    }
                    i10 = i9;
                    i11 = i3 & 512;
                    if (i11 != 0) {
                    }
                    i12 = i4;
                    i13 = i3 & 1024;
                    if (i13 == 0) {
                    }
                    i15 = i3 & 2048;
                    if (i15 == 0) {
                    }
                    int i1822 = i14;
                    if ((i3 & 4096) == 0) {
                    }
                    if ((i12 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i16 == 0) {
                    }
                    i17 = i12;
                    startRestartGroup.endDefaults();
                    MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal22 = LocalTabsRegistry;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume222 = startRestartGroup.consume(providableCompositionLocal22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final TabsRegistry tabsRegistry22 = (TabsRegistry) consume222;
                    focusRequester = tabsRegistry22.getTabFocusRequesters().get(key);
                    if (focusRequester != null) {
                    }
                }
                z5 = z2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) != 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i4;
                i13 = i3 & 1024;
                if (i13 == 0) {
                }
                i15 = i3 & 2048;
                if (i15 == 0) {
                }
                int i18222 = i14;
                if ((i3 & 4096) == 0) {
                }
                if ((i12 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (i8 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i13 != 0) {
                }
                if (i16 == 0) {
                }
                i17 = i12;
                startRestartGroup.endDefaults();
                MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal222 = LocalTabsRegistry;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2222 = startRestartGroup.consume(providableCompositionLocal222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final TabsRegistry tabsRegistry222 = (TabsRegistry) consume2222;
                focusRequester = tabsRegistry222.getTabFocusRequesters().get(key);
                if (focusRequester != null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z5 = z2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) != 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i4;
            i13 = i3 & 1024;
            if (i13 == 0) {
            }
            i15 = i3 & 2048;
            if (i15 == 0) {
            }
            int i182222 = i14;
            if ((i3 & 4096) == 0) {
            }
            if ((i12 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (i8 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i13 != 0) {
            }
            if (i16 == 0) {
            }
            i17 = i12;
            startRestartGroup.endDefaults();
            MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal2222 = LocalTabsRegistry;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume22222 = startRestartGroup.consume(providableCompositionLocal2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final TabsRegistry tabsRegistry2222 = (TabsRegistry) consume22222;
            focusRequester = tabsRegistry2222.getTabFocusRequesters().get(key);
            if (focusRequester != null) {
            }
        }
        z4 = z;
        if ((i3 & 4) == 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z5 = z2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i4;
        i13 = i3 & 1024;
        if (i13 == 0) {
        }
        i15 = i3 & 2048;
        if (i15 == 0) {
        }
        int i1822222 = i14;
        if ((i3 & 4096) == 0) {
        }
        if ((i12 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (i8 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i13 != 0) {
        }
        if (i16 == 0) {
        }
        i17 = i12;
        startRestartGroup.endDefaults();
        MutableInteractionSource mutableInteractionSource422222 = mutableInteractionSource2;
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal22222 = LocalTabsRegistry;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume222222 = startRestartGroup.consume(providableCompositionLocal22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final TabsRegistry tabsRegistry22222 = (TabsRegistry) consume222222;
        focusRequester = tabsRegistry22222.getTabFocusRequesters().get(key);
        if (focusRequester != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Tab_R3CKDEk$lambda$18$lambda$17(TabsRegistry tabsRegistry, String str, FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
        FocusRequester focusRequester = tabsRegistry.getPanelsFocusRequesters().get(str);
        if (focusRequester == null) {
            focusRequester = FocusRequester.INSTANCE.getDefault();
        }
        focusProperties.setNext(focusRequester);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Tab_R3CKDEk$lambda$20$lambda$19(TabsRegistry tabsRegistry, String str, boolean z, Function0 function0, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isFocused()) {
            tabsRegistry.setFocusedTab(str);
            if (z) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e2  */
    /* renamed from: TabPanel-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9542TabPanelXz6DiA(final String key, Modifier modifier, Shape shape, long j, long j2, PaddingValues paddingValues, Alignment alignment, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Shape shape2;
        int i5;
        long j3;
        int i6;
        PaddingValues paddingValues2;
        int i7;
        Modifier.Companion companion;
        Shape rectangleShape;
        long m5693getUnspecified0d7_KjU;
        long j4;
        final PaddingValues noPadding;
        final Alignment topStart;
        long j5;
        TabsRegistry tabsRegistry;
        Modifier modifier3;
        Shape shape3;
        final long j6;
        final Shape shape4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1764662021);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(key) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                shape2 = shape;
                i3 |= startRestartGroup.changed(shape2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                    j3 = j;
                } else {
                    j3 = j;
                    if ((i & 3072) == 0) {
                        i3 |= startRestartGroup.changed(j3) ? 2048 : 1024;
                    }
                }
                if ((i & 24576) == 0) {
                    i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j2)) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    paddingValues2 = paddingValues;
                } else {
                    paddingValues2 = paddingValues;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues2) ? 131072 : 65536;
                    }
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(alignment) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                        rectangleShape = i4 != 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                        m5693getUnspecified0d7_KjU = i5 != 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j3;
                        if ((i2 & 16) != 0) {
                            ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localContentColor);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            j4 = ((Color) consume).m5667unboximpl();
                            i3 &= -57345;
                        } else {
                            j4 = j2;
                        }
                        noPadding = i6 != 0 ? UtilsKt.getNoPadding() : paddingValues2;
                        if (i7 != 0) {
                            topStart = Alignment.INSTANCE.getTopStart();
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                j5 = m5693getUnspecified0d7_KjU;
                            } else {
                                j5 = m5693getUnspecified0d7_KjU;
                                ComposerKt.traceEventStart(1764662021, i3, -1, "com.composeunstyled.TabPanel (TabGroup.kt:251)");
                            }
                            ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal = LocalTabsRegistry;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(providableCompositionLocal);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            tabsRegistry = (TabsRegistry) consume2;
                            if (Intrinsics.areEqual(tabsRegistry.getActivatedTab(), key)) {
                                modifier3 = companion;
                                shape3 = rectangleShape;
                            } else {
                                FocusRequester focusRequester = tabsRegistry.getPanelsFocusRequesters().get(key);
                                if (focusRequester == null) {
                                    throw new IllegalStateException(("Tried to activate TabPanel with key = " + key + ". Did you forget to pass the key in the list of tabs in your TabGroup?").toString());
                                }
                                Modifier focusGroup = FocusableKt.focusGroup(FocusRequesterModifierKt.focusRequester(PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(companion, rectangleShape), j5, null, 2, null), noPadding), focusRequester));
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
                                modifier3 = companion;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, focusGroup);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                shape3 = rectangleShape;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                Composer m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                                Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j4)), ComposableLambdaKt.rememberComposableLambda(665587652, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.TabGroupKt$TabPanel$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i9) {
                                        if ((i9 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(665587652, i9, -1, "com.composeunstyled.TabPanel.<anonymous>.<anonymous> (TabGroup.kt:268)");
                                        }
                                        content.invoke(boxScopeInstance, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j6 = j4;
                            modifier2 = modifier3;
                            shape4 = shape3;
                            j3 = j5;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        companion = modifier2;
                        rectangleShape = shape2;
                        noPadding = paddingValues2;
                        m5693getUnspecified0d7_KjU = j3;
                        j4 = j2;
                    }
                    topStart = alignment;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal2 = LocalTabsRegistry;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(providableCompositionLocal2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    tabsRegistry = (TabsRegistry) consume22;
                    if (Intrinsics.areEqual(tabsRegistry.getActivatedTab(), key)) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    j6 = j4;
                    modifier2 = modifier3;
                    shape4 = shape3;
                    j3 = j5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    shape4 = shape2;
                    noPadding = paddingValues2;
                    j6 = j2;
                    topStart = alignment;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    final long j7 = j3;
                    endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.TabGroupKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit TabPanel_X_z6DiA$lambda$24;
                            TabPanel_X_z6DiA$lambda$24 = TabGroupKt.TabPanel_X_z6DiA$lambda$24(key, modifier4, shape4, j7, j6, noPadding, topStart, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return TabPanel_X_z6DiA$lambda$24;
                        }
                    });
                    return;
                }
                return;
            }
            shape2 = shape;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((i & 24576) == 0) {
            }
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((4793491 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            topStart = alignment;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal22 = LocalTabsRegistry;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(providableCompositionLocal22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            tabsRegistry = (TabsRegistry) consume222;
            if (Intrinsics.areEqual(tabsRegistry.getActivatedTab(), key)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            j6 = j4;
            modifier2 = modifier3;
            shape4 = shape3;
            j3 = j5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        shape2 = shape;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((i & 24576) == 0) {
        }
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        topStart = alignment;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<TabsRegistry> providableCompositionLocal222 = LocalTabsRegistry;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(providableCompositionLocal222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        tabsRegistry = (TabsRegistry) consume2222;
        if (Intrinsics.areEqual(tabsRegistry.getActivatedTab(), key)) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        j6 = j4;
        modifier2 = modifier3;
        shape4 = shape3;
        j3 = j5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
