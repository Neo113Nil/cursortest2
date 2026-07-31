package io.bidmachine.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.HandlerWrapper;
import io.bidmachine.media3.exoplayer.AudioBecomingNoisyManager;

/* loaded from: classes11.dex */
final class AudioBecomingNoisyManager {
    private final HandlerWrapper backgroundHandler;
    private final Context context;
    private boolean isEnabled;
    private final AudioBecomingNoisyReceiver receiver;

    public interface EventListener {
        void onAudioBecomingNoisy();
    }

    public AudioBecomingNoisyManager(Context context, Looper looper, Looper looper2, EventListener eventListener, Clock clock) {
        this.context = context.getApplicationContext();
        this.backgroundHandler = clock.createHandler(looper, null);
        this.receiver = new AudioBecomingNoisyReceiver(clock.createHandler(looper2, null), eventListener);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public void setEnabled(boolean z) {
        if (z == this.isEnabled) {
            return;
        }
        if (z) {
            this.backgroundHandler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.AudioBecomingNoisyManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AudioBecomingNoisyManager.this.lambda$setEnabled$0();
                }
            });
            this.isEnabled = true;
        } else {
            this.backgroundHandler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.AudioBecomingNoisyManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AudioBecomingNoisyManager.this.lambda$setEnabled$1();
                }
            });
            this.isEnabled = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setEnabled$0() {
        this.context.registerReceiver(this.receiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setEnabled$1() {
        this.context.unregisterReceiver(this.receiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class AudioBecomingNoisyReceiver extends BroadcastReceiver {
        private final HandlerWrapper eventHandler;
        private final EventListener listener;

        public AudioBecomingNoisyReceiver(HandlerWrapper handlerWrapper, EventListener eventListener) {
            this.eventHandler = handlerWrapper;
            this.listener = eventListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.eventHandler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.AudioBecomingNoisyManager$AudioBecomingNoisyReceiver$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioBecomingNoisyManager.AudioBecomingNoisyReceiver.this.callListenerIfEnabled();
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void callListenerIfEnabled() {
            if (AudioBecomingNoisyManager.this.isEnabled) {
                this.listener.onAudioBecomingNoisy();
            }
        }
    }
}
