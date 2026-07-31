package com.composeunstyled;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextField.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TextFieldKt$TextField$3 implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $borderColor;
    final /* synthetic */ float $borderWidth;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $editable;
    final /* synthetic */ MutableState<Boolean> $isFocusedOnIcon$delegate;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ TextStyle $overriddenStyle;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ float $spacing;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;

    /* JADX WARN: Multi-variable type inference failed */
    TextFieldKt$TextField$3(float f, Alignment.Vertical vertical, float f2, long j, Shape shape, long j2, boolean z, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, MutableState<Boolean> mutableState, String str, TextStyle textStyle, String str2, int i, int i2) {
        this.$spacing = f;
        this.$verticalAlignment = vertical;
        this.$borderWidth = f2;
        this.$borderColor = j;
        this.$shape = shape;
        this.$backgroundColor = j2;
        this.$editable = z;
        this.$contentPadding = paddingValues;
        this.$leadingIcon = function2;
        this.$trailingIcon = function22;
        this.$isFocusedOnIcon$delegate = mutableState;
        this.$value = str;
        this.$overriddenStyle = textStyle;
        this.$placeholder = str2;
        this.$minLines = i;
        this.$maxLines = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
        invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$2$lambda$1(MutableState mutableState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TextFieldKt.TextField_RM0IcR4$lambda$8(mutableState, it.getHasFocus());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$5$lambda$4(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$8$lambda$7(MutableState mutableState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TextFieldKt.TextField_RM0IcR4$lambda$8(mutableState, it.getHasFocus());
        return Unit.INSTANCE;
    }

    public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i) {
        int i2;
        TextStyle textStyle;
        MutableState<Boolean> mutableState;
        String str;
        String str2;
        String str3;
        String str4;
        Function2<Composer, Integer, Unit> function2;
        final MutableState<Boolean> mutableState2;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((i & 6) == 0) {
            i2 = i | (composer2.changedInstance(innerTextField) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1016516949, i2, -1, "com.composeunstyled.TextField.<anonymous> (TextField.kt:157)");
        }
        float f = this.$borderWidth;
        long j = this.$borderColor;
        Shape shape = this.$shape;
        long j2 = this.$backgroundColor;
        boolean z = this.$editable;
        PaddingValues paddingValues = this.$contentPadding;
        List createListBuilder = CollectionsKt.createListBuilder();
        if (!Float.isNaN(f) && Dp.m8400compareTo0680j_4(f, Dp.m8401constructorimpl(0)) > 0 && j != 16) {
            createListBuilder.add(BorderKt.m274borderxT4_qwU(Modifier.INSTANCE, f, j, shape));
        }
        createListBuilder.add(BackgroundKt.m261backgroundbw27NRU(Modifier.INSTANCE, j2, shape));
        if (!z) {
            createListBuilder.add(PointerIconKt.pointerHoverIcon$default(Modifier.INSTANCE, PointerIcon.INSTANCE.getDefault(), false, 2, null));
        }
        createListBuilder.add(PaddingKt.padding(Modifier.INSTANCE, paddingValues));
        List build = CollectionsKt.build(createListBuilder);
        Modifier.Companion companion = Modifier.INSTANCE;
        Intrinsics.checkNotNull(companion, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
        Modifier.Companion companion2 = companion;
        Iterator it = build.iterator();
        while (it.hasNext()) {
            companion2 = companion2.then((Modifier) it.next());
        }
        Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(this.$spacing);
        Alignment.Vertical vertical = this.$verticalAlignment;
        Function2<Composer, Integer, Unit> function22 = this.$leadingIcon;
        Function2<Composer, Integer, Unit> function23 = this.$trailingIcon;
        final MutableState<Boolean> mutableState3 = this.$isFocusedOnIcon$delegate;
        String str5 = this.$value;
        int i3 = i2;
        TextStyle textStyle2 = this.$overriddenStyle;
        String str6 = this.$placeholder;
        int i4 = this.$minLines;
        int i5 = this.$maxLines;
        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, vertical, composer2, 0);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
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
        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composer2.startReplaceGroup(1618170700);
        if (function22 != null) {
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composer2.startReplaceGroup(5004770);
            Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.composeunstyled.TextFieldKt$TextField$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$10$lambda$2$lambda$1;
                        invoke$lambda$10$lambda$2$lambda$1 = TextFieldKt$TextField$3.invoke$lambda$10$lambda$2$lambda$1(MutableState.this, (FocusState) obj);
                        return invoke$lambda$10$lambda$2$lambda$1;
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            composer2.endReplaceGroup();
            Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(companion3, (Function1) rememberedValue);
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            textStyle = textStyle2;
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, onFocusChanged);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            mutableState = mutableState3;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer m4976constructorimpl2 = Updater.m4976constructorimpl(composer2);
            Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function22.invoke(composer2, 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
        } else {
            textStyle = textStyle2;
            mutableState = mutableState3;
        }
        composer2.endReplaceGroup();
        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
        composer2.startReplaceGroup(1849434622);
        Object rememberedValue2 = composer2.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: com.composeunstyled.TextFieldKt$TextField$3$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$10$lambda$5$lambda$4;
                    invoke$lambda$10$lambda$5$lambda$4 = TextFieldKt$TextField$3.invoke$lambda$10$lambda$5$lambda$4((SemanticsPropertyReceiver) obj);
                    return invoke$lambda$10$lambda$5$lambda$4;
                }
            };
            composer2.updateRememberedValue(rememberedValue2);
        }
        composer2.endReplaceGroup();
        Modifier semantics = SemanticsModifierKt.semantics(weight$default, true, (Function1) rememberedValue2);
        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, semantics);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor3);
        } else {
            composer2.useNode();
        }
        Composer m4976constructorimpl3 = Updater.m4976constructorimpl(composer2);
        Updater.m4983setimpl(m4976constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m4976constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4976constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        innerTextField.invoke(composer2, Integer.valueOf(i3 & 14));
        composer2.startReplaceGroup(-856801362);
        if (str5.length() == 0) {
            function2 = function23;
            str = "C72@3468L9:Box.kt#2w3rfo";
            str3 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            str2 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
            str4 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
            mutableState2 = mutableState;
            TextKt.m9556Text4CEPv18(str6, null, textStyle, 0, 0L, 0L, 0L, null, Color.m5656copywmQWz5c$default(textStyle.m7865getColor0d7_KjU(), 0.66f, 0.0f, 0.0f, 0.0f, 14, null), null, false, i4, i5, 0, composer, 0, 0, 9978);
            composer2 = composer;
        } else {
            str = "C72@3468L9:Box.kt#2w3rfo";
            str2 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
            str3 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            str4 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
            function2 = function23;
            mutableState2 = mutableState;
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.startReplaceGroup(1618194414);
        if (function2 != null) {
            Modifier.Companion companion4 = Modifier.INSTANCE;
            composer2.startReplaceGroup(5004770);
            Object rememberedValue3 = composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: com.composeunstyled.TextFieldKt$TextField$3$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$10$lambda$8$lambda$7;
                        invoke$lambda$10$lambda$8$lambda$7 = TextFieldKt$TextField$3.invoke$lambda$10$lambda$8$lambda$7(MutableState.this, (FocusState) obj);
                        return invoke$lambda$10$lambda$8$lambda$7;
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            composer2.endReplaceGroup();
            Modifier onFocusChanged2 = FocusChangedModifierKt.onFocusChanged(companion4, (Function1) rememberedValue3);
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str2);
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str4);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, onFocusChanged2);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str3);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer m4976constructorimpl4 = Updater.m4976constructorimpl(composer2);
            Updater.m4983setimpl(m4976constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl4.getInserting() || !Intrinsics.areEqual(m4976constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m4976constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4976constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m4983setimpl(m4976constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, str);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            function2.invoke(composer2, 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
