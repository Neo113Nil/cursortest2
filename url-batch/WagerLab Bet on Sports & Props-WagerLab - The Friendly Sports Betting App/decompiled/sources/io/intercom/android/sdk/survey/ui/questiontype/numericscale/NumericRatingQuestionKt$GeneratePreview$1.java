package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: NumericRatingQuestion.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class NumericRatingQuestionKt$GeneratePreview$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Answer $answer;
    final /* synthetic */ int $end;
    final /* synthetic */ SurveyData.Step.Question.QuestionData.QuestionSubType $questionSubType;
    final /* synthetic */ int $start;

    /* compiled from: NumericRatingQuestion.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionData.QuestionSubType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    NumericRatingQuestionKt$GeneratePreview$1(SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, int i, int i2, Answer answer) {
        this.$questionSubType = questionSubType;
        this.$start = i;
        this.$end = i2;
        this.$answer = answer;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ArrayList arrayList;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            List listOf = CollectionsKt.listOf(new Block.Builder().withText("How cool is this preview?"));
            if (WhenMappings.$EnumSwitchMapping$0[this.$questionSubType.ordinal()] == 1) {
                arrayList = CollectionsKt.listOf((Object[]) new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption[]{new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(1, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😖"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(2, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😕"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(3, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😐"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(4, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😃"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(5, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "🤩")});
            } else {
                IntRange intRange = new IntRange(this.$start, this.$end);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
                Iterator<Integer> it = intRange.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption(((IntIterator) it).nextInt()));
                }
                arrayList = arrayList2;
            }
            NumericRatingQuestionKt.NumericRatingQuestion(null, new SurveyData.Step.Question.NumericRatingQuestionModel(uuid, listOf, true, arrayList, "Not likely", "Very likely", this.$start, this.$end, this.$questionSubType), this.$answer, new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt$GeneratePreview$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1;
                    invoke$lambda$1 = NumericRatingQuestionKt$GeneratePreview$1.invoke$lambda$1((Answer) obj);
                    return invoke$lambda$1;
                }
            }, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), null, composer, 3136, 33);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Answer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
