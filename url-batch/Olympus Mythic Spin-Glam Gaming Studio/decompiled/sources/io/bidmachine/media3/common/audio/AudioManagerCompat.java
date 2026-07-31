package io.bidmachine.media3.common.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.BackgroundExecutor;
import io.bidmachine.media3.common.util.ConditionVariable;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes9.dex */
public final class AudioManagerCompat {
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    public static final int AUDIOFOCUS_NONE = 0;
    private static final String TAG = "AudioManagerCompat";
    private static Context applicationContext;

    @Nullable
    private static AudioManager audioManager;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AudioFocusGain {
    }

    public static synchronized AudioManager getAudioManager(Context context) {
        synchronized (AudioManagerCompat.class) {
            try {
                final Context applicationContext2 = context.getApplicationContext();
                if (applicationContext != applicationContext2) {
                    audioManager = null;
                }
                AudioManager audioManager2 = audioManager;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    final ConditionVariable conditionVariable = new ConditionVariable();
                    BackgroundExecutor.get().execute(new Runnable() { // from class: io.bidmachine.media3.common.audio.AudioManagerCompat$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioManagerCompat.lambda$getAudioManager$0(applicationContext2, conditionVariable);
                        }
                    });
                    conditionVariable.blockUninterruptible();
                    return (AudioManager) Assertions.checkNotNull(audioManager);
                }
                AudioManager audioManager3 = (AudioManager) applicationContext2.getSystemService("audio");
                audioManager = audioManager3;
                return (AudioManager) Assertions.checkNotNull(audioManager3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAudioManager$0(Context context, ConditionVariable conditionVariable) {
        audioManager = (AudioManager) context.getSystemService("audio");
        conditionVariable.open();
    }

    public static int requestAudioFocus(AudioManager audioManager2, AudioFocusRequestCompat audioFocusRequestCompat) {
        int requestAudioFocus;
        if (Util.SDK_INT >= 26) {
            requestAudioFocus = audioManager2.requestAudioFocus(audioFocusRequestCompat.getAudioFocusRequest());
            return requestAudioFocus;
        }
        return audioManager2.requestAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener(), audioFocusRequestCompat.getAudioAttributes().getStreamType(), audioFocusRequestCompat.getFocusGain());
    }

    public static int abandonAudioFocusRequest(AudioManager audioManager2, AudioFocusRequestCompat audioFocusRequestCompat) {
        int abandonAudioFocusRequest;
        if (Util.SDK_INT >= 26) {
            abandonAudioFocusRequest = audioManager2.abandonAudioFocusRequest(audioFocusRequestCompat.getAudioFocusRequest());
            return abandonAudioFocusRequest;
        }
        return audioManager2.abandonAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener());
    }

    @IntRange
    public static int getStreamMaxVolume(AudioManager audioManager2, int i) {
        return audioManager2.getStreamMaxVolume(i);
    }

    @IntRange
    public static int getStreamMinVolume(AudioManager audioManager2, int i) {
        int streamMinVolume;
        if (Util.SDK_INT < 28) {
            return 0;
        }
        streamMinVolume = audioManager2.getStreamMinVolume(i);
        return streamMinVolume;
    }

    public static int getStreamVolume(AudioManager audioManager2, int i) {
        try {
            return audioManager2.getStreamVolume(i);
        } catch (RuntimeException e) {
            Log.w(TAG, "Could not retrieve stream volume for stream type " + i, e);
            return audioManager2.getStreamMaxVolume(i);
        }
    }

    public static boolean isStreamMute(AudioManager audioManager2, int i) {
        if (Util.SDK_INT >= 23) {
            return audioManager2.isStreamMute(i);
        }
        return getStreamVolume(audioManager2, i) == 0;
    }

    private AudioManagerCompat() {
    }
}
