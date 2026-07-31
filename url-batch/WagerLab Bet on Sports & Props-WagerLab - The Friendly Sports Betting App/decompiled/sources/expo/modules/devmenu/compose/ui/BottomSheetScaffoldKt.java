package expo.modules.devmenu.compose.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.composables.core.BottomSheetScope;
import com.composables.core.ModalBottomSheetKt;
import com.composables.core.ModalBottomSheetScope;
import com.composables.core.ModalBottomSheetState;
import com.composables.core.SheetDetent;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import expo.modules.devmenu.compose.primitives.SurfaceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aM\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0002\b\u000f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0011\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0012"}, d2 = {"Peek", "Lcom/composables/core/SheetDetent;", "getPeek", "()Lcom/composables/core/SheetDetent;", "Full", "getFull", "rememberBottomSheetState", "Lcom/composables/core/ModalBottomSheetState;", "(Landroidx/compose/runtime/Composer;I)Lcom/composables/core/ModalBottomSheetState;", "BottomSheetScaffold", "", "state", "onDismiss", "Lkotlin/Function0;", "header", "Landroidx/compose/runtime/Composable;", "content", "(Lcom/composables/core/ModalBottomSheetState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BottomSheetScaffoldKt {
    private static final SheetDetent Peek = new SheetDetent("peek", new Function2() { // from class: expo.modules.devmenu.compose.ui.BottomSheetScaffoldKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Dp Peek$lambda$0;
            Peek$lambda$0 = BottomSheetScaffoldKt.Peek$lambda$0((Dp) obj, (Dp) obj2);
            return Peek$lambda$0;
        }
    });
    private static final SheetDetent Full = new SheetDetent("full", new Function2() { // from class: expo.modules.devmenu.compose.ui.BottomSheetScaffoldKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Dp Full$lambda$1;
            Full$lambda$1 = BottomSheetScaffoldKt.Full$lambda$1((Dp) obj, (Dp) obj2);
            return Full$lambda$1;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetScaffold$lambda$4(ModalBottomSheetState modalBottomSheetState, Function0 function0, Function2 function2, Function2 function22, int i, int i2, Composer composer, int i3) {
        BottomSheetScaffold(modalBottomSheetState, function0, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final SheetDetent getPeek() {
        return Peek;
    }

    public static final SheetDetent getFull() {
        return Full;
    }

    public static final ModalBottomSheetState rememberBottomSheetState(Composer composer, int i) {
        composer.startReplaceGroup(1165397693);
        ComposerKt.sourceInformation(composer, "C(rememberBottomSheetState)34@1358L97:BottomSheetScaffold.kt#aaq0h9");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1165397693, i, -1, "expo.modules.devmenu.compose.ui.rememberBottomSheetState (BottomSheetScaffold.kt:34)");
        }
        ModalBottomSheetState rememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(SheetDetent.INSTANCE.getHidden(), CollectionsKt.listOf((Object[]) new SheetDetent[]{SheetDetent.INSTANCE.getHidden(), Peek, Full}), null, null, null, null, null, composer, 0, 124);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberModalBottomSheetState;
    }

    public static final void BottomSheetScaffold(final ModalBottomSheetState state, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(447434065);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffold)P(3,2,1)42@1552L2,46@1653L21,51@1745L953,48@1678L1020:BottomSheetScaffold.kt#aaq0h9");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(state) : startRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                startRestartGroup.startReplaceGroup(1849434622);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: expo.modules.devmenu.compose.ui.BottomSheetScaffoldKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function02 = (Function0) rememberedValue;
                startRestartGroup.endReplaceGroup();
            } else {
                function02 = function0;
            }
            final Function2<? super Composer, ? super Integer, Unit> lambda$1282183958$expo_dev_menu_release = i5 != 0 ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.getLambda$1282183958$expo_dev_menu_release() : function2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(447434065, i3, -1, "expo.modules.devmenu.compose.ui.BottomSheetScaffold (BottomSheetScaffold.kt:45)");
            }
            final ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(617358075, true, new Function3<ModalBottomSheetScope, Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.BottomSheetScaffoldKt$BottomSheetScaffold$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ModalBottomSheetScope modalBottomSheetScope, Composer composer2, Integer num) {
                    invoke(modalBottomSheetScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ModalBottomSheetScope ModalBottomSheet, Composer composer2, int i6) {
                    int i7;
                    Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
                    ComposerKt.sourceInformation(composer2, "C52@1751L7,58@1900L12,59@1952L12,62@2024L6,63@2057L637,53@1763L931:BottomSheetScaffold.kt#aaq0h9");
                    if ((i6 & 6) == 0) {
                        i7 = i6 | ((i6 & 8) == 0 ? composer2.changed(ModalBottomSheet) : composer2.changedInstance(ModalBottomSheet) ? 4 : 2);
                    } else {
                        i7 = i6;
                    }
                    if ((i7 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(617358075, i7, -1, "expo.modules.devmenu.compose.ui.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:52)");
                    }
                    int i8 = i7 & 14;
                    ModalBottomSheetKt.m9383ScrimT042LqI(ModalBottomSheet, null, 0L, null, null, composer2, ModalBottomSheetScope.$stable | i8, 15);
                    Modifier m262backgroundbw27NRU$default = BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1204RoundedCornerShapea9UjIt4$default(NewAppTheme.INSTANCE.getBorderRadius(composer2, 6).m10774getXxxlD9Ej5fM(), NewAppTheme.INSTANCE.getBorderRadius(composer2, 6).m10774getXxxlD9Ej5fM(), 0.0f, 0.0f, 12, null)), NewAppTheme.INSTANCE.getColors(composer2, 6).getBackground().getDefault(), null, 2, null);
                    final ScrollState scrollState = ScrollState.this;
                    final Function2<Composer, Integer, Unit> function23 = lambda$1282183958$expo_dev_menu_release;
                    final Function2<Composer, Integer, Unit> function24 = content;
                    ModalBottomSheetKt.m9384SheetbogVsAg(ModalBottomSheet, m262backgroundbw27NRU$default, false, null, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-665782245, true, new Function3<BottomSheetScope, Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.BottomSheetScaffoldKt$BottomSheetScaffold$2.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BottomSheetScope bottomSheetScope, Composer composer3, Integer num) {
                            invoke(bottomSheetScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BottomSheetScope Sheet, Composer composer3, int i9) {
                            Intrinsics.checkNotNullParameter(Sheet, "$this$Sheet");
                            ComposerKt.sourceInformation(composer3, "C64@2065L623:BottomSheetScaffold.kt#aaq0h9");
                            if ((i9 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-665782245, i9, -1, "expo.modules.devmenu.compose.ui.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:64)");
                            }
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Modifier navigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null));
                            ScrollState scrollState2 = ScrollState.this;
                            Function2<Composer, Integer, Unit> function25 = function23;
                            final Function2<Composer, Integer, Unit> function26 = function24;
                            ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, navigationBarsPadding);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer3);
                            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer3, 116219142, "C70@2284L7,70@2240L88,75@2377L6,79@2513L167,74@2338L342:BottomSheetScaffold.kt#aaq0h9");
                            Modifier m837padding3ABfNKs = PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, NewAppTheme.INSTANCE.getSpacing(composer3, 6).m10809get4D9Ej5fM());
                            ComposerKt.sourceInformationMarkerStart(composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m837padding3ABfNKs);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer m4976constructorimpl2 = Updater.m4976constructorimpl(composer3);
                            Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                                m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                            }
                            Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer3, -584858628, "C71@2310L8:BottomSheetScaffold.kt#aaq0h9");
                            function25.invoke(composer3, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            SurfaceKt.m10820SurfaceT042LqI(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), scrollState2, false, null, false, 14, null), null, NewAppTheme.INSTANCE.getColors(composer3, 6).getBackground().getDefault(), null, ComposableLambdaKt.rememberComposableLambda(411153063, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.BottomSheetScaffoldKt$BottomSheetScaffold$2$1$1$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i10) {
                                    ComposerKt.sourceInformation(composer4, "C82@2610L7,80@2525L145:BottomSheetScaffold.kt#aaq0h9");
                                    if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(411153063, i10, -1, "expo.modules.devmenu.compose.ui.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:80)");
                                    }
                                    Modifier m839paddingVpY3zN4$default = PaddingKt.m839paddingVpY3zN4$default(Modifier.INSTANCE, NewAppTheme.INSTANCE.getSpacing(composer4, 6).m10809get4D9Ej5fM(), 0.0f, 2, null);
                                    Function2<Composer, Integer, Unit> function27 = function26;
                                    ComposerKt.sourceInformationMarkerStart(composer4, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, m839paddingVpY3zN4$default);
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer4, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor3);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer m4976constructorimpl3 = Updater.m4976constructorimpl(composer4);
                                    Updater.m4983setimpl(m4976constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                                        m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                                        m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
                                    }
                                    Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer4, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer4, -132527475, "C84@2649L9:BottomSheetScaffold.kt#aaq0h9");
                                    function27.invoke(composer4, 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    composer4.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 24576, 10);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 12582912 | ModalBottomSheetScope.$stable | i8, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54);
            int i6 = ModalBottomSheetState.$stable | 3072 | (i3 & 14) | ((i3 << 3) & 896);
            function03 = function02;
            ModalBottomSheetKt.ModalBottomSheet(state, null, function03, rememberComposableLambda, startRestartGroup, i6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function22 = lambda$1282183958$expo_dev_menu_release;
        } else {
            startRestartGroup.skipToGroupEnd();
            function03 = function0;
            function22 = function2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.BottomSheetScaffoldKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BottomSheetScaffold$lambda$4;
                    BottomSheetScaffold$lambda$4 = BottomSheetScaffoldKt.BottomSheetScaffold$lambda$4(ModalBottomSheetState.this, function03, function22, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BottomSheetScaffold$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp Peek$lambda$0(Dp dp, Dp dp2) {
        return Dp.m8399boximpl(Dp.m8401constructorimpl(dp.m8415unboximpl() * 0.6f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp Full$lambda$1(Dp dp, Dp dp2) {
        return Dp.m8399boximpl(Dp.m8401constructorimpl(dp.m8415unboximpl() * 0.95f));
    }
}
