package io.bidmachine.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.common.base.Function;
import io.bidmachine.media3.common.audio.AudioManagerCompat;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.BackgroundThreadStateHandler;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.StreamVolumeManager;

/* loaded from: classes13.dex */
final class StreamVolumeManager {
    private static final String TAG = "StreamVolumeManager";
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private final Context applicationContext;
    private AudioManager audioManager;
    private final Listener listener;

    @Nullable
    private VolumeChangeReceiver receiver;
    private final BackgroundThreadStateHandler<StreamVolumeState> stateHandler;
    private int volumeBeforeMute;

    public interface Listener {
        void onStreamTypeChanged(int i);

        void onStreamVolumeChanged(int i, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StreamVolumeState lambda$release$11(StreamVolumeState streamVolumeState) {
        return streamVolumeState;
    }

    public StreamVolumeManager(Context context, Listener listener, final int i, Looper looper, Looper looper2, Clock clock) {
        this.applicationContext = context.getApplicationContext();
        this.listener = listener;
        BackgroundThreadStateHandler<StreamVolumeState> backgroundThreadStateHandler = new BackgroundThreadStateHandler<>(new StreamVolumeState(i, 0, false, 0, 0), looper, looper2, clock, new BackgroundThreadStateHandler.StateChangeListener() { // from class: io.bidmachine.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda10
            @Override // io.bidmachine.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
            public final void onStateChanged(Object obj, Object obj2) {
                StreamVolumeManager.this.onStreamVolumeStateChanged((StreamVolumeManager.StreamVolumeState) obj, (StreamVolumeManager.StreamVolumeState) obj2);
            }
        });
        this.stateHandler = backgroundThreadStateHandler;
        backgroundThreadStateHandler.runInBackground(new Runnable() { // from class: io.bidmachine.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                StreamVolumeManager.this.lambda$new$0(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i) {
        this.audioManager = (AudioManager) Assertions.checkStateNotNull((AudioManager) this.applicationContext.getSystemService("audio"));
        VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();
        try {
            this.applicationContext.registerReceiver(volumeChangeReceiver, new IntentFilter(VOLUME_CHANGED_ACTION));
            this.receiver = volumeChangeReceiver;
        } catch (RuntimeException e) {
            Log.w(TAG, "Error registering stream volume receiver", e);
        }
        this.stateHandler.setStateInBackground(generateState(i));
    }

    public void setStreamType(final int i) {
        this.stateHandler.updateStateAsync(new Function() { // from class: io.bidmachine.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda8
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                StreamVolumeManager.StreamVolumeState lambda$setStreamType$1;
                lambda$setStreamType$1 = StreamVolumeManager.lambda$setStreamType$1(i, (StreamVolumeManager.StreamVolumeState) obj);
                return lambda$setStreamType$1;
            }
        }, new Function() { // from class: io.bidmachine.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda9
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                StreamVolumeManager.StreamVolumeState lambda$setStreamType$2;
                lambda$setStreamType$2 = StreamVolumeManager.this.lambda$setStreamType$2(i, (StreamVolumeManager.StreamVolumeState) obj);
                return lambda$setStreamType$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StreamVolumeState lambda$setStreamType$1(int i, StreamVolumeState streamVolumeState) {
        return new StreamVolumeState(i, streamVolumeState.volume, streamVolumeState.muted, streamVolumeState.minVolume, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$setStreamType$2(int i, StreamVolumeState streamVolumeState) {
        return streamVolumeState.streamType == i ? streamVolumeState : generateState(i);
    }

    public int getMinVolume() {
        return this.stateHandler.get().minVolume;
    }

    public int getMaxVolume() {
        return this.stateHandler.get().maxVolume;
    }

    public int getVolume() {
        return this.stateHandler.get().volume;
    }

    public boolean isMuted() {
        return this.stateHandler.get().muted;
    }

    @SuppressLint({"WrongConstant"})
    public void setVolume(final int i, final int i2) {
        this.stateHandler.updateStateAsync(new Function() { // from class: io.bidmachine.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                StreamVolumeManager.StreamVolumeState lambda$setVolume$3;
                lambda$setVolume$3 = StreamVolumeManager.lambda$setVolume$3(i, (StreamVolumeManager.StreamVolumeState) obj);
                return lambda$setVolume$3;
            }
        }, new Function() { // from class: io.bidmachine.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda3
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                StreamVolumeManager.StreamVolumeState lambda$setVolume$4;
                lambda$setVolume$4 = StreamVolumeManager.this.lambda$setVolume$4(i, i2, (StreamVolumeManager.StreamVolumeState) obj);
                return lambda$setVolume$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StreamVolumeState lambda$setVolume$3(int i, StreamVolumeState streamVolumeState) {
        int i2 = streamVolumeState.streamType;
        int i3 = streamVolumeState.minVolume;
        return new StreamVolumeState(i2, (i < i3 || i > streamVolumeState.maxVolume) ? streamVolumeState.volume : i, i == 0, i3, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$setVolume$4(int i, int i2, StreamVolumeState streamVolumeState) {
        if (i == streamVolumeState.volume || i < streamVolumeState.minVolume || i > streamVolumeState.maxVolume) {
            return streamVolumeState;
        }
        ((AudioManager) Assertions.checkNotNull(this.audioManager)).setStreamVolume(streamVolumeState.streamType, i, i2);
        return generateState(streamVolumeState.streamType);
    }

    @SuppressLint({"WrongConstant"})
    public void increaseVolume(final int i) {
        this.stateHandler.updateStateAsync(new Function() { // from class: io.bidmachine.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda12
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                StreamVolumeManager.StreamVolumeState lambda$increaseVolume$5;
                lambda$increaseVolume$5 = StreamVolumeManager.lambda$increaseVolume$5((StreamVolumeManager.StreamVolumeState) obj);
                return lambda$increaseVolume$5;
            }
        }, new Function() { // from class: io.bidmachine.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda13
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                StreamVolumeManager.StreamVolumeState lambda$increaseVolume$6;
                lambda$increaseVolume$6 = StreamVolumeManager.this.lambda$increaseVolume$6(i, (StreamVolumeManager.StreamVolumeState) obj);
                return lambda$increaseVolume$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StreamVolumeState lambda$increaseVolume$5(StreamVolumeState streamVolumeState) {
        int i = streamVolumeState.streamType;
        int i2 = streamVolumeState.volume;
        int i3 = streamVolumeState.maxVolume;
        return new StreamVolumeState(i, i2 < i3 ? i2 + 1 : i3, false, streamVolumeState.minVolume, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$increaseVolume$6(int i, StreamVolumeState streamVolumeState) {
        if (streamVolumeState.volume >= streamVolumeState.maxVolume) {
            return streamVolumeState;
        }
        ((AudioManager) Assertions.checkNotNull(this.audioManager)).adjustStreamVolume(streamVolumeState.streamType, 1, i);
        return generateState(streamVolumeState.streamType);
    }

    @SuppressLint({"WrongConstant"})
    public void decreaseVolume(final int i) {
        this.stateHandler.updateStateAsync(new Function() { // from class: io.bidmachine.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                StreamVolumeManager.StreamVolumeState lambda$decreaseVolume$7;
                lambda$decreaseVolume$7 = StreamVolumeManager.lambda$decreaseVolume$7((StreamVolumeManager.StreamVolumeState) obj);
                return lambda$decreaseVolume$7;
            }
        }, new Function() { // from class: io.bidmachine.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                StreamVolumeManager.StreamVolumeState lambda$decreaseVolume$8;
                lambda$decreaseVolume$8 = StreamVolumeManager.this.lambda$decreaseVolume$8(i, (StreamVolumeManager.StreamVolumeState) obj);
                return lambda$decreaseVolume$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StreamVolumeState lambda$decreaseVolume$7(StreamVolumeState streamVolumeState) {
        int i = streamVolumeState.streamType;
        int i2 = streamVolumeState.volume;
        int i3 = streamVolumeState.minVolume;
        return new StreamVolumeState(i, i2 > i3 ? i2 - 1 : i3, i2 <= 1, i3, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$decreaseVolume$8(int i, StreamVolumeState streamVolumeState) {
        if (streamVolumeState.volume <= streamVolumeState.minVolume) {
            return streamVolumeState;
        }
        ((AudioManager) Assertions.checkNotNull(this.audioManager)).adjustStreamVolume(streamVolumeState.streamType, -1, i);
        return generateState(streamVolumeState.streamType);
    }

    @SuppressLint({"WrongConstant"})
    public void setMuted(final boolean z, final int i) {
        this.stateHandler.updateStateAsync(new Function() { // from class: io.bidmachine.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda6
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                StreamVolumeManager.StreamVolumeState lambda$setMuted$9;
                lambda$setMuted$9 = StreamVolumeManager.this.lambda$setMuted$9(z, (StreamVolumeManager.StreamVolumeState) obj);
                return lambda$setMuted$9;
            }
        }, new Function() { // from class: io.bidmachine.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda7
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                StreamVolumeManager.StreamVolumeState lambda$setMuted$10;
                lambda$setMuted$10 = StreamVolumeManager.this.lambda$setMuted$10(z, i, (StreamVolumeManager.StreamVolumeState) obj);
                return lambda$setMuted$10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$setMuted$9(boolean z, StreamVolumeState streamVolumeState) {
        return new StreamVolumeState(streamVolumeState.streamType, streamVolumeState.muted == z ? streamVolumeState.volume : z ? 0 : this.volumeBeforeMute, z, streamVolumeState.minVolume, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$setMuted$10(boolean z, int i, StreamVolumeState streamVolumeState) {
        if (streamVolumeState.muted == z) {
            return streamVolumeState;
        }
        Assertions.checkNotNull(this.audioManager);
        if (Util.SDK_INT >= 23) {
            this.audioManager.adjustStreamVolume(streamVolumeState.streamType, z ? -100 : 100, i);
        } else {
            this.audioManager.setStreamMute(streamVolumeState.streamType, z);
        }
        return generateState(streamVolumeState.streamType);
    }

    public void release() {
        this.stateHandler.updateStateAsync(new Function() { // from class: io.bidmachine.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda4
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                StreamVolumeManager.StreamVolumeState lambda$release$11;
                lambda$release$11 = StreamVolumeManager.lambda$release$11((StreamVolumeManager.StreamVolumeState) obj);
                return lambda$release$11;
            }
        }, new Function() { // from class: io.bidmachine.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda5
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                StreamVolumeManager.StreamVolumeState lambda$release$12;
                lambda$release$12 = StreamVolumeManager.this.lambda$release$12((StreamVolumeManager.StreamVolumeState) obj);
                return lambda$release$12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$release$12(StreamVolumeState streamVolumeState) {
        VolumeChangeReceiver volumeChangeReceiver = this.receiver;
        if (volumeChangeReceiver != null) {
            try {
                this.applicationContext.unregisterReceiver(volumeChangeReceiver);
            } catch (RuntimeException e) {
                Log.w(TAG, "Error unregistering stream volume receiver", e);
            }
            this.receiver = null;
        }
        return streamVolumeState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStreamVolumeStateChanged(StreamVolumeState streamVolumeState, StreamVolumeState streamVolumeState2) {
        boolean z = streamVolumeState.muted;
        if (!z && streamVolumeState2.muted) {
            this.volumeBeforeMute = streamVolumeState.volume;
        }
        int i = streamVolumeState.volume;
        int i2 = streamVolumeState2.volume;
        if (i != i2 || z != streamVolumeState2.muted) {
            this.listener.onStreamVolumeChanged(i2, streamVolumeState2.muted);
        }
        int i3 = streamVolumeState.streamType;
        int i4 = streamVolumeState2.streamType;
        if (i3 == i4 && streamVolumeState.minVolume == streamVolumeState2.minVolume && streamVolumeState.maxVolume == streamVolumeState2.maxVolume) {
            return;
        }
        this.listener.onStreamTypeChanged(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StreamVolumeState generateState(int i) {
        Assertions.checkNotNull(this.audioManager);
        return new StreamVolumeState(i, AudioManagerCompat.getStreamVolume(this.audioManager, i), AudioManagerCompat.isStreamMute(this.audioManager, i), AudioManagerCompat.getStreamMinVolume(this.audioManager, i), AudioManagerCompat.getStreamMaxVolume(this.audioManager, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class StreamVolumeState {
        public final int maxVolume;
        public final int minVolume;
        public final boolean muted;
        public final int streamType;
        public final int volume;

        public StreamVolumeState(int i, int i2, boolean z, int i3, int i4) {
            this.streamType = i;
            this.volume = i2;
            this.muted = z;
            this.minVolume = i3;
            this.maxVolume = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class VolumeChangeReceiver extends BroadcastReceiver {
        private VolumeChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            StreamVolumeManager.this.stateHandler.runInBackground(new Runnable() { // from class: io.bidmachine.media3.exoplayer.StreamVolumeManager$VolumeChangeReceiver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    StreamVolumeManager.VolumeChangeReceiver.this.lambda$onReceive$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0() {
            if (StreamVolumeManager.this.receiver == null) {
                return;
            }
            StreamVolumeManager.this.stateHandler.setStateInBackground(StreamVolumeManager.this.generateState(((StreamVolumeState) StreamVolumeManager.this.stateHandler.get()).streamType));
        }
    }
}
