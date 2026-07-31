package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdoa extends zzdnl implements zzddz {
    private zzddz zza;

    @Override // com.google.android.gms.internal.ads.zzddz
    public final synchronized void zzdV() {
        zzddz zzddzVar = this.zza;
        if (zzddzVar != null) {
            zzddzVar.zzdV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final synchronized void zzdz() {
        zzddz zzddzVar = this.zza;
        if (zzddzVar != null) {
            zzddzVar.zzdz();
        }
    }

    protected final synchronized void zzn(com.google.android.gms.ads.internal.client.zza zzaVar, zzbib zzbibVar, com.google.android.gms.ads.internal.overlay.zzq zzqVar, zzbid zzbidVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, zzddz zzddzVar) {
        try {
            try {
                super.zzm(zzaVar, zzbibVar, zzqVar, zzbidVar, zzacVar);
                this.zza = zzddzVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
