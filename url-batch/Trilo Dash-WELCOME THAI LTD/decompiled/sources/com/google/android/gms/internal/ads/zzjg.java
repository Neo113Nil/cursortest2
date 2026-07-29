package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzjg {
    private final zzcf zza = new zzcf();
    private final zzch zzb = new zzch();
    private final zzki zzc;
    private final Handler zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjd zzh;
    private zzjd zzi;
    private zzjd zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzjg(zzki zzkiVar, Handler handler) {
        this.zzc = zzkiVar;
        this.zzd = handler;
    }

    private final boolean zzA(zzci zzciVar, zzsb zzsbVar) {
        if (zzC(zzsbVar)) {
            return zzciVar.zze(zzciVar.zzn(zzsbVar.zza, this.zza).zzd, this.zzb, 0L).zzp == zzciVar.zza(zzsbVar.zza);
        }
        return false;
    }

    private final boolean zzB(zzci zzciVar) {
        zzjd zzjdVar = this.zzh;
        if (zzjdVar == null) {
            return true;
        }
        int zza = zzciVar.zza(zzjdVar.zzb);
        while (true) {
            zza = zzciVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzjdVar.zzg() != null && !zzjdVar.zzf.zzg) {
                zzjdVar = zzjdVar.zzg();
            }
            zzjd zzg = zzjdVar.zzg();
            if (zza == -1 || zzg == null || zzciVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzjdVar = zzg;
        }
        boolean zzm = zzm(zzjdVar);
        zzjdVar.zzf = zzg(zzciVar, zzjdVar.zzf);
        return !zzm;
    }

    private static final boolean zzC(zzsb zzsbVar) {
        return !zzsbVar.zzb() && zzsbVar.zze == -1;
    }

    private final long zzs(zzci zzciVar, Object obj, int i) {
        zzciVar.zzn(obj, this.zza);
        this.zza.zzh(i);
        this.zza.zzj(i);
        return 0L;
    }

    private final zzje zzt(zzci zzciVar, zzjd zzjdVar, long j) {
        long j2;
        zzje zzjeVar = zzjdVar.zzf;
        long zze = (zzjdVar.zze() + zzjeVar.zze) - j;
        if (!zzjeVar.zzg) {
            zzsb zzsbVar = zzjeVar.zza;
            zzciVar.zzn(zzsbVar.zza, this.zza);
            if (!zzsbVar.zzb()) {
                int zze2 = this.zza.zze(zzsbVar.zze);
                this.zza.zzl(zzsbVar.zze);
                if (zze2 != this.zza.zza(zzsbVar.zze)) {
                    return zzv(zzciVar, zzsbVar.zza, zzsbVar.zze, zze2, zzjeVar.zze, zzsbVar.zzd);
                }
                zzs(zzciVar, zzsbVar.zza, zzsbVar.zze);
                return zzw(zzciVar, zzsbVar.zza, 0L, zzjeVar.zze, zzsbVar.zzd);
            }
            int i = zzsbVar.zzb;
            if (this.zza.zza(i) == -1) {
                return null;
            }
            int zzf = this.zza.zzf(i, zzsbVar.zzc);
            if (zzf < 0) {
                return zzv(zzciVar, zzsbVar.zza, i, zzf, zzjeVar.zzc, zzsbVar.zzd);
            }
            long j3 = zzjeVar.zzc;
            if (j3 == -9223372036854775807L) {
                zzch zzchVar = this.zzb;
                zzcf zzcfVar = this.zza;
                Pair zzm = zzciVar.zzm(zzchVar, zzcfVar, zzcfVar.zzd, -9223372036854775807L, Math.max(0L, zze));
                if (zzm == null) {
                    return null;
                }
                j3 = ((Long) zzm.second).longValue();
            }
            zzs(zzciVar, zzsbVar.zza, zzsbVar.zzb);
            return zzw(zzciVar, zzsbVar.zza, Math.max(0L, j3), zzjeVar.zzc, zzsbVar.zzd);
        }
        long j4 = 0;
        int zzi = zzciVar.zzi(zzciVar.zza(zzjeVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
        if (zzi == -1) {
            return null;
        }
        int i2 = zzciVar.zzd(zzi, this.zza, true).zzd;
        Object obj = this.zza.zzc;
        Objects.requireNonNull(obj);
        long j5 = zzjeVar.zza.zzd;
        if (zzciVar.zze(i2, this.zzb, 0L).zzo == zzi) {
            Pair zzm2 = zzciVar.zzm(this.zzb, this.zza, i2, -9223372036854775807L, Math.max(0L, zze));
            if (zzm2 == null) {
                return null;
            }
            obj = zzm2.first;
            long longValue = ((Long) zzm2.second).longValue();
            zzjd zzg = zzjdVar.zzg();
            if (zzg == null || !zzg.zzb.equals(obj)) {
                j5 = this.zze;
                this.zze = 1 + j5;
            } else {
                j5 = zzg.zzf.zza.zzd;
            }
            j2 = longValue;
            j4 = -9223372036854775807L;
        } else {
            j2 = 0;
        }
        zzsb zzx = zzx(zzciVar, obj, j2, j5, this.zzb, this.zza);
        if (j4 != -9223372036854775807L && zzjeVar.zzc != -9223372036854775807L) {
            zzciVar.zzn(zzjeVar.zza.zza, this.zza).zzb();
        }
        return zzu(zzciVar, zzx, j4, j2);
    }

    private final zzje zzu(zzci zzciVar, zzsb zzsbVar, long j, long j2) {
        zzciVar.zzn(zzsbVar.zza, this.zza);
        return zzsbVar.zzb() ? zzv(zzciVar, zzsbVar.zza, zzsbVar.zzb, zzsbVar.zzc, j, zzsbVar.zzd) : zzw(zzciVar, zzsbVar.zza, j2, j, zzsbVar.zzd);
    }

    private final zzje zzv(zzci zzciVar, Object obj, int i, int i2, long j, long j2) {
        zzsb zzsbVar = new zzsb(obj, i, i2, j2);
        long zzg = zzciVar.zzn(zzsbVar.zza, this.zza).zzg(zzsbVar.zzb, zzsbVar.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzi();
        }
        this.zza.zzl(zzsbVar.zzb);
        long j3 = 0;
        if (zzg != -9223372036854775807L && zzg <= 0) {
            j3 = Math.max(0L, (-1) + zzg);
        }
        return new zzje(zzsbVar, j3, j, -9223372036854775807L, zzg, false, false, false, false);
    }

    private final zzje zzw(zzci zzciVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        zzciVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j7);
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzl(zzc);
        }
        zzsb zzsbVar = new zzsb(obj, j3, zzc);
        boolean zzC = zzC(zzsbVar);
        boolean zzA = zzA(zzciVar, zzsbVar);
        boolean zzz = zzz(zzciVar, zzsbVar, zzC);
        if (zzc != -1) {
            this.zza.zzl(zzc);
        }
        if (zzc != -1) {
            this.zza.zzh(zzc);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = this.zza.zze;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0L, j5 - 1);
        }
        return new zzje(zzsbVar, j7, j2, j6, j5, false, zzC, zzA, zzz);
    }

    private static zzsb zzx(zzci zzciVar, Object obj, long j, long j2, zzch zzchVar, zzcf zzcfVar) {
        zzciVar.zzn(obj, zzcfVar);
        zzciVar.zze(zzcfVar.zzd, zzchVar, 0L);
        zzciVar.zza(obj);
        if (zzcfVar.zze == 0) {
            zzcfVar.zzb();
        }
        zzciVar.zzn(obj, zzcfVar);
        int zzd = zzcfVar.zzd(j);
        return zzd == -1 ? new zzsb(obj, j2, zzcfVar.zzc(j)) : new zzsb(obj, zzd, zzcfVar.zze(zzd), j2);
    }

    private final void zzy() {
        final zzfre zzi = zzfrh.zzi();
        for (zzjd zzjdVar = this.zzh; zzjdVar != null; zzjdVar = zzjdVar.zzg()) {
            zzi.zze(zzjdVar.zzf.zza);
        }
        zzjd zzjdVar2 = this.zzi;
        final zzsb zzsbVar = zzjdVar2 == null ? null : zzjdVar2.zzf.zza;
        this.zzd.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjf
            @Override // java.lang.Runnable
            public final void run() {
                zzjg.this.zzj(zzi, zzsbVar);
            }
        });
    }

    private final boolean zzz(zzci zzciVar, zzsb zzsbVar, boolean z) {
        int zza = zzciVar.zza(zzsbVar.zza);
        return !zzciVar.zze(zzciVar.zzd(zza, this.zza, false).zzd, this.zzb, 0L).zzi && zzciVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    public final zzjd zza() {
        zzjd zzjdVar = this.zzh;
        if (zzjdVar == null) {
            return null;
        }
        if (zzjdVar == this.zzi) {
            this.zzi = zzjdVar.zzg();
        }
        zzjdVar.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzjd zzjdVar2 = this.zzh;
            this.zzl = zzjdVar2.zzb;
            this.zzm = zzjdVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzjd zzb() {
        zzjd zzjdVar = this.zzi;
        boolean z = false;
        if (zzjdVar != null && zzjdVar.zzg() != null) {
            z = true;
        }
        zzcw.zzf(z);
        this.zzi = this.zzi.zzg();
        zzy();
        return this.zzi;
    }

    public final zzjd zzc() {
        return this.zzj;
    }

    public final zzjd zzd() {
        return this.zzh;
    }

    public final zzjd zze() {
        return this.zzi;
    }

    public final zzje zzf(long j, zzjo zzjoVar) {
        zzjd zzjdVar = this.zzj;
        return zzjdVar == null ? zzu(zzjoVar.zza, zzjoVar.zzb, zzjoVar.zzc, zzjoVar.zzs) : zzt(zzjoVar.zza, zzjdVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzje zzg(zzci zzciVar, zzje zzjeVar) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        zzsb zzsbVar = zzjeVar.zza;
        boolean zzC = zzC(zzsbVar);
        boolean zzA = zzA(zzciVar, zzsbVar);
        boolean zzz = zzz(zzciVar, zzsbVar, zzC);
        zzciVar.zzn(zzjeVar.zza.zza, this.zza);
        if (zzsbVar.zzb() || (i = zzsbVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            this.zza.zzh(i);
            j = 0;
        }
        if (zzsbVar.zzb()) {
            j2 = this.zza.zzg(zzsbVar.zzb, zzsbVar.zzc);
        } else {
            if (j != -9223372036854775807L) {
                j3 = 0;
                j4 = 0;
                if (zzsbVar.zzb()) {
                    int i2 = zzsbVar.zze;
                    if (i2 != -1) {
                        this.zza.zzl(i2);
                    }
                } else {
                    this.zza.zzl(zzsbVar.zzb);
                }
                return new zzje(zzsbVar, zzjeVar.zzb, zzjeVar.zzc, j3, j4, false, zzC, zzA, zzz);
            }
            j2 = this.zza.zze;
        }
        j3 = j;
        j4 = j2;
        if (zzsbVar.zzb()) {
        }
        return new zzje(zzsbVar, zzjeVar.zzb, zzjeVar.zzc, j3, j4, false, zzC, zzA, zzz);
    }

    public final zzsb zzh(zzci zzciVar, Object obj, long j) {
        long j2;
        int zza;
        int i = zzciVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza = zzciVar.zza(obj2)) == -1 || zzciVar.zzd(zza, this.zza, false).zzd != i) {
            zzjd zzjdVar = this.zzh;
            while (true) {
                if (zzjdVar == null) {
                    zzjd zzjdVar2 = this.zzh;
                    while (true) {
                        if (zzjdVar2 != null) {
                            int zza2 = zzciVar.zza(zzjdVar2.zzb);
                            if (zza2 != -1 && zzciVar.zzd(zza2, this.zza, false).zzd == i) {
                                j2 = zzjdVar2.zzf.zza.zzd;
                                break;
                            }
                            zzjdVar2 = zzjdVar2.zzg();
                        } else {
                            j2 = this.zze;
                            this.zze = 1 + j2;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j2;
                            }
                        }
                    }
                } else {
                    if (zzjdVar.zzb.equals(obj)) {
                        j2 = zzjdVar.zzf.zza.zzd;
                        break;
                    }
                    zzjdVar = zzjdVar.zzg();
                }
            }
        } else {
            j2 = this.zzm;
        }
        long j3 = j2;
        zzciVar.zzn(obj, this.zza);
        zzciVar.zze(this.zza.zzd, this.zzb, 0L);
        int zza3 = zzciVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzch zzchVar = this.zzb;
            if (zza3 < zzchVar.zzo) {
                return zzx(zzciVar, obj3, j, j3, zzchVar, this.zza);
            }
            zzciVar.zzd(zza3, this.zza, true);
            this.zza.zzb();
            zzcf zzcfVar = this.zza;
            if (zzcfVar.zzd(zzcfVar.zze) != -1) {
                obj3 = this.zza.zzc;
                Objects.requireNonNull(obj3);
            }
            zza3--;
        }
    }

    public final void zzi() {
        if (this.zzk == 0) {
            return;
        }
        zzjd zzjdVar = this.zzh;
        zzcw.zzb(zzjdVar);
        this.zzl = zzjdVar.zzb;
        this.zzm = zzjdVar.zzf.zza.zzd;
        while (zzjdVar != null) {
            zzjdVar.zzn();
            zzjdVar = zzjdVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    final /* synthetic */ void zzj(zzfre zzfreVar, zzsb zzsbVar) {
        this.zzc.zzT(zzfreVar.zzg(), zzsbVar);
    }

    public final void zzk(long j) {
        zzjd zzjdVar = this.zzj;
        if (zzjdVar != null) {
            zzjdVar.zzm(j);
        }
    }

    public final boolean zzl(zzrz zzrzVar) {
        zzjd zzjdVar = this.zzj;
        return zzjdVar != null && zzjdVar.zza == zzrzVar;
    }

    public final boolean zzm(zzjd zzjdVar) {
        boolean z = false;
        zzcw.zzf(zzjdVar != null);
        if (zzjdVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzjdVar;
        while (zzjdVar.zzg() != null) {
            zzjdVar = zzjdVar.zzg();
            if (zzjdVar == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzjdVar.zzn();
            this.zzk--;
        }
        this.zzj.zzo(null);
        zzy();
        return z;
    }

    public final boolean zzn() {
        zzjd zzjdVar = this.zzj;
        if (zzjdVar != null) {
            return !zzjdVar.zzf.zzi && zzjdVar.zzr() && this.zzj.zzf.zze != -9223372036854775807L && this.zzk < 100;
        }
        return true;
    }

    public final boolean zzo(zzci zzciVar, long j, long j2) {
        zzje zzjeVar;
        boolean z;
        zzjd zzjdVar = null;
        for (zzjd zzjdVar2 = this.zzh; zzjdVar2 != null; zzjdVar2 = zzjdVar2.zzg()) {
            zzje zzjeVar2 = zzjdVar2.zzf;
            if (zzjdVar == null) {
                zzjeVar = zzg(zzciVar, zzjeVar2);
            } else {
                zzje zzt = zzt(zzciVar, zzjdVar, j);
                if (zzt == null) {
                    return !zzm(zzjdVar);
                }
                if (zzjeVar2.zzb != zzt.zzb || !zzjeVar2.zza.equals(zzt.zza)) {
                    return !zzm(zzjdVar);
                }
                zzjeVar = zzt;
            }
            zzjdVar2.zzf = zzjeVar.zza(zzjeVar2.zzc);
            long j3 = zzjeVar2.zze;
            long j4 = zzjeVar.zze;
            if (j3 != -9223372036854775807L && j3 != j4) {
                zzjdVar2.zzq();
                long j5 = zzjeVar.zze;
                long zze = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + zzjdVar2.zze();
                if (zzjdVar2 == this.zzi) {
                    boolean z2 = zzjdVar2.zzf.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= zze) {
                        z = true;
                        return zzm(zzjdVar2) && !z;
                    }
                }
                z = false;
                if (zzm(zzjdVar2)) {
                }
            }
            zzjdVar = zzjdVar2;
        }
        return true;
    }

    public final boolean zzp(zzci zzciVar, int i) {
        this.zzf = i;
        return zzB(zzciVar);
    }

    public final boolean zzq(zzci zzciVar, boolean z) {
        this.zzg = z;
        return zzB(zzciVar);
    }

    public final zzjd zzr(zzjv[] zzjvVarArr, zzvn zzvnVar, zzvw zzvwVar, zzjn zzjnVar, zzje zzjeVar, zzvo zzvoVar) {
        zzjd zzjdVar = this.zzj;
        zzjd zzjdVar2 = new zzjd(zzjvVarArr, zzjdVar == null ? 1000000000000L : (zzjdVar.zze() + zzjdVar.zzf.zze) - zzjeVar.zzb, zzvnVar, zzvwVar, zzjnVar, zzjeVar, zzvoVar, null);
        zzjd zzjdVar3 = this.zzj;
        if (zzjdVar3 != null) {
            zzjdVar3.zzo(zzjdVar2);
        } else {
            this.zzh = zzjdVar2;
            this.zzi = zzjdVar2;
        }
        this.zzl = null;
        this.zzj = zzjdVar2;
        this.zzk++;
        zzy();
        return zzjdVar2;
    }
}
