package io.intercom.android.sdk.survey.ui.questiontype.files;

import android.content.Context;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploadFileQuestion.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ah\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\t2\u0013\b\u0002\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"UploadFileQuestion", "", "modifier", "Landroidx/compose/ui/Modifier;", "questionModel", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$UploadFileQuestionModel;", "answer", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "onAnswer", "Lkotlin/Function1;", "onAnswerClick", "Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;", "questionHeader", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$UploadFileQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "UploadFileQuestionPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UploadFileQuestionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadFileQuestion$lambda$1(Modifier modifier, SurveyData.Step.Question.UploadFileQuestionModel questionModel, Answer answer, Function1 onAnswer, Function1 function1, Function2 function2, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(questionModel, "$questionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        UploadFileQuestion(modifier, questionModel, answer, onAnswer, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadFileQuestionPreview$lambda$2(int i, Composer composer, int i2) {
        UploadFileQuestionPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadFileQuestion$lambda$0(AnswerClickData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void UploadFileQuestion(Modifier modifier, final SurveyData.Step.Question.UploadFileQuestionModel questionModel, Answer answer, final Function1<? super Answer, Unit> onAnswer, Function1<? super AnswerClickData, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(questionModel, "questionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        Composer startRestartGroup = composer.startRestartGroup(1688907441);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        Answer answer2 = (i2 & 4) != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer;
        Function1<? super AnswerClickData, Unit> function12 = (i2 & 16) != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit UploadFileQuestion$lambda$0;
                UploadFileQuestion$lambda$0 = UploadFileQuestionKt.UploadFileQuestion$lambda$0((AnswerClickData) obj);
                return UploadFileQuestion$lambda$0;
            }
        } : function1;
        Function2<? super Composer, ? super Integer, Unit> m11818getLambda1$intercom_sdk_base_release = (i2 & 32) != 0 ? ComposableSingletons$UploadFileQuestionKt.INSTANCE.m11818getLambda1$intercom_sdk_base_release() : function2;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Modifier modifier3 = modifier2;
        final Answer answer3 = answer2;
        final Function1<? super AnswerClickData, Unit> function13 = function12;
        SurfaceKt.m3409SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1739158412, true, new UploadFileQuestionKt$UploadFileQuestion$2(modifier2, m11818getLambda1$intercom_sdk_base_release, answer2, questionModel, function12, onAnswer, (Context) consume), startRestartGroup, 54), startRestartGroup, 12582912, 127);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function22 = m11818getLambda1$intercom_sdk_base_release;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UploadFileQuestion$lambda$1;
                    UploadFileQuestion$lambda$1 = UploadFileQuestionKt.UploadFileQuestion$lambda$1(Modifier.this, questionModel, answer3, onAnswer, function13, function22, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return UploadFileQuestion$lambda$1;
                }
            });
        }
    }

    private static final void UploadFileQuestionPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(21672603);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$UploadFileQuestionKt.INSTANCE.m11819getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UploadFileQuestionPreview$lambda$2;
                    UploadFileQuestionPreview$lambda$2 = UploadFileQuestionKt.UploadFileQuestionPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return UploadFileQuestionPreview$lambda$2;
                }
            });
        }
    }
}
