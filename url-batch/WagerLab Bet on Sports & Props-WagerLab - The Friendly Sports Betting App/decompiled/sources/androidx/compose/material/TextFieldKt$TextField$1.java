package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\n"}, d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldKt$TextField$1 implements TextFieldDecorator {
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ TextFieldLineLimits $lineLimits;
    final /* synthetic */ OutputTransformation $outputTransformation;
    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

    /* JADX WARN: Multi-variable type inference failed */
    TextFieldKt$TextField$1(OutputTransformation outputTransformation, TextFieldState textFieldState, TextFieldLineLimits textFieldLineLimits, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, TextFieldColors textFieldColors) {
        this.$outputTransformation = outputTransformation;
        this.$state = textFieldState;
        this.$lineLimits = textFieldLineLimits;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$isError = z2;
        this.$label = function2;
        this.$placeholder = function22;
        this.$leadingIcon = function23;
        this.$trailingIcon = function24;
        this.$shape = shape;
        this.$colors = textFieldColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Decoration$lambda$2(TextFieldKt$TextField$1 textFieldKt$TextField$1, Function2 function2, int i, Composer composer, int i2) {
        textFieldKt$TextField$1.Decoration(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        TextFieldBuffer textFieldBuffer;
        String obj;
        Composer startRestartGroup = composer.startRestartGroup(-1516988351);
        ComposerKt.sourceInformation(startRestartGroup, "C(Decoration)N(innerTextField)239@12524L606:TextField.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1516988351, i2, -1, "androidx.compose.material.TextField.<no name provided>.Decoration (TextField.kt:226)");
            }
            if (this.$outputTransformation == null) {
                obj = this.$state.getText().toString();
            } else {
                TextFieldState textFieldState = this.$state;
                TextFieldBuffer startEdit = textFieldState.startEdit();
                try {
                    textFieldState.commitEdit(startEdit);
                    textFieldState.finishEditing();
                    OutputTransformation outputTransformation = this.$outputTransformation;
                    if (startEdit == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("buffer");
                        textFieldBuffer = null;
                    } else {
                        textFieldBuffer = startEdit;
                    }
                    outputTransformation.transformOutput(textFieldBuffer);
                    obj = startEdit.asCharSequence().toString();
                } catch (Throwable th) {
                    textFieldState.finishEditing();
                    throw th;
                }
            }
            composer2 = startRestartGroup;
            String str = obj;
            TextFieldDefaults.INSTANCE.TextFieldDecorationBox(str, function2, this.$enabled, Intrinsics.areEqual(this.$lineLimits, TextFieldLineLimits.SingleLine.INSTANCE), VisualTransformation.INSTANCE.getNone(), this.$interactionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$shape, this.$colors, null, composer2, ((i2 << 3) & 112) | 24576, 24576, 8192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextFieldKt$TextField$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit Decoration$lambda$2;
                    Decoration$lambda$2 = TextFieldKt$TextField$1.Decoration$lambda$2(TextFieldKt$TextField$1.this, function2, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return Decoration$lambda$2;
                }
            });
        }
    }
}
