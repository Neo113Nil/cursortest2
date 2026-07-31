package io.intercom.android.sdk.tickets.create.model;

import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTicketViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"formatAnswerForServer", "", "questionState", "Lio/intercom/android/sdk/survey/QuestionState;", "EmailId", "", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CreateTicketViewModelKt {
    public static final String EmailId = "-1";

    /* compiled from: CreateTicketViewModel.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionValidation.ValidationType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object formatAnswerForServer(QuestionState questionState) {
        Answer answer = questionState.getAnswer();
        if (answer instanceof Answer.DateTimeAnswer) {
            return ((Answer.DateTimeAnswer) answer).getAnswer();
        }
        if (answer instanceof Answer.MultipleAnswer) {
            return ((Answer.MultipleAnswer) answer).m11764getAnswers().toString();
        }
        if (Intrinsics.areEqual(answer, Answer.NoAnswer.InitialNoAnswer.INSTANCE) || Intrinsics.areEqual(answer, Answer.NoAnswer.ResetNoAnswer.INSTANCE)) {
            return Unit.INSTANCE;
        }
        if (answer instanceof Answer.SingleAnswer) {
            SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
            if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                return Boolean.valueOf(Boolean.parseBoolean(((Answer.SingleAnswer) answer).getAnswer()));
            }
            if (!(questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel)) {
                return ((Answer.SingleAnswer) answer).getAnswer();
            }
            int i = WhenMappings.$EnumSwitchMapping$0[((SurveyData.Step.Question.ShortTextQuestionModel) questionModel).getValidationType().ordinal()];
            if (i == 1) {
                return Integer.valueOf(Integer.parseInt(((Answer.SingleAnswer) answer).getAnswer()));
            }
            if (i == 2) {
                return Float.valueOf(Float.parseFloat(((Answer.SingleAnswer) answer).getAnswer()));
            }
            if (i == 3) {
                return Integer.valueOf(Integer.parseInt(((Answer.SingleAnswer) answer).getAnswer()));
            }
            return ((Answer.SingleAnswer) answer).getAnswer();
        }
        if (!(answer instanceof Answer.MediaAnswer)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList = new ArrayList();
        List<Answer.MediaAnswer.MediaItem> mediaItems = ((Answer.MediaAnswer) answer).getMediaItems();
        ArrayList<Answer.MediaAnswer.FileUploadStatus> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(mediaItems, 10));
        Iterator<T> it = mediaItems.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Answer.MediaAnswer.MediaItem) it.next()).getUploadStatus());
        }
        for (Answer.MediaAnswer.FileUploadStatus fileUploadStatus : arrayList2) {
            if (fileUploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Success) {
                arrayList.add(Integer.valueOf(((Answer.MediaAnswer.FileUploadStatus.Success) fileUploadStatus).getId()));
            }
        }
        return arrayList;
    }
}
