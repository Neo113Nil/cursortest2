package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfkc implements zzgcf {
    final /* synthetic */ zzfkf zza;
    final /* synthetic */ zzfju zzb;
    final /* synthetic */ boolean zzc;

    zzfkc(zzfkf zzfkfVar, zzfju zzfjuVar, boolean z) {
        this.zza = zzfkfVar;
        this.zzb = zzfjuVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th) {
        zzfju zzfjuVar = this.zzb;
        if (zzfjuVar.zzk()) {
            zzfkf zzfkfVar = this.zza;
            zzfjuVar.zzh(th);
            zzfjuVar.zzg(false);
            zzfkfVar.zza(zzfjuVar);
            if (this.zzc) {
                this.zza.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
        zzfju zzfjuVar = this.zzb;
        zzfjuVar.zzg(true);
        this.zza.zza(zzfjuVar);
        if (this.zzc) {
            this.zza.zzh();
        }
    }
}
