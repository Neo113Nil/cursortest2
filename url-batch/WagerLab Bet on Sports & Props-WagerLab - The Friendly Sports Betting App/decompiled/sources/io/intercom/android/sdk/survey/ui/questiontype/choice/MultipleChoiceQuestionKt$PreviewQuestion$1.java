package io.intercom.android.sdk.survey.ui.questiontype.choice;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultipleChoiceQuestion.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class MultipleChoiceQuestionKt$PreviewQuestion$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SurveyUiColors $surveyUiColors;

    MultipleChoiceQuestionKt$PreviewQuestion$1(SurveyUiColors surveyUiColors) {
        this.$surveyUiColors = surveyUiColors;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            MultipleChoiceQuestionKt.MultipleChoiceQuestion(null, new SurveyData.Step.Question.MultipleChoiceQuestionModel(uuid, CollectionsKt.listOf(new Block.Builder().withText("Question Title")), true, CollectionsKt.listOf((Object[]) new String[]{"Option A", "Option B", "Option C", "Option D", "Option E"}), true, 2, 3), new Answer.MultipleAnswer(SetsKt.setOf((Object[]) new String[]{"Option B", "Option D"}), Answer.MultipleAnswer.OtherAnswer.SelectedNoText.INSTANCE), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt$PreviewQuestion$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = MultipleChoiceQuestionKt$PreviewQuestion$1.invoke$lambda$0((Answer) obj);
                    return invoke$lambda$0;
                }
            }, this.$surveyUiColors, null, composer, 3648, 33);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Answer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
