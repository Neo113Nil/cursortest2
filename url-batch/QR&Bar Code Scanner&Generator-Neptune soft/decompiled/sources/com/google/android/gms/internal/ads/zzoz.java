package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzoz implements zznv {
    final /* synthetic */ zzpa zza;

    /* synthetic */ zzoz(zzpa zzpaVar, zzoy zzoyVar) {
        this.zza = zzpaVar;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final void zza(Exception exc) {
        zznr zznrVar;
        zzdw.zzc("MediaCodecAudioRenderer", "Audio sink error", exc);
        zznrVar = this.zza.zzc;
        zznrVar.zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final void zzb() {
        zzjz zzjzVar;
        zzjz zzjzVar2;
        zzpa zzpaVar = this.zza;
        zzjzVar = zzpaVar.zzl;
        if (zzjzVar != null) {
            zzjzVar2 = zzpaVar.zzl;
            zzjzVar2.zzb();
        }
    }
}
