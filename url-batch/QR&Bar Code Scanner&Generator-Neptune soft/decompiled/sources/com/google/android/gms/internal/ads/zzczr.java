package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzczr implements zzfzc {
    final /* synthetic */ zzfzc zza;
    final /* synthetic */ zzczs zzb;

    zzczr(zzczs zzczsVar, zzfzc zzfzcVar) {
        this.zzb = zzczsVar;
        this.zza = zzfzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        zzchc.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzczp
            @Override // java.lang.Runnable
            public final void run() {
                zzczs.this.zzd();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzchc.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzczp
            @Override // java.lang.Runnable
            public final void run() {
                zzczs.this.zzd();
            }
        });
        this.zza.zzb((zzcze) obj);
    }
}
