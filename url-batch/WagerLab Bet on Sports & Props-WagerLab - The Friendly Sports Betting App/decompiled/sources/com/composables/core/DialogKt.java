package com.composables.core;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.MapSaverKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.composeunstyled.Modal_androidKt;
import com.composeunstyled.UtilsKt;
import com.facebook.react.uimanager.ViewProps;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.branch.referral.BranchError;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dialog.kt */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0017\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001aM\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001al\u0010\u0015\u001a\u00020\t*\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\"2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b#\u0010$\u001a;\u0010%\u001a\u00020\t*\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010&\u001a\u00020\u001f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0004\b'\u0010(\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)²\u0006\u0010\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u000eX\u008a\u0084\u0002"}, d2 = {"DialogStateSaver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/composables/core/DialogState;", "", "rememberDialogState", "initiallyVisible", "", "(ZLandroidx/compose/runtime/Composer;II)Lcom/composables/core/DialogState;", "Dialog", "", "state", DiagnosticsEntry.PROPERTIES_KEY, "Lcom/composables/core/DialogProperties;", "onDismiss", "Lkotlin/Function0;", "content", "Lkotlin/Function1;", "Lcom/composables/core/DialogScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lcom/composables/core/DialogState;Lcom/composables/core/DialogProperties;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DialogPanel", "modifier", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "DialogPanel-dNgdfXs", "(Lcom/composables/core/DialogScope;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "scrimColor", "Scrim-T042LqI", "(Lcom/composables/core/DialogScope;Landroidx/compose/ui/Modifier;JLandroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;II)V", "core_release", "currentDismiss"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DialogKt {
    private static final Saver<DialogState, Object> DialogStateSaver = MapSaverKt.mapSaver(new Function2() { // from class: com.composables.core.DialogKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Map DialogStateSaver$lambda$2$lambda$0;
            DialogStateSaver$lambda$2$lambda$0 = DialogKt.DialogStateSaver$lambda$2$lambda$0((SaverScope) obj, (DialogState) obj2);
            return DialogStateSaver$lambda$2$lambda$0;
        }
    }, new Function1() { // from class: com.composables.core.DialogKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            DialogState DialogStateSaver$lambda$2$lambda$1;
            DialogStateSaver$lambda$2$lambda$1 = DialogKt.DialogStateSaver$lambda$2$lambda$1((Map) obj);
            return DialogStateSaver$lambda$2$lambda$1;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dialog$lambda$9(DialogState dialogState, DialogProperties dialogProperties, Function0 function0, Function3 function3, int i, int i2, Composer composer, int i3) {
        Dialog(dialogState, dialogProperties, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DialogPanel_dNgdfXs$lambda$10(DialogScope dialogScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Shape shape, long j, long j2, PaddingValues paddingValues, Function2 function2, int i, int i2, Composer composer, int i3) {
        m9370DialogPaneldNgdfXs(dialogScope, modifier, enterTransition, exitTransition, shape, j, j2, paddingValues, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scrim_T042LqI$lambda$11(DialogScope dialogScope, Modifier modifier, long j, EnterTransition enterTransition, ExitTransition exitTransition, int i, int i2, Composer composer, int i3) {
        m9371ScrimT042LqI(dialogScope, modifier, j, enterTransition, exitTransition, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map DialogStateSaver$lambda$2$lambda$0(SaverScope mapSaver, DialogState it) {
        Intrinsics.checkNotNullParameter(mapSaver, "$this$mapSaver");
        Intrinsics.checkNotNullParameter(it, "it");
        return MapsKt.mapOf(TuplesKt.to(ViewProps.VISIBLE, Boolean.valueOf(it.getVisible())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialogState DialogStateSaver$lambda$2$lambda$1(Map it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get(ViewProps.VISIBLE);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return new DialogState(((Boolean) obj).booleanValue());
    }

    public static final DialogState rememberDialogState(final boolean z, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-557756073);
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = false;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-557756073, i, -1, "com.composables.core.rememberDialogState (Dialog.kt:76)");
        }
        Object[] objArr = new Object[0];
        Saver<DialogState, Object> saver = DialogStateSaver;
        composer.startReplaceGroup(5004770);
        if ((((i & 14) ^ 6) <= 4 || !composer.changed(z)) && (i & 6) != 4) {
            z2 = false;
        }
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.composables.core.DialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DialogState rememberDialogState$lambda$4$lambda$3;
                    rememberDialogState$lambda$4$lambda$3 = DialogKt.rememberDialogState$lambda$4$lambda$3(z);
                    return rememberDialogState$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        DialogState dialogState = (DialogState) RememberSaveableKt.m5102rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return dialogState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialogState rememberDialogState$lambda$4$lambda$3(boolean z) {
        return new DialogState(z);
    }

    public static final void Dialog(final DialogState state, final DialogProperties dialogProperties, Function0<Unit> function0, final Function3<? super DialogScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Function1 function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-544700166);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(dialogProperties)) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    dialogProperties = new DialogProperties(false, false, 3, null);
                    i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                }
                if (i4 != 0) {
                    function0 = ModalBottomSheetKt.getDoNothing();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                }
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-544700166, i3, -1, "com.composables.core.Dialog (Dialog.kt:127)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new DialogScope(state);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final DialogScope dialogScope = (DialogScope) rememberedValue;
            startRestartGroup.endReplaceGroup();
            dialogScope.getVisibleState$core_release().setTargetState$animation_core(Boolean.valueOf(state.getVisible()));
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, (i3 >> 6) & 14);
            if (dialogScope.getVisibleState$core_release().getCurrentState().booleanValue() || dialogScope.getVisibleState$core_release().getTargetState().booleanValue() || !dialogScope.getVisibleState$core_release().isIdle()) {
                if (!dialogProperties.getDismissOnBackPress()) {
                    startRestartGroup.startReplaceGroup(-775358777);
                    startRestartGroup.startReplaceGroup(1849434622);
                    DialogKt$Dialog$onKeyEvent$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1<KeyEvent, Boolean>() { // from class: com.composables.core.DialogKt$Dialog$onKeyEvent$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                return m9374invokeZmokQxo(keyEvent.m6792unboximpl());
                            }

                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m9374invokeZmokQxo(android.view.KeyEvent it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return false;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    function1 = (Function1) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-775668467);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    boolean changed = startRestartGroup.changed(rememberUpdatedState);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composables.core.DialogKt$Dialog$onKeyEvent$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                return m9373invokeZmokQxo(keyEvent.m6792unboximpl());
                            }

                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m9373invokeZmokQxo(android.view.KeyEvent event) {
                                Function0 Dialog$lambda$6;
                                Intrinsics.checkNotNullParameter(event, "event");
                                boolean z = false;
                                if (KeyEventType.m6796equalsimpl0(KeyEvent_androidKt.m6804getTypeZmokQxo(event), KeyEventType.INSTANCE.m6800getKeyDownCS__XNY()) && (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6510getBackEK5gGoQ()) || Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6584getEscapeEK5gGoQ()))) {
                                    Dialog$lambda$6 = DialogKt.Dialog$lambda$6(rememberUpdatedState);
                                    Dialog$lambda$6.invoke();
                                    DialogScope.this.getDialogState$core_release().setVisible(false);
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    function1 = (Function1) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endReplaceGroup();
                }
                Modal_androidKt.Modal(function1, ComposableLambdaKt.rememberComposableLambda(1917033534, true, new Function2<Composer, Integer, Unit>() { // from class: com.composables.core.DialogKt$Dialog$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        Modifier.Companion companion;
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1917033534, i5, -1, "com.composables.core.Dialog.<anonymous> (Dialog.kt:146)");
                        }
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        composer2.startReplaceGroup(-271739594);
                        if (DialogProperties.this.getDismissOnClickOutside()) {
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Unit unit = Unit.INSTANCE;
                            composer2.startReplaceGroup(-1633490746);
                            boolean changed2 = composer2.changed(rememberUpdatedState);
                            DialogScope dialogScope2 = dialogScope;
                            State<Function0<Unit>> state2 = rememberUpdatedState;
                            DialogKt$Dialog$1$1$1 rememberedValue4 = composer2.rememberedValue();
                            if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new DialogKt$Dialog$1$1$1(dialogScope2, state2);
                                composer2.updateRememberedValue(rememberedValue4);
                            }
                            composer2.endReplaceGroup();
                            companion = SuspendingPointerInputFilterKt.pointerInput(companion2, unit, (PointerInputEventHandler) rememberedValue4);
                        } else {
                            companion = Modifier.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        Modifier then = fillMaxSize$default.then(companion);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Function3<DialogScope, Composer, Integer, Unit> function3 = content;
                        DialogScope dialogScope3 = dialogScope;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, then);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
                        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function3.invoke(dialogScope3, composer2, 6);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 48, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final DialogProperties dialogProperties2 = dialogProperties;
        final Function0<Unit> function02 = function0;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.DialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Dialog$lambda$9;
                    Dialog$lambda$9 = DialogKt.Dialog$lambda$9(DialogState.this, dialogProperties2, function02, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return Dialog$lambda$9;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ae  */
    /* renamed from: DialogPanel-dNgdfXs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9370DialogPaneldNgdfXs(final DialogScope DialogPanel, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Shape shape, long j, long j2, PaddingValues paddingValues, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        Shape shape2;
        int i7;
        int i8;
        long m5693getUnspecified0d7_KjU;
        long j3;
        PaddingValues m830PaddingValues0680j_4;
        Composer composer2;
        final PaddingValues paddingValues2;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        final long j4;
        final long j5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(DialogPanel, "$this$DialogPanel");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-939532574);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(DialogPanel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 2048 : 1024;
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        shape2 = shape;
                        i3 |= startRestartGroup.changed(shape2) ? 16384 : 8192;
                        i7 = i2 & 16;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changed(j) ? 131072 : 65536;
                        }
                        if ((i & 1572864) == 0) {
                            i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j2)) ? 1048576 : 524288;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                        }
                        if ((i2 & 128) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(content) ? 67108864 : 33554432;
                        }
                        if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i9 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    enterTransition2 = UtilsKt.getAppearInstantly();
                                }
                                if (i5 != 0) {
                                    exitTransition2 = UtilsKt.getDisappearInstantly();
                                }
                                if (i6 != 0) {
                                    shape2 = RectangleShapeKt.getRectangleShape();
                                }
                                m5693getUnspecified0d7_KjU = i7 != 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j;
                                if ((i2 & 32) != 0) {
                                    ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    j3 = ((Color) consume).m5667unboximpl();
                                    i3 &= -3670017;
                                } else {
                                    j3 = j2;
                                }
                                if (i8 != 0) {
                                    m830PaddingValues0680j_4 = PaddingKt.m830PaddingValues0680j_4(Dp.m8401constructorimpl(0));
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-939532574, i3, -1, "com.composables.core.DialogPanel (Dialog.kt:184)");
                                    }
                                    PaddingValues paddingValues3 = m830PaddingValues0680j_4;
                                    AnimatedVisibilityKt.AnimatedVisibility(DialogPanel.getVisibleState$core_release(), (Modifier) null, enterTransition2, exitTransition2, (String) null, ComposableLambdaKt.rememberComposableLambda(-72889590, true, new DialogKt$DialogPanel$1(modifier2, shape2, m5693getUnspecified0d7_KjU, paddingValues3, j3, content), startRestartGroup, 54), startRestartGroup, (i3 & 7168) | MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 896), 18);
                                    composer2 = startRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    paddingValues2 = paddingValues3;
                                    enterTransition3 = enterTransition2;
                                    exitTransition3 = exitTransition2;
                                    j4 = m5693getUnspecified0d7_KjU;
                                    j5 = j3;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -3670017;
                                }
                                m5693getUnspecified0d7_KjU = j;
                                j3 = j2;
                            }
                            m830PaddingValues0680j_4 = paddingValues;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            PaddingValues paddingValues32 = m830PaddingValues0680j_4;
                            AnimatedVisibilityKt.AnimatedVisibility(DialogPanel.getVisibleState$core_release(), (Modifier) null, enterTransition2, exitTransition2, (String) null, ComposableLambdaKt.rememberComposableLambda(-72889590, true, new DialogKt$DialogPanel$1(modifier2, shape2, m5693getUnspecified0d7_KjU, paddingValues32, j3, content), startRestartGroup, 54), startRestartGroup, (i3 & 7168) | MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 896), 18);
                            composer2 = startRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            paddingValues2 = paddingValues32;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            j4 = m5693getUnspecified0d7_KjU;
                            j5 = j3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            paddingValues2 = paddingValues;
                            composer2 = startRestartGroup;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            j4 = j;
                            j5 = j2;
                        }
                        final Modifier modifier3 = modifier2;
                        final Shape shape3 = shape2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.DialogKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit DialogPanel_dNgdfXs$lambda$10;
                                    DialogPanel_dNgdfXs$lambda$10 = DialogKt.DialogPanel_dNgdfXs$lambda$10(DialogScope.this, modifier3, enterTransition3, exitTransition3, shape3, j4, j5, paddingValues2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return DialogPanel_dNgdfXs$lambda$10;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    shape2 = shape;
                    i7 = i2 & 16;
                    if (i7 != 0) {
                    }
                    if ((i & 1572864) == 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((38347923 & i3) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    m830PaddingValues0680j_4 = paddingValues;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    PaddingValues paddingValues322 = m830PaddingValues0680j_4;
                    AnimatedVisibilityKt.AnimatedVisibility(DialogPanel.getVisibleState$core_release(), (Modifier) null, enterTransition2, exitTransition2, (String) null, ComposableLambdaKt.rememberComposableLambda(-72889590, true, new DialogKt$DialogPanel$1(modifier2, shape2, m5693getUnspecified0d7_KjU, paddingValues322, j3, content), startRestartGroup, 54), startRestartGroup, (i3 & 7168) | MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 896), 18);
                    composer2 = startRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    paddingValues2 = paddingValues322;
                    enterTransition3 = enterTransition2;
                    exitTransition3 = exitTransition2;
                    j4 = m5693getUnspecified0d7_KjU;
                    j5 = j3;
                    final Modifier modifier32 = modifier2;
                    final Shape shape32 = shape2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                shape2 = shape;
                i7 = i2 & 16;
                if (i7 != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((38347923 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i8 != 0) {
                }
                m830PaddingValues0680j_4 = paddingValues;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                PaddingValues paddingValues3222 = m830PaddingValues0680j_4;
                AnimatedVisibilityKt.AnimatedVisibility(DialogPanel.getVisibleState$core_release(), (Modifier) null, enterTransition2, exitTransition2, (String) null, ComposableLambdaKt.rememberComposableLambda(-72889590, true, new DialogKt$DialogPanel$1(modifier2, shape2, m5693getUnspecified0d7_KjU, paddingValues3222, j3, content), startRestartGroup, 54), startRestartGroup, (i3 & 7168) | MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 896), 18);
                composer2 = startRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                paddingValues2 = paddingValues3222;
                enterTransition3 = enterTransition2;
                exitTransition3 = exitTransition2;
                j4 = m5693getUnspecified0d7_KjU;
                j5 = j3;
                final Modifier modifier322 = modifier2;
                final Shape shape322 = shape2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            shape2 = shape;
            i7 = i2 & 16;
            if (i7 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((38347923 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i8 != 0) {
            }
            m830PaddingValues0680j_4 = paddingValues;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            PaddingValues paddingValues32222 = m830PaddingValues0680j_4;
            AnimatedVisibilityKt.AnimatedVisibility(DialogPanel.getVisibleState$core_release(), (Modifier) null, enterTransition2, exitTransition2, (String) null, ComposableLambdaKt.rememberComposableLambda(-72889590, true, new DialogKt$DialogPanel$1(modifier2, shape2, m5693getUnspecified0d7_KjU, paddingValues32222, j3, content), startRestartGroup, 54), startRestartGroup, (i3 & 7168) | MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 896), 18);
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            paddingValues2 = paddingValues32222;
            enterTransition3 = enterTransition2;
            exitTransition3 = exitTransition2;
            j4 = m5693getUnspecified0d7_KjU;
            j5 = j3;
            final Modifier modifier3222 = modifier2;
            final Shape shape3222 = shape2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        shape2 = shape;
        i7 = i2 & 16;
        if (i7 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i8 != 0) {
        }
        m830PaddingValues0680j_4 = paddingValues;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        PaddingValues paddingValues322222 = m830PaddingValues0680j_4;
        AnimatedVisibilityKt.AnimatedVisibility(DialogPanel.getVisibleState$core_release(), (Modifier) null, enterTransition2, exitTransition2, (String) null, ComposableLambdaKt.rememberComposableLambda(-72889590, true, new DialogKt$DialogPanel$1(modifier2, shape2, m5693getUnspecified0d7_KjU, paddingValues322222, j3, content), startRestartGroup, 54), startRestartGroup, (i3 & 7168) | MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 896), 18);
        composer2 = startRestartGroup;
        if (ComposerKt.isTraceInProgress()) {
        }
        paddingValues2 = paddingValues322222;
        enterTransition3 = enterTransition2;
        exitTransition3 = exitTransition2;
        j4 = m5693getUnspecified0d7_KjU;
        j5 = j3;
        final Modifier modifier32222 = modifier2;
        final Shape shape32222 = shape2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0050  */
    /* renamed from: Scrim-T042LqI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9371ScrimT042LqI(final DialogScope Scrim, Modifier modifier, long j, EnterTransition enterTransition, ExitTransition exitTransition, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long j2;
        int i5;
        EnterTransition enterTransition2;
        int i6;
        ExitTransition exitTransition2;
        final Modifier modifier3;
        final long j3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(Scrim, "$this$Scrim");
        Composer startRestartGroup = composer.startRestartGroup(-1070934280);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(Scrim) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
                j2 = j;
            } else {
                j2 = j;
                if ((i & 384) == 0) {
                    i3 |= startRestartGroup.changed(j2) ? 256 : 128;
                }
            }
            i5 = i2 & 4;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i6 = i2 & 8;
                if (i6 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                        final Modifier.Companion companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        final long m5656copywmQWz5c$default = i4 == 0 ? Color.m5656copywmQWz5c$default(Color.INSTANCE.m5683getBlack0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
                        if (i5 != 0) {
                            enterTransition2 = UtilsKt.getAppearInstantly();
                        }
                        ExitTransition disappearInstantly = i6 == 0 ? UtilsKt.getDisappearInstantly() : exitTransition2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1070934280, i3, -1, "com.composables.core.Scrim (Dialog.kt:218)");
                        }
                        int i8 = i3 >> 3;
                        AnimatedVisibilityKt.AnimatedVisibility(Scrim.getVisibleState$core_release(), (Modifier) null, enterTransition2, disappearInstantly, (String) null, ComposableLambdaKt.rememberComposableLambda(1398736672, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composables.core.DialogKt$Scrim$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i9) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1398736672, i9, -1, "com.composables.core.Scrim.<anonymous> (Dialog.kt:224)");
                                }
                                BoxKt.Box(BackgroundKt.m262backgroundbw27NRU$default(FocusableKt.focusable$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, 2, null), m5656copywmQWz5c$default, null, 2, null).then(companion), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), startRestartGroup, 196608 | MutableTransitionState.$stable | (i8 & 896) | (i8 & 7168), 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = companion;
                        j3 = m5656copywmQWz5c$default;
                        exitTransition3 = disappearInstantly;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        j3 = j2;
                        exitTransition3 = exitTransition2;
                    }
                    final EnterTransition enterTransition3 = enterTransition2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.DialogKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Scrim_T042LqI$lambda$11;
                                Scrim_T042LqI$lambda$11 = DialogKt.Scrim_T042LqI$lambda$11(DialogScope.this, modifier3, j3, enterTransition3, exitTransition3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return Scrim_T042LqI$lambda$11;
                            }
                        });
                        return;
                    }
                    return;
                }
                exitTransition2 = exitTransition;
                if ((i3 & 9363) == 9362) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i82 = i3 >> 3;
                AnimatedVisibilityKt.AnimatedVisibility(Scrim.getVisibleState$core_release(), (Modifier) null, enterTransition2, disappearInstantly, (String) null, ComposableLambdaKt.rememberComposableLambda(1398736672, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composables.core.DialogKt$Scrim$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1398736672, i9, -1, "com.composables.core.Scrim.<anonymous> (Dialog.kt:224)");
                        }
                        BoxKt.Box(BackgroundKt.m262backgroundbw27NRU$default(FocusableKt.focusable$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, 2, null), m5656copywmQWz5c$default, null, 2, null).then(companion), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 196608 | MutableTransitionState.$stable | (i82 & 896) | (i82 & 7168), 18);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = companion;
                j3 = m5656copywmQWz5c$default;
                exitTransition3 = disappearInstantly;
                final EnterTransition enterTransition32 = enterTransition2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            enterTransition2 = enterTransition;
            i6 = i2 & 8;
            if (i6 != 0) {
            }
            exitTransition2 = exitTransition;
            if ((i3 & 9363) == 9362) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i822 = i3 >> 3;
            AnimatedVisibilityKt.AnimatedVisibility(Scrim.getVisibleState$core_release(), (Modifier) null, enterTransition2, disappearInstantly, (String) null, ComposableLambdaKt.rememberComposableLambda(1398736672, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composables.core.DialogKt$Scrim$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i9) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1398736672, i9, -1, "com.composables.core.Scrim.<anonymous> (Dialog.kt:224)");
                    }
                    BoxKt.Box(BackgroundKt.m262backgroundbw27NRU$default(FocusableKt.focusable$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, 2, null), m5656copywmQWz5c$default, null, 2, null).then(companion), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 196608 | MutableTransitionState.$stable | (i822 & 896) | (i822 & 7168), 18);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = companion;
            j3 = m5656copywmQWz5c$default;
            exitTransition3 = disappearInstantly;
            final EnterTransition enterTransition322 = enterTransition2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        enterTransition2 = enterTransition;
        i6 = i2 & 8;
        if (i6 != 0) {
        }
        exitTransition2 = exitTransition;
        if ((i3 & 9363) == 9362) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i8222 = i3 >> 3;
        AnimatedVisibilityKt.AnimatedVisibility(Scrim.getVisibleState$core_release(), (Modifier) null, enterTransition2, disappearInstantly, (String) null, ComposableLambdaKt.rememberComposableLambda(1398736672, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composables.core.DialogKt$Scrim$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i9) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1398736672, i9, -1, "com.composables.core.Scrim.<anonymous> (Dialog.kt:224)");
                }
                BoxKt.Box(BackgroundKt.m262backgroundbw27NRU$default(FocusableKt.focusable$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, 2, null), m5656copywmQWz5c$default, null, 2, null).then(companion), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, 196608 | MutableTransitionState.$stable | (i8222 & 896) | (i8222 & 7168), 18);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        j3 = m5656copywmQWz5c$default;
        exitTransition3 = disappearInstantly;
        final EnterTransition enterTransition3222 = enterTransition2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> Dialog$lambda$6(State<? extends Function0<Unit>> state) {
        return state.getValue();
    }
}
