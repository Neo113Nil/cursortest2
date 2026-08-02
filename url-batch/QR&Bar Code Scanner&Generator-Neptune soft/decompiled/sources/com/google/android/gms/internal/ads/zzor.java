package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzor extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzou zza;
    final /* synthetic */ zzos zzb;

    zzor(zzos zzosVar, zzou zzouVar) {
        this.zzb = zzosVar;
        this.zza = zzouVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        AudioTrack audioTrack2;
        zznv zznvVar;
        boolean z;
        zznv zznvVar2;
        audioTrack2 = this.zzb.zza.zzt;
        if (audioTrack.equals(audioTrack2)) {
            zzou zzouVar = this.zzb.zza;
            zznvVar = zzouVar.zzq;
            if (zznvVar != null) {
                z = zzouVar.zzR;
                if (z) {
                    zznvVar2 = zzouVar.zzq;
                    zznvVar2.zzb();
                }
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        zznv zznvVar;
        boolean z;
        zznv zznvVar2;
        audioTrack2 = this.zzb.zza.zzt;
        if (audioTrack.equals(audioTrack2)) {
            zzou zzouVar = this.zzb.zza;
            zznvVar = zzouVar.zzq;
            if (zznvVar != null) {
                z = zzouVar.zzR;
                if (z) {
                    zznvVar2 = zzouVar.zzq;
                    zznvVar2.zzb();
                }
            }
        }
    }
}
