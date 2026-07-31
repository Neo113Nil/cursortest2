package io.intercom.android.sdk.survey.ui.questiontype;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnswerClickData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;", "", "clickedItem", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "questionId", "", "<init>", "(Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;Ljava/lang/String;)V", "getClickedItem", "()Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "getQuestionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AnswerClickData {
    public static final int $stable = 8;
    private final Answer.MediaAnswer.MediaItem clickedItem;
    private final String questionId;

    public static /* synthetic */ AnswerClickData copy$default(AnswerClickData answerClickData, Answer.MediaAnswer.MediaItem mediaItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaItem = answerClickData.clickedItem;
        }
        if ((i & 2) != 0) {
            str = answerClickData.questionId;
        }
        return answerClickData.copy(mediaItem, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Answer.MediaAnswer.MediaItem getClickedItem() {
        return this.clickedItem;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuestionId() {
        return this.questionId;
    }

    public final AnswerClickData copy(Answer.MediaAnswer.MediaItem clickedItem, String questionId) {
        Intrinsics.checkNotNullParameter(clickedItem, "clickedItem");
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        return new AnswerClickData(clickedItem, questionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnswerClickData)) {
            return false;
        }
        AnswerClickData answerClickData = (AnswerClickData) other;
        return Intrinsics.areEqual(this.clickedItem, answerClickData.clickedItem) && Intrinsics.areEqual(this.questionId, answerClickData.questionId);
    }

    public int hashCode() {
        return (this.clickedItem.hashCode() * 31) + this.questionId.hashCode();
    }

    public String toString() {
        return "AnswerClickData(clickedItem=" + this.clickedItem + ", questionId=" + this.questionId + ')';
    }

    public AnswerClickData(Answer.MediaAnswer.MediaItem clickedItem, String questionId) {
        Intrinsics.checkNotNullParameter(clickedItem, "clickedItem");
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        this.clickedItem = clickedItem;
        this.questionId = questionId;
    }

    public final Answer.MediaAnswer.MediaItem getClickedItem() {
        return this.clickedItem;
    }

    public final String getQuestionId() {
        return this.questionId;
    }
}
