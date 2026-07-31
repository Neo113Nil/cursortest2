package io.intercom.android.sdk.survey.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubmitSurveyRequest.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/survey/model/SubmitSurveyRequest;", "", "surveyProgressId", "", "currentStepId", "responses", "", "Lio/intercom/android/sdk/survey/model/SubmitSurveyRequestItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSurveyProgressId", "()Ljava/lang/String;", "getCurrentStepId", "getResponses", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SubmitSurveyRequest {
    public static final int $stable = 8;

    @SerializedName("current_step_id")
    private final String currentStepId;

    @SerializedName("responses")
    private final List<SubmitSurveyRequestItem> responses;

    @SerializedName("survey_progress_id")
    private final String surveyProgressId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmitSurveyRequest copy$default(SubmitSurveyRequest submitSurveyRequest, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitSurveyRequest.surveyProgressId;
        }
        if ((i & 2) != 0) {
            str2 = submitSurveyRequest.currentStepId;
        }
        if ((i & 4) != 0) {
            list = submitSurveyRequest.responses;
        }
        return submitSurveyRequest.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrentStepId() {
        return this.currentStepId;
    }

    public final List<SubmitSurveyRequestItem> component3() {
        return this.responses;
    }

    public final SubmitSurveyRequest copy(String surveyProgressId, String currentStepId, List<SubmitSurveyRequestItem> responses) {
        Intrinsics.checkNotNullParameter(surveyProgressId, "surveyProgressId");
        Intrinsics.checkNotNullParameter(currentStepId, "currentStepId");
        Intrinsics.checkNotNullParameter(responses, "responses");
        return new SubmitSurveyRequest(surveyProgressId, currentStepId, responses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitSurveyRequest)) {
            return false;
        }
        SubmitSurveyRequest submitSurveyRequest = (SubmitSurveyRequest) other;
        return Intrinsics.areEqual(this.surveyProgressId, submitSurveyRequest.surveyProgressId) && Intrinsics.areEqual(this.currentStepId, submitSurveyRequest.currentStepId) && Intrinsics.areEqual(this.responses, submitSurveyRequest.responses);
    }

    public int hashCode() {
        return (((this.surveyProgressId.hashCode() * 31) + this.currentStepId.hashCode()) * 31) + this.responses.hashCode();
    }

    public String toString() {
        return "SubmitSurveyRequest(surveyProgressId=" + this.surveyProgressId + ", currentStepId=" + this.currentStepId + ", responses=" + this.responses + ')';
    }

    public SubmitSurveyRequest(String surveyProgressId, String currentStepId, List<SubmitSurveyRequestItem> responses) {
        Intrinsics.checkNotNullParameter(surveyProgressId, "surveyProgressId");
        Intrinsics.checkNotNullParameter(currentStepId, "currentStepId");
        Intrinsics.checkNotNullParameter(responses, "responses");
        this.surveyProgressId = surveyProgressId;
        this.currentStepId = currentStepId;
        this.responses = responses;
    }

    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    public final String getCurrentStepId() {
        return this.currentStepId;
    }

    public final List<SubmitSurveyRequestItem> getResponses() {
        return this.responses;
    }
}
