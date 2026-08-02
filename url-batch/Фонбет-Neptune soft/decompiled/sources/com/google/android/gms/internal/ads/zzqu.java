package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzqu implements zzpi {
    final /* synthetic */ zzqv zza;

    /* synthetic */ zzqu(zzqv zzqvVar, zzqt zzqtVar) {
        this.zza = zzqvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpi
    public final void zza(Exception exc) {
        zzpd zzpdVar;
        zzea.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzpdVar = this.zza.zzc;
        zzpdVar.zzb(exc);
    }
}
