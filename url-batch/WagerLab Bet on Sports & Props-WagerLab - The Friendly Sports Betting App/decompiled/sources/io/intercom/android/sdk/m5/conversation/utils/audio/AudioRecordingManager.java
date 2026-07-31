package io.intercom.android.sdk.m5.conversation.utils.audio;

import android.content.Context;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.utilities.IoUtils;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: AudioRecordingManager.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000 /2\u00020\u0001:\u0004/012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\u001eJ\b\u0010!\u001a\u00020\u000bH\u0002J\b\u0010\"\u001a\u00020\tH\u0002J\u0018\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000bH\u0002J\b\u0010&\u001a\u00020\u001eH\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u000bH\u0002J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\tH\u0002J\b\u0010+\u001a\u00020\u001eH\u0002J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u00063"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager;", "", "context", "Landroid/content/Context;", "amplitudeScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "mediaRecorder", "Landroid/media/MediaRecorder;", "currentRecordingFile", "Ljava/io/File;", "amplitudeMonitoringJob", "Lkotlinx/coroutines/Job;", "_recordingState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingState;", "recordingState", "Lkotlinx/coroutines/flow/StateFlow;", "getRecordingState", "()Lkotlinx/coroutines/flow/StateFlow;", "_amplitudeLevel", "", "amplitudeLevel", "getAmplitudeLevel", "startRecording", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingResult;", "stopRecording", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingStopResult;", "cancelRecording", "", "cleanupCompletedRecording", "dispose", "createAudioFile", "createMediaRecorder", "configureRecorder", "recorder", "outputFile", "cleanup", "waitForFileAvailability", "", "file", "startAmplitudeMonitoring", "stopAmplitudeMonitoring", "normalizeAmplitude", "rawAmplitude", "", "Companion", "RecordingState", "RecordingResult", "RecordingStopResult", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AudioRecordingManager {
    private static final long AMPLITUDE_MONITORING_INTERVAL_MS = 60;
    private static final int AUDIO_BIT_RATE = 128000;
    private static final String AUDIO_FILE_EXTENSION = "m4a";
    private static final String AUDIO_RECORDINGS_FOLDER = "audio_recordings";
    private static final int AUDIO_SAMPLE_RATE = 44100;
    private static final long FILE_AVAILABILITY_BASE_DELAY_MS = 10;
    private static final int FILE_AVAILABILITY_MAX_RETRIES = 10;
    private static final double MAX_AMPLITUDE_REFERENCE = 32767.0d;
    private final MutableStateFlow<Float> _amplitudeLevel;
    private final MutableStateFlow<RecordingState> _recordingState;
    private final StateFlow<Float> amplitudeLevel;
    private Job amplitudeMonitoringJob;
    private final CoroutineScope amplitudeScope;
    private final Context context;
    private File currentRecordingFile;
    private MediaRecorder mediaRecorder;
    private final StateFlow<RecordingState> recordingState;
    public static final int $stable = 8;

    public AudioRecordingManager(Context context, CoroutineScope amplitudeScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(amplitudeScope, "amplitudeScope");
        this.context = context;
        this.amplitudeScope = amplitudeScope;
        MutableStateFlow<RecordingState> MutableStateFlow = StateFlowKt.MutableStateFlow(RecordingState.Idle.INSTANCE);
        this._recordingState = MutableStateFlow;
        this.recordingState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Float> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Float.valueOf(0.0f));
        this._amplitudeLevel = MutableStateFlow2;
        this.amplitudeLevel = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final StateFlow<RecordingState> getRecordingState() {
        return this.recordingState;
    }

    public final StateFlow<Float> getAmplitudeLevel() {
        return this.amplitudeLevel;
    }

    public final RecordingResult startRecording() {
        try {
            if (!Intrinsics.areEqual(this._recordingState.getValue(), RecordingState.Idle.INSTANCE)) {
                return new RecordingResult.Error("Recording already in progress");
            }
            File createAudioFile = createAudioFile();
            this.currentRecordingFile = createAudioFile;
            MediaRecorder createMediaRecorder = createMediaRecorder();
            this.mediaRecorder = createMediaRecorder;
            configureRecorder(createMediaRecorder, createAudioFile);
            createMediaRecorder.prepare();
            createMediaRecorder.start();
            startAmplitudeMonitoring(createMediaRecorder);
            this._recordingState.setValue(new RecordingState.Recording(createAudioFile));
            return RecordingResult.Success.INSTANCE;
        } catch (IOException e) {
            stopAmplitudeMonitoring();
            cleanup();
            this._recordingState.setValue(new RecordingState.Error("Failed to start recording: " + e.getMessage()));
            return new RecordingResult.Error("Failed to start recording: " + e.getMessage());
        } catch (Exception e2) {
            stopAmplitudeMonitoring();
            cleanup();
            this._recordingState.setValue(new RecordingState.Error("Unexpected error: " + e2.getMessage()));
            return new RecordingResult.Error("Unexpected error: " + e2.getMessage());
        }
    }

    public final RecordingStopResult stopRecording() {
        try {
            MediaRecorder mediaRecorder = this.mediaRecorder;
            File file = this.currentRecordingFile;
            if (mediaRecorder != null && file != null) {
                stopAmplitudeMonitoring();
                mediaRecorder.stop();
                mediaRecorder.release();
                this.mediaRecorder = null;
                if (!waitForFileAvailability(file)) {
                    cleanup();
                    this._recordingState.setValue(new RecordingState.Error("Recording file is empty or missing"));
                    return new RecordingStopResult.Error("Recording file is empty or missing");
                }
                Context context = this.context;
                Uri uriForFile = FileProvider.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), file);
                MutableStateFlow<RecordingState> mutableStateFlow = this._recordingState;
                Intrinsics.checkNotNull(uriForFile);
                mutableStateFlow.setValue(new RecordingState.Completed(uriForFile, file));
                return new RecordingStopResult.Success(uriForFile, file);
            }
            this._recordingState.setValue(new RecordingState.Error("No active recording"));
            return new RecordingStopResult.Error("No active recording");
        } catch (Exception e) {
            stopAmplitudeMonitoring();
            cleanup();
            this._recordingState.setValue(new RecordingState.Error("Failed to stop recording: " + e.getMessage()));
            return new RecordingStopResult.Error("Failed to stop recording: " + e.getMessage());
        }
    }

    public final void cancelRecording() {
        stopAmplitudeMonitoring();
        cleanup();
        this._recordingState.setValue(RecordingState.Idle.INSTANCE);
    }

    public final void cleanupCompletedRecording() {
        RecordingState value = this._recordingState.getValue();
        if (value instanceof RecordingState.Completed) {
            IoUtils.safelyDelete(((RecordingState.Completed) value).getFile());
        }
        this._recordingState.setValue(RecordingState.Idle.INSTANCE);
    }

    public final void dispose() {
        stopAmplitudeMonitoring();
        cleanup();
        cleanupCompletedRecording();
        this._recordingState.setValue(RecordingState.Idle.INSTANCE);
    }

    private final File createAudioFile() {
        File externalCacheDir = this.context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = this.context.getCacheDir();
        }
        if (externalCacheDir == null) {
            throw new IOException("Unable to access cache directories for audio recording");
        }
        File file = new File(externalCacheDir, AUDIO_RECORDINGS_FOLDER);
        file.mkdirs();
        return new File(file, UUID.randomUUID() + AudioConstants.AUDIO_FILE_EXTENSION);
    }

    private final MediaRecorder createMediaRecorder() {
        if (Build.VERSION.SDK_INT >= 31) {
            return new MediaRecorder(this.context);
        }
        return new MediaRecorder();
    }

    private final void configureRecorder(MediaRecorder recorder, File outputFile) {
        recorder.setAudioSource(1);
        recorder.setOutputFormat(2);
        recorder.setAudioEncoder(3);
        recorder.setAudioSamplingRate(44100);
        recorder.setAudioEncodingBitRate(128000);
        recorder.setOutputFile(outputFile.getAbsolutePath());
    }

    private final void cleanup() {
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
            } catch (Exception unused) {
            }
            mediaRecorder.release();
        }
        this.mediaRecorder = null;
        File file = this.currentRecordingFile;
        if (file != null) {
            IoUtils.safelyDelete(file);
        }
        this.currentRecordingFile = null;
    }

    private final boolean waitForFileAvailability(File file) {
        for (int i = 0; i < 10; i++) {
            if (file.exists() && file.length() > 0) {
                return true;
            }
            if (i < 9) {
                Thread.sleep((1 << i) * 10);
            }
        }
        return false;
    }

    private final void startAmplitudeMonitoring(MediaRecorder recorder) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.amplitudeScope, null, null, new AudioRecordingManager$startAmplitudeMonitoring$1(recorder, this, null), 3, null);
        this.amplitudeMonitoringJob = launch$default;
    }

    private final void stopAmplitudeMonitoring() {
        Job job = this.amplitudeMonitoringJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.amplitudeMonitoringJob = null;
        this._amplitudeLevel.setValue(Float.valueOf(0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float normalizeAmplitude(int rawAmplitude) {
        if (rawAmplitude <= 0) {
            return 0.0f;
        }
        return (float) Math.max(0.0d, ((20 * Math.log10(Math.max(rawAmplitude / MAX_AMPLITUDE_REFERENCE, 0.001d))) + 60.0d) / 60.0d);
    }

    /* compiled from: AudioRecordingManager.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingState;", "", "Idle", "Recording", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, "Error", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingState$Completed;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingState$Error;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingState$Idle;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingState$Recording;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RecordingState {

        /* compiled from: AudioRecordingManager.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingState$Idle;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Idle implements RecordingState {
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
                return -114329640;
            }

            public String toString() {
                return "Idle";
            }

            private Idle() {
            }
        }

        /* compiled from: AudioRecordingManager.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingState$Recording;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingState;", "file", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Recording implements RecordingState {
            public static final int $stable = 8;
            private final File file;

            public static /* synthetic */ Recording copy$default(Recording recording, File file, int i, Object obj) {
                if ((i & 1) != 0) {
                    file = recording.file;
                }
                return recording.copy(file);
            }

            /* renamed from: component1, reason: from getter */
            public final File getFile() {
                return this.file;
            }

            public final Recording copy(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return new Recording(file);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Recording) && Intrinsics.areEqual(this.file, ((Recording) other).file);
            }

            public int hashCode() {
                return this.file.hashCode();
            }

            public String toString() {
                return "Recording(file=" + this.file + ')';
            }

            public Recording(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                this.file = file;
            }

            public final File getFile() {
                return this.file;
            }
        }

        /* compiled from: AudioRecordingManager.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingState$Completed;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingState;", "uri", "Landroid/net/Uri;", "file", "Ljava/io/File;", "<init>", "(Landroid/net/Uri;Ljava/io/File;)V", "getUri", "()Landroid/net/Uri;", "getFile", "()Ljava/io/File;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Completed implements RecordingState {
            public static final int $stable = 8;
            private final File file;
            private final Uri uri;

            public static /* synthetic */ Completed copy$default(Completed completed, Uri uri, File file, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = completed.uri;
                }
                if ((i & 2) != 0) {
                    file = completed.file;
                }
                return completed.copy(uri, file);
            }

            /* renamed from: component1, reason: from getter */
            public final Uri getUri() {
                return this.uri;
            }

            /* renamed from: component2, reason: from getter */
            public final File getFile() {
                return this.file;
            }

            public final Completed copy(Uri uri, File file) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(file, "file");
                return new Completed(uri, file);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Completed)) {
                    return false;
                }
                Completed completed = (Completed) other;
                return Intrinsics.areEqual(this.uri, completed.uri) && Intrinsics.areEqual(this.file, completed.file);
            }

            public int hashCode() {
                return (this.uri.hashCode() * 31) + this.file.hashCode();
            }

            public String toString() {
                return "Completed(uri=" + this.uri + ", file=" + this.file + ')';
            }

            public Completed(Uri uri, File file) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(file, "file");
                this.uri = uri;
                this.file = file;
            }

            public final File getFile() {
                return this.file;
            }

            public final Uri getUri() {
                return this.uri;
            }
        }

        /* compiled from: AudioRecordingManager.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingState$Error;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingState;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements RecordingState {
            public static final int $stable = 0;
            private final String message;

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final Error copy(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Error(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "Error(message=" + this.message + ')';
            }

            public Error(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public final String getMessage() {
                return this.message;
            }
        }
    }

    /* compiled from: AudioRecordingManager.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingResult;", "", "Success", "Error", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingResult$Error;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingResult$Success;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RecordingResult {

        /* compiled from: AudioRecordingManager.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingResult$Success;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements RecordingResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1987294265;
            }

            public String toString() {
                return "Success";
            }

            private Success() {
            }
        }

        /* compiled from: AudioRecordingManager.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingResult$Error;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements RecordingResult {
            public static final int $stable = 0;
            private final String message;

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final Error copy(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Error(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "Error(message=" + this.message + ')';
            }

            public Error(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public final String getMessage() {
                return this.message;
            }
        }
    }

    /* compiled from: AudioRecordingManager.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingStopResult;", "", "Success", "Error", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingStopResult$Error;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingStopResult$Success;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RecordingStopResult {

        /* compiled from: AudioRecordingManager.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingStopResult$Success;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingStopResult;", "uri", "Landroid/net/Uri;", "file", "Ljava/io/File;", "<init>", "(Landroid/net/Uri;Ljava/io/File;)V", "getUri", "()Landroid/net/Uri;", "getFile", "()Ljava/io/File;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements RecordingStopResult {
            public static final int $stable = 8;
            private final File file;
            private final Uri uri;

            public static /* synthetic */ Success copy$default(Success success, Uri uri, File file, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = success.uri;
                }
                if ((i & 2) != 0) {
                    file = success.file;
                }
                return success.copy(uri, file);
            }

            /* renamed from: component1, reason: from getter */
            public final Uri getUri() {
                return this.uri;
            }

            /* renamed from: component2, reason: from getter */
            public final File getFile() {
                return this.file;
            }

            public final Success copy(Uri uri, File file) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(file, "file");
                return new Success(uri, file);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.areEqual(this.uri, success.uri) && Intrinsics.areEqual(this.file, success.file);
            }

            public int hashCode() {
                return (this.uri.hashCode() * 31) + this.file.hashCode();
            }

            public String toString() {
                return "Success(uri=" + this.uri + ", file=" + this.file + ')';
            }

            public Success(Uri uri, File file) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(file, "file");
                this.uri = uri;
                this.file = file;
            }

            public final File getFile() {
                return this.file;
            }

            public final Uri getUri() {
                return this.uri;
            }
        }

        /* compiled from: AudioRecordingManager.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingStopResult$Error;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager$RecordingStopResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements RecordingStopResult {
            public static final int $stable = 0;
            private final String message;

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final Error copy(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Error(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "Error(message=" + this.message + ')';
            }

            public Error(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public final String getMessage() {
                return this.message;
            }
        }
    }
}
