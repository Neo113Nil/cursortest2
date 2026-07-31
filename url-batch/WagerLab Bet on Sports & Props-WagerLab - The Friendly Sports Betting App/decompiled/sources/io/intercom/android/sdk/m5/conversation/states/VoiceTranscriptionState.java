package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import io.intercom.android.sdk.m5.conversation.errors.VoiceTranscriptionError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VoiceTranscriptionState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;", "", "Idle", "Recording", "Processing", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, "Error", "Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState$Completed;", "Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState$Error;", "Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState$Idle;", "Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState$Processing;", "Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState$Recording;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface VoiceTranscriptionState {

    /* compiled from: VoiceTranscriptionState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState$Idle;", "Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Idle implements VoiceTranscriptionState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Idle)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1546170116;
        }

        public String toString() {
            return "Idle";
        }

        private Idle() {
        }
    }

    /* compiled from: VoiceTranscriptionState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState$Recording;", "Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Recording implements VoiceTranscriptionState {
        public static final int $stable = 0;
        public static final Recording INSTANCE = new Recording();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Recording)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 2104954049;
        }

        public String toString() {
            return "Recording";
        }

        private Recording() {
        }
    }

    /* compiled from: VoiceTranscriptionState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState$Processing;", "Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Processing implements VoiceTranscriptionState {
        public static final int $stable = 0;
        public static final Processing INSTANCE = new Processing();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Processing)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 515734083;
        }

        public String toString() {
            return "Processing";
        }

        private Processing() {
        }
    }

    /* compiled from: VoiceTranscriptionState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState$Completed;", "Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Completed implements VoiceTranscriptionState {
        public static final int $stable = 0;
        public static final Completed INSTANCE = new Completed();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Completed)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -291535589;
        }

        public String toString() {
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED;
        }

        private Completed() {
        }
    }

    /* compiled from: VoiceTranscriptionState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState$Error;", "Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;", "error", "Lio/intercom/android/sdk/m5/conversation/errors/VoiceTranscriptionError;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/errors/VoiceTranscriptionError;)V", "getError", "()Lio/intercom/android/sdk/m5/conversation/errors/VoiceTranscriptionError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements VoiceTranscriptionState {
        public static final int $stable = 8;
        private final VoiceTranscriptionError error;

        public static /* synthetic */ Error copy$default(Error error, VoiceTranscriptionError voiceTranscriptionError, int i, Object obj) {
            if ((i & 1) != 0) {
                voiceTranscriptionError = error.error;
            }
            return error.copy(voiceTranscriptionError);
        }

        /* renamed from: component1, reason: from getter */
        public final VoiceTranscriptionError getError() {
            return this.error;
        }

        public final Error copy(VoiceTranscriptionError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ')';
        }

        public Error(VoiceTranscriptionError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final VoiceTranscriptionError getError() {
            return this.error;
        }
    }
}
