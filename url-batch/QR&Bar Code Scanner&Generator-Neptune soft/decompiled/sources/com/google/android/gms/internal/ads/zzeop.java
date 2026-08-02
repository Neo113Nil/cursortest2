package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzeop implements zzeou {
    final /* synthetic */ zzeoq zza;

    zzeop(zzeoq zzeoqVar) {
        this.zza = zzeoqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeou
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeou
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzc = ((zzcze) obj).zzl();
            ((zzcze) obj).zzW();
        }
    }
}
