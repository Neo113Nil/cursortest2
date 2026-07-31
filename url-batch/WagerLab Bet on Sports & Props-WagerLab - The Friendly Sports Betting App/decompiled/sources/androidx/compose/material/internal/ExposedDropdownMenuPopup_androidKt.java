package androidx.compose.material.internal;

import android.view.View;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\u0000\u001a\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0001¢\u0006\u0002\u0010\b\u001a+\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0013\b\b\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0083\b¢\u0006\u0002\u0010\u0011\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012²\u0006\u0015\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007X\u008a\u0084\u0002"}, d2 = {"ExposedDropdownMenuPopup", "", "onDismissRequest", "Lkotlin/Function0;", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "SimpleStack", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material", "currentContent"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopup_androidKt {
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String LocalPopupTestTag$lambda$18;
            LocalPopupTestTag$lambda$18 = ExposedDropdownMenuPopup_androidKt.LocalPopupTestTag$lambda$18();
            return LocalPopupTestTag$lambda$18;
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenuPopup$lambda$17(Function0 function0, PopupPositionProvider popupPositionProvider, Function2 function2, int i, int i2, Composer composer, int i3) {
        ExposedDropdownMenuPopup(function0, popupPositionProvider, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ExposedDropdownMenuPopup(Function0<Unit> function0, PopupPositionProvider popupPositionProvider, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        final Function0<Unit> function03;
        boolean z;
        final PopupPositionProvider popupPositionProvider2 = popupPositionProvider;
        Composer startRestartGroup = composer.startRestartGroup(1705178815);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenuPopup)N(onDismissRequest,popupPositionProvider,content)81@3323L7,82@3362L7,83@3406L7,84@3461L7,85@3497L28,86@3552L29,87@3617L21,87@3600L38,88@3661L960,114@4657L351,114@4627L381,128@5025L182,128@5014L193,136@5253L126,136@5213L166,148@5648L494,159@6150L99,145@5557L692:ExposedDropdownMenuPopup.android.kt#mnwmf7");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            function02 = function0;
        } else if ((i & 6) == 0) {
            function02 = function0;
            i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(popupPositionProvider2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i5 = i3;
        if (startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            function03 = i4 != 0 ? null : function02;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1705178815, i5, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.android.kt:80)");
            }
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            View view = (View) consume;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume2;
            ProvidableCompositionLocal<String> providableCompositionLocal = LocalPopupTestTag;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final String str = (String) consume3;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final LayoutDirection layoutDirection = (LayoutDirection) consume4;
            CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i5 >> 6) & 14);
            Object[] objArr = new Object[0];
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2000649676, "CC(remember):ExposedDropdownMenuPopup.android.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        UUID randomUUID;
                        randomUUID = UUID.randomUUID();
                        return randomUUID;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            UUID uuid = (UUID) RememberSaveableKt.rememberSaveable(objArr, (Function0) rememberedValue, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2000647329, "CC(remember):ExposedDropdownMenuPopup.android.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                PopupLayout popupLayout = new PopupLayout(function03, str, view, density, popupPositionProvider2, uuid);
                str = str;
                popupPositionProvider2 = popupPositionProvider2;
                z = true;
                popupLayout.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(1879981140, true, new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1(popupLayout, rememberUpdatedState)));
                startRestartGroup.updateRememberedValue(popupLayout);
                rememberedValue2 = popupLayout;
            } else {
                z = true;
            }
            final PopupLayout popupLayout2 = (PopupLayout) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2000616066, "CC(remember):ExposedDropdownMenuPopup.android.kt#9igjgp");
            int i6 = i5 & 14;
            LayoutDirection layoutDirection2 = layoutDirection;
            boolean changedInstance = startRestartGroup.changedInstance(popupLayout2) | (i6 == 4 ? z : false) | startRestartGroup.changed(str) | startRestartGroup.changed(layoutDirection2.ordinal());
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DisposableEffectResult ExposedDropdownMenuPopup$lambda$7$lambda$6;
                        ExposedDropdownMenuPopup$lambda$7$lambda$6 = ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup$lambda$7$lambda$6(PopupLayout.this, function03, str, layoutDirection, (DisposableEffectScope) obj);
                        return ExposedDropdownMenuPopup$lambda$7$lambda$6;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.DisposableEffect(popupLayout2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2000604459, "CC(remember):ExposedDropdownMenuPopup.android.kt#9igjgp");
            boolean changedInstance2 = startRestartGroup.changedInstance(popupLayout2) | (i6 == 4 ? z : false) | startRestartGroup.changed(str) | startRestartGroup.changed(layoutDirection2.ordinal());
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ExposedDropdownMenuPopup$lambda$9$lambda$8;
                        ExposedDropdownMenuPopup$lambda$9$lambda$8 = ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup$lambda$9$lambda$8(PopupLayout.this, function03, str, layoutDirection);
                        return ExposedDropdownMenuPopup$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.SideEffect((Function0) rememberedValue4, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2000597219, "CC(remember):ExposedDropdownMenuPopup.android.kt#9igjgp");
            boolean changedInstance3 = startRestartGroup.changedInstance(popupLayout2) | ((i5 & 112) == 32 ? z : false);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DisposableEffectResult ExposedDropdownMenuPopup$lambda$12$lambda$11;
                        ExposedDropdownMenuPopup$lambda$12$lambda$11 = ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup$lambda$12$lambda$11(PopupLayout.this, popupPositionProvider2, (DisposableEffectScope) obj);
                        return ExposedDropdownMenuPopup$lambda$12$lambda$11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.DisposableEffect(popupPositionProvider2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, (i5 >> 3) & 14);
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2000584211, "CC(remember):ExposedDropdownMenuPopup.android.kt#9igjgp");
            boolean changedInstance4 = startRestartGroup.changedInstance(popupLayout2);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit ExposedDropdownMenuPopup$lambda$15$lambda$14;
                        ExposedDropdownMenuPopup$lambda$15$lambda$14 = ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup$lambda$15$lambda$14(PopupLayout.this, (LayoutCoordinates) obj);
                        return ExposedDropdownMenuPopup$lambda$15$lambda$14;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) rememberedValue6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2000568542, "CC(remember):ExposedDropdownMenuPopup.android.kt#9igjgp");
            boolean changedInstance5 = startRestartGroup.changedInstance(popupLayout2) | startRestartGroup.changed(layoutDirection2.ordinal());
            ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1 rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1(popupLayout2, layoutDirection);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned);
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
            Updater.m4983setimpl(m4976constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -88834835, "C:ExposedDropdownMenuPopup.android.kt#mnwmf7");
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            function03 = function02;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExposedDropdownMenuPopup$lambda$17;
                    ExposedDropdownMenuPopup$lambda$17 = ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup$lambda$17(Function0.this, popupPositionProvider2, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ExposedDropdownMenuPopup$lambda$17;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ExposedDropdownMenuPopup$lambda$7$lambda$6(final PopupLayout popupLayout, Function0 function0, String str, LayoutDirection layoutDirection, DisposableEffectScope disposableEffectScope) {
        popupLayout.show();
        popupLayout.updateParameters(function0, str, layoutDirection);
        return new DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$lambda$7$lambda$6$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                PopupLayout.this.disposeComposition();
                PopupLayout.this.dismiss();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenuPopup$lambda$9$lambda$8(PopupLayout popupLayout, Function0 function0, String str, LayoutDirection layoutDirection) {
        popupLayout.updateParameters(function0, str, layoutDirection);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ExposedDropdownMenuPopup$lambda$12$lambda$11(PopupLayout popupLayout, PopupPositionProvider popupPositionProvider, DisposableEffectScope disposableEffectScope) {
        popupLayout.setPositionProvider(popupPositionProvider);
        popupLayout.updatePosition();
        return new DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$lambda$12$lambda$11$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenuPopup$lambda$15$lambda$14(PopupLayout popupLayout, LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        Intrinsics.checkNotNull(parentLayoutCoordinates);
        long mo7083getSizeYbymL2g = parentLayoutCoordinates.mo7083getSizeYbymL2g();
        long positionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
        popupLayout.setParentBounds(IntRectKt.m8562IntRectVbeCjmY(IntOffset.m8523constructorimpl((MathKt.roundToInt(Float.intBitsToFloat((int) (positionInWindow >> 32))) << 32) | (4294967295L & MathKt.roundToInt(Float.intBitsToFloat((int) (positionInWindow & 4294967295L))))), mo7083getSizeYbymL2g));
        popupLayout.updatePosition();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String LocalPopupTestTag$lambda$18() {
        return "DEFAULT_TEST_TAG";
    }

    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }

    private static final void SimpleStack(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -780896836, "CC(SimpleStack)N(modifier,content)175@6840L896,175@6793L943:ExposedDropdownMenuPopup.android.kt#mnwmf7");
        ComposerKt.sourceInformationMarkerStart(composer, 1177424348, "CC(remember):ExposedDropdownMenuPopup.android.kt#9igjgp");
        ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1 rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1.INSTANCE;
            composer.updateRememberedValue(rememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        int i2 = ((i << 3) & 112) | ((i >> 3) & 14) | 384;
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        int i3 = ((i2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
        Updater.m4983setimpl(m4976constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        function2.invoke(composer, Integer.valueOf((i3 >> 6) & 14));
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> ExposedDropdownMenuPopup$lambda$0(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }
}
