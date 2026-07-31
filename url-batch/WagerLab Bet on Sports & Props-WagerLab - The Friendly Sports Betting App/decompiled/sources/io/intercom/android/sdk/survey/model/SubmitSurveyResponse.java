package io.intercom.android.sdk.survey.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.NotificationStatuses;
import io.intercom.android.sdk.survey.model.SurveyData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubmitSurveyResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0007H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/survey/model/SubmitSurveyResponse;", "", NotificationStatuses.COMPLETE_STATUS, "", "nextStep", "Lio/intercom/android/sdk/survey/model/SurveyData$Step;", "surveyId", "", "<init>", "(ZLio/intercom/android/sdk/survey/model/SurveyData$Step;Ljava/lang/String;)V", "getComplete", "()Z", "getNextStep", "()Lio/intercom/android/sdk/survey/model/SurveyData$Step;", "getSurveyId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SubmitSurveyResponse {
    public static final int $stable = 8;

    @SerializedName(NotificationStatuses.COMPLETE_STATUS)
    private final boolean complete;

    @SerializedName("next_step")
    private final SurveyData.Step nextStep;

    @SerializedName("survey_id")
    private final String surveyId;

    public static /* synthetic */ SubmitSurveyResponse copy$default(SubmitSurveyResponse submitSurveyResponse, boolean z, SurveyData.Step step, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = submitSurveyResponse.complete;
        }
        if ((i & 2) != 0) {
            step = submitSurveyResponse.nextStep;
        }
        if ((i & 4) != 0) {
            str = submitSurveyResponse.surveyId;
        }
        return submitSurveyResponse.copy(z, step, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getComplete() {
        return this.complete;
    }

    /* renamed from: component2, reason: from getter */
    public final SurveyData.Step getNextStep() {
        return this.nextStep;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSurveyId() {
        return this.surveyId;
    }

    public final SubmitSurveyResponse copy(boolean complete, SurveyData.Step nextStep, String surveyId) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        return new SubmitSurveyResponse(complete, nextStep, surveyId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitSurveyResponse)) {
            return false;
        }
        SubmitSurveyResponse submitSurveyResponse = (SubmitSurveyResponse) other;
        return this.complete == submitSurveyResponse.complete && Intrinsics.areEqual(this.nextStep, submitSurveyResponse.nextStep) && Intrinsics.areEqual(this.surveyId, submitSurveyResponse.surveyId);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.complete) * 31) + this.nextStep.hashCode()) * 31) + this.surveyId.hashCode();
    }

    public String toString() {
        return "SubmitSurveyResponse(complete=" + this.complete + ", nextStep=" + this.nextStep + ", surveyId=" + this.surveyId + ')';
    }

    public SubmitSurveyResponse(boolean z, SurveyData.Step nextStep, String surveyId) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        this.complete = z;
        this.nextStep = nextStep;
        this.surveyId = surveyId;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final SurveyData.Step getNextStep() {
        return this.nextStep;
    }

    public final String getSurveyId() {
        return this.surveyId;
    }
}
