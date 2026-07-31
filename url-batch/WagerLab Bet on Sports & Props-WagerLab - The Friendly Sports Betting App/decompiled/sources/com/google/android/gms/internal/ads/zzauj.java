package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzauj implements zzfpf {
    final /* synthetic */ zzfoh zza;

    zzauj(zzfoh zzfohVar) {
        this.zza = zzfohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zza(int i, long j) {
        this.zza.zzb(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zzb(int i, long j, String str) {
        this.zza.zzf(i, System.currentTimeMillis() - j, str);
    }
}
