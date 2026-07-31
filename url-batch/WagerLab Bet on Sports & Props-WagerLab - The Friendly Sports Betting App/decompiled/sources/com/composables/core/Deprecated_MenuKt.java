package com.composables.core;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.composeunstyled.ButtonKt;
import com.composeunstyled.UtilsKt;
import com.facebook.react.uimanager.ViewProps;
import io.branch.referral.BranchError;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: deprecated.Menu.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a \u0001\u0010\u0010\u001a\u00020\u0001*\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\u00010%¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b&\u0010'\u001av\u0010(\u001a\u00020\u0001*\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\u00010%¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b/\u00100\u001a¥\u0001\u00101\u001a\u00020\u0001*\u00020\b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010%2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b5\u00106¨\u00067"}, d2 = {"Menu", "", "state", "Lcom/composables/core/MenuState;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Lcom/composables/core/MenuScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lcom/composables/core/MenuState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rememberMenuState", "expanded", "", "(ZLandroidx/compose/runtime/Composer;II)Lcom/composables/core/MenuState;", "MenuButton", "mutableInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", ViewProps.ENABLED, "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", ViewProps.BORDER_COLOR, ViewProps.BORDER_WIDTH, "Landroidx/compose/ui/unit/Dp;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "contents", "Lkotlin/Function0;", "MenuButton-78jW_7k", "(Lcom/composables/core/MenuScope;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/layout/PaddingValues;JFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "MenuContent", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "MenuContent-ElI5-7k", "(Lcom/composables/core/MenuScope;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "MenuItem", ViewProps.ON_CLICK, "interactionSource", "Landroidx/compose/foundation/layout/RowScope;", "MenuItem-dOtcBKo", "(Lcom/composables/core/MenuScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Deprecated_MenuKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Menu$lambda$3(MenuState menuState, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        Menu(menuState, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuButton_78jW_7k$lambda$7(MenuScope menuScope, Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, Shape shape, long j, long j2, PaddingValues paddingValues, long j3, float f, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        m9362MenuButton78jW_7k(menuScope, modifier, mutableInteractionSource, indication, z, shape, j, j2, paddingValues, j3, f, horizontal, vertical, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuContent_ElI5_7k$lambda$11(MenuScope menuScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Alignment.Horizontal horizontal, Shape shape, long j, long j2, PaddingValues paddingValues, Function2 function2, int i, int i2, Composer composer, int i3) {
        m9363MenuContentElI57k(menuScope, modifier, enterTransition, exitTransition, horizontal, shape, j, j2, paddingValues, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuItem_dOtcBKo$lambda$14(MenuScope menuScope, Function0 function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, PaddingValues paddingValues, Shape shape, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, long j, long j2, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        m9364MenuItemdOtcBKo(menuScope, function0, modifier, z, mutableInteractionSource, indication, paddingValues, shape, horizontal, vertical, j, j2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    @Deprecated(message = "Switch to DropdownMenu")
    public static final void Menu(final MenuState state, Modifier modifier, final Function3<? super MenuScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-297364446);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-297364446, i3, -1, "com.composables.core.Menu (deprecated.Menu.kt:85)");
            }
            boolean expanded = state.getExpanded();
            startRestartGroup.startReplaceGroup(5004770);
            boolean changed = startRestartGroup.changed(expanded);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MenuScope(state);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MenuScope menuScope = (MenuScope) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            boolean changed2 = startRestartGroup.changed(menuScope);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composables.core.Deprecated_MenuKt$Menu$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m9365invokeZmokQxo(keyEvent.m6792unboximpl());
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m9365invokeZmokQxo(android.view.KeyEvent event) {
                        Intrinsics.checkNotNullParameter(event, "event");
                        boolean z = false;
                        if (!KeyEventType.m6796equalsimpl0(KeyEvent_androidKt.m6804getTypeZmokQxo(event), KeyEventType.INSTANCE.m6800getKeyDownCS__XNY())) {
                            return false;
                        }
                        if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6568getDirectionDownEK5gGoQ()) && !MenuScope.this.getMenuState$core_release().getExpanded()) {
                            z = true;
                            MenuScope.this.getMenuState$core_release().setExpanded(true);
                        }
                        return Boolean.valueOf(z);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(modifier, (Function1) rememberedValue2);
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
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            state.setCurrentFocusManager$core_release((FocusManager) consume);
            content.invoke(menuScope, startRestartGroup, Integer.valueOf((i3 >> 3) & 112));
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
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Menu$lambda$3;
                    Menu$lambda$3 = Deprecated_MenuKt.Menu$lambda$3(MenuState.this, modifier2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return Menu$lambda$3;
                }
            });
        }
    }

    @Deprecated(message = "Switch to DropdownMenu")
    public static final MenuState rememberMenuState(boolean z, Composer composer, int i, int i2) {
        composer.startReplaceGroup(649898435);
        if ((i2 & 1) != 0) {
            z = false;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(649898435, i, -1, "com.composables.core.rememberMenuState (deprecated.Menu.kt:119)");
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new MenuState(z);
            composer.updateRememberedValue(rememberedValue);
        }
        MenuState menuState = (MenuState) rememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return menuState;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023a  */
    @Deprecated(message = "Switch to DropdownMenu")
    /* renamed from: MenuButton-78jW_7k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9362MenuButton78jW_7k(final MenuScope MenuButton, Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, Shape shape, long j, long j2, PaddingValues paddingValues, long j3, float f, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, final Function2<? super Composer, ? super Integer, Unit> contents, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Indication indication2;
        int i6;
        boolean z2;
        int i7;
        Shape shape2;
        int i8;
        int i9;
        long j4;
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
        Alignment.Vertical vertical2;
        long j5;
        Arrangement.HorizontalOrVertical center;
        Alignment.Vertical vertical3;
        Shape shape3;
        float f2;
        long j6;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication3;
        PaddingValues paddingValues2;
        boolean z3;
        long j7;
        Modifier modifier3;
        boolean z4;
        Object rememberedValue;
        Composer composer2;
        final boolean z5;
        final Shape shape4;
        final long j8;
        final long j9;
        final PaddingValues paddingValues3;
        final long j10;
        final float f3;
        final Modifier modifier4;
        final Indication indication4;
        final MutableInteractionSource mutableInteractionSource3;
        final Arrangement.Horizontal horizontal2;
        final Alignment.Vertical vertical4;
        ScopeUpdateScope endRestartGroup;
        int i20;
        int i21;
        int i22;
        Intrinsics.checkNotNullParameter(MenuButton, "$this$MenuButton");
        Intrinsics.checkNotNullParameter(contents, "contents");
        Composer startRestartGroup = composer.startRestartGroup(-1172212698);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(MenuButton) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i23 = i3 & 1;
        if (i23 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 2;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i3 & 4) == 0) {
                        indication2 = indication;
                        if (startRestartGroup.changed(indication2)) {
                            i22 = 2048;
                            i4 |= i22;
                        }
                    } else {
                        indication2 = indication;
                    }
                    i22 = 1024;
                    i4 |= i22;
                } else {
                    indication2 = indication;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    z2 = z;
                    i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        shape2 = shape;
                    } else {
                        shape2 = shape;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(shape2) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        i9 = i23;
                        j4 = j;
                    } else {
                        i9 = i23;
                        j4 = j;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(j4) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 64) == 0) {
                            i20 = i4;
                            if (startRestartGroup.changed(j2)) {
                                i21 = 8388608;
                                i10 = i20 | i21;
                            }
                        } else {
                            i20 = i4;
                        }
                        i21 = 4194304;
                        i10 = i20 | i21;
                    } else {
                        i10 = i4;
                    }
                    i11 = i3 & 128;
                    if (i11 == 0) {
                        i10 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i10 |= startRestartGroup.changed(paddingValues) ? 67108864 : 33554432;
                    }
                    i12 = i3 & 256;
                    if (i12 == 0) {
                        i10 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i10 |= startRestartGroup.changed(j3) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                    }
                    i13 = i10;
                    i14 = i3 & 512;
                    if (i14 == 0) {
                        i16 = i2 | 6;
                        i15 = i14;
                    } else if ((i2 & 6) == 0) {
                        i15 = i14;
                        i16 = i2 | (startRestartGroup.changed(f) ? 4 : 2);
                    } else {
                        i15 = i14;
                        i16 = i2;
                    }
                    i17 = i3 & 1024;
                    if (i17 == 0) {
                        i16 |= 48;
                        i18 = i17;
                    } else if ((i2 & 48) == 0) {
                        i18 = i17;
                        i16 |= startRestartGroup.changed(horizontal) ? 32 : 16;
                    } else {
                        i18 = i17;
                    }
                    int i24 = i16;
                    i19 = i3 & 2048;
                    if (i19 == 0) {
                        i24 |= 384;
                    } else if ((i2 & 384) == 0) {
                        vertical2 = vertical;
                        i24 |= startRestartGroup.changed(vertical2) ? 256 : 128;
                        if ((i3 & 4096) != 0) {
                            i24 |= 3072;
                        } else if ((i2 & 3072) == 0) {
                            i24 |= startRestartGroup.changedInstance(contents) ? 2048 : 1024;
                        }
                        if ((306783379 & i13) == 306783378 || (i24 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i9 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                MutableInteractionSource mutableInteractionSource4 = i5 != 0 ? null : mutableInteractionSource;
                                if ((i3 & 4) != 0) {
                                    ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localIndication);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    indication2 = (Indication) consume;
                                    i13 &= -7169;
                                }
                                if (i6 != 0) {
                                    z2 = true;
                                }
                                Shape rectangleShape = i7 != 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                                if (i8 != 0) {
                                    j4 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                                }
                                if ((i3 & 64) != 0) {
                                    ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                                    int i25 = i13;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    j5 = ((Color) consume2).m5667unboximpl();
                                    i13 = i25 & (-29360129);
                                } else {
                                    j5 = j2;
                                }
                                PaddingValues noPadding = i11 != 0 ? UtilsKt.getNoPadding() : paddingValues;
                                long m5693getUnspecified0d7_KjU = i12 != 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j3;
                                float m8401constructorimpl = i15 != 0 ? Dp.m8401constructorimpl(0) : f;
                                center = i18 != 0 ? Arrangement.INSTANCE.getCenter() : horizontal;
                                if (i19 != 0) {
                                    vertical2 = Alignment.INSTANCE.getCenterVertically();
                                }
                                vertical3 = vertical2;
                                shape3 = rectangleShape;
                                f2 = m8401constructorimpl;
                                j6 = m5693getUnspecified0d7_KjU;
                                mutableInteractionSource2 = mutableInteractionSource4;
                                indication3 = indication2;
                                Modifier modifier5 = modifier2;
                                paddingValues2 = noPadding;
                                z3 = z2;
                                j7 = j5;
                                modifier3 = modifier5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i13 &= -7169;
                                }
                                if ((i3 & 64) != 0) {
                                    i13 &= -29360129;
                                }
                                mutableInteractionSource2 = mutableInteractionSource;
                                f2 = f;
                                center = horizontal;
                                vertical3 = vertical2;
                                indication3 = indication2;
                                z3 = z2;
                                modifier3 = modifier2;
                                shape3 = shape2;
                                j7 = j2;
                                paddingValues2 = paddingValues;
                                j6 = j3;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1172212698, i13, i24, "com.composables.core.MenuButton (deprecated.Menu.kt:156)");
                            }
                            int m7585getDropdownListo7Vup1c = Role.INSTANCE.m7585getDropdownListo7Vup1c();
                            startRestartGroup.startReplaceGroup(5004770);
                            z4 = (i13 & 14) == 4;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit MenuButton_78jW_7k$lambda$6$lambda$5;
                                        MenuButton_78jW_7k$lambda$6$lambda$5 = Deprecated_MenuKt.MenuButton_78jW_7k$lambda$6$lambda$5(MenuScope.this);
                                        return MenuButton_78jW_7k$lambda$6$lambda$5;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            int i26 = i13;
                            int i27 = i26 >> 9;
                            int i28 = i24 << 3;
                            composer2 = startRestartGroup;
                            ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, z3, shape3, j4, j7, paddingValues2, j6, f2, modifier3, m7585getDropdownListo7Vup1c, indication3, mutableInteractionSource2, center, vertical3, ComposableLambdaKt.rememberComposableLambda(-1434505100, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composables.core.Deprecated_MenuKt$MenuButton$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Button, Composer composer3, int i29) {
                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                    if ((i29 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1434505100, i29, -1, "com.composables.core.MenuButton.<anonymous> (deprecated.Menu.kt:173)");
                                    }
                                    contents.invoke(composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), composer2, (4194288 & i27) | ((i24 << 21) & 29360128) | ((i26 << 21) & 234881024), (i27 & 14) | 24576 | ((i26 >> 3) & 112) | (i28 & 896) | (i28 & 7168), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z3;
                            shape4 = shape3;
                            j8 = j4;
                            j9 = j7;
                            paddingValues3 = paddingValues2;
                            j10 = j6;
                            f3 = f2;
                            modifier4 = modifier3;
                            indication4 = indication3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            horizontal2 = center;
                            vertical4 = vertical3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            mutableInteractionSource3 = mutableInteractionSource;
                            f3 = f;
                            composer2 = startRestartGroup;
                            vertical4 = vertical2;
                            j8 = j4;
                            indication4 = indication2;
                            z5 = z2;
                            modifier4 = modifier2;
                            shape4 = shape2;
                            j9 = j2;
                            paddingValues3 = paddingValues;
                            j10 = j3;
                            horizontal2 = horizontal;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit MenuButton_78jW_7k$lambda$7;
                                    MenuButton_78jW_7k$lambda$7 = Deprecated_MenuKt.MenuButton_78jW_7k$lambda$7(MenuScope.this, modifier4, mutableInteractionSource3, indication4, z5, shape4, j8, j9, paddingValues3, j10, f3, horizontal2, vertical4, contents, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return MenuButton_78jW_7k$lambda$7;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    vertical2 = vertical;
                    if ((i3 & 4096) != 0) {
                    }
                    if ((306783379 & i13) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    vertical3 = vertical2;
                    shape3 = rectangleShape;
                    f2 = m8401constructorimpl;
                    j6 = m5693getUnspecified0d7_KjU;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    indication3 = indication2;
                    Modifier modifier52 = modifier2;
                    paddingValues2 = noPadding;
                    z3 = z2;
                    j7 = j5;
                    modifier3 = modifier52;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int m7585getDropdownListo7Vup1c2 = Role.INSTANCE.m7585getDropdownListo7Vup1c();
                    startRestartGroup.startReplaceGroup(5004770);
                    if ((i13 & 14) == 4) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z4) {
                    }
                    rememberedValue = new Function0() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit MenuButton_78jW_7k$lambda$6$lambda$5;
                            MenuButton_78jW_7k$lambda$6$lambda$5 = Deprecated_MenuKt.MenuButton_78jW_7k$lambda$6$lambda$5(MenuScope.this);
                            return MenuButton_78jW_7k$lambda$6$lambda$5;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    int i262 = i13;
                    int i272 = i262 >> 9;
                    int i282 = i24 << 3;
                    composer2 = startRestartGroup;
                    ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, z3, shape3, j4, j7, paddingValues2, j6, f2, modifier3, m7585getDropdownListo7Vup1c2, indication3, mutableInteractionSource2, center, vertical3, ComposableLambdaKt.rememberComposableLambda(-1434505100, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composables.core.Deprecated_MenuKt$MenuButton$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                            invoke(rowScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope Button, Composer composer3, int i29) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i29 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1434505100, i29, -1, "com.composables.core.MenuButton.<anonymous> (deprecated.Menu.kt:173)");
                            }
                            contents.invoke(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), composer2, (4194288 & i272) | ((i24 << 21) & 29360128) | ((i262 << 21) & 234881024), (i272 & 14) | 24576 | ((i262 >> 3) & 112) | (i282 & 896) | (i282 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z3;
                    shape4 = shape3;
                    j8 = j4;
                    j9 = j7;
                    paddingValues3 = paddingValues2;
                    j10 = j6;
                    f3 = f2;
                    modifier4 = modifier3;
                    indication4 = indication3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    horizontal2 = center;
                    vertical4 = vertical3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i11 = i3 & 128;
                if (i11 == 0) {
                }
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i10;
                i14 = i3 & 512;
                if (i14 == 0) {
                }
                i17 = i3 & 1024;
                if (i17 == 0) {
                }
                int i242 = i16;
                i19 = i3 & 2048;
                if (i19 == 0) {
                }
                vertical2 = vertical;
                if ((i3 & 4096) != 0) {
                }
                if ((306783379 & i13) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i15 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                vertical3 = vertical2;
                shape3 = rectangleShape;
                f2 = m8401constructorimpl;
                j6 = m5693getUnspecified0d7_KjU;
                mutableInteractionSource2 = mutableInteractionSource4;
                indication3 = indication2;
                Modifier modifier522 = modifier2;
                paddingValues2 = noPadding;
                z3 = z2;
                j7 = j5;
                modifier3 = modifier522;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int m7585getDropdownListo7Vup1c22 = Role.INSTANCE.m7585getDropdownListo7Vup1c();
                startRestartGroup.startReplaceGroup(5004770);
                if ((i13 & 14) == 4) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                rememberedValue = new Function0() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MenuButton_78jW_7k$lambda$6$lambda$5;
                        MenuButton_78jW_7k$lambda$6$lambda$5 = Deprecated_MenuKt.MenuButton_78jW_7k$lambda$6$lambda$5(MenuScope.this);
                        return MenuButton_78jW_7k$lambda$6$lambda$5;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                int i2622 = i13;
                int i2722 = i2622 >> 9;
                int i2822 = i242 << 3;
                composer2 = startRestartGroup;
                ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, z3, shape3, j4, j7, paddingValues2, j6, f2, modifier3, m7585getDropdownListo7Vup1c22, indication3, mutableInteractionSource2, center, vertical3, ComposableLambdaKt.rememberComposableLambda(-1434505100, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composables.core.Deprecated_MenuKt$MenuButton$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer3, int i29) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i29 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1434505100, i29, -1, "com.composables.core.MenuButton.<anonymous> (deprecated.Menu.kt:173)");
                        }
                        contents.invoke(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), composer2, (4194288 & i2722) | ((i242 << 21) & 29360128) | ((i2622 << 21) & 234881024), (i2722 & 14) | 24576 | ((i2622 >> 3) & 112) | (i2822 & 896) | (i2822 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z3;
                shape4 = shape3;
                j8 = j4;
                j9 = j7;
                paddingValues3 = paddingValues2;
                j10 = j6;
                f3 = f2;
                modifier4 = modifier3;
                indication4 = indication3;
                mutableInteractionSource3 = mutableInteractionSource2;
                horizontal2 = center;
                vertical4 = vertical3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i & 3072) == 0) {
            }
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z2 = z;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i11 = i3 & 128;
            if (i11 == 0) {
            }
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i10;
            i14 = i3 & 512;
            if (i14 == 0) {
            }
            i17 = i3 & 1024;
            if (i17 == 0) {
            }
            int i2422 = i16;
            i19 = i3 & 2048;
            if (i19 == 0) {
            }
            vertical2 = vertical;
            if ((i3 & 4096) != 0) {
            }
            if ((306783379 & i13) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i15 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            vertical3 = vertical2;
            shape3 = rectangleShape;
            f2 = m8401constructorimpl;
            j6 = m5693getUnspecified0d7_KjU;
            mutableInteractionSource2 = mutableInteractionSource4;
            indication3 = indication2;
            Modifier modifier5222 = modifier2;
            paddingValues2 = noPadding;
            z3 = z2;
            j7 = j5;
            modifier3 = modifier5222;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int m7585getDropdownListo7Vup1c222 = Role.INSTANCE.m7585getDropdownListo7Vup1c();
            startRestartGroup.startReplaceGroup(5004770);
            if ((i13 & 14) == 4) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue = new Function0() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit MenuButton_78jW_7k$lambda$6$lambda$5;
                    MenuButton_78jW_7k$lambda$6$lambda$5 = Deprecated_MenuKt.MenuButton_78jW_7k$lambda$6$lambda$5(MenuScope.this);
                    return MenuButton_78jW_7k$lambda$6$lambda$5;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            int i26222 = i13;
            int i27222 = i26222 >> 9;
            int i28222 = i2422 << 3;
            composer2 = startRestartGroup;
            ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, z3, shape3, j4, j7, paddingValues2, j6, f2, modifier3, m7585getDropdownListo7Vup1c222, indication3, mutableInteractionSource2, center, vertical3, ComposableLambdaKt.rememberComposableLambda(-1434505100, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composables.core.Deprecated_MenuKt$MenuButton$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer3, int i29) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i29 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1434505100, i29, -1, "com.composables.core.MenuButton.<anonymous> (deprecated.Menu.kt:173)");
                    }
                    contents.invoke(composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), composer2, (4194288 & i27222) | ((i2422 << 21) & 29360128) | ((i26222 << 21) & 234881024), (i27222 & 14) | 24576 | ((i26222 >> 3) & 112) | (i28222 & 896) | (i28222 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z3;
            shape4 = shape3;
            j8 = j4;
            j9 = j7;
            paddingValues3 = paddingValues2;
            j10 = j6;
            f3 = f2;
            modifier4 = modifier3;
            indication4 = indication3;
            mutableInteractionSource3 = mutableInteractionSource2;
            horizontal2 = center;
            vertical4 = vertical3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 2;
        if (i5 == 0) {
        }
        if ((i & 3072) == 0) {
        }
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z2 = z;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i11 = i3 & 128;
        if (i11 == 0) {
        }
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i10;
        i14 = i3 & 512;
        if (i14 == 0) {
        }
        i17 = i3 & 1024;
        if (i17 == 0) {
        }
        int i24222 = i16;
        i19 = i3 & 2048;
        if (i19 == 0) {
        }
        vertical2 = vertical;
        if ((i3 & 4096) != 0) {
        }
        if ((306783379 & i13) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i15 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        vertical3 = vertical2;
        shape3 = rectangleShape;
        f2 = m8401constructorimpl;
        j6 = m5693getUnspecified0d7_KjU;
        mutableInteractionSource2 = mutableInteractionSource4;
        indication3 = indication2;
        Modifier modifier52222 = modifier2;
        paddingValues2 = noPadding;
        z3 = z2;
        j7 = j5;
        modifier3 = modifier52222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int m7585getDropdownListo7Vup1c2222 = Role.INSTANCE.m7585getDropdownListo7Vup1c();
        startRestartGroup.startReplaceGroup(5004770);
        if ((i13 & 14) == 4) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue = new Function0() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit MenuButton_78jW_7k$lambda$6$lambda$5;
                MenuButton_78jW_7k$lambda$6$lambda$5 = Deprecated_MenuKt.MenuButton_78jW_7k$lambda$6$lambda$5(MenuScope.this);
                return MenuButton_78jW_7k$lambda$6$lambda$5;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        int i262222 = i13;
        int i272222 = i262222 >> 9;
        int i282222 = i24222 << 3;
        composer2 = startRestartGroup;
        ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, z3, shape3, j4, j7, paddingValues2, j6, f2, modifier3, m7585getDropdownListo7Vup1c2222, indication3, mutableInteractionSource2, center, vertical3, ComposableLambdaKt.rememberComposableLambda(-1434505100, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composables.core.Deprecated_MenuKt$MenuButton$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                invoke(rowScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope Button, Composer composer3, int i29) {
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i29 & 17) == 16 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1434505100, i29, -1, "com.composables.core.MenuButton.<anonymous> (deprecated.Menu.kt:173)");
                }
                contents.invoke(composer3, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), composer2, (4194288 & i272222) | ((i24222 << 21) & 29360128) | ((i262222 << 21) & 234881024), (i272222 & 14) | 24576 | ((i262222 >> 3) & 112) | (i282222 & 896) | (i282222 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z3;
        shape4 = shape3;
        j8 = j4;
        j9 = j7;
        paddingValues3 = paddingValues2;
        j10 = j6;
        f3 = f2;
        modifier4 = modifier3;
        indication4 = indication3;
        mutableInteractionSource3 = mutableInteractionSource2;
        horizontal2 = center;
        vertical4 = vertical3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuButton_78jW_7k$lambda$6$lambda$5(MenuScope menuScope) {
        menuScope.getMenuState$core_release().setExpanded(!menuScope.getMenuState$core_release().getExpanded());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a7  */
    @Deprecated(message = "Switch to DropdownMenu")
    /* renamed from: MenuContent-ElI5-7k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9363MenuContentElI57k(final MenuScope MenuContent, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Alignment.Horizontal horizontal, Shape shape, long j, long j2, PaddingValues paddingValues, final Function2<? super Composer, ? super Integer, Unit> contents, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        Alignment.Horizontal horizontal2;
        int i7;
        Shape shape2;
        int i8;
        int i9;
        long j3;
        final Shape shape3;
        EnterTransition enterTransition3;
        ExitTransition exitTransition3;
        int i10;
        Alignment.Horizontal horizontal3;
        final long j4;
        PaddingValues noPadding;
        EnterTransition enterTransition4;
        ExitTransition exitTransition4;
        Modifier modifier3;
        Object rememberedValue;
        MutableTransitionState mutableTransitionState;
        int i11;
        boolean z;
        Object rememberedValue2;
        final MenuScope menuScope;
        final ExitTransition exitTransition5;
        Modifier modifier4;
        final EnterTransition enterTransition5;
        Composer composer2;
        final PaddingValues paddingValues2;
        final long j5;
        final Modifier modifier5;
        final Alignment.Horizontal horizontal4;
        Intrinsics.checkNotNullParameter(MenuContent, "$this$MenuContent");
        Intrinsics.checkNotNullParameter(contents, "contents");
        Composer startRestartGroup = composer.startRestartGroup(-76723395);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(MenuContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 1;
        if (i12 != 0) {
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
                        horizontal2 = horizontal;
                        i3 |= startRestartGroup.changed(horizontal2) ? 16384 : 8192;
                        i7 = i2 & 16;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            shape2 = shape;
                        } else {
                            shape2 = shape;
                            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i3 |= startRestartGroup.changed(shape2) ? 131072 : 65536;
                            }
                        }
                        i8 = i2 & 32;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(j) ? 1048576 : 524288;
                        }
                        if ((i & 12582912) == 0) {
                            i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304;
                        }
                        i9 = i2 & 128;
                        if (i9 != 0) {
                            i3 |= 100663296;
                        } else if ((100663296 & i) == 0) {
                            i3 |= startRestartGroup.changed(paddingValues) ? 67108864 : 33554432;
                            if ((i2 & 256) == 0) {
                                i3 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i3 |= startRestartGroup.changedInstance(contents) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            }
                            if ((306783379 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i12 == 0 ? Modifier.INSTANCE : modifier2;
                                    EnterTransition appearInstantly = i4 == 0 ? UtilsKt.getAppearInstantly() : enterTransition2;
                                    ExitTransition disappearInstantly = i5 == 0 ? UtilsKt.getDisappearInstantly() : exitTransition2;
                                    Alignment.Horizontal start = i6 == 0 ? Alignment.INSTANCE.getStart() : horizontal2;
                                    if (i7 != 0) {
                                        shape2 = RectangleShapeKt.getRectangleShape();
                                    }
                                    long m5693getUnspecified0d7_KjU = i8 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j;
                                    if ((i2 & 64) == 0) {
                                        ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localContentColor);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        j3 = ((Color) consume).m5667unboximpl();
                                        i3 &= -29360129;
                                    } else {
                                        j3 = j2;
                                    }
                                    if (i9 == 0) {
                                        ExitTransition exitTransition6 = disappearInstantly;
                                        shape3 = shape2;
                                        enterTransition3 = appearInstantly;
                                        modifier2 = companion;
                                        exitTransition3 = exitTransition6;
                                        i10 = i3;
                                        horizontal3 = start;
                                        j4 = m5693getUnspecified0d7_KjU;
                                        noPadding = UtilsKt.getNoPadding();
                                        startRestartGroup.endDefaults();
                                        enterTransition4 = enterTransition3;
                                        if (ComposerKt.isTraceInProgress()) {
                                            exitTransition4 = exitTransition3;
                                            modifier3 = modifier2;
                                        } else {
                                            exitTransition4 = exitTransition3;
                                            modifier3 = modifier2;
                                            ComposerKt.traceEventStart(-76723395, i10, -1, "com.composables.core.MenuContent (deprecated.Menu.kt:255)");
                                        }
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume2 = startRestartGroup.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        MenuContentPositionProvider menuContentPositionProvider = new MenuContentPositionProvider((Density) consume2, horizontal3);
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = new MutableTransitionState(false);
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        mutableTransitionState = (MutableTransitionState) rememberedValue;
                                        startRestartGroup.endReplaceGroup();
                                        mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(MenuContent.getMenuState$core_release().getExpanded()));
                                        MenuState menuState$core_release = MenuContent.getMenuState$core_release();
                                        i11 = i10;
                                        ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                                        Alignment.Horizontal horizontal5 = horizontal3;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume3 = startRestartGroup.consume(localFocusManager);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        menuState$core_release.setCurrentFocusManager$core_release((FocusManager) consume3);
                                        if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue() && !((Boolean) mutableTransitionState.getTargetState()).booleanValue() && mutableTransitionState.isIdle()) {
                                            enterTransition5 = enterTransition4;
                                            exitTransition5 = exitTransition4;
                                            modifier4 = modifier3;
                                            composer2 = startRestartGroup;
                                        } else {
                                            PopupProperties popupProperties = new PopupProperties(true, true, true, false, 8, (DefaultConstructorMarker) null);
                                            MenuContentPositionProvider menuContentPositionProvider2 = menuContentPositionProvider;
                                            startRestartGroup.startReplaceGroup(5004770);
                                            z = (i11 & 14) == 4;
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (!z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                menuScope = MenuContent;
                                                rememberedValue2 = new Function0() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit MenuContent_ElI5_7k$lambda$10$lambda$9;
                                                        MenuContent_ElI5_7k$lambda$10$lambda$9 = Deprecated_MenuKt.MenuContent_ElI5_7k$lambda$10$lambda$9(MenuScope.this);
                                                        return MenuContent_ElI5_7k$lambda$10$lambda$9;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                            } else {
                                                menuScope = MenuContent;
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            exitTransition5 = exitTransition4;
                                            modifier4 = modifier3;
                                            enterTransition5 = enterTransition4;
                                            AndroidPopup_androidKt.Popup(menuContentPositionProvider2, (Function0) rememberedValue2, popupProperties, ComposableLambdaKt.rememberComposableLambda(-173438108, true, new Deprecated_MenuKt$MenuContent$2(menuScope, mutableTransitionState, enterTransition5, exitTransition5, modifier4, shape3, j4, noPadding, j3, contents), startRestartGroup, 54), startRestartGroup, 3456, 0);
                                            composer2 = startRestartGroup;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        paddingValues2 = noPadding;
                                        j5 = j3;
                                        modifier5 = modifier4;
                                        horizontal4 = horizontal5;
                                    } else {
                                        ExitTransition exitTransition7 = disappearInstantly;
                                        shape3 = shape2;
                                        enterTransition3 = appearInstantly;
                                        modifier2 = companion;
                                        exitTransition3 = exitTransition7;
                                        i10 = i3;
                                        horizontal3 = start;
                                        j4 = m5693getUnspecified0d7_KjU;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 64) != 0) {
                                        i3 &= -29360129;
                                    }
                                    i10 = i3;
                                    shape3 = shape2;
                                    enterTransition3 = enterTransition2;
                                    exitTransition3 = exitTransition2;
                                    horizontal3 = horizontal2;
                                    j4 = j;
                                    j3 = j2;
                                }
                                noPadding = paddingValues;
                                startRestartGroup.endDefaults();
                                enterTransition4 = enterTransition3;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume22 = startRestartGroup.consume(localDensity2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                MenuContentPositionProvider menuContentPositionProvider3 = new MenuContentPositionProvider((Density) consume22, horizontal3);
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                mutableTransitionState = (MutableTransitionState) rememberedValue;
                                startRestartGroup.endReplaceGroup();
                                mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(MenuContent.getMenuState$core_release().getExpanded()));
                                MenuState menuState$core_release2 = MenuContent.getMenuState$core_release();
                                i11 = i10;
                                ProvidableCompositionLocal<FocusManager> localFocusManager2 = CompositionLocalsKt.getLocalFocusManager();
                                Alignment.Horizontal horizontal52 = horizontal3;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume32 = startRestartGroup.consume(localFocusManager2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                menuState$core_release2.setCurrentFocusManager$core_release((FocusManager) consume32);
                                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                                }
                                PopupProperties popupProperties2 = new PopupProperties(true, true, true, false, 8, (DefaultConstructorMarker) null);
                                MenuContentPositionProvider menuContentPositionProvider22 = menuContentPositionProvider3;
                                startRestartGroup.startReplaceGroup(5004770);
                                if ((i11 & 14) == 4) {
                                }
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (z) {
                                }
                                menuScope = MenuContent;
                                rememberedValue2 = new Function0() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit MenuContent_ElI5_7k$lambda$10$lambda$9;
                                        MenuContent_ElI5_7k$lambda$10$lambda$9 = Deprecated_MenuKt.MenuContent_ElI5_7k$lambda$10$lambda$9(MenuScope.this);
                                        return MenuContent_ElI5_7k$lambda$10$lambda$9;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                startRestartGroup.endReplaceGroup();
                                exitTransition5 = exitTransition4;
                                modifier4 = modifier3;
                                enterTransition5 = enterTransition4;
                                AndroidPopup_androidKt.Popup(menuContentPositionProvider22, (Function0) rememberedValue2, popupProperties2, ComposableLambdaKt.rememberComposableLambda(-173438108, true, new Deprecated_MenuKt$MenuContent$2(menuScope, mutableTransitionState, enterTransition5, exitTransition5, modifier4, shape3, j4, noPadding, j3, contents), startRestartGroup, 54), startRestartGroup, 3456, 0);
                                composer2 = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                paddingValues2 = noPadding;
                                j5 = j3;
                                modifier5 = modifier4;
                                horizontal4 = horizontal52;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                shape3 = shape2;
                                modifier5 = modifier2;
                                enterTransition5 = enterTransition2;
                                exitTransition5 = exitTransition2;
                                horizontal4 = horizontal2;
                                composer2 = startRestartGroup;
                                j4 = j;
                                j5 = j2;
                                paddingValues2 = paddingValues;
                            }
                            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit MenuContent_ElI5_7k$lambda$11;
                                        MenuContent_ElI5_7k$lambda$11 = Deprecated_MenuKt.MenuContent_ElI5_7k$lambda$11(MenuScope.this, modifier5, enterTransition5, exitTransition5, horizontal4, shape3, j4, j5, paddingValues2, contents, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return MenuContent_ElI5_7k$lambda$11;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i2 & 256) == 0) {
                        }
                        if ((306783379 & i3) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if (i9 == 0) {
                        }
                    }
                    horizontal2 = horizontal;
                    i7 = i2 & 16;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                    }
                    if ((i2 & 256) == 0) {
                    }
                    if ((306783379 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    if (i9 == 0) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                horizontal2 = horizontal;
                i7 = i2 & 16;
                if (i7 != 0) {
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                if ((i2 & 256) == 0) {
                }
                if ((306783379 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (i9 == 0) {
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
            horizontal2 = horizontal;
            i7 = i2 & 16;
            if (i7 != 0) {
            }
            i8 = i2 & 32;
            if (i8 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            if ((306783379 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if (i9 == 0) {
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
        horizontal2 = horizontal;
        i7 = i2 & 16;
        if (i7 != 0) {
        }
        i8 = i2 & 32;
        if (i8 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((306783379 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (i9 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuContent_ElI5_7k$lambda$10$lambda$9(MenuScope menuScope) {
        menuScope.getMenuState$core_release().setExpanded(false);
        FocusManager currentFocusManager$core_release = menuScope.getMenuState$core_release().getCurrentFocusManager$core_release();
        if (currentFocusManager$core_release != null) {
            FocusManager.clearFocus$default(currentFocusManager$core_release, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02df  */
    @Deprecated(message = "Switch to DropdownMenu")
    /* renamed from: MenuItem-dOtcBKo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9364MenuItemdOtcBKo(final MenuScope MenuItem, final Function0<Unit> onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, PaddingValues paddingValues, Shape shape, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, long j, long j2, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> contents, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z2;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication2;
        int i7;
        PaddingValues paddingValues2;
        int i8;
        Shape shape2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j3;
        int i15;
        int i16;
        int i17;
        Modifier modifier2;
        PaddingValues paddingValues3;
        long j4;
        int i18;
        Arrangement.Horizontal horizontal2;
        MutableInteractionSource mutableInteractionSource3;
        Indication indication3;
        Alignment.Vertical vertical2;
        int i19;
        boolean z3;
        long j5;
        Shape shape3;
        boolean z4;
        Object rememberedValue;
        Composer composer2;
        final boolean z5;
        final Shape shape4;
        final long j6;
        final long j7;
        final PaddingValues paddingValues4;
        final Modifier modifier3;
        final Indication indication4;
        final MutableInteractionSource mutableInteractionSource4;
        final Arrangement.Horizontal horizontal3;
        final Alignment.Vertical vertical3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(MenuItem, "$this$MenuItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(contents, "contents");
        Composer startRestartGroup = composer.startRestartGroup(1220849277);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(MenuItem) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i20 = i3 & 2;
        if (i20 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i4 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        indication2 = indication;
                        i4 |= ((i3 & 16) == 0 && startRestartGroup.changed(indication2)) ? 131072 : 65536;
                    } else {
                        indication2 = indication;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 1572864;
                        paddingValues2 = paddingValues;
                    } else {
                        paddingValues2 = paddingValues;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(paddingValues2) ? 1048576 : 524288;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 12582912;
                        shape2 = shape;
                    } else {
                        shape2 = shape;
                        if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changed(shape2) ? 8388608 : 4194304;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(horizontal) ? 67108864 : 33554432;
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i11 = i10;
                        i4 |= startRestartGroup.changed(vertical) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        i12 = i3 & 512;
                        if (i12 != 0) {
                            i14 = i2 | 6;
                            i13 = i4;
                        } else if ((i2 & 6) == 0) {
                            i13 = i4;
                            i14 = i2 | (startRestartGroup.changed(j) ? 4 : 2);
                        } else {
                            i13 = i4;
                            i14 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i15 = i12;
                            j3 = j2;
                            i14 |= ((i3 & 1024) == 0 && startRestartGroup.changed(j3)) ? 32 : 16;
                        } else {
                            j3 = j2;
                            i15 = i12;
                        }
                        i16 = i14;
                        if ((i3 & 2048) != 0) {
                            i16 |= 384;
                        } else if ((i2 & 384) == 0) {
                            i16 |= startRestartGroup.changedInstance(contents) ? 256 : 128;
                        }
                        if ((i13 & 306783379) == 306783378 || (i16 & 147) != 146 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i20 != 0 ? Modifier.INSTANCE : modifier;
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if (i6 != 0) {
                                    mutableInteractionSource2 = null;
                                }
                                if ((i3 & 16) != 0) {
                                    ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localIndication);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    i17 = i13 & (-458753);
                                    indication2 = (Indication) consume;
                                } else {
                                    i17 = i13;
                                }
                                PaddingValues noPadding = i7 != 0 ? UtilsKt.getNoPadding() : paddingValues2;
                                Shape rectangleShape = i8 != 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                                Arrangement.Horizontal start = i9 != 0 ? Arrangement.INSTANCE.getStart() : horizontal;
                                Alignment.Vertical centerVertically = i11 != 0 ? Alignment.INSTANCE.getCenterVertically() : vertical;
                                long m5693getUnspecified0d7_KjU = i15 != 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j;
                                int i21 = i16;
                                if ((i3 & 1024) != 0) {
                                    ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    long m5667unboximpl = ((Color) consume2).m5667unboximpl();
                                    i16 = i21 & BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                    modifier2 = companion;
                                    paddingValues3 = noPadding;
                                    j4 = m5667unboximpl;
                                    i18 = i17;
                                    horizontal2 = start;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    indication3 = indication2;
                                    vertical2 = centerVertically;
                                    j5 = m5693getUnspecified0d7_KjU;
                                    i19 = 4;
                                    shape3 = rectangleShape;
                                    z3 = z2;
                                } else {
                                    modifier2 = companion;
                                    paddingValues3 = noPadding;
                                    j4 = j3;
                                    i18 = i17;
                                    horizontal2 = start;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    indication3 = indication2;
                                    vertical2 = centerVertically;
                                    i16 = i21;
                                    i19 = 4;
                                    z3 = z2;
                                    j5 = m5693getUnspecified0d7_KjU;
                                    shape3 = rectangleShape;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                i18 = (i3 & 16) != 0 ? i13 & (-458753) : i13;
                                if ((i3 & 1024) != 0) {
                                    i16 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                }
                                modifier2 = modifier;
                                horizontal2 = horizontal;
                                vertical2 = vertical;
                                j5 = j;
                                j4 = j3;
                                paddingValues3 = paddingValues2;
                                shape3 = shape2;
                                z3 = z2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                indication3 = indication2;
                                i19 = 4;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1220849277, i18, i16, "com.composables.core.MenuItem (deprecated.Menu.kt:351)");
                            }
                            startRestartGroup.startReplaceGroup(-1633490746);
                            z4 = ((i18 & 14) == i19) | ((i18 & 112) == 32);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit MenuItem_dOtcBKo$lambda$13$lambda$12;
                                        MenuItem_dOtcBKo$lambda$13$lambda$12 = Deprecated_MenuKt.MenuItem_dOtcBKo$lambda$13$lambda$12(Function0.this, MenuItem);
                                        return MenuItem_dOtcBKo$lambda$13$lambda$12;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            int i22 = i18 >> 15;
                            int i23 = i16 << 9;
                            int i24 = (i23 & 57344) | ((i18 >> 6) & 112) | (i22 & 896) | (i23 & 7168) | ((i18 >> 3) & 458752) | ((i18 << 18) & 234881024);
                            int i25 = (i22 & 14) | 24576 | ((i18 >> 9) & 112);
                            int i26 = i18 >> 18;
                            composer2 = startRestartGroup;
                            ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, z3, shape3, j5, j4, paddingValues3, 0L, 0.0f, modifier2, 0, indication3, mutableInteractionSource3, horizontal2, vertical2, ComposableLambdaKt.rememberComposableLambda(381104239, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composables.core.Deprecated_MenuKt$MenuItem$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Button, Composer composer3, int i27) {
                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                    if ((i27 & 6) == 0) {
                                        i27 |= composer3.changed(Button) ? 4 : 2;
                                    }
                                    if ((i27 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(381104239, i27, -1, "com.composables.core.MenuItem.<anonymous> (deprecated.Menu.kt:369)");
                                    }
                                    contents.invoke(Button, composer3, Integer.valueOf(i27 & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), composer2, i24, i25 | (i26 & 896) | (i26 & 7168), TypedValues.TransitionType.TYPE_AUTO_TRANSITION);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z3;
                            shape4 = shape3;
                            j6 = j5;
                            j7 = j4;
                            paddingValues4 = paddingValues3;
                            modifier3 = modifier2;
                            indication4 = indication3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            horizontal3 = horizontal2;
                            vertical3 = vertical2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            vertical3 = vertical;
                            composer2 = startRestartGroup;
                            z5 = z2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            indication4 = indication2;
                            j7 = j3;
                            paddingValues4 = paddingValues2;
                            shape4 = shape2;
                            horizontal3 = horizontal;
                            j6 = j;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit MenuItem_dOtcBKo$lambda$14;
                                    MenuItem_dOtcBKo$lambda$14 = Deprecated_MenuKt.MenuItem_dOtcBKo$lambda$14(MenuScope.this, onClick, modifier3, z5, mutableInteractionSource4, indication4, paddingValues4, shape4, horizontal3, vertical3, j6, j7, contents, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return MenuItem_dOtcBKo$lambda$14;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i11 = i10;
                    i12 = i3 & 512;
                    if (i12 != 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    i16 = i14;
                    if ((i3 & 2048) != 0) {
                    }
                    if ((i13 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    int i212 = i16;
                    if ((i3 & 1024) != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(-1633490746);
                    if ((i18 & 112) == 32) {
                    }
                    z4 = ((i18 & 14) == i19) | ((i18 & 112) == 32);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z4) {
                    }
                    rememberedValue = new Function0() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit MenuItem_dOtcBKo$lambda$13$lambda$12;
                            MenuItem_dOtcBKo$lambda$13$lambda$12 = Deprecated_MenuKt.MenuItem_dOtcBKo$lambda$13$lambda$12(Function0.this, MenuItem);
                            return MenuItem_dOtcBKo$lambda$13$lambda$12;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    int i222 = i18 >> 15;
                    int i232 = i16 << 9;
                    int i242 = (i232 & 57344) | ((i18 >> 6) & 112) | (i222 & 896) | (i232 & 7168) | ((i18 >> 3) & 458752) | ((i18 << 18) & 234881024);
                    int i252 = (i222 & 14) | 24576 | ((i18 >> 9) & 112);
                    int i262 = i18 >> 18;
                    composer2 = startRestartGroup;
                    ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, z3, shape3, j5, j4, paddingValues3, 0L, 0.0f, modifier2, 0, indication3, mutableInteractionSource3, horizontal2, vertical2, ComposableLambdaKt.rememberComposableLambda(381104239, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composables.core.Deprecated_MenuKt$MenuItem$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                            invoke(rowScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope Button, Composer composer3, int i27) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i27 & 6) == 0) {
                                i27 |= composer3.changed(Button) ? 4 : 2;
                            }
                            if ((i27 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(381104239, i27, -1, "com.composables.core.MenuItem.<anonymous> (deprecated.Menu.kt:369)");
                            }
                            contents.invoke(Button, composer3, Integer.valueOf(i27 & 14));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), composer2, i242, i252 | (i262 & 896) | (i262 & 7168), TypedValues.TransitionType.TYPE_AUTO_TRANSITION);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z3;
                    shape4 = shape3;
                    j6 = j5;
                    j7 = j4;
                    paddingValues4 = paddingValues3;
                    modifier3 = modifier2;
                    indication4 = indication3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    horizontal3 = horizontal2;
                    vertical3 = vertical2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 512;
                if (i12 != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                i16 = i14;
                if ((i3 & 2048) != 0) {
                }
                if ((i13 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i20 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i15 != 0) {
                }
                int i2122 = i16;
                if ((i3 & 1024) != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(-1633490746);
                if ((i18 & 112) == 32) {
                }
                z4 = ((i18 & 14) == i19) | ((i18 & 112) == 32);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                rememberedValue = new Function0() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MenuItem_dOtcBKo$lambda$13$lambda$12;
                        MenuItem_dOtcBKo$lambda$13$lambda$12 = Deprecated_MenuKt.MenuItem_dOtcBKo$lambda$13$lambda$12(Function0.this, MenuItem);
                        return MenuItem_dOtcBKo$lambda$13$lambda$12;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                int i2222 = i18 >> 15;
                int i2322 = i16 << 9;
                int i2422 = (i2322 & 57344) | ((i18 >> 6) & 112) | (i2222 & 896) | (i2322 & 7168) | ((i18 >> 3) & 458752) | ((i18 << 18) & 234881024);
                int i2522 = (i2222 & 14) | 24576 | ((i18 >> 9) & 112);
                int i2622 = i18 >> 18;
                composer2 = startRestartGroup;
                ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, z3, shape3, j5, j4, paddingValues3, 0L, 0.0f, modifier2, 0, indication3, mutableInteractionSource3, horizontal2, vertical2, ComposableLambdaKt.rememberComposableLambda(381104239, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composables.core.Deprecated_MenuKt$MenuItem$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer3, int i27) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i27 & 6) == 0) {
                            i27 |= composer3.changed(Button) ? 4 : 2;
                        }
                        if ((i27 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(381104239, i27, -1, "com.composables.core.MenuItem.<anonymous> (deprecated.Menu.kt:369)");
                        }
                        contents.invoke(Button, composer3, Integer.valueOf(i27 & 14));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), composer2, i2422, i2522 | (i2622 & 896) | (i2622 & 7168), TypedValues.TransitionType.TYPE_AUTO_TRANSITION);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z3;
                shape4 = shape3;
                j6 = j5;
                j7 = j4;
                paddingValues4 = paddingValues3;
                modifier3 = modifier2;
                indication4 = indication3;
                mutableInteractionSource4 = mutableInteractionSource3;
                horizontal3 = horizontal2;
                vertical3 = vertical2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 512;
            if (i12 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i16 = i14;
            if ((i3 & 2048) != 0) {
            }
            if ((i13 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i20 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i15 != 0) {
            }
            int i21222 = i16;
            if ((i3 & 1024) != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(-1633490746);
            if ((i18 & 112) == 32) {
            }
            z4 = ((i18 & 14) == i19) | ((i18 & 112) == 32);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue = new Function0() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit MenuItem_dOtcBKo$lambda$13$lambda$12;
                    MenuItem_dOtcBKo$lambda$13$lambda$12 = Deprecated_MenuKt.MenuItem_dOtcBKo$lambda$13$lambda$12(Function0.this, MenuItem);
                    return MenuItem_dOtcBKo$lambda$13$lambda$12;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            int i22222 = i18 >> 15;
            int i23222 = i16 << 9;
            int i24222 = (i23222 & 57344) | ((i18 >> 6) & 112) | (i22222 & 896) | (i23222 & 7168) | ((i18 >> 3) & 458752) | ((i18 << 18) & 234881024);
            int i25222 = (i22222 & 14) | 24576 | ((i18 >> 9) & 112);
            int i26222 = i18 >> 18;
            composer2 = startRestartGroup;
            ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, z3, shape3, j5, j4, paddingValues3, 0L, 0.0f, modifier2, 0, indication3, mutableInteractionSource3, horizontal2, vertical2, ComposableLambdaKt.rememberComposableLambda(381104239, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composables.core.Deprecated_MenuKt$MenuItem$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer3, int i27) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i27 & 6) == 0) {
                        i27 |= composer3.changed(Button) ? 4 : 2;
                    }
                    if ((i27 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(381104239, i27, -1, "com.composables.core.MenuItem.<anonymous> (deprecated.Menu.kt:369)");
                    }
                    contents.invoke(Button, composer3, Integer.valueOf(i27 & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), composer2, i24222, i25222 | (i26222 & 896) | (i26222 & 7168), TypedValues.TransitionType.TYPE_AUTO_TRANSITION);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z3;
            shape4 = shape3;
            j6 = j5;
            j7 = j4;
            paddingValues4 = paddingValues3;
            modifier3 = modifier2;
            indication4 = indication3;
            mutableInteractionSource4 = mutableInteractionSource3;
            horizontal3 = horizontal2;
            vertical3 = vertical2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 512;
        if (i12 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i16 = i14;
        if ((i3 & 2048) != 0) {
        }
        if ((i13 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i20 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i15 != 0) {
        }
        int i212222 = i16;
        if ((i3 & 1024) != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(-1633490746);
        if ((i18 & 112) == 32) {
        }
        z4 = ((i18 & 14) == i19) | ((i18 & 112) == 32);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue = new Function0() { // from class: com.composables.core.Deprecated_MenuKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit MenuItem_dOtcBKo$lambda$13$lambda$12;
                MenuItem_dOtcBKo$lambda$13$lambda$12 = Deprecated_MenuKt.MenuItem_dOtcBKo$lambda$13$lambda$12(Function0.this, MenuItem);
                return MenuItem_dOtcBKo$lambda$13$lambda$12;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        int i222222 = i18 >> 15;
        int i232222 = i16 << 9;
        int i242222 = (i232222 & 57344) | ((i18 >> 6) & 112) | (i222222 & 896) | (i232222 & 7168) | ((i18 >> 3) & 458752) | ((i18 << 18) & 234881024);
        int i252222 = (i222222 & 14) | 24576 | ((i18 >> 9) & 112);
        int i262222 = i18 >> 18;
        composer2 = startRestartGroup;
        ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, z3, shape3, j5, j4, paddingValues3, 0L, 0.0f, modifier2, 0, indication3, mutableInteractionSource3, horizontal2, vertical2, ComposableLambdaKt.rememberComposableLambda(381104239, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composables.core.Deprecated_MenuKt$MenuItem$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                invoke(rowScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope Button, Composer composer3, int i27) {
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i27 & 6) == 0) {
                    i27 |= composer3.changed(Button) ? 4 : 2;
                }
                if ((i27 & 19) == 18 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(381104239, i27, -1, "com.composables.core.MenuItem.<anonymous> (deprecated.Menu.kt:369)");
                }
                contents.invoke(Button, composer3, Integer.valueOf(i27 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), composer2, i242222, i252222 | (i262222 & 896) | (i262222 & 7168), TypedValues.TransitionType.TYPE_AUTO_TRANSITION);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z3;
        shape4 = shape3;
        j6 = j5;
        j7 = j4;
        paddingValues4 = paddingValues3;
        modifier3 = modifier2;
        indication4 = indication3;
        mutableInteractionSource4 = mutableInteractionSource3;
        horizontal3 = horizontal2;
        vertical3 = vertical2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuItem_dOtcBKo$lambda$13$lambda$12(Function0 function0, MenuScope menuScope) {
        function0.invoke();
        menuScope.getMenuState$core_release().setExpanded(false);
        FocusManager currentFocusManager$core_release = menuScope.getMenuState$core_release().getCurrentFocusManager$core_release();
        if (currentFocusManager$core_release != null) {
            FocusManager.clearFocus$default(currentFocusManager$core_release, false, 1, null);
        }
        return Unit.INSTANCE;
    }
}
