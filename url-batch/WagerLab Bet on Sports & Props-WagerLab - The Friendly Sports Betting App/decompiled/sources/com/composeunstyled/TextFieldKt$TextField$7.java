package com.composeunstyled;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextField.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TextFieldKt$TextField$7 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function3<TextFieldScope, Composer, Integer, Unit> $content;
    final /* synthetic */ Brush $cursorBrush;
    final /* synthetic */ boolean $editable;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ TextStyle $newTextStyle;
    final /* synthetic */ Function1<String, Unit> $onValueChange;
    final /* synthetic */ TextFieldScope $scope;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ State<TextFieldValue> $textFieldValue$delegate;
    final /* synthetic */ MutableState<TextRange> $textRange$delegate;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX WARN: Multi-variable type inference failed */
    TextFieldKt$TextField$7(boolean z, Modifier modifier, TextFieldScope textFieldScope, Function1<? super String, Unit> function1, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z2, int i, int i2, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, Brush brush, State<TextFieldValue> state, MutableState<TextRange> mutableState, Function3<? super TextFieldScope, ? super Composer, ? super Integer, Unit> function3) {
        this.$editable = z;
        this.$modifier = modifier;
        this.$scope = textFieldScope;
        this.$onValueChange = function1;
        this.$newTextStyle = textStyle;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$singleLine = z2;
        this.$maxLines = i;
        this.$minLines = i2;
        this.$visualTransformation = visualTransformation;
        this.$interactionSource = mutableInteractionSource;
        this.$cursorBrush = brush;
        this.$textFieldValue$delegate = state;
        this.$textRange$delegate = mutableState;
        this.$content = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(TextFieldScope textFieldScope, Function1 function1, MutableState mutableState, TextFieldValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!textFieldScope.isTrailingFocused$core_release() && !textFieldScope.isLeadingFocused$core_release()) {
            function1.invoke(it.getText());
            TextFieldKt.TextField_PNcJ320$lambda$22(mutableState, it.getSelection());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        TextFieldValue TextField_PNcJ320$lambda$25;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1850143247, i, -1, "com.composeunstyled.TextField.<anonymous> (TextField.kt:274)");
        }
        if (this.$editable) {
            composer.startReplaceGroup(302229050);
            TextField_PNcJ320$lambda$25 = TextFieldKt.TextField_PNcJ320$lambda$25(this.$textFieldValue$delegate);
            Modifier modifier = this.$modifier;
            composer.startReplaceGroup(1849434622);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.composeunstyled.TextFieldKt$TextField$7$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = TextFieldKt$TextField$7.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            Modifier focusGroup = FocusableKt.focusGroup(SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue));
            composer.startReplaceGroup(-1746271574);
            boolean changedInstance = composer.changedInstance(this.$scope) | composer.changed(this.$onValueChange);
            final TextFieldScope textFieldScope = this.$scope;
            final Function1<String, Unit> function1 = this.$onValueChange;
            final MutableState<TextRange> mutableState = this.$textRange$delegate;
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: com.composeunstyled.TextFieldKt$TextField$7$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$3$lambda$2;
                        invoke$lambda$3$lambda$2 = TextFieldKt$TextField$7.invoke$lambda$3$lambda$2(TextFieldScope.this, function1, mutableState, (TextFieldValue) obj);
                        return invoke$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            composer.endReplaceGroup();
            boolean z = this.$editable;
            TextStyle textStyle = this.$newTextStyle;
            KeyboardOptions keyboardOptions = this.$keyboardOptions;
            KeyboardActions keyboardActions = this.$keyboardActions;
            boolean z2 = this.$singleLine;
            int i2 = this.$maxLines;
            int i3 = this.$minLines;
            VisualTransformation visualTransformation = this.$visualTransformation;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            Brush brush = this.$cursorBrush;
            final TextFieldScope textFieldScope2 = this.$scope;
            final Function3<TextFieldScope, Composer, Integer, Unit> function3 = this.$content;
            BasicTextFieldKt.BasicTextField(TextField_PNcJ320$lambda$25, (Function1<? super TextFieldValue, Unit>) function12, focusGroup, z, false, textStyle, keyboardOptions, keyboardActions, z2, i2, i3, visualTransformation, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, brush, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-604312537, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.composeunstyled.TextFieldKt$TextField$7.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                    invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                    if ((i4 & 6) == 0) {
                        i4 |= composer2.changedInstance(innerTextField) ? 4 : 2;
                    }
                    if ((i4 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-604312537, i4, -1, "com.composeunstyled.TextField.<anonymous>.<anonymous> (TextField.kt:297)");
                    }
                    TextFieldScope.this.setInnerTextField$core_release(innerTextField);
                    Modifier pointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(Modifier.INSTANCE, PointerIcon.INSTANCE.getDefault(), false, 2, null);
                    Function3<TextFieldScope, Composer, Integer, Unit> function32 = function3;
                    TextFieldScope textFieldScope3 = TextFieldScope.this;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, pointerHoverIcon$default);
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
                    function32.invoke(textFieldScope3, composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4112);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(303584091);
            Modifier modifier2 = this.$modifier;
            Function3<TextFieldScope, Composer, Integer, Unit> function32 = this.$content;
            TextFieldScope textFieldScope3 = this.$scope;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier2);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            function32.invoke(textFieldScope3, composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
