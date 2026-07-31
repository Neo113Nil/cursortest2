package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import androidx.annotation.RequiresApi;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@RequiresApi
/* loaded from: classes8.dex */
final class zzaej extends zzaeg implements Choreographer$VsyncCallback {
    private final Handler zzf;

    /* synthetic */ zzaej(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        super(choreographer, displayManager, null);
        this.zzf = zzfm.zzd(null);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.zza.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        long frameTimeNanos;
        Choreographer.FrameTimeline[] frameTimelines;
        long expectedPresentationTimeNanos;
        long expectedPresentationTimeNanos2;
        frameTimeNanos = frameData.getFrameTimeNanos();
        this.zzc = frameTimeNanos;
        frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos();
            expectedPresentationTimeNanos2 = frameTimelines[0].getExpectedPresentationTimeNanos();
            long j = expectedPresentationTimeNanos - expectedPresentationTimeNanos2;
            this.zzd = j != 0 ? j : -9223372036854775807L;
        } else {
            this.zzd = -9223372036854775807L;
        }
        this.zzf.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaei
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzaej zzaejVar = zzaej.this;
                zzaejVar.zza.postVsyncCallback(zzaejVar);
            }
        }, 500L);
    }

    @Override // com.google.android.gms.internal.ads.zzaeg
    final void zza() {
        super.zza();
        this.zza.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaeg
    final void zzb() {
        this.zzb.unregisterDisplayListener(this);
        this.zzf.removeCallbacksAndMessages(null);
        this.zza.removeVsyncCallback(this);
        this.zzc = -9223372036854775807L;
        this.zzd = -9223372036854775807L;
    }
}
