package com.composables.core;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.profileinstaller.ProfileVerifier;
import com.composeunstyled.UtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: deprecated.Menu.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class Deprecated_MenuKt$MenuContent$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Function2<Composer, Integer, Unit> $contents;
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;
    final /* synthetic */ MutableTransitionState<Boolean> $expandedState;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ MenuScope $this_MenuContent;

    /* JADX WARN: Multi-variable type inference failed */
    Deprecated_MenuKt$MenuContent$2(MenuScope menuScope, MutableTransitionState<Boolean> mutableTransitionState, EnterTransition enterTransition, ExitTransition exitTransition, Modifier modifier, Shape shape, long j, PaddingValues paddingValues, long j2, Function2<? super Composer, ? super Integer, Unit> function2) {
        this.$this_MenuContent = menuScope;
        this.$expandedState = mutableTransitionState;
        this.$enter = enterTransition;
        this.$exit = exitTransition;
        this.$modifier = modifier;
        this.$shape = shape;
        this.$backgroundColor = j;
        this.$contentPadding = paddingValues;
        this.$contentColor = j2;
        this.$contents = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-173438108, i, -1, "com.composables.core.MenuContent.<anonymous> (deprecated.Menu.kt:273)");
        }
        MenuState menuState$core_release = this.$this_MenuContent.getMenuState$core_release();
        ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localFocusManager);
        ComposerKt.sourceInformationMarkerEnd(composer);
        menuState$core_release.setCurrentFocusManager$core_release((FocusManager) consume);
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(5004770);
        boolean changed = composer.changed(this.$this_MenuContent);
        final MenuScope menuScope = this.$this_MenuContent;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: com.composables.core.Deprecated_MenuKt$MenuContent$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = Deprecated_MenuKt$MenuContent$2.invoke$lambda$1$lambda$0(MenuScope.this, (FocusState) obj);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(companion, (Function1) rememberedValue);
        composer.startReplaceGroup(5004770);
        boolean changed2 = composer.changed(this.$this_MenuContent);
        final MenuScope menuScope2 = this.$this_MenuContent;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composables.core.Deprecated_MenuKt$MenuContent$2$2$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m9367invokeZmokQxo(keyEvent.m6792unboximpl());
                }

                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m9367invokeZmokQxo(android.view.KeyEvent event) {
                    Intrinsics.checkNotNullParameter(event, "event");
                    boolean z = false;
                    if (!KeyEventType.m6796equalsimpl0(KeyEvent_androidKt.m6804getTypeZmokQxo(event), KeyEventType.INSTANCE.m6800getKeyDownCS__XNY())) {
                        return false;
                    }
                    long m6803getKeyZmokQxo = KeyEvent_androidKt.m6803getKeyZmokQxo(event);
                    if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                        FocusManager currentFocusManager$core_release = MenuScope.this.getMenuState$core_release().getCurrentFocusManager$core_release();
                        Intrinsics.checkNotNull(currentFocusManager$core_release);
                        currentFocusManager$core_release.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5300getNextdhqQ8s());
                    } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6573getDirectionUpEK5gGoQ())) {
                        FocusManager currentFocusManager$core_release2 = MenuScope.this.getMenuState$core_release().getCurrentFocusManager$core_release();
                        Intrinsics.checkNotNull(currentFocusManager$core_release2);
                        currentFocusManager$core_release2.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5301getPreviousdhqQ8s());
                    } else {
                        if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6584getEscapeEK5gGoQ())) {
                            MenuScope.this.getMenuState$core_release().setExpanded(false);
                        }
                        return Boolean.valueOf(z);
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(onFocusChanged, (Function1) rememberedValue2);
        MutableTransitionState<Boolean> mutableTransitionState = this.$expandedState;
        EnterTransition enterTransition = this.$enter;
        ExitTransition exitTransition = this.$exit;
        final Modifier modifier = this.$modifier;
        final MenuScope menuScope3 = this.$this_MenuContent;
        final Shape shape = this.$shape;
        final long j = this.$backgroundColor;
        final PaddingValues paddingValues = this.$contentPadding;
        final long j2 = this.$contentColor;
        final Function2<Composer, Integer, Unit> function2 = this.$contents;
        AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, onKeyEvent, enterTransition, exitTransition, (String) null, ComposableLambdaKt.rememberComposableLambda(1517915708, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composables.core.Deprecated_MenuKt$MenuContent$2.3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1517915708, i2, -1, "com.composables.core.MenuContent.<anonymous>.<anonymous> (deprecated.Menu.kt:303)");
                }
                Modifier padding = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(FocusRequesterModifierKt.focusRequester(Modifier.this, menuScope3.getMenuState$core_release().getMenuFocusRequester()), shape), j, null, 2, null), paddingValues);
                MenuScope menuScope4 = menuScope3;
                long j3 = j2;
                final Function2<Composer, Integer, Unit> function22 = function2;
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, padding);
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
                Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Unit unit = Unit.INSTANCE;
                composer2.startReplaceGroup(5004770);
                boolean changed3 = composer2.changed(menuScope4);
                Object rememberedValue3 = composer2.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (Function2) new Deprecated_MenuKt$MenuContent$2$3$1$1$1(menuScope4, null);
                    composer2.updateRememberedValue(rememberedValue3);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, composer2, 6);
                CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j3)), ComposableLambdaKt.rememberComposableLambda(67904754, true, new Function2<Composer, Integer, Unit>() { // from class: com.composables.core.Deprecated_MenuKt$MenuContent$2$3$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i3) {
                        if ((i3 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(67904754, i3, -1, "com.composables.core.MenuContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (deprecated.Menu.kt:314)");
                        }
                        function22.invoke(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MenuScope menuScope, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        menuScope.getMenuState$core_release().setHasMenuFocus$core_release(it.getHasFocus());
        return Unit.INSTANCE;
    }
}
