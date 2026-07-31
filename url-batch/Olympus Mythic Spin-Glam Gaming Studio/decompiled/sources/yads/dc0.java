package yads;

import android.media.AudioTrack;

/* loaded from: classes5.dex */
public final class dc0 extends Thread {
    public final /* synthetic */ AudioTrack b;
    public final /* synthetic */ pc0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc0(pc0 pc0Var, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.c = pc0Var;
        this.b = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.b.flush();
            this.b.release();
        } finally {
            this.c.h.d();
        }
    }
}
