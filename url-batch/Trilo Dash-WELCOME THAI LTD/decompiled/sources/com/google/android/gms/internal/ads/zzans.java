package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzans implements zzflv {
    final /* synthetic */ zzfks zza;

    zzans(zzfks zzfksVar) {
        this.zza = zzfksVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflv
    public final void zza(int i, long j) {
        this.zza.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzflv
    public final void zzb(int i, long j, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j, str);
    }
}
