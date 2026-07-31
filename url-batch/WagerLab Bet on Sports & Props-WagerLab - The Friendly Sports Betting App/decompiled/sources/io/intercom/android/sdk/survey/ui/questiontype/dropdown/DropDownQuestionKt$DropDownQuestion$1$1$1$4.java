package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DropDownQuestion.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class DropDownQuestionKt$DropDownQuestion$1$1$1$4 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ SurveyData.Step.Question.DropDownQuestionModel $dropDownQuestionModel;
    final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ Function1<Answer, Unit> $onAnswer;

    /* JADX WARN: Multi-variable type inference failed */
    DropDownQuestionKt$DropDownQuestion$1$1$1$4(SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel, FocusManager focusManager, Function1<? super Answer, Unit> function1, MutableState<Boolean> mutableState) {
        this.$dropDownQuestionModel = dropDownQuestionModel;
        this.$focusManager = focusManager;
        this.$onAnswer = function1;
        this.$expanded$delegate = mutableState;
    }

    /* compiled from: DropDownQuestion.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$1", f = "DropDownQuestion.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FocusManager $focusManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FocusManager focusManager, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$focusManager = focusManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$focusManager, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FocusManager.clearFocus$default(this.$focusManager, false, 1, null);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope DropdownMenu, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        if ((i & 81) != 16 || !composer2.getSkipping()) {
            EffectsKt.LaunchedEffect("", new AnonymousClass1(this.$focusManager, null), composer2, 70);
            List<String> options = this.$dropDownQuestionModel.getOptions();
            final Function1<Answer, Unit> function1 = this.$onAnswer;
            final MutableState<Boolean> mutableState = this.$expanded$delegate;
            int i2 = 0;
            for (Object obj : options) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final String str = (String) obj;
                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-864903633, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i4) {
                        if ((i4 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                        } else {
                            TextKt.m3581TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), composer3, 0, 0, 131070);
                        }
                    }
                }, composer2, 54);
                composer2.startReplaceGroup(55713838);
                boolean changed = composer2.changed(function1) | composer2.changed(str);
                Object rememberedValue = composer2.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$2$lambda$1$lambda$0;
                            invoke$lambda$2$lambda$1$lambda$0 = DropDownQuestionKt$DropDownQuestion$1$1$1$4.invoke$lambda$2$lambda$1$lambda$0(Function1.this, str, mutableState);
                            return invoke$lambda$2$lambda$1$lambda$0;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                composer2.endReplaceGroup();
                AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (Function0) rememberedValue, null, null, null, false, null, null, null, composer2, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
                composer2 = composer;
                i2 = i3;
            }
            return;
        }
        composer2.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 onAnswer, String optionText, MutableState expanded$delegate) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(optionText, "$optionText");
        Intrinsics.checkNotNullParameter(expanded$delegate, "$expanded$delegate");
        onAnswer.invoke(new Answer.SingleAnswer(optionText));
        DropDownQuestionKt.DropDownQuestion$lambda$2(expanded$delegate, false);
        return Unit.INSTANCE;
    }
}
