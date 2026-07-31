package io.intercom.android.sdk.survey;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SurveyViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyEffects;", "", "<init>", "()V", "ExitSurvey", "Lio/intercom/android/sdk/survey/SurveyEffects$ExitSurvey;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class SurveyEffects {
    public static final int $stable = 0;

    public /* synthetic */ SurveyEffects(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: SurveyViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyEffects$ExitSurvey;", "Lio/intercom/android/sdk/survey/SurveyEffects;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ExitSurvey extends SurveyEffects {
        public static final int $stable = 0;
        public static final ExitSurvey INSTANCE = new ExitSurvey();

        private ExitSurvey() {
            super(null);
        }
    }

    private SurveyEffects() {
    }
}
