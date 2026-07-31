package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzaix implements zzadv {
    final /* synthetic */ zzaiy zza;

    /* synthetic */ zzaix(zzaiy zzaiyVar, byte[] bArr) {
        Objects.requireNonNull(zzaiyVar);
        this.zza = zzaiyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        zzaiy zzaiyVar = this.zza;
        return zzaiyVar.zzf().zzh(zzaiyVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        zzaiy zzaiyVar = this.zza;
        long zzd = zzaiyVar.zzd() + BigInteger.valueOf(zzaiyVar.zzf().zzi(j)).multiply(BigInteger.valueOf(zzaiyVar.zze() - zzaiyVar.zzd())).divide(BigInteger.valueOf(zzaiyVar.zzg())).longValue();
        String str = zzeo.zza;
        zzadw zzadwVar = new zzadw(j, Math.max(zzaiyVar.zzd(), Math.min(zzd - 30000, zzaiyVar.zze() - 1)));
        return new zzadt(zzadwVar, zzadwVar);
    }
}
