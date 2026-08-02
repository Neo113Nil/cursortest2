package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfjr implements zzfzc {
    final /* synthetic */ zzfju zza;
    final /* synthetic */ zzfjj zzb;
    final /* synthetic */ boolean zzc;

    zzfjr(zzfju zzfjuVar, zzfjj zzfjjVar, boolean z) {
        this.zza = zzfjuVar;
        this.zzb = zzfjjVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        zzfjj zzfjjVar = this.zzb;
        if (zzfjjVar.zzh()) {
            zzfju zzfjuVar = this.zza;
            zzfjjVar.zze(false);
            zzfjuVar.zza(zzfjjVar);
            if (this.zzc) {
                this.zza.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zzb(Object obj) {
        zzfju zzfjuVar = this.zza;
        zzfjj zzfjjVar = this.zzb;
        zzfjjVar.zze(true);
        zzfjuVar.zza(zzfjjVar);
        if (this.zzc) {
            this.zza.zzg();
        }
    }
}
