package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzju {
    private static final zzsi zzs = new zzsi(new Object());
    public final zzcn zza;
    public final zzsi zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzha zzf;
    public final boolean zzg;
    public final zzuh zzh;
    public final zzwa zzi;
    public final List zzj;
    public final zzsi zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzby zzn;
    public final boolean zzo;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;

    public zzju(zzcn zzcnVar, zzsi zzsiVar, long j, long j2, int i, zzha zzhaVar, boolean z, zzuh zzuhVar, zzwa zzwaVar, List list, zzsi zzsiVar2, boolean z2, int i2, zzby zzbyVar, long j3, long j4, long j5, boolean z3) {
        this.zza = zzcnVar;
        this.zzb = zzsiVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzhaVar;
        this.zzg = z;
        this.zzh = zzuhVar;
        this.zzi = zzwaVar;
        this.zzj = list;
        this.zzk = zzsiVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = zzbyVar;
        this.zzp = j3;
        this.zzq = j4;
        this.zzr = j5;
        this.zzo = z3;
    }

    public static zzju zzg(zzwa zzwaVar) {
        zzcn zzcnVar = zzcn.zza;
        zzsi zzsiVar = zzs;
        return new zzju(zzcnVar, zzsiVar, -9223372036854775807L, 0L, 1, null, false, zzuh.zza, zzwaVar, zzfvn.zzo(), zzsiVar, false, 0, zzby.zza, 0L, 0L, 0L, false);
    }

    public static zzsi zzh() {
        return zzs;
    }

    public final zzju zza(zzsi zzsiVar) {
        return new zzju(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzsiVar, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzju zzb(zzsi zzsiVar, long j, long j2, long j3, long j4, zzuh zzuhVar, zzwa zzwaVar, List list) {
        return new zzju(this.zza, zzsiVar, j2, j3, this.zze, this.zzf, this.zzg, zzuhVar, zzwaVar, list, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, j4, j, this.zzo);
    }

    public final zzju zzc(boolean z, int i) {
        return new zzju(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzju zzd(zzha zzhaVar) {
        return new zzju(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzhaVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzju zze(int i) {
        return new zzju(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzju zzf(zzcn zzcnVar) {
        return new zzju(zzcnVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }
}
