package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzok extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzon zza;
    final /* synthetic */ zzol zzb;

    zzok(zzol zzolVar, zzon zzonVar) {
        this.zzb = zzolVar;
        this.zza = zzonVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        AudioTrack audioTrack2;
        zzno zznoVar;
        boolean z;
        zzno zznoVar2;
        audioTrack2 = this.zzb.zza.zzq;
        zzcw.zzf(audioTrack == audioTrack2);
        zzon zzonVar = this.zzb.zza;
        zznoVar = zzonVar.zzn;
        if (zznoVar != null) {
            z = zzonVar.zzO;
            if (z) {
                zznoVar2 = zzonVar.zzn;
                zznoVar2.zzb();
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        zzno zznoVar;
        boolean z;
        zzno zznoVar2;
        audioTrack2 = this.zzb.zza.zzq;
        zzcw.zzf(audioTrack == audioTrack2);
        zzon zzonVar = this.zzb.zza;
        zznoVar = zzonVar.zzn;
        if (zznoVar != null) {
            z = zzonVar.zzO;
            if (z) {
                zznoVar2 = zzonVar.zzn;
                zznoVar2.zzb();
            }
        }
    }
}
