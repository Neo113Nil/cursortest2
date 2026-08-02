package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzhe extends zzcc {
    private final int zzb;
    private final zzwa zzc;

    public zzhe(boolean z, zzwa zzwaVar) {
        this.zzc = zzwaVar;
        this.zzb = zzwaVar.zzc();
    }

    private final int zzw(int i, boolean z) {
        if (z) {
            return this.zzc.zzd(i);
        }
        if (i >= this.zzb - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z) {
        if (z) {
            return this.zzc.zze(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zza(Object obj) {
        int zza;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int zzp = zzp(obj2);
            if (zzp != -1 && (zza = zzu(zzp).zza(obj3)) != -1) {
                return zzs(zzp) + zza;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzca zzd(int i, zzca zzcaVar, boolean z) {
        int zzq = zzq(i);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i - zzs(zzq), zzcaVar, z);
        zzcaVar.zzc += zzt;
        if (z) {
            Object zzv = zzv(zzq);
            Object obj = zzcaVar.zzb;
            obj.getClass();
            zzcaVar.zzb = Pair.create(zzv, obj);
        }
        return zzcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzcb zze(int i, zzcb zzcbVar, long j) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i - zzt, zzcbVar, j);
        Object zzv = zzv(zzr);
        if (!zzcb.zza.equals(zzcbVar.zzb)) {
            zzv = Pair.create(zzv, zzcbVar.zzb);
        }
        zzcbVar.zzb = zzv;
        zzcbVar.zzn += zzs;
        zzcbVar.zzo += zzs;
        return zzcbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final Object zzf(int i) {
        int zzq = zzq(i);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i - zzs(zzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzg(boolean z) {
        if (this.zzb != 0) {
            int zza = z ? this.zzc.zza() : 0;
            while (zzu(zza).zzo()) {
                zza = zzw(zza, z);
                if (zza == -1) {
                }
            }
            return zzt(zza) + zzu(zza).zzg(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzh(boolean z) {
        int i = this.zzb;
        if (i != 0) {
            int zzb = z ? this.zzc.zzb() : i - 1;
            while (zzu(zzb).zzo()) {
                zzb = zzx(zzb, z);
                if (zzb == -1) {
                }
            }
            return zzt(zzb) + zzu(zzb).zzh(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzj(int i, int i2, boolean z) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzj = zzu(zzr).zzj(i - zzt, i2 == 2 ? 0 : i2, z);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z);
        while (zzw != -1 && zzu(zzw).zzo()) {
            zzw = zzw(zzw, z);
        }
        if (zzw != -1) {
            return zzt(zzw) + zzu(zzw).zzg(z);
        }
        if (i2 == 2) {
            return zzg(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzk(int i, int i2, boolean z) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i - zzt, 0, false);
        if (zzk != -1) {
            return zzt + zzk;
        }
        int zzx = zzx(zzr, false);
        while (zzx != -1 && zzu(zzx).zzo()) {
            zzx = zzx(zzx, false);
        }
        if (zzx != -1) {
            return zzt(zzx) + zzu(zzx).zzh(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzca zzn(Object obj, zzca zzcaVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzcaVar);
        zzcaVar.zzc += zzt;
        zzcaVar.zzb = obj;
        return zzcaVar;
    }

    protected abstract int zzp(Object obj);

    protected abstract int zzq(int i);

    protected abstract int zzr(int i);

    protected abstract int zzs(int i);

    protected abstract int zzt(int i);

    protected abstract zzcc zzu(int i);

    protected abstract Object zzv(int i);
}
