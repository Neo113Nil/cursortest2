package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzny extends Thread {
    final /* synthetic */ AudioTrack zza;
    final /* synthetic */ zzon zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzny(zzon zzonVar, String str, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.zzb = zzonVar;
        this.zza = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.zza.flush();
            this.zza.release();
        } finally {
            conditionVariable = this.zzb.zzf;
            conditionVariable.open();
        }
    }
}
