package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaou implements zzfoa {
    final /* synthetic */ zzfmx zza;

    zzaou(zzfmx zzfmxVar) {
        this.zza = zzfmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    public final void zza(int i, long j) {
        this.zza.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    public final void zzb(int i, long j, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j, str);
    }
}
