package io.bidmachine.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.audio.AudioManagerCompat;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.audio.AudioOffloadSupport;
import io.bidmachine.media3.exoplayer.audio.DefaultAudioSink;

@UnstableApi
/* loaded from: classes11.dex */
public final class DefaultAudioOffloadSupportProvider implements DefaultAudioSink.AudioOffloadSupportProvider {
    private static final String OFFLOAD_VARIABLE_RATE_SUPPORTED_KEY = "offloadVariableRateSupported";

    @Nullable
    private final Context context;
    private Boolean isOffloadVariableRateSupported;

    public DefaultAudioOffloadSupportProvider() {
        this(null);
    }

    public DefaultAudioOffloadSupportProvider(@Nullable Context context) {
        this.context = context;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider
    public AudioOffloadSupport getAudioOffloadSupport(Format format, AudioAttributes audioAttributes) {
        Assertions.checkNotNull(format);
        Assertions.checkNotNull(audioAttributes);
        int i = Util.SDK_INT;
        if (i < 29 || format.sampleRate == -1) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        boolean isOffloadVariableRateSupported = isOffloadVariableRateSupported(this.context);
        int encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
        if (encoding == 0 || i < Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(encoding)) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(format.channelCount);
        if (audioTrackChannelConfig == 0) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        try {
            AudioFormat audioFormat = Util.getAudioFormat(format.sampleRate, audioTrackChannelConfig, encoding);
            if (i >= 31) {
                return Api31.getOffloadedPlaybackSupport(audioFormat, audioAttributes.getAudioAttributesV21().audioAttributes, isOffloadVariableRateSupported);
            }
            return Api29.getOffloadedPlaybackSupport(audioFormat, audioAttributes.getAudioAttributesV21().audioAttributes, isOffloadVariableRateSupported);
        } catch (IllegalArgumentException unused) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
    }

    private boolean isOffloadVariableRateSupported(@Nullable Context context) {
        Boolean bool = this.isOffloadVariableRateSupported;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = AudioManagerCompat.getAudioManager(context).getParameters(OFFLOAD_VARIABLE_RATE_SUPPORTED_KEY);
            this.isOffloadVariableRateSupported = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.isOffloadVariableRateSupported = Boolean.FALSE;
        }
        return this.isOffloadVariableRateSupported.booleanValue();
    }

    @RequiresApi
    private static final class Api29 {
        private Api29() {
        }

        public static AudioOffloadSupport getOffloadedPlaybackSupport(AudioFormat audioFormat, android.media.AudioAttributes audioAttributes, boolean z) {
            boolean isOffloadedPlaybackSupported;
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
            if (!isOffloadedPlaybackSupported) {
                return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            }
            return new AudioOffloadSupport.Builder().setIsFormatSupported(true).setIsSpeedChangeSupported(z).build();
        }
    }

    @RequiresApi
    private static final class Api31 {
        private Api31() {
        }

        public static AudioOffloadSupport getOffloadedPlaybackSupport(AudioFormat audioFormat, android.media.AudioAttributes audioAttributes, boolean z) {
            int playbackOffloadSupport;
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            }
            return new AudioOffloadSupport.Builder().setIsFormatSupported(true).setIsGaplessSupported(Util.SDK_INT > 32 && playbackOffloadSupport == 2).setIsSpeedChangeSupported(z).build();
        }
    }
}
