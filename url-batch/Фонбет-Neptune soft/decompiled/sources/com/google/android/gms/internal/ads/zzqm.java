package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzqm extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzqn zza;

    zzqm(zzqn zzqnVar, zzqp zzqpVar) {
        this.zza = zzqnVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        AudioTrack audioTrack2;
        audioTrack2 = this.zza.zza.zzt;
        audioTrack.equals(audioTrack2);
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        audioTrack2 = this.zza.zza.zzt;
        if (audioTrack.equals(audioTrack2)) {
            this.zza.zza.zzQ = true;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        audioTrack2 = this.zza.zza.zzt;
        audioTrack.equals(audioTrack2);
    }
}
