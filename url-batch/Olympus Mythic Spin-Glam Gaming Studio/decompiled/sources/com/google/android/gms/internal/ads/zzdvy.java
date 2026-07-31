package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdvy extends zzdvj implements zzdlw {
    private zzdlw zza;

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final synchronized void zzdT() {
        zzdlw zzdlwVar = this.zza;
        if (zzdlwVar != null) {
            zzdlwVar.zzdT();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final synchronized void zzdu() {
        zzdlw zzdlwVar = this.zza;
        if (zzdlwVar != null) {
            zzdlwVar.zzdu();
        }
    }

    protected final synchronized void zzn(com.google.android.gms.ads.internal.client.zza zzaVar, zzbox zzboxVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzboz zzbozVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, zzdlw zzdlwVar) {
        super.zzm(zzaVar, zzboxVar, zzrVar, zzbozVar, zzadVar);
        this.zza = zzdlwVar;
    }
}
