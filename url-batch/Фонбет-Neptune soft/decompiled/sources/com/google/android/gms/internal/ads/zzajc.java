package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzajc implements zzadi {
    final /* synthetic */ zzajd zza;

    /* synthetic */ zzajc(zzajd zzajdVar, zzajb zzajbVar) {
        this.zza = zzajdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        zzajo zzajoVar;
        long j;
        zzajd zzajdVar = this.zza;
        zzajoVar = zzajdVar.zzd;
        j = zzajdVar.zzf;
        return zzajoVar.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j) {
        zzajo zzajoVar;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zzajd zzajdVar = this.zza;
        zzajoVar = zzajdVar.zzd;
        long zzg = zzajoVar.zzg(j);
        j2 = zzajdVar.zzb;
        BigInteger valueOf = BigInteger.valueOf(zzg);
        zzajd zzajdVar2 = this.zza;
        j3 = zzajdVar2.zzc;
        j4 = zzajdVar2.zzb;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j3 - j4));
        j5 = this.zza.zzf;
        long longValue = j2 + multiply.divide(BigInteger.valueOf(j5)).longValue();
        zzajd zzajdVar3 = this.zza;
        j6 = zzajdVar3.zzb;
        j7 = zzajdVar3.zzc;
        zzadj zzadjVar = new zzadj(j, Math.max(j6, Math.min(longValue - 30000, j7 - 1)));
        return new zzadg(zzadjVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}
