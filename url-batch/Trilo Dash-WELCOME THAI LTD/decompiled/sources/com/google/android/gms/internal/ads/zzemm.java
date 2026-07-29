package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzemm implements zzemr {
    final /* synthetic */ zzemn zza;

    zzemm(zzemn zzemnVar) {
        this.zza = zzemnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemr
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzc = ((zzcxw) obj).zzl();
            ((zzcxw) obj).zzW();
        }
    }
}
