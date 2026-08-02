package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzkp {
    public final long zza;
    public final zzcn zzb;
    public final int zzc;
    public final zzsi zzd;
    public final long zze;
    public final zzcn zzf;
    public final int zzg;
    public final zzsi zzh;
    public final long zzi;
    public final long zzj;

    public zzkp(long j, zzcn zzcnVar, int i, zzsi zzsiVar, long j2, zzcn zzcnVar2, int i2, zzsi zzsiVar2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzcnVar;
        this.zzc = i;
        this.zzd = zzsiVar;
        this.zze = j2;
        this.zzf = zzcnVar2;
        this.zzg = i2;
        this.zzh = zzsiVar2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzkp zzkpVar = (zzkp) obj;
            if (this.zza == zzkpVar.zza && this.zzc == zzkpVar.zzc && this.zze == zzkpVar.zze && this.zzg == zzkpVar.zzg && this.zzi == zzkpVar.zzi && this.zzj == zzkpVar.zzj && zzfss.zza(this.zzb, zzkpVar.zzb) && zzfss.zza(this.zzd, zzkpVar.zzd) && zzfss.zza(this.zzf, zzkpVar.zzf) && zzfss.zza(this.zzh, zzkpVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
