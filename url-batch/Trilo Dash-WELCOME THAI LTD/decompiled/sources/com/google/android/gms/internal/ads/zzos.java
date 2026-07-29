package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzos implements zzno {
    final /* synthetic */ zzot zza;

    /* synthetic */ zzos(zzot zzotVar, zzor zzorVar) {
        this.zza = zzotVar;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zza(Exception exc) {
        zznk zznkVar;
        zzdn.zza("MediaCodecAudioRenderer", "Audio sink error", exc);
        zznkVar = this.zza.zzc;
        zznkVar.zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzb() {
        zzjt zzjtVar;
        zzjt zzjtVar2;
        zzot zzotVar = this.zza;
        zzjtVar = zzotVar.zzl;
        if (zzjtVar != null) {
            zzjtVar2 = zzotVar.zzl;
            zzjtVar2.zzb();
        }
    }
}
