package io.intercom.android.sdk.m5.conversation.errors;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: VoiceTranscriptionError.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B%\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/errors/VoiceTranscriptionError;", "", "userMessage", "Lio/intercom/android/sdk/ui/common/StringProvider;", "debugMessage", "", "cause", "", "<init>", "(Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/String;Ljava/lang/Throwable;)V", "getUserMessage", "()Lio/intercom/android/sdk/ui/common/StringProvider;", InAppPurchaseConstants.METHOD_GET_DEBUG_MESSAGE, "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "TranscriptionFailed", "FileTooLarge", "RecordingFailed", "Lio/intercom/android/sdk/m5/conversation/errors/VoiceTranscriptionError$FileTooLarge;", "Lio/intercom/android/sdk/m5/conversation/errors/VoiceTranscriptionError$RecordingFailed;", "Lio/intercom/android/sdk/m5/conversation/errors/VoiceTranscriptionError$TranscriptionFailed;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class VoiceTranscriptionError {
    public static final int $stable = 8;
    private final Throwable cause;
    private final String debugMessage;
    private final StringProvider userMessage;

    public /* synthetic */ VoiceTranscriptionError(StringProvider stringProvider, String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringProvider, str, th);
    }

    private VoiceTranscriptionError(StringProvider stringProvider, String str, Throwable th) {
        this.userMessage = stringProvider;
        this.debugMessage = str;
        this.cause = th;
    }

    public /* synthetic */ VoiceTranscriptionError(StringProvider stringProvider, String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringProvider, str, (i & 4) != 0 ? null : th, null);
    }

    public final StringProvider getUserMessage() {
        return this.userMessage;
    }

    public final String getDebugMessage() {
        return this.debugMessage;
    }

    public final Throwable getCause() {
        return this.cause;
    }

    /* compiled from: VoiceTranscriptionError.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/errors/VoiceTranscriptionError$TranscriptionFailed;", "Lio/intercom/android/sdk/m5/conversation/errors/VoiceTranscriptionError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TranscriptionFailed extends VoiceTranscriptionError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public TranscriptionFailed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ TranscriptionFailed(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TranscriptionFailed(Throwable th) {
            super(new StringProvider.StringRes(R.string.intercom_transcription_failed, null, 2, 0 == true ? 1 : 0), "Transcription failed: " + ((th == null || (r2 = th.getMessage()) == null) ? "Unknown error" : r2), th, 0 == true ? 1 : 0);
            String message;
        }
    }

    /* compiled from: VoiceTranscriptionError.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/errors/VoiceTranscriptionError$FileTooLarge;", "Lio/intercom/android/sdk/m5/conversation/errors/VoiceTranscriptionError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FileTooLarge extends VoiceTranscriptionError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public FileTooLarge() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ FileTooLarge(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FileTooLarge(Throwable th) {
            super(new StringProvider.StringRes(R.string.intercom_file_too_large_to_transcribe, null, 2, 0 == true ? 1 : 0), "Audio file exceeds maximum size limit", th, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: VoiceTranscriptionError.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/errors/VoiceTranscriptionError$RecordingFailed;", "Lio/intercom/android/sdk/m5/conversation/errors/VoiceTranscriptionError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RecordingFailed extends VoiceTranscriptionError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public RecordingFailed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ RecordingFailed(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RecordingFailed(Throwable th) {
            super(new StringProvider.StringRes(R.string.intercom_something_went_wrong_try_again, null, 2, 0 == true ? 1 : 0), "Audio recording failed: " + ((th == null || (r2 = th.getMessage()) == null) ? "Unknown error" : r2), th, 0 == true ? 1 : 0);
            String message;
        }
    }
}
