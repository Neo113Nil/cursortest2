package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzczq implements zzfzc {
    final /* synthetic */ zzfzc zza;
    final /* synthetic */ zzczs zzb;

    zzczq(zzczs zzczsVar, zzfzc zzfzcVar) {
        this.zzb = zzczsVar;
        this.zza = zzfzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzchc.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzczp
            @Override // java.lang.Runnable
            public final void run() {
                zzczs.this.zzd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzczs.zzb(this.zzb, ((zzczl) obj).zza, this.zza);
    }
}
