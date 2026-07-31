package io.intercom.android.sdk.survey;

import io.intercom.android.sdk.survey.model.StatsCtaRequestModel;
import io.intercom.android.sdk.survey.model.SurveyData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SurveyViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.survey.SurveyViewModel$onSecondaryCtaClicked$1", f = "SurveyViewModel.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class SurveyViewModel$onSecondaryCtaClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SurveyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SurveyViewModel$onSecondaryCtaClicked$1(SurveyViewModel surveyViewModel, Continuation<? super SurveyViewModel$onSecondaryCtaClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = surveyViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SurveyViewModel$onSecondaryCtaClicked$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SurveyViewModel$onSecondaryCtaClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SurveyRepository surveyRepository;
        SurveyData surveyData;
        SurveyData surveyData2;
        SurveyData.Step step;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            surveyRepository = this.this$0.surveyRepository;
            surveyData = this.this$0.surveyData;
            String id = surveyData.getId();
            surveyData2 = this.this$0.surveyData;
            String surveyProgressId = surveyData2.getSurveyProgressId();
            step = this.this$0.currentStep;
            if (step == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                step = null;
            }
            this.label = 1;
            if (surveyRepository.submitCtaStat(id, new StatsCtaRequestModel(surveyProgressId, step.getId()), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
