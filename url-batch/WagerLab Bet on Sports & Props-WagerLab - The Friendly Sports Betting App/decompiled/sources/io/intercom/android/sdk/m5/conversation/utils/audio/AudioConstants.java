package io.intercom.android.sdk.m5.conversation.utils.audio;

import kotlin.Metadata;

/* compiled from: AudioConstants.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioConstants;", "", "<init>", "()V", "AUDIO_SAMPLE_RATE", "", "AUDIO_BIT_RATE", "AUDIO_MEDIA_TYPE", "", "AUDIO_FILE_EXTENSION", "TRANSCRIPTION_TIMEOUT_MS", "", "MAX_AUDIO_FILE_SIZE_MB", "MAX_RECORDING_DURATION_MS", "MIN_RECORDING_DURATION_MS", "AUDIO_FILE_BUFFER_SIZE", "FILE_AVAILABILITY_MAX_RETRIES", "FILE_AVAILABILITY_BASE_DELAY_MS", "TEMP_AUDIO_FILE_PREFIX", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AudioConstants {
    public static final int $stable = 0;
    public static final int AUDIO_BIT_RATE = 128000;
    public static final int AUDIO_FILE_BUFFER_SIZE = 2048;
    public static final String AUDIO_FILE_EXTENSION = ".m4a";
    public static final String AUDIO_MEDIA_TYPE = "audio/m4a";
    public static final int AUDIO_SAMPLE_RATE = 44100;
    public static final long FILE_AVAILABILITY_BASE_DELAY_MS = 10;
    public static final int FILE_AVAILABILITY_MAX_RETRIES = 10;
    public static final AudioConstants INSTANCE = new AudioConstants();
    public static final int MAX_AUDIO_FILE_SIZE_MB = 10;
    public static final long MAX_RECORDING_DURATION_MS = 300000;
    public static final long MIN_RECORDING_DURATION_MS = 1000;
    public static final String TEMP_AUDIO_FILE_PREFIX = "intercom_voice_";
    public static final long TRANSCRIPTION_TIMEOUT_MS = 30000;

    private AudioConstants() {
    }
}
