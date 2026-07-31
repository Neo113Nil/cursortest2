package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzbas implements zzfzg {
    final /* synthetic */ zzfyi zza;

    zzbas(zzfyi zzfyiVar) {
        this.zza = zzfyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final void zza(int i, long j) {
        this.zza.zzb(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final void zzb(int i, long j, String str) {
        this.zza.zzf(i, System.currentTimeMillis() - j, str);
    }
}
