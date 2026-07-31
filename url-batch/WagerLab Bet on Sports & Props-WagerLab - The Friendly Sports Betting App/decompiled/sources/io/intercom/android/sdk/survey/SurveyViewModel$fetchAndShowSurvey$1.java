package io.intercom.android.sdk.survey;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.survey.model.SurveyData;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: SurveyViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.survey.SurveyViewModel$fetchAndShowSurvey$1", f = "SurveyViewModel.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class SurveyViewModel$fetchAndShowSurvey$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $surveyId;
    final /* synthetic */ SurveyUiColors $uiColors;
    int label;
    final /* synthetic */ SurveyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SurveyViewModel$fetchAndShowSurvey$1(String str, SurveyViewModel surveyViewModel, SurveyUiColors surveyUiColors, Continuation<? super SurveyViewModel$fetchAndShowSurvey$1> continuation) {
        super(2, continuation);
        this.$surveyId = str;
        this.this$0 = surveyViewModel;
        this.$uiColors = surveyUiColors;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SurveyViewModel$fetchAndShowSurvey$1(this.$surveyId, this.this$0, this.$uiColors, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SurveyViewModel$fetchAndShowSurvey$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SurveyRepository surveyRepository;
        SurveyData surveyData;
        MetricTracker metricTracker;
        SurveyData surveyData2;
        SurveyData surveyData3;
        SurveyData surveyData4;
        SurveyData surveyData5;
        SurveyState.Content buildContentState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!StringsKt.isBlank(this.$surveyId)) {
                this.this$0.emitLoading();
                surveyRepository = this.this$0.surveyRepository;
                this.label = 1;
                obj = surveyRepository.fetchSurvey(this.$surveyId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null), 1, null));
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if (networkResponse instanceof NetworkResponse.Success) {
            this.this$0.surveyData = ((FetchSurveyRequest) ((NetworkResponse.Success) networkResponse).getBody()).getSurvey();
            surveyData = this.this$0.surveyData;
            if (!surveyData.getSteps().isEmpty()) {
                metricTracker = this.this$0.metricTracker;
                surveyData2 = this.this$0.surveyData;
                String id = surveyData2.getId();
                surveyData3 = this.this$0.surveyData;
                metricTracker.surveyOpened("opened", "survey", MetricTracker.Context.FROM_PROGRAMMATIC, id, surveyData3.getFormatMetric());
                SurveyViewModel surveyViewModel = this.this$0;
                surveyData4 = surveyViewModel.surveyData;
                surveyViewModel.currentStep = (SurveyData.Step) CollectionsKt.first((List) surveyData4.getSteps());
                MutableStateFlow<SurveyState> state = this.this$0.getState();
                SurveyViewModel surveyViewModel2 = this.this$0;
                surveyData5 = surveyViewModel2.surveyData;
                buildContentState = surveyViewModel2.buildContentState(surveyData5);
                state.setValue(buildContentState);
            } else {
                this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null), 1, null));
            }
        } else if (networkResponse instanceof NetworkResponse.ClientError) {
            this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null), 1, null));
        } else if (networkResponse instanceof NetworkResponse.NetworkError) {
            MutableStateFlow<SurveyState> state2 = this.this$0.getState();
            TopBarState.NoTopBarState noTopBarState = new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null);
            SurveyUiColors surveyUiColors = this.$uiColors;
            TopBarState.NoTopBarState noTopBarState2 = noTopBarState;
            final SurveyViewModel surveyViewModel3 = this.this$0;
            final String str = this.$surveyId;
            state2.setValue(new SurveyState.Error.WithCTA(0, surveyUiColors, noTopBarState2, new Function0() { // from class: io.intercom.android.sdk.survey.SurveyViewModel$fetchAndShowSurvey$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = SurveyViewModel$fetchAndShowSurvey$1.invokeSuspend$lambda$0(SurveyViewModel.this, str);
                    return invokeSuspend$lambda$0;
                }
            }, 1, null));
        } else {
            if (!(networkResponse instanceof NetworkResponse.ServerError)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(R.string.intercom_page_not_found, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(SurveyViewModel surveyViewModel, String str) {
        surveyViewModel.fetchAndShowSurvey(str);
        return Unit.INSTANCE;
    }
}
