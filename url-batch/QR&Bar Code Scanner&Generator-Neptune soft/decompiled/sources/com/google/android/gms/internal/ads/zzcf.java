package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcf {
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzce
    };
    public final Object zzb;
    public final int zzc;
    public final zzbg zzd;
    public final Object zze;
    public final int zzf;
    public final long zzg;
    public final long zzh;
    public final int zzi;
    public final int zzj;

    public zzcf(Object obj, int i, zzbg zzbgVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.zzb = obj;
        this.zzc = i;
        this.zzd = zzbgVar;
        this.zze = obj2;
        this.zzf = i2;
        this.zzg = j;
        this.zzh = j2;
        this.zzi = i3;
        this.zzj = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcf zzcfVar = (zzcf) obj;
            if (this.zzc == zzcfVar.zzc && this.zzf == zzcfVar.zzf && this.zzg == zzcfVar.zzg && this.zzh == zzcfVar.zzh && this.zzi == zzcfVar.zzi && this.zzj == zzcfVar.zzj && zzfss.zza(this.zzb, zzcfVar.zzb) && zzfss.zza(this.zze, zzcfVar.zze) && zzfss.zza(this.zzd, zzcfVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, Integer.valueOf(this.zzf), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Integer.valueOf(this.zzi), Integer.valueOf(this.zzj)});
    }
}
