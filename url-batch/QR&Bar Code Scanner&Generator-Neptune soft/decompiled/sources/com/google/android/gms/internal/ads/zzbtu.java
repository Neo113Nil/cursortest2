package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbtu implements zzchl {
    final /* synthetic */ zzbtv zza;

    zzbtu(zzbtv zzbtvVar) {
        this.zza = zzbtvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbsr zzbsrVar = (zzbsr) obj;
        zzchc.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtt
            @Override // java.lang.Runnable
            public final void run() {
                zzbsr zzbsrVar2 = zzbsrVar;
                zzbsrVar2.zzr("/result", zzbpt.zzo);
                zzbsrVar2.zzc();
            }
        });
    }
}
