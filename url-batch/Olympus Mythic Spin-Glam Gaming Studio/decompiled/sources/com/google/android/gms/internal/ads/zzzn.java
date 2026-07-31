package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzzn implements zzzg {
    private final zzzg zza;
    private final long zzb;

    public zzzn(zzzg zzzgVar, long j) {
        this.zza = zzzgVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final boolean zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzb() throws IOException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final int zzc(zzma zzmaVar, zziy zziyVar, int i) {
        int zzc = this.zza.zzc(zzmaVar, zziyVar, i);
        if (zzc != -4) {
            return zzc;
        }
        zziyVar.zzd += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final int zzd(long j) {
        return this.zza.zzd(j - this.zzb);
    }

    public final zzzg zze() {
        return this.zza;
    }
}
