package io.intercom.android.sdk.survey;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SubmitSurveyRequestItem;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.model.SurveySenderAvatar;
import io.intercom.android.sdk.survey.model.SurveySenderData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: SurveyViewModel.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 =2\u00020\u0001:\u0001=BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u000200J\u001c\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020*2\n\b\u0002\u00103\u001a\u0004\u0018\u000104H\u0002J\u0012\u00105\u001a\u00020%2\n\b\u0002\u00103\u001a\u0004\u0018\u000104J\b\u00106\u001a\u00020*H\u0002J\u0006\u00107\u001a\u00020%J\u001e\u00108\u001a\u00020%2\u0006\u0010'\u001a\u00020(2\u0006\u00109\u001a\u00020(H\u0082@¢\u0006\u0002\u0010:J\b\u0010;\u001a\u00020%H\u0002J\u0010\u0010<\u001a\u00020%2\u0006\u0010,\u001a\u00020-H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyViewModel;", "Landroidx/lifecycle/ViewModel;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "launchMode", "Lio/intercom/android/sdk/survey/SurveyLaunchMode;", "surveyRepository", "Lio/intercom/android/sdk/survey/SurveyRepository;", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "metricTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lio/intercom/android/sdk/survey/SurveyLaunchMode;Lio/intercom/android/sdk/survey/SurveyRepository;Lio/intercom/android/sdk/identity/AppConfig;Lio/intercom/android/sdk/metrics/MetricTracker;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "currentStep", "Lio/intercom/android/sdk/survey/model/SurveyData$Step;", "surveyData", "Lio/intercom/android/sdk/survey/model/SurveyData;", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/survey/SurveyState;", "getState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "effects", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lio/intercom/android/sdk/survey/SurveyEffects;", "getEffects", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "completedResponses", "", "Lio/intercom/android/sdk/survey/model/SubmitSurveyRequestItem;", "completedSteps", "onUiLoaded", "", "fetchAndShowSurvey", "surveyId", "", "buildContentState", "Lio/intercom/android/sdk/survey/SurveyState$Content;", "onCloseClicked", "triggerType", "Lio/intercom/android/sdk/survey/CloseEventTrigger;", "onSecondaryCtaClicked", "secondaryCta", "Lio/intercom/android/sdk/survey/SurveyState$Content$SecondaryCta;", "submitSurvey", "surveyContent", "compositionAwareScope", "Lkotlinx/coroutines/CoroutineScope;", "continueClicked", "getCurrentContentState", "onAnswerUpdated", "reportFailure", "surveyProgressId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitLoading", "sendDismissedEvent", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SurveyViewModel extends ViewModel {
    public static final int ENTITY_TYPE = 85;
    private final AppConfig appConfig;
    private final List<SubmitSurveyRequestItem> completedResponses;
    private final List<SurveyData.Step> completedSteps;
    private SurveyData.Step currentStep;
    private final CoroutineDispatcher dispatcher;
    private final MutableSharedFlow<SurveyEffects> effects;
    private final IntercomDataLayer intercomDataLayer;
    private final SurveyLaunchMode launchMode;
    private final MetricTracker metricTracker;
    private final MutableStateFlow<SurveyState> state;
    private SurveyData surveyData;
    private final SurveyRepository surveyRepository;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SurveyViewModel.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SurveyData.StepType.values().length];
            try {
                iArr[SurveyData.StepType.QUESTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.StepType.INTRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.StepType.CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.StepType.THANK_YOU.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CloseEventTrigger.values().length];
            try {
                iArr2[CloseEventTrigger.CTA.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CloseEventTrigger.CLOSE_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CloseEventTrigger.SECONDARY_CTA_EXTERNAL_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CloseEventTrigger.SECONDARY_CTA_DEEP_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SurveyViewModel(CoroutineDispatcher coroutineDispatcher, SurveyLaunchMode surveyLaunchMode, SurveyRepository surveyRepository, AppConfig appConfig, MetricTracker metricTracker, IntercomDataLayer intercomDataLayer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher, surveyLaunchMode, (i & 4) != 0 ? new SurveyRepository(null, 1, 0 == true ? 1 : 0) : surveyRepository, (i & 8) != 0 ? Injector.get().getAppConfigProvider().get() : appConfig, (i & 16) != 0 ? Injector.get().getMetricTracker() : metricTracker, (i & 32) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    public final CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public SurveyViewModel(CoroutineDispatcher dispatcher, SurveyLaunchMode launchMode, SurveyRepository surveyRepository, AppConfig appConfig, MetricTracker metricTracker, IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(surveyRepository, "surveyRepository");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.dispatcher = dispatcher;
        this.launchMode = launchMode;
        this.surveyRepository = surveyRepository;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.intercomDataLayer = intercomDataLayer;
        this.surveyData = SurveyData.INSTANCE.getNULL();
        this.state = StateFlowKt.MutableStateFlow(SurveyState.Initial.INSTANCE);
        this.effects = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.completedResponses = new ArrayList();
        this.completedSteps = new ArrayList();
    }

    public final MutableStateFlow<SurveyState> getState() {
        return this.state;
    }

    public final MutableSharedFlow<SurveyEffects> getEffects() {
        return this.effects;
    }

    public final void onUiLoaded() {
        if (Intrinsics.areEqual(this.state.getValue(), SurveyState.Initial.INSTANCE)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new SurveyViewModel$onUiLoaded$1(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchAndShowSurvey(String surveyId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new SurveyViewModel$fetchAndShowSurvey$1(surveyId, this, SurveyViewModelKt.toSurveyUiColors(this.surveyData.getCustomization()), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r2.getType() == io.intercom.android.sdk.survey.model.SurveyData.StepType.QUESTION) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0 A[LOOP:0: B:30:0x00ea->B:32:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SurveyState.Content buildContentState(SurveyData surveyData) {
        boolean z;
        SurveySenderData sender;
        TopBarState.SenderTopBarState senderTopBarState;
        SurveyData.Step step;
        SurveyData.Step step2;
        SurveyData.Step step3;
        Iterator<T> it;
        SurveyData.Step step4;
        int i;
        SurveyState.Content.PrimaryCta.Fallback fallback;
        SurveyData.Step step5;
        SurveyUiColors surveyUiColors = SurveyViewModelKt.toSurveyUiColors(surveyData.getCustomization());
        float stepCount = surveyData.getStepCount();
        int size = this.completedSteps.size();
        SurveyData.Step step6 = null;
        if (surveyData.getShowProgressBar()) {
            SurveyData.Step step7 = this.currentStep;
            if (step7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                step7 = null;
            }
            if (step7.getType() != SurveyData.StepType.CONTENT) {
                SurveyData.Step step8 = this.currentStep;
                if (step8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                    step8 = null;
                }
            }
            z = true;
            ProgressBarState progressBarState = new ProgressBarState(z, size / stepCount);
            sender = surveyData.getSender();
            if ((sender == null ? sender.getName() : null) != null) {
                senderTopBarState = new TopBarState.NoTopBarState(surveyData.isDismissible(), surveyUiColors, progressBarState);
            } else {
                Avatar.Builder builder = new Avatar.Builder();
                SurveySenderAvatar avatar = surveyData.getSender().getAvatar();
                Avatar build = builder.withImageUrl(avatar != null ? avatar.getSquareImg128() : null).withInitials(surveyData.getSender().getInitials()).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                String firstName = surveyData.getSender().getFirstName();
                if (firstName == null) {
                    firstName = surveyData.getSender().getName();
                }
                senderTopBarState = new TopBarState.SenderTopBarState(build, firstName, this.appConfig, surveyData.isDismissible(), surveyUiColors, progressBarState);
            }
            TopBarState topBarState = senderTopBarState;
            step = this.currentStep;
            if (step == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                step = null;
            }
            String customButtonText = step.getCustomButtonText();
            step2 = this.currentStep;
            if (step2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                step2 = null;
            }
            List<Block.Builder> blocks = step2.getBlocks();
            step3 = this.currentStep;
            if (step3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                step3 = null;
            }
            List<SurveyData.Step.Question> questions = step3.getQuestions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(questions, 10));
            it = questions.iterator();
            while (it.hasNext()) {
                arrayList.add(new QuestionState(((SurveyData.Step.Question) it.next()).getQuestionModel(), surveyUiColors));
            }
            ArrayList arrayList2 = arrayList;
            step4 = this.currentStep;
            if (step4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                step4 = null;
            }
            i = WhenMappings.$EnumSwitchMapping$0[step4.getType().ordinal()];
            if (i != 1) {
                String str = customButtonText;
                if (str == null || str.length() == 0) {
                    fallback = new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_submit);
                } else {
                    fallback = new SurveyState.Content.PrimaryCta.Custom(customButtonText);
                }
            } else if (i == 2 || i == 3) {
                String str2 = customButtonText;
                if (str2 == null || str2.length() == 0) {
                    fallback = new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_next_button);
                } else {
                    fallback = new SurveyState.Content.PrimaryCta.Custom(customButtonText);
                }
            } else if (i == 4) {
                String str3 = customButtonText;
                if (str3 == null || str3.length() == 0) {
                    fallback = new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_done_button);
                } else {
                    fallback = new SurveyState.Content.PrimaryCta.Custom(customButtonText);
                }
            } else {
                String str4 = customButtonText;
                if (str4 == null || str4.length() == 0) {
                    fallback = new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_next_button);
                } else {
                    fallback = new SurveyState.Content.PrimaryCta.Custom(customButtonText);
                }
            }
            SurveyState.Content.PrimaryCta primaryCta = fallback;
            step5 = this.currentStep;
            if (step5 != null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentStep");
            } else {
                step6 = step5;
            }
            List<SurveyData.SurveyActions> actions = step6.getActions();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(actions, 10));
            for (SurveyData.SurveyActions surveyActions : actions) {
                boolean z2 = surveyActions.getAndroidUri() == null;
                String webUrl = z2 ? surveyActions.getWebUrl() : surveyActions.getAndroidUri();
                String actionTitle = surveyActions.getActionTitle();
                if (webUrl == null) {
                    webUrl = "";
                }
                arrayList3.add(new SurveyState.Content.SecondaryCta(actionTitle, webUrl, z2));
            }
            return new SurveyState.Content(blocks, arrayList2, arrayList3, primaryCta, surveyUiColors, topBarState);
        }
        z = false;
        ProgressBarState progressBarState2 = new ProgressBarState(z, size / stepCount);
        sender = surveyData.getSender();
        if ((sender == null ? sender.getName() : null) != null) {
        }
        TopBarState topBarState2 = senderTopBarState;
        step = this.currentStep;
        if (step == null) {
        }
        String customButtonText2 = step.getCustomButtonText();
        step2 = this.currentStep;
        if (step2 == null) {
        }
        List<Block.Builder> blocks2 = step2.getBlocks();
        step3 = this.currentStep;
        if (step3 == null) {
        }
        List<SurveyData.Step.Question> questions2 = step3.getQuestions();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(questions2, 10));
        it = questions2.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList22 = arrayList4;
        step4 = this.currentStep;
        if (step4 == null) {
        }
        i = WhenMappings.$EnumSwitchMapping$0[step4.getType().ordinal()];
        if (i != 1) {
        }
        SurveyState.Content.PrimaryCta primaryCta2 = fallback;
        step5 = this.currentStep;
        if (step5 != null) {
        }
        List<SurveyData.SurveyActions> actions2 = step6.getActions();
        ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(actions2, 10));
        while (r13.hasNext()) {
        }
        return new SurveyState.Content(blocks2, arrayList22, arrayList32, primaryCta2, surveyUiColors, topBarState2);
    }

    public final void onCloseClicked(CloseEventTrigger triggerType) {
        Intrinsics.checkNotNullParameter(triggerType, "triggerType");
        if (this.surveyData.isDismissible() || (this.state.getValue() instanceof SurveyState.Error)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SurveyViewModel$onCloseClicked$1(this, triggerType, null), 3, null);
        }
    }

    public final void onSecondaryCtaClicked(SurveyState.Content.SecondaryCta secondaryCta) {
        CloseEventTrigger closeEventTrigger;
        Intrinsics.checkNotNullParameter(secondaryCta, "secondaryCta");
        if (secondaryCta.isExternalUrl()) {
            closeEventTrigger = CloseEventTrigger.SECONDARY_CTA_EXTERNAL_LINK;
        } else {
            closeEventTrigger = CloseEventTrigger.SECONDARY_CTA_DEEP_LINK;
        }
        if (closeEventTrigger == CloseEventTrigger.SECONDARY_CTA_DEEP_LINK) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new SurveyViewModel$onSecondaryCtaClicked$1(this, null), 3, null);
        }
        onCloseClicked(closeEventTrigger);
    }

    static /* synthetic */ void submitSurvey$default(SurveyViewModel surveyViewModel, SurveyState.Content content, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineScope = null;
        }
        surveyViewModel.submitSurvey(content, coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitSurvey(SurveyState.Content surveyContent, CoroutineScope compositionAwareScope) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new SurveyViewModel$submitSurvey$1(this, surveyContent, compositionAwareScope, null), 2, null);
    }

    public static /* synthetic */ void continueClicked$default(SurveyViewModel surveyViewModel, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineScope = null;
        }
        surveyViewModel.continueClicked(coroutineScope);
    }

    public final void continueClicked(CoroutineScope compositionAwareScope) {
        submitSurvey(getCurrentContentState(), compositionAwareScope);
    }

    private final SurveyState.Content getCurrentContentState() {
        SurveyState value = this.state.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type io.intercom.android.sdk.survey.SurveyState.Content");
        return (SurveyState.Content) value;
    }

    public final void onAnswerUpdated() {
        int i;
        SurveyState.Content currentContentState = getCurrentContentState();
        float stepCount = this.surveyData.getStepCount();
        int size = this.completedSteps.size();
        List<QuestionState> questions = currentContentState.getQuestions();
        if ((questions instanceof Collection) && questions.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = questions.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((((QuestionState) it.next()).getValidationError() instanceof ValidationError.NoValidationError) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        float f = size / stepCount;
        float f2 = i;
        SurveyData.Step step = this.currentStep;
        if (step == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentStep");
            step = null;
        }
        this.state.setValue(SurveyState.Content.copy$default(currentContentState, null, null, null, null, null, currentContentState.getTopBarState().withProgressBarState(ProgressBarState.copy$default(currentContentState.getTopBarState().getProgressBarState(), false, f + (f2 / (stepCount * step.getQuestions().size())), 1, null)), 31, null));
    }

    /* compiled from: SurveyViewModel.kt */
    @Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyViewModel$Companion;", "", "<init>", "()V", "ENTITY_TYPE", "", "create", "Lio/intercom/android/sdk/survey/SurveyViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "launchMode", "Lio/intercom/android/sdk/survey/SurveyLaunchMode;", "factory", "io/intercom/android/sdk/survey/SurveyViewModel$Companion$factory$1", "(Lio/intercom/android/sdk/survey/SurveyLaunchMode;)Lio/intercom/android/sdk/survey/SurveyViewModel$Companion$factory$1;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SurveyViewModel create(ViewModelStoreOwner owner, SurveyLaunchMode launchMode) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            return (SurveyViewModel) new ViewModelProvider(owner, factory(launchMode)).get(SurveyViewModel.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.survey.SurveyViewModel$Companion$factory$1] */
        private final SurveyViewModel$Companion$factory$1 factory(final SurveyLaunchMode launchMode) {
            return new ViewModelProvider.Factory() { // from class: io.intercom.android.sdk.survey.SurveyViewModel$Companion$factory$1
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new SurveyViewModel(null, SurveyLaunchMode.this, null, null, null, null, 61, null);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reportFailure(String str, String str2, Continuation<? super Unit> continuation) {
        SurveyViewModel$reportFailure$1 surveyViewModel$reportFailure$1;
        int i;
        if (continuation instanceof SurveyViewModel$reportFailure$1) {
            surveyViewModel$reportFailure$1 = (SurveyViewModel$reportFailure$1) continuation;
            if ((surveyViewModel$reportFailure$1.label & Integer.MIN_VALUE) != 0) {
                surveyViewModel$reportFailure$1.label -= Integer.MIN_VALUE;
                Object obj = surveyViewModel$reportFailure$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = surveyViewModel$reportFailure$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SurveyRepository surveyRepository = this.surveyRepository;
                    surveyViewModel$reportFailure$1.label = 1;
                    obj = surveyRepository.reportFailure(str, str2, surveyViewModel$reportFailure$1);
                    if (obj == coroutine_suspended) {
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
        surveyViewModel$reportFailure$1 = new SurveyViewModel$reportFailure$1(this, continuation);
        Object obj2 = surveyViewModel$reportFailure$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = surveyViewModel$reportFailure$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitLoading() {
        MutableStateFlow<SurveyState> mutableStateFlow = this.state;
        mutableStateFlow.setValue(new SurveyState.Loading(this.state.getValue().getSurveyUiColors(), mutableStateFlow.getValue().getTopBarState()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendDismissedEvent(CloseEventTrigger triggerType) {
        String str;
        String str2;
        SurveyState value = this.state.getValue();
        if (value instanceof SurveyState.Loading) {
            str = MetricTracker.Object.SURVEY_STEP_LOADING;
        } else {
            str = value instanceof SurveyState.Error ? MetricTracker.Object.SURVEY_STEP_ERROR : "survey";
        }
        String str3 = str;
        int i = WhenMappings.$EnumSwitchMapping$1[triggerType.ordinal()];
        if (i == 1) {
            str2 = MetricTracker.Context.FROM_CTA;
        } else if (i == 2) {
            str2 = MetricTracker.Context.FROM_CLOSE_BUTTON;
        } else if (i == 3) {
            str2 = MetricTracker.Context.FROM_ONWARD_EXTERNAL_LINK;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = MetricTracker.Context.FROM_ONWARD_DEEP_LINK;
        }
        String str4 = str2;
        if (this.surveyData.getSteps().isEmpty()) {
            return;
        }
        SurveyData.Step step = this.currentStep;
        SurveyData.Step step2 = null;
        if (step == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentStep");
            step = null;
        }
        String str5 = step.getType() == SurveyData.StepType.THANK_YOU ? "closed" : "dismissed";
        Iterator<T> it = this.completedSteps.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((SurveyData.Step) it.next()).getQuestions().size();
        }
        SurveyData.Step step3 = this.currentStep;
        if (step3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentStep");
        } else {
            step2 = step3;
        }
        this.metricTracker.surveyDismissed(str5, str3, str4, this.surveyData.getId(), this.surveyData.getFormatMetric(), this.completedSteps.size(), this.surveyData.getStepCount(), i2 + step2.getQuestions().size());
    }
}
