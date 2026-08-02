package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzafc implements zzafa {
    private final int zza;
    private final int zzb;
    private final zzef zzc;

    public zzafc(zzaew zzaewVar, zzaf zzafVar) {
        zzef zzefVar = zzaewVar.zza;
        this.zzc = zzefVar;
        zzefVar.zzF(12);
        int zzn = zzefVar.zzn();
        if ("audio/raw".equals(zzafVar.zzm)) {
            int zzo = zzen.zzo(zzafVar.zzB, zzafVar.zzz);
            if (zzn == 0 || zzn % zzo != 0) {
                zzdw.zze("AtomParsers", "Audio sample size mismatch. stsd sample size: " + zzo + ", stsz sample size: " + zzn);
                zzn = zzo;
            }
        }
        this.zza = zzn == 0 ? -1 : zzn;
        this.zzb = zzefVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzn() : i;
    }
}
