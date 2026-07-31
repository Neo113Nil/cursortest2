package com.composeunstyled;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
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

/* compiled from: Disclosure.kt */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a?\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a \u0001\u0010\u0010\u001a\u00020\u0006*\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00060$¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b%\u0010&\u001a®\u0001\u0010\u0010\u001a\u00020\u0006*\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060$2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00060$¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b(\u0010)\u001aB\u0010*\u001a\u00020\u0006*\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00060$¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010/¨\u00060"}, d2 = {"rememberDisclosureState", "Lcom/composeunstyled/DisclosureState;", "initiallyExpanded", "", "(ZLandroidx/compose/runtime/Composer;II)Lcom/composeunstyled/DisclosureState;", "Disclosure", "", "state", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Lcom/composeunstyled/DisclosureScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lcom/composeunstyled/DisclosureState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DisclosureHeading", ViewProps.ENABLED, "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", ViewProps.BORDER_COLOR, ViewProps.BORDER_WIDTH, "Landroidx/compose/ui/unit/Dp;", "indication", "Landroidx/compose/foundation/Indication;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Lkotlin/Function0;", "DisclosureHeading-6vk1a7w", "(Lcom/composeunstyled/DisclosureScope;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/layout/PaddingValues;JFLandroidx/compose/foundation/Indication;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", ViewProps.ON_CLICK, "DisclosureHeading-XMnMKNU", "(Lcom/composeunstyled/DisclosureScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/layout/PaddingValues;JFLandroidx/compose/foundation/Indication;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "DisclosurePanel", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "(Lcom/composeunstyled/DisclosureScope;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisclosureKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Disclosure$lambda$3(DisclosureState disclosureState, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        Disclosure(disclosureState, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisclosureHeading_6vk1a7w$lambda$10(DisclosureScope disclosureScope, Modifier modifier, boolean z, Shape shape, long j, long j2, PaddingValues paddingValues, long j3, float f, Indication indication, MutableInteractionSource mutableInteractionSource, Alignment.Vertical vertical, Arrangement.Horizontal horizontal, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        m9511DisclosureHeading6vk1a7w(disclosureScope, modifier, z, shape, j, j2, paddingValues, j3, f, indication, mutableInteractionSource, vertical, horizontal, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisclosureHeading_XMnMKNU$lambda$11(DisclosureScope disclosureScope, Function0 function0, Modifier modifier, boolean z, Shape shape, long j, long j2, PaddingValues paddingValues, long j3, float f, Indication indication, MutableInteractionSource mutableInteractionSource, Alignment.Vertical vertical, Arrangement.Horizontal horizontal, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        m9512DisclosureHeadingXMnMKNU(disclosureScope, function0, modifier, z, shape, j, j2, paddingValues, j3, f, indication, mutableInteractionSource, vertical, horizontal, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisclosurePanel$lambda$12(DisclosureScope disclosureScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function2 function2, int i, int i2, Composer composer, int i3) {
        DisclosurePanel(disclosureScope, modifier, enterTransition, exitTransition, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final DisclosureState rememberDisclosureState(boolean z, Composer composer, int i, int i2) {
        composer.startReplaceGroup(447878211);
        if ((i2 & 1) != 0) {
            z = false;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(447878211, i, -1, "com.composeunstyled.rememberDisclosureState (Disclosure.kt:32)");
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new DisclosureState(z);
            composer.updateRememberedValue(rememberedValue);
        }
        DisclosureState disclosureState = (DisclosureState) rememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return disclosureState;
    }

    public static final void Disclosure(DisclosureState disclosureState, Modifier modifier, final Function3<? super DisclosureScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1536494074);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && startRestartGroup.changed(disclosureState)) ? 4 : 2) | i;
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
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    disclosureState = rememberDisclosureState(false, startRestartGroup, 0, 1);
                    i3 &= -15;
                }
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1536494074, i3, -1, "com.composeunstyled.Disclosure (Disclosure.kt:75)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new DisclosureScope(disclosureState);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            DisclosureScope disclosureScope = (DisclosureScope) rememberedValue;
            startRestartGroup.endReplaceGroup();
            int i5 = i3 >> 3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            content.invoke(disclosureScope, startRestartGroup, Integer.valueOf((i5 & 112) | 6));
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
        final DisclosureState disclosureState2 = disclosureState;
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Disclosure$lambda$3;
                    Disclosure$lambda$3 = DisclosureKt.Disclosure$lambda$3(DisclosureState.this, modifier2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return Disclosure$lambda$3;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0360  */
    /* renamed from: DisclosureHeading-6vk1a7w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9511DisclosureHeading6vk1a7w(final DisclosureScope DisclosureHeading, Modifier modifier, boolean z, Shape shape, long j, long j2, PaddingValues paddingValues, long j3, float f, Indication indication, MutableInteractionSource mutableInteractionSource, Alignment.Vertical vertical, Arrangement.Horizontal horizontal, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        Shape shape2;
        int i7;
        int i8;
        long j4;
        long j5;
        int i9;
        PaddingValues paddingValues2;
        int i10;
        long j6;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f2;
        Indication indication2;
        float f3;
        Arrangement.Horizontal horizontal2;
        Indication indication3;
        MutableInteractionSource mutableInteractionSource2;
        Alignment.Vertical vertical2;
        long j7;
        PaddingValues paddingValues3;
        boolean z2;
        Modifier modifier2;
        Shape shape3;
        boolean z3;
        int i20;
        long j8;
        long j9;
        boolean z4;
        Object rememberedValue;
        boolean z5;
        Object rememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z6;
        final Shape shape4;
        final long j10;
        final long j11;
        final PaddingValues paddingValues4;
        final long j12;
        final float f4;
        final Indication indication4;
        final MutableInteractionSource mutableInteractionSource3;
        final Arrangement.Horizontal horizontal3;
        final Alignment.Vertical vertical3;
        ScopeUpdateScope endRestartGroup;
        int i21;
        Intrinsics.checkNotNullParameter(DisclosureHeading, "$this$DisclosureHeading");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2141463410);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(DisclosureHeading) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i22 = i3 & 1;
        if (i22 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i5 = i3 & 2;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(z) ? 256 : 128;
                i6 = i3 & 4;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    shape2 = shape;
                    i4 |= startRestartGroup.changed(shape2) ? 2048 : 1024;
                    i7 = i3 & 8;
                    if (i7 == 0) {
                        i4 |= 24576;
                        i8 = i22;
                        j4 = j;
                    } else {
                        i8 = i22;
                        j4 = j;
                        if ((i & 24576) == 0) {
                            i4 |= startRestartGroup.changed(j4) ? 16384 : 8192;
                        }
                    }
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        j5 = j2;
                        i4 |= ((i3 & 16) == 0 && startRestartGroup.changed(j5)) ? 131072 : 65536;
                    } else {
                        j5 = j2;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i4 |= 1572864;
                        paddingValues2 = paddingValues;
                    } else {
                        paddingValues2 = paddingValues;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(paddingValues2) ? 1048576 : 524288;
                        }
                    }
                    i10 = i3 & 64;
                    if (i10 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        int i23 = i4;
                        j6 = j3;
                        i11 = i23 | (startRestartGroup.changed(j6) ? 8388608 : 4194304);
                        i12 = i3 & 128;
                        if (i12 != 0) {
                            i11 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i11 |= startRestartGroup.changed(f) ? 67108864 : 33554432;
                        }
                        if ((i & 805306368) == 0) {
                            if ((i3 & 256) == 0 && startRestartGroup.changed(indication)) {
                                i21 = C.BUFFER_FLAG_LAST_SAMPLE;
                                i11 |= i21;
                            }
                            i21 = 268435456;
                            i11 |= i21;
                        }
                        i13 = i3 & 512;
                        if (i13 != 0) {
                            i15 = i2 | 6;
                            i14 = i13;
                        } else if ((i2 & 6) == 0) {
                            i14 = i13;
                            i15 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i2;
                        }
                        i16 = i3 & 1024;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i2 & 48) == 0) {
                            i17 = i16;
                            i15 |= startRestartGroup.changed(vertical) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        int i24 = i15;
                        i18 = i3 & 2048;
                        if (i18 != 0) {
                            i19 = i24 | 384;
                        } else if ((i2 & 384) == 0) {
                            i19 = i24 | (startRestartGroup.changed(horizontal) ? 256 : 128);
                        } else {
                            i19 = i24;
                        }
                        if ((i3 & 4096) != 0) {
                            i19 |= 3072;
                        } else if ((i2 & 3072) == 0) {
                            i19 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
                        }
                        if ((i11 & 306783379) == 306783378 || (i19 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier;
                                boolean z7 = i5 != 0 ? true : z;
                                if (i6 != 0) {
                                    shape2 = RectangleShapeKt.getRectangleShape();
                                }
                                if (i7 != 0) {
                                    j4 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                                }
                                if ((i3 & 16) != 0) {
                                    ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    j5 = ((Color) consume).m5667unboximpl();
                                    i11 &= -458753;
                                }
                                if (i9 != 0) {
                                    paddingValues2 = UtilsKt.getNoPadding();
                                }
                                if (i10 != 0) {
                                    j6 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                                }
                                Modifier modifier4 = companion;
                                float m8401constructorimpl = i12 != 0 ? Dp.m8401constructorimpl(0) : f;
                                if ((i3 & 256) != 0) {
                                    ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                                    f2 = m8401constructorimpl;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(localIndication);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    indication2 = (Indication) consume2;
                                    i11 &= -1879048193;
                                } else {
                                    f2 = m8401constructorimpl;
                                    indication2 = indication;
                                }
                                MutableInteractionSource mutableInteractionSource4 = i14 != 0 ? null : mutableInteractionSource;
                                Alignment.Vertical centerVertically = i17 != 0 ? Alignment.INSTANCE.getCenterVertically() : vertical;
                                if (i18 != 0) {
                                    indication3 = indication2;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                    vertical2 = centerVertically;
                                    j7 = j5;
                                    paddingValues3 = paddingValues2;
                                    horizontal2 = Arrangement.INSTANCE.getStart();
                                    z2 = false;
                                    modifier2 = modifier4;
                                    f3 = f2;
                                } else {
                                    f3 = f2;
                                    horizontal2 = horizontal;
                                    indication3 = indication2;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                    vertical2 = centerVertically;
                                    j7 = j5;
                                    paddingValues3 = paddingValues2;
                                    z2 = false;
                                    modifier2 = modifier4;
                                }
                                long j13 = j6;
                                shape3 = shape2;
                                z3 = z7;
                                i20 = i11;
                                j8 = j13;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 16) != 0) {
                                    i11 &= -458753;
                                }
                                if ((i3 & 256) != 0) {
                                    i11 &= -1879048193;
                                }
                                modifier2 = modifier;
                                f3 = f;
                                indication3 = indication;
                                mutableInteractionSource2 = mutableInteractionSource;
                                vertical2 = vertical;
                                horizontal2 = horizontal;
                                j7 = j5;
                                paddingValues3 = paddingValues2;
                                z2 = false;
                                j8 = j6;
                                shape3 = shape2;
                                i20 = i11;
                                z3 = z;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                j9 = j7;
                                ComposerKt.traceEventStart(-2141463410, i20, i19, "com.composeunstyled.DisclosureHeading (Disclosure.kt:115)");
                            } else {
                                j9 = j7;
                            }
                            startRestartGroup.startReplaceGroup(5004770);
                            int i25 = i20 & 14;
                            z4 = i25 == 4 ? true : z2;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function1() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit DisclosureHeading_6vk1a7w$lambda$7$lambda$6;
                                        DisclosureHeading_6vk1a7w$lambda$7$lambda$6 = DisclosureKt.DisclosureHeading_6vk1a7w$lambda$7$lambda$6(DisclosureScope.this, (SemanticsPropertyReceiver) obj);
                                        return DisclosureHeading_6vk1a7w$lambda$7$lambda$6;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            boolean z8 = z3;
                            Shape shape5 = shape3;
                            boolean z9 = z2;
                            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier2, z9, (Function1) rememberedValue, 1, null);
                            startRestartGroup.startReplaceGroup(5004770);
                            z5 = i25 == 4 ? true : z9;
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z5 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function0() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit DisclosureHeading_6vk1a7w$lambda$9$lambda$8;
                                        DisclosureHeading_6vk1a7w$lambda$9$lambda$8 = DisclosureKt.DisclosureHeading_6vk1a7w$lambda$9$lambda$8(DisclosureScope.this);
                                        return DisclosureHeading_6vk1a7w$lambda$9$lambda$8;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceGroup();
                            int i26 = (i20 >> 3) & 33554416;
                            int i27 = ((i20 >> 27) & 14) | 24576 | ((i19 << 3) & 112) | (i19 & 896) | ((i19 << 6) & 7168);
                            long j14 = j9;
                            composer2 = startRestartGroup;
                            ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue2, z8, shape5, j4, j14, paddingValues3, j8, f3, semantics$default, 0, indication3, mutableInteractionSource2, horizontal2, vertical2, ComposableLambdaKt.rememberComposableLambda(-521253760, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DisclosureKt$DisclosureHeading$3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Button, Composer composer3, int i28) {
                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                    if ((i28 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-521253760, i28, -1, "com.composeunstyled.DisclosureHeading.<anonymous> (Disclosure.kt:144)");
                                    }
                                    content.invoke(composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), composer2, i26, i27, 512);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            z6 = z8;
                            shape4 = shape5;
                            j10 = j4;
                            j11 = j14;
                            paddingValues4 = paddingValues3;
                            j12 = j8;
                            f4 = f3;
                            indication4 = indication3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            horizontal3 = horizontal2;
                            vertical3 = vertical2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z6 = z;
                            mutableInteractionSource3 = mutableInteractionSource;
                            horizontal3 = horizontal;
                            composer2 = startRestartGroup;
                            j10 = j4;
                            shape4 = shape2;
                            paddingValues4 = paddingValues2;
                            vertical3 = vertical;
                            j12 = j6;
                            j11 = j5;
                            f4 = f;
                            indication4 = indication;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit DisclosureHeading_6vk1a7w$lambda$10;
                                    DisclosureHeading_6vk1a7w$lambda$10 = DisclosureKt.DisclosureHeading_6vk1a7w$lambda$10(DisclosureScope.this, modifier3, z6, shape4, j10, j11, paddingValues4, j12, f4, indication4, mutableInteractionSource3, vertical3, horizontal3, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return DisclosureHeading_6vk1a7w$lambda$10;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i11 = i4;
                    j6 = j3;
                    i12 = i3 & 128;
                    if (i12 != 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    i13 = i3 & 512;
                    if (i13 != 0) {
                    }
                    i16 = i3 & 1024;
                    if (i16 != 0) {
                    }
                    int i242 = i15;
                    i18 = i3 & 2048;
                    if (i18 != 0) {
                    }
                    if ((i3 & 4096) != 0) {
                    }
                    if ((i11 & 306783379) == 306783378) {
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
                    if ((i3 & 16) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    Modifier modifier42 = companion;
                    if (i12 != 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    long j132 = j6;
                    shape3 = shape2;
                    z3 = z7;
                    i20 = i11;
                    j8 = j132;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(5004770);
                    int i252 = i20 & 14;
                    if (i252 == 4) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z4) {
                    }
                    rememberedValue = new Function1() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit DisclosureHeading_6vk1a7w$lambda$7$lambda$6;
                            DisclosureHeading_6vk1a7w$lambda$7$lambda$6 = DisclosureKt.DisclosureHeading_6vk1a7w$lambda$7$lambda$6(DisclosureScope.this, (SemanticsPropertyReceiver) obj);
                            return DisclosureHeading_6vk1a7w$lambda$7$lambda$6;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    boolean z82 = z3;
                    Shape shape52 = shape3;
                    boolean z92 = z2;
                    Modifier semantics$default2 = SemanticsModifierKt.semantics$default(modifier2, z92, (Function1) rememberedValue, 1, null);
                    startRestartGroup.startReplaceGroup(5004770);
                    if (i252 == 4) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z5) {
                    }
                    rememberedValue2 = new Function0() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit DisclosureHeading_6vk1a7w$lambda$9$lambda$8;
                            DisclosureHeading_6vk1a7w$lambda$9$lambda$8 = DisclosureKt.DisclosureHeading_6vk1a7w$lambda$9$lambda$8(DisclosureScope.this);
                            return DisclosureHeading_6vk1a7w$lambda$9$lambda$8;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                    int i262 = (i20 >> 3) & 33554416;
                    int i272 = ((i20 >> 27) & 14) | 24576 | ((i19 << 3) & 112) | (i19 & 896) | ((i19 << 6) & 7168);
                    long j142 = j9;
                    composer2 = startRestartGroup;
                    ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue2, z82, shape52, j4, j142, paddingValues3, j8, f3, semantics$default2, 0, indication3, mutableInteractionSource2, horizontal2, vertical2, ComposableLambdaKt.rememberComposableLambda(-521253760, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DisclosureKt$DisclosureHeading$3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                            invoke(rowScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope Button, Composer composer3, int i28) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i28 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-521253760, i28, -1, "com.composeunstyled.DisclosureHeading.<anonymous> (Disclosure.kt:144)");
                            }
                            content.invoke(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), composer2, i262, i272, 512);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    z6 = z82;
                    shape4 = shape52;
                    j10 = j4;
                    j11 = j142;
                    paddingValues4 = paddingValues3;
                    j12 = j8;
                    f4 = f3;
                    indication4 = indication3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    horizontal3 = horizontal2;
                    vertical3 = vertical2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                shape2 = shape;
                i7 = i3 & 8;
                if (i7 == 0) {
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                i10 = i3 & 64;
                if (i10 == 0) {
                }
                i11 = i4;
                j6 = j3;
                i12 = i3 & 128;
                if (i12 != 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i13 = i3 & 512;
                if (i13 != 0) {
                }
                i16 = i3 & 1024;
                if (i16 != 0) {
                }
                int i2422 = i15;
                i18 = i3 & 2048;
                if (i18 != 0) {
                }
                if ((i3 & 4096) != 0) {
                }
                if ((i11 & 306783379) == 306783378) {
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
                if ((i3 & 16) != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                Modifier modifier422 = companion;
                if (i12 != 0) {
                }
                if ((i3 & 256) != 0) {
                }
                if (i14 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                long j1322 = j6;
                shape3 = shape2;
                z3 = z7;
                i20 = i11;
                j8 = j1322;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(5004770);
                int i2522 = i20 & 14;
                if (i2522 == 4) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                rememberedValue = new Function1() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit DisclosureHeading_6vk1a7w$lambda$7$lambda$6;
                        DisclosureHeading_6vk1a7w$lambda$7$lambda$6 = DisclosureKt.DisclosureHeading_6vk1a7w$lambda$7$lambda$6(DisclosureScope.this, (SemanticsPropertyReceiver) obj);
                        return DisclosureHeading_6vk1a7w$lambda$7$lambda$6;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                boolean z822 = z3;
                Shape shape522 = shape3;
                boolean z922 = z2;
                Modifier semantics$default22 = SemanticsModifierKt.semantics$default(modifier2, z922, (Function1) rememberedValue, 1, null);
                startRestartGroup.startReplaceGroup(5004770);
                if (i2522 == 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z5) {
                }
                rememberedValue2 = new Function0() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DisclosureHeading_6vk1a7w$lambda$9$lambda$8;
                        DisclosureHeading_6vk1a7w$lambda$9$lambda$8 = DisclosureKt.DisclosureHeading_6vk1a7w$lambda$9$lambda$8(DisclosureScope.this);
                        return DisclosureHeading_6vk1a7w$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                int i2622 = (i20 >> 3) & 33554416;
                int i2722 = ((i20 >> 27) & 14) | 24576 | ((i19 << 3) & 112) | (i19 & 896) | ((i19 << 6) & 7168);
                long j1422 = j9;
                composer2 = startRestartGroup;
                ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue2, z822, shape522, j4, j1422, paddingValues3, j8, f3, semantics$default22, 0, indication3, mutableInteractionSource2, horizontal2, vertical2, ComposableLambdaKt.rememberComposableLambda(-521253760, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DisclosureKt$DisclosureHeading$3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer3, int i28) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i28 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-521253760, i28, -1, "com.composeunstyled.DisclosureHeading.<anonymous> (Disclosure.kt:144)");
                        }
                        content.invoke(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), composer2, i2622, i2722, 512);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                z6 = z822;
                shape4 = shape522;
                j10 = j4;
                j11 = j1422;
                paddingValues4 = paddingValues3;
                j12 = j8;
                f4 = f3;
                indication4 = indication3;
                mutableInteractionSource3 = mutableInteractionSource2;
                horizontal3 = horizontal2;
                vertical3 = vertical2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 4;
            if (i6 != 0) {
            }
            shape2 = shape;
            i7 = i3 & 8;
            if (i7 == 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            i10 = i3 & 64;
            if (i10 == 0) {
            }
            i11 = i4;
            j6 = j3;
            i12 = i3 & 128;
            if (i12 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i13 = i3 & 512;
            if (i13 != 0) {
            }
            i16 = i3 & 1024;
            if (i16 != 0) {
            }
            int i24222 = i15;
            i18 = i3 & 2048;
            if (i18 != 0) {
            }
            if ((i3 & 4096) != 0) {
            }
            if ((i11 & 306783379) == 306783378) {
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
            if ((i3 & 16) != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            Modifier modifier4222 = companion;
            if (i12 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if (i14 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            long j13222 = j6;
            shape3 = shape2;
            z3 = z7;
            i20 = i11;
            j8 = j13222;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(5004770);
            int i25222 = i20 & 14;
            if (i25222 == 4) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue = new Function1() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit DisclosureHeading_6vk1a7w$lambda$7$lambda$6;
                    DisclosureHeading_6vk1a7w$lambda$7$lambda$6 = DisclosureKt.DisclosureHeading_6vk1a7w$lambda$7$lambda$6(DisclosureScope.this, (SemanticsPropertyReceiver) obj);
                    return DisclosureHeading_6vk1a7w$lambda$7$lambda$6;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            boolean z8222 = z3;
            Shape shape5222 = shape3;
            boolean z9222 = z2;
            Modifier semantics$default222 = SemanticsModifierKt.semantics$default(modifier2, z9222, (Function1) rememberedValue, 1, null);
            startRestartGroup.startReplaceGroup(5004770);
            if (i25222 == 4) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z5) {
            }
            rememberedValue2 = new Function0() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit DisclosureHeading_6vk1a7w$lambda$9$lambda$8;
                    DisclosureHeading_6vk1a7w$lambda$9$lambda$8 = DisclosureKt.DisclosureHeading_6vk1a7w$lambda$9$lambda$8(DisclosureScope.this);
                    return DisclosureHeading_6vk1a7w$lambda$9$lambda$8;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            int i26222 = (i20 >> 3) & 33554416;
            int i27222 = ((i20 >> 27) & 14) | 24576 | ((i19 << 3) & 112) | (i19 & 896) | ((i19 << 6) & 7168);
            long j14222 = j9;
            composer2 = startRestartGroup;
            ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue2, z8222, shape5222, j4, j14222, paddingValues3, j8, f3, semantics$default222, 0, indication3, mutableInteractionSource2, horizontal2, vertical2, ComposableLambdaKt.rememberComposableLambda(-521253760, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DisclosureKt$DisclosureHeading$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer3, int i28) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i28 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-521253760, i28, -1, "com.composeunstyled.DisclosureHeading.<anonymous> (Disclosure.kt:144)");
                    }
                    content.invoke(composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), composer2, i26222, i27222, 512);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            z6 = z8222;
            shape4 = shape5222;
            j10 = j4;
            j11 = j14222;
            paddingValues4 = paddingValues3;
            j12 = j8;
            f4 = f3;
            indication4 = indication3;
            mutableInteractionSource3 = mutableInteractionSource2;
            horizontal3 = horizontal2;
            vertical3 = vertical2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 2;
        if (i5 == 0) {
        }
        i6 = i3 & 4;
        if (i6 != 0) {
        }
        shape2 = shape;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        i10 = i3 & 64;
        if (i10 == 0) {
        }
        i11 = i4;
        j6 = j3;
        i12 = i3 & 128;
        if (i12 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i13 = i3 & 512;
        if (i13 != 0) {
        }
        i16 = i3 & 1024;
        if (i16 != 0) {
        }
        int i242222 = i15;
        i18 = i3 & 2048;
        if (i18 != 0) {
        }
        if ((i3 & 4096) != 0) {
        }
        if ((i11 & 306783379) == 306783378) {
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
        if ((i3 & 16) != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        Modifier modifier42222 = companion;
        if (i12 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if (i14 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        long j132222 = j6;
        shape3 = shape2;
        z3 = z7;
        i20 = i11;
        j8 = j132222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        int i252222 = i20 & 14;
        if (i252222 == 4) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue = new Function1() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit DisclosureHeading_6vk1a7w$lambda$7$lambda$6;
                DisclosureHeading_6vk1a7w$lambda$7$lambda$6 = DisclosureKt.DisclosureHeading_6vk1a7w$lambda$7$lambda$6(DisclosureScope.this, (SemanticsPropertyReceiver) obj);
                return DisclosureHeading_6vk1a7w$lambda$7$lambda$6;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        boolean z82222 = z3;
        Shape shape52222 = shape3;
        boolean z92222 = z2;
        Modifier semantics$default2222 = SemanticsModifierKt.semantics$default(modifier2, z92222, (Function1) rememberedValue, 1, null);
        startRestartGroup.startReplaceGroup(5004770);
        if (i252222 == 4) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z5) {
        }
        rememberedValue2 = new Function0() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit DisclosureHeading_6vk1a7w$lambda$9$lambda$8;
                DisclosureHeading_6vk1a7w$lambda$9$lambda$8 = DisclosureKt.DisclosureHeading_6vk1a7w$lambda$9$lambda$8(DisclosureScope.this);
                return DisclosureHeading_6vk1a7w$lambda$9$lambda$8;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        int i262222 = (i20 >> 3) & 33554416;
        int i272222 = ((i20 >> 27) & 14) | 24576 | ((i19 << 3) & 112) | (i19 & 896) | ((i19 << 6) & 7168);
        long j142222 = j9;
        composer2 = startRestartGroup;
        ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue2, z82222, shape52222, j4, j142222, paddingValues3, j8, f3, semantics$default2222, 0, indication3, mutableInteractionSource2, horizontal2, vertical2, ComposableLambdaKt.rememberComposableLambda(-521253760, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DisclosureKt$DisclosureHeading$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                invoke(rowScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope Button, Composer composer3, int i28) {
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i28 & 17) == 16 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-521253760, i28, -1, "com.composeunstyled.DisclosureHeading.<anonymous> (Disclosure.kt:144)");
                }
                content.invoke(composer3, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), composer2, i262222, i272222, 512);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        z6 = z82222;
        shape4 = shape52222;
        j10 = j4;
        j11 = j142222;
        paddingValues4 = paddingValues3;
        j12 = j8;
        f4 = f3;
        indication4 = indication3;
        mutableInteractionSource3 = mutableInteractionSource2;
        horizontal3 = horizontal2;
        vertical3 = vertical2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisclosureHeading_6vk1a7w$lambda$7$lambda$6(final DisclosureScope disclosureScope, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.heading(semantics);
        if (disclosureScope.getState$core_release().getExpanded()) {
            SemanticsPropertiesKt.collapse$default(semantics, null, new Function0() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean DisclosureHeading_6vk1a7w$lambda$7$lambda$6$lambda$4;
                    DisclosureHeading_6vk1a7w$lambda$7$lambda$6$lambda$4 = DisclosureKt.DisclosureHeading_6vk1a7w$lambda$7$lambda$6$lambda$4(DisclosureScope.this);
                    return Boolean.valueOf(DisclosureHeading_6vk1a7w$lambda$7$lambda$6$lambda$4);
                }
            }, 1, null);
        } else {
            SemanticsPropertiesKt.expand$default(semantics, null, new Function0() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean DisclosureHeading_6vk1a7w$lambda$7$lambda$6$lambda$5;
                    DisclosureHeading_6vk1a7w$lambda$7$lambda$6$lambda$5 = DisclosureKt.DisclosureHeading_6vk1a7w$lambda$7$lambda$6$lambda$5(DisclosureScope.this);
                    return Boolean.valueOf(DisclosureHeading_6vk1a7w$lambda$7$lambda$6$lambda$5);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DisclosureHeading_6vk1a7w$lambda$7$lambda$6$lambda$4(DisclosureScope disclosureScope) {
        disclosureScope.getState$core_release().setExpanded(false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DisclosureHeading_6vk1a7w$lambda$7$lambda$6$lambda$5(DisclosureScope disclosureScope) {
        disclosureScope.getState$core_release().setExpanded(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisclosureHeading_6vk1a7w$lambda$9$lambda$8(DisclosureScope disclosureScope) {
        disclosureScope.getState$core_release().setExpanded(!disclosureScope.getState$core_release().getExpanded());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025f  */
    /* renamed from: DisclosureHeading-XMnMKNU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9512DisclosureHeadingXMnMKNU(final DisclosureScope DisclosureHeading, final Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, long j, long j2, PaddingValues paddingValues, long j3, float f, Indication indication, MutableInteractionSource mutableInteractionSource, Alignment.Vertical vertical, Arrangement.Horizontal horizontal, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Shape shape2;
        int i7;
        long j4;
        int i8;
        int i9;
        long j5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j6;
        int i19;
        Indication indication2;
        MutableInteractionSource mutableInteractionSource2;
        long j7;
        Modifier modifier3;
        PaddingValues paddingValues2;
        int i20;
        Shape shape3;
        float f2;
        final Alignment.Vertical vertical2;
        Arrangement.Horizontal horizontal2;
        Indication indication3;
        long j8;
        long j9;
        Composer composer2;
        final Arrangement.Horizontal horizontal3;
        final MutableInteractionSource mutableInteractionSource3;
        final Indication indication4;
        final float f3;
        final PaddingValues paddingValues3;
        final boolean z3;
        final Modifier modifier4;
        final long j10;
        final long j11;
        final Shape shape4;
        final long j12;
        ScopeUpdateScope endRestartGroup;
        int i21;
        Intrinsics.checkNotNullParameter(DisclosureHeading, "$this$DisclosureHeading");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-437608678);
        if ((i3 & 1) != 0) {
            i4 = i | 48;
        } else if ((i & 48) == 0) {
            i4 = (startRestartGroup.changedInstance(onClick) ? 32 : 16) | i;
        } else {
            i4 = i;
        }
        int i22 = i3 & 2;
        if (i22 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
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
                    shape2 = shape;
                    i4 |= startRestartGroup.changed(shape2) ? 16384 : 8192;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        j4 = j;
                    } else {
                        j4 = j;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(j4) ? 131072 : 65536;
                        }
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(j2)) ? 1048576 : 524288;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 100663296;
                        j5 = j3;
                    } else {
                        j5 = j3;
                        if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changed(j5) ? 67108864 : 33554432;
                        }
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i11 = i10;
                        i4 |= startRestartGroup.changed(f) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        if ((i2 & 6) == 0) {
                            if ((i3 & 512) == 0 && startRestartGroup.changed(indication)) {
                                i21 = 4;
                                i12 = i2 | i21;
                            }
                            i21 = 2;
                            i12 = i2 | i21;
                        } else {
                            i12 = i2;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i12 |= 48;
                            i14 = i13;
                        } else if ((i2 & 48) == 0) {
                            i14 = i13;
                            i12 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                        } else {
                            i14 = i13;
                        }
                        int i23 = i12;
                        i15 = i3 & 2048;
                        if (i15 != 0) {
                            i16 = i23 | 384;
                        } else {
                            int i24 = i23;
                            if ((i2 & 384) == 0) {
                                i24 |= startRestartGroup.changed(vertical) ? 256 : 128;
                            }
                            i16 = i24;
                        }
                        i17 = i3 & 4096;
                        if (i17 != 0) {
                            i18 = i16 | 3072;
                        } else {
                            int i25 = i16;
                            if ((i2 & 3072) == 0) {
                                i18 = i25 | (startRestartGroup.changed(horizontal) ? 2048 : 1024);
                            } else {
                                i18 = i25;
                            }
                        }
                        if ((i3 & 8192) != 0) {
                            i18 |= 24576;
                        } else if ((i2 & 24576) == 0) {
                            i18 |= startRestartGroup.changedInstance(content) ? 16384 : 8192;
                        }
                        if ((306783377 & i4) == 306783376 || (i18 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if (i6 != 0) {
                                    shape2 = RectangleShapeKt.getRectangleShape();
                                }
                                long m5693getUnspecified0d7_KjU = i7 != 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j4;
                                if ((i3 & 32) != 0) {
                                    ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    j6 = ((Color) consume).m5667unboximpl();
                                    i4 &= -3670017;
                                } else {
                                    j6 = j2;
                                }
                                PaddingValues noPadding = i8 != 0 ? UtilsKt.getNoPadding() : paddingValues;
                                if (i9 != 0) {
                                    j5 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                                }
                                float m8401constructorimpl = i11 != 0 ? Dp.m8401constructorimpl(0) : f;
                                if ((i3 & 512) != 0) {
                                    ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                                    int i26 = i18;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(localIndication);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    indication2 = (Indication) consume2;
                                    i19 = i26 & (-15);
                                } else {
                                    i19 = i18;
                                    indication2 = indication;
                                }
                                MutableInteractionSource mutableInteractionSource4 = i14 != 0 ? null : mutableInteractionSource;
                                Alignment.Vertical centerVertically = i15 != 0 ? Alignment.INSTANCE.getCenterVertically() : vertical;
                                if (i17 != 0) {
                                    Modifier modifier5 = modifier2;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                    j7 = m5693getUnspecified0d7_KjU;
                                    modifier3 = modifier5;
                                    vertical2 = centerVertically;
                                    horizontal2 = Arrangement.INSTANCE.getStart();
                                    paddingValues2 = noPadding;
                                    i20 = i4;
                                    shape3 = shape2;
                                    f2 = m8401constructorimpl;
                                } else {
                                    Modifier modifier6 = modifier2;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                    j7 = m5693getUnspecified0d7_KjU;
                                    modifier3 = modifier6;
                                    paddingValues2 = noPadding;
                                    i20 = i4;
                                    shape3 = shape2;
                                    f2 = m8401constructorimpl;
                                    vertical2 = centerVertically;
                                    horizontal2 = horizontal;
                                }
                                indication3 = indication2;
                                j8 = j5;
                                j9 = j6;
                                i18 = i19;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 32) != 0) {
                                    i4 &= -3670017;
                                }
                                if ((i3 & 512) != 0) {
                                    i18 &= -15;
                                }
                                paddingValues2 = paddingValues;
                                vertical2 = vertical;
                                horizontal2 = horizontal;
                                i20 = i4;
                                shape3 = shape2;
                                j7 = j4;
                                modifier3 = modifier2;
                                f2 = f;
                                indication3 = indication;
                                mutableInteractionSource2 = mutableInteractionSource;
                                j8 = j5;
                                j9 = j2;
                            }
                            startRestartGroup.endDefaults();
                            long j13 = j7;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-437608678, i20, i18, "com.composeunstyled.DisclosureHeading (Disclosure.kt:164)");
                            }
                            int i27 = i18;
                            int i28 = i20 >> 6;
                            boolean z4 = z2;
                            long j14 = j8;
                            Indication indication5 = indication3;
                            Shape shape5 = shape3;
                            composer2 = startRestartGroup;
                            PaddingValues paddingValues4 = paddingValues2;
                            ButtonKt.m9489ButtonY0X4mI(onClick, z4, shape5, j13, j9, paddingValues4, j14, f2, modifier3, 0, indication5, mutableInteractionSource2, horizontal2, vertical2, ComposableLambdaKt.rememberComposableLambda(565135500, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DisclosureKt$DisclosureHeading$5
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
                                        ComposerKt.traceEventStart(565135500, i29, -1, "com.composeunstyled.DisclosureHeading.<anonymous> (Disclosure.kt:180)");
                                    }
                                    content.invoke(composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), composer2, ((i20 >> 3) & 14) | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | (3670016 & i28) | (i28 & 29360128) | ((i20 << 18) & 234881024), (i27 & 14) | 24576 | (i27 & 112) | ((i27 >> 3) & 896) | ((i27 << 3) & 7168), 512);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            horizontal3 = horizontal2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            indication4 = indication5;
                            f3 = f2;
                            paddingValues3 = paddingValues4;
                            z3 = z4;
                            modifier4 = modifier3;
                            j10 = j14;
                            j11 = j9;
                            shape4 = shape5;
                            j12 = j13;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            mutableInteractionSource3 = mutableInteractionSource;
                            vertical2 = vertical;
                            horizontal3 = horizontal;
                            composer2 = startRestartGroup;
                            z3 = z2;
                            modifier4 = modifier2;
                            j11 = j2;
                            indication4 = indication;
                            Shape shape6 = shape2;
                            paddingValues3 = paddingValues;
                            f3 = f;
                            j10 = j5;
                            shape4 = shape6;
                            j12 = j4;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit DisclosureHeading_XMnMKNU$lambda$11;
                                    DisclosureHeading_XMnMKNU$lambda$11 = DisclosureKt.DisclosureHeading_XMnMKNU$lambda$11(DisclosureScope.this, onClick, modifier4, z3, shape4, j12, j11, paddingValues3, j10, f3, indication4, mutableInteractionSource3, vertical2, horizontal3, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return DisclosureHeading_XMnMKNU$lambda$11;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i11 = i10;
                    if ((i2 & 6) == 0) {
                    }
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    int i232 = i12;
                    i15 = i3 & 2048;
                    if (i15 != 0) {
                    }
                    i17 = i3 & 4096;
                    if (i17 != 0) {
                    }
                    if ((i3 & 8192) != 0) {
                    }
                    if ((306783377 & i4) == 306783376) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i3 & 512) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    indication3 = indication2;
                    j8 = j5;
                    j9 = j6;
                    i18 = i19;
                    startRestartGroup.endDefaults();
                    long j132 = j7;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i272 = i18;
                    int i282 = i20 >> 6;
                    boolean z42 = z2;
                    long j142 = j8;
                    Indication indication52 = indication3;
                    Shape shape52 = shape3;
                    composer2 = startRestartGroup;
                    PaddingValues paddingValues42 = paddingValues2;
                    ButtonKt.m9489ButtonY0X4mI(onClick, z42, shape52, j132, j9, paddingValues42, j142, f2, modifier3, 0, indication52, mutableInteractionSource2, horizontal2, vertical2, ComposableLambdaKt.rememberComposableLambda(565135500, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DisclosureKt$DisclosureHeading$5
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
                                ComposerKt.traceEventStart(565135500, i29, -1, "com.composeunstyled.DisclosureHeading.<anonymous> (Disclosure.kt:180)");
                            }
                            content.invoke(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), composer2, ((i20 >> 3) & 14) | (i282 & 112) | (i282 & 896) | (i282 & 7168) | (57344 & i282) | (458752 & i282) | (3670016 & i282) | (i282 & 29360128) | ((i20 << 18) & 234881024), (i272 & 14) | 24576 | (i272 & 112) | ((i272 >> 3) & 896) | ((i272 << 3) & 7168), 512);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    horizontal3 = horizontal2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    indication4 = indication52;
                    f3 = f2;
                    paddingValues3 = paddingValues42;
                    z3 = z42;
                    modifier4 = modifier3;
                    j10 = j142;
                    j11 = j9;
                    shape4 = shape52;
                    j12 = j132;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                shape2 = shape;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
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
                if ((i2 & 6) == 0) {
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                int i2322 = i12;
                i15 = i3 & 2048;
                if (i15 != 0) {
                }
                i17 = i3 & 4096;
                if (i17 != 0) {
                }
                if ((i3 & 8192) != 0) {
                }
                if ((306783377 & i4) == 306783376) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i22 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if ((i3 & 512) != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i17 != 0) {
                }
                indication3 = indication2;
                j8 = j5;
                j9 = j6;
                i18 = i19;
                startRestartGroup.endDefaults();
                long j1322 = j7;
                if (ComposerKt.isTraceInProgress()) {
                }
                int i2722 = i18;
                int i2822 = i20 >> 6;
                boolean z422 = z2;
                long j1422 = j8;
                Indication indication522 = indication3;
                Shape shape522 = shape3;
                composer2 = startRestartGroup;
                PaddingValues paddingValues422 = paddingValues2;
                ButtonKt.m9489ButtonY0X4mI(onClick, z422, shape522, j1322, j9, paddingValues422, j1422, f2, modifier3, 0, indication522, mutableInteractionSource2, horizontal2, vertical2, ComposableLambdaKt.rememberComposableLambda(565135500, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DisclosureKt$DisclosureHeading$5
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
                            ComposerKt.traceEventStart(565135500, i29, -1, "com.composeunstyled.DisclosureHeading.<anonymous> (Disclosure.kt:180)");
                        }
                        content.invoke(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), composer2, ((i20 >> 3) & 14) | (i2822 & 112) | (i2822 & 896) | (i2822 & 7168) | (57344 & i2822) | (458752 & i2822) | (3670016 & i2822) | (i2822 & 29360128) | ((i20 << 18) & 234881024), (i2722 & 14) | 24576 | (i2722 & 112) | ((i2722 >> 3) & 896) | ((i2722 << 3) & 7168), 512);
                if (ComposerKt.isTraceInProgress()) {
                }
                horizontal3 = horizontal2;
                mutableInteractionSource3 = mutableInteractionSource2;
                indication4 = indication522;
                f3 = f2;
                paddingValues3 = paddingValues422;
                z3 = z422;
                modifier4 = modifier3;
                j10 = j1422;
                j11 = j9;
                shape4 = shape522;
                j12 = j1322;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            shape2 = shape;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
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
            if ((i2 & 6) == 0) {
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            int i23222 = i12;
            i15 = i3 & 2048;
            if (i15 != 0) {
            }
            i17 = i3 & 4096;
            if (i17 != 0) {
            }
            if ((i3 & 8192) != 0) {
            }
            if ((306783377 & i4) == 306783376) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i22 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i17 != 0) {
            }
            indication3 = indication2;
            j8 = j5;
            j9 = j6;
            i18 = i19;
            startRestartGroup.endDefaults();
            long j13222 = j7;
            if (ComposerKt.isTraceInProgress()) {
            }
            int i27222 = i18;
            int i28222 = i20 >> 6;
            boolean z4222 = z2;
            long j14222 = j8;
            Indication indication5222 = indication3;
            Shape shape5222 = shape3;
            composer2 = startRestartGroup;
            PaddingValues paddingValues4222 = paddingValues2;
            ButtonKt.m9489ButtonY0X4mI(onClick, z4222, shape5222, j13222, j9, paddingValues4222, j14222, f2, modifier3, 0, indication5222, mutableInteractionSource2, horizontal2, vertical2, ComposableLambdaKt.rememberComposableLambda(565135500, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DisclosureKt$DisclosureHeading$5
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
                        ComposerKt.traceEventStart(565135500, i29, -1, "com.composeunstyled.DisclosureHeading.<anonymous> (Disclosure.kt:180)");
                    }
                    content.invoke(composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), composer2, ((i20 >> 3) & 14) | (i28222 & 112) | (i28222 & 896) | (i28222 & 7168) | (57344 & i28222) | (458752 & i28222) | (3670016 & i28222) | (i28222 & 29360128) | ((i20 << 18) & 234881024), (i27222 & 14) | 24576 | (i27222 & 112) | ((i27222 >> 3) & 896) | ((i27222 << 3) & 7168), 512);
            if (ComposerKt.isTraceInProgress()) {
            }
            horizontal3 = horizontal2;
            mutableInteractionSource3 = mutableInteractionSource2;
            indication4 = indication5222;
            f3 = f2;
            paddingValues3 = paddingValues4222;
            z3 = z4222;
            modifier4 = modifier3;
            j10 = j14222;
            j11 = j9;
            shape4 = shape5222;
            j12 = j13222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        shape2 = shape;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
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
        if ((i2 & 6) == 0) {
        }
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        int i232222 = i12;
        i15 = i3 & 2048;
        if (i15 != 0) {
        }
        i17 = i3 & 4096;
        if (i17 != 0) {
        }
        if ((i3 & 8192) != 0) {
        }
        if ((306783377 & i4) == 306783376) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i22 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i17 != 0) {
        }
        indication3 = indication2;
        j8 = j5;
        j9 = j6;
        i18 = i19;
        startRestartGroup.endDefaults();
        long j132222 = j7;
        if (ComposerKt.isTraceInProgress()) {
        }
        int i272222 = i18;
        int i282222 = i20 >> 6;
        boolean z42222 = z2;
        long j142222 = j8;
        Indication indication52222 = indication3;
        Shape shape52222 = shape3;
        composer2 = startRestartGroup;
        PaddingValues paddingValues42222 = paddingValues2;
        ButtonKt.m9489ButtonY0X4mI(onClick, z42222, shape52222, j132222, j9, paddingValues42222, j142222, f2, modifier3, 0, indication52222, mutableInteractionSource2, horizontal2, vertical2, ComposableLambdaKt.rememberComposableLambda(565135500, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DisclosureKt$DisclosureHeading$5
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
                    ComposerKt.traceEventStart(565135500, i29, -1, "com.composeunstyled.DisclosureHeading.<anonymous> (Disclosure.kt:180)");
                }
                content.invoke(composer3, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), composer2, ((i20 >> 3) & 14) | (i282222 & 112) | (i282222 & 896) | (i282222 & 7168) | (57344 & i282222) | (458752 & i282222) | (3670016 & i282222) | (i282222 & 29360128) | ((i20 << 18) & 234881024), (i272222 & 14) | 24576 | (i272222 & 112) | ((i272222 >> 3) & 896) | ((i272222 << 3) & 7168), 512);
        if (ComposerKt.isTraceInProgress()) {
        }
        horizontal3 = horizontal2;
        mutableInteractionSource3 = mutableInteractionSource2;
        indication4 = indication52222;
        f3 = f2;
        paddingValues3 = paddingValues42222;
        z3 = z42222;
        modifier4 = modifier3;
        j10 = j142222;
        j11 = j9;
        shape4 = shape52222;
        j12 = j132222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DisclosurePanel(final DisclosureScope disclosureScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        final Modifier modifier3;
        final EnterTransition enterTransition3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(disclosureScope, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-757394502);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(disclosureScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 1;
        if (i6 != 0) {
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
                    if ((i2 & 8) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(content) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            enterTransition2 = UtilsKt.getAppearInstantly();
                        }
                        if (i5 != 0) {
                            exitTransition2 = UtilsKt.getDisappearInstantly();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-757394502, i3, -1, "com.composeunstyled.DisclosurePanel (Disclosure.kt:198)");
                        }
                        EnterTransition enterTransition4 = enterTransition2;
                        Modifier modifier4 = companion;
                        AnimatedVisibilityKt.AnimatedVisibility(disclosureScope.getState$core_release().getExpanded(), modifier4, enterTransition4, exitTransition2, (String) null, ComposableLambdaKt.rememberComposableLambda(749395602, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DisclosureKt$DisclosurePanel$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i7) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(749395602, i7, -1, "com.composeunstyled.DisclosurePanel.<anonymous> (Disclosure.kt:205)");
                                }
                                content.invoke(composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 896) | (i3 & 7168), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        enterTransition3 = enterTransition4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        enterTransition3 = enterTransition2;
                    }
                    final ExitTransition exitTransition3 = exitTransition2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.DisclosureKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit DisclosurePanel$lambda$12;
                                DisclosurePanel$lambda$12 = DisclosureKt.DisclosurePanel$lambda$12(DisclosureScope.this, modifier3, enterTransition3, exitTransition3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return DisclosurePanel$lambda$12;
                            }
                        });
                        return;
                    }
                    return;
                }
                exitTransition2 = exitTransition;
                if ((i2 & 8) == 0) {
                }
                if ((i3 & 9363) == 9362) {
                }
                if (i6 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                EnterTransition enterTransition42 = enterTransition2;
                Modifier modifier42 = companion;
                AnimatedVisibilityKt.AnimatedVisibility(disclosureScope.getState$core_release().getExpanded(), modifier42, enterTransition42, exitTransition2, (String) null, ComposableLambdaKt.rememberComposableLambda(749395602, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DisclosureKt$DisclosurePanel$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(749395602, i7, -1, "com.composeunstyled.DisclosurePanel.<anonymous> (Disclosure.kt:205)");
                        }
                        content.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 896) | (i3 & 7168), 16);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
                enterTransition3 = enterTransition42;
                final ExitTransition exitTransition32 = exitTransition2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            if ((i2 & 8) == 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            if (i6 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            EnterTransition enterTransition422 = enterTransition2;
            Modifier modifier422 = companion;
            AnimatedVisibilityKt.AnimatedVisibility(disclosureScope.getState$core_release().getExpanded(), modifier422, enterTransition422, exitTransition2, (String) null, ComposableLambdaKt.rememberComposableLambda(749395602, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DisclosureKt$DisclosurePanel$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i7) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(749395602, i7, -1, "com.composeunstyled.DisclosurePanel.<anonymous> (Disclosure.kt:205)");
                    }
                    content.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 896) | (i3 & 7168), 16);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier422;
            enterTransition3 = enterTransition422;
            final ExitTransition exitTransition322 = exitTransition2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
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
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        if (i6 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        EnterTransition enterTransition4222 = enterTransition2;
        Modifier modifier4222 = companion;
        AnimatedVisibilityKt.AnimatedVisibility(disclosureScope.getState$core_release().getExpanded(), modifier4222, enterTransition4222, exitTransition2, (String) null, ComposableLambdaKt.rememberComposableLambda(749395602, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DisclosureKt$DisclosurePanel$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i7) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(749395602, i7, -1, "com.composeunstyled.DisclosurePanel.<anonymous> (Disclosure.kt:205)");
                }
                content.invoke(composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 896) | (i3 & 7168), 16);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4222;
        enterTransition3 = enterTransition4222;
        final ExitTransition exitTransition3222 = exitTransition2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
