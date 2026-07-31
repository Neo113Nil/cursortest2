package io.intercom.android.sdk.survey;

import com.google.gson.Gson;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.survey.model.StatsCtaRequestModel;
import io.intercom.android.sdk.survey.model.SubmitSurveyRequest;
import io.intercom.android.sdk.survey.model.SubmitSurveyResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyRepository.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0006\u0010\u0010\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0015J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0012J\u001e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyRepository;", "", "surveyApi", "Lio/intercom/android/sdk/api/SurveyApi;", "<init>", "(Lio/intercom/android/sdk/api/SurveyApi;)V", "submitSurvey", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/survey/model/SubmitSurveyResponse;", "submitSurveyRequest", "Lio/intercom/android/sdk/survey/model/SubmitSurveyRequest;", "id", "", "(Lio/intercom/android/sdk/survey/model/SubmitSurveyRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismissSurvey", "", "surveyId", "surveyProgressId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSurvey", "Lio/intercom/android/sdk/survey/model/FetchSurveyRequest;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportFailure", "submitCtaStat", "statsCtaRequestModel", "Lio/intercom/android/sdk/survey/model/StatsCtaRequestModel;", "(Ljava/lang/String;Lio/intercom/android/sdk/survey/model/StatsCtaRequestModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SurveyRepository {
    public static final int $stable = 8;
    private final SurveyApi surveyApi;

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyRepository() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SurveyRepository(SurveyApi surveyApi) {
        Intrinsics.checkNotNullParameter(surveyApi, "surveyApi");
        this.surveyApi = surveyApi;
    }

    public /* synthetic */ SurveyRepository(SurveyApi surveyApi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Injector.get().getSurveyApi() : surveyApi);
    }

    public final Object submitSurvey(SubmitSurveyRequest submitSurveyRequest, String str, Continuation<? super NetworkResponse<SubmitSurveyResponse>> continuation) {
        Object fromJson = new Gson().fromJson(new Gson().toJson(submitSurveyRequest), (Class<Object>) Map.class);
        Intrinsics.checkNotNull(fromJson, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        return this.surveyApi.submitSurveyStep(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release((Map) fromJson), continuation);
    }

    public final Object dismissSurvey(String str, String str2, Continuation<? super NetworkResponse<Unit>> continuation) {
        return this.surveyApi.dismissSurvey(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.mapOf(TuplesKt.to("survey_progress_id", str2))), continuation);
    }

    public final Object fetchSurvey(String str, Continuation<? super NetworkResponse<FetchSurveyRequest>> continuation) {
        return this.surveyApi.fetchSurvey(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null), continuation);
    }

    public final Object reportFailure(String str, String str2, Continuation<? super NetworkResponse<Unit>> continuation) {
        return this.surveyApi.reportFailure(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.mapOf(TuplesKt.to("survey_progress_id", str2))), continuation);
    }

    public final Object submitCtaStat(String str, StatsCtaRequestModel statsCtaRequestModel, Continuation<? super Unit> continuation) {
        Object fromJson = new Gson().fromJson(new Gson().toJson(statsCtaRequestModel), (Class<Object>) Map.class);
        Intrinsics.checkNotNull(fromJson, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Object submitCtaStat = this.surveyApi.submitCtaStat(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release((Map) fromJson), continuation);
        return submitCtaStat == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? submitCtaStat : Unit.INSTANCE;
    }
}
