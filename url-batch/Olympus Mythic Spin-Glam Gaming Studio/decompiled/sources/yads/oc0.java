package yads;

import android.media.AudioTrack;
import android.os.Handler;
import androidx.media3.exoplayer.audio.DefaultAudioSink$StreamEventCallbackV29$$ExternalSyntheticLambda2;
import java.util.Objects;

/* loaded from: classes14.dex */
public final class oc0 {
    public final Handler a = new Handler();
    public final nc0 b = new nc0(this);
    public final /* synthetic */ pc0 c;

    public oc0(pc0 pc0Var) {
        this.c = pc0Var;
    }

    public final void a(AudioTrack audioTrack) {
        Handler handler = this.a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new DefaultAudioSink$StreamEventCallbackV29$$ExternalSyntheticLambda2(handler), this.b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
