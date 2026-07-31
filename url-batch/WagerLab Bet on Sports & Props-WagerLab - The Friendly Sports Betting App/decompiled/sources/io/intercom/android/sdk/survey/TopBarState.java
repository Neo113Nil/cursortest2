package io.intercom.android.sdk.survey;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyViewModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0000H&J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/survey/TopBarState;", "", "<init>", "()V", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "progressBarState", "Lio/intercom/android/sdk/survey/ProgressBarState;", "getProgressBarState", "()Lio/intercom/android/sdk/survey/ProgressBarState;", "showDismissButton", "", "getShowDismissButton", "()Z", "enableDismissButton", "withProgressBarState", "SenderTopBarState", "NoTopBarState", "Lio/intercom/android/sdk/survey/TopBarState$NoTopBarState;", "Lio/intercom/android/sdk/survey/TopBarState$SenderTopBarState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class TopBarState {
    public static final int $stable = 0;

    public /* synthetic */ TopBarState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract TopBarState enableDismissButton();

    public abstract ProgressBarState getProgressBarState();

    public abstract boolean getShowDismissButton();

    public abstract SurveyUiColors getSurveyUiColors();

    public abstract TopBarState withProgressBarState(ProgressBarState progressBarState);

    private TopBarState() {
    }

    /* compiled from: SurveyViewModel.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001c\u001a\u00020\u0001H\u0016J\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÇ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'H×\u0003J\t\u0010(\u001a\u00020)H×\u0001J\t\u0010*\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lio/intercom/android/sdk/survey/TopBarState$SenderTopBarState;", "Lio/intercom/android/sdk/survey/TopBarState;", "avatar", "Lio/intercom/android/sdk/models/Avatar;", "senderName", "", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "showDismissButton", "", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "progressBarState", "Lio/intercom/android/sdk/survey/ProgressBarState;", "<init>", "(Lio/intercom/android/sdk/models/Avatar;Ljava/lang/String;Lio/intercom/android/sdk/identity/AppConfig;ZLio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/ProgressBarState;)V", "getAvatar", "()Lio/intercom/android/sdk/models/Avatar;", "getSenderName", "()Ljava/lang/String;", "getAppConfig", "()Lio/intercom/android/sdk/identity/AppConfig;", "getShowDismissButton", "()Z", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "getProgressBarState", "()Lio/intercom/android/sdk/survey/ProgressBarState;", "enableDismissButton", "withProgressBarState", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SenderTopBarState extends TopBarState {
        public static final int $stable = 8;
        private final AppConfig appConfig;
        private final Avatar avatar;
        private final ProgressBarState progressBarState;
        private final String senderName;
        private final boolean showDismissButton;
        private final SurveyUiColors surveyUiColors;

        public static /* synthetic */ SenderTopBarState copy$default(SenderTopBarState senderTopBarState, Avatar avatar, String str, AppConfig appConfig, boolean z, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i, Object obj) {
            if ((i & 1) != 0) {
                avatar = senderTopBarState.avatar;
            }
            if ((i & 2) != 0) {
                str = senderTopBarState.senderName;
            }
            if ((i & 4) != 0) {
                appConfig = senderTopBarState.appConfig;
            }
            if ((i & 8) != 0) {
                z = senderTopBarState.showDismissButton;
            }
            if ((i & 16) != 0) {
                surveyUiColors = senderTopBarState.surveyUiColors;
            }
            if ((i & 32) != 0) {
                progressBarState = senderTopBarState.progressBarState;
            }
            SurveyUiColors surveyUiColors2 = surveyUiColors;
            ProgressBarState progressBarState2 = progressBarState;
            return senderTopBarState.copy(avatar, str, appConfig, z, surveyUiColors2, progressBarState2);
        }

        /* renamed from: component1, reason: from getter */
        public final Avatar getAvatar() {
            return this.avatar;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSenderName() {
            return this.senderName;
        }

        /* renamed from: component3, reason: from getter */
        public final AppConfig getAppConfig() {
            return this.appConfig;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowDismissButton() {
            return this.showDismissButton;
        }

        /* renamed from: component5, reason: from getter */
        public final SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        /* renamed from: component6, reason: from getter */
        public final ProgressBarState getProgressBarState() {
            return this.progressBarState;
        }

        public final SenderTopBarState copy(Avatar avatar, String senderName, AppConfig appConfig, boolean showDismissButton, SurveyUiColors surveyUiColors, ProgressBarState progressBarState) {
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            Intrinsics.checkNotNullParameter(senderName, "senderName");
            Intrinsics.checkNotNullParameter(appConfig, "appConfig");
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(progressBarState, "progressBarState");
            return new SenderTopBarState(avatar, senderName, appConfig, showDismissButton, surveyUiColors, progressBarState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SenderTopBarState)) {
                return false;
            }
            SenderTopBarState senderTopBarState = (SenderTopBarState) other;
            return Intrinsics.areEqual(this.avatar, senderTopBarState.avatar) && Intrinsics.areEqual(this.senderName, senderTopBarState.senderName) && Intrinsics.areEqual(this.appConfig, senderTopBarState.appConfig) && this.showDismissButton == senderTopBarState.showDismissButton && Intrinsics.areEqual(this.surveyUiColors, senderTopBarState.surveyUiColors) && Intrinsics.areEqual(this.progressBarState, senderTopBarState.progressBarState);
        }

        public int hashCode() {
            return (((((((((this.avatar.hashCode() * 31) + this.senderName.hashCode()) * 31) + this.appConfig.hashCode()) * 31) + Boolean.hashCode(this.showDismissButton)) * 31) + this.surveyUiColors.hashCode()) * 31) + this.progressBarState.hashCode();
        }

        public String toString() {
            return "SenderTopBarState(avatar=" + this.avatar + ", senderName=" + this.senderName + ", appConfig=" + this.appConfig + ", showDismissButton=" + this.showDismissButton + ", surveyUiColors=" + this.surveyUiColors + ", progressBarState=" + this.progressBarState + ')';
        }

        public final Avatar getAvatar() {
            return this.avatar;
        }

        public final String getSenderName() {
            return this.senderName;
        }

        public final AppConfig getAppConfig() {
            return this.appConfig;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public boolean getShowDismissButton() {
            return this.showDismissButton;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        public /* synthetic */ SenderTopBarState(Avatar avatar, String str, AppConfig appConfig, boolean z, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(avatar, str, appConfig, z, surveyUiColors, (i & 32) != 0 ? new ProgressBarState(false, 0.0f, 3, null) : progressBarState);
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public ProgressBarState getProgressBarState() {
            return this.progressBarState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SenderTopBarState(Avatar avatar, String senderName, AppConfig appConfig, boolean z, SurveyUiColors surveyUiColors, ProgressBarState progressBarState) {
            super(null);
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            Intrinsics.checkNotNullParameter(senderName, "senderName");
            Intrinsics.checkNotNullParameter(appConfig, "appConfig");
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(progressBarState, "progressBarState");
            this.avatar = avatar;
            this.senderName = senderName;
            this.appConfig = appConfig;
            this.showDismissButton = z;
            this.surveyUiColors = surveyUiColors;
            this.progressBarState = progressBarState;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public TopBarState enableDismissButton() {
            return copy$default(this, null, null, null, true, null, null, 55, null);
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public TopBarState withProgressBarState(ProgressBarState progressBarState) {
            Intrinsics.checkNotNullParameter(progressBarState, "progressBarState");
            return copy$default(this, null, null, null, false, null, progressBarState, 31, null);
        }
    }

    /* compiled from: SurveyViewModel.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0001H\u0016J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u001cH×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/survey/TopBarState$NoTopBarState;", "Lio/intercom/android/sdk/survey/TopBarState;", "showDismissButton", "", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "progressBarState", "Lio/intercom/android/sdk/survey/ProgressBarState;", "<init>", "(ZLio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/ProgressBarState;)V", "getShowDismissButton", "()Z", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "getProgressBarState", "()Lio/intercom/android/sdk/survey/ProgressBarState;", "enableDismissButton", "withProgressBarState", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoTopBarState extends TopBarState {
        public static final int $stable = 0;
        private final ProgressBarState progressBarState;
        private final boolean showDismissButton;
        private final SurveyUiColors surveyUiColors;

        public static /* synthetic */ NoTopBarState copy$default(NoTopBarState noTopBarState, boolean z, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i, Object obj) {
            if ((i & 1) != 0) {
                z = noTopBarState.showDismissButton;
            }
            if ((i & 2) != 0) {
                surveyUiColors = noTopBarState.surveyUiColors;
            }
            if ((i & 4) != 0) {
                progressBarState = noTopBarState.progressBarState;
            }
            return noTopBarState.copy(z, surveyUiColors, progressBarState);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowDismissButton() {
            return this.showDismissButton;
        }

        /* renamed from: component2, reason: from getter */
        public final SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        /* renamed from: component3, reason: from getter */
        public final ProgressBarState getProgressBarState() {
            return this.progressBarState;
        }

        public final NoTopBarState copy(boolean showDismissButton, SurveyUiColors surveyUiColors, ProgressBarState progressBarState) {
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(progressBarState, "progressBarState");
            return new NoTopBarState(showDismissButton, surveyUiColors, progressBarState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoTopBarState)) {
                return false;
            }
            NoTopBarState noTopBarState = (NoTopBarState) other;
            return this.showDismissButton == noTopBarState.showDismissButton && Intrinsics.areEqual(this.surveyUiColors, noTopBarState.surveyUiColors) && Intrinsics.areEqual(this.progressBarState, noTopBarState.progressBarState);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.showDismissButton) * 31) + this.surveyUiColors.hashCode()) * 31) + this.progressBarState.hashCode();
        }

        public String toString() {
            return "NoTopBarState(showDismissButton=" + this.showDismissButton + ", surveyUiColors=" + this.surveyUiColors + ", progressBarState=" + this.progressBarState + ')';
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public boolean getShowDismissButton() {
            return this.showDismissButton;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        public /* synthetic */ NoTopBarState(boolean z, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, surveyUiColors, (i & 4) != 0 ? new ProgressBarState(false, 0.0f, 3, null) : progressBarState);
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public ProgressBarState getProgressBarState() {
            return this.progressBarState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoTopBarState(boolean z, SurveyUiColors surveyUiColors, ProgressBarState progressBarState) {
            super(null);
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(progressBarState, "progressBarState");
            this.showDismissButton = z;
            this.surveyUiColors = surveyUiColors;
            this.progressBarState = progressBarState;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public TopBarState enableDismissButton() {
            return copy$default(this, true, null, null, 6, null);
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public TopBarState withProgressBarState(ProgressBarState progressBarState) {
            Intrinsics.checkNotNullParameter(progressBarState, "progressBarState");
            return copy$default(this, false, null, progressBarState, 3, null);
        }
    }
}
