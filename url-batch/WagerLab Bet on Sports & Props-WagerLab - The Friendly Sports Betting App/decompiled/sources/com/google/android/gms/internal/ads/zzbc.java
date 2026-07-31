package com.google.android.gms.internal.ads;

import androidx.media3.common.C;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbc {
    public Object zza;
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public zzb zzg = zzb.zza;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            zzbc zzbcVar = (zzbc) obj;
            if (Objects.equals(this.zza, zzbcVar.zza) && Objects.equals(this.zzb, zzbcVar.zzb) && this.zzc == zzbcVar.zzc && this.zzd == zzbcVar.zzd && this.zzf == zzbcVar.zzf && Objects.equals(this.zzg, zzbcVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final zzbc zza(Object obj, Object obj2, int i, long j, long j2, zzb zzbVar, boolean z) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i;
        this.zzd = j;
        this.zze = 0L;
        this.zzg = zzbVar;
        this.zzf = z;
        return this;
    }

    public final int zzb() {
        int i = this.zzg.zzb;
        return 0;
    }

    public final long zzc(int i) {
        long j = this.zzg.zza(i).zza;
        return 0L;
    }

    public final int zzd(int i) {
        return this.zzg.zza(i).zza(-1);
    }

    public final int zze(long j) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zzf(long j) {
        return -1;
    }

    public final int zzg(int i) {
        return this.zzg.zza(i).zzb;
    }

    public final long zzh(int i, int i2) {
        zza zza = this.zzg.zza(i);
        return zza.zzb != -1 ? zza.zzf[i2] : C.TIME_UNSET;
    }

    public final boolean zzi(int i) {
        zzb();
        if (i != -1) {
            return false;
        }
        this.zzg.zzb(-1);
        return false;
    }

    public final long zzj() {
        long j = this.zzg.zzc;
        return 0L;
    }

    public final boolean zzk(int i) {
        boolean z = this.zzg.zza(i).zzi;
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        int hashCode2 = ((((hashCode + JfifUtil.MARKER_EOI) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzc;
        long j = this.zzd;
        return (((((hashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31) + this.zzg.hashCode();
    }
}
