package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzjm {
    private final zzck zza = new zzck();
    private final zzcm zzb = new zzcm();
    private final zzko zzc;
    private final Handler zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjj zzh;
    private zzjj zzi;
    private zzjj zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzjm(zzko zzkoVar, Handler handler) {
        this.zzc = zzkoVar;
        this.zzd = handler;
    }

    private final boolean zzA(zzcn zzcnVar, zzsi zzsiVar) {
        if (zzC(zzsiVar)) {
            return zzcnVar.zze(zzcnVar.zzn(zzsiVar.zza, this.zza).zzd, this.zzb, 0L).zzp == zzcnVar.zza(zzsiVar.zza);
        }
        return false;
    }

    private final boolean zzB(zzcn zzcnVar) {
        zzjj zzjjVar = this.zzh;
        if (zzjjVar == null) {
            return true;
        }
        int zza = zzcnVar.zza(zzjjVar.zzb);
        while (true) {
            zza = zzcnVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzjjVar.zzg() != null && !zzjjVar.zzf.zzg) {
                zzjjVar = zzjjVar.zzg();
            }
            zzjj zzg = zzjjVar.zzg();
            if (zza == -1 || zzg == null || zzcnVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzjjVar = zzg;
        }
        boolean zzm = zzm(zzjjVar);
        zzjjVar.zzf = zzg(zzcnVar, zzjjVar.zzf);
        return !zzm;
    }

    private static final boolean zzC(zzsi zzsiVar) {
        return !zzsiVar.zzb() && zzsiVar.zze == -1;
    }

    private final long zzs(zzcn zzcnVar, Object obj, int i) {
        zzcnVar.zzn(obj, this.zza);
        this.zza.zzh(i);
        this.zza.zzj(i);
        return 0L;
    }

    private final zzjk zzt(zzcn zzcnVar, zzjj zzjjVar, long j) {
        long j2;
        zzjk zzjkVar = zzjjVar.zzf;
        long zze = (zzjjVar.zze() + zzjkVar.zze) - j;
        if (!zzjkVar.zzg) {
            zzsi zzsiVar = zzjkVar.zza;
            zzcnVar.zzn(zzsiVar.zza, this.zza);
            if (!zzsiVar.zzb()) {
                int zze2 = this.zza.zze(zzsiVar.zze);
                this.zza.zzl(zzsiVar.zze);
                if (zze2 != this.zza.zza(zzsiVar.zze)) {
                    return zzv(zzcnVar, zzsiVar.zza, zzsiVar.zze, zze2, zzjkVar.zze, zzsiVar.zzd);
                }
                zzs(zzcnVar, zzsiVar.zza, zzsiVar.zze);
                return zzw(zzcnVar, zzsiVar.zza, 0L, zzjkVar.zze, zzsiVar.zzd);
            }
            int i = zzsiVar.zzb;
            if (this.zza.zza(i) == -1) {
                return null;
            }
            int zzf = this.zza.zzf(i, zzsiVar.zzc);
            if (zzf < 0) {
                return zzv(zzcnVar, zzsiVar.zza, i, zzf, zzjkVar.zzc, zzsiVar.zzd);
            }
            long j3 = zzjkVar.zzc;
            if (j3 == -9223372036854775807L) {
                zzcm zzcmVar = this.zzb;
                zzck zzckVar = this.zza;
                Pair zzm = zzcnVar.zzm(zzcmVar, zzckVar, zzckVar.zzd, -9223372036854775807L, Math.max(0L, zze));
                if (zzm == null) {
                    return null;
                }
                j3 = ((Long) zzm.second).longValue();
            }
            zzs(zzcnVar, zzsiVar.zza, zzsiVar.zzb);
            return zzw(zzcnVar, zzsiVar.zza, Math.max(0L, j3), zzjkVar.zzc, zzsiVar.zzd);
        }
        long j4 = 0;
        int zzi = zzcnVar.zzi(zzcnVar.zza(zzjkVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
        if (zzi == -1) {
            return null;
        }
        int i2 = zzcnVar.zzd(zzi, this.zza, true).zzd;
        Object obj = this.zza.zzc;
        Objects.requireNonNull(obj);
        long j5 = zzjkVar.zza.zzd;
        if (zzcnVar.zze(i2, this.zzb, 0L).zzo == zzi) {
            Pair zzm2 = zzcnVar.zzm(this.zzb, this.zza, i2, -9223372036854775807L, Math.max(0L, zze));
            if (zzm2 == null) {
                return null;
            }
            obj = zzm2.first;
            long longValue = ((Long) zzm2.second).longValue();
            zzjj zzg = zzjjVar.zzg();
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
        zzsi zzx = zzx(zzcnVar, obj, j2, j5, this.zzb, this.zza);
        if (j4 != -9223372036854775807L && zzjkVar.zzc != -9223372036854775807L) {
            zzcnVar.zzn(zzjkVar.zza.zza, this.zza).zzb();
        }
        return zzu(zzcnVar, zzx, j4, j2);
    }

    private final zzjk zzu(zzcn zzcnVar, zzsi zzsiVar, long j, long j2) {
        zzcnVar.zzn(zzsiVar.zza, this.zza);
        return zzsiVar.zzb() ? zzv(zzcnVar, zzsiVar.zza, zzsiVar.zzb, zzsiVar.zzc, j, zzsiVar.zzd) : zzw(zzcnVar, zzsiVar.zza, j2, j, zzsiVar.zzd);
    }

    private final zzjk zzv(zzcn zzcnVar, Object obj, int i, int i2, long j, long j2) {
        zzsi zzsiVar = new zzsi(obj, i, i2, j2);
        long zzg = zzcnVar.zzn(zzsiVar.zza, this.zza).zzg(zzsiVar.zzb, zzsiVar.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzi();
        }
        this.zza.zzl(zzsiVar.zzb);
        return new zzjk(zzsiVar, (zzg == -9223372036854775807L || zzg > 0) ? 0L : Math.max(0L, (-1) + zzg), j, -9223372036854775807L, zzg, false, false, false, false);
    }

    private final zzjk zzw(zzcn zzcnVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        zzcnVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j7);
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzl(zzc);
        }
        zzsi zzsiVar = new zzsi(obj, j3, zzc);
        boolean zzC = zzC(zzsiVar);
        boolean zzA = zzA(zzcnVar, zzsiVar);
        boolean zzz = zzz(zzcnVar, zzsiVar, zzC);
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
        return new zzjk(zzsiVar, j7, j2, j6, j5, false, zzC, zzA, zzz);
    }

    private static zzsi zzx(zzcn zzcnVar, Object obj, long j, long j2, zzcm zzcmVar, zzck zzckVar) {
        zzcnVar.zzn(obj, zzckVar);
        zzcnVar.zze(zzckVar.zzd, zzcmVar, 0L);
        zzcnVar.zza(obj);
        if (zzckVar.zze == 0) {
            zzckVar.zzb();
        }
        zzcnVar.zzn(obj, zzckVar);
        int zzd = zzckVar.zzd(j);
        return zzd == -1 ? new zzsi(obj, j2, zzckVar.zzc(j)) : new zzsi(obj, zzd, zzckVar.zze(zzd), j2);
    }

    private final void zzy() {
        final zzfvk zzi = zzfvn.zzi();
        for (zzjj zzjjVar = this.zzh; zzjjVar != null; zzjjVar = zzjjVar.zzg()) {
            zzi.zze(zzjjVar.zzf.zza);
        }
        zzjj zzjjVar2 = this.zzi;
        final zzsi zzsiVar = zzjjVar2 == null ? null : zzjjVar2.zzf.zza;
        this.zzd.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjl
            @Override // java.lang.Runnable
            public final void run() {
                zzjm.this.zzj(zzi, zzsiVar);
            }
        });
    }

    private final boolean zzz(zzcn zzcnVar, zzsi zzsiVar, boolean z) {
        int zza = zzcnVar.zza(zzsiVar.zza);
        return !zzcnVar.zze(zzcnVar.zzd(zza, this.zza, false).zzd, this.zzb, 0L).zzi && zzcnVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    public final zzjj zza() {
        zzjj zzjjVar = this.zzh;
        if (zzjjVar == null) {
            return null;
        }
        if (zzjjVar == this.zzi) {
            this.zzi = zzjjVar.zzg();
        }
        zzjjVar.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzjj zzjjVar2 = this.zzh;
            this.zzl = zzjjVar2.zzb;
            this.zzm = zzjjVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzjj zzb() {
        zzjj zzjjVar = this.zzi;
        boolean z = false;
        if (zzjjVar != null && zzjjVar.zzg() != null) {
            z = true;
        }
        zzdd.zzf(z);
        this.zzi = this.zzi.zzg();
        zzy();
        return this.zzi;
    }

    public final zzjj zzc() {
        return this.zzj;
    }

    public final zzjj zzd() {
        return this.zzh;
    }

    public final zzjj zze() {
        return this.zzi;
    }

    public final zzjk zzf(long j, zzju zzjuVar) {
        zzjj zzjjVar = this.zzj;
        return zzjjVar == null ? zzu(zzjuVar.zza, zzjuVar.zzb, zzjuVar.zzc, zzjuVar.zzr) : zzt(zzjuVar.zza, zzjjVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzjk zzg(zzcn zzcnVar, zzjk zzjkVar) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        zzsi zzsiVar = zzjkVar.zza;
        boolean zzC = zzC(zzsiVar);
        boolean zzA = zzA(zzcnVar, zzsiVar);
        boolean zzz = zzz(zzcnVar, zzsiVar, zzC);
        zzcnVar.zzn(zzjkVar.zza.zza, this.zza);
        if (zzsiVar.zzb() || (i = zzsiVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            this.zza.zzh(i);
            j = 0;
        }
        if (zzsiVar.zzb()) {
            j2 = this.zza.zzg(zzsiVar.zzb, zzsiVar.zzc);
        } else {
            if (j != -9223372036854775807L) {
                j3 = 0;
                j4 = 0;
                if (zzsiVar.zzb()) {
                    int i2 = zzsiVar.zze;
                    if (i2 != -1) {
                        this.zza.zzl(i2);
                    }
                } else {
                    this.zza.zzl(zzsiVar.zzb);
                }
                return new zzjk(zzsiVar, zzjkVar.zzb, zzjkVar.zzc, j3, j4, false, zzC, zzA, zzz);
            }
            j2 = this.zza.zze;
        }
        j3 = j;
        j4 = j2;
        if (zzsiVar.zzb()) {
        }
        return new zzjk(zzsiVar, zzjkVar.zzb, zzjkVar.zzc, j3, j4, false, zzC, zzA, zzz);
    }

    public final zzsi zzh(zzcn zzcnVar, Object obj, long j) {
        long j2;
        int zza;
        int i = zzcnVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza = zzcnVar.zza(obj2)) == -1 || zzcnVar.zzd(zza, this.zza, false).zzd != i) {
            zzjj zzjjVar = this.zzh;
            while (true) {
                if (zzjjVar == null) {
                    zzjj zzjjVar2 = this.zzh;
                    while (true) {
                        if (zzjjVar2 != null) {
                            int zza2 = zzcnVar.zza(zzjjVar2.zzb);
                            if (zza2 != -1 && zzcnVar.zzd(zza2, this.zza, false).zzd == i) {
                                j2 = zzjjVar2.zzf.zza.zzd;
                                break;
                            }
                            zzjjVar2 = zzjjVar2.zzg();
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
                    if (zzjjVar.zzb.equals(obj)) {
                        j2 = zzjjVar.zzf.zza.zzd;
                        break;
                    }
                    zzjjVar = zzjjVar.zzg();
                }
            }
        } else {
            j2 = this.zzm;
        }
        long j3 = j2;
        zzcnVar.zzn(obj, this.zza);
        zzcnVar.zze(this.zza.zzd, this.zzb, 0L);
        int zza3 = zzcnVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcm zzcmVar = this.zzb;
            if (zza3 < zzcmVar.zzo) {
                return zzx(zzcnVar, obj3, j, j3, zzcmVar, this.zza);
            }
            zzcnVar.zzd(zza3, this.zza, true);
            this.zza.zzb();
            zzck zzckVar = this.zza;
            if (zzckVar.zzd(zzckVar.zze) != -1) {
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
        zzjj zzjjVar = this.zzh;
        zzdd.zzb(zzjjVar);
        this.zzl = zzjjVar.zzb;
        this.zzm = zzjjVar.zzf.zza.zzd;
        while (zzjjVar != null) {
            zzjjVar.zzn();
            zzjjVar = zzjjVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    final /* synthetic */ void zzj(zzfvk zzfvkVar, zzsi zzsiVar) {
        this.zzc.zzT(zzfvkVar.zzg(), zzsiVar);
    }

    public final void zzk(long j) {
        zzjj zzjjVar = this.zzj;
        if (zzjjVar != null) {
            zzjjVar.zzm(j);
        }
    }

    public final boolean zzl(zzsg zzsgVar) {
        zzjj zzjjVar = this.zzj;
        return zzjjVar != null && zzjjVar.zza == zzsgVar;
    }

    public final boolean zzm(zzjj zzjjVar) {
        boolean z = false;
        zzdd.zzf(zzjjVar != null);
        if (zzjjVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzjjVar;
        while (zzjjVar.zzg() != null) {
            zzjjVar = zzjjVar.zzg();
            if (zzjjVar == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzjjVar.zzn();
            this.zzk--;
        }
        this.zzj.zzo(null);
        zzy();
        return z;
    }

    public final boolean zzn() {
        zzjj zzjjVar = this.zzj;
        if (zzjjVar == null) {
            return true;
        }
        if (zzjjVar.zzf.zzi || !zzjjVar.zzr() || this.zzj.zzf.zze == -9223372036854775807L) {
            return false;
        }
        return this.zzk < 100;
    }

    public final boolean zzo(zzcn zzcnVar, long j, long j2) {
        zzjk zzjkVar;
        boolean z;
        zzjj zzjjVar = null;
        for (zzjj zzjjVar2 = this.zzh; zzjjVar2 != null; zzjjVar2 = zzjjVar2.zzg()) {
            zzjk zzjkVar2 = zzjjVar2.zzf;
            if (zzjjVar == null) {
                zzjkVar = zzg(zzcnVar, zzjkVar2);
            } else {
                zzjk zzt = zzt(zzcnVar, zzjjVar, j);
                if (zzt == null) {
                    return !zzm(zzjjVar);
                }
                if (zzjkVar2.zzb != zzt.zzb || !zzjkVar2.zza.equals(zzt.zza)) {
                    return !zzm(zzjjVar);
                }
                zzjkVar = zzt;
            }
            zzjjVar2.zzf = zzjkVar.zza(zzjkVar2.zzc);
            long j3 = zzjkVar2.zze;
            long j4 = zzjkVar.zze;
            if (j3 != -9223372036854775807L && j3 != j4) {
                zzjjVar2.zzq();
                long j5 = zzjkVar.zze;
                long zze = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + zzjjVar2.zze();
                if (zzjjVar2 == this.zzi) {
                    boolean z2 = zzjjVar2.zzf.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= zze) {
                        z = true;
                        return zzm(zzjjVar2) && !z;
                    }
                }
                z = false;
                if (zzm(zzjjVar2)) {
                }
            }
            zzjjVar = zzjjVar2;
        }
        return true;
    }

    public final boolean zzp(zzcn zzcnVar, int i) {
        this.zzf = i;
        return zzB(zzcnVar);
    }

    public final boolean zzq(zzcn zzcnVar, boolean z) {
        this.zzg = z;
        return zzB(zzcnVar);
    }

    public final zzjj zzr(zzkb[] zzkbVarArr, zzvz zzvzVar, zzwi zzwiVar, zzjt zzjtVar, zzjk zzjkVar, zzwa zzwaVar) {
        zzjj zzjjVar = this.zzj;
        zzjj zzjjVar2 = new zzjj(zzkbVarArr, zzjjVar == null ? 1000000000000L : (zzjjVar.zze() + zzjjVar.zzf.zze) - zzjkVar.zzb, zzvzVar, zzwiVar, zzjtVar, zzjkVar, zzwaVar, null);
        zzjj zzjjVar3 = this.zzj;
        if (zzjjVar3 != null) {
            zzjjVar3.zzo(zzjjVar2);
        } else {
            this.zzh = zzjjVar2;
            this.zzi = zzjjVar2;
        }
        this.zzl = null;
        this.zzj = zzjjVar2;
        this.zzk++;
        zzy();
        return zzjjVar2;
    }
}
