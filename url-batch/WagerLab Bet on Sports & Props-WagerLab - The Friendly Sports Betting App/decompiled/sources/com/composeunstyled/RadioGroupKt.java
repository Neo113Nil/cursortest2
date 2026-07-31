package com.composeunstyled;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.ToggleableKt;
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
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: RadioGroup.kt */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a]\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a§\u0001\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b%\u0010&\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"LocalInnerRadioGroupState", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/composeunstyled/InnerRadioGroupState;", "RadioGroup", "", "value", "", "onValueChange", "Lkotlin/Function1;", "contentDescription", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "RadioButton", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "selectedColor", ViewProps.ENABLED, "", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/foundation/layout/RowScope;", "RadioButton-Pjqhl4k", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJJZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RadioGroupKt {
    private static final ProvidableCompositionLocal<InnerRadioGroupState> LocalInnerRadioGroupState = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.composeunstyled.RadioGroupKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            InnerRadioGroupState LocalInnerRadioGroupState$lambda$0;
            LocalInnerRadioGroupState$lambda$0 = RadioGroupKt.LocalInnerRadioGroupState$lambda$0();
            return LocalInnerRadioGroupState$lambda$0;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadioButton_Pjqhl4k$lambda$14(String str, Modifier modifier, Shape shape, long j, long j2, long j3, boolean z, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Indication indication, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        m9528RadioButtonPjqhl4k(str, modifier, shape, j, j2, j3, z, paddingValues, mutableInteractionSource, indication, horizontal, vertical, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadioGroup$lambda$8(String str, Function1 function1, String str2, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        RadioGroup(str, function1, str2, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InnerRadioGroupState LocalInnerRadioGroupState$lambda$0() {
        return new InnerRadioGroupState();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioGroup(final String str, final Function1<? super String, Unit> onValueChange, final String str2, Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier.Companion companion;
        Object rememberedValue;
        boolean z;
        Object rememberedValue2;
        boolean z2;
        Object rememberedValue3;
        boolean changedInstance;
        Object rememberedValue4;
        int currentCompositeKeyHash;
        Composer m4976constructorimpl;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-659283555);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-659283555, i3, -1, "com.composeunstyled.RadioGroup (RadioGroup.kt:34)");
                }
                ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localFocusManager);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final FocusManager focusManager = (FocusManager) consume;
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new InnerRadioGroupState();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final InnerRadioGroupState innerRadioGroupState = (InnerRadioGroupState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1746271574);
                z = ((i3 & 14) != 4) | ((i3 & 112) != 32);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: com.composeunstyled.RadioGroupKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit RadioGroup$lambda$3$lambda$2;
                            RadioGroup$lambda$3$lambda$2 = RadioGroupKt.RadioGroup$lambda$3$lambda$2(InnerRadioGroupState.this, str, onValueChange);
                            return RadioGroup$lambda$3$lambda$2;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                Modifier selectableGroup = SelectableGroupKt.selectableGroup(companion);
                startRestartGroup.startReplaceGroup(5004770);
                z2 = (i3 & 896) != 256;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function1() { // from class: com.composeunstyled.RadioGroupKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit RadioGroup$lambda$5$lambda$4;
                            RadioGroup$lambda$5$lambda$4 = RadioGroupKt.RadioGroup$lambda$5$lambda$4(str2, (SemanticsPropertyReceiver) obj);
                            return RadioGroup$lambda$5$lambda$4;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                Modifier semantics$default = SemanticsModifierKt.semantics$default(selectableGroup, false, (Function1) rememberedValue3, 1, null);
                startRestartGroup.startReplaceGroup(5004770);
                changedInstance = startRestartGroup.changedInstance(focusManager);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.RadioGroupKt$RadioGroup$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                            return m9529invokeZmokQxo(keyEvent.m6792unboximpl());
                        }

                        /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                        public final Boolean m9529invokeZmokQxo(android.view.KeyEvent event) {
                            Intrinsics.checkNotNullParameter(event, "event");
                            long m6803getKeyZmokQxo = KeyEvent_androidKt.m6803getKeyZmokQxo(event);
                            boolean z3 = true;
                            if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6568getDirectionDownEK5gGoQ()) || Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6572getDirectionRightEK5gGoQ())) {
                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                    FocusManager.this.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5300getNextdhqQ8s());
                                }
                            } else if (!Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6573getDirectionUpEK5gGoQ()) && !Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6571getDirectionLeftEK5gGoQ())) {
                                z3 = false;
                            } else if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                FocusManager.this.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5301getPreviousdhqQ8s());
                            }
                            return Boolean.valueOf(z3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceGroup();
                Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(semantics$default, (Function1) rememberedValue4);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onKeyEvent);
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
                CompositionLocalKt.CompositionLocalProvider(LocalInnerRadioGroupState.provides(innerRadioGroupState), ComposableLambdaKt.rememberComposableLambda(-473005, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.RadioGroupKt$RadioGroup$4$1
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
                            ComposerKt.traceEventStart(-473005, i5, -1, "com.composeunstyled.RadioGroup.<anonymous>.<anonymous> (RadioGroup.kt:72)");
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
                companion = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = companion;
                endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.RadioGroupKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit RadioGroup$lambda$8;
                        RadioGroup$lambda$8 = RadioGroupKt.RadioGroup$lambda$8(str, onValueChange, str2, modifier3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return RadioGroup$lambda$8;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<FocusManager> localFocusManager2 = CompositionLocalsKt.getLocalFocusManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localFocusManager2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final FocusManager focusManager2 = (FocusManager) consume2;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final InnerRadioGroupState innerRadioGroupState2 = (InnerRadioGroupState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1746271574);
        z = ((i3 & 14) != 4) | ((i3 & 112) != 32);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue2 = new Function0() { // from class: com.composeunstyled.RadioGroupKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit RadioGroup$lambda$3$lambda$2;
                RadioGroup$lambda$3$lambda$2 = RadioGroupKt.RadioGroup$lambda$3$lambda$2(InnerRadioGroupState.this, str, onValueChange);
                return RadioGroup$lambda$3$lambda$2;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
        Modifier selectableGroup2 = SelectableGroupKt.selectableGroup(companion);
        startRestartGroup.startReplaceGroup(5004770);
        if ((i3 & 896) != 256) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue3 = new Function1() { // from class: com.composeunstyled.RadioGroupKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit RadioGroup$lambda$5$lambda$4;
                RadioGroup$lambda$5$lambda$4 = RadioGroupKt.RadioGroup$lambda$5$lambda$4(str2, (SemanticsPropertyReceiver) obj);
                return RadioGroup$lambda$5$lambda$4;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        Modifier semantics$default2 = SemanticsModifierKt.semantics$default(selectableGroup2, false, (Function1) rememberedValue3, 1, null);
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance = startRestartGroup.changedInstance(focusManager2);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue4 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.RadioGroupKt$RadioGroup$3$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m9529invokeZmokQxo(keyEvent.m6792unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m9529invokeZmokQxo(android.view.KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                long m6803getKeyZmokQxo = KeyEvent_androidKt.m6803getKeyZmokQxo(event);
                boolean z3 = true;
                if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6568getDirectionDownEK5gGoQ()) || Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6572getDirectionRightEK5gGoQ())) {
                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                        FocusManager.this.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5300getNextdhqQ8s());
                    }
                } else if (!Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6573getDirectionUpEK5gGoQ()) && !Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6571getDirectionLeftEK5gGoQ())) {
                    z3 = false;
                } else if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                    FocusManager.this.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5301getPreviousdhqQ8s());
                }
                return Boolean.valueOf(z3);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        Modifier onKeyEvent2 = KeyInputModifierKt.onKeyEvent(semantics$default2, (Function1) rememberedValue4);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, onKeyEvent2);
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
        CompositionLocalKt.CompositionLocalProvider(LocalInnerRadioGroupState.provides(innerRadioGroupState2), ComposableLambdaKt.rememberComposableLambda(-473005, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.RadioGroupKt$RadioGroup$4$1
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
                    ComposerKt.traceEventStart(-473005, i5, -1, "com.composeunstyled.RadioGroup.<anonymous>.<anonymous> (RadioGroup.kt:72)");
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
    public static final Unit RadioGroup$lambda$3$lambda$2(InnerRadioGroupState innerRadioGroupState, String str, Function1 function1) {
        innerRadioGroupState.setValue(str);
        innerRadioGroupState.setOnValueChange(function1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadioGroup$lambda$5$lambda$4(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        if (str != null) {
            SemanticsPropertiesKt.setContentDescription(semantics, str);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0437  */
    /* renamed from: RadioButton-Pjqhl4k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9528RadioButtonPjqhl4k(final String value, Modifier modifier, Shape shape, long j, long j2, long j3, boolean z, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Indication indication, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Shape shape2;
        int i6;
        int i7;
        int i8;
        long j4;
        int i9;
        long j5;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long m5693getUnspecified0d7_KjU;
        PaddingValues noPadding;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        Indication indication2;
        Indication indication3;
        Arrangement.Horizontal horizontal2;
        int i19;
        Modifier modifier3;
        Alignment.Vertical top;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        int currentCompositeKeyHash;
        Composer m4976constructorimpl;
        Composer composer2;
        final Shape shape3;
        final long j6;
        final boolean z3;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource3;
        final Arrangement.Horizontal horizontal3;
        final long j7;
        final Modifier modifier4;
        final Indication indication4;
        final Alignment.Vertical vertical2;
        final long j8;
        int i20;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1582684592);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i21 = i3 & 2;
        if (i21 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                shape2 = shape;
                i4 |= startRestartGroup.changed(shape2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changed(j) ? 2048 : 1024;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                    i8 = i21;
                    j4 = j2;
                } else {
                    i8 = i21;
                    j4 = j2;
                    if ((i & 24576) == 0) {
                        i4 |= startRestartGroup.changed(j4) ? 16384 : 8192;
                    }
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    j5 = j3;
                } else {
                    j5 = j3;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(j5) ? 131072 : 65536;
                    }
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
                    }
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                }
                i12 = i3 & 256;
                if (i12 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i13 = i12;
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : 33554432;
                    if ((i & 805306368) == 0) {
                        if ((i3 & 512) == 0 && startRestartGroup.changed(indication)) {
                            i20 = C.BUFFER_FLAG_LAST_SAMPLE;
                            i4 |= i20;
                        }
                        i20 = 268435456;
                        i4 |= i20;
                    }
                    i14 = i3 & 1024;
                    if (i14 == 0) {
                        i16 = i2 | 6;
                        i15 = i14;
                    } else if ((i2 & 6) == 0) {
                        i15 = i14;
                        i16 = i2 | (startRestartGroup.changed(horizontal) ? 4 : 2);
                    } else {
                        i15 = i14;
                        i16 = i2;
                    }
                    i17 = i3 & 2048;
                    if (i17 == 0) {
                        i16 |= 48;
                        i18 = i17;
                    } else if ((i2 & 48) == 0) {
                        i18 = i17;
                        i16 |= startRestartGroup.changed(vertical) ? 32 : 16;
                    } else {
                        i18 = i17;
                    }
                    int i22 = i16;
                    if ((i3 & 4096) == 0) {
                        i22 |= 384;
                    } else if ((i2 & 384) == 0) {
                        i22 |= startRestartGroup.changedInstance(content) ? 256 : 128;
                    }
                    if ((306783379 & i4) == 306783378 || (i22 & 147) != 146 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier;
                            if (i5 != 0) {
                                shape2 = RectangleShapeKt.getRectangleShape();
                            }
                            m5693getUnspecified0d7_KjU = i6 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j;
                            if (i7 != 0) {
                                j4 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                            }
                            if (i9 != 0) {
                                j5 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                            }
                            if (i10 != 0) {
                                z2 = true;
                            }
                            noPadding = i11 == 0 ? UtilsKt.getNoPadding() : paddingValues;
                            mutableInteractionSource2 = i13 == 0 ? null : mutableInteractionSource;
                            if ((i3 & 512) == 0) {
                                ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                                modifier2 = companion;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localIndication);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                indication2 = (Indication) consume;
                                i4 &= -1879048193;
                            } else {
                                modifier2 = companion;
                                indication2 = indication;
                            }
                            Arrangement.Horizontal start = i15 == 0 ? Arrangement.INSTANCE.getStart() : horizontal;
                            if (i18 == 0) {
                                horizontal2 = start;
                                i19 = i4;
                                top = Alignment.INSTANCE.getTop();
                                indication3 = indication2;
                                modifier3 = modifier2;
                                startRestartGroup.endDefaults();
                                long j9 = j4;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1582684592, i19, i22, "com.composeunstyled.RadioButton (RadioGroup.kt:97)");
                                }
                                ProvidableCompositionLocal<InnerRadioGroupState> providableCompositionLocal = LocalInnerRadioGroupState;
                                int i23 = i22;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(providableCompositionLocal);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final InnerRadioGroupState innerRadioGroupState = (InnerRadioGroupState) consume2;
                                boolean areEqual = Intrinsics.areEqual(innerRadioGroupState.getValue(), value);
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue = startRestartGroup.rememberedValue();
                                int i24 = i19;
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function1() { // from class: com.composeunstyled.RadioGroupKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit RadioButton_Pjqhl4k$lambda$10$lambda$9;
                                            RadioButton_Pjqhl4k$lambda$10$lambda$9 = RadioGroupKt.RadioButton_Pjqhl4k$lambda$10$lambda$9((SemanticsPropertyReceiver) obj);
                                            return RadioButton_Pjqhl4k$lambda$10$lambda$9;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceGroup();
                                Modifier m262backgroundbw27NRU$default = BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(SemanticsModifierKt.semantics(modifier3, true, (Function1) rememberedValue), shape2), m5693getUnspecified0d7_KjU, null, 2, null);
                                Role m7575boximpl = Role.m7575boximpl(Role.INSTANCE.m7587getRadioButtono7Vup1c());
                                Modifier modifier5 = modifier3;
                                startRestartGroup.startReplaceGroup(-1633490746);
                                changed = startRestartGroup.changed(innerRadioGroupState) | ((i24 & 14) != 4);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new Function1() { // from class: com.composeunstyled.RadioGroupKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit RadioButton_Pjqhl4k$lambda$12$lambda$11;
                                            RadioButton_Pjqhl4k$lambda$12$lambda$11 = RadioGroupKt.RadioButton_Pjqhl4k$lambda$12$lambda$11(InnerRadioGroupState.this, value, ((Boolean) obj).booleanValue());
                                            return RadioButton_Pjqhl4k$lambda$12$lambda$11;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceGroup();
                                Indication indication5 = indication3;
                                Modifier padding = PaddingKt.padding(ToggleableKt.m1171toggleableO2vRcR0(m262backgroundbw27NRU$default, areEqual, mutableInteractionSource2, indication5, z2, m7575boximpl, (Function1) rememberedValue2), noPadding);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal2, top, startRestartGroup, (((i23 << 3) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Arrangement.Horizontal horizontal4 = horizontal2;
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
                                CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(!areEqual ? j9 : j5)), ComposableLambdaKt.rememberComposableLambda(-1405461644, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.RadioGroupKt$RadioButton$3$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i25) {
                                        if ((i25 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1405461644, i25, -1, "com.composeunstyled.RadioButton.<anonymous>.<anonymous> (RadioGroup.kt:123)");
                                        }
                                        content.invoke(rowScopeInstance, composer3, 0);
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
                                composer2 = startRestartGroup;
                                shape3 = shape2;
                                j6 = j5;
                                z3 = z2;
                                paddingValues2 = noPadding;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                horizontal3 = horizontal4;
                                j7 = m5693getUnspecified0d7_KjU;
                                modifier4 = modifier5;
                                indication4 = indication5;
                                vertical2 = top;
                                j8 = j9;
                            } else {
                                indication3 = indication2;
                                horizontal2 = start;
                                i19 = i4;
                                modifier3 = modifier2;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            modifier3 = modifier;
                            m5693getUnspecified0d7_KjU = j;
                            noPadding = paddingValues;
                            mutableInteractionSource2 = mutableInteractionSource;
                            indication3 = indication;
                            horizontal2 = horizontal;
                            i19 = i4;
                        }
                        top = vertical;
                        startRestartGroup.endDefaults();
                        long j92 = j4;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<InnerRadioGroupState> providableCompositionLocal2 = LocalInnerRadioGroupState;
                        int i232 = i22;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume22 = startRestartGroup.consume(providableCompositionLocal2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final InnerRadioGroupState innerRadioGroupState2 = (InnerRadioGroupState) consume22;
                        boolean areEqual2 = Intrinsics.areEqual(innerRadioGroupState2.getValue(), value);
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue = startRestartGroup.rememberedValue();
                        int i242 = i19;
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier m262backgroundbw27NRU$default2 = BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(SemanticsModifierKt.semantics(modifier3, true, (Function1) rememberedValue), shape2), m5693getUnspecified0d7_KjU, null, 2, null);
                        Role m7575boximpl2 = Role.m7575boximpl(Role.INSTANCE.m7587getRadioButtono7Vup1c());
                        Modifier modifier52 = modifier3;
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changed = startRestartGroup.changed(innerRadioGroupState2) | ((i242 & 14) != 4);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue2 = new Function1() { // from class: com.composeunstyled.RadioGroupKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit RadioButton_Pjqhl4k$lambda$12$lambda$11;
                                RadioButton_Pjqhl4k$lambda$12$lambda$11 = RadioGroupKt.RadioButton_Pjqhl4k$lambda$12$lambda$11(InnerRadioGroupState.this, value, ((Boolean) obj).booleanValue());
                                return RadioButton_Pjqhl4k$lambda$12$lambda$11;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceGroup();
                        Indication indication52 = indication3;
                        Modifier padding2 = PaddingKt.padding(ToggleableKt.m1171toggleableO2vRcR0(m262backgroundbw27NRU$default2, areEqual2, mutableInteractionSource2, indication52, z2, m7575boximpl2, (Function1) rememberedValue2), noPadding);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontal2, top, startRestartGroup, (((i232 << 3) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, padding2);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Arrangement.Horizontal horizontal42 = horizontal2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(!areEqual2 ? j92 : j5)), ComposableLambdaKt.rememberComposableLambda(-1405461644, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.RadioGroupKt$RadioButton$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i25) {
                                if ((i25 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1405461644, i25, -1, "com.composeunstyled.RadioButton.<anonymous>.<anonymous> (RadioGroup.kt:123)");
                                }
                                content.invoke(rowScopeInstance2, composer3, 0);
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
                        composer2 = startRestartGroup;
                        shape3 = shape2;
                        j6 = j5;
                        z3 = z2;
                        paddingValues2 = noPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        horizontal3 = horizontal42;
                        j7 = m5693getUnspecified0d7_KjU;
                        modifier4 = modifier52;
                        indication4 = indication52;
                        vertical2 = top;
                        j8 = j92;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        j7 = j;
                        horizontal3 = horizontal;
                        vertical2 = vertical;
                        composer2 = startRestartGroup;
                        shape3 = shape2;
                        j8 = j4;
                        j6 = j5;
                        z3 = z2;
                        paddingValues2 = paddingValues;
                        mutableInteractionSource3 = mutableInteractionSource;
                        indication4 = indication;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.RadioGroupKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit RadioButton_Pjqhl4k$lambda$14;
                                RadioButton_Pjqhl4k$lambda$14 = RadioGroupKt.RadioButton_Pjqhl4k$lambda$14(value, modifier4, shape3, j7, j8, j6, z3, paddingValues2, mutableInteractionSource3, indication4, horizontal3, vertical2, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return RadioButton_Pjqhl4k$lambda$14;
                            }
                        });
                        return;
                    }
                    return;
                }
                i13 = i12;
                if ((i & 805306368) == 0) {
                }
                i14 = i3 & 1024;
                if (i14 == 0) {
                }
                i17 = i3 & 2048;
                if (i17 == 0) {
                }
                int i222 = i16;
                if ((i3 & 4096) == 0) {
                }
                if ((306783379 & i4) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 == 0) {
                }
                if (i13 == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                if (i15 == 0) {
                }
                if (i18 == 0) {
                }
            }
            shape2 = shape;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            i10 = i3 & 64;
            if (i10 != 0) {
            }
            i11 = i3 & 128;
            if (i11 != 0) {
            }
            i12 = i3 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            if ((i & 805306368) == 0) {
            }
            i14 = i3 & 1024;
            if (i14 == 0) {
            }
            i17 = i3 & 2048;
            if (i17 == 0) {
            }
            int i2222 = i16;
            if ((i3 & 4096) == 0) {
            }
            if ((306783379 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 == 0) {
            }
            if (i13 == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            if (i15 == 0) {
            }
            if (i18 == 0) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        shape2 = shape;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        i11 = i3 & 128;
        if (i11 != 0) {
        }
        i12 = i3 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        if ((i & 805306368) == 0) {
        }
        i14 = i3 & 1024;
        if (i14 == 0) {
        }
        i17 = i3 & 2048;
        if (i17 == 0) {
        }
        int i22222 = i16;
        if ((i3 & 4096) == 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 == 0) {
        }
        if (i13 == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        if (i15 == 0) {
        }
        if (i18 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadioButton_Pjqhl4k$lambda$10$lambda$9(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadioButton_Pjqhl4k$lambda$12$lambda$11(InnerRadioGroupState innerRadioGroupState, String str, boolean z) {
        if (z) {
            innerRadioGroupState.getOnValueChange().invoke(str);
        }
        return Unit.INSTANCE;
    }
}
