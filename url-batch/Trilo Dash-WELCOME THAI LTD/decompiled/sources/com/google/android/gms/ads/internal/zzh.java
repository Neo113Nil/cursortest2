package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfks;
import com.google.android.gms.internal.ads.zzflv;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzh implements zzflv {
    final /* synthetic */ zzi zza;

    zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflv
    public final void zza(int i, long j) {
        zzfks zzfksVar;
        zzfksVar = this.zza.zzi;
        zzfksVar.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzflv
    public final void zzb(int i, long j, String str) {
        zzfks zzfksVar;
        zzfksVar = this.zza.zzi;
        zzfksVar.zze(i, System.currentTimeMillis() - j, str);
    }
}
