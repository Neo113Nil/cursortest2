package com.composeunstyled;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: deprecated.RadioGroup.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001aG\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a¿\u0001\u0010\u0011\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b)\u0010*\u001aÏ\u0001\u0010\u0011\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00182\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\f2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b)\u0010-¨\u0006."}, d2 = {"rememberRadioGroupState", "Lcom/composeunstyled/RadioGroupState;", "initialValue", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lcom/composeunstyled/RadioGroupState;", "RadioGroup", "", "state", "contentDescription", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Lcom/composeunstyled/RadioGroupScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lcom/composeunstyled/RadioGroupState;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Radio", "value", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "selectedColor", ViewProps.ENABLED, "", "shape", "Landroidx/compose/ui/graphics/Shape;", ViewProps.BORDER_COLOR, ViewProps.BORDER_WIDTH, "Landroidx/compose/ui/unit/Dp;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/foundation/layout/RowScope;", "Radio-bQLPMV8", "(Lcom/composeunstyled/RadioGroupScope;Ljava/lang/String;Landroidx/compose/ui/Modifier;JJJZLandroidx/compose/ui/graphics/Shape;JFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "selected", "onSelectedChange", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;JJJZLandroidx/compose/ui/graphics/Shape;JFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Deprecated_RadioGroupKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadioGroup$lambda$7(RadioGroupState radioGroupState, String str, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        RadioGroup(radioGroupState, str, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Radio_bQLPMV8$lambda$10(RadioGroupScope radioGroupScope, String str, Modifier modifier, long j, long j2, long j3, boolean z, Shape shape, long j4, float f, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Indication indication, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        m9495RadiobQLPMV8(radioGroupScope, str, modifier, j, j2, j3, z, shape, j4, f, paddingValues, mutableInteractionSource, indication, horizontal, vertical, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Radio_bQLPMV8$lambda$15(boolean z, Function1 function1, Modifier modifier, long j, long j2, long j3, boolean z2, Shape shape, long j4, float f, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Indication indication, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        m9496RadiobQLPMV8(z, (Function1<? super Boolean, Unit>) function1, modifier, j, j2, j3, z2, shape, j4, f, paddingValues, mutableInteractionSource, indication, horizontal, vertical, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    @Deprecated(message = "Use the RadioGroup overload that takes the value directly instead")
    public static final RadioGroupState rememberRadioGroupState(String str, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-1857092826);
        if ((i2 & 1) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1857092826, i, -1, "com.composeunstyled.rememberRadioGroupState (deprecated.RadioGroup.kt:42)");
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new RadioGroupState(str);
            composer.updateRememberedValue(rememberedValue);
        }
        RadioGroupState radioGroupState = (RadioGroupState) rememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return radioGroupState;
    }

    @Deprecated(message = "Use the RadioGroup overload that takes the value directly instead")
    public static final void RadioGroup(final RadioGroupState state, final String str, Modifier modifier, final Function3<? super RadioGroupScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-110721589);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-110721589, i3, -1, "com.composeunstyled.RadioGroup (deprecated.RadioGroup.kt:95)");
            }
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final FocusManager focusManager = (FocusManager) consume;
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new RadioGroupScope(state);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            RadioGroupScope radioGroupScope = (RadioGroupScope) rememberedValue;
            startRestartGroup.endReplaceGroup();
            Modifier selectableGroup = SelectableGroupKt.selectableGroup(modifier);
            startRestartGroup.startReplaceGroup(5004770);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit RadioGroup$lambda$3$lambda$2;
                        RadioGroup$lambda$3$lambda$2 = Deprecated_RadioGroupKt.RadioGroup$lambda$3$lambda$2(str, (SemanticsPropertyReceiver) obj);
                        return RadioGroup$lambda$3$lambda$2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            Modifier semantics$default = SemanticsModifierKt.semantics$default(selectableGroup, false, (Function1) rememberedValue2, 1, null);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance = startRestartGroup.changedInstance(focusManager);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$RadioGroup$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m9497invokeZmokQxo(keyEvent.m6792unboximpl());
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m9497invokeZmokQxo(android.view.KeyEvent it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        long m6803getKeyZmokQxo = KeyEvent_androidKt.m6803getKeyZmokQxo(it);
                        boolean z2 = true;
                        if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6568getDirectionDownEK5gGoQ()) || Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6572getDirectionRightEK5gGoQ())) {
                            if (UtilsKt.m9561isKeyDownZmokQxo(it)) {
                                FocusManager.this.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5300getNextdhqQ8s());
                            }
                        } else if (!Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6573getDirectionUpEK5gGoQ()) && !Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6571getDirectionLeftEK5gGoQ())) {
                            z2 = false;
                        } else if (UtilsKt.m9561isKeyDownZmokQxo(it)) {
                            FocusManager.this.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5301getPreviousdhqQ8s());
                        }
                        return Boolean.valueOf(z2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(semantics$default, (Function1) rememberedValue3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onKeyEvent);
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
            startRestartGroup.startReplaceGroup(-2072327938);
            content.invoke(radioGroupScope, startRestartGroup, Integer.valueOf((i3 >> 6) & 112));
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RadioGroup$lambda$7;
                    RadioGroup$lambda$7 = Deprecated_RadioGroupKt.RadioGroup$lambda$7(RadioGroupState.this, str, modifier2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return RadioGroup$lambda$7;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadioGroup$lambda$3$lambda$2(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        if (str != null) {
            SemanticsPropertiesKt.setContentDescription(semantics, str);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0362  */
    @Deprecated(message = "Replace with RadioButton")
    /* renamed from: Radio-bQLPMV8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9495RadiobQLPMV8(final RadioGroupScope Radio, final String value, Modifier modifier, long j, long j2, long j3, boolean z, Shape shape, long j4, float f, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Indication indication, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        long j5;
        int i8;
        final boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Arrangement.Horizontal horizontal2;
        int i21;
        int i22;
        int i23;
        long m5693getUnspecified0d7_KjU;
        Shape rectangleShape;
        long m5693getUnspecified0d7_KjU2;
        float m8421getUnspecifiedD9Ej5fM;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        Indication indication2;
        Arrangement.Horizontal horizontal3;
        long j6;
        boolean z3;
        long j7;
        Modifier modifier3;
        Alignment.Vertical vertical2;
        PaddingValues paddingValues2;
        Indication indication3;
        boolean z4;
        Object rememberedValue;
        Composer composer2;
        final Modifier modifier4;
        final long j8;
        final long j9;
        final long j10;
        final Shape shape2;
        final long j11;
        final float f2;
        final PaddingValues paddingValues3;
        final MutableInteractionSource mutableInteractionSource3;
        final Indication indication4;
        final Arrangement.Horizontal horizontal4;
        final Alignment.Vertical vertical3;
        ScopeUpdateScope endRestartGroup;
        int i24;
        Intrinsics.checkNotNullParameter(Radio, "$this$Radio");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1015992040);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(Radio) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(value) ? 32 : 16;
        }
        int i25 = i3 & 2;
        if (i25 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(j) ? 2048 : 1024;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changed(j2) ? 16384 : 8192;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                j5 = j3;
            } else {
                j5 = j3;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(j5) ? 131072 : 65536;
                }
            }
            i8 = i3 & 32;
            if (i8 == 0) {
                i4 |= 1572864;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
                }
            }
            i9 = i3 & 64;
            if (i9 == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= startRestartGroup.changed(shape) ? 8388608 : 4194304;
            }
            i10 = i3 & 128;
            if (i10 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i11 = i4 | (startRestartGroup.changed(j4) ? 67108864 : 33554432);
                i12 = i3 & 256;
                if (i12 != 0) {
                    i11 |= 805306368;
                    i13 = i12;
                } else if ((i & 805306368) == 0) {
                    i13 = i12;
                    i11 |= startRestartGroup.changed(f) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                } else {
                    i13 = i12;
                }
                i14 = i11;
                i15 = i3 & 512;
                if (i15 != 0) {
                    i17 = i2 | 6;
                    i16 = i15;
                } else if ((i2 & 6) == 0) {
                    i16 = i15;
                    i17 = i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2);
                } else {
                    i16 = i15;
                    i17 = i2;
                }
                i18 = i3 & 1024;
                if (i18 != 0) {
                    i17 |= 48;
                } else if ((i2 & 48) == 0) {
                    i19 = i18;
                    i17 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                    if ((i2 & 384) == 0) {
                        if ((i3 & 2048) == 0 && startRestartGroup.changed(indication)) {
                            i24 = 256;
                            i17 |= i24;
                        }
                        i24 = 128;
                        i17 |= i24;
                    }
                    int i26 = i17;
                    i20 = i3 & 4096;
                    if (i20 == 0) {
                        i26 |= 3072;
                    } else if ((i2 & 3072) == 0) {
                        horizontal2 = horizontal;
                        i26 |= startRestartGroup.changed(horizontal2) ? 2048 : 1024;
                        i21 = i3 & 8192;
                        if (i21 != 0) {
                            i22 = i26 | 24576;
                        } else {
                            i22 = i26;
                            if ((i2 & 24576) == 0) {
                                i22 |= startRestartGroup.changed(vertical) ? 16384 : 8192;
                                if ((i3 & 16384) == 0) {
                                    i22 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i22 |= startRestartGroup.changedInstance(content) ? 131072 : 65536;
                                }
                                i23 = i22;
                                if ((i14 & 306783379) == 306783378 || (74899 & i23) != 74898 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier.Companion companion = i25 == 0 ? Modifier.INSTANCE : modifier;
                                        m5693getUnspecified0d7_KjU = i5 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j;
                                        long m5693getUnspecified0d7_KjU3 = i6 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j2;
                                        long m5693getUnspecified0d7_KjU4 = i7 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j5;
                                        if (i8 != 0) {
                                            z2 = true;
                                        }
                                        rectangleShape = i9 == 0 ? RectangleShapeKt.getRectangleShape() : shape;
                                        m5693getUnspecified0d7_KjU2 = i10 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j4;
                                        m8421getUnspecifiedD9Ej5fM = i13 == 0 ? Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM() : f;
                                        PaddingValues noPadding = i16 == 0 ? UtilsKt.getNoPadding() : paddingValues;
                                        mutableInteractionSource2 = i19 == 0 ? null : mutableInteractionSource;
                                        if ((i3 & 2048) == 0) {
                                            ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                                            modifier2 = companion;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(localIndication);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            indication2 = (Indication) consume;
                                            i23 &= -897;
                                        } else {
                                            modifier2 = companion;
                                            indication2 = indication;
                                        }
                                        if (i20 != 0) {
                                            horizontal2 = Arrangement.INSTANCE.getStart();
                                        }
                                        if (i21 == 0) {
                                            long j12 = m5693getUnspecified0d7_KjU3;
                                            horizontal3 = horizontal2;
                                            j6 = j12;
                                            z3 = z2;
                                            j7 = m5693getUnspecified0d7_KjU4;
                                            vertical2 = Alignment.INSTANCE.getTop();
                                            paddingValues2 = noPadding;
                                            modifier3 = modifier2;
                                        } else {
                                            long j13 = m5693getUnspecified0d7_KjU3;
                                            horizontal3 = horizontal2;
                                            j6 = j13;
                                            z3 = z2;
                                            j7 = m5693getUnspecified0d7_KjU4;
                                            modifier3 = modifier2;
                                            vertical2 = vertical;
                                            paddingValues2 = noPadding;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 2048) != 0) {
                                            i23 &= -897;
                                        }
                                        long j14 = j5;
                                        z3 = z2;
                                        j7 = j14;
                                        modifier3 = modifier;
                                        m5693getUnspecified0d7_KjU = j;
                                        rectangleShape = shape;
                                        m5693getUnspecified0d7_KjU2 = j4;
                                        m8421getUnspecifiedD9Ej5fM = f;
                                        paddingValues2 = paddingValues;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        indication2 = indication;
                                        vertical2 = vertical;
                                        horizontal3 = horizontal2;
                                        j6 = j2;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        indication3 = indication2;
                                    } else {
                                        indication3 = indication2;
                                        ComposerKt.traceEventStart(1015992040, i14, i23, "com.composeunstyled.Radio (deprecated.RadioGroup.kt:169)");
                                    }
                                    boolean areEqual = Intrinsics.areEqual(Radio.getState().getSelectedOption(), value);
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    z4 = ((i14 & 14) != 4) | ((i14 & 112) != 32);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new Function1() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit Radio_bQLPMV8$lambda$9$lambda$8;
                                                Radio_bQLPMV8$lambda$9$lambda$8 = Deprecated_RadioGroupKt.Radio_bQLPMV8$lambda$9$lambda$8(RadioGroupScope.this, value, ((Boolean) obj).booleanValue());
                                                return Radio_bQLPMV8$lambda$9$lambda$8;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    long j15 = m5693getUnspecified0d7_KjU;
                                    Indication indication5 = indication3;
                                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                    composer2 = startRestartGroup;
                                    m9496RadiobQLPMV8(areEqual, (Function1<? super Boolean, Unit>) rememberedValue, modifier3, j15, j6, j7, z3, rectangleShape, m5693getUnspecified0d7_KjU2, m8421getUnspecifiedD9Ej5fM, paddingValues2, mutableInteractionSource4, indication5, horizontal3, vertical2, content, composer2, i14 & 2147483520, i23 & 524286, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier4 = modifier3;
                                    j8 = j15;
                                    j9 = j6;
                                    j10 = j7;
                                    z2 = z3;
                                    shape2 = rectangleShape;
                                    j11 = m5693getUnspecified0d7_KjU2;
                                    f2 = m8421getUnspecifiedD9Ej5fM;
                                    paddingValues3 = paddingValues2;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                    indication4 = indication5;
                                    horizontal4 = horizontal3;
                                    vertical3 = vertical2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier4 = modifier;
                                    j8 = j;
                                    shape2 = shape;
                                    f2 = f;
                                    paddingValues3 = paddingValues;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    indication4 = indication;
                                    vertical3 = vertical;
                                    composer2 = startRestartGroup;
                                    horizontal4 = horizontal2;
                                    j10 = j5;
                                    j9 = j2;
                                    j11 = j4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit Radio_bQLPMV8$lambda$10;
                                            Radio_bQLPMV8$lambda$10 = Deprecated_RadioGroupKt.Radio_bQLPMV8$lambda$10(RadioGroupScope.this, value, modifier4, j8, j9, j10, z2, shape2, j11, f2, paddingValues3, mutableInteractionSource3, indication4, horizontal4, vertical3, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            return Radio_bQLPMV8$lambda$10;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                        }
                        if ((i3 & 16384) == 0) {
                        }
                        i23 = i22;
                        if ((i14 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        if (i20 != 0) {
                        }
                        if (i21 == 0) {
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        boolean areEqual2 = Intrinsics.areEqual(Radio.getState().getSelectedOption(), value);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        z4 = ((i14 & 14) != 4) | ((i14 & 112) != 32);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z4) {
                        }
                        rememberedValue = new Function1() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit Radio_bQLPMV8$lambda$9$lambda$8;
                                Radio_bQLPMV8$lambda$9$lambda$8 = Deprecated_RadioGroupKt.Radio_bQLPMV8$lambda$9$lambda$8(RadioGroupScope.this, value, ((Boolean) obj).booleanValue());
                                return Radio_bQLPMV8$lambda$9$lambda$8;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceGroup();
                        long j152 = m5693getUnspecified0d7_KjU;
                        Indication indication52 = indication3;
                        MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                        composer2 = startRestartGroup;
                        m9496RadiobQLPMV8(areEqual2, (Function1<? super Boolean, Unit>) rememberedValue, modifier3, j152, j6, j7, z3, rectangleShape, m5693getUnspecified0d7_KjU2, m8421getUnspecifiedD9Ej5fM, paddingValues2, mutableInteractionSource42, indication52, horizontal3, vertical2, content, composer2, i14 & 2147483520, i23 & 524286, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        j8 = j152;
                        j9 = j6;
                        j10 = j7;
                        z2 = z3;
                        shape2 = rectangleShape;
                        j11 = m5693getUnspecified0d7_KjU2;
                        f2 = m8421getUnspecifiedD9Ej5fM;
                        paddingValues3 = paddingValues2;
                        mutableInteractionSource3 = mutableInteractionSource42;
                        indication4 = indication52;
                        horizontal4 = horizontal3;
                        vertical3 = vertical2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    horizontal2 = horizontal;
                    i21 = i3 & 8192;
                    if (i21 != 0) {
                    }
                    if ((i3 & 16384) == 0) {
                    }
                    i23 = i22;
                    if ((i14 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i21 == 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    boolean areEqual22 = Intrinsics.areEqual(Radio.getState().getSelectedOption(), value);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    z4 = ((i14 & 14) != 4) | ((i14 & 112) != 32);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z4) {
                    }
                    rememberedValue = new Function1() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit Radio_bQLPMV8$lambda$9$lambda$8;
                            Radio_bQLPMV8$lambda$9$lambda$8 = Deprecated_RadioGroupKt.Radio_bQLPMV8$lambda$9$lambda$8(RadioGroupScope.this, value, ((Boolean) obj).booleanValue());
                            return Radio_bQLPMV8$lambda$9$lambda$8;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    long j1522 = m5693getUnspecified0d7_KjU;
                    Indication indication522 = indication3;
                    MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                    composer2 = startRestartGroup;
                    m9496RadiobQLPMV8(areEqual22, (Function1<? super Boolean, Unit>) rememberedValue, modifier3, j1522, j6, j7, z3, rectangleShape, m5693getUnspecified0d7_KjU2, m8421getUnspecifiedD9Ej5fM, paddingValues2, mutableInteractionSource422, indication522, horizontal3, vertical2, content, composer2, i14 & 2147483520, i23 & 524286, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    j8 = j1522;
                    j9 = j6;
                    j10 = j7;
                    z2 = z3;
                    shape2 = rectangleShape;
                    j11 = m5693getUnspecified0d7_KjU2;
                    f2 = m8421getUnspecifiedD9Ej5fM;
                    paddingValues3 = paddingValues2;
                    mutableInteractionSource3 = mutableInteractionSource422;
                    indication4 = indication522;
                    horizontal4 = horizontal3;
                    vertical3 = vertical2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i19 = i18;
                if ((i2 & 384) == 0) {
                }
                int i262 = i17;
                i20 = i3 & 4096;
                if (i20 == 0) {
                }
                horizontal2 = horizontal;
                i21 = i3 & 8192;
                if (i21 != 0) {
                }
                if ((i3 & 16384) == 0) {
                }
                i23 = i22;
                if ((i14 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i25 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 != 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i13 == 0) {
                }
                if (i16 == 0) {
                }
                if (i19 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                if (i20 != 0) {
                }
                if (i21 == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                boolean areEqual222 = Intrinsics.areEqual(Radio.getState().getSelectedOption(), value);
                startRestartGroup.startReplaceGroup(-1633490746);
                z4 = ((i14 & 14) != 4) | ((i14 & 112) != 32);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                rememberedValue = new Function1() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit Radio_bQLPMV8$lambda$9$lambda$8;
                        Radio_bQLPMV8$lambda$9$lambda$8 = Deprecated_RadioGroupKt.Radio_bQLPMV8$lambda$9$lambda$8(RadioGroupScope.this, value, ((Boolean) obj).booleanValue());
                        return Radio_bQLPMV8$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                long j15222 = m5693getUnspecified0d7_KjU;
                Indication indication5222 = indication3;
                MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
                composer2 = startRestartGroup;
                m9496RadiobQLPMV8(areEqual222, (Function1<? super Boolean, Unit>) rememberedValue, modifier3, j15222, j6, j7, z3, rectangleShape, m5693getUnspecified0d7_KjU2, m8421getUnspecifiedD9Ej5fM, paddingValues2, mutableInteractionSource4222, indication5222, horizontal3, vertical2, content, composer2, i14 & 2147483520, i23 & 524286, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                j8 = j15222;
                j9 = j6;
                j10 = j7;
                z2 = z3;
                shape2 = rectangleShape;
                j11 = m5693getUnspecified0d7_KjU2;
                f2 = m8421getUnspecifiedD9Ej5fM;
                paddingValues3 = paddingValues2;
                mutableInteractionSource3 = mutableInteractionSource4222;
                indication4 = indication5222;
                horizontal4 = horizontal3;
                vertical3 = vertical2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i11 = i4;
            i12 = i3 & 256;
            if (i12 != 0) {
            }
            i14 = i11;
            i15 = i3 & 512;
            if (i15 != 0) {
            }
            i18 = i3 & 1024;
            if (i18 != 0) {
            }
            i19 = i18;
            if ((i2 & 384) == 0) {
            }
            int i2622 = i17;
            i20 = i3 & 4096;
            if (i20 == 0) {
            }
            horizontal2 = horizontal;
            i21 = i3 & 8192;
            if (i21 != 0) {
            }
            if ((i3 & 16384) == 0) {
            }
            i23 = i22;
            if ((i14 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i25 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 != 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i13 == 0) {
            }
            if (i16 == 0) {
            }
            if (i19 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            if (i20 != 0) {
            }
            if (i21 == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            boolean areEqual2222 = Intrinsics.areEqual(Radio.getState().getSelectedOption(), value);
            startRestartGroup.startReplaceGroup(-1633490746);
            z4 = ((i14 & 14) != 4) | ((i14 & 112) != 32);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue = new Function1() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit Radio_bQLPMV8$lambda$9$lambda$8;
                    Radio_bQLPMV8$lambda$9$lambda$8 = Deprecated_RadioGroupKt.Radio_bQLPMV8$lambda$9$lambda$8(RadioGroupScope.this, value, ((Boolean) obj).booleanValue());
                    return Radio_bQLPMV8$lambda$9$lambda$8;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            long j152222 = m5693getUnspecified0d7_KjU;
            Indication indication52222 = indication3;
            MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
            composer2 = startRestartGroup;
            m9496RadiobQLPMV8(areEqual2222, (Function1<? super Boolean, Unit>) rememberedValue, modifier3, j152222, j6, j7, z3, rectangleShape, m5693getUnspecified0d7_KjU2, m8421getUnspecifiedD9Ej5fM, paddingValues2, mutableInteractionSource42222, indication52222, horizontal3, vertical2, content, composer2, i14 & 2147483520, i23 & 524286, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            j8 = j152222;
            j9 = j6;
            j10 = j7;
            z2 = z3;
            shape2 = rectangleShape;
            j11 = m5693getUnspecified0d7_KjU2;
            f2 = m8421getUnspecifiedD9Ej5fM;
            paddingValues3 = paddingValues2;
            mutableInteractionSource3 = mutableInteractionSource42222;
            indication4 = indication52222;
            horizontal4 = horizontal3;
            vertical3 = vertical2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i4;
        i12 = i3 & 256;
        if (i12 != 0) {
        }
        i14 = i11;
        i15 = i3 & 512;
        if (i15 != 0) {
        }
        i18 = i3 & 1024;
        if (i18 != 0) {
        }
        i19 = i18;
        if ((i2 & 384) == 0) {
        }
        int i26222 = i17;
        i20 = i3 & 4096;
        if (i20 == 0) {
        }
        horizontal2 = horizontal;
        i21 = i3 & 8192;
        if (i21 != 0) {
        }
        if ((i3 & 16384) == 0) {
        }
        i23 = i22;
        if ((i14 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i25 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 != 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i13 == 0) {
        }
        if (i16 == 0) {
        }
        if (i19 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        if (i20 != 0) {
        }
        if (i21 == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        boolean areEqual22222 = Intrinsics.areEqual(Radio.getState().getSelectedOption(), value);
        startRestartGroup.startReplaceGroup(-1633490746);
        z4 = ((i14 & 14) != 4) | ((i14 & 112) != 32);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue = new Function1() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Radio_bQLPMV8$lambda$9$lambda$8;
                Radio_bQLPMV8$lambda$9$lambda$8 = Deprecated_RadioGroupKt.Radio_bQLPMV8$lambda$9$lambda$8(RadioGroupScope.this, value, ((Boolean) obj).booleanValue());
                return Radio_bQLPMV8$lambda$9$lambda$8;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        long j1522222 = m5693getUnspecified0d7_KjU;
        Indication indication522222 = indication3;
        MutableInteractionSource mutableInteractionSource422222 = mutableInteractionSource2;
        composer2 = startRestartGroup;
        m9496RadiobQLPMV8(areEqual22222, (Function1<? super Boolean, Unit>) rememberedValue, modifier3, j1522222, j6, j7, z3, rectangleShape, m5693getUnspecified0d7_KjU2, m8421getUnspecifiedD9Ej5fM, paddingValues2, mutableInteractionSource422222, indication522222, horizontal3, vertical2, content, composer2, i14 & 2147483520, i23 & 524286, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        j8 = j1522222;
        j9 = j6;
        j10 = j7;
        z2 = z3;
        shape2 = rectangleShape;
        j11 = m5693getUnspecified0d7_KjU2;
        f2 = m8421getUnspecifiedD9Ej5fM;
        paddingValues3 = paddingValues2;
        mutableInteractionSource3 = mutableInteractionSource422222;
        indication4 = indication522222;
        horizontal4 = horizontal3;
        vertical3 = vertical2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Radio_bQLPMV8$lambda$9$lambda$8(RadioGroupScope radioGroupScope, String str, boolean z) {
        radioGroupScope.getState().setSelectedOption(str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03e6 A[LOOP:0: B:94:0x03e0->B:96:0x03e6, LOOP_END] */
    @Deprecated(message = "Replace with RadioButton")
    /* renamed from: Radio-bQLPMV8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9496RadiobQLPMV8(final boolean z, final Function1<? super Boolean, Unit> onSelectedChange, Modifier modifier, long j, long j2, long j3, boolean z2, Shape shape, long j4, float f, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Indication indication, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        long j5;
        int i6;
        long j6;
        int i7;
        int i8;
        long j7;
        int i9;
        boolean z3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        Indication indication2;
        boolean z4;
        long j8;
        float f2;
        PaddingValues paddingValues2;
        Alignment.Vertical vertical2;
        int i24;
        Indication indication3;
        Arrangement.Horizontal horizontal2;
        long j9;
        Shape shape3;
        Object rememberedValue;
        List createListBuilder;
        Iterator it;
        int currentCompositeKeyHash;
        Composer m4976constructorimpl;
        final Alignment.Vertical vertical3;
        final boolean z5;
        final long j10;
        Composer composer2;
        final Modifier modifier3;
        final Shape shape4;
        final long j11;
        final float f3;
        final PaddingValues paddingValues3;
        final long j12;
        final Arrangement.Horizontal horizontal3;
        final long j13;
        final Indication indication4;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i25;
        Intrinsics.checkNotNullParameter(onSelectedChange, "onSelectedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(884515896);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(onSelectedChange) ? 32 : 16;
        }
        int i26 = i3 & 4;
        if (i26 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
                j5 = j;
            } else {
                j5 = j;
                if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changed(j5) ? 2048 : 1024;
                }
            }
            i6 = i3 & 16;
            if (i6 == 0) {
                i4 |= 24576;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(j6) ? 16384 : 8192;
                }
            }
            i7 = i3 & 32;
            if (i7 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i8 = i26;
                j7 = j3;
                i4 |= startRestartGroup.changed(j7) ? 131072 : 65536;
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                    z3 = z2;
                } else {
                    z3 = z2;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i11 = i10;
                    i4 |= startRestartGroup.changed(shape) ? 8388608 : 4194304;
                    i12 = i3 & 256;
                    if (i12 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i13 = i12;
                        i4 |= startRestartGroup.changed(j4) ? 67108864 : 33554432;
                        i14 = i3 & 512;
                        if (i14 != 0) {
                            i4 |= 805306368;
                        } else if ((805306368 & i) == 0) {
                            i4 |= startRestartGroup.changed(f) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            i15 = i3 & 1024;
                            if (i15 == 0) {
                                i17 = i2 | 6;
                                i16 = i15;
                            } else if ((i2 & 6) == 0) {
                                i16 = i15;
                                i17 = i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2);
                            } else {
                                i16 = i15;
                                i17 = i2;
                            }
                            i18 = i3 & 2048;
                            if (i18 == 0) {
                                i17 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i19 = i18;
                                i17 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                                if ((i2 & 384) == 0) {
                                    if ((i3 & 4096) == 0 && startRestartGroup.changed(indication)) {
                                        i25 = 256;
                                        i17 |= i25;
                                    }
                                    i25 = 128;
                                    i17 |= i25;
                                }
                                int i27 = i17;
                                i20 = i3 & 8192;
                                if (i20 != 0) {
                                    i21 = i27 | 3072;
                                } else if ((i2 & 3072) == 0) {
                                    i21 = i27 | (startRestartGroup.changed(horizontal) ? 2048 : 1024);
                                } else {
                                    i21 = i27;
                                }
                                i22 = i3 & 16384;
                                if (i22 != 0) {
                                    i23 = i21 | 24576;
                                } else {
                                    i23 = i21;
                                    if ((i2 & 24576) == 0) {
                                        i23 |= startRestartGroup.changed(vertical) ? 16384 : 8192;
                                        if ((i3 & 32768) == 0) {
                                            i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i23 |= startRestartGroup.changedInstance(content) ? 131072 : 65536;
                                        }
                                        int i28 = i23;
                                        if ((i4 & 306783379) == 306783378 || (74899 & i28) != 74898 || !startRestartGroup.getSkipping()) {
                                            startRestartGroup.startDefaults();
                                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                                if (i8 != 0) {
                                                    modifier2 = Modifier.INSTANCE;
                                                }
                                                if (i5 != 0) {
                                                    j5 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                                                }
                                                if (i6 != 0) {
                                                    j6 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                                                }
                                                if (i7 != 0) {
                                                    j7 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                                                }
                                                if (i9 != 0) {
                                                    z3 = true;
                                                }
                                                Shape rectangleShape = i11 == 0 ? RectangleShapeKt.getRectangleShape() : shape;
                                                long m5693getUnspecified0d7_KjU = i13 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j4;
                                                float m8421getUnspecifiedD9Ej5fM = i14 == 0 ? Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM() : f;
                                                PaddingValues noPadding = i16 == 0 ? UtilsKt.getNoPadding() : paddingValues;
                                                mutableInteractionSource2 = i19 == 0 ? null : mutableInteractionSource;
                                                if ((i3 & 4096) == 0) {
                                                    ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                                                    shape2 = rectangleShape;
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                    Object consume = startRestartGroup.consume(localIndication);
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    indication2 = (Indication) consume;
                                                    i28 &= -897;
                                                } else {
                                                    shape2 = rectangleShape;
                                                    indication2 = indication;
                                                }
                                                Arrangement.Horizontal start = i20 == 0 ? Arrangement.INSTANCE.getStart() : horizontal;
                                                if (i22 == 0) {
                                                    z4 = z3;
                                                    j8 = j7;
                                                    paddingValues2 = noPadding;
                                                    i24 = i28;
                                                    horizontal2 = start;
                                                    vertical2 = Alignment.INSTANCE.getTop();
                                                    f2 = m8421getUnspecifiedD9Ej5fM;
                                                    shape3 = shape2;
                                                    indication3 = indication2;
                                                    j9 = m5693getUnspecified0d7_KjU;
                                                } else {
                                                    z4 = z3;
                                                    j8 = j7;
                                                    f2 = m8421getUnspecifiedD9Ej5fM;
                                                    paddingValues2 = noPadding;
                                                    vertical2 = vertical;
                                                    i24 = i28;
                                                    indication3 = indication2;
                                                    horizontal2 = start;
                                                    j9 = m5693getUnspecified0d7_KjU;
                                                    shape3 = shape2;
                                                }
                                            } else {
                                                startRestartGroup.skipToGroupEnd();
                                                if ((i3 & 4096) != 0) {
                                                    i28 &= -897;
                                                }
                                                int i29 = i28;
                                                shape3 = shape;
                                                j8 = j7;
                                                i24 = i29;
                                                j9 = j4;
                                                f2 = f;
                                                paddingValues2 = paddingValues;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                                indication3 = indication;
                                                vertical2 = vertical;
                                                z4 = z3;
                                                horizontal2 = horizontal;
                                            }
                                            startRestartGroup.endDefaults();
                                            long j14 = j5;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(884515896, i4, i24, "com.composeunstyled.Radio (deprecated.RadioGroup.kt:233)");
                                            }
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = new Function1() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit Radio_bQLPMV8$lambda$12$lambda$11;
                                                        Radio_bQLPMV8$lambda$12$lambda$11 = Deprecated_RadioGroupKt.Radio_bQLPMV8$lambda$12$lambda$11((SemanticsPropertyReceiver) obj);
                                                        return Radio_bQLPMV8$lambda$12$lambda$11;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            Modifier semantics = SemanticsModifierKt.semantics(modifier2, true, (Function1) rememberedValue);
                                            createListBuilder = CollectionsKt.createListBuilder();
                                            boolean z6 = z4;
                                            createListBuilder.add(ToggleableKt.m1171toggleableO2vRcR0(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape3), j14, null, 2, null), z, mutableInteractionSource2, indication3, z6, Role.m7575boximpl(Role.INSTANCE.m7587getRadioButtono7Vup1c()), onSelectedChange));
                                            if (Dp.m8400compareTo0680j_4(f2, Dp.m8401constructorimpl(0)) > 0 && j9 != 16) {
                                                createListBuilder.add(BorderKt.m274borderxT4_qwU(Modifier.INSTANCE, f2, j9, shape3));
                                            }
                                            createListBuilder.add(PaddingKt.padding(Modifier.INSTANCE, paddingValues2));
                                            List build = CollectionsKt.build(createListBuilder);
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            Shape shape5 = shape3;
                                            Intrinsics.checkNotNull(companion, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                                            Modifier.Companion companion2 = companion;
                                            it = build.iterator();
                                            while (it.hasNext()) {
                                                companion2 = companion2.then((Modifier) it.next());
                                            }
                                            Modifier then = semantics.then(companion2);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal2, vertical2, startRestartGroup, (((i24 >> 6) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            long j15 = j9;
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
                                            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(!z ? j6 : j8)), ComposableLambdaKt.rememberComposableLambda(1827520404, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$Radio$5$1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer3, int i30) {
                                                    if ((i30 & 3) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1827520404, i30, -1, "com.composeunstyled.Radio.<anonymous>.<anonymous> (deprecated.RadioGroup.kt:257)");
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
                                            vertical3 = vertical2;
                                            z5 = z6;
                                            j10 = j15;
                                            composer2 = startRestartGroup;
                                            modifier3 = modifier2;
                                            shape4 = shape5;
                                            j11 = j8;
                                            long j16 = j6;
                                            f3 = f2;
                                            paddingValues3 = paddingValues2;
                                            j12 = j14;
                                            horizontal3 = horizontal2;
                                            j13 = j16;
                                            indication4 = indication3;
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            indication4 = indication;
                                            horizontal3 = horizontal;
                                            vertical3 = vertical;
                                            composer2 = startRestartGroup;
                                            modifier3 = modifier2;
                                            j11 = j7;
                                            j12 = j5;
                                            shape4 = shape;
                                            j10 = j4;
                                            z5 = z3;
                                            j13 = j6;
                                            f3 = f;
                                            paddingValues3 = paddingValues;
                                        }
                                        endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup == null) {
                                            endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    Unit Radio_bQLPMV8$lambda$15;
                                                    Radio_bQLPMV8$lambda$15 = Deprecated_RadioGroupKt.Radio_bQLPMV8$lambda$15(z, onSelectedChange, modifier3, j12, j13, j11, z5, shape4, j10, f3, paddingValues3, mutableInteractionSource3, indication4, horizontal3, vertical3, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                    return Radio_bQLPMV8$lambda$15;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                }
                                if ((i3 & 32768) == 0) {
                                }
                                int i282 = i23;
                                if ((i4 & 306783379) == 306783378) {
                                }
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if ((i3 & 4096) == 0) {
                                }
                                if (i20 == 0) {
                                }
                                if (i22 == 0) {
                                }
                                startRestartGroup.endDefaults();
                                long j142 = j5;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                Modifier semantics2 = SemanticsModifierKt.semantics(modifier2, true, (Function1) rememberedValue);
                                createListBuilder = CollectionsKt.createListBuilder();
                                boolean z62 = z4;
                                createListBuilder.add(ToggleableKt.m1171toggleableO2vRcR0(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape3), j142, null, 2, null), z, mutableInteractionSource2, indication3, z62, Role.m7575boximpl(Role.INSTANCE.m7587getRadioButtono7Vup1c()), onSelectedChange));
                                if (Dp.m8400compareTo0680j_4(f2, Dp.m8401constructorimpl(0)) > 0) {
                                    createListBuilder.add(BorderKt.m274borderxT4_qwU(Modifier.INSTANCE, f2, j9, shape3));
                                }
                                createListBuilder.add(PaddingKt.padding(Modifier.INSTANCE, paddingValues2));
                                List build2 = CollectionsKt.build(createListBuilder);
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Shape shape52 = shape3;
                                Intrinsics.checkNotNull(companion3, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                                Modifier.Companion companion22 = companion3;
                                it = build2.iterator();
                                while (it.hasNext()) {
                                }
                                Modifier then2 = semantics2.then(companion22);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontal2, vertical2, startRestartGroup, (((i24 >> 6) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                long j152 = j9;
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
                                CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(!z ? j6 : j8)), ComposableLambdaKt.rememberComposableLambda(1827520404, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$Radio$5$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i30) {
                                        if ((i30 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1827520404, i30, -1, "com.composeunstyled.Radio.<anonymous>.<anonymous> (deprecated.RadioGroup.kt:257)");
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
                                vertical3 = vertical2;
                                z5 = z62;
                                j10 = j152;
                                composer2 = startRestartGroup;
                                modifier3 = modifier2;
                                shape4 = shape52;
                                j11 = j8;
                                long j162 = j6;
                                f3 = f2;
                                paddingValues3 = paddingValues2;
                                j12 = j142;
                                horizontal3 = horizontal2;
                                j13 = j162;
                                indication4 = indication3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i19 = i18;
                            if ((i2 & 384) == 0) {
                            }
                            int i272 = i17;
                            i20 = i3 & 8192;
                            if (i20 != 0) {
                            }
                            i22 = i3 & 16384;
                            if (i22 != 0) {
                            }
                            if ((i3 & 32768) == 0) {
                            }
                            int i2822 = i23;
                            if ((i4 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if ((i3 & 4096) == 0) {
                            }
                            if (i20 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            startRestartGroup.endDefaults();
                            long j1422 = j5;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier semantics22 = SemanticsModifierKt.semantics(modifier2, true, (Function1) rememberedValue);
                            createListBuilder = CollectionsKt.createListBuilder();
                            boolean z622 = z4;
                            createListBuilder.add(ToggleableKt.m1171toggleableO2vRcR0(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape3), j1422, null, 2, null), z, mutableInteractionSource2, indication3, z622, Role.m7575boximpl(Role.INSTANCE.m7587getRadioButtono7Vup1c()), onSelectedChange));
                            if (Dp.m8400compareTo0680j_4(f2, Dp.m8401constructorimpl(0)) > 0) {
                            }
                            createListBuilder.add(PaddingKt.padding(Modifier.INSTANCE, paddingValues2));
                            List build22 = CollectionsKt.build(createListBuilder);
                            Modifier.Companion companion32 = Modifier.INSTANCE;
                            Shape shape522 = shape3;
                            Intrinsics.checkNotNull(companion32, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                            Modifier.Companion companion222 = companion32;
                            it = build22.iterator();
                            while (it.hasNext()) {
                            }
                            Modifier then22 = semantics22.then(companion222);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(horizontal2, vertical2, startRestartGroup, (((i24 >> 6) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                            long j1522 = j9;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
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
                            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(!z ? j6 : j8)), ComposableLambdaKt.rememberComposableLambda(1827520404, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$Radio$5$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i30) {
                                    if ((i30 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1827520404, i30, -1, "com.composeunstyled.Radio.<anonymous>.<anonymous> (deprecated.RadioGroup.kt:257)");
                                    }
                                    content.invoke(rowScopeInstance22, composer3, 0);
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
                            vertical3 = vertical2;
                            z5 = z622;
                            j10 = j1522;
                            composer2 = startRestartGroup;
                            modifier3 = modifier2;
                            shape4 = shape522;
                            j11 = j8;
                            long j1622 = j6;
                            f3 = f2;
                            paddingValues3 = paddingValues2;
                            j12 = j1422;
                            horizontal3 = horizontal2;
                            j13 = j1622;
                            indication4 = indication3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i15 = i3 & 1024;
                        if (i15 == 0) {
                        }
                        i18 = i3 & 2048;
                        if (i18 == 0) {
                        }
                        i19 = i18;
                        if ((i2 & 384) == 0) {
                        }
                        int i2722 = i17;
                        i20 = i3 & 8192;
                        if (i20 != 0) {
                        }
                        i22 = i3 & 16384;
                        if (i22 != 0) {
                        }
                        if ((i3 & 32768) == 0) {
                        }
                        int i28222 = i23;
                        if ((i4 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if ((i3 & 4096) == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        startRestartGroup.endDefaults();
                        long j14222 = j5;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier semantics222 = SemanticsModifierKt.semantics(modifier2, true, (Function1) rememberedValue);
                        createListBuilder = CollectionsKt.createListBuilder();
                        boolean z6222 = z4;
                        createListBuilder.add(ToggleableKt.m1171toggleableO2vRcR0(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape3), j14222, null, 2, null), z, mutableInteractionSource2, indication3, z6222, Role.m7575boximpl(Role.INSTANCE.m7587getRadioButtono7Vup1c()), onSelectedChange));
                        if (Dp.m8400compareTo0680j_4(f2, Dp.m8401constructorimpl(0)) > 0) {
                        }
                        createListBuilder.add(PaddingKt.padding(Modifier.INSTANCE, paddingValues2));
                        List build222 = CollectionsKt.build(createListBuilder);
                        Modifier.Companion companion322 = Modifier.INSTANCE;
                        Shape shape5222 = shape3;
                        Intrinsics.checkNotNull(companion322, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                        Modifier.Companion companion2222 = companion322;
                        it = build222.iterator();
                        while (it.hasNext()) {
                        }
                        Modifier then222 = semantics222.then(companion2222);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(horizontal2, vertical2, startRestartGroup, (((i24 >> 6) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, then222);
                        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                        long j15222 = j9;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(!z ? j6 : j8)), ComposableLambdaKt.rememberComposableLambda(1827520404, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$Radio$5$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i30) {
                                if ((i30 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1827520404, i30, -1, "com.composeunstyled.Radio.<anonymous>.<anonymous> (deprecated.RadioGroup.kt:257)");
                                }
                                content.invoke(rowScopeInstance222, composer3, 0);
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
                        vertical3 = vertical2;
                        z5 = z6222;
                        j10 = j15222;
                        composer2 = startRestartGroup;
                        modifier3 = modifier2;
                        shape4 = shape5222;
                        j11 = j8;
                        long j16222 = j6;
                        f3 = f2;
                        paddingValues3 = paddingValues2;
                        j12 = j14222;
                        horizontal3 = horizontal2;
                        j13 = j16222;
                        indication4 = indication3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i13 = i12;
                    i14 = i3 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i3 & 1024;
                    if (i15 == 0) {
                    }
                    i18 = i3 & 2048;
                    if (i18 == 0) {
                    }
                    i19 = i18;
                    if ((i2 & 384) == 0) {
                    }
                    int i27222 = i17;
                    i20 = i3 & 8192;
                    if (i20 != 0) {
                    }
                    i22 = i3 & 16384;
                    if (i22 != 0) {
                    }
                    if ((i3 & 32768) == 0) {
                    }
                    int i282222 = i23;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if ((i3 & 4096) == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    startRestartGroup.endDefaults();
                    long j142222 = j5;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier semantics2222 = SemanticsModifierKt.semantics(modifier2, true, (Function1) rememberedValue);
                    createListBuilder = CollectionsKt.createListBuilder();
                    boolean z62222 = z4;
                    createListBuilder.add(ToggleableKt.m1171toggleableO2vRcR0(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape3), j142222, null, 2, null), z, mutableInteractionSource2, indication3, z62222, Role.m7575boximpl(Role.INSTANCE.m7587getRadioButtono7Vup1c()), onSelectedChange));
                    if (Dp.m8400compareTo0680j_4(f2, Dp.m8401constructorimpl(0)) > 0) {
                    }
                    createListBuilder.add(PaddingKt.padding(Modifier.INSTANCE, paddingValues2));
                    List build2222 = CollectionsKt.build(createListBuilder);
                    Modifier.Companion companion3222 = Modifier.INSTANCE;
                    Shape shape52222 = shape3;
                    Intrinsics.checkNotNull(companion3222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                    Modifier.Companion companion22222 = companion3222;
                    it = build2222.iterator();
                    while (it.hasNext()) {
                    }
                    Modifier then2222 = semantics2222.then(companion22222);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(horizontal2, vertical2, startRestartGroup, (((i24 >> 6) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, then2222);
                    Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                    long j152222 = j9;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
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
                    CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(!z ? j6 : j8)), ComposableLambdaKt.rememberComposableLambda(1827520404, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$Radio$5$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i30) {
                            if ((i30 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1827520404, i30, -1, "com.composeunstyled.Radio.<anonymous>.<anonymous> (deprecated.RadioGroup.kt:257)");
                            }
                            content.invoke(rowScopeInstance2222, composer3, 0);
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
                    vertical3 = vertical2;
                    z5 = z62222;
                    j10 = j152222;
                    composer2 = startRestartGroup;
                    modifier3 = modifier2;
                    shape4 = shape52222;
                    j11 = j8;
                    long j162222 = j6;
                    f3 = f2;
                    paddingValues3 = paddingValues2;
                    j12 = j142222;
                    horizontal3 = horizontal2;
                    j13 = j162222;
                    indication4 = indication3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i11 = i10;
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i3 & 512;
                if (i14 != 0) {
                }
                i15 = i3 & 1024;
                if (i15 == 0) {
                }
                i18 = i3 & 2048;
                if (i18 == 0) {
                }
                i19 = i18;
                if ((i2 & 384) == 0) {
                }
                int i272222 = i17;
                i20 = i3 & 8192;
                if (i20 != 0) {
                }
                i22 = i3 & 16384;
                if (i22 != 0) {
                }
                if ((i3 & 32768) == 0) {
                }
                int i2822222 = i23;
                if ((i4 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (i19 == 0) {
                }
                if ((i3 & 4096) == 0) {
                }
                if (i20 == 0) {
                }
                if (i22 == 0) {
                }
                startRestartGroup.endDefaults();
                long j1422222 = j5;
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier semantics22222 = SemanticsModifierKt.semantics(modifier2, true, (Function1) rememberedValue);
                createListBuilder = CollectionsKt.createListBuilder();
                boolean z622222 = z4;
                createListBuilder.add(ToggleableKt.m1171toggleableO2vRcR0(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape3), j1422222, null, 2, null), z, mutableInteractionSource2, indication3, z622222, Role.m7575boximpl(Role.INSTANCE.m7587getRadioButtono7Vup1c()), onSelectedChange));
                if (Dp.m8400compareTo0680j_4(f2, Dp.m8401constructorimpl(0)) > 0) {
                }
                createListBuilder.add(PaddingKt.padding(Modifier.INSTANCE, paddingValues2));
                List build22222 = CollectionsKt.build(createListBuilder);
                Modifier.Companion companion32222 = Modifier.INSTANCE;
                Shape shape522222 = shape3;
                Intrinsics.checkNotNull(companion32222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                Modifier.Companion companion222222 = companion32222;
                it = build22222.iterator();
                while (it.hasNext()) {
                }
                Modifier then22222 = semantics22222.then(companion222222);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy22222 = RowKt.rowMeasurePolicy(horizontal2, vertical2, startRestartGroup, (((i24 >> 6) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, then22222);
                Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                long j1522222 = j9;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
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
                CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(!z ? j6 : j8)), ComposableLambdaKt.rememberComposableLambda(1827520404, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$Radio$5$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i30) {
                        if ((i30 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1827520404, i30, -1, "com.composeunstyled.Radio.<anonymous>.<anonymous> (deprecated.RadioGroup.kt:257)");
                        }
                        content.invoke(rowScopeInstance22222, composer3, 0);
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
                vertical3 = vertical2;
                z5 = z622222;
                j10 = j1522222;
                composer2 = startRestartGroup;
                modifier3 = modifier2;
                shape4 = shape522222;
                j11 = j8;
                long j1622222 = j6;
                f3 = f2;
                paddingValues3 = paddingValues2;
                j12 = j1422222;
                horizontal3 = horizontal2;
                j13 = j1622222;
                indication4 = indication3;
                mutableInteractionSource3 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i8 = i26;
            j7 = j3;
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i3 & 512;
            if (i14 != 0) {
            }
            i15 = i3 & 1024;
            if (i15 == 0) {
            }
            i18 = i3 & 2048;
            if (i18 == 0) {
            }
            i19 = i18;
            if ((i2 & 384) == 0) {
            }
            int i2722222 = i17;
            i20 = i3 & 8192;
            if (i20 != 0) {
            }
            i22 = i3 & 16384;
            if (i22 != 0) {
            }
            if ((i3 & 32768) == 0) {
            }
            int i28222222 = i23;
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            if (i19 == 0) {
            }
            if ((i3 & 4096) == 0) {
            }
            if (i20 == 0) {
            }
            if (i22 == 0) {
            }
            startRestartGroup.endDefaults();
            long j14222222 = j5;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier semantics222222 = SemanticsModifierKt.semantics(modifier2, true, (Function1) rememberedValue);
            createListBuilder = CollectionsKt.createListBuilder();
            boolean z6222222 = z4;
            createListBuilder.add(ToggleableKt.m1171toggleableO2vRcR0(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape3), j14222222, null, 2, null), z, mutableInteractionSource2, indication3, z6222222, Role.m7575boximpl(Role.INSTANCE.m7587getRadioButtono7Vup1c()), onSelectedChange));
            if (Dp.m8400compareTo0680j_4(f2, Dp.m8401constructorimpl(0)) > 0) {
            }
            createListBuilder.add(PaddingKt.padding(Modifier.INSTANCE, paddingValues2));
            List build222222 = CollectionsKt.build(createListBuilder);
            Modifier.Companion companion322222 = Modifier.INSTANCE;
            Shape shape5222222 = shape3;
            Intrinsics.checkNotNull(companion322222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
            Modifier.Companion companion2222222 = companion322222;
            it = build222222.iterator();
            while (it.hasNext()) {
            }
            Modifier then222222 = semantics222222.then(companion2222222);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy222222 = RowKt.rowMeasurePolicy(horizontal2, vertical2, startRestartGroup, (((i24 >> 6) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, then222222);
            Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
            long j15222222 = j9;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
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
            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(!z ? j6 : j8)), ComposableLambdaKt.rememberComposableLambda(1827520404, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$Radio$5$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i30) {
                    if ((i30 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1827520404, i30, -1, "com.composeunstyled.Radio.<anonymous>.<anonymous> (deprecated.RadioGroup.kt:257)");
                    }
                    content.invoke(rowScopeInstance222222, composer3, 0);
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
            vertical3 = vertical2;
            z5 = z6222222;
            j10 = j15222222;
            composer2 = startRestartGroup;
            modifier3 = modifier2;
            shape4 = shape5222222;
            j11 = j8;
            long j16222222 = j6;
            f3 = f2;
            paddingValues3 = paddingValues2;
            j12 = j14222222;
            horizontal3 = horizontal2;
            j13 = j16222222;
            indication4 = indication3;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i26;
        j7 = j3;
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i3 & 512;
        if (i14 != 0) {
        }
        i15 = i3 & 1024;
        if (i15 == 0) {
        }
        i18 = i3 & 2048;
        if (i18 == 0) {
        }
        i19 = i18;
        if ((i2 & 384) == 0) {
        }
        int i27222222 = i17;
        i20 = i3 & 8192;
        if (i20 != 0) {
        }
        i22 = i3 & 16384;
        if (i22 != 0) {
        }
        if ((i3 & 32768) == 0) {
        }
        int i282222222 = i23;
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        if (i19 == 0) {
        }
        if ((i3 & 4096) == 0) {
        }
        if (i20 == 0) {
        }
        if (i22 == 0) {
        }
        startRestartGroup.endDefaults();
        long j142222222 = j5;
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier semantics2222222 = SemanticsModifierKt.semantics(modifier2, true, (Function1) rememberedValue);
        createListBuilder = CollectionsKt.createListBuilder();
        boolean z62222222 = z4;
        createListBuilder.add(ToggleableKt.m1171toggleableO2vRcR0(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape3), j142222222, null, 2, null), z, mutableInteractionSource2, indication3, z62222222, Role.m7575boximpl(Role.INSTANCE.m7587getRadioButtono7Vup1c()), onSelectedChange));
        if (Dp.m8400compareTo0680j_4(f2, Dp.m8401constructorimpl(0)) > 0) {
        }
        createListBuilder.add(PaddingKt.padding(Modifier.INSTANCE, paddingValues2));
        List build2222222 = CollectionsKt.build(createListBuilder);
        Modifier.Companion companion3222222 = Modifier.INSTANCE;
        Shape shape52222222 = shape3;
        Intrinsics.checkNotNull(companion3222222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
        Modifier.Companion companion22222222 = companion3222222;
        it = build2222222.iterator();
        while (it.hasNext()) {
        }
        Modifier then2222222 = semantics2222222.then(companion22222222);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2222222 = RowKt.rowMeasurePolicy(horizontal2, vertical2, startRestartGroup, (((i24 >> 6) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(startRestartGroup, then2222222);
        Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
        long j152222222 = j9;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222222);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        final RowScope rowScopeInstance2222222 = RowScopeInstance.INSTANCE;
        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(!z ? j6 : j8)), ComposableLambdaKt.rememberComposableLambda(1827520404, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_RadioGroupKt$Radio$5$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i30) {
                if ((i30 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1827520404, i30, -1, "com.composeunstyled.Radio.<anonymous>.<anonymous> (deprecated.RadioGroup.kt:257)");
                }
                content.invoke(rowScopeInstance2222222, composer3, 0);
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
        vertical3 = vertical2;
        z5 = z62222222;
        j10 = j152222222;
        composer2 = startRestartGroup;
        modifier3 = modifier2;
        shape4 = shape52222222;
        j11 = j8;
        long j162222222 = j6;
        f3 = f2;
        paddingValues3 = paddingValues2;
        j12 = j142222222;
        horizontal3 = horizontal2;
        j13 = j162222222;
        indication4 = indication3;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Radio_bQLPMV8$lambda$12$lambda$11(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        return Unit.INSTANCE;
    }
}
